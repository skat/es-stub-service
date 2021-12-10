package dk.skat.es.database;

/**
 * This type was created in Eclipse.
 * JavaDoc added	20210908 TE	
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dk.skat.es.util.Constants;


public class DB {
	
    private static int iUpdatePrint = 0;
    private static int iQueryPrint = 0;
    public static final String VERSION = "VERSION 1.09.01.002"; //JG20030324

    /**
     * This method returns an active connection or NULL from the pool
     *
     * @return ds Connection containing data source
     * @exception javax.naming.NamingException 
     * @exception java.sql.SQLException
     */
    public static Connection connectToReadOnlyPool() throws NamingException, SQLException {
        Connection sqlConnection = connectToPool_common(Connection.TRANSACTION_READ_UNCOMMITTED,true);
        return sqlConnection;
    }

    /**
     * This method returns an active connection or NULL from the pool
     *
     * @return ds Connection containing data source
     * @exception javax.naming.NamingException 
     * @exception java.sql.SQLException
     */
    public static Connection connectToPool() throws NamingException, SQLException {
        //Connection sqlConnection = connectToPool_common(Connection.TRANSACTION_READ_COMMITTED, false);
        Connection sqlConnection = connectToPool_common(Connection.TRANSACTION_READ_UNCOMMITTED, true);
        return sqlConnection;
    }

    private static Connection connectToPool_common(int transactionIsolation, boolean readOnly) throws NamingException, SQLException {
        Connection sqlConnection = null;
        int count = 0;
        while (sqlConnection == null && count < 100) {
            count++;
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup(Constants.IMP_PERSISTENCE_UNIT);
            sqlConnection = dataSource.getConnection();
        }
        sqlConnection.clearWarnings();
        //sqlConnection.setTransactionIsolation(transactionIsolation);
        sqlConnection.setReadOnly(readOnly);//Added JG 20021213
        return sqlConnection;
    }

    /**
     * This method updates the execution to the pool	
     *
     * @param aConn Connection
     * @param sql String
     * @return x int
     * @exception java.sql.SQLException
     */
    public static int executeUpdateToPool(Connection aConn, String sql) throws SQLException {
        // 1 = print  -1 = dont print   0 = not set
        if (iUpdatePrint == 0) // MR 20020729
        {
            try {
                iUpdatePrint = Integer.parseInt(System.getProperty("UpdatePrint"));
            } catch (NumberFormatException e) {
                iQueryPrint = -1;
            } catch (RuntimeException e) {
                //log.error( "RuntimeException in DB.executeUpdateToPool()", e);
                iQueryPrint = -1;
            }
        }
       
        int x;
        Statement stmt = null;
        stmt = aConn.createStatement();
        x = stmt.executeUpdate(sql);
        stmt.close();
        stmt = null;
        //if (log.isInfoEnabled()) log.info("executeUpdateToPool-End");
        return x;
    }
    
    public static void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Throwable e) {
                //log.error(e.getMessage(), e);
            }
        }
    }
    
    public static void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (Throwable e) {
                //log.error(e.getMessage(), e);
            }
        }
    }
}

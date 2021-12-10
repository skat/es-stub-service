package dk.skat.es.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dk.skat.es.database.DB;
import dk.skat.es.dto.EORIVirkWhitelist;

public class EORIServiceDAO {
	
	private static final Log log = LogFactory.getLog(EORIServiceDAO.class);
	
	public EORIVirkWhitelist getEORINumber(String eoriNr) {
		
        Connection sqlConnection = null;
        Statement sqlStatement = null;
        ResultSet sqlResultSet = null;
        StringBuilder strSql= new StringBuilder();
        EORIVirkWhitelist virkWhitelist = new EORIVirkWhitelist();
        
        strSql.append("SELECT vw.SE_nr , vn.Firma_nvn , vn.Firma_nvn_kort,va.Post_nr,va.By_nvn,va.Virk_adr_txt, "
        		+ "tlfnr.Tlf_nr , tlfnr.Virk_adr_tlf_nr_start_dto , virk.CVR_nr , virk.Virk_start_dto , tlfnr.Virk_adr_tlf_nr_slut_dto,"
        		+ " bev.Bev_forh_start_dto ,bev.Pligt_kod ,bev.Bev_journal_nr,bev.Bev_kod,va.Virk_adr_lb_nr , va.Start_hus_nr \r\n"
        		+ " FROM TTransAngivelse.dbo.Virk_whitelist vw \r\n" + 
        		"JOIN TTransAngivelse.dbo.Virk_nvn vn \r\n" + 
        		"ON vw.SE_nr = vn.SE_nr JOIN TTransAngivelse.dbo.Virk_adr va ON vw.SE_nr = va.SE_nr "
        		+ "JOIN TTransAngivelse.dbo.Virk_adr_tlf_nr tlfnr ON va.SE_nr = tlfnr.SE_nr JOIN TTransAngivelse.dbo.Virk virk ON va.SE_nr = virk.SE_nr \r\n"
        		+ "JOIN TTransAngivelse.dbo.Virk_Bev_forh bev ON virk.SE_nr = bev.SE_nr "
        		+ "where vw.SE_nr=").append("'").append(eoriNr).append("'");
        log.info("********** SQL Query - EORI ********---> "+strSql.toString());
        try {
            try {
				sqlConnection = DB.connectToReadOnlyPool();
				sqlStatement = sqlConnection.createStatement();
	            sqlResultSet = sqlStatement.executeQuery(strSql.toString());
	            
	            
	            
	            
	            while(sqlResultSet.next()) {
	            	virkWhitelist.setEoriNumber(sqlResultSet.getString(1));
	            	virkWhitelist.setFirma_nvn(sqlResultSet.getString(2));
	            	virkWhitelist.setFirma_nvn_kort(sqlResultSet.getString(3));
	            	virkWhitelist.setPostNumber(sqlResultSet.getString(4));
	            	virkWhitelist.setBy_nvn(sqlResultSet.getString(5));
	            	virkWhitelist.setAdresseNavn(sqlResultSet.getString(6));
	            	virkWhitelist.setTlf_nr(sqlResultSet.getString(7));
	            	virkWhitelist.setVirk_adr_tlf_nr_start_dto(sqlResultSet.getTimestamp(8));
	            	virkWhitelist.setCvrNumber(sqlResultSet.getString(9));
	            	virkWhitelist.setVirk_start_dto(sqlResultSet.getTimestamp(10));
	            	virkWhitelist.setVirk_adr_tlf_nr_slut_dto(sqlResultSet.getTimestamp(11));
	            	
	            	virkWhitelist.setBev_forh_start_dto(sqlResultSet.getTimestamp(12));
	            	virkWhitelist.setPligt_kod(sqlResultSet.getString(13));
	            	virkWhitelist.setBev_journal_nr(sqlResultSet.getString(14));
	            	virkWhitelist.setBev_kod(sqlResultSet.getString(15));
	            	
	            	//virkWhitelist.setVirk_adr_lb_nr(sqlResultSet.getInt(16));
	            	virkWhitelist.setVirk_adr_lb_nr(sqlResultSet.getString(16));
	            	virkWhitelist.setStart_hus_nr(sqlResultSet.getString(17));
	            }
	            
			} catch (NamingException e) {
				log.error("NamingException"+e.getMessage());
			} catch (SQLException e) {
				log.error("SQLException"+e.getMessage());
			}
            
        } finally {
            DB.close(sqlResultSet);
            DB.close(sqlStatement);
            EORIServiceDAO.disconnectFromPool(sqlConnection); 
        }
        
        return virkWhitelist;
    }
	
	
	public EORIVirkWhitelist getEORINumberBasedOnPlightKod(String eoriNr,String plightKod) {
		
        Connection sqlConnection = null;
        Statement sqlStatement = null;
        ResultSet sqlResultSet = null;
        StringBuilder strSql= new StringBuilder();
        EORIVirkWhitelist virkWhitelist = new EORIVirkWhitelist();
        
        strSql.append("SELECT vw.SE_nr , vn.Firma_nvn , vn.Firma_nvn_kort,va.Post_nr,va.By_nvn,va.Virk_adr_txt, "
        		+ "tlfnr.Tlf_nr , tlfnr.Virk_adr_tlf_nr_start_dto , virk.CVR_nr , virk.Virk_start_dto , tlfnr.Virk_adr_tlf_nr_slut_dto,"
        		+ " bev.Bev_forh_start_dto ,bev.Pligt_kod ,bev.Bev_journal_nr,bev.Bev_kod,va.Virk_adr_lb_nr , va.Start_hus_nr , va.Vej_nvn \r\n"
        		+ " FROM TTransAngivelse.dbo.Virk_whitelist vw \r\n" + 
        		"JOIN TTransAngivelse.dbo.Virk_nvn vn \r\n" + 
        		"ON vw.SE_nr = vn.SE_nr JOIN TTransAngivelse.dbo.Virk_adr va ON vw.SE_nr = va.SE_nr "
        		+ "JOIN TTransAngivelse.dbo.Virk_adr_tlf_nr tlfnr ON va.SE_nr = tlfnr.SE_nr JOIN TTransAngivelse.dbo.Virk virk ON va.SE_nr = virk.SE_nr \r\n"
        		+ "JOIN TTransAngivelse.dbo.Virk_Bev_forh bev ON virk.SE_nr = bev.SE_nr "
        		+ "where vw.SE_nr=").append("'").append(eoriNr).append("'").append(" AND  bev.Pligt_kod=").append("'").append(plightKod.startsWith("0") ? plightKod: "0"+plightKod).append("'");
        log.info("********** SQL Query - getEORINumberBasedOnPlightKod ********---> "+strSql.toString());
        try {
            try {
				sqlConnection = DB.connectToReadOnlyPool();
				sqlStatement = sqlConnection.createStatement();
	            sqlResultSet = sqlStatement.executeQuery(strSql.toString());
	            
	            
	            
	            
	            while(sqlResultSet.next()) {
	            	virkWhitelist.setEoriNumber(sqlResultSet.getString(1));
	            	virkWhitelist.setFirma_nvn(sqlResultSet.getString(2));
	            	virkWhitelist.setFirma_nvn_kort(sqlResultSet.getString(3));
	            	virkWhitelist.setPostNumber(sqlResultSet.getString(4));
	            	virkWhitelist.setBy_nvn(sqlResultSet.getString(5));
	            	virkWhitelist.setAdresseNavn(sqlResultSet.getString(6));
	            	virkWhitelist.setTlf_nr(sqlResultSet.getString(7));
	            	virkWhitelist.setVirk_adr_tlf_nr_start_dto(sqlResultSet.getTimestamp(8));
	            	virkWhitelist.setCvrNumber(sqlResultSet.getString(9));
	            	virkWhitelist.setVirk_start_dto(sqlResultSet.getTimestamp(10));
	            	virkWhitelist.setVirk_adr_tlf_nr_slut_dto(sqlResultSet.getTimestamp(11));
	            	
	            	virkWhitelist.setBev_forh_start_dto(sqlResultSet.getTimestamp(12));
	            	virkWhitelist.setPligt_kod(sqlResultSet.getString(13));
	            	virkWhitelist.setBev_journal_nr(sqlResultSet.getString(14));
	            	virkWhitelist.setBev_kod(sqlResultSet.getString(15));
	            	
	            	//virkWhitelist.setVirk_adr_lb_nr(sqlResultSet.getInt(16));
	            	virkWhitelist.setVirk_adr_lb_nr(sqlResultSet.getString(16));
	            	virkWhitelist.setStart_hus_nr(sqlResultSet.getString(17));
	            }
	            
			} catch (NamingException e) {
				log.error("NamingException"+e.getMessage());
			} catch (SQLException e) {
				log.error("SQLException"+e.getMessage());
			}
            
        } finally {
            DB.close(sqlResultSet);
            DB.close(sqlStatement);
            EORIServiceDAO.disconnectFromPool(sqlConnection); 
        }
        
        return virkWhitelist;
    }
	
	
	/**
     * This method disconnects from pool
     *
     * @param aConnection Connection
     * @exception java.sql.SQLException
     */
    public static void disconnectFromPool(Connection aConnection) {
        if (aConnection != null) {
            try {
                aConnection.close();
            } catch (
                    SQLException e) {
                log.error( "Cannot Connection.isClosed() or cannot Connection.close()", e); // MS 20010713
            } catch (RuntimeException e) {
                log.error( "RuntimeException in DB.disconnectFromPool()", e);
            }
        } 
    }

}

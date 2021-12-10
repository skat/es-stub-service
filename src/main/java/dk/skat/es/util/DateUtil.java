package dk.skat.es.util;


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {


    protected static XMLGregorianCalendar simpleYearToXMLGregorianCalendar(Integer year) {
        if (year != null) {
            return simpleYearToXMLGregorianCalendar(year.toString());
        }

        return null;
    }

    protected static XMLGregorianCalendar simpleYearToXMLGregorianCalendar(String year) {
        XMLGregorianCalendar xmlGregorianCalendar;


            GregorianCalendar gregory = new GregorianCalendar();
        try {
            gregory.setTimeInMillis(new SimpleDateFormat("yyyy").parse(year).getTime());
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
            return xmlGregorianCalendar;
        } catch (ParseException e) {
            //LOGGER.warn("Error while mapping year:"+year,e);
            throw new RuntimeException(e);
        } catch (DatatypeConfigurationException e) {
            //LOGGER.warn("Error while mapping year:" + year, e);
            throw new RuntimeException(e);
        }
    }

    public static XMLGregorianCalendar dateToXmlGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }

            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            //LOGGER.warn("Error while mapping date:" + ReflectionToStringBuilder.toString(date), e);
            throw new RuntimeException(e);
        }
    }

    protected static BigInteger intToBigInteger(int value) {
        return BigInteger.valueOf(value);
    }


}

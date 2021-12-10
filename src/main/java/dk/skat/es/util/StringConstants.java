package dk.skat.es.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import weblogic.utils.StringUtils;

//import com.logica.mansvc.services.EORIServiceHelper;

public class StringConstants {

    public static final String OP_TRANSPORT_OPERATOR = "Transport Operator";
    public static final String OP_CARRIER_IS_TRANSPORTOER = "Carrier";
    public static final String OP_TRANSPORT_OPERATOR_REPRESENTATIVE = "Transport Operator representative";
    public static final String OP_PERSON_LODGING_IS_REGISTRATOR = "Person lodging";
    public static final String OP_MIO_OPERATOR_MANPOST = "Temporary Storage Facility Operator";
    public static final String OP_MIO_OPERATOR_ARRIVAL = "Declared Temporary Storage Facility Operator";
    public static final String OP_MIO_TRADER_CONSIGNEE_IS_MODTAGER = "Consignee";
    public static final String OP_TRADER_CONSIGNOR = "Consignor";
    public static final String OP_NOTIFY_PARTY = "Notify Party";
    public static final String OP_DATA_PROVIDER = "Data Provider";
    public static final String OP_TRADER_REPRESENTATIVE = "Trader representative";
    public static final String OP_MIG_REPRESENTATIVE = "MIG representative";
    public static final String TIN_CONSIGNEE_PRIVATE_PERSON = "DK09999981";
    
    public static final int REFTYPE_MIO_REFERENCE = 1;
    public static final int REFTYPE_ARRIVAL_REFERENCE = 2;
    public static final int REFTYPE_DEPARTURE_REFERENCE = 3;

    public static final String STATUS_CODE_DECLARATION_STATE = "00";
    public static final String STATUS_CODE_DECLARATION_STATE_UPDATED = "00";

    public static final String CERTIFICATE_TYPE_AEOF = "AEOF";
    public static final String CERTIFICATE_TYPE_AEOS = "AEOS";

    public static final String SOK_TIN = "DK16287180";
    
    public static final String ZERO = "0";
    public static final String TIR_BLANK = "-";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String GIVE_UP_STATUS = "7";
    public static final String STATUS_ENS_HAS_ARRIVED = "22";
    public static final int    STATUS_ENS_HAS_ARRIVED_INT = 22;
    public static final String STATUS_EAD_IS_VALID_AND_USEFUL = "51";
    public static final String KEY_MAX_RESULT = "100";
    public static final String SYSTEM_PARAM = "SYSTEM";
    public static final String MAX_RESULT_PARAM = "MAX_RESULT";

    public static final String SOSType_ENS = "Z355";
    public static final String TDType_ENS = SOSType_ENS;
    public static final String TDType_1TSD = "1TSD";
    public static final String TDType_1EAD = "1EAD";
    public static final String TDType_1EXS = "1EXS";
    public static final String TDType_FUE = "6FUE";
    public static final String TDType_FOE = "6FOE";
    public static final String TDType_1STD = "1STD";
    public static final String TDType_2STD = "2STD";
    public static final String TDType_Z820 = "Z820";
    public static final String TDType_Z821 = "Z821";
    public static final String TDType_3MIG = "3MIG";
    public static final String TDType_X337_MIO = "X337";
    public static final String TDType_HDMS = "HDMS";

    public static final String DANISH_MRN_AND_TIN = "DK";
    public static final String DANISH_LANDKODE = "DK";
    public static final String DK_FIXED_TOLDSTED = "DK007900";

    public static final String MAN_POST_REJECTED_OTHER_REASONS_CODE = "70";
    public static final String MAN_POST_REJECTED_MASS_GROSS_DEVIATION_CODE = "71";
    public static final String MAN_POST_ACCEPTED_CODE = "72";

    public static final String MAN_POST_EXEMPTED_FROM_SECURITY_CHECK = "75";
    public static final String MAN_POST_READY_FOR_BALANCING = "76";
    public static final String MAN_POST_REJECTED_CODE = "77";
    public static final String KODE = "kode";
    public static final String Pligtkode_KODE = "79";
    public static final String Virksomhedsadress_KODE = "4";

    /*
     * Status codes of the transport operations
     */
    public static final String STATUS_TD_00_CREATED = "00";
    public static final String STATUS_TD_07_DELETED = "07";
    public static final String STATUS_TD_09_ERROR = "09";
    public static final String STATUS_TD_10_WAITSTATE = "10";
    public static final String STATUS_TD_11_APPROVED = "11";
    public static final String STATUS_TD_20 = "20";
    public static final int STATUS_TD_20_INT = 20;
    public static final String STATUS_TD_40_RELEASED = "40";
    public static final String STATUS_TD_60_COMPLETED = "60";
    public static final String STATUS_TD_06_GROSSMASS_DISCREPANCY = "06";
    public static final String STATUS_TD_97_CLEANED = "97";
    
    // status kodes for search criteria
    public static final String STATUS_07_FOR_DELETED_MIGMIO = "07";
    public static final String STATUS_09_FOR_ERROR_MIGMIO = "09";
    
    public static final int INT_ONE = 1;
    public static final int INT_TWO = 2;

    // TransportMode
    public static final String INLAND_TRANSPORTMODE = "2";

    public static final int INDEHOLDER_EAD_EXS_ZERO = 0;
    public static final int INDEHOLDER_EAD_EXS_ONE = 1;

    public static final String TRN_AIR_BOUND = "DN13";
    public static final String TRN_DN12_FERRY = "DN12";

    public static final String MANITEM_CUSTOMS_STATUS_TYPE_COMMUNITY_GOODS = "C";
    
    public static final String MANITEM_CUSTOMS_STATUS_READY_FOR_PRESENTATION = "C";
    public static final String MIG_ENDRING_STATUS_FOR_CORRECTION = "U";
    
    public static final String MIG_ANNULLMENT = "C";
    public static final String MIG_CORRECTION = "U";

    public static final String MANITEM_CUSTOMS_STATUS_F = "F";
    public static final String MANITEM_CUSTOMS_STATUS_READY_FOR_BALANCING = "B";
    public static final String SPECIEL_FORHOLD_MARKERING = "E";
    public static final String MANITEM_CUSTOMS_STATUS_T = "T";
    public static final String SHIPMENT_FLAG_N = "N";
    public static final String SHIPMENT_FLAG_J = "J";

    /**
     * ADCD = Arrival Declaration - Customs Data For getting accepted tolerance
     * for disrepancy i between Gross Mass declared in the Arrival Declaration
     * and the Gross Mass declared in the Customs Datas
     */
    public static final String SITUATION_CODE_ARRDECL_CUSTOMS_DATA = "ADCD";

    /**
     * DDCD = Departure Declaration - Customs Data For getting accepted
     * tolerance for disrepancy i between Gross Mass declared in the departure
     * Declaration and the Gross Mass declared in the Customs Datas
     */
    public static final String SITUATION_CODE_DEPARTUREDECL_CUSTOMS_DATA = "DDCD";

    /**
     * ADPD = Arrival Declaration - Produced customs Document For getting
     * accepted tolerance for disrepancy i between Gross Mass declared in the
     * Arrival Declaration and the Gross Mass declared in the Produced Customs
     * Documents).
     */
    public static final String SITUATION_CODE_ARRDECL_PRODUCED_DOCUMENTS = "ADPD";
    public static final String SITUATION_CODE_DEPARTUREDECL_PRODUCESDCUSTOMS_DATA = "DDPD";

    /**
     * ANAD = Arrival Notification - Arrival Declaration: (Accepted tolerance for discrepancy i
     * between Total Gross Mass declared in the Arrival Notification and
     * the Total Gross Mass declared in all refering the Arrival Declarations).
     */
    public static final String SITUATION_CODE_ARRIVAL_NOTIFICATION_DATA = "ANAD";

    // MTMV = bagatelgr�nse m�lt i kilo, hvis diff < bagatelgr�nse s� godkend, uanset procentafvigelse (f.eks. 500g GM, 400g PCD = 100g afvigelse = 20%, men godkendes)
    public static final String SITUATION_CODE_TRIVIALITY_LIMIT = "MTMV";
    public static final String SITUATION_CODE_DEPARTURE_NOTIFICATION_DATA = "DNDD";

    public static final String TAD_TSAD_STATE_1 = "SUB";
    public static final String TAD_TSAD_STATE_2 = "ATR";
    public static final String EAD = "EAD";
    public static final String EXS = "EXS";
    public static final String TSAD = "TSAD";
    public static final String ENS = "ENS";
    public static final String CARGO_CODE_AIR_BORNE = "DN13";
    public static final String CARGO_CODE_TRUCK_FERRY = "DN12";
    public static final String CARGO_CODE_FERRY = "AN11";
    public static final String DOC_TYP_AIRWAY_BILL_N740 = "N740";
    public static final String DOC_TYP_AIRWAY_BILL_N741 = "N741";
    public static final int TRANSPORT_MODE_1_SEA = 1;
    public static final int TRANSPORT_MODE_2_RAIL = 2;
    public static final int TRANSPORT_MODE_3_ROAD = 3;
    public static final int TRANSPORT_MODE_4_AIR = 4;
    public static final String DOC_TYP_2STD = "2STD";

    public static final String TAD_TSAD_INVALID_STATES = "ACD.GUR.GUA.GRG.URR.CAN.NRT.SUB.C07.REJ.MTB.WCA.";
    public static final String TAD_TSAD_INVALID_STATE_3_PLUS = "ATR." + TAD_TSAD_INVALID_STATES;

    public static final String MANIFEST_READY_PRESENTATION = "OK";
    public static final String MANIFEST_IS_READY_FOR_BALANCE_GROSSMASS = "Manifest is ready For Balance Gross Mass";

    // Mig Status Codes
    public static final String RISKCODE_FOR_RISK_COMPUTED = "21";
    public static final String MARKED_FOR_RISKCONTROL = "22";
    public static final String RELEASED = "40";
    public static final String MIG_ACTIVE = "J";
    public static final String MIG_INACTIVE = "N";

    public static final String MIO_MIG_WAITING_FOR_APPROVAL = "13";
    public static final String MIO_MIG_ENDRING_STATUS_FOR_CANCELLATION = "C";
    public static final String MIO_MIG_ENDRING_STATUS_FOR_CORRECTION = "U";
    public static final String MIO_MIG_TERMINATE_LOG_ERROR = "Manual intervention is needed, as no answer is sent to the the Transit System";

    // MIO Constants
    public static final String MIO_AKTIV = "J";
    public static final String MIO_INAKTIV = "N";
    public static final String SKONSMASSIG_ANSATTELSE_MIGMIO = "2";
    public static final String ANGIVELSESFRIST_SOONOUTDATED_MIGMIO = "32";
    public static final String ANGIVELSESFRIST_SOONOUTDATED_MIGMIO_2 = "47";
    public static final String ANGIVELSESFRIST_SOONOUTDATED_MIGMIO_3 = "48";
    public static final String ANGIVELSESFRIST_MEDDELESE_TYPE = "31";
    public static final String ANGIVELSESFRIST_GIVE_UP_TYPE = "46";
    public static final String ANGIVELSESFRIST_DELAY_EXPORTNOTIFICATION = "29";
    public static final String MIO_06_ANGIVELSESART = "06";
    public static final String MIG_65_ANGIVELSESART = "65";
    public static final String MIO_66_ANGIVELSESART = "66";
    public static final String MIO_STATE_00_STATUS = "00";
    public static final String MIO_STATE_31_STATUS = "31";
    public static final String MIO_STATE_09_STATUS = "09";
    public static final String MIO_STATE_12_STATUS = "12";
    public static final String MIO_STATE_11_STATUS = "11";
    public static final String MIO_STATE_20_STATUS = "20";
    public static final String MIO_STATE_21_STATUS = "21";
    public static final String MIO_STATE_22_STATUS = "22";
    public static final String MIO_STATE_40_ACCEPT_CORRECTION = "40";
    public static final String MIO_STATE_98_ACCEPT_ANNULLMENT = "98";
    public static final String MIO_STATE_29_STATUS = "29";
    public static final String ANKOMST = "ANKOMST";
    public static final String AFGANG = "AFGANG";
    public static final String TRANSIT = "TRANSIT";
    public static final String IMPORT = "IMPORT";

    // Report codes
    public static final String REPORTS_ARRIVAL_NOTIFICATION_REQUIRED = "R";
    public static final String ARRIVAL_MESSAGE_61_ANGIVELSESART = "61";
    public static final String DEPARTURE_MESSAGE_63_ANGIVELSESART = "63";
    public static final String MIG_20_STATUSCODE = "20";
    public static final String MIG_21_STATUSCODE = "21";
    public static final String MIG_39_STATUSCODE = "39";
    public static final String MIG_40_STATUSKODE = "40";
    public static final String MIG_48_STATUSKODE = "48";
    public static final String MIG_60_STATUSKODE = "60";

    // Risk Codes
    public static final String INTERNAL_NATIONAL_RISK_CODE_N = "N";
    public static final String NO_RISKANALYSIS_RES_AVAILABLE_Z = "Z";
    public static final String NO_RISK_IDENTIFIED_0 = "0";

    // Risk ranking types
    public static final String RiskRanking_A_HIGH = "A";
    public static final String RiskRanking_B_MEDIUM_CHECK = "B";
    public static final String RiskRanking_C_LOW = "C";
    public static final String RiskRanking_0_NO_RISK = "0";
    public static final String RiskRanking_Z_NOT_COMPUTED = "Z";
    public static final String YES_ACTIVE_FLAG = "J";
    public static final String NO_ACTIVE_FLAG = "N";

    public static final String DOCUMENT_REFERENCE_TYPE_5TSD = "5TSD";
    public static final String DOCUMENT_REFERENCE_TYPE_5TAD = "5TAD";
    public static final String DOCUMENT_REFERENCE_TYPE_X355 = "X355";
    public static final String DOCUMENT_REFERENCE_TYPE_Z821 = "Z821";

    // MIG External Reference Types
    public static final String FUE_FOE_TYPE = "FUE/FOE";
    public static final String TAD_TSAD_TYPE = "TAD/TSAD";
    public static final String MIO_TYPE = "MIO";
    public static final String TRANSPORTDEKLARATION_TYPE = "TRANSPORTDEKLARATION";
    public static final String MIGMIO_TYPE = "MIGMIO";
    
    // Hjemstedsordningen
    public static final String CERT_TYPE_Hjemstedsordningen = "3700"; 

    // TAD/TSAD
    public static final String TRANSIT_ARRIVAL_STATUS_ARD = "ARD";
    public static final String TRANSIT_ARRIVAL_STATUS_AOD = "AOD";
    public static final String TRANSIT_ARRIVAL_STATUS_ARA = "ARA";
    public static final String TRANSPORT_MEDDELELSE_ARRIVAL_TYPE = "ARR";
    public static final String TRANSPORT_MEDDELELSE_DEPARTURE_TYPE = "DEP";
    public static final String MIO_MIG_RELEASE_WITH_VAB = "Released with VAB";
    public static final String MIO_MIG_RELEASED = "Released";
    public static final String ARRIVAL_DECLARATION = "Arrival declaration";
    public static final String CUSTOM_DOCUMENTS = "Customs documents";
    public static final String ANGIVELSESART_ANK_DEKL_60 = "60";
    public static final String ANGIVELSESART_AFG_DEKL_62 = "62";
    public static final String OPRYDNINGS_AARSAG = "10";
    public static final String OPRYDNINGS_TEKST = "masse oprydning";
    public static final String ANKMOSTMED = "AnkomstMed";
    public static final String AFGANGMED = "AfgangsMed";
    public static final String MIG_TYPE = "MIG";
    public static final String INDBERETNING = "Indberetning";
    public static final String STATUS_CODE_CLEAN_UP_STATE = "97";
    public static final String SSN_REPORT_TINNUMBER = "DK16287180";

    public static final String UC52 = "MAN52";
    public static final String UC50 = "MAN50";
    public static final String UC51 = "MAN51";
    public static final String UC57 = "MAN57";
    
    public static final String ANG_FRIST_TYPE_43="43";
    public static final String ANG_FRIST_TYPE_44="44";
    public static final String ANG_FRIST_TYPE_45="45";
    public static final String ANG_FRIST_TYPE_49="49";
    public static final String ANG_FRIST_TYPE_50="50";
    
    /**
     * Return a date relative to today, -1 = yesterday, 1 = tomorrow
     * 
     * @param offset
     *            the offset to add/dec from today
     * @return The date offset
     */
    public static Date getTodayOffset(int offset) {
        Calendar today = Calendar.getInstance();
        if (offset != 0)
            today.add(Calendar.DATE, offset);
        return today.getTime();
    }

    /**
     * Is this tin number a danish one ? if it is starting with "DK"
     * 
     * @param tin
     *            The TIN number to check for DK
     * @return True if DK, otherwise false
     */
    public static boolean isDanishTINNumber(String tin) {
        //return ((tin != null) && tin.toUpperCase().startsWith(DANISH_MRN_AND_TIN) && EORIServiceHelper.isLegalTIN(tin));
        return ((tin != null) && tin.toUpperCase().startsWith(DANISH_MRN_AND_TIN));
    }

    public static boolean isTRNNumber(String trn) {
        return ((trn != null) && (trn.length()==13) && (trn.charAt(4)=='5'));
    }

    public static boolean isCVRNumber(String cvr) {
        //return ((cvr != null) && (cvr.length()==8) && DocumentValidator.isAllDigitsExists(cvr));
        return ((cvr != null) && (cvr.length()==8));
    }

    public static boolean isMIONumber(String mio) {
        return ((mio != null) && (mio.length()==13) && (mio.charAt(4)=='6'));
    }

    /**
     * Is this MRN number a danish one ? Letters "DK" must be 3rd and 4th chars
     * 
     * @param mrn
     *            The TIN number to check for DK
     * @return True if DK, otherwise false
     */
    public static boolean isDanishMRNNumber(String mrn) {
        return ((mrn != null) && (mrn.toUpperCase().indexOf(DANISH_MRN_AND_TIN) == 2));
    }

    public static boolean isMRANumber(String tinNummer) {
        if (StringUtils.isEmptyString(tinNummer) || (tinNummer.length()<3)) return false;
        // MRA numbers start with JP or US
        if (tinNummer.toUpperCase().startsWith("JP")) return true;
        if (tinNummer.toUpperCase().startsWith("US")) return true;
        
        return false;
    }
    
    public static boolean isValidOnDate(Date from, Date till, Date today) {
        if (from != null) from = getBeginningOfDay(from);
        if (till != null) till = getEndOfDay(till);
        if (today == null)
            today = getTodayOffset(0);
        // not yet valid ?
        if ((from != null) && from.after(today))
            return false;
        // expired ?
        if ((till != null) && till.before(today))
            return false;
        // none of the above - so it is valid !
        return true;
    }

    public static String toDateString(Date dt, String fmt) {
        if (dt == null)
            return null;
        if (StringUtils.isEmptyString(fmt)) {
            fmt = "yyyy-MM-dd'T'HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(dt);
    }

    public static Date fromDateString(String dt, String fmt) {
        if (dt == null)
            return null;
        if (StringUtils.isEmptyString(fmt)) {
            fmt = "yyyyMMdd";
        }
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat(fmt);
            return sdf.parse(dt);
        } catch (Exception e) {
            return null;
        }
    }

    public static Date getBeginningOfDay(Date oprFrom) {
        Calendar dt = Calendar.getInstance();
        if (oprFrom != null)
            dt.setTime(oprFrom);
        dt.set(Calendar.HOUR_OF_DAY, 0);
        dt.set(Calendar.MINUTE, 0);
        dt.set(Calendar.SECOND, 0);
        dt.set(Calendar.MILLISECOND, 0);
        return dt.getTime();
    }

    public static Date getEndOfDay(Date oprFrom) {
        Calendar dt = Calendar.getInstance();
        if (oprFrom != null)
            dt.setTime(oprFrom);
        dt.set(Calendar.HOUR_OF_DAY, 23);
        dt.set(Calendar.MINUTE, 59);
        dt.set(Calendar.SECOND, 59);
        dt.set(Calendar.MILLISECOND, 999);
        return dt.getTime();
    }

    public static int getRandom(int min, int max) {
        if (max<=min) max = (min+1);
        Random rnd = new Random();
        int num = rnd.nextInt((max-min));
        
        return (num+min);
    }

    public static String toImportContainerID(String id) {
        // Import system forces a dash into the container id's, so "ABBU12345678" becomes "ABBU-12345678"
        if ((id!=null) && (id.length()>4))
        {
            if (id.charAt(4) != '-') id = id.substring(0,4) + "-" + id.substring(4);
        }
        
        return id;
    }
    
    public static boolean isSameTransportDocumentType(String dt1, String dt2)
    {
        if ((dt1==null) || (dt2==null)) return false;
        if (dt1.equalsIgnoreCase(dt2)) return true;
        
        dt1 = getTransportDocNumber(dt1);
        dt2 = getTransportDocNumber(dt2);
        
        return (dt1.equalsIgnoreCase(dt2));
    }
    
    public static String getTransportDocNumber(String docType)
    {
        if ((docType != null) && (docType.length()>3))
        {
            // transport document type N740 or X822 should be returned as just 740 and 822
            if (Character.isLetter(docType.charAt(0))) docType = docType.substring(1);
        }
        
        return docType;
    }

    public static String listToString(List<?> refs) {
        if ((refs==null) || (refs.size()==0)) return "";
        StringBuffer result = new StringBuffer();
        for (Object object : refs) {
            if (object==null) continue;
            if (result.length()>0) result.append(",");
            result.append(object.toString());
        }
        
        return result.toString();
    }

    public static String maxLength(String data, int maxLen) {
        if ((data != null) && (data.length()>maxLen))
        {
            data = data.substring(0,maxLen-2) + "�";
        }
        
        return data;
    }

}

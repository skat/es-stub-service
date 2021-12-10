package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.HovedOplysningerSvarType;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.ObjectFactoryTransaktions;
import dk.skat.es.util.DateUtil;

public class RegistreringForholdTransactionMapping {
	
	protected static ObjectFactoryTransaktions hovedOplysningerSvarFactory = new ObjectFactoryTransaktions();
	
	
	public static HovedOplysningerSvarType mapHovedOplysningerSvar() {
		
		HovedOplysningerSvarType hovedOplysningerSvarType = hovedOplysningerSvarFactory.createHovedOplysningerSvarType();
    	hovedOplysningerSvarType.setTransaktionsID("TRK-1632736445093");
    	hovedOplysningerSvarType.setServiceID("ESRegistreringForholdBevillingStubService");
    	hovedOplysningerSvarType.setTransaktionsTid(DateUtil.dateToXmlGregorianCalendar(new Date()));

		return hovedOplysningerSvarType;
	}


}

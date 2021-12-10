package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.KontekstType;
import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.HovedOplysningerSvarType;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.ObjectFactoryTransaktions;
import dk.skat.es.util.DateUtil;

public class KontekstTypeMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static KontekstType mapKontekstType() {

		KontekstType kontekstType = objectFactory.createKontekstType();
		/*ObjectFactoryTransaktions hovedOplysningerSvarFactory = new ObjectFactoryTransaktions();

		HovedOplysningerSvarType hovedOplysningerSvarType = hovedOplysningerSvarFactory
				.createHovedOplysningerSvarType();

		hovedOplysningerSvarType.setTransaktionsID("TRK-1632736445093");
		hovedOplysningerSvarType.setServiceID("ESVirksomhedStamOplysningStub");
		hovedOplysningerSvarType.setTransaktionsTid(DateUtil.dateToXmlGregorianCalendar(new Date()));

		kontekstType.setHovedOplysningerSvar(hovedOplysningerSvarType);*/
		return kontekstType;

	}

}

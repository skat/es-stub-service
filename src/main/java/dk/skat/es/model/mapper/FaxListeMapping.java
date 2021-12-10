package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType.FaxListe;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType.FaxListe.Fax;
import dk.skat.es.util.DateUtil;

public class FaxListeMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static FaxListe mapFaxListe() {

		FaxListe faxListe = objectFactory.createVirksomhedKontaktOplysningStrukturTypeFaxListe();
		Fax fax = objectFactory.createVirksomhedKontaktOplysningStrukturTypeFaxListeFax();

		fax.setFaxNummer("44444444444444444444444");
		fax.setFaxGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
		faxListe.getFax().add(fax);
		
		return faxListe;

	}

}

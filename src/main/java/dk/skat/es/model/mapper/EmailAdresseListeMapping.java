package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType.EmailAdresseListe;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType.EmailAdresseListe.EmailAdresse;
import dk.skat.es.util.DateUtil;

public class EmailAdresseListeMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static EmailAdresseListe mapEmailAddress() {

		EmailAdresseListe emailAdresseListe = objectFactory
				.createVirksomhedKontaktOplysningStrukturTypeEmailAdresseListe();

		EmailAdresse emailAdresse = objectFactory
				.createVirksomhedKontaktOplysningStrukturTypeEmailAdresseListeEmailAdresse();

		emailAdresse.setEmailAdresseEmail("TestESStubService@Skat.dk");

		emailAdresse.setEmailAdresseGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));

		emailAdresseListe.getEmailAdresse().add(emailAdresse);
		return emailAdresseListe;

	}

}

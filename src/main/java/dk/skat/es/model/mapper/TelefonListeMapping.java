package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType.TelefonListe;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType.TelefonListe.Telefon;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.util.DateUtil;

public class TelefonListeMapping {
	
	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static TelefonListe mapTelefonAddress(EORIVirkWhitelist eoriVirkWhitelist) {

		TelefonListe telefonListe = objectFactory.createVirksomhedKontaktOplysningStrukturTypeTelefonListe();
		Telefon telefon = objectFactory.createVirksomhedKontaktOplysningStrukturTypeTelefonListeTelefon();

		/*telefon.setTelefonNummer("97373088");
		telefon.setTelefonGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));*/
		
		telefon.setTelefonNummer(eoriVirkWhitelist.getTlf_nr());
		//telefon.setTelefonGyldigFra(eoriVirkWhitelist.getVirk_adr_tlf_nr_start_dto());
		telefon.setTelefonGyldigFra(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_adr_tlf_nr_start_dto()));
		
		telefonListe.getTelefon().add(telefon);

		return telefonListe;
	}

}

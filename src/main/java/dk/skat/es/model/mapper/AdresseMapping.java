package dk.skat.es.model.mapper;

import java.math.BigInteger;
import java.util.Date;

import dk.skat.begrebsmodel.kontakt._2009._01._15.ObjectFactory;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedAdresseStrukturType.AdresseValg.Adresse;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.util.DateUtil;

public class AdresseMapping {
	
	
	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static Adresse mapAddress(EORIVirkWhitelist eoriVirkWhitelist) {

		Adresse adresse = objectFactory.createVirksomhedAdresseStrukturTypeAdresseValgAdresse();

		//adresse.setAdresseFortløbendeNummer(new BigInteger("0"));
		adresse.setAdresseFortløbendeNummer(new BigInteger(eoriVirkWhitelist.getVirk_adr_lb_nr()));
		adresse.setAdresseByNavn(eoriVirkWhitelist.getBy_nvn());
		
		adresse.setAdresseVejNavn(adresse.getAdresseVejNavn());
		
		adresse.setAdresseFraHusNummer(new BigInteger("41"));
		//adresse.setAdresseFraHusNummer(new BigInteger(eoriVirkWhitelist.getStart_hus_nr()));
		adresse.setAdressePostNummer(new BigInteger(eoriVirkWhitelist.getPostNumber()));
		adresse.setAdressePostDistrikt("Tarm");
		adresse.setAdresseVejKode(new BigInteger("1929"));
		//adresse.setAdresseGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
		adresse.setAdresseGyldigFra(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_start_dto()));
		adresse.setMyndighedNummer(new BigInteger("760"));

		return adresse;
	}

}

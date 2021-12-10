package dk.skat.es.model.mapper;

import java.math.BigInteger;
import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedAdresseStrukturType.AdresseValg;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedAdresseStrukturType.AdresseValg.Adresse;
import dk.skat.es.util.DateUtil;

public class AdresseValgMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static AdresseValg mapAddress() {

		AdresseValg adresseValg = objectFactory.createVirksomhedAdresseStrukturTypeAdresseValg();
		Adresse adresse = objectFactory.createVirksomhedAdresseStrukturTypeAdresseValgAdresse();

		adresse.setAdresseFortløbendeNummer(new BigInteger("0"));
		adresse.setAdresseByNavn("Storegade");
		adresse.setAdresseFraHusNummer(new BigInteger("41"));
		adresse.setAdressePostNummer(new BigInteger("6880"));
		adresse.setAdressePostDistrikt("Tarm");
		adresse.setAdresseVejKode(new BigInteger("1929"));
		adresse.setAdresseGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
		adresse.setMyndighedNummer(new BigInteger("760"));
		adresseValg.setAdresse(adresse);

		return adresseValg;
	}
}

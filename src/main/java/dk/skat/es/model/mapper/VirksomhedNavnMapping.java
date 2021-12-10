package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedNavn;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.util.DateUtil;

public class VirksomhedNavnMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static VirksomhedNavn mapVirksomhedNavn(EORIVirkWhitelist eoriVirkWhitelist) {

		VirksomhedNavn virksomhedNavn = objectFactory
				.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysningVirksomhedNavn();

/*		virksomhedNavn.setVirksomhedNavnFirmaNavn("Andelskassen Egvad");
		virksomhedNavn.setVirksomhedNavnFirmaNavnKort("Andelskassen Egvad");*/
		virksomhedNavn.setVirksomhedNavnFirmaNavn(eoriVirkWhitelist.getFirma_nvn());
		virksomhedNavn.setVirksomhedNavnFirmaNavnKort(eoriVirkWhitelist.getFirma_nvn_kort());
		

		virksomhedNavn.setVirksomhedNavnGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
		return virksomhedNavn;
	}

}

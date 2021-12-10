package dk.skat.es.model.mapper;

import java.math.BigInteger;
import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.util.DateUtil;

public class VirksomhedStamOplysningMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning virksomhedStamOplysning(EORIVirkWhitelist eoriVirkWhitelist) {

		VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning virksomhedStamOplysning = objectFactory
				.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysning();

		virksomhedStamOplysning.setVirksomhedSENummer(new BigInteger("82011838"));
		virksomhedStamOplysning.setVirksomhedCVRNummer("82011838");
		virksomhedStamOplysning.setVirksomhedStartDato(DateUtil.dateToXmlGregorianCalendar(new Date()));
		virksomhedStamOplysning.setVirksomhedNavn(VirksomhedNavnMapping.mapVirksomhedNavn(eoriVirkWhitelist));
		virksomhedStamOplysning.setDriftForm(DriftFormMapping.mapMyndighed());
		virksomhedStamOplysning.setFogedområdeNummer("21");
		
		return virksomhedStamOplysning;
	}

}

package dk.skat.es.model.mapper;

import java.math.BigInteger;
import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.Myndighed;
import dk.skat.es.util.DateUtil;

public class MyndighedMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static Myndighed mapMyndighed() {

		Myndighed myndighed = objectFactory
				.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysningMyndighed();
		myndighed.setMyndighedNummer(new BigInteger("8048"));
		myndighed.setMyndighedTilhørForholdGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));

		return myndighed;
	}

}

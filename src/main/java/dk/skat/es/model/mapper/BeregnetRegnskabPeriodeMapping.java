package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeregnetRegnskabPeriode;
import dk.skat.es.util.DateUtil;

public class BeregnetRegnskabPeriodeMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static BeregnetRegnskabPeriode beregnetRegnskabPeriode() {

		BeregnetRegnskabPeriode beregnetRegnskabPeriode = objectFactory
				.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysningBeregnetRegnskabPeriode();

		beregnetRegnskabPeriode.setVirksomhedRegnskabPeriodeStartDato(DateUtil.dateToXmlGregorianCalendar(new Date()));
		beregnetRegnskabPeriode.setVirksomhedRegnskabPeriodeSlutDato(DateUtil.dateToXmlGregorianCalendar(new Date()));
		return beregnetRegnskabPeriode;

	}

}

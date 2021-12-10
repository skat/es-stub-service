package dk.skat.es.model.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.DriftForm;
import dk.skat.es.util.DateUtil;

public class DriftFormMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static DriftForm mapMyndighed() {

		DriftForm driftForm = objectFactory
				.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysningDriftForm();

		driftForm.setDriftFormKode("021");
		driftForm.setDriftFormForholdStartDato(DateUtil.dateToXmlGregorianCalendar(new Date()));

		return driftForm;
	}

}

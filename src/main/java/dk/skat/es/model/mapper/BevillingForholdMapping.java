package dk.skat.es.model.mapper;

import java.math.BigInteger;
import java.util.Date;

import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.util.DateUtil;
import dk.skat.begrebsmodel._2009._01._15.ObjectFactory;

public class BevillingForholdMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static BevillingForhold mapBevillingForhold(EORIVirkWhitelist eoriVirkWhitelist) {

		BevillingForhold bevillingForhold = objectFactory
				.createRegistreringForholdBevillingHentOTypeVirksomhedListeVirksomhedBevillingForholdListeBevillingForhold();

		bevillingForhold.setPligtKode(eoriVirkWhitelist.getPligt_kod());
		bevillingForhold.setBevillingForholdKode(new BigInteger(eoriVirkWhitelist.getBev_kod()));
		bevillingForhold.setRegistreringForholdStartDato(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getBev_forh_start_dto()));
		bevillingForhold.setBevillingForholdJournalNummer(eoriVirkWhitelist.getBev_journal_nr());
		//bevillingForhold.setBevillingForholdGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
		bevillingForhold.setBevillingForholdGyldigFra(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_start_dto()));

		return bevillingForhold;

	}

}

package dk.skat.es.begrebsmodel.ws;


import java.math.BigInteger;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dk.skat.begrebsmodel.kontakt._2009._01._15.KontekstType;
import dk.skat.begrebsmodel.kontakt._2009._01._15.KompenserTransSvarType;
import dk.skat.begrebsmodel.kontakt._2009._01._15.KompenserTransType;
import dk.skat.begrebsmodel.kontakt._2009._01._15.ObjectFactory;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedAdresseStrukturType;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedAdresseStrukturType.AdresseValg;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningSamlingHentI;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningSamlingHentO;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe.VirksomhedKontaktOplysning;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningSamlingHentServicePortType;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningStrukturType;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningStrukturType.EmailAdresseListe;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningStrukturType.FaxListe;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningStrukturType.TelefonListe;
import dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningStrukturType.TelefonListe.Telefon;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.ObjectFactoryTransaktions;
import dk.skat.es.dao.EORIServiceDAO;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.model.mapper.AdresseMapping;
import dk.skat.es.util.AbstractServiceImpl;
import dk.skat.es.util.DateUtil;
import dk.skat.es.util.RequestHelper;

@WebService(targetNamespace="http://skat.dk/begrebsmodel/2009/01/15/",
            endpointInterface="dk.skat.begrebsmodel.kontakt._2009._01._15.VirksomhedKontaktOplysningSamlingHentServicePortType")
public class ESVirksomhedKontaktOplysningStub extends AbstractServiceImpl implements VirksomhedKontaktOplysningSamlingHentServicePortType {
	
	private static final Log log = LogFactory.getLog(ESVirksomhedKontaktOplysningStub.class);
	
	protected static ObjectFactory objectFactory = new ObjectFactory();
	protected static ObjectFactoryTransaktions hovedOplysningerSvarFactory = new ObjectFactoryTransaktions();

	public VirksomhedKontaktOplysningSamlingHentO getVirksomhedKontaktOplysningSamlingHent(VirksomhedKontaktOplysningSamlingHentI request) {
		
		BigInteger virksomhedSENummer = request.getVirksomhedSENummer();
		
		
		
		VirksomhedKontaktOplysningSamlingHentO virksomhedKontaktOplysningSamlingHentO = objectFactory.createVirksomhedKontaktOplysningSamlingHentO();

		
		
		handleHovedOplysninger(request, virksomhedKontaktOplysningSamlingHentO);

		
	    log.info("------ ESVirksomhedKontaktOplysningStubService Called - ES Number Found - Begin ----------");
	    log.info("------         Given ES Number   --------------->  "+virksomhedSENummer);
		
		VirksomhedKontaktOplysningListe virksomhedKontaktOplysningListe = objectFactory.createVirksomhedKontaktOplysningSamlingHentOTypeVirksomhedKontaktOplysningListe();
		VirksomhedKontaktOplysning virksomhedKontaktOplysning = objectFactory.createVirksomhedKontaktOplysningSamlingHentOTypeVirksomhedKontaktOplysningListeVirksomhedKontaktOplysning();
		VirksomhedKontaktOplysningStrukturType virksomhedKontaktOplysningStrukturType = objectFactory.createVirksomhedKontaktOplysningStrukturType();
		VirksomhedAdresseStrukturType virksomhedAdresseStrukturType = objectFactory.createVirksomhedAdresseStrukturType();
		AdresseValg adresseValg = objectFactory.createVirksomhedAdresseStrukturTypeAdresseValg();
		TelefonListe telefonListe = objectFactory.createVirksomhedKontaktOplysningStrukturTypeTelefonListe();
		Telefon telefon = objectFactory.createVirksomhedKontaktOplysningStrukturTypeTelefonListeTelefon();
		EmailAdresseListe emailAdresseListe = objectFactory.createVirksomhedKontaktOplysningStrukturTypeEmailAdresseListe();
		FaxListe faxListe = objectFactory.createVirksomhedKontaktOplysningStrukturTypeFaxListe();
		KontekstType kontekstType = objectFactory.createKontekstType();
		
		EORIServiceDAO eoriService = new EORIServiceDAO();
    	EORIVirkWhitelist eoriVirkWhitelist = new EORIVirkWhitelist();
    	//eoriVirkWhitelist = eoriService.getEORINumber(virksomhedSENummer.toString());
    	
    	eoriVirkWhitelist = eoriService.getEORINumberBasedOnPlightKod(virksomhedSENummer.toString(),request.getPligtKodeFiltrering().getPligtKode().toString());
    	
    	
		
		if(eoriVirkWhitelist.getEoriNumber().length() > 0) { 
			
			virksomhedAdresseStrukturType.setVirksomhedAdresseTypeKode(new BigInteger("1"));
			virksomhedAdresseStrukturType.setAdresseTypeKode(new BigInteger("1"));
	    	
	    	telefon.setTelefonNummer(eoriVirkWhitelist.getTlf_nr());
			telefon.setTelefonGyldigFra(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_adr_tlf_nr_start_dto()));
			telefon.setTelefonGyldigTil(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_adr_tlf_nr_start_dto()));
			
	    	telefonListe.getTelefon().add(telefon);
	    	adresseValg.setAdresse(AdresseMapping.mapAddress(eoriVirkWhitelist));
	    	virksomhedKontaktOplysningStrukturType.setTelefonListe(telefonListe);
	    	virksomhedKontaktOplysningStrukturType.setEmailAdresseListe(emailAdresseListe);
	    	virksomhedKontaktOplysningStrukturType.setFaxListe(faxListe);
	    	virksomhedAdresseStrukturType.setAdresseValg(adresseValg);
	    	virksomhedKontaktOplysningStrukturType.setVirksomhedAdresseStruktur(virksomhedAdresseStrukturType);
	    	
	    	virksomhedKontaktOplysning.setVirksomhedKontaktOplysningStruktur(virksomhedKontaktOplysningStrukturType);
	    	virksomhedKontaktOplysningListe.getVirksomhedKontaktOplysning().add(virksomhedKontaktOplysning);
	    	virksomhedKontaktOplysningListe.getVirksomhedKontaktOplysning().add(virksomhedKontaktOplysning);
	    	virksomhedKontaktOplysningListe.getVirksomhedKontaktOplysning().add(virksomhedKontaktOplysning);
	    	virksomhedKontaktOplysningListe.getVirksomhedKontaktOplysning().add(virksomhedKontaktOplysning);
	    	virksomhedKontaktOplysningSamlingHentO.setKontekst(kontekstType);
	    	virksomhedKontaktOplysningSamlingHentO.setVirksomhedKontaktOplysningListe(virksomhedKontaktOplysningListe);
		    log.info("------- ESVirksomhedKontaktOplysningStubService Called - ES Number Found - End   ----------");
		    
			addHovedOplysningerSvar(virksomhedKontaktOplysningSamlingHentO, virksomhedKontaktOplysningListe);
			
		} else {
			
		    log.info("------ ESVirksomhedKontaktOplysningStubService Called - ES Number NOT Found - Begin ----------");
		    log.info("------         Given ES Number   --------------->  "+virksomhedSENummer);

			Object outDoc = null;
			outDoc = RequestHelper.svarReaktionTemplate;
			RequestHelper.setOutputErrorDocument(outDoc);
			outDoc = RequestHelper.getOutputErrorDocument();

			log.info("------- ESVirksomhedKontaktOplysningStubService Called - ES NOT Number Found - End   ----------");
			addHovedOplysningerSvar1(virksomhedKontaktOplysningSamlingHentO, outDoc,virksomhedSENummer.toString());
		}
		return virksomhedKontaktOplysningSamlingHentO;
	}

	public KompenserTransSvarType getKompenserTrans(KompenserTransType request) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

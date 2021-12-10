package dk.skat.es.begrebsmodel.ws;


import java.math.BigInteger;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dk.skat.begrebsmodel._2009._01._15.ObjectFactory;
import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentI;
import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed;
import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentO;
import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentOType;
import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe;
import dk.skat.begrebsmodel._2009._01._15.KontekstType;
import dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentServicePortType;
import dk.skat.es.dao.EORIServiceDAO;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.model.mapper.BevillingForholdMapping;
import dk.skat.es.util.AbstractServiceImpl;
import dk.skat.es.util.RequestHelper;

@WebService(targetNamespace="http://skat.dk/begrebsmodel/2009/01/15/",
            endpointInterface="dk.skat.begrebsmodel._2009._01._15.RegistreringForholdBevillingHentServicePortType")
public class ESRegistreringForholdBevillingStub extends AbstractServiceImpl implements RegistreringForholdBevillingHentServicePortType {
	
	private static final Log log = LogFactory.getLog(ESRegistreringForholdBevillingStub.class);
	protected static ObjectFactory objectFactory = new ObjectFactory();

	public RegistreringForholdBevillingHentO getRegistreringForholdBevillingHent(RegistreringForholdBevillingHentI request) {
		
		
		RegistreringForholdBevillingHentO registreringForholdBevillingHentO = objectFactory.createRegistreringForholdBevillingHentO();
		List<Virksomhed> virksomheds =  request.getSøgekriterier().getVirksomhedListe().getVirksomhed();
	    log.info("---------- ESRegistreringForholdBevillingStubService Called - ES Number Found - Begin -------");
		handleHovedOplysninger(request, registreringForholdBevillingHentO);
	    
		RegistreringForholdBevillingHentOType.VirksomhedListe virksomhedListe = objectFactory.createRegistreringForholdBevillingHentOTypeVirksomhedListe();
		RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed virksomhed =  objectFactory.createRegistreringForholdBevillingHentOTypeVirksomhedListeVirksomhed();
		BevillingForholdListe bevillingForholdListe = objectFactory.createRegistreringForholdBevillingHentOTypeVirksomhedListeVirksomhedBevillingForholdListe();
		KontekstType kontekstType = objectFactory.createKontekstType();
    	
		EORIServiceDAO eoriService = new EORIServiceDAO();
    	EORIVirkWhitelist eoriVirkWhitelist = new EORIVirkWhitelist();
    	
    	for(Virksomhed seNummer : virksomheds) {
			log.info("---------- Given ES Number   --------------->  "+seNummer.getVirksomhedSENummer().toString());
			//eoriVirkWhitelist = eoriService.getEORINumber(seNummer.getVirksomhedSENummer().toString());
			eoriVirkWhitelist = eoriService.getEORINumberBasedOnPlightKod(seNummer.getVirksomhedSENummer().toString(),seNummer.getPligtKode());
			if(eoriVirkWhitelist.getEoriNumber().length() > 0) { 
				
				eoriVirkWhitelist.getVirk_start_dto();
		    	virksomhed.setVirksomhedSENummer(new BigInteger(eoriVirkWhitelist.getEoriNumber()));
		    	virksomhedListe.getVirksomhed().add(virksomhed);
		    	bevillingForholdListe.getBevillingForhold().add(BevillingForholdMapping.mapBevillingForhold(eoriVirkWhitelist));
		    	virksomhed.setBevillingForholdListe(bevillingForholdListe);
		    	registreringForholdBevillingHentO.setKontekst(kontekstType);
		    	registreringForholdBevillingHentO.setVirksomhedListe(virksomhedListe);
		    	
				addHovedOplysningerSvar(registreringForholdBevillingHentO, virksomhedListe);
				log.info("---------- ESRegistreringForholdBevillingStubService Called - ES Number Found - End   -------");
				
			}  else {
				Object outDoc = null;
				outDoc = RequestHelper.svarReaktionTemplate;
				RequestHelper.setOutputErrorDocument(outDoc);
				outDoc = RequestHelper.getOutputErrorDocument();
				addHovedOplysningerSvar1(registreringForholdBevillingHentO, outDoc,seNummer.getVirksomhedSENummer().toString());
			}
		}
		return registreringForholdBevillingHentO;
	}

	public dk.skat.begrebsmodel._2009._01._15.KompenserTransSvarType getKompenserTrans(dk.skat.begrebsmodel._2009._01._15.KompenserTransType request) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

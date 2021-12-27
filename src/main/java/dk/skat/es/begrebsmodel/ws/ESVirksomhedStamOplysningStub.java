package dk.skat.es.begrebsmodel.ws;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dk.skat.begrebsmodel._2008._01._01.KompenserTransSvarType;
import dk.skat.begrebsmodel._2008._01._01.KompenserTransType;
import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedKontaktOplysningStrukturType;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentI;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentO;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.PrimærAdresse;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentServicePortType;
import dk.skat.es.dao.EORIServiceDAO;
import dk.skat.es.dto.EORIVirkWhitelist;
import dk.skat.es.model.mapper.BeregnetRegnskabPeriodeMapping;
import dk.skat.es.model.mapper.DriftFormMapping;
import dk.skat.es.model.mapper.EmailAdresseListeMapping;
import dk.skat.es.model.mapper.FaxListeMapping;
import dk.skat.es.model.mapper.KontekstTypeMapping;
import dk.skat.es.model.mapper.MyndighedMapping;
import dk.skat.es.model.mapper.TelefonListeMapping;
import dk.skat.es.model.mapper.VirksomhedAdresseStrukturMapping;
import dk.skat.es.model.mapper.VirksomhedNavnMapping;
import dk.skat.es.util.AbstractServiceImpl;
import dk.skat.es.util.DateUtil;
import dk.skat.es.util.RequestHelper;

@WebService(targetNamespace="http://skat.dk/begrebsmodel/2008/01/01/",
            endpointInterface="dk.skat.begrebsmodel._2008._01._01.VirksomhedStamOplysningSamlingHentServicePortType")
public class ESVirksomhedStamOplysningStub extends AbstractServiceImpl implements VirksomhedStamOplysningSamlingHentServicePortType {
	
	private static final Log log = LogFactory.getLog(ESVirksomhedStamOplysningStub.class);
	protected static ObjectFactory objectFactory = new ObjectFactory();

	public VirksomhedStamOplysningSamlingHentO getVirksomhedStamOplysningSamlingHent(VirksomhedStamOplysningSamlingHentI request) {
		
		List<VirksomhedStamOplysning> virksomhedStamOplysningNumbers = request.getVirksomhedStamOplysningSamling().getVirksomhedStamOplysning();
	    log.info("---------- ESVirksomhedStamOplysningStubService Called - ES Number Found - Begin --------");
		VirksomhedStamOplysningSamlingHentO virksomhedStamOplysningSamlingHentO = objectFactory.createVirksomhedStamOplysningSamlingHentO();
    	EORIServiceDAO eoriService = new EORIServiceDAO();
    	EORIVirkWhitelist eoriVirkWhitelist = new EORIVirkWhitelist();
    	
		List<String> listOfNonWhiteListedCVRs = new ArrayList<String>();
		VirksomhedStamOplysningSamling virksomhedStamOplysningSamling = objectFactory.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamling();
		VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning  
		      virksomhedStamOplysning = objectFactory.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysning();

	    for(VirksomhedStamOplysning seNumber : virksomhedStamOplysningNumbers) {
			    log.info("---------- Given ES Number   --------------->"+seNumber.getVirksomhedSENummer().toString());
					eoriVirkWhitelist = eoriService.getEORINumber(seNumber.getVirksomhedSENummer().toString());
     		    log.info("---------- ESVirksomhedStamOplysningStubService Called - ES Number Found - End   --------");
				handleHovedOplysninger(request, virksomhedStamOplysningSamlingHentO);

			if(eoriVirkWhitelist.getEoriNumber().length() > 0) { 
			
				virksomhedStamOplysning.setVirksomhedSENummer(new BigInteger(eoriVirkWhitelist.getEoriNumber()));
				virksomhedStamOplysning.setVirksomhedCVRNummer(eoriVirkWhitelist.getCvrNumber());
				virksomhedStamOplysning.setVirksomhedStartDato(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_start_dto()));
				virksomhedStamOplysning.setVirksomhedNavn(VirksomhedNavnMapping.mapVirksomhedNavn(eoriVirkWhitelist));
				virksomhedStamOplysning.setDriftForm(DriftFormMapping.mapMyndighed());
				virksomhedStamOplysning.setFogedområdeNummer("21");
				virksomhedStamOplysning.setBeregnetRegnskabPeriode(BeregnetRegnskabPeriodeMapping.beregnetRegnskabPeriode());
				virksomhedStamOplysning.setMyndighed(MyndighedMapping.mapMyndighed());
				
				PrimærAdresse primærAdresse = objectFactory.createVirksomhedStamOplysningSamlingHentOTypeVirksomhedStamOplysningSamlingVirksomhedStamOplysningPrimærAdresse();
				VirksomhedKontaktOplysningStrukturType virksomhedKontaktOplysningStrukturType = objectFactory.createVirksomhedKontaktOplysningStrukturType();
				
				virksomhedKontaktOplysningStrukturType.setTelefonListe(TelefonListeMapping.mapTelefonAddress(eoriVirkWhitelist));
				virksomhedKontaktOplysningStrukturType.setEmailAdresseListe(EmailAdresseListeMapping.mapEmailAddress());
				virksomhedKontaktOplysningStrukturType.setFaxListe(FaxListeMapping.mapFaxListe());
				
				virksomhedStamOplysning.setPrimørAdresse(primærAdresse);
				virksomhedKontaktOplysningStrukturType.setVirksomhedAdresseStruktur(VirksomhedAdresseStrukturMapping.mapVirksomhedAdresseStruktur());
				primærAdresse.setVirksomhedKontaktOplysningStruktur(virksomhedKontaktOplysningStrukturType);
				virksomhedStamOplysningSamling.getVirksomhedStamOplysning().add(virksomhedStamOplysning);
				
				virksomhedStamOplysningSamlingHentO.setKontekst(KontekstTypeMapping.mapKontekstType());
				virksomhedStamOplysningSamlingHentO.setVirksomhedStamOplysningSamling(virksomhedStamOplysningSamling);	
				
				addHovedOplysningerSvar(virksomhedStamOplysningSamlingHentO, virksomhedStamOplysningSamling);

		    } 
			if (eoriVirkWhitelist.getEoriNumber().length() == 0) {
					log.info("################# ESVirksomhedStamOplysningStubService Called - ES Number NOT Found - Begin ######");
					log.info("********      Given EORI Number   ********--->" + seNumber.getVirksomhedSENummer().toString());
					listOfNonWhiteListedCVRs.add(seNumber.getVirksomhedSENummer().toString());
					log.info("############ ESVirksomhedStamOplysningStubService Called - ES Number NOT Found - End ############");
			}
	  	}
	    
	    if(listOfNonWhiteListedCVRs.size() > 0) {
			Object outDoc = null;
			outDoc = RequestHelper.svarReaktionTemplate;
			RequestHelper.setOutputErrorDocument(outDoc);
			outDoc = RequestHelper.getOutputErrorDocument();
			//virksomhedStamOplysningSamling.getVirksomhedStamOplysning().add(virksomhedStamOplysning);
			virksomhedStamOplysningSamlingHentO.setKontekst(KontekstTypeMapping.mapKontekstType());
			//virksomhedStamOplysningSamlingHentO.setVirksomhedStamOplysningSamling(virksomhedStamOplysningSamling);	
			for(int i=0 ; i<listOfNonWhiteListedCVRs.size() ; i++) {
				addHovedOplysningerSvarForholdBevilling(virksomhedStamOplysningSamlingHentO, outDoc, listOfNonWhiteListedCVRs.get(i),listOfNonWhiteListedCVRs);
			}
		}
	    return virksomhedStamOplysningSamlingHentO;
	}

	public KompenserTransSvarType getKompenserTrans(KompenserTransType request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

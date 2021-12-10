package dk.skat.es.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

//import com.logica.mansvc.model.DokumentHistorik;
import dk.skat.es.util.DocumentType;

/*
 * Class to keep data that is needed elsewhere in Manifest.
 */
public class RequestHelperInfo {
	
	 /** callerRolleKode is binary xy: x -> system user, y -> skat employee.
	 * 
	 * For example:
	 * "0" meaning "00" means not system user, and not skat employee
	 * "1" meaning "01" means not system user, but is skat employee
	 * "2" meaning "10" means is system user, but not skat employee
	 * "3" meaning "11" means is system user, and is skat employee */
	private String callerBrugerKode = null;
	private String callerRolleKode = null;
	private String hoTransactionId = "eori-1234567890";
	private String hoTransactionTid = null;
	private String commonName = null; // CommonName attribute from certificate
	private String source = null; // Portal/FTP-GW/External
	private String useCase = null;
	private String inputMessage = null;
	private Date inputMessageTimestamp = null;
	private String referenceIds = null; // one or more comma separated TD/MIG/MIO reference numbers
	private Boolean notifyScenario = false; // to indicate when operator TIN must be used in ENS history (usually caller TIN)
	private String notifyReceivers = null; // the notify receiver list 

	private DocumentType calloutRequestDocType = null;
	private DocumentType calloutResponseDocType = null;
	private String calloutReferenceIds = null; // which id or set of ids (comma separated) to log the callout with
	private Boolean logInput = false;
	private Boolean logOutput = false;
	private Boolean logNextCalloutRequest = false;
	private Boolean logNextCalloutResponse = false;
	private DocumentType inputDocType = null;
	private DocumentType outputDocType = null;
	private Object outputErrorDoc = null;

	// To handle situations where we need to log a callout response, but we don't
	// have any reference ids until we have parsed the response.
	private String lastCalloutResponse = null;

	//private ArrayList<DokumentHistorik> dokumentHistorik = new ArrayList<DokumentHistorik>();
    private HashMap<String, Object> ruleEngineVars = null;
	
    public void clear() {
        callerBrugerKode = null;
        callerRolleKode = null;
        hoTransactionId = null;
        hoTransactionTid = null;
        commonName = null; // CommonName attribute from certificate
        source = null; // Portal/FTP-GW/External
        useCase = null;
        inputMessage = null;
        inputMessageTimestamp = null;
        referenceIds = null; // one or more comma separated TD/MIG/MIO reference numbers
        notifyScenario = false; // to indicate when operator TIN must be used in ENS history (usually caller TIN)
        notifyReceivers = null; // the notify receiver list
        calloutReferenceIds = null;
        calloutRequestDocType = null;
        calloutResponseDocType = null;
        logInput = false;
        logOutput = false;
        logNextCalloutRequest = false;
        logNextCalloutResponse = false;
        inputDocType = null;
        outputDocType = null;
        outputErrorDoc = null;
        lastCalloutResponse = null;
        //if (dokumentHistorik != null) dokumentHistorik.clear();
        if (ruleEngineVars != null) ruleEngineVars.clear();
    }

    public HashMap<String, Object> getRuleEngineVars() {
        if (ruleEngineVars==null) ruleEngineVars = new HashMap<String, Object>();
        return ruleEngineVars;
    }

    public void setCallerBrugerKode(String callerBrugerKode) {
		this.callerBrugerKode = callerBrugerKode;
	}
	
	public String getCallerRolleKode() {
		return callerRolleKode;
	}
	
	public String getUseCase() {
		return useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	public void setCallerRolleKode(String callerRolleKode) {
		this.callerRolleKode = callerRolleKode;
	}
	
	public String getHoTransactionId() {
		return hoTransactionId;
	}
	
	public void setHoTransactionId(String hoTransactionId) {
		this.hoTransactionId = hoTransactionId;
	}
	
	public String getHoTransactionTid() {
		return hoTransactionTid;
	}
	
	public void setHoTransactionTid(String hoTransactionTid) {
		this.hoTransactionTid = hoTransactionTid;
	}
	
	public String getCommonName() {
		return commonName;
	}
	
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}

	/*public ArrayList<DokumentHistorik> getDokumentHistorik() {
		return dokumentHistorik;
	}
	
	public void addDokumentHistorik(DokumentHistorik dh)
	{
	    dokumentHistorik.add(dh);
	}*/

	public Boolean getLogInput() {
		return logInput;
	}

	public void setLogInput(Boolean logInput) {
		this.logInput = logInput;
	}

	public Boolean getLogOutput() {
		return logOutput;
	}

	public void setLogOutput(Boolean logOutput) {
		this.logOutput = logOutput;
	}

	public DocumentType getInputDocType() {
		return inputDocType;
	}

	public void setInputDocType(DocumentType inputDocType) {
		this.inputDocType = inputDocType;
	}

	public DocumentType getOutputDocType() {
		return outputDocType;
	}

	public void setOutputDocType(DocumentType outputDocType) {
		this.outputDocType = outputDocType;
	}
	
	public void setOutputErrorDocument(Object doc)
	{
	    this.outputErrorDoc = doc;
	}
	
	public Object getOutputErrorDocument()
	{
	    return this.outputErrorDoc;
	}

	public String getCalloutReferenceIds()
	{
	    return calloutReferenceIds;
	}
	
	public void setCalloutReferenceIds(String ids)
	{
	    calloutReferenceIds = ids;
	}
	
	public DocumentType getCalloutRequestDocType() {
		return calloutRequestDocType;
	}

	public void setCalloutRequestDocType(DocumentType calloutRequestDocType) {
		this.calloutRequestDocType = calloutRequestDocType;
	}

	public DocumentType getCalloutResponseDocType() {
		return calloutResponseDocType;
	}

	public void setCalloutResponseDocType(DocumentType calloutResponseDocType) {
		this.calloutResponseDocType = calloutResponseDocType;
	}

	public Boolean getLogNextCalloutRequest() {
		return logNextCalloutRequest;
	}

	public void setLogNextCalloutRequest(Boolean logNextCalloutRequest) {
		this.logNextCalloutRequest = logNextCalloutRequest;
	}

	public Boolean getLogNextCalloutResponse() {
		return logNextCalloutResponse;
	}

	public void setLogNextCalloutResponse(Boolean logNextCalloutResponse) {
		this.logNextCalloutResponse = logNextCalloutResponse;
	}

	public String getCallerBrugerKode() {
		return callerBrugerKode;
	}

	public String getInputMessage() {
		return inputMessage;
	}
	
	public void setInputMessage(String inputMessage) {
		this.inputMessage = inputMessage;
		this.inputMessageTimestamp = new Date();
	}
	
	public Date getInputMessageTimestamp() {
		return this.inputMessageTimestamp;
	}

	public Boolean getNotifyScenario() {
		return notifyScenario;
	}

	public void setNotifyScenario(Boolean notifyScenario) {
		this.notifyScenario = notifyScenario;
	}

    public String getNotifyScenarioReceivers() {
        return notifyReceivers;
    }

    public void setNotifyScenarioReceivers(String recs) {
        this.notifyReceivers = recs;
    }

	public String getReferenceIds() {
		return referenceIds;
	}
	
	public void setReferenceIds(String mrns) {
		this.referenceIds = mrns;
	}
	
	public void addReferenceId(String ref) {
		if (ref == null) return;
		if (this.referenceIds == null) this.referenceIds = "";
		if (referenceIds.indexOf(ref) != -1) return;
		this.referenceIds += ref + ",";
	}

	public String getLastCalloutResponse() {
		return lastCalloutResponse;
	}

	public void setLastCalloutResponse(String lastCalloutResponse) {
		this.lastCalloutResponse = lastCalloutResponse;
	}
	
	public String toString()
	{
	    return "Request[trk:" + hoTransactionId + 
	            ", logInp: " + logInput + 
	            ", logOut: " + logOutput + 
	            ", logNextReq: " + logNextCalloutRequest +  
                ", logNextRes: " + logNextCalloutResponse +
                ", refs: " + referenceIds +
                ", inpDoc: " + inputDocType +
                ", outDoc: " + outputDocType + "]";
	}
}

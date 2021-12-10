package dk.skat.es.dto;

import java.util.Date;

public class EORIVirkWhitelist {

	private String eoriNumber = "";

	private String Firma_nvn;

	private String Firma_nvn_kort;

	private String postNumber;

	private String by_nvn;

	private String adresseNavn;

	private String tlf_nr;

	private Date virk_adr_tlf_nr_start_dto;

	private Date virk_adr_tlf_nr_slut_dto;

	private String cvrNumber;

	private Date virk_start_dto;
	
	private String start_hus_nr;

	//private int virk_adr_lb_nr;
	
	private String virk_adr_lb_nr;
	
	private String vej_nvn;

	

	
	/*public int getVirk_adr_lb_nr() {
		return virk_adr_lb_nr;
	}

	public void setVirk_adr_lb_nr(int virk_adr_lb_nr) {
		this.virk_adr_lb_nr = virk_adr_lb_nr;
	}*/

	public String getVej_nvn() {
		return vej_nvn;
	}

	public void setVej_nvn(String vej_nvn) {
		this.vej_nvn = vej_nvn;
	}

	public String getVirk_adr_lb_nr() {
		return virk_adr_lb_nr;
	}

	public void setVirk_adr_lb_nr(String virk_adr_lb_nr) {
		this.virk_adr_lb_nr = virk_adr_lb_nr;
	}

	public String getStart_hus_nr() {
		return start_hus_nr;
	}

	public void setStart_hus_nr(String start_hus_nr) {
		this.start_hus_nr = start_hus_nr;
	}

	private Date bev_forh_start_dto;
	
	public Date getBev_forh_start_dto() {
		return bev_forh_start_dto;
	}

	public void setBev_forh_start_dto(Date bev_forh_start_dto) {
		this.bev_forh_start_dto = bev_forh_start_dto;
	}

	public String getPligt_kod() {
		return pligt_kod;
	}

	public void setPligt_kod(String pligt_kod) {
		this.pligt_kod = pligt_kod;
	}

	public String getBev_journal_nr() {
		return bev_journal_nr;
	}

	public void setBev_journal_nr(String bev_journal_nr) {
		this.bev_journal_nr = bev_journal_nr;
	}

	public String getBev_kod() {
		return bev_kod;
	}

	public void setBev_kod(String bev_kod) {
		this.bev_kod = bev_kod;
	}

	private String pligt_kod;
	private String bev_journal_nr;
	private String bev_kod; 

	public Date getVirk_adr_tlf_nr_slut_dto() {
		return virk_adr_tlf_nr_slut_dto;
	}

	public void setVirk_adr_tlf_nr_slut_dto(Date virk_adr_tlf_nr_slut_dto) {
		this.virk_adr_tlf_nr_slut_dto = virk_adr_tlf_nr_slut_dto;
	}

	public String getCvrNumber() {
		return cvrNumber;
	}

	public void setCvrNumber(String cvrNumber) {
		this.cvrNumber = cvrNumber;
	}

	public Date getVirk_start_dto() {
		return virk_start_dto;
	}

	public void setVirk_start_dto(Date virk_start_dto) {
		this.virk_start_dto = virk_start_dto;
	}

	public String getTlf_nr() {
		return tlf_nr;
	}

	public void setTlf_nr(String tlf_nr) {
		this.tlf_nr = tlf_nr;
	}

	public Date getVirk_adr_tlf_nr_start_dto() {
		return virk_adr_tlf_nr_start_dto;
	}

	public void setVirk_adr_tlf_nr_start_dto(Date virk_adr_tlf_nr_start_dto) {
		this.virk_adr_tlf_nr_start_dto = virk_adr_tlf_nr_start_dto;
	}

	public String getAdresseNavn() {
		return adresseNavn;
	}

	public void setAdresseNavn(String adresseNavn) {
		this.adresseNavn = adresseNavn;
	}

	public String getBy_nvn() {
		return by_nvn;
	}

	public void setBy_nvn(String by_nvn) {
		this.by_nvn = by_nvn;
	}

	public String getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}

	public String getFirma_nvn() {
		return Firma_nvn;
	}

	public void setFirma_nvn(String firma_nvn) {
		Firma_nvn = firma_nvn;
	}

	public String getFirma_nvn_kort() {
		return Firma_nvn_kort;
	}

	public void setFirma_nvn_kort(String firma_nvn_kort) {
		Firma_nvn_kort = firma_nvn_kort;
	}

	public void setEoriNumber(String eoriNumber) {
		this.eoriNumber = eoriNumber;
	}

	public String getEoriNumber() {
		return eoriNumber;
	}

}

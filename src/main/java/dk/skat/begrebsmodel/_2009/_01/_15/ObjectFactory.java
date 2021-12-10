
package dk.skat.begrebsmodel._2009._01._15;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.skat.begrebsmodel._2009._01._15 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegistreringForholdStartDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "RegistreringForholdStartDato");
    private final static QName _BevillingTypeTekst_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "BevillingTypeTekst");
    private final static QName _BevillingForholdJournalNummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "BevillingForholdJournalNummer");
    private final static QName _RegistreringForholdBevillingHentFejlId_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "RegistreringForholdBevillingHent_FejlId");
    private final static QName _OplysningForholdVirksomhedTypeKode_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "OplysningForholdVirksomhedTypeKode");
    private final static QName _KompenserTrans_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "KompenserTrans");
    private final static QName _OplysningForholdGyldigFra_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "OplysningForholdGyldigFra");
    private final static QName _Kontekst_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "Kontekst");
    private final static QName _PligtBeskrivelse_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "PligtBeskrivelse");
    private final static QName _OplysningForholdKode_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "OplysningForholdKode");
    private final static QName _KompenserTransSvar_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "KompenserTransSvar");
    private final static QName _VirksomhedCVRNummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedCVRNummer");
    private final static QName _ForretningOmrødeForholdGyldigFra_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ForretningOmrødeForholdGyldigFra");
    private final static QName _VirksomhedOphørDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedOphørDato");
    private final static QName _BevillingTypeKode_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "BevillingTypeKode");
    private final static QName _ForretningOmrødeForholdGyldigTil_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ForretningOmrødeForholdGyldigTil");
    private final static QName _OplysningForholdGyldigTil_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "OplysningForholdGyldigTil");
    private final static QName _VirksomhedSENummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedSENummer");
    private final static QName _PligtGyldigFra_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "PligtGyldigFra");
    private final static QName _PligtTekst_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "PligtTekst");
    private final static QName _PligtGyldigTil_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "PligtGyldigTil");
    private final static QName _VirksomhedStartDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedStartDato");
    private final static QName _RegistreringForholdBevillingHentInterface_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "RegistreringForholdBevillingHentInterface");
    private final static QName _OplysningForholdAnsatør_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "OplysningForholdAnsatør");
    private final static QName _OplysningForholdAntalAnsatte_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "OplysningForholdAntalAnsatte");
    private final static QName _BevillingForholdGyldigTil_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "BevillingForholdGyldigTil");
    private final static QName _BevillingForholdGyldigFra_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "BevillingForholdGyldigFra");
    private final static QName _ForretningOmrødeForholdKode_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ForretningOmrødeForholdKode");
    private final static QName _BevillingForholdKode_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "BevillingForholdKode");
    private final static QName _RegistreringForholdSlutDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "RegistreringForholdSlutDato");
    private final static QName _PligtKode_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "PligtKode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.skat.begrebsmodel._2009._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentIType }
     * 
     */
    public RegistreringForholdBevillingHentIType createRegistreringForholdBevillingHentIType() {
        return new RegistreringForholdBevillingHentIType();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentOType }
     * 
     */
    public RegistreringForholdBevillingHentOType createRegistreringForholdBevillingHentOType() {
        return new RegistreringForholdBevillingHentOType();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentOType.VirksomhedListe }
     * 
     */
    public RegistreringForholdBevillingHentOType.VirksomhedListe createRegistreringForholdBevillingHentOTypeVirksomhedListe() {
        return new RegistreringForholdBevillingHentOType.VirksomhedListe();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed }
     * 
     */
    public RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed createRegistreringForholdBevillingHentOTypeVirksomhedListeVirksomhed() {
        return new RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe }
     * 
     */
    public RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe createRegistreringForholdBevillingHentOTypeVirksomhedListeVirksomhedBevillingForholdListe() {
        return new RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentIType.Søgekriterier }
     * 
     */
    public RegistreringForholdBevillingHentIType.Søgekriterier createRegistreringForholdBevillingHentITypeSøgekriterier() {
        return new RegistreringForholdBevillingHentIType.Søgekriterier();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentIType.S�gekriterier.VirksomhedListe }
     * 
     */
    public RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe createRegistreringForholdBevillingHentITypeSøgekriterierVirksomhedListe() {
        return new RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe();
    }

    /**
     * Create an instance of {@link KontekstType }
     * 
     */
    public KontekstType createKontekstType() {
        return new KontekstType();
    }

    /**
     * Create an instance of {@link KompenserTransSvarType }
     * 
     */
    public KompenserTransSvarType createKompenserTransSvarType() {
        return new KompenserTransSvarType();
    }

    /**
     * Create an instance of {@link KompenserTransType }
     * 
     */
    public KompenserTransType createKompenserTransType() {
        return new KompenserTransType();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentFejlIdType }
     * 
     */
    public RegistreringForholdBevillingHentFejlIdType createRegistreringForholdBevillingHentFejlIdType() {
        return new RegistreringForholdBevillingHentFejlIdType();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentI }
     * 
     */
    public RegistreringForholdBevillingHentI createRegistreringForholdBevillingHentI() {
        return new RegistreringForholdBevillingHentI();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentInterfaceType }
     * 
     */
    public RegistreringForholdBevillingHentInterfaceType createRegistreringForholdBevillingHentInterfaceType() {
        return new RegistreringForholdBevillingHentInterfaceType();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentO }
     * 
     */
    public RegistreringForholdBevillingHentO createRegistreringForholdBevillingHentO() {
        return new RegistreringForholdBevillingHentO();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold }
     * 
     */
    public RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold createRegistreringForholdBevillingHentOTypeVirksomhedListeVirksomhedBevillingForholdListeBevillingForhold() {
        return new RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold();
    }

    /**
     * Create an instance of {@link RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed }
     * 
     */
    public RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed createRegistreringForholdBevillingHentITypeSøgekriterierVirksomhedListeVirksomhed() {
        return new RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "RegistreringForholdStartDato")
    public JAXBElement<XMLGregorianCalendar> createRegistreringForholdStartDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringForholdStartDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "BevillingTypeTekst")
    public JAXBElement<String> createBevillingTypeTekst(String value) {
        return new JAXBElement<String>(_BevillingTypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "BevillingForholdJournalNummer")
    public JAXBElement<String> createBevillingForholdJournalNummer(String value) {
        return new JAXBElement<String>(_BevillingForholdJournalNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringForholdBevillingHentFejlIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "RegistreringForholdBevillingHent_FejlId")
    public JAXBElement<RegistreringForholdBevillingHentFejlIdType> createRegistreringForholdBevillingHentFejlId(RegistreringForholdBevillingHentFejlIdType value) {
        return new JAXBElement<RegistreringForholdBevillingHentFejlIdType>(_RegistreringForholdBevillingHentFejlId_QNAME, RegistreringForholdBevillingHentFejlIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "OplysningForholdVirksomhedTypeKode")
    public JAXBElement<BigInteger> createOplysningForholdVirksomhedTypeKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_OplysningForholdVirksomhedTypeKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KompenserTransType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "KompenserTrans")
    public JAXBElement<KompenserTransType> createKompenserTrans(KompenserTransType value) {
        return new JAXBElement<KompenserTransType>(_KompenserTrans_QNAME, KompenserTransType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "OplysningForholdGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createOplysningForholdGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OplysningForholdGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontekstType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "Kontekst")
    public JAXBElement<KontekstType> createKontekst(KontekstType value) {
        return new JAXBElement<KontekstType>(_Kontekst_QNAME, KontekstType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "PligtBeskrivelse")
    public JAXBElement<String> createPligtBeskrivelse(String value) {
        return new JAXBElement<String>(_PligtBeskrivelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "OplysningForholdKode")
    public JAXBElement<BigInteger> createOplysningForholdKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_OplysningForholdKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KompenserTransSvarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "KompenserTransSvar")
    public JAXBElement<KompenserTransSvarType> createKompenserTransSvar(KompenserTransSvarType value) {
        return new JAXBElement<KompenserTransSvarType>(_KompenserTransSvar_QNAME, KompenserTransSvarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedCVRNummer")
    public JAXBElement<String> createVirksomhedCVRNummer(String value) {
        return new JAXBElement<String>(_VirksomhedCVRNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ForretningOmrødeForholdGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createForretningOmrødeForholdGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForretningOmrødeForholdGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedOph\u00f8rDato")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedOphørDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedOphørDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "BevillingTypeKode")
    public JAXBElement<BigInteger> createBevillingTypeKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_BevillingTypeKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ForretningOmr\u00e5deForholdGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createForretningOmrødeForholdGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForretningOmrødeForholdGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "OplysningForholdGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createOplysningForholdGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OplysningForholdGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedSENummer")
    public JAXBElement<BigInteger> createVirksomhedSENummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_VirksomhedSENummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "PligtGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createPligtGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PligtGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "PligtTekst")
    public JAXBElement<String> createPligtTekst(String value) {
        return new JAXBElement<String>(_PligtTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "PligtGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createPligtGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PligtGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedStartDato")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedStartDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedStartDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringForholdBevillingHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "RegistreringForholdBevillingHentInterface")
    public JAXBElement<RegistreringForholdBevillingHentInterfaceType> createRegistreringForholdBevillingHentInterface(RegistreringForholdBevillingHentInterfaceType value) {
        return new JAXBElement<RegistreringForholdBevillingHentInterfaceType>(_RegistreringForholdBevillingHentInterface_QNAME, RegistreringForholdBevillingHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "OplysningForholdAnsat\u00c5r")
    public JAXBElement<BigInteger> createOplysningForholdAnsatør(BigInteger value) {
        return new JAXBElement<BigInteger>(_OplysningForholdAnsatør_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "OplysningForholdAntalAnsatte")
    public JAXBElement<Long> createOplysningForholdAntalAnsatte(Long value) {
        return new JAXBElement<Long>(_OplysningForholdAntalAnsatte_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "BevillingForholdGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createBevillingForholdGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BevillingForholdGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "BevillingForholdGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createBevillingForholdGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BevillingForholdGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ForretningOmr\u00e5deForholdKode")
    public JAXBElement<BigInteger> createForretningOmrødeForholdKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_ForretningOmrødeForholdKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "BevillingForholdKode")
    public JAXBElement<BigInteger> createBevillingForholdKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_BevillingForholdKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "RegistreringForholdSlutDato")
    public JAXBElement<XMLGregorianCalendar> createRegistreringForholdSlutDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringForholdSlutDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "PligtKode")
    public JAXBElement<String> createPligtKode(String value) {
        return new JAXBElement<String>(_PligtKode_QNAME, String.class, null, value);
    }

}

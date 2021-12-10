package dk.skat.es.model.mapper;

import java.math.BigInteger;

import dk.skat.begrebsmodel._2008._01._01.ObjectFactory;
import dk.skat.begrebsmodel._2008._01._01.VirksomhedAdresseStrukturType;

public class VirksomhedAdresseStrukturMapping {

	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static VirksomhedAdresseStrukturType mapVirksomhedAdresseStruktur() {

		VirksomhedAdresseStrukturType virksomhedAdresseStrukturType = objectFactory.createVirksomhedAdresseStrukturType();

		virksomhedAdresseStrukturType.setVirksomhedAdresseTypeKode(new BigInteger("1"));
		virksomhedAdresseStrukturType.setAdresseTypeKode(new BigInteger("1"));

		virksomhedAdresseStrukturType.setAdresseValg(AdresseValgMapping.mapAddress());
		return virksomhedAdresseStrukturType;

	}

}

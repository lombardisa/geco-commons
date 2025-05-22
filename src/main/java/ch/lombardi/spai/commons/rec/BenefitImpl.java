package ch.lombardi.spai.commons.rec;

import java.util.Arrays;
import java.util.Objects;

/**
 * Java Class: BenefitImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class BenefitImpl implements Benefit {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 565083839508288574L;

	// VARIABLES
	private Integer annuncioId;
	private String desc;
	private byte[] icona;
	private String iconaCodice;

	/**
	 * Default empty constructor.
	 */
	public BenefitImpl() {
		super();
	}

	/**
	 * Costructor of the benefits of an annuncio.
	 * 
	 * @param annuncioId:  the ID_ANNUNCIO.
	 * @param desc:        the DESCRIZIONE.
	 * @param icona:       the ICONA.
	 * @param iconaCodice: the ICONA_CODICE.
	 */
	public BenefitImpl(Integer annuncioId, String desc, byte[] icona, String iconaCodice) {
		super();
		this.annuncioId = annuncioId;
		this.desc = desc;
		this.icona = icona;
		this.iconaCodice = iconaCodice;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Gets the ICONA.
	 */
	public byte[] getIcona() {
		return icona;
	}

	/**
	 * Gets the ICONA_CODICE.
	 */
	public String getIconaCodice() {
		return iconaCodice;
	}

	/**
	 * Sets the ID_ANNUNCIO.
	 * 
	 * @param annuncioId: the ID_ANNUNCIO.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param desc: the DESCRIZIONE.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Sets the ICONA.
	 * 
	 * @param icona: the ICONA.
	 */
	public void setIcona(byte[] icona) {
		this.icona = icona;
	}

	/**
	 * Sets the ICONA_CODICE.
	 * 
	 * @param iconaCodice: the ICONA_CODICE.
	 */
	public void setIconaCodice(String iconaCodice) {
		this.iconaCodice = iconaCodice;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(icona);
		result = prime * result + Objects.hash(annuncioId, desc, iconaCodice);
		return result;
	}

	/**
	 * Compares the IDs to see if the values are exactly the same Object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenefitImpl other = (BenefitImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Arrays.equals(icona, other.icona) && Objects.equals(iconaCodice, other.iconaCodice);
	}
}
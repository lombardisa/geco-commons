package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: BenefitCategoriaImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class BenefitCategoriaImpl implements BenefitCategoria {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 5341574465827396540L;

	// VARIABLES
	private String chiaveId;
	private String testo;

	/**
	 * Default empty constructor.
	 */
	public BenefitCategoriaImpl() {
		super();
	}

	/**
	 * Costructor of the benefits showed on the website.
	 * 
	 * @param chiaveId: the ID_CHIAVE.
	 * @param testo:    the TESTO.
	 */
	public BenefitCategoriaImpl(String chiaveId, String testo) {
		super();
		this.chiaveId = chiaveId;
		this.testo = testo;
	}

	/**
	 * Gets the ID_CHIAVE.
	 */
	public String getChiaveId() {
		return chiaveId;
	}

	/**
	 * Gets the TESTO.
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * Sets the ID_CHIAVE.
	 * 
	 * @param chiaveId: Sets the ID_CHIAVE.
	 */
	public void setChiaveId(String chiaveId) {
		this.chiaveId = chiaveId;
	}

	/**
	 * Sets the TESTO.
	 * 
	 * @param testo: the TESTO.
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(chiaveId, testo);
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
		BenefitCategoriaImpl other = (BenefitCategoriaImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}
}
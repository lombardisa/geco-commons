package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: LinguaContactImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class LinguaContactImpl implements LinguaContact {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -201589270036292791L;

	// VARIABLES
	private String chiaveId;
	private String testo;

	/**
	 * Default empty constructor.
	 */
	public LinguaContactImpl() {
		super();
	}

	/**
	 * Costructor of the lingue asked to the candidates.
	 * 
	 * @param linguaId: the ID_LINGUA.
	 * @param desc:     the DESCRIZIONE of the ID_LINGUA.
	 */
	public LinguaContactImpl(String chiaveId, String testo) {
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
	 * @param chiaveId: the ID_CHIAVE.
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

	@Override
	public int hashCode() {
		return Objects.hash(chiaveId, testo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguaContactImpl other = (LinguaContactImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}
}
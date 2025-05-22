package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: FaqDomandaImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class FaqDomandaImpl implements FaqDomanda {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -2664975307331891009L;

	// VARIABLES
	private String faqDomandaId;
	private String domanda;

	/**
	 * Default empty constructor.
	 */
	public FaqDomandaImpl() {
		super();
	}

	/**
	 * Costructor of the faq showed on the website.
	 * 
	 * @param faqId:   the ID_FAQ.
	 * @param domanda: the DOMANDA.
	 */
	public FaqDomandaImpl(String faqDomandaId, String domanda) {
		super();
		this.faqDomandaId = faqDomandaId;
		this.domanda = domanda;
	}

	/**
	 * Gets the ID_FAQ.
	 */
	public String getFaqId() {
		return faqDomandaId;
	}

	/**
	 * Gets the DOMANDA.
	 */
	public String getDomanda() {
		return domanda;
	}

	/**
	 * Sets the ID_FAQ.
	 * 
	 * @param faqId: the ID_FAQ.
	 */
	public void setFaqId(String faqDomandaId) {
		this.faqDomandaId = faqDomandaId;
	}

	/**
	 * Sets the DOMANDA.
	 * 
	 * @param domanda: the DOMANDA.
	 */
	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(domanda, faqDomandaId);
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
		FaqDomandaImpl other = (FaqDomandaImpl) obj;
		return Objects.equals(domanda, other.domanda) && Objects.equals(faqDomandaId, other.faqDomandaId);
	}
}
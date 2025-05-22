package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: FaqDomanda.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = FaqDomanda.class)
public interface FaqDomanda extends Serializable {

	/**
	 * Returns the ID_FAQ.
	 * 
	 * @return the ID_FAQ.
	 */
	String getFaqId();

	/**
	 * Returns the DOMANDA of the FAQ.
	 * 
	 * @return the DOMANDA.
	 */
	String getDomanda();
}
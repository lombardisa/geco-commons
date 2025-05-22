package ch.lombardi.spai.commons.gen;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ch.lombardi.spai.commons.rec.LinguaImpl;

/**
 * Java Interface: Lingua.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = LinguaImpl.class)
public interface GenLingua {

	/**
	 * Returns the ID_CHIAVE.
	 * 
	 * @return: the ID_CHIAVE.
	 */
	String getChiaveId();

	/**
	 * Returns the TESTO of the ID_CHIAVE.
	 * 
	 * @return: the TESTO of the ID_CHIAVE.
	 */
	String getTesto();
}
package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Benefit.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = BenefitImpl.class)
public interface Benefit extends Serializable {

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the DESCRIZIONE of the ID_BENEFIT.
	 * 
	 * @return: the DESCRIZIONE of the ID_BENEFIT.
	 */
	String getDesc();

	/**
	 * Returns the ICONA of the ID_BENEFIT.
	 * 
	 * @return the ICONA of the ID_BENEFIT.
	 */
	byte[] getIcona();

	/**
	 * Returns the ICONA_CODICE of the ID_BENEFIT.
	 * 
	 * @return: the ICONA_CODICE of the ID_BENEFIT.
	 */
	String getIconaCodice();
}
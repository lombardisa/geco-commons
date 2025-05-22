package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: AnnuncioTitles.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = AnnuncioTitlesImpl.class)
public interface AnnuncioTitles extends Serializable {

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the TITOLO of the annuncio.
	 * 
	 * @return: the TITOLO of the annuncio.
	 */
	String getTitolo();
}
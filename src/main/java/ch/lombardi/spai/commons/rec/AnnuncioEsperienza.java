package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: AnnuncioEsperienza.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = AnnuncioEsperienzaImpl.class)
public interface AnnuncioEsperienza extends Serializable {

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_ESPERIENZA.
	 * 
	 * @return: the ID_ESPERIENZA.
	 */
	Integer getEsperienzaId();

	/**
	 * Returns the ORDINAMENTO.
	 * 
	 * @return: the ORDINAMENTO.
	 */
	Integer getOrdinamento();

	/**
	 * Returns the DESCRIZIONE of the ID_ESPERIENZA.
	 * 
	 * @return: the DESCRIZIONE of the ID_ESPERIENZA.
	 */
	String getDesc();
}
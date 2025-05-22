package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: AnnuncioOfferta.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = AnnuncioOffertaImpl.class)
public interface AnnuncioOfferta extends Serializable {

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_OFFERTA.
	 * 
	 * @return: the ID_OFFERTA.
	 */
	Integer getOffertaId();

	/**
	 * Returns the ORDINAMENTO.
	 * 
	 * @return: the ORDINAMENTO.
	 */
	Integer getOrdinamento();

	/**
	 * Returns the DESCRIZIONE of the ID_OFFERTA.
	 * 
	 * @return: the DESCRIZIONE of the ID_OFFERTA.
	 */
	String getDesc();
}
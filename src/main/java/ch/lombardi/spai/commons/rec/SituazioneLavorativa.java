package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: SituazioneLavorativa.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = SituazioneLavorativaImpl.class)
public interface SituazioneLavorativa extends Serializable {

	/**
	 * Returns the ID_CHIAVE.
	 * 
	 * @return: the ID_CHIAVE.
	 */
	String getChiaveId();

	/**
	 * Returns the TESTO.
	 * 
	 * @return: the TESTO.
	 */
	String getTesto();
}
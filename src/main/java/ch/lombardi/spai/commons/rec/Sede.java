package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Sede.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = SedeImpl.class)
public interface Sede extends Serializable {

	/**
	 * Returns the ID_SEDE.
	 * 
	 * @return the ID_SEDE.
	 */
	Integer getSedeId();

	/**
	 * Returns the ID_SOCIETA.
	 * 
	 * @return the ID_SOCIETA.
	 */
	Integer getSocietaId();

	/**
	 * Returns the DESCRIZIONE.
	 * 
	 * @return the DESCRIZIONE.
	 */
	String getDescSede();

	/**
	 * Returns the NOME_INDIRIZZO.
	 * 
	 * @return the NOME_INDIRIZZO.
	 */
	String getNomeIndirizzo();

	/**
	 * Returns the INDIRIZZO.
	 * 
	 * @return the INDIRIZZO.
	 */
	String getIndirizzo();

	/**
	 * Returns the LOCALITA.
	 * 
	 * @return the LOCALITA.
	 */
	String getLocalita();

	/**
	 * Returns the DATA_CHIUSURA.
	 * 
	 * @return the DATA_CHIUSURA.
	 */
	LocalDate getDataChiusura();

	/**
	 * Returns the NAP.
	 * 
	 * @return the NAP.
	 */
	String getNap();

	/**
	 * Returns the TELEFONO.
	 * 
	 * @return the TELEFONO.
	 */
	String getNoTelefono();

	/**
	 * Returns the E_MAIL.
	 * 
	 * @return the E_MAIL.
	 */
	String geteMail();

	/**
	 * Returns the TIME_ZONE.
	 * 
	 * @return the TIME_ZONE.
	 */
	String getTimeZone();

	/**
	 * Returns the DESCRIZIONE_ESTESA.
	 * 
	 * @return the DESCRIZIONE_ESTESA.
	 */
	String getDescEstesa();

	/**
	 * Returns the E_MAIL_HR.
	 * 
	 * @return the E_MAIL_HR.
	 */
	String geteMailHr();

	/**
	 * Returns the ID_NAZIONE.
	 * 
	 * @return the ID_NAZIONE.
	 */
	Integer getNazioneId();

	/**
	 * Returns the NAZIONE.
	 * 
	 * @return the NAZIONE.
	 */
	String getNazione();
}
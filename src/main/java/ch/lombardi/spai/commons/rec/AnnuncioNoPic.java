package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: AnnuncioNoPic.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = AnnuncioNoPicImpl.class)
public interface AnnuncioNoPic extends Serializable {

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_REF_PRINC of the annuncio.
	 * 
	 * @return the ID_REF_PRINC of the annuncio.
	 */
	Integer getRefPrincId();

	/**
	 * Returns the DATI_COMPLETI of the annuncio.
	 * 
	 * @return the DATI_COMPLETI of the annuncio.
	 */
	String getDatiCompleti();

	/**
	 * Returns the first name of the ID_REF_PRINC of the annuncio.
	 * 
	 * @return the first name of the ID_REF_PRINC of the annuncio.
	 */
	String getNomeRefPrinc();

	/**
	 * Returns the last name of the ID_REF_PRINC of the annuncio.
	 * 
	 * @return the last name of the ID_REF_PRINC of the annuncio.
	 */
	String getCognomeRefPrinc();

	/**
	 * Returns the ID_SEDE of the annuncio.
	 * 
	 * @return the ID_SEDE of the annuncio.
	 */
	Integer getSedeId();

	/**
	 * Returns the DESCRIZIONE of the sede.
	 * 
	 * @return the DESCRIZIONE of the sede.
	 */
	String getDescSede();

	/**
	 * Returns the NOME_INDIRIZZO of the sede.
	 * 
	 * @return the NOME_INDIRIZZO of the sede.
	 */
	String getNomeIndirizzo();

	/**
	 * Returns the DESC_INDIRIZZO of the sede.
	 * 
	 * @return the DESC_INDIRIZZO of the sede.
	 */
	String getDescIndirizzo();

	/**
	 * Returns the INDIRIZZO of the sede.
	 * 
	 * @return the INDIRIZZO of the sede.
	 */
	String getIndirizzo();

	/**
	 * Returns the CASELLA_POSTALE of the sede.
	 * 
	 * @return the CASELLA_POSTALE of the sede.
	 */
	String getCasellaPostale();

	/**
	 * Returns the NAP of the sede.
	 * 
	 * @return the NAP of the sede.
	 */
	String getNap();

	/**
	 * Returns the LOCALITA of the sede.
	 * 
	 * @return the LOCALITA of the sede.
	 */
	String getLocalita();

	/**
	 * Returns the ID_NAZIONE of the sede.
	 * 
	 * @return the ID_NAZIONE of the sede.
	 */
	Integer getNazioneId();

	/**
	 * Returns the DESCRIZIONE of the nazione.
	 * 
	 * @return the DESCRIZIONE of the nazione.
	 */
	String getDescNazione();

	/**
	 * Returns the NO_TELEFONO of the sede.
	 * 
	 * @return the NO_TELEFONO of the sede.
	 */
	String getNoTelefono();

	/**
	 * Returns the E_MAIL_HR of the sede.
	 * 
	 * @return the E_MAIL_HR of the sede.
	 */
	String getEmailHr();

	/**
	 * Returns the PAGINA_INTERNET of the sede.
	 * 
	 * @return the PAGINA_INTERNET of the sede.
	 */
	String getPaginaInternet();

	/**
	 * Returns the PAGINA_LINKEDIN of the sede.
	 * 
	 * @return PAGINA_LINKEDIN of the sede.
	 */
	String getPaginaLinkedin();

	/**
	 * Returns the ID_SEZIONE of the annuncio.
	 * 
	 * @return: the ID_SEZIONE of the annuncio.
	 */
	Integer getSezioneId();

	/**
	 * Returns the ID_AREA of the annuncio.
	 * 
	 * @return: the ID_AREA of the annuncio.
	 */
	Integer getAreaId();

	/**
	 * Returns the DESCRIZIONE of the ID_AREA of the annuncio.
	 * 
	 * @return the DESCRIZIONE of the ID_AREA of the annuncio.
	 */
	String getDescArea();

	/**
	 * Returns the DESCRIZIONE_BREVE of the ID_AREA of the annuncio.
	 * 
	 * @return the DESCRIZIONE_BREVE of the ID_AREA of the annuncio.
	 */
	String getDescAreaBreve();

	/**
	 * Returns the ID_REF_SECOND of the annuncio.
	 * 
	 * @return: the ID_REF_SECOND of the annuncio.
	 */
	Integer getRefSecondId();

	/**
	 * Returns the first name of the ID_REF_SECOND of the annuncio.
	 * 
	 * @return the first name of the ID_REF_SECOND of the annuncio.
	 */
	String getNomeRefSecond();

	/**
	 * Returns the last name of the ID_REF_SECOND of the annuncio.
	 * 
	 * @return the last name of the ID_REF_SECOND of the annuncio.
	 */
	String getCognomeRefSecond();

	/**
	 * Returns the TITOLO of the annuncio.
	 * 
	 * @return: the TITOLO of the annuncio.
	 */
	String getTitolo();

	/**
	 * Returns the DESCRIZIONE of the annuncio.
	 * 
	 * @return: the DESCRIZIONE of the annuncio.
	 */
	String getDescrizione();

	/**
	 * Returns the possibility of home office of the annuncio.
	 * 
	 * @return: the possibility of home office of the annuncio.
	 */
	String getHomeOffice();

	/**
	 * Returns the minimum percentage of occupancy of the annuncio.
	 * 
	 * @return the minimum percentage of occupancy of the annuncio.
	 */
	BigDecimal getOccupMin();

	/**
	 * Returns the maximum percentage of occupancy of the annuncio.
	 * 
	 * @return the maximum percentage of occupancy of the annuncio.
	 */
	BigDecimal getOccupMax();

	/**
	 * Returns the date of publication of the annuncio.
	 * 
	 * @return the date of publication of the annuncio.
	 */
	LocalDate getInizio();

	/**
	 * Returns the date of removal of the annuncio.
	 * 
	 * @return the date of removal of the annuncio.
	 */
	LocalDate getFine();

	/*
	 * Returns the contract start date of the annuncio.
	 * 
	 * @return: the contract start date of the annuncio.
	 */
	LocalDate getDataInizioContratto();

	/*
	 * Returns the contract duration of the annuncio.
	 * 
	 * @return: the contract duration of the annuncio.
	 */
	Integer getDurataContratto();

	/*
	 * Returns the unit of measurement of the annuncio's contract duration.
	 * 
	 * @return: the unit of measurement of the annuncio's contract duration.
	 */
	Integer getUnitaDurataContratto();
}
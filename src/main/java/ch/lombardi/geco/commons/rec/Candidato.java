package ch.lombardi.geco.commons.rec;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Candidato.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = CandidatoImpl.class)
public interface Candidato extends Serializable {

	/**
	 * Returns the ID_CANDIDATO.
	 * 
	 * @return the ID_CANDIDATO.
	 */
	Integer getCandidatoId();

	/**
	 * Returns the ID_SESSO.
	 * 
	 * @return the ID_SESSO.
	 */
	Integer getSessoId();

	/**
	 * Returns the ID_SONDAGGIO.
	 * 
	 * @return the ID_SONDAGGIO.
	 */
	Integer getSondaggioId();

	/**
	 * Returns the ID_LINK.
	 * 
	 * @return the ID_LINK.
	 */
	Integer getLinkId();

	/**
	 * Returns the LINK.
	 * 
	 * @return the LINK.
	 */
	String[] getLink();

	/**
	 * Returns the ID_CANDIDATO_LINGUA.
	 * 
	 * @return the ID_CANDIDATO_LINGUA.
	 */
	Integer getCandidatoLinguaId();

	/**
	 * Returns the ID_LINGUA.
	 * 
	 * @return the ID_LINGUA.
	 */
	String[] getLinguaId();

	/**
	 * Returns the ID_LINGUA_LIVELLO.
	 * 
	 * @return the ID_LINGUA_LIVELLO.
	 */
	String[] getLinguaLivelloId();

	/**
	 * Returns the ID_SITUAZIONE_LAVORATIVA.
	 * 
	 * @return the ID_SITUAZIONE_LAVORATIVA.
	 */
	Integer getSituazioneLavorativaId();

	/**
	 * Returns the ID_FORMAZIONE.
	 * 
	 * @return the ID_FORMAZIONE.
	 */
	Integer getFormazioneId();

	/**
	 * Returns the ID_STATO.
	 * 
	 * @return the ID_STATO.
	 */
	Integer getStatoId();

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_MOTIVAZIONE_SCARTO.
	 * 
	 * @return the ID_MOTIVAZIONE_SCARTO.
	 */
	Integer getMotivazioneScartoId();

	/**
	 * Returns the DATA_FORMAZIONE.
	 * 
	 * @return the DATA_FORMAZIONE.
	 */
	LocalDate getDataFormazione();

	/**
	 * Returns the NOME.
	 * 
	 * @return the NOME.
	 */
	String getNome();

	/**
	 * Returns the COGNOME.
	 * 
	 * @return the COGNOME.
	 */
	String getCognome();

	/**
	 * Returns the NASCITA.
	 * 
	 * @return the NASCITA.
	 */
	LocalDate getNascita();

	/**
	 * Returns the E_MAIL.
	 * 
	 * @return the E_MAIL.
	 */
	String getEmail();

	/**
	 * Returns the CV.
	 * 
	 * @return the CV.
	 */
	byte[] getCv();

	/**
	 * Returns the CHECK_TERMINI (S/N).
	 * 
	 * @return the CHECK_TERMINI (S/N).
	 */
	String getCheckTermini();

	/**
	 * Returns the CHECK_AUTORIIZZAZIONE (S/N).
	 * 
	 * @return the CHECK_AUTORIIZZAZIONE (S/N).
	 */
	String getCheckAutorizzazione();

	/**
	 * Returns the TELEFONO.
	 * 
	 * @return the TELEFONO.
	 */
	String getTelefono();

	/**
	 * Returns the MESSAGGIO.
	 * 
	 * @return the MESSAGGIO.
	 */
	String getMessaggio();

	/**
	 * Returns the VOCALE.
	 * 
	 * @return the VOCALE.
	 */
	byte[] getVocale();

	/**
	 * Returns the CV_ESTENSIONE.
	 * 
	 * @return the CV_ESTENSIONE.
	 */
	String getCvEstensione();

	/**
	 * Returns the VOCALE_ESTENSIONE.
	 * 
	 * @return the VOCALE_ESTENSIONE.
	 */
	String getVocaleEstensione();

	/**
	 * Returns the VALUTAZIONE_PRIMA.
	 * 
	 * @return the VALUTAZIONE_PRIMA.
	 */
	String getValutazionePrima();

	/**
	 * Returns the VALUTAZIONE_SECONDA.
	 * 
	 * @return the VALUTAZIONE_SECONDA.
	 */
	String getValutazioneSeconda();

	/**
	 * Returns the FEEDBACK_INTERNO.
	 * 
	 * @return the FEEDBACK_INTERNO.
	 */
	String getFeedbackInterno();

	/**
	 * Returns the INFORMATO (S/N).
	 * 
	 * @return the INFORMATO (S/N).
	 */
	String getInformato();

	/**
	 * Returns the ID_DOCUMENTO.
	 * 
	 * @return the ID_DOCUMENTO.
	 */
	Integer getDocumentoId();

	/**
	 * Returns the DOCUMENTO.
	 * 
	 * @return the DOCUMENTO.
	 */
	byte[] getDocumento();

	/**
	 * Returns the DOCUMENTO_ESTENSIONE.
	 * 
	 * @return DOCUMENTO_ESTENSIONE.
	 */
	String getDocumentoEstensione();

	/**
	 * Returns the DESCRIZIONE of the DOCUMENTO.
	 * 
	 * @return the DESCRIZIONE of the DOCUMENTO.
	 */
	String getDescrizioneDocumento();

	/**
	 * Returns the DATA_CANDIDATURA.
	 * 
	 * @return the DATA_CANDIDATURA.
	 */
	LocalDateTime getDataCandidatura();

	/**
	 * Returns the LINGUA_CONTATTO.
	 * 
	 * @return the LINGUA_CONTATTO.
	 */
	Integer getLinguaContatto();

	/**
	 * Returns the NOTIFICA_SCARTO_INVIATA (S/N).
	 * 
	 * @return the NOTIFICA_SCARTO_INVIATA (S/N).
	 */
	String getNotificaScartoInviata();

	/**
	 * Returns the NOTIFICA_INTERNA_INVIATA (S/N).
	 * 
	 * @return the NOTIFICA_INTERNA_INVIATA (S/N).
	 */
	String getNotificaInternaInviata();
}
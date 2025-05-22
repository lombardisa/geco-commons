package ch.lombardi.spai.commons.rec;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

/**
 * Java Class: CandidatoImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class CandidatoImpl implements Candidato {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -2903163788258047228L;

	// VARIABLES
	private Integer candidatoId;
	private Integer sessoId;
	private Integer sondaggioId;
	private Integer situazioneLavorativaId;
	private Integer formazioneId;
	private Integer statoId;
	private Integer annuncioId;
	private LocalDate dataFormazione;
	private String nome;
	private String cognome;
	private LocalDate nascita;
	private String email;
	private byte[] cv;
	private String checkTermini;
	private String checkAutorizzazione;
	private String telefono;
	private String messaggio;
	private byte[] vocale;
	private String cvEstensione;
	private String vocaleEstensione;
	private String valutazionePrima;
	private String valutazioneSeconda;
	private Integer motivazioneScartoId;
	private String feedbackInterno;
	private String informato;
	private Integer documentoId;
	private byte[] documento;
	private String documentoEstensione;
	private String descrizioneDocumento;
	private Integer linkId;
	private String[] link;
	private Integer candidatoLinguaId;
	private String[] linguaId;
	private String[] linguaLivelloId;
	private LocalDateTime dataCandidatura;
	private Integer linguaContatto;
	private String notificaScartoInviata;
	private String notificaInternaInviata;

	/**
	 * String with all information apart from: lingua (array), link (array).
	 */
	@Override
	public String toString() {
		return getCandidatoId() + ", " + getSessoId() + ", " + getSondaggioId() + ", " + getSituazioneLavorativaId()
				+ ", " + getFormazioneId() + ", " + getStatoId() + ", " + getAnnuncioId() + ", " + getDataFormazione()
				+ ", " + getNome() + ", " + getCognome() + ", " + getNascita() + ", " + getEmail() + ", " + getCv()
				+ ", " + getCheckTermini() + ", " + getCheckAutorizzazione() + ", " + getTelefono() + ", "
				+ getMessaggio() + ", " + getVocale() + ", " + getCvEstensione() + ", " + getVocaleEstensione() + ", "
				+ getValutazionePrima() + ", " + getValutazioneSeconda() + ", " + getMotivazioneScartoId() + ", "
				+ getFeedbackInterno() + ", " + getInformato() + ", " + getDocumentoId() + ", " + getDocumento() + ", "
				+ getDocumentoEstensione() + ", " + getDescrizioneDocumento() + ", " + getLinguaContatto() + ", "
				+ getNotificaScartoInviata() + ", " + getNotificaInternaInviata();
	}

	/**
	 * Default empty constructor (necessary for Jackson serialization).
	 */
	public CandidatoImpl() {
		super();
	}

	/**
	 * Constructor of the candidato itself.
	 * 
	 * @param candidatoId:            the ID_CANDIDATO.
	 * @param sessoId:                the ID_SESSO.
	 * @param sondaggioId:            the ID_SONDAGGIO.
	 * @param situazioneLavorativaId: the ID_SITUAZIONE_LAVORATIVA.
	 * @param formazioneId:           the ID_FORMAZIONE.
	 * @param statoId:                the ID_STATO.
	 * @param annuncioId:             the ID_ANNUNCIO.
	 * @param dataFormazione:         the DATA_FORMAZIONE.
	 * @param nome:                   the NOME.
	 * @param cognome:                the COGNOME.
	 * @param nascita:                the NASCITA.
	 * @param email:                  the E_MAIL.
	 * @param cv:                     the CV.
	 * @param checkTermini:           the CHECK_TERMINI.
	 * @param checkAutorizzazione:    the CHECK_AUTORIZZAZIONE.
	 * @param telefono:               the TELEFONO.
	 * @param messaggio:              the MESSAGGIO.
	 * @param vocale:                 the VOCALE.
	 * @param cvEstensione:           the CV_ESTENSIONE.
	 * @param vocaleEstensione:       the VOCALE_ESTENSIONE.
	 * @param valutazionePrima:       the VALUTAZIONE_PRIMA.
	 * @param valutazioneSeconda:     the VALUTAZIONE_SECONDA.
	 * @param motivazioneScartoId:    the ID_MOTIVAZIONE_SCARTO.
	 * @param feedbackInterno:        the FEEDBACK_INTERNO.
	 * @param informato:              the INFORMATO.
	 * @param documentoId:            the ID_DOCUMENTO.
	 * @param documento:              the DOCUMENTO.
	 * @param documentoEstensione:    the DOCUMENTO_ESTENSIONE.
	 * @param descrizioneDocumento:   the DESCRIZIONE of the DOCUMENTO.
	 * @param linkId:                 the ID_LINK.
	 * @param link:                   the LINK.
	 * @param candidatoLinguaId:      the ID_CANDIDATO_LINGUA.
	 * @param linguaId:               the ID_LINGUA.
	 * @param linguaLivelloId:        the ID_LINGUA_LIVELLO.
	 * @param dataCandidatura:        the DATA_CANDIDATURA.
	 * @param linguaContatto:         the LINGUA_CONTATTO.
	 * @param notificaScartoInviata:  the NOTIFICA_SCARTO_INVIATA.
	 * @param notificaInternaInviata: the NOTIFICA_INTERNA_INVIATA.
	 */
	public CandidatoImpl(Integer candidatoId, Integer sessoId, Integer sondaggioId, Integer situazioneLavorativaId,
			Integer formazioneId, Integer statoId, Integer annuncioId, LocalDate dataFormazione, String nome,
			String cognome, LocalDate nascita, String email, byte[] cv, String checkTermini, String checkAutorizzazione,
			String telefono, String messaggio, byte[] vocale, String cvEstensione, String vocaleEstensione,
			String valutazionePrima, String valutazioneSeconda, Integer motivazioneScartoId, String feedbackInterno,
			String informato, Integer documentoId, byte[] documento, String documentoEstensione,
			String descrizioneDocumento, Integer linkId, String[] link, Integer candidatoLinguaId, String[] linguaId,
			String[] linguaLivelloId, LocalDateTime dataCandidatura, Integer linguaContatto,
			String notificaScartoInviata, String notificaInternaInviata) {
		super();
		this.candidatoId = candidatoId;
		this.sessoId = sessoId;
		this.sondaggioId = sondaggioId;
		this.situazioneLavorativaId = situazioneLavorativaId;
		this.formazioneId = formazioneId;
		this.statoId = statoId;
		this.annuncioId = annuncioId;
		this.dataFormazione = dataFormazione;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.email = email;
		this.cv = cv;
		this.checkTermini = checkTermini;
		this.checkAutorizzazione = checkAutorizzazione;
		this.telefono = telefono;
		this.messaggio = messaggio;
		this.vocale = vocale;
		this.cvEstensione = cvEstensione;
		this.vocaleEstensione = vocaleEstensione;
		this.valutazionePrima = valutazionePrima;
		this.valutazioneSeconda = valutazioneSeconda;
		this.motivazioneScartoId = motivazioneScartoId;
		this.feedbackInterno = feedbackInterno;
		this.informato = informato;
		this.documentoId = documentoId;
		this.documento = documento;
		this.documentoEstensione = documentoEstensione;
		this.descrizioneDocumento = descrizioneDocumento;
		this.linkId = linkId;
		this.link = link;
		this.candidatoLinguaId = candidatoLinguaId;
		this.linguaId = linguaId;
		this.linguaLivelloId = linguaLivelloId;
		this.dataCandidatura = dataCandidatura;
		this.linguaContatto = linguaContatto;
		this.notificaScartoInviata = notificaScartoInviata;
		this.notificaInternaInviata = notificaInternaInviata;
	}

	/**
	 * Gets the ID_CANDIDATO.
	 */
	public Integer getCandidatoId() {
		return candidatoId;
	}

	/**
	 * Gets the ID_SESSO.
	 */
	public Integer getSessoId() {
		return sessoId;
	}

	/**
	 * Gets the ID_SONDAGGIO.
	 */
	public Integer getSondaggioId() {
		return sondaggioId;
	}

	/**
	 * Gets the ID_SITUAZIONE_LAVORATIVA.
	 */
	public Integer getSituazioneLavorativaId() {
		return situazioneLavorativaId;
	}

	/**
	 * Gets the ID_FORMAZIONE.
	 */
	public Integer getFormazioneId() {
		return formazioneId;
	}

	/**
	 * Gets the ID_STATO.
	 */
	public Integer getStatoId() {
		return statoId;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the DATA_FORMAZIONE.
	 */
	public LocalDate getDataFormazione() {
		return dataFormazione;
	}

	/**
	 * Gets the NOME.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Gets the COGNOME.
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Gets the NASCITA.
	 */
	public LocalDate getNascita() {
		return nascita;
	}

	/**
	 * Gets the E_MAIL.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Gets the CV.
	 */
	public byte[] getCv() {
		return cv;
	}

	/**
	 * Gets the CHECK_TERMINI.
	 */
	public String getCheckTermini() {
		return checkTermini;
	}

	/**
	 * Gets the CHECK_AUTORIZZAZIONE.
	 */
	public String getCheckAutorizzazione() {
		return checkAutorizzazione;
	}

	/**
	 * Gets the TELEFONO.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Gets the MESSAGGIO.
	 */
	public String getMessaggio() {
		return messaggio;
	}

	/**
	 * Gets the VOCALE.
	 */
	public byte[] getVocale() {
		return vocale;
	}

	/**
	 * Gets the CV_ESTENSIONE.
	 */
	public String getCvEstensione() {
		return cvEstensione;
	}

	/**
	 * Gets the VOCALE_ESTENSIONE.
	 */
	public String getVocaleEstensione() {
		return vocaleEstensione;
	}

	/**
	 * Gets the VALUTAZIONE_PRIMA.
	 */
	public String getValutazionePrima() {
		return valutazionePrima;
	}

	/**
	 * Gets the VALUTAZIONE_SECONDA.
	 */
	public String getValutazioneSeconda() {
		return valutazioneSeconda;
	}

	/**
	 * Gets the ID_MOTIVAZIONE_SCARTO.
	 */
	public Integer getMotivazioneScartoId() {
		return motivazioneScartoId;
	}

	/**
	 * Gets the FEEDBACK_INTERNO.
	 */
	public String getFeedbackInterno() {
		return feedbackInterno;
	}

	/**
	 * Gets the INFORMATO.
	 */
	public String getInformato() {
		return informato;
	}

	/**
	 * Gets the ID_DOCUMENTO.
	 */
	public Integer getDocumentoId() {
		return documentoId;
	}

	/**
	 * Gets the DOCUMENTO.
	 */
	public byte[] getDocumento() {
		return documento;
	}

	/**
	 * Gets the DOCUMENTO_ESTENSIONE.
	 */
	public String getDocumentoEstensione() {
		return documentoEstensione;
	}

	/**
	 * Gets the DESCRIZIONE of the DOCUMENTO.
	 */
	public String getDescrizioneDocumento() {
		return descrizioneDocumento;
	}

	/**
	 * Gets the ID_LINK.
	 */
	public Integer getLinkId() {
		return linkId;
	}

	/**
	 * Gets the LINK.
	 */
	public String[] getLink() {
		return link;
	}

	/**
	 * Gets the ID_CANDIDATO_LINGUA.
	 */
	public Integer getCandidatoLinguaId() {
		return candidatoLinguaId;
	}

	/**
	 * Gets the ID_LINGUA.
	 */
	public String[] getLinguaId() {
		return linguaId;
	}

	/**
	 * Gets the ID_LINGUA_LIVELLO.
	 */
	public String[] getLinguaLivelloId() {
		return linguaLivelloId;
	}

	/**
	 * Gets the DATA_CANDIDATURA.
	 */
	public LocalDateTime getDataCandidatura() {
		return dataCandidatura;
	}

	/**
	 * Gets the LINGUA_CONTATTO.
	 */
	public Integer getLinguaContatto() {
		return linguaContatto;
	}

	/**
	 * Gets the NOTIFICA_SCARTO_INVIATA.
	 */
	public String getNotificaScartoInviata() {
		return notificaScartoInviata;
	}

	/**
	 * Gets the NOTIFICA_INTERNA_INVIATA.
	 */
	public String getNotificaInternaInviata() {
		return notificaInternaInviata;
	}

	/**
	 * Sets the ID_CANDIDATO.
	 * 
	 * @param candidatoId: the ID_CANDIDATO.
	 */
	public void setCandidatoId(Integer candidatoId) {
		this.candidatoId = candidatoId;
	}

	/**
	 * Sets the ID_SESSO.
	 * 
	 * @param sessoId: the ID_SESSO.
	 */
	public void setSessoId(Integer sessoId) {
		this.sessoId = sessoId;
	}

	/**
	 * Sets the ID_SONDAGGIO.
	 * 
	 * @param sondaggioId: the ID_SONDAGGIO.
	 */
	public void setSondaggioId(Integer sondaggioId) {
		this.sondaggioId = sondaggioId;
	}

	/**
	 * Sets the ID_SITUAZIONE_LAVORATIVA.
	 * 
	 * @param situazioneLavorativaId: the ID_SITUAZIONE_LAVORATIVA.
	 */
	public void setSituazioneLavorativaId(Integer situazioneLavorativaId) {
		this.situazioneLavorativaId = situazioneLavorativaId;
	}

	/**
	 * Sets the ID_FORMAZIONE.
	 * 
	 * @param formazioneId: the ID_FORMAZIONE.
	 */
	public void setFormazioneId(Integer formazioneId) {
		this.formazioneId = formazioneId;
	}

	/**
	 * Sets the ID_STATO.
	 * 
	 * @param statoId: the ID_STATO.
	 */
	public void setStatoId(Integer statoId) {
		this.statoId = statoId;
	}

	/**
	 * Sets the ID_ANNUNCIO.
	 * 
	 * @param annuncioId: the ID_ANNUNCIO.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the DATA_FORMAZIONE.
	 * 
	 * @param dataFormazione: the DATA_FORMAZIONE.
	 */
	public void setDataFormazione(LocalDate dataFormazione) {
		this.dataFormazione = dataFormazione;
	}

	/**
	 * Sets the NOME.
	 * 
	 * @param nome: the NOME.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the COGNOME.
	 * 
	 * @param cognome: the COGNOME.
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * Sets the NASCITA.
	 * 
	 * @param nascita: the NASCITA.
	 */
	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	/**
	 * Sets the E_MAIL.
	 * 
	 * @param email: the E_MAIL.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the CV.
	 * 
	 * @param cv: the CV.
	 */
	public void setCv(byte[] cv) {
		this.cv = cv;
	}

	/**
	 * Sets the CHECK_TERMINI.
	 * 
	 * @param checkTermini: the CHECK_TERMINI.
	 */
	public void setCheckTermini(String checkTermini) {
		this.checkTermini = checkTermini;
	}

	/**
	 * Sets the CHECK_AUTORIZZAZIONE.
	 * 
	 * @param checkAutorizzazione: the CHECK_AUTORIZZAZIONE.
	 */
	public void setCheckAutorizzazione(String checkAutorizzazione) {
		this.checkAutorizzazione = checkAutorizzazione;
	}

	/**
	 * Sets the TELEFONO.
	 * 
	 * @param telefono: the TELEFONO.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Sets the MESSAGGIO.
	 * 
	 * @param messaggio: the MESSAGGIO.
	 */
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	/**
	 * Sets the VOCALE.
	 * 
	 * @param vocale: the VOCALE.
	 */
	public void setVocale(byte[] vocale) {
		this.vocale = vocale;
	}

	/**
	 * Sets the CV_ESTENSIONE.
	 * 
	 * @param cvEstensione: the CV_ESTENSIONE.
	 */
	public void setCvEstensione(String cvEstensione) {
		this.cvEstensione = cvEstensione;
	}

	/**
	 * Sets the VOCALE_ESTENSIONE.
	 * 
	 * @param vocaleEstensione: the VOCALE_ESTENSIONE.
	 */
	public void setVocaleEstensione(String vocaleEstensione) {
		this.vocaleEstensione = vocaleEstensione;
	}

	/**
	 * Sets the VALUTAZIONE_PRIMA.
	 * 
	 * @param valutazionePrima: the VALUTAZIONE_PRIMA.
	 */
	public void setValutazionePrima(String valutazionePrima) {
		this.valutazionePrima = valutazionePrima;
	}

	/**
	 * Sets the VALUTAZIONE_SECONDA.
	 * 
	 * @param valutazioneSeconda: the VALUTAZIONE_SECONDA.
	 */
	public void setValutazioneSeconda(String valutazioneSeconda) {
		this.valutazioneSeconda = valutazioneSeconda;
	}

	/**
	 * Sets the ID_MOTIVAZIONE_SCARTO.
	 * 
	 * @param motivazioneScartoId: the ID_MOTIVAZIONE_SCARTO.
	 */
	public void setMotivazioneScartoId(Integer motivazioneScartoId) {
		this.motivazioneScartoId = motivazioneScartoId;
	}

	/**
	 * Sets the FEEDBACK_INTERNO.
	 * 
	 * @param feedbackInterno: the FEEDBACK_INTERNO.
	 */
	public void setFeedbackInterno(String feedbackInterno) {
		this.feedbackInterno = feedbackInterno;
	}

	/**
	 * Sets the INFORMATO.
	 * 
	 * @param informato: the INFORMATO.
	 */
	public void setInformato(String informato) {
		this.informato = informato;
	}

	/**
	 * Sets the ID_DOCUMENTO.
	 * 
	 * @param documentoId: the ID_DOCUMENTO.
	 */
	public void setDocumentoId(Integer documentoId) {
		this.documentoId = documentoId;
	}

	/**
	 * Sets the DOCUMENTO.
	 * 
	 * @param documento: the DOCUMENTO.
	 */
	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	/**
	 * Sets the DOCUMENTO_ESTENSIONE.
	 * 
	 * @param documentoEstensione: the DOCUMENTO_ESTENSIONE.
	 */
	public void setDocumentoEstensione(String documentoEstensione) {
		this.documentoEstensione = documentoEstensione;
	}

	/**
	 * Sets the DESCRIZIONE of the DOCUMENTO.
	 * 
	 * @param descrizioneDocumento: the DESCRIZIONE of the DOCUMENTO.
	 */
	public void setDescrizioneDocumento(String descrizioneDocumento) {
		this.descrizioneDocumento = descrizioneDocumento;
	}

	/**
	 * Sets the ID_LINK.
	 * 
	 * @param linkId: the ID_LINK.
	 */
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	/**
	 * Sets the LINK.
	 * 
	 * @param link: the LINK.
	 */
	public void setLink(String[] link) {
		this.link = link;
	}

	/**
	 * Sets the ID_CANDIDATO_LINGUA.
	 * 
	 * @param candidatoLinguaId: the ID_CANDIDATO_LINGUA.
	 */
	public void setCandidatoLinguaId(Integer candidatoLinguaId) {
		this.candidatoLinguaId = candidatoLinguaId;
	}

	/**
	 * Sets the ID_LINGUA.
	 * 
	 * @param linguaId: the ID_LINGUA.
	 */
	public void setLinguaId(String[] linguaId) {
		this.linguaId = linguaId;
	}

	/**
	 * Sets the ID_LINGUA_LIVELLO.
	 * 
	 * @param linguaLivelloId: the ID_LINGUA_LIVELLO.
	 */
	public void setLinguaLivelloId(String[] linguaLivelloId) {
		this.linguaLivelloId = linguaLivelloId;
	}

	/**
	 * Sets the DATA_CANDIDATURA.
	 * 
	 * @param dataFormazione: the DATA_CANDIDATURA.
	 */
	public void setDataCandidatura(LocalDateTime dataCandidatura) {
		this.dataCandidatura = dataCandidatura;
	}

	/**
	 * Sets the LINGUA_CONTATTO.
	 * 
	 * @param liguaContatto: the LINGUA_CONTATTO.
	 */
	public void setLinguaContatto(Integer liguaContatto) {
		this.linguaContatto = liguaContatto;
	}

	/**
	 * Sets the NOTIFICA_SCARTO_INVIATA.
	 * 
	 * @param notificaScartoInviata: the NOTIFICA_SCARTO_INVIATA.
	 */
	public void setNotificaScartoInviata(String notificaScartoInviata) {
		this.notificaScartoInviata = notificaScartoInviata;
	}

	/**
	 * Sets the NOTIFICA_INTERNA_INVIATA.
	 * 
	 * @param notificaInternaInviata: the NOTIFICA_INTERNA_INVIATA.
	 */
	public void setNotificaInternaInviata(String notificaInternaInviata) {
		this.notificaInternaInviata = notificaInternaInviata;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cv);
		result = prime * result + Arrays.hashCode(documento);
		result = prime * result + Arrays.hashCode(linguaId);
		result = prime * result + Arrays.hashCode(linguaLivelloId);
		result = prime * result + Arrays.hashCode(link);
		result = prime * result + Arrays.hashCode(vocale);
		result = prime * result + Objects.hash(annuncioId, candidatoId, candidatoLinguaId, checkAutorizzazione,
				checkTermini, cognome, cvEstensione, dataCandidatura, dataFormazione, descrizioneDocumento,
				documentoEstensione, documentoId, email, feedbackInterno, formazioneId, informato, linguaContatto,
				linkId, messaggio, motivazioneScartoId, nascita, nome, notificaInternaInviata, notificaScartoInviata,
				sessoId, situazioneLavorativaId, sondaggioId, statoId, telefono, valutazionePrima, valutazioneSeconda,
				vocaleEstensione);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandidatoImpl other = (CandidatoImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(candidatoId, other.candidatoId)
				&& Objects.equals(candidatoLinguaId, other.candidatoLinguaId)
				&& Objects.equals(checkAutorizzazione, other.checkAutorizzazione)
				&& Objects.equals(checkTermini, other.checkTermini) && Objects.equals(cognome, other.cognome)
				&& Arrays.equals(cv, other.cv) && Objects.equals(cvEstensione, other.cvEstensione)
				&& Objects.equals(dataCandidatura, other.dataCandidatura)
				&& Objects.equals(dataFormazione, other.dataFormazione)
				&& Objects.equals(descrizioneDocumento, other.descrizioneDocumento)
				&& Arrays.equals(documento, other.documento)
				&& Objects.equals(documentoEstensione, other.documentoEstensione)
				&& Objects.equals(documentoId, other.documentoId) && Objects.equals(email, other.email)
				&& Objects.equals(feedbackInterno, other.feedbackInterno)
				&& Objects.equals(formazioneId, other.formazioneId) && Objects.equals(informato, other.informato)
				&& Objects.equals(linguaContatto, other.linguaContatto) && Arrays.equals(linguaId, other.linguaId)
				&& Arrays.equals(linguaLivelloId, other.linguaLivelloId) && Arrays.equals(link, other.link)
				&& Objects.equals(linkId, other.linkId) && Objects.equals(messaggio, other.messaggio)
				&& Objects.equals(motivazioneScartoId, other.motivazioneScartoId)
				&& Objects.equals(nascita, other.nascita) && Objects.equals(nome, other.nome)
				&& Objects.equals(notificaInternaInviata, other.notificaInternaInviata)
				&& Objects.equals(notificaScartoInviata, other.notificaScartoInviata)
				&& Objects.equals(sessoId, other.sessoId)
				&& Objects.equals(situazioneLavorativaId, other.situazioneLavorativaId)
				&& Objects.equals(sondaggioId, other.sondaggioId) && Objects.equals(statoId, other.statoId)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(valutazionePrima, other.valutazionePrima)
				&& Objects.equals(valutazioneSeconda, other.valutazioneSeconda) && Arrays.equals(vocale, other.vocale)
				&& Objects.equals(vocaleEstensione, other.vocaleEstensione);
	}
}
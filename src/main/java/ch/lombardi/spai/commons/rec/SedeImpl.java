package ch.lombardi.spai.commons.rec;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Java Class: SedeImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class SedeImpl implements Sede {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 4286757739061690872L;

	// VARIABLES
	private Integer sedeId;
	private Integer societaId;
	private Integer nazioneId;
	private String descEstesa;
	private String nomeIndirizzo;
	private String indirizzo;
	private String descSede;
	private String localita;
	private String nap;
	private String nazione;
	private String timeZone;
	private String noTelefono;
	private String eMail;
	private String eMailHr;
	private LocalDate dataChiusura;

	/**
	 * Default empty constructor.
	 */
	public SedeImpl() {
		super();
	}

	/**
	 * Costructor of the sede of the annuncio.
	 * 
	 * @param sedeId:        the ID_SEDE.
	 * @param societaId:     the ID_SOCIETA.
	 * @param descSede:      the DESCRIZIONE.
	 * @param nomeIndirizzo: the NOME_INDIRIZZO.
	 * @param indirizzo:     the INDIRIZZO.
	 * @param localita:      the LOCALITA.
	 * @param dataChiusura:  the DATA_CHIUSURA.
	 * @param nap:           the NAP.
	 * @param noTelefono:    the NO_TELEFONO.
	 * @param eMail:         the E_MAIL.
	 * @param timeZone:      the TIME_ZONE.
	 * @param descEstesa:    the DESCRIZIONE_ESTESA.
	 * @param eMailHr:       the E_MAIL_HR.
	 * @param nazioneId:     the ID_NAZIONE.
	 * @param nazione:       the NAZIONE.
	 */
	public SedeImpl(Integer sedeId, Integer societaId, String descSede, String nomeIndirizzo, String indirizzo,
			String localita, LocalDate dataChiusura, String nap, String noTelefono, String eMail, String timeZone,
			String descEstesa, String eMailHr, Integer nazioneId, String nazione) {
		super();
		this.sedeId = sedeId;
		this.societaId = societaId;
		this.descSede = descSede;
		this.nomeIndirizzo = nomeIndirizzo;
		this.indirizzo = indirizzo;
		this.localita = localita;
		this.dataChiusura = dataChiusura;
		this.nap = nap;
		this.noTelefono = noTelefono;
		this.eMail = eMail;
		this.timeZone = timeZone;
		this.descEstesa = descEstesa;
		this.eMailHr = eMailHr;
		this.nazioneId = nazioneId;
		this.nazione = nazione;
	}

	/**
	 * Gets the ID_SEDE.
	 */
	public Integer getSedeId() {
		return sedeId;
	}

	/**
	 * Gets the ID_SOCIETA.
	 */
	public Integer getSocietaId() {
		return societaId;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDescSede() {
		return descSede;
	}

	/**
	 * Gets the NOME_INDIRIZZO.
	 */
	public String getNomeIndirizzo() {
		return nomeIndirizzo;
	}

	/**
	 * Gets the INDIRIZZO.
	 */
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	 * Gets the LOCALITA.
	 */
	public String getLocalita() {
		return localita;
	}

	/**
	 * Gets the DATA_CHIUSURA.
	 */
	public LocalDate getDataChiusura() {
		return dataChiusura;
	}

	/**
	 * Gets the NAP.
	 */
	public String getNap() {
		return nap;
	}

	/**
	 * Gets the NO_TELEFONO.
	 */
	public String getNoTelefono() {
		return noTelefono;
	}

	/**
	 * Gets the E_MAIL.
	 */
	public String geteMail() {
		return eMail;
	}

	/**
	 * Gets the TIME_ZONE.
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * Gets the DESCRIZIONE_ESTESA.
	 */
	public String getDescEstesa() {
		return descEstesa;
	}

	/**
	 * Gets the E_MAIL_HR.
	 */
	public String geteMailHr() {
		return eMailHr;
	}

	/**
	 * Gets the ID_NAZIONE.
	 */
	public Integer getNazioneId() {
		return nazioneId;
	}

	/**
	 * Gets the NAZIONE.
	 */
	public String getNazione() {
		return nazione;
	}

	/**
	 * Sets the ID_SEDE.
	 * 
	 * @param sedeId: the ID_SEDE.
	 */
	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	/**
	 * Sets the ID_SOCIETA.
	 * 
	 * @param societaId: the ID_SOCIETA.
	 */
	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param descSede: the DESCRIZIONE.
	 */
	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}

	/**
	 * Sets the NOME_INDIRIZZO.
	 * 
	 * @param nomeIndirizzo: the NOME_INDIRIZZO.
	 */
	public void setNomeIndirizzo(String nomeIndirizzo) {
		this.nomeIndirizzo = nomeIndirizzo;
	}

	/**
	 * Sets the INDIRIZZO.
	 * 
	 * @param indirizzo: the INDIRIZZO.
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	/**
	 * Sets the LOCALITA.
	 * 
	 * @param localita: the LOCALITA.
	 */
	public void setLocalita(String localita) {
		this.localita = localita;
	}

	/**
	 * Sets the DATA_CHIUSURA.
	 * 
	 * @param dataChiusura: the DATA_CHIUSURA.
	 */
	public void setDataChiusura(LocalDate dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	/**
	 * Sets the NAP.
	 * 
	 * @param nap: the NAP.
	 */
	public void setNap(String nap) {
		this.nap = nap;
	}

	/**
	 * Sets the NO_TELEFONO.
	 * 
	 * @param noTelefono: the NO_TELEFONO.
	 */
	public void setNoTelefono(String noTelefono) {
		this.noTelefono = noTelefono;
	}

	/**
	 * Sets the E_MAIL.
	 * 
	 * @param eMail: the E_MAIL.
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	/**
	 * Sets the TIME_ZONE.
	 * 
	 * @param timeZone: the TIME_ZONE.
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * Sets the DESCRIZIONE_ESTESA.
	 * 
	 * @param descEstesa: the DESCRIZIONE_ESTESA.
	 */
	public void setDescEstesa(String descEstesa) {
		this.descEstesa = descEstesa;
	}

	/**
	 * Sets the E_MAIL_HR.
	 * 
	 * @param eMailHr: the E_MAIL_HR.
	 */
	public void seteMailHr(String eMailHr) {
		this.eMailHr = eMailHr;
	}

	/**
	 * Sets the ID_NAZIONE.
	 * 
	 * @param nazioneId: the ID_NAZIONE.
	 */
	public void setNazioneId(Integer nazioneId) {
		this.nazioneId = nazioneId;
	}

	/**
	 * Sets the NAZIONE.
	 * 
	 * @param nazione: the NAZIONE.
	 */
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dataChiusura, descEstesa, descSede, eMail, eMailHr, indirizzo, localita, nap, nazione,
				nazioneId, noTelefono, nomeIndirizzo, sedeId, societaId, timeZone);
	}

	/**
	 * Compares the IDs to see if the values are exactly the same Object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SedeImpl other = (SedeImpl) obj;
		return Objects.equals(dataChiusura, other.dataChiusura) && Objects.equals(descEstesa, other.descEstesa)
				&& Objects.equals(descSede, other.descSede) && Objects.equals(eMail, other.eMail)
				&& Objects.equals(eMailHr, other.eMailHr) && Objects.equals(indirizzo, other.indirizzo)
				&& Objects.equals(localita, other.localita) && Objects.equals(nap, other.nap)
				&& Objects.equals(nazione, other.nazione) && Objects.equals(nazioneId, other.nazioneId)
				&& Objects.equals(noTelefono, other.noTelefono) && Objects.equals(nomeIndirizzo, other.nomeIndirizzo)
				&& Objects.equals(sedeId, other.sedeId) && Objects.equals(societaId, other.societaId)
				&& Objects.equals(timeZone, other.timeZone);
	}
}
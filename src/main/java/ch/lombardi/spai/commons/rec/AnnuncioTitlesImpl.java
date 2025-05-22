package ch.lombardi.spai.commons.rec;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Java Class: AnnuncioTitlesImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class AnnuncioTitlesImpl implements AnnuncioTitles {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -4600029025301335168L;

	// VARIABLES
	private Integer annuncioId;
	private Integer sedeId;
	private Integer sezioneId;
	private String titolo;
	private String descrizione;
	private Integer nazioneId;
	private String descNazione;
	private BigDecimal occupMin;
	private BigDecimal occupMax;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioTitlesImpl() {
		super();
	}

	public AnnuncioTitlesImpl(Integer annuncioId, Integer sedeId, Integer sezioneId, String titolo, String descrizione,
			Integer nazioneId, String descNazione, BigDecimal occupMin, BigDecimal occupMax) {
		super();
		this.annuncioId = annuncioId;
		this.sedeId = sedeId;
		this.sezioneId = sezioneId;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.nazioneId = nazioneId;
		this.descNazione = descNazione;
		this.occupMin = occupMin;
		this.occupMax = occupMax;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_SEDE.
	 */
	public Integer getSedeId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_SEZIONE.
	 */
	public Integer getSezioneId() {
		return annuncioId;
	}

	/**
	 * Gets the TITOLO.
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Gets the TITOLO.
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * Gets the TITOLO.
	 */
	public Integer getNazioneId() {
		return nazioneId;
	}

	/**
	 * Gets the TITOLO.
	 */
	public String getDescNazione() {
		return descNazione;
	}

	/**
	 * Gets the TITOLO.
	 */
	public BigDecimal getOccupMin() {
		return occupMin;
	}

	/**
	 * Gets the TITOLO.
	 */
	public BigDecimal getOccupMax() {
		return occupMax;
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
	 * Sets the ID_SEDE.
	 * 
	 * @param annuncioId: the ID_SEDE.
	 */
	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	/**
	 * Sets the ID_SEZIONE.
	 * 
	 * @param annuncioId: the ID_SEZIONE.
	 */
	public void setSezioneId(Integer sezioneId) {
		this.sezioneId = sezioneId;
	}

	/**
	 * Sets the TITOLO.
	 * 
	 * @param titolo: the TITOLO.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param descrizione: the DESCRIZIONE.
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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
	 * Sets the DESC_NAZIONE.
	 * 
	 * @param descNazione: the DESC_NAZIONE.
	 */
	public void setDescNazione(String descNazione) {
		this.descNazione = descNazione;
	}

	/**
	 * Sets the OCCUP_MIN.
	 * 
	 * @param occupMin: the OCCUP_MIN.
	 */
	public void setOccupMin(BigDecimal occupMin) {
		this.occupMin = occupMin;
	}

	/**
	 * Sets the OCCUP_MAX.
	 * 
	 * @param occupMax: the OCCUP_MAX.
	 */
	public void setOccupMax(BigDecimal occupMax) {
		this.occupMax = occupMax;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, descNazione, descrizione, nazioneId, occupMax, occupMin, sedeId, sezioneId,
				titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnnuncioTitlesImpl other = (AnnuncioTitlesImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(descNazione, other.descNazione)
				&& Objects.equals(descrizione, other.descrizione) && Objects.equals(nazioneId, other.nazioneId)
				&& Objects.equals(occupMax, other.occupMax) && Objects.equals(occupMin, other.occupMin)
				&& Objects.equals(sedeId, other.sedeId) && Objects.equals(sezioneId, other.sezioneId)
				&& Objects.equals(titolo, other.titolo);
	}
}
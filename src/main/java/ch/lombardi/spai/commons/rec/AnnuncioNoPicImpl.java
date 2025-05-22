package ch.lombardi.spai.commons.rec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Java Class: AnnuncioNoPicImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class AnnuncioNoPicImpl implements AnnuncioNoPic {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -2906729321683194197L;

	// VARIABLES
	private Integer annuncioId;
	private Integer sedeId;
	private Integer sezioneId;
	private Integer areaId;
	private Integer nazioneId;
	private Integer refPrincId;
	private Integer refSecondId;
	private String titolo;
	private String descrizione;
	private String descArea;
	private String descAreaBreve;
	private String nomeIndirizzo;
	private String descIndirizzo;
	private String descSede;
	private String indirizzo;
	private String casellaPostale;
	private String nap;
	private String localita;
	private String descNazione;
	private String noTelefono;
	private String emailHr;
	private String paginaInternet;
	private String paginaLinkedin;
	private String nomeRefPrinc;
	private String cognomeRefPrinc;
	private String nomeRefSecond;
	private String cognomeRefSecond;
	private String homeOffice;
	private String datiCompleti;
	private BigDecimal occupMin;
	private BigDecimal occupMax;
	private LocalDate inizio;
	private LocalDate fine;
	private LocalDate dataInizioContratto;
	private Integer durataContratto;
	private Integer unitaDurataContratto;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioNoPicImpl() {
		super();
	}

	public AnnuncioNoPicImpl(Integer annuncioId, Integer sedeId, Integer sezioneId, Integer areaId, Integer nazioneId,
			Integer refPrincId, Integer refSecondId, String titolo, String descrizione, String descArea,
			String descAreaBreve, String nomeIndirizzo, String descIndirizzo, String descSede, String indirizzo,
			String casellaPostale, String nap, String localita, String descNazione, String noTelefono, String emailHr,
			String paginaInternet, String paginaLinkedin, String nomeRefPrinc, String cognomeRefPrinc,
			String nomeRefSecond, String cognomeRefSecond, String homeOffice, String datiCompleti, BigDecimal occupMin,
			BigDecimal occupMax, LocalDate inizio, LocalDate fine, LocalDate dataInizioContratto,
			Integer durataContratto, Integer unitaDurataContratto) {
		super();
		this.annuncioId = annuncioId;
		this.sedeId = sedeId;
		this.sezioneId = sezioneId;
		this.areaId = areaId;
		this.nazioneId = nazioneId;
		this.refPrincId = refPrincId;
		this.refSecondId = refSecondId;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.descArea = descArea;
		this.descAreaBreve = descAreaBreve;
		this.nomeIndirizzo = nomeIndirizzo;
		this.descIndirizzo = descIndirizzo;
		this.descSede = descSede;
		this.indirizzo = indirizzo;
		this.casellaPostale = casellaPostale;
		this.nap = nap;
		this.localita = localita;
		this.descNazione = descNazione;
		this.noTelefono = noTelefono;
		this.emailHr = emailHr;
		this.paginaInternet = paginaInternet;
		this.paginaLinkedin = paginaLinkedin;
		this.nomeRefPrinc = nomeRefPrinc;
		this.cognomeRefPrinc = cognomeRefPrinc;
		this.nomeRefSecond = nomeRefSecond;
		this.cognomeRefSecond = cognomeRefSecond;
		this.homeOffice = homeOffice;
		this.datiCompleti = datiCompleti;
		this.occupMin = occupMin;
		this.occupMax = occupMax;
		this.inizio = inizio;
		this.fine = fine;
		this.dataInizioContratto = dataInizioContratto;
		this.durataContratto = durataContratto;
		this.unitaDurataContratto = unitaDurataContratto;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_REF_PRINC.
	 */
	public Integer getRefPrincId() {
		return refPrincId;
	}

	/**
	 * Gets the NOME_REF_PRINC.
	 */
	public String getNomeRefPrinc() {
		return nomeRefPrinc;
	}

	/**
	 * Gets the COGNOME_REF_PRINC.
	 */
	public String getCognomeRefPrinc() {
		return cognomeRefPrinc;
	}

	/**
	 * Gets the ID_SEDE.
	 */
	public Integer getSedeId() {
		return sedeId;
	}

	/**
	 * Gets the DESC_SEDE.
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
	 * Gets the DESC_INDIRIZZO.
	 */
	public String getDescIndirizzo() {
		return descIndirizzo;
	}

	/**
	 * Gets the INDIRIZZO.
	 */
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	 * Gets the CASELLA_POSTALE.
	 */
	public String getCasellaPostale() {
		return casellaPostale;
	}

	/**
	 * Gets the NAP.
	 */
	public String getNap() {
		return nap;
	}

	/**
	 * Gets the LOCALITA.
	 */
	public String getLocalita() {
		return localita;
	}

	/**
	 * Gets the ID_NAZIONE.
	 */
	public Integer getNazioneId() {
		return nazioneId;
	}

	/**
	 * Gets the DESC_NAZIONE.
	 */
	public String getDescNazione() {
		return descNazione;
	}

	/**
	 * Gets the NO_TELEFONO.
	 */
	public String getNoTelefono() {
		return noTelefono;
	}

	/**
	 * Gets the E_MAIL_HR.
	 */
	public String getEmailHr() {
		return emailHr;
	}

	/**
	 * Gets the PAGINA_INTERNET.
	 */
	public String getPaginaInternet() {
		return paginaInternet;
	}

	/**
	 * Gets the PAGINA_LINKEDIN.
	 */
	public String getPaginaLinkedin() {
		return paginaLinkedin;
	}

	/**
	 * Gets the ID_SEZIONE.
	 */
	public Integer getSezioneId() {
		return sezioneId;
	}

	/**
	 * Gets the ID_AREA.
	 */
	public Integer getAreaId() {
		return areaId;
	}

	/**
	 * Gets the DESC_AREA.
	 */
	public String getDescArea() {
		return descArea;
	}

	/**
	 * Gets the DESC_AREA_BREVE.
	 */
	public String getDescAreaBreve() {
		return descAreaBreve;
	}

	/**
	 * Gets the ID_REF_SECOND.
	 */
	public Integer getRefSecondId() {
		return refSecondId;
	}

	/**
	 * Gets the NOME_REF_SECOND.
	 */
	public String getNomeRefSecond() {
		return nomeRefSecond;
	}

	/**
	 * Gets the COGNOME_REF_SECOND.
	 */
	public String getCognomeRefSecond() {
		return cognomeRefSecond;
	}

	/**
	 * Gets the TITOLO.
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Gets the DESC_ANNUNCIO.
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * Gets the HOME_OFFICE.
	 */
	public String getHomeOffice() {
		return homeOffice;
	}

	/**
	 * Gets the DATI_COMPLETI.
	 */
	public String getDatiCompleti() {
		return datiCompleti;
	}

	/**
	 * Gets the OCCUP_MIN.
	 */
	public BigDecimal getOccupMin() {
		return occupMin;
	}

	/**
	 * Gets the OCCUP_MAX.
	 */
	public BigDecimal getOccupMax() {
		return occupMax;
	}

	/**
	 * Gets the INIZIO.
	 */
	public LocalDate getInizio() {
		return inizio;
	}

	/**
	 * Gets the FINE.
	 */
	public LocalDate getFine() {
		return fine;
	}

	/**
	 * Gets the DATA_INIZIO_CONTRATTO.
	 */
	public LocalDate getDataInizioContratto() {
		return dataInizioContratto;
	}

	/**
	 * Gets the DURATA_CONTRATTO.
	 */
	public Integer getDurataContratto() {
		return durataContratto;
	}

	/**
	 * Gets the UNITA_DURATA_CONTRATTO.
	 */
	public Integer getUnitaDurataContratto() {
		return unitaDurataContratto;
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
	 * Sets the ID_REF_PRINC.
	 * 
	 * @param refPrincId: the ID_REF_PRINC.
	 */
	public void setRefPrincId(Integer refPrincId) {
		this.refPrincId = refPrincId;
	}

	/**
	 * Sets the NOME_REF_PRINC.
	 * 
	 * @param nomeRefPrinc: the NOME_REF_PRINC.
	 */
	public void setNomeRefPrinc(String nomeRefPrinc) {
		this.nomeRefPrinc = nomeRefPrinc;
	}

	/**
	 * Sets the COGNOME_REF_PRINC.
	 * 
	 * @param cognomeRefPrinc: the COGNOME_REF_PRINC.
	 */
	public void setCognomeRefPrinc(String cognomeRefPrinc) {
		this.cognomeRefPrinc = cognomeRefPrinc;
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
	 * Sets the DESC_SEDE.
	 * 
	 * @param descSede: the DESC_SEDE.
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
	 * Sets the DESC_INDIRIZZO.
	 * 
	 * @param descIndirizzo: the DESC_INDIRIZZO.
	 */
	public void setDescIndirizzo(String descIndirizzo) {
		this.descIndirizzo = descIndirizzo;
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
	 * Sets the CASELLA_POSTALE.
	 * 
	 * @param casellaPostale: the CASELLA_POSTALE.
	 */
	public void setCasellaPostale(String casellaPostale) {
		this.casellaPostale = casellaPostale;
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
	 * Sets the LOCALITA.
	 * 
	 * @param localita: the LOCALITA.
	 */
	public void setLocalita(String localita) {
		this.localita = localita;
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
	 * Sets the NO_TELEFONO.
	 * 
	 * @param noTelefono: the NO_TELEFONO.
	 */
	public void setNoTelefono(String noTelefono) {
		this.noTelefono = noTelefono;
	}

	/**
	 * Sets the E_MAIL_HR.
	 * 
	 * @param emailHr: the E_MAIL_HR.
	 */
	public void setEmailHr(String emailHr) {
		this.emailHr = emailHr;
	}

	/**
	 * Sets the PAGINA_INTERNET.
	 * 
	 * @param paginaInternet: the PAGINA_INTERNET.
	 */
	public void setPaginaInternet(String paginaInternet) {
		this.paginaInternet = paginaInternet;
	}

	/**
	 * Sets the PAGINA_LINKEDIN.
	 * 
	 * @param paginaLinkedin: the PAGINA_LINKEDIN.
	 */
	public void setPaginaLinkedin(String paginaLinkedin) {
		this.paginaLinkedin = paginaLinkedin;
	}

	/**
	 * Sets the ID_SEZIONE.
	 * 
	 * @param sezioneId: the ID_SEZIONE.
	 */
	public void setSezioneId(Integer sezioneId) {
		this.sezioneId = sezioneId;
	}

	/**
	 * Sets the ID_AREA.
	 * 
	 * @param areaId: the ID_AREA.
	 */
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	/**
	 * Sets the DESC_AREA.
	 * 
	 * @param descArea: the DESC_AREA.
	 */
	public void setDescArea(String descArea) {
		this.descArea = descArea;
	}

	/**
	 * Sets the DESC_AREA_BREVE.
	 * 
	 * @param descAreaBreve: the DESC_AREA_BREVE.
	 */
	public void setDescAreaBreve(String descAreaBreve) {
		this.descAreaBreve = descAreaBreve;
	}

	/**
	 * Sets the ID_REF_SECOND.
	 * 
	 * @param refSecondId: the ID_REF_SECOND.
	 */
	public void setRefSecondId(Integer refSecondId) {
		this.refSecondId = refSecondId;
	}

	/**
	 * Sets the NOME_REF_SECOND.
	 * 
	 * @param nomeRefSecond: the NOME_REF_SECOND.
	 */
	public void setNomeRefSecond(String nomeRefSecond) {
		this.nomeRefSecond = nomeRefSecond;
	}

	/**
	 * Sets the COGNOME_REF_SECOND.
	 * 
	 * @param cognomeRefSecond: the COGNOME_REF_SECOND.
	 */
	public void setCognomeRefSecond(String cognomeRefSecond) {
		this.cognomeRefSecond = cognomeRefSecond;
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
	 * Sets the DESC_ANNUNCIO.
	 * 
	 * @param descrizione: the DESC_ANNUNCIO.
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * Sets the HOME_OFFICE.
	 * 
	 * @param homeOffice: the HOME_OFFICE.
	 */
	public void setHomeOffice(String homeOffice) {
		this.homeOffice = homeOffice;
	}

	/**
	 * Sets the DATI_COMPLETI.
	 * 
	 * @param datiCompleti: the DATI_COMPLETI.
	 */
	public void setDatiCompleti(String datiCompleti) {
		this.datiCompleti = datiCompleti;
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

	/**
	 * Sets the INIZIO.
	 * 
	 * @param inizio: the INIZIO.
	 */
	public void setInizio(LocalDate inizio) {
		this.inizio = inizio;
	}

	/**
	 * Sets the FINE.
	 * 
	 * @param fine: the FINE.
	 */
	public void setFine(LocalDate fine) {
		this.fine = fine;
	}

	/**
	 * Sets the DATA_INIZIO_CONTRATTO.
	 * 
	 * @param dataInizioContratto: the DATA_INIZIO_CONTRATTO.
	 */
	public void setDataInizioContratto(LocalDate dataInizioContratto) {
		this.dataInizioContratto = dataInizioContratto;
	}

	/**
	 * Sets the DURATA_CONTRATTO.
	 * 
	 * @param durataContratto: the DURATA_CONTRATTO.
	 */
	public void setDurataContratto(Integer durataContratto) {
		this.durataContratto = durataContratto;
	}

	/**
	 * Sets the UNITA_DURATA_CONTRATTO.
	 * 
	 * @param unitaDurataContratto: the UNITA_DURATA_CONTRATTO.
	 */
	public void setUnitaDurataContratto(Integer unitaDurataContratto) {
		this.unitaDurataContratto = unitaDurataContratto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, areaId, casellaPostale, cognomeRefPrinc, cognomeRefSecond, dataInizioContratto,
				datiCompleti, descArea, descAreaBreve, descIndirizzo, descNazione, descSede, descrizione,
				durataContratto, emailHr, fine, homeOffice, indirizzo, inizio, localita, nap, nazioneId, noTelefono,
				nomeIndirizzo, nomeRefPrinc, nomeRefSecond, occupMax, occupMin, paginaInternet, paginaLinkedin,
				refPrincId, refSecondId, sedeId, sezioneId, titolo, unitaDurataContratto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnnuncioNoPicImpl other = (AnnuncioNoPicImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(areaId, other.areaId)
				&& Objects.equals(casellaPostale, other.casellaPostale)
				&& Objects.equals(cognomeRefPrinc, other.cognomeRefPrinc)
				&& Objects.equals(cognomeRefSecond, other.cognomeRefSecond)
				&& Objects.equals(dataInizioContratto, other.dataInizioContratto)
				&& Objects.equals(datiCompleti, other.datiCompleti) && Objects.equals(descArea, other.descArea)
				&& Objects.equals(descAreaBreve, other.descAreaBreve)
				&& Objects.equals(descIndirizzo, other.descIndirizzo) && Objects.equals(descNazione, other.descNazione)
				&& Objects.equals(descSede, other.descSede) && Objects.equals(descrizione, other.descrizione)
				&& Objects.equals(durataContratto, other.durataContratto) && Objects.equals(emailHr, other.emailHr)
				&& Objects.equals(fine, other.fine) && Objects.equals(homeOffice, other.homeOffice)
				&& Objects.equals(indirizzo, other.indirizzo) && Objects.equals(inizio, other.inizio)
				&& Objects.equals(localita, other.localita) && Objects.equals(nap, other.nap)
				&& Objects.equals(nazioneId, other.nazioneId) && Objects.equals(noTelefono, other.noTelefono)
				&& Objects.equals(nomeIndirizzo, other.nomeIndirizzo)
				&& Objects.equals(nomeRefPrinc, other.nomeRefPrinc)
				&& Objects.equals(nomeRefSecond, other.nomeRefSecond) && Objects.equals(occupMax, other.occupMax)
				&& Objects.equals(occupMin, other.occupMin) && Objects.equals(paginaInternet, other.paginaInternet)
				&& Objects.equals(paginaLinkedin, other.paginaLinkedin) && Objects.equals(refPrincId, other.refPrincId)
				&& Objects.equals(refSecondId, other.refSecondId) && Objects.equals(sedeId, other.sedeId)
				&& Objects.equals(sezioneId, other.sezioneId) && Objects.equals(titolo, other.titolo)
				&& Objects.equals(unitaDurataContratto, other.unitaDurataContratto);
	}
}
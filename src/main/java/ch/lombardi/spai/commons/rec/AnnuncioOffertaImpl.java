package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: AnnuncioOffertaImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class AnnuncioOffertaImpl implements AnnuncioOfferta {

	/**
	 * UID: technical internal identification number(serialization).
	 */
	private static final long serialVersionUID = -1633804424445767997L;

	// VARIABLES
	private final Integer STATUS_OK = 200;
	private final Integer STATUS_ERROR = 404;
	private Integer status;
	private Integer annuncioId;
	private Integer offertaId;
	private Integer ordinamento;
	private String desc;
	private String errorDesc;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioOffertaImpl() {
		super();
	}

	/**
	 * Costructor of the offerta included in an annuncio.
	 * 
	 * @param annuncioId:    the ID_ANNUNCIO.
	 * @param offertaId:     the ID_OFFERTA.
	 * @param ordinamentoId: the ordinamento of the DESCRIZIONE.
	 * @param desc:          the DESCRIZIONE.
	 */
	public AnnuncioOffertaImpl(Integer annuncioId, Integer offertaId, Integer ordinamento, String desc) {
		super();
		this.status = STATUS_OK;
		this.annuncioId = annuncioId;
		this.offertaId = offertaId;
		this.ordinamento = ordinamento;
		this.desc = desc;
	}

	/**
	 * Method for the error. It uses two Strings.
	 * 
	 * @param errorCode: code of the error.
	 * @param errorDesc: description of the error.
	 */
	public AnnuncioOffertaImpl(String errorDesc) {
		this.status = STATUS_ERROR;
		this.errorDesc = errorDesc;
	}

	/**
	 * String for the Error Code
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the Error Code.
	 * 
	 * @param Error Code.
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * String for the Error Desc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}

	/**
	 * Sets the Error Desc.
	 * 
	 * @param Error Desc.
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_OFFERTA.
	 */
	public Integer getOffertaId() {
		return offertaId;
	}

	/**
	 * Gets the ORDINAMENTO.
	 */
	public Integer getOrdinamento() {
		return ordinamento;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
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
	 * Sets the ID_OFFERTA.
	 * 
	 * @param offertaId: the ID_OFFERTA.
	 */
	public void setOffertaId(Integer offertaId) {
		this.offertaId = offertaId;
	}

	/**
	 * Sets the ORDINAMENTO.
	 * 
	 * @param ordinamento: the ORDINAMENTO.
	 */
	public void setOrdinamento(Integer ordinamento) {
		this.ordinamento = ordinamento;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param desc: the DESCRIZIONE.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(STATUS_ERROR, STATUS_OK, annuncioId, desc, errorDesc, offertaId, ordinamento, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnnuncioOffertaImpl other = (AnnuncioOffertaImpl) obj;
		return Objects.equals(STATUS_ERROR, other.STATUS_ERROR) && Objects.equals(STATUS_OK, other.STATUS_OK)
				&& Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Objects.equals(errorDesc, other.errorDesc) && Objects.equals(offertaId, other.offertaId)
				&& Objects.equals(ordinamento, other.ordinamento) && Objects.equals(status, other.status);
	}
}
package ch.lombardi.spai.commons.notifications_group;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

import ch.lombardi.spai.commons.notifications.Status;
import ch.lombardi.spai.commons.notifications.Type;

/**
 * Default {@link NotificationAddresseeGruppi} implementation.
 * 
 * Java Class: NotificationAddresseeGruppiImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class NotificationAddresseeGruppiImpl implements NotificationAddresseeGruppi {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -3496036238676939077L;

	// VARIABLES
	private Integer sequence;
	private Type type;
	private Integer company;
	private String mail;
	private Status status;
	private LocalDateTime sentDateTime;
	private String error;
	private String errorMessageCode;
	private String evasa;

	/**
	 * getSequence
	 */
	@Override
	public Integer getSequence() {
		return sequence;
	}

	/**
	 * getType
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * getCompany
	 */
	@Override
	public Optional<Integer> getCompany() {
		return Optional.ofNullable(company);
	}

	/**
	 * getMail
	 */
	@Override
	public Optional<String> getMail() {
		return Optional.ofNullable(mail);
	}

	/**
	 * getStatus
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * getSentDateTime
	 */
	@Override
	public Optional<LocalDateTime> getSentDateTime() {
		return Optional.ofNullable(sentDateTime);
	}

	/**
	 * getError
	 */
	@Override
	public Optional<String> getError() {
		return Optional.ofNullable(error);
	}

	/**
	 * getErrorMessageCode
	 */
	@Override
	public Optional<String> getErrorMessageCode() {
		return Optional.ofNullable(errorMessageCode);
	}

	/**
	 * getEvasa
	 */
	@Override
	public Optional<String> getEvasa() {
		return Optional.ofNullable(evasa);
	}

	/**
	 * setSequence
	 * 
	 * @param sequence
	 */
	@JsonProperty("sequence")
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * setType
	 * 
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * setCompany
	 * 
	 * @param company
	 */
	public void setCompany(Integer company) {
		this.company = company;
	}

	/**
	 * setMail
	 * 
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * setStatus
	 * 
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * setSentDateTime
	 * 
	 * @param sentDateTime
	 */
	public void setSentDateTime(LocalDateTime sentDateTime) {
		this.sentDateTime = sentDateTime;
	}

	/**
	 * setError
	 * 
	 * @param error
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * setErrorMessageCode
	 * 
	 * @param errorMessageCode
	 */
	public void setErrorMessageCode(String errorMessageCode) {
		this.errorMessageCode = errorMessageCode;
	}

	/**
	 * setEvasa
	 * 
	 * @param evasa
	 */
	public void setEvasa(String evasa) {
		this.evasa = evasa;
	}

	/**
	 * Hash Code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(company, error, errorMessageCode, evasa, mail, sentDateTime, sequence, status, type);
	}

	/**
	 * Equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotificationAddresseeGruppiImpl other = (NotificationAddresseeGruppiImpl) obj;
		return Objects.equals(company, other.company) && Objects.equals(error, other.error)
				&& Objects.equals(errorMessageCode, other.errorMessageCode) && Objects.equals(evasa, other.evasa)
				&& Objects.equals(mail, other.mail) && Objects.equals(sentDateTime, other.sentDateTime)
				&& Objects.equals(sequence, other.sequence) && status == other.status && type == other.type;
	}
}
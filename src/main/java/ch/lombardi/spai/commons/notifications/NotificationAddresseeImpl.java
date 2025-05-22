package ch.lombardi.spai.commons.notifications;

import java.time.LocalDateTime;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Default {@link NotificationAddressee} implementation.
 * 
 * Java Class: NotificationAddresseeImpl.java
 * 
 * @author Domenico Lalla
 * @version 31.07.2024
 */
public class NotificationAddresseeImpl implements NotificationAddressee {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -3115079312528103902L;

	// VARIABLES
	private Integer sequence;
	private Type type;
	private Integer company;
	private String username;
	private Status status;
	private LocalDateTime sentDateTime;
	private String error;
	private String errorMessageCode;
	private String evasa;

	@Override
	public Integer getSequence() {
		return sequence;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public Optional<Integer> getCompany() {
		return Optional.ofNullable(company);
	}

	@Override
	public Optional<String> getUsername() {
		return Optional.ofNullable(username);
	}

	@Override
	public Status getStatus() {
		return status;
	}

	@Override
	public Optional<LocalDateTime> getSentDateTime() {
		return Optional.ofNullable(sentDateTime);
	}

	@Override
	public Optional<String> getError() {
		return Optional.ofNullable(error);
	}

	@Override
	public Optional<String> getErrorMessageCode() {
		return Optional.ofNullable(errorMessageCode);
	}

	@Override
	public Optional<String> getEvasa() {
		return Optional.ofNullable(evasa);
	}

	@JsonProperty("sequence")
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setCompany(Integer company) {
		this.company = company;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setSentDateTime(LocalDateTime sentDateTime) {
		this.sentDateTime = sentDateTime;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setErrorMessageCode(String errorMessageCode) {
		this.errorMessageCode = errorMessageCode;
	}

	public void setEvasa(String evasa) {
		this.evasa = evasa;
	}
}
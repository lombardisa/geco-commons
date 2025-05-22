package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: ErroriApiImpl.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
public class ErroriApiImpl implements ErroriApi {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 1383570345104264282L;

	// VARIABLES
	private Integer status;
	private String errorMessage;
	public static final int STATUS_204 = 204;
	public static final int STATUS_400 = 400;
	public static final int STATUS_404 = 404;
	public static final int STATUS_503 = 503;
	private final String MESS_204 = "Empty response.";
	private final String MESS_400 = "Bad input parameter. The entered language does not respect the correct syntax.";
	private final String MESS_404 = "Data not found.";
	private final String MESS_503 = "Service unavailable.";

	/**
	 * Default empty constructor.
	 */
	public ErroriApiImpl() {
		super();
	}

	/**
	 * Constructor of the API's error code & message.
	 * 
	 * @param status: the API's error code (status).
	 */
	public ErroriApiImpl(Integer status) {
		super();
		this.status = status;
		// this.errorMessage = errorMessage;
		// SWITCH CASE: STATUS & ERROR MESSAGE
		switch (status) {
		case STATUS_204:
			this.errorMessage = MESS_204;
			break;
		case STATUS_400:
			this.errorMessage = MESS_400;
			break;
		case STATUS_404:
			this.errorMessage = MESS_404;
			break;
		case STATUS_503:
			this.errorMessage = MESS_503;
			break;
		}
	}

	/**
	 * Gets the error code (status).
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the error code (status).
	 * 
	 * @param errorCode: the error code (status).
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Gets the error message.
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the error message.
	 * 
	 * @param errorMessage: the error message.
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(status, errorMessage);
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
		ErroriApiImpl other = (ErroriApiImpl) obj;
		return Objects.equals(status, other.status) && Objects.equals(errorMessage, other.errorMessage);
	}
}
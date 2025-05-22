package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: ErroriApi.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = ErroriApiImpl.class)
public interface ErroriApi extends Serializable {

	/**
	 * Returns the error's code (status).
	 * 
	 * @return the error's code (status).
	 */
	Integer getStatus();

	/**
	 * Returns the error's message.
	 * 
	 * @return the error's message.
	 */
	String getErrorMessage();
}
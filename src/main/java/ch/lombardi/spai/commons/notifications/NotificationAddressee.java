package ch.lombardi.spai.commons.notifications;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Notification addressee.
 * 
 * Java Interface: NotificationAddressee.java
 * 
 * @author Domenico Lalla
 * @version 31.07.2024
 */
@JsonDeserialize(as = NotificationAddresseeImpl.class)
public interface NotificationAddressee extends Serializable {

	/**
	 * Get the addressee sequence.
	 * 
	 * @return Addressee sequence.
	 */
	Integer getSequence();

	/**
	 * Get the notification type.
	 * 
	 * @return Notification type
	 */
	Type getType();

	/**
	 * If the notification is addressed to all users of a company, get the company
	 * id.
	 * 
	 * @return Optional company id
	 */
	Optional<Integer> getCompany();

	/**
	 * If the notification is addressed to a specific user, get the username.
	 * 
	 * @return Optional username
	 */
	Optional<String> getUsername();

	/**
	 * Get the notification status.
	 * 
	 * @return The notification status
	 */
	Status getStatus();

	/**
	 * If the notification was sent, get the sending date and time.
	 * 
	 * @return Optional sending date and time
	 */
	Optional<LocalDateTime> getSentDateTime();

	/**
	 * If the notification status is {@link Status#ERROR}, get the error
	 * description.
	 * 
	 * @return Optional error description
	 */
	Optional<String> getError();

	/**
	 * If the notification status is {@link Status#ERROR}, get the error
	 * localization message code.
	 * 
	 * @return Optional error localization message code
	 */
	Optional<String> getErrorMessageCode();

	/**
	 * Returns the notification status evasa (S/N)
	 * 
	 * @return The status evasa
	 */
	Optional<String> getEvasa();
}
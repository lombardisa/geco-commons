package ch.lombardi.spai.commons.notifications;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ch.lombardi.spai.commons.notifications_group.NotificationAddresseeGruppi;

/**
 * Notification.
 */
@JsonDeserialize(as = NotificationImpl.class)
public interface Notification extends Serializable {

	/**
	 * Get the notification id.
	 * 
	 * @return The notification id
	 */
	Integer getId();

	/**
	 * Get the notification category.
	 * 
	 * @return Notification category
	 */
	Category getCategory();

	/**
	 * Get the notification date and time.
	 * 
	 * @return Notification date and time
	 */
	LocalDateTime getDateTime();

	/**
	 * Get the notification sender.
	 * <p>
	 * The sender data must be intepreted according to the {@link SenderType}.
	 * </p>
	 * 
	 * @return The notification sender
	 */
	String getSender();

	/**
	 * Get the notification sender type.
	 * 
	 * @return The notification sender type
	 */
	SenderType getSenderType();

	/**
	 * Get the notification title.
	 * 
	 * @return The notification title
	 */
	String getTitle();

	/**
	 * Get the notification title localization message code.
	 * 
	 * @return Optional notification title localization message code
	 */
	Optional<String> getTitleMessageCode();

	/**
	 * Get the notification text.
	 * 
	 * @return The notification text
	 */
	String getText();

	/**
	 * Get the notification text localization message code.
	 * 
	 * @return Optional notification text localization message code
	 */
	Optional<String> getTextMessageCode();

	/**
	 * Get the notification link.
	 * 
	 * @return Optional notification link
	 */
	Optional<String> getLink();

	/**
	 * Get the notification addressees.
	 * 
	 * @return The notification addressees
	 */
	List<NotificationAddressee> getAddressees();

	/**
	 * Get the notification addressees gruppi.
	 * 
	 * @return The notification addressees gruppi
	 */
	List<NotificationAddresseeGruppi> getAddresseesGruppi();

	/**
	 * Get the notification entity name.
	 * 
	 * @return Notification entity name
	 */
	Optional<String> getEntityName();

	/**
	 * Get the notification entity id.
	 * 
	 * @return The notification entity id
	 */
	Optional<Integer> getEntityId();

	/**
	 * Get the notification action.
	 * 
	 * @return Notification action
	 */
	Optional<Action> getAction();

	/**
	 * Get the corresponding module.
	 * 
	 * @return Notification module
	 */
	Optional<String> getModule();

	Optional<Integer> getCompanyId();

	Integer getDelayDays();

}


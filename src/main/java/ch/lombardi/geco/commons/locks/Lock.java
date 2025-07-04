package ch.lombardi.geco.commons.locks;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Acquired lock representation.
 */
@JsonDeserialize(as = LockImpl.class)
public interface Lock extends Serializable {

	/**
	 * The lock owner id.
	 * <p>
	 * Tipically, the username to which the lock was granted.
	 * </p>
	 * 
	 * @return The lock owner id
	 */
	Integer getOwnerId();

	/**
	 * Get the locked entity id.
	 * 
	 * @return The locked entity id
	 */
	Integer getEntityId();

	/**
	 * Get the lock acquisition date and time.
	 * 
	 * @return The lock acquisition date and time
	 */
	LocalDateTime getTimeStamp();
}
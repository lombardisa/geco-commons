package ch.lombardi.geco.commons.locks;

import java.time.LocalDateTime;

/**
 * Default {@link Lock} implementation.
 */
public class LockImpl implements Lock {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -9015960979692928667L;

	// VARIABLES
	private Integer ownerId;
	private Integer entityId;
	private LocalDateTime timeStamp;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public LockImpl() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param entityId  The locked entity id (not null)
	 * @param timeStamp The lock acquisition date and time (not null)
	 */
	public LockImpl(Integer ownerId, Integer entityId, LocalDateTime timeStamp) {
		super();
		this.ownerId = ownerId;
		this.entityId = entityId;
		this.timeStamp = timeStamp;
	}

	@Override
	public Integer getOwnerId() {
		return ownerId;
	}

	@Override
	public Integer getEntityId() {
		return entityId;
	}

	@Override
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setOwner(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
		result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LockImpl other = (LockImpl) obj;
		if (entityId == null) {
			if (other.entityId != null)
				return false;
		} else if (!entityId.equals(other.entityId))
			return false;
		if (ownerId == null) {
			return other.ownerId == null;
		} else return ownerId.equals(other.ownerId);
	}
}
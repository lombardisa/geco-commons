package ch.lombardi.spai.commons.locks;

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
	private String owner;
	private String entityName;
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
	 * @param owner      The lock owner id (not null)
	 * @param entityName The locked entity name (not null)
	 * @param entityId   The locked entity id (not null)
	 * @param timeStamp  The lock acquisition date and time (not null)
	 */
	public LockImpl(String owner, String entityName, Integer entityId, LocalDateTime timeStamp) {
		super();
		this.owner = owner;
		this.entityName = entityName;
		this.entityId = entityId;
		this.timeStamp = timeStamp;
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public String getEntityName() {
		return entityName;
	}

	@Override
	public Integer getEntityId() {
		return entityId;
	}

	@Override
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
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
		result = prime * result + ((entityName == null) ? 0 : entityName.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		if (entityName == null) {
			if (other.entityName != null)
				return false;
		} else if (!entityName.equals(other.entityName))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
}
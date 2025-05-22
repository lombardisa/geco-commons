package ch.lombardi.spai.commons.notifications;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import ch.lombardi.spai.commons.notifications_group.NotificationAddresseeGruppi;

/**
 * Default {@link Notification} implementation.
 */
public class NotificationImpl implements Notification {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 5876897266373084585L;

	// VARIABLES
	private Integer id;
	private Category category;
	private LocalDateTime dateTime;
	private String sender;
	private SenderType senderType;
	private String title;
	private String titleMessageCode;
	private String text;
	private String textMessageCode;
	private String link;
	private List<NotificationAddressee> addressees;
	private List<NotificationAddresseeGruppi> addresseesGruppi;
	private String entityName;
	private Integer entityId;
	private Action action;
	private String module;
	private Integer companyId;
	private Integer delayDays;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public String getSender() {
		return sender;
	}

	@Override
	public SenderType getSenderType() {
		return senderType;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Optional<String> getTitleMessageCode() {
		return Optional.ofNullable(titleMessageCode);
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public Optional<String> getTextMessageCode() {
		return Optional.ofNullable(textMessageCode);
	}

	@Override
	public Optional<String> getLink() {
		return Optional.ofNullable(link);
	}

	@Override
	public List<NotificationAddressee> getAddressees() {
		if (addressees != null) {
			return addressees;
		}
		return Collections.emptyList();
	}

	@Override
	public List<NotificationAddresseeGruppi> getAddresseesGruppi() {
		if (addresseesGruppi != null) {
			return addresseesGruppi;
		}
		return Collections.emptyList();
	}

	@Override
	public Optional<String> getEntityName() {
		return Optional.ofNullable(entityName);
	}

	@Override
	public Optional<Integer> getEntityId() {
		return Optional.ofNullable(entityId);
	}

	@Override
	public Optional<Action> getAction() {
		return Optional.ofNullable(action);
	}

	@Override
	public Optional<String> getModule() {
		return Optional.ofNullable(module);
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setSenderType(SenderType senderType) {
		this.senderType = senderType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitleMessageCode(String titleMessageCode) {
		this.titleMessageCode = titleMessageCode;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTextMessageCode(String textMessageCode) {
		this.textMessageCode = textMessageCode;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setAddresseesGruppi(List<NotificationAddresseeGruppi> addresseesGruppi) {
		this.addresseesGruppi = addresseesGruppi;
	}

	public void setAddressees(List<NotificationAddressee> addressees) {
		this.addressees = addressees;
	}

	public void addAddressee(NotificationAddressee addressee) {
		if (addressee != null) {
			if (addressees == null) {
				addressees = new LinkedList<>();
			}
			addressees.add(addressee);
		}
	}

	public void addAddresseeGruppi(NotificationAddresseeGruppi addresseeGruppi) {
		if (addresseeGruppi != null) {
			if (addresseesGruppi == null) {
				addresseesGruppi = new LinkedList<>();
			}
			addresseesGruppi.add(addresseeGruppi);
		}
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Optional<Integer> getCompanyId() {
		return Optional.ofNullable(companyId);
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getDelayDays() {
		return delayDays;
	}

	public void setDelayDays(Integer delayDays) {
		this.delayDays = delayDays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		NotificationImpl other = (NotificationImpl) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
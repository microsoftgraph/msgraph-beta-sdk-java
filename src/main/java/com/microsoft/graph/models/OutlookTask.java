package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutlookTask extends OutlookItem implements Parsable {
    /** The name of the person who has been assigned the task in Outlook. Read-only. */
    private String _assignedTo;
    /** The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the task.  Read-only. Nullable. */
    private java.util.List<Attachment> _attachments;
    /** The task body that typically contains information about the task. Note that only HTML type is supported. */
    private ItemBody _body;
    /** The date in the specified time zone that the task was finished. */
    private DateTimeTimeZone _completedDateTime;
    /** The date in the specified time zone that the task is to be finished. */
    private DateTimeTimeZone _dueDateTime;
    /** Set to true if the task has attachments. */
    private Boolean _hasAttachments;
    /** The importance property */
    private Importance _importance;
    /** The isReminderOn property */
    private Boolean _isReminderOn;
    /** The collection of multi-value extended properties defined for the task. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The owner property */
    private String _owner;
    /** The parentFolderId property */
    private String _parentFolderId;
    /** The recurrence property */
    private PatternedRecurrence _recurrence;
    /** The reminderDateTime property */
    private DateTimeTimeZone _reminderDateTime;
    /** The sensitivity property */
    private Sensitivity _sensitivity;
    /** The collection of single-value extended properties defined for the task. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /** The startDateTime property */
    private DateTimeTimeZone _startDateTime;
    /** The status property */
    private TaskStatus _status;
    /** The subject property */
    private String _subject;
    /**
     * Instantiates a new outlookTask and sets the default values.
     * @return a void
     */
    public OutlookTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookTask
     */
    @javax.annotation.Nonnull
    public static OutlookTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookTask();
    }
    /**
     * Gets the assignedTo property value. The name of the person who has been assigned the task in Outlook. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the attachments property value. The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the task.  Read-only. Nullable.
     * @return a attachment
     */
    @javax.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this._attachments;
    }
    /**
     * Gets the body property value. The task body that typically contains information about the task. Note that only HTML type is supported.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the completedDateTime property value. The date in the specified time zone that the task was finished.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getDueDateTime() {
        return this._dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutlookTask currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignedTo", (n) -> { currentObject.setAssignedTo(n.getStringValue()); });
            this.put("attachments", (n) -> { currentObject.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
            this.put("body", (n) -> { currentObject.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("dueDateTime", (n) -> { currentObject.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
            this.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(Importance.class)); });
            this.put("isReminderOn", (n) -> { currentObject.setIsReminderOn(n.getBooleanValue()); });
            this.put("multiValueExtendedProperties", (n) -> { currentObject.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("owner", (n) -> { currentObject.setOwner(n.getStringValue()); });
            this.put("parentFolderId", (n) -> { currentObject.setParentFolderId(n.getStringValue()); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("reminderDateTime", (n) -> { currentObject.setReminderDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("sensitivity", (n) -> { currentObject.setSensitivity(n.getEnumValue(Sensitivity.class)); });
            this.put("singleValueExtendedProperties", (n) -> { currentObject.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(TaskStatus.class)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hasAttachments property value. Set to true if the task has attachments.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a importance
     */
    @javax.annotation.Nullable
    public Importance getImportance() {
        return this._importance;
    }
    /**
     * Gets the isReminderOn property value. The isReminderOn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this._isReminderOn;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the owner property value. The owner property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this._owner;
    }
    /**
     * Gets the parentFolderId property value. The parentFolderId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentFolderId() {
        return this._parentFolderId;
    }
    /**
     * Gets the recurrence property value. The recurrence property
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the reminderDateTime property value. The reminderDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getReminderDateTime() {
        return this._reminderDateTime;
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a sensitivity
     */
    @javax.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this._sensitivity;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a taskStatus
     */
    @javax.annotation.Nullable
    public TaskStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeObjectValue("body", this.getBody());
        writer.writeObjectValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeBooleanValue("isReminderOn", this.getIsReminderOn());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("reminderDateTime", this.getReminderDateTime());
        writer.writeEnumValue("sensitivity", this.getSensitivity());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the assignedTo property value. The name of the person who has been assigned the task in Outlook. Read-only.
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the attachments property value. The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the task.  Read-only. Nullable.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this._attachments = value;
    }
    /**
     * Sets the body property value. The task body that typically contains information about the task. Note that only HTML type is supported.
     * @param value Value to set for the body property.
     * @return a void
     */
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the completedDateTime property value. The date in the specified time zone that the task was finished.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    public void setDueDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the hasAttachments property value. Set to true if the task has attachments.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this._importance = value;
    }
    /**
     * Sets the isReminderOn property value. The isReminderOn property
     * @param value Value to set for the isReminderOn property.
     * @return a void
     */
    public void setIsReminderOn(@javax.annotation.Nullable final Boolean value) {
        this._isReminderOn = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     * @return a void
     */
    public void setOwner(@javax.annotation.Nullable final String value) {
        this._owner = value;
    }
    /**
     * Sets the parentFolderId property value. The parentFolderId property
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    public void setParentFolderId(@javax.annotation.Nullable final String value) {
        this._parentFolderId = value;
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the reminderDateTime property value. The reminderDateTime property
     * @param value Value to set for the reminderDateTime property.
     * @return a void
     */
    public void setReminderDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._reminderDateTime = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     * @return a void
     */
    public void setSensitivity(@javax.annotation.Nullable final Sensitivity value) {
        this._sensitivity = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final TaskStatus value) {
        this._status = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}

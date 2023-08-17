package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutlookTask extends OutlookItem implements Parsable {
    /**
     * The name of the person who has been assigned the task in Outlook. Read-only.
     */
    private String assignedTo;
    /**
     * The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the task.  Read-only. Nullable.
     */
    private java.util.List<Attachment> attachments;
    /**
     * The task body that typically contains information about the task. Note that only HTML type is supported.
     */
    private ItemBody body;
    /**
     * The date in the specified time zone that the task was finished.
     */
    private DateTimeTimeZone completedDateTime;
    /**
     * The date in the specified time zone that the task is to be finished.
     */
    private DateTimeTimeZone dueDateTime;
    /**
     * Set to true if the task has attachments.
     */
    private Boolean hasAttachments;
    /**
     * The importance property
     */
    private Importance importance;
    /**
     * The isReminderOn property
     */
    private Boolean isReminderOn;
    /**
     * The collection of multi-value extended properties defined for the task. Read-only. Nullable.
     */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /**
     * The owner property
     */
    private String owner;
    /**
     * The parentFolderId property
     */
    private String parentFolderId;
    /**
     * The recurrence property
     */
    private PatternedRecurrence recurrence;
    /**
     * The reminderDateTime property
     */
    private DateTimeTimeZone reminderDateTime;
    /**
     * The sensitivity property
     */
    private Sensitivity sensitivity;
    /**
     * The collection of single-value extended properties defined for the task. Read-only. Nullable.
     */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * The startDateTime property
     */
    private DateTimeTimeZone startDateTime;
    /**
     * The status property
     */
    private TaskStatus status;
    /**
     * The subject property
     */
    private String subject;
    /**
     * Instantiates a new outlookTask and sets the default values.
     */
    public OutlookTask() {
        super();
        this.setOdataType("#microsoft.graph.outlookTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookTask
     */
    @jakarta.annotation.Nonnull
    public static OutlookTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookTask();
    }
    /**
     * Gets the assignedTo property value. The name of the person who has been assigned the task in Outlook. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the attachments property value. The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the task.  Read-only. Nullable.
     * @return a attachment
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the body property value. The task body that typically contains information about the task. Note that only HTML type is supported.
     * @return a itemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the completedDateTime property value. The date in the specified time zone that the task was finished.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("isReminderOn", (n) -> { this.setIsReminderOn(n.getBooleanValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("reminderDateTime", (n) -> { this.setReminderDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getEnumValue(Sensitivity.class)); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(TaskStatus.class)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. Set to true if the task has attachments.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a importance
     */
    @jakarta.annotation.Nullable
    public Importance getImportance() {
        return this.importance;
    }
    /**
     * Gets the isReminderOn property value. The isReminderOn property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this.isReminderOn;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the owner property value. The owner property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the parentFolderId property value. The parentFolderId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.parentFolderId;
    }
    /**
     * Gets the recurrence property value. The recurrence property
     * @return a patternedRecurrence
     */
    @jakarta.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.recurrence;
    }
    /**
     * Gets the reminderDateTime property value. The reminderDateTime property
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getReminderDateTime() {
        return this.reminderDateTime;
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a sensitivity
     */
    @jakarta.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this.sensitivity;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a taskStatus
     */
    @jakarta.annotation.Nullable
    public TaskStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.assignedTo = value;
    }
    /**
     * Sets the attachments property value. The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the task.  Read-only. Nullable.
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<Attachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the body property value. The task body that typically contains information about the task. Note that only HTML type is supported.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the completedDateTime property value. The date in the specified time zone that the task was finished.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the hasAttachments property value. Set to true if the task has attachments.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final Importance value) {
        this.importance = value;
    }
    /**
     * Sets the isReminderOn property value. The isReminderOn property
     * @param value Value to set for the isReminderOn property.
     */
    public void setIsReminderOn(@jakarta.annotation.Nullable final Boolean value) {
        this.isReminderOn = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the parentFolderId property value. The parentFolderId property
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.parentFolderId = value;
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.recurrence = value;
    }
    /**
     * Sets the reminderDateTime property value. The reminderDateTime property
     * @param value Value to set for the reminderDateTime property.
     */
    public void setReminderDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.reminderDateTime = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final Sensitivity value) {
        this.sensitivity = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final TaskStatus value) {
        this.status = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}

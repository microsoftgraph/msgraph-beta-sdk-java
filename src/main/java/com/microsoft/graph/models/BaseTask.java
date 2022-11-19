package com.microsoft.graph.models;

import com.microsoft.graph.models.Task;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class BaseTask extends Entity implements Parsable {
    /** The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'. */
    private OffsetDateTime _bodyLastModifiedDateTime;
    /** A collection of smaller subtasks linked to the more complex parent task. */
    private java.util.List<ChecklistItem> _checklistItems;
    /** The date when the task was finished. */
    private OffsetDateTime _completedDateTime;
    /** The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'. */
    private OffsetDateTime _createdDateTime;
    /** The name of the task. */
    private String _displayName;
    /** The date in the specified time zone that the task is to be finished. */
    private DateTimeTimeZone _dueDateTime;
    /** The collection of open extensions defined for the task . */
    private java.util.List<Extension> _extensions;
    /** The importance property */
    private Importance _importance;
    /** The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'. */
    private OffsetDateTime _lastModifiedDateTime;
    /** A collection of resources linked to the task. */
    private java.util.List<LinkedResource_v2> _linkedResources;
    /** The list which contains the task. */
    private BaseTaskList _parentList;
    /** The recurrence pattern for the task. */
    private PatternedRecurrence _recurrence;
    /** The date in the specified time zone when the task is to begin. */
    private DateTimeTimeZone _startDateTime;
    /** The status property */
    private TaskStatus_v2 _status;
    /** The task body in text format that typically contains information about the task. */
    private String _textBody;
    /** The viewpoint property */
    private TaskViewpoint _viewpoint;
    /**
     * Instantiates a new baseTask and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BaseTask() {
        super();
        this.setOdataType("#microsoft.graph.baseTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a baseTask
     */
    @javax.annotation.Nonnull
    public static BaseTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.task": return new Task();
            }
        }
        return new BaseTask();
    }
    /**
     * Gets the bodyLastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBodyLastModifiedDateTime() {
        return this._bodyLastModifiedDateTime;
    }
    /**
     * Gets the checklistItems property value. A collection of smaller subtasks linked to the more complex parent task.
     * @return a checklistItem
     */
    @javax.annotation.Nullable
    public java.util.List<ChecklistItem> getChecklistItems() {
        return this._checklistItems;
    }
    /**
     * Gets the completedDateTime property value. The date when the task was finished.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The name of the task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
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
     * Gets the extensions property value. The collection of open extensions defined for the task .
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BaseTask currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bodyLastModifiedDateTime", (n) -> { currentObject.setBodyLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("checklistItems", (n) -> { currentObject.setChecklistItems(n.getCollectionOfObjectValues(ChecklistItem::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { currentObject.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("linkedResources", (n) -> { currentObject.setLinkedResources(n.getCollectionOfObjectValues(LinkedResource_v2::createFromDiscriminatorValue)); });
        deserializerMap.put("parentList", (n) -> { currentObject.setParentList(n.getObjectValue(BaseTaskList::createFromDiscriminatorValue)); });
        deserializerMap.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(TaskStatus_v2.class)); });
        deserializerMap.put("textBody", (n) -> { currentObject.setTextBody(n.getStringValue()); });
        deserializerMap.put("viewpoint", (n) -> { currentObject.setViewpoint(n.getObjectValue(TaskViewpoint::createFromDiscriminatorValue)); });
        return deserializerMap
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
     * Gets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the linkedResources property value. A collection of resources linked to the task.
     * @return a linkedResource_v2
     */
    @javax.annotation.Nullable
    public java.util.List<LinkedResource_v2> getLinkedResources() {
        return this._linkedResources;
    }
    /**
     * Gets the parentList property value. The list which contains the task.
     * @return a baseTaskList
     */
    @javax.annotation.Nullable
    public BaseTaskList getParentList() {
        return this._parentList;
    }
    /**
     * Gets the recurrence property value. The recurrence pattern for the task.
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the startDateTime property value. The date in the specified time zone when the task is to begin.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a taskStatus_v2
     */
    @javax.annotation.Nullable
    public TaskStatus_v2 getStatus() {
        return this._status;
    }
    /**
     * Gets the textBody property value. The task body in text format that typically contains information about the task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTextBody() {
        return this._textBody;
    }
    /**
     * Gets the viewpoint property value. The viewpoint property
     * @return a taskViewpoint
     */
    @javax.annotation.Nullable
    public TaskViewpoint getViewpoint() {
        return this._viewpoint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("bodyLastModifiedDateTime", this.getBodyLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("checklistItems", this.getChecklistItems());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("linkedResources", this.getLinkedResources());
        writer.writeObjectValue("parentList", this.getParentList());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("textBody", this.getTextBody());
        writer.writeObjectValue("viewpoint", this.getViewpoint());
    }
    /**
     * Sets the bodyLastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the bodyLastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._bodyLastModifiedDateTime = value;
    }
    /**
     * Sets the checklistItems property value. A collection of smaller subtasks linked to the more complex parent task.
     * @param value Value to set for the checklistItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChecklistItems(@javax.annotation.Nullable final java.util.List<ChecklistItem> value) {
        this._checklistItems = value;
    }
    /**
     * Sets the completedDateTime property value. The date when the task was finished.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The name of the task.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task .
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this._importance = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the linkedResources property value. A collection of resources linked to the task.
     * @param value Value to set for the linkedResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinkedResources(@javax.annotation.Nullable final java.util.List<LinkedResource_v2> value) {
        this._linkedResources = value;
    }
    /**
     * Sets the parentList property value. The list which contains the task.
     * @param value Value to set for the parentList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentList(@javax.annotation.Nullable final BaseTaskList value) {
        this._parentList = value;
    }
    /**
     * Sets the recurrence property value. The recurrence pattern for the task.
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the startDateTime property value. The date in the specified time zone when the task is to begin.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final TaskStatus_v2 value) {
        this._status = value;
    }
    /**
     * Sets the textBody property value. The task body in text format that typically contains information about the task.
     * @param value Value to set for the textBody property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTextBody(@javax.annotation.Nullable final String value) {
        this._textBody = value;
    }
    /**
     * Sets the viewpoint property value. The viewpoint property
     * @param value Value to set for the viewpoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setViewpoint(@javax.annotation.Nullable final TaskViewpoint value) {
        this._viewpoint = value;
    }
}

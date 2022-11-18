package com.microsoft.graph.models;

import com.microsoft.graph.models.AppVulnerabilityTask;
import com.microsoft.graph.models.SecurityConfigurationTask;
import com.microsoft.graph.models.UnmanagedDeviceDiscoveryTask;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A device app management task. */
public class DeviceAppManagementTask extends Entity implements Parsable {
    /** The name or email of the admin this task is assigned to. */
    private String _assignedTo;
    /** Device app management task category. */
    private DeviceAppManagementTaskCategory _category;
    /** The created date. */
    private OffsetDateTime _createdDateTime;
    /** The email address of the creator. */
    private String _creator;
    /** Notes from the creator. */
    private String _creatorNotes;
    /** The description. */
    private String _description;
    /** The name. */
    private String _displayName;
    /** The due date. */
    private OffsetDateTime _dueDateTime;
    /** Device app management task priority. */
    private DeviceAppManagementTaskPriority _priority;
    /** Device app management task status. */
    private DeviceAppManagementTaskStatus _status;
    /**
     * Instantiates a new deviceAppManagementTask and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagementTask() {
        super();
        this.setOdataType("#microsoft.graph.deviceAppManagementTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAppManagementTask
     */
    @javax.annotation.Nonnull
    public static DeviceAppManagementTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.appVulnerabilityTask": return new AppVulnerabilityTask();
                case "#microsoft.graph.securityConfigurationTask": return new SecurityConfigurationTask();
                case "#microsoft.graph.unmanagedDeviceDiscoveryTask": return new UnmanagedDeviceDiscoveryTask();
            }
        }
        return new DeviceAppManagementTask();
    }
    /**
     * Gets the assignedTo property value. The name or email of the admin this task is assigned to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the category property value. Device app management task category.
     * @return a deviceAppManagementTaskCategory
     */
    @javax.annotation.Nullable
    public DeviceAppManagementTaskCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the createdDateTime property value. The created date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the creator property value. The email address of the creator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreator() {
        return this._creator;
    }
    /**
     * Gets the creatorNotes property value. Notes from the creator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatorNotes() {
        return this._creatorNotes;
    }
    /**
     * Gets the description property value. The description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the dueDateTime property value. The due date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this._dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceAppManagementTask currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignedTo", (n) -> { currentObject.setAssignedTo(n.getStringValue()); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(DeviceAppManagementTaskCategory.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("creator", (n) -> { currentObject.setCreator(n.getStringValue()); });
            this.put("creatorNotes", (n) -> { currentObject.setCreatorNotes(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("dueDateTime", (n) -> { currentObject.setDueDateTime(n.getOffsetDateTimeValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getEnumValue(DeviceAppManagementTaskPriority.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DeviceAppManagementTaskStatus.class)); });
        }};
    }
    /**
     * Gets the priority property value. Device app management task priority.
     * @return a deviceAppManagementTaskPriority
     */
    @javax.annotation.Nullable
    public DeviceAppManagementTaskPriority getPriority() {
        return this._priority;
    }
    /**
     * Gets the status property value. Device app management task status.
     * @return a deviceAppManagementTaskStatus
     */
    @javax.annotation.Nullable
    public DeviceAppManagementTaskStatus getStatus() {
        return this._status;
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
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("creator", this.getCreator());
        writer.writeStringValue("creatorNotes", this.getCreatorNotes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the assignedTo property value. The name or email of the admin this task is assigned to.
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the category property value. Device app management task category.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final DeviceAppManagementTaskCategory value) {
        this._category = value;
    }
    /**
     * Sets the createdDateTime property value. The created date.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the creator property value. The email address of the creator.
     * @param value Value to set for the creator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreator(@javax.annotation.Nullable final String value) {
        this._creator = value;
    }
    /**
     * Sets the creatorNotes property value. Notes from the creator.
     * @param value Value to set for the creatorNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatorNotes(@javax.annotation.Nullable final String value) {
        this._creatorNotes = value;
    }
    /**
     * Sets the description property value. The description.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the dueDateTime property value. The due date.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the priority property value. Device app management task priority.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final DeviceAppManagementTaskPriority value) {
        this._priority = value;
    }
    /**
     * Sets the status property value. Device app management task status.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DeviceAppManagementTaskStatus value) {
        this._status = value;
    }
}

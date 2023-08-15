package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A device app management task.
 */
public class DeviceAppManagementTask extends Entity implements Parsable {
    /**
     * The name or email of the admin this task is assigned to.
     */
    private String assignedTo;
    /**
     * Device app management task category.
     */
    private DeviceAppManagementTaskCategory category;
    /**
     * The created date.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The email address of the creator.
     */
    private String creator;
    /**
     * Notes from the creator.
     */
    private String creatorNotes;
    /**
     * The description.
     */
    private String description;
    /**
     * The name.
     */
    private String displayName;
    /**
     * The due date.
     */
    private OffsetDateTime dueDateTime;
    /**
     * Device app management task priority.
     */
    private DeviceAppManagementTaskPriority priority;
    /**
     * Device app management task status.
     */
    private DeviceAppManagementTaskStatus status;
    /**
     * Instantiates a new deviceAppManagementTask and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagementTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAppManagementTask
     */
    @jakarta.annotation.Nonnull
    public static DeviceAppManagementTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the category property value. Device app management task category.
     * @return a deviceAppManagementTaskCategory
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagementTaskCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the createdDateTime property value. The created date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the creator property value. The email address of the creator.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreator() {
        return this.creator;
    }
    /**
     * Gets the creatorNotes property value. Notes from the creator.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatorNotes() {
        return this.creatorNotes;
    }
    /**
     * Gets the description property value. The description.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the dueDateTime property value. The due date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
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
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(DeviceAppManagementTaskCategory.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creator", (n) -> { this.setCreator(n.getStringValue()); });
        deserializerMap.put("creatorNotes", (n) -> { this.setCreatorNotes(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(DeviceAppManagementTaskPriority.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceAppManagementTaskStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. Device app management task priority.
     * @return a deviceAppManagementTaskPriority
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagementTaskPriority getPriority() {
        return this.priority;
    }
    /**
     * Gets the status property value. Device app management task status.
     * @return a deviceAppManagementTaskStatus
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagementTaskStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.assignedTo = value;
    }
    /**
     * Sets the category property value. Device app management task category.
     * @param value Value to set for the category property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCategory(@jakarta.annotation.Nullable final DeviceAppManagementTaskCategory value) {
        this.category = value;
    }
    /**
     * Sets the createdDateTime property value. The created date.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the creator property value. The email address of the creator.
     * @param value Value to set for the creator property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreator(@jakarta.annotation.Nullable final String value) {
        this.creator = value;
    }
    /**
     * Sets the creatorNotes property value. Notes from the creator.
     * @param value Value to set for the creatorNotes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatorNotes(@jakarta.annotation.Nullable final String value) {
        this.creatorNotes = value;
    }
    /**
     * Sets the description property value. The description.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the dueDateTime property value. The due date.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the priority property value. Device app management task priority.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPriority(@jakarta.annotation.Nullable final DeviceAppManagementTaskPriority value) {
        this.priority = value;
    }
    /**
     * Sets the status property value. Device app management task status.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final DeviceAppManagementTaskStatus value) {
        this.status = value;
    }
}

package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Task extends CaseManagementEntity implements Parsable {
    /**
     * Instantiates a new {@link Task} and sets the default values.
     */
    public Task() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.task");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Task}
     */
    @jakarta.annotation.Nonnull
    public static Task createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Task();
    }
    /**
     * Gets the assignedTo property value. The user assigned to the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link CaseTaskCategory}
     */
    @jakarta.annotation.Nullable
    public CaseTaskCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the closingNotes property value. Notes recorded when the task is completed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClosingNotes() {
        return this.backingStore.get("closingNotes");
    }
    /**
     * Gets the description property value. The description of the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The title of the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the dueDateTime property value. The target completion date and time for the task.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(CaseTaskCategory::forValue)); });
        deserializerMap.put("closingNotes", (n) -> { this.setClosingNotes(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(CaseTaskPriority::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(TaskStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link CaseTaskPriority}
     */
    @jakarta.annotation.Nullable
    public CaseTaskPriority getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link TaskStatus}
     */
    @jakarta.annotation.Nullable
    public TaskStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("closingNotes", this.getClosingNotes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the assignedTo property value. The user assigned to the task.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final CaseTaskCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the closingNotes property value. Notes recorded when the task is completed.
     * @param value Value to set for the closingNotes property.
     */
    public void setClosingNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("closingNotes", value);
    }
    /**
     * Sets the description property value. The description of the task.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The title of the task.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the dueDateTime property value. The target completion date and time for the task.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final CaseTaskPriority value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final TaskStatus value) {
        this.backingStore.set("status", value);
    }
}

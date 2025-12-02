package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantMigrationTask extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CrossTenantMigrationTask} and sets the default values.
     */
    public CrossTenantMigrationTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CrossTenantMigrationTask}
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantMigrationTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantMigrationTask();
    }
    /**
     * Gets the currentStatus property value. Most recent status of this migration task
     * @return a {@link java.util.List<CrossTenantMigrationServiceStatusDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CrossTenantMigrationServiceStatusDetails> getCurrentStatus() {
        return this.backingStore.get("currentStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("currentStatus", (n) -> { this.setCurrentStatus(n.getCollectionOfObjectValues(CrossTenantMigrationServiceStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("taskType", (n) -> { this.setTaskType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Time the task was last updated
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the taskType property value. Type of migration task. Only Users are supported at this time.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaskType() {
        return this.backingStore.get("taskType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("currentStatus", this.getCurrentStatus());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("taskType", this.getTaskType());
    }
    /**
     * Sets the currentStatus property value. Most recent status of this migration task
     * @param value Value to set for the currentStatus property.
     */
    public void setCurrentStatus(@jakarta.annotation.Nullable final java.util.List<CrossTenantMigrationServiceStatusDetails> value) {
        this.backingStore.set("currentStatus", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Time the task was last updated
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the taskType property value. Type of migration task. Only Users are supported at this time.
     * @param value Value to set for the taskType property.
     */
    public void setTaskType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taskType", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The entity represents an group policy operation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyOperation} and sets the default values.
     */
    public GroupPolicyOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyOperation}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operationStatus", (n) -> { this.setOperationStatus(n.getEnumValue(GroupPolicyOperationStatus::forValue)); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(GroupPolicyOperationType::forValue)); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the operationStatus property value. Type of Group Policy operation status.
     * @return a {@link GroupPolicyOperationStatus}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyOperationStatus getOperationStatus() {
        return this.backingStore.get("operationStatus");
    }
    /**
     * Gets the operationType property value. Type of Group Policy operation.
     * @return a {@link GroupPolicyOperationType}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyOperationType getOperationType() {
        return this.backingStore.get("operationType");
    }
    /**
     * Gets the statusDetails property value. The group policy operation status detail.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDetails() {
        return this.backingStore.get("statusDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("operationStatus", this.getOperationStatus());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeStringValue("statusDetails", this.getStatusDetails());
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the operationStatus property value. Type of Group Policy operation status.
     * @param value Value to set for the operationStatus property.
     */
    public void setOperationStatus(@jakarta.annotation.Nullable final GroupPolicyOperationStatus value) {
        this.backingStore.set("operationStatus", value);
    }
    /**
     * Sets the operationType property value. Type of Group Policy operation.
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final GroupPolicyOperationType value) {
        this.backingStore.set("operationType", value);
    }
    /**
     * Sets the statusDetails property value. The group policy operation status detail.
     * @param value Value to set for the statusDetails property.
     */
    public void setStatusDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusDetails", value);
    }
}

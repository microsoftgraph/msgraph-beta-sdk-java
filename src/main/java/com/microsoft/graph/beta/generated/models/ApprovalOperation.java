package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApprovalOperation} and sets the default values.
     */
    public ApprovalOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalOperation}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalOperation();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the operation was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the error property value. The error if the operation failed.
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ApprovalOperationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionDateTime property value. The date and time when this operation was most recently updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the resourceLocation property value. The URL for the resource that was newly created or acted upon.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.backingStore.get("resourceLocation");
    }
    /**
     * Gets the status property value. The status of the operation. The possible values are: scheduled, inProgress, succeeded, failed, timeout, unknownFutureValue.
     * @return a {@link ApprovalOperationStatus}
     */
    @jakarta.annotation.Nullable
    public ApprovalOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the operation was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the error property value. The error if the operation failed.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the lastActionDateTime property value. The date and time when this operation was most recently updated.
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the resourceLocation property value. The URL for the resource that was newly created or acted upon.
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceLocation", value);
    }
    /**
     * Sets the status property value. The status of the operation. The possible values are: scheduled, inProgress, succeeded, failed, timeout, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ApprovalOperationStatus value) {
        this.backingStore.set("status", value);
    }
}

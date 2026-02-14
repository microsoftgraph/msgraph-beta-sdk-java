package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentError extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AssignmentError} and sets the default values.
     */
    public AssignmentError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AssignmentError}
     */
    @jakarta.annotation.Nonnull
    public static AssignmentError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentError();
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the code property value. The error code associated with the assignment synchronization failure.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.backingStore.get("code");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("occurrenceDateTime", (n) -> { this.setOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("usageRight", (n) -> { this.setUsageRight(n.getObjectValue(UsageRight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The error message associated with the assignment synchronization failure.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.backingStore.get("message");
    }
    /**
     * Gets the occurrenceDateTime property value. The date and time at which the error most recently occurred. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurrenceDateTime() {
        return this.backingStore.get("occurrenceDateTime");
    }
    /**
     * Gets the skuId property value. Unique identifier (GUID) for the service SKU that is equal to the skuId property on the related subscribedSku object. Read-only. Supports $filter.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getSkuId() {
        return this.backingStore.get("skuId");
    }
    /**
     * Gets the usageRight property value. The affected usageRight, if one exists. Read-only.
     * @return a {@link UsageRight}
     */
    @jakarta.annotation.Nullable
    public UsageRight getUsageRight() {
        return this.backingStore.get("usageRight");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assignedTo", this.getAssignedTo());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("message", this.getMessage());
        writer.writeOffsetDateTimeValue("occurrenceDateTime", this.getOccurrenceDateTime());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeObjectValue("usageRight", this.getUsageRight());
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the code property value. The error code associated with the assignment synchronization failure.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("code", value);
    }
    /**
     * Sets the message property value. The error message associated with the assignment synchronization failure.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("message", value);
    }
    /**
     * Sets the occurrenceDateTime property value. The date and time at which the error most recently occurred. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the occurrenceDateTime property.
     */
    public void setOccurrenceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("occurrenceDateTime", value);
    }
    /**
     * Sets the skuId property value. Unique identifier (GUID) for the service SKU that is equal to the skuId property on the related subscribedSku object. Read-only. Supports $filter.
     * @param value Value to set for the skuId property.
     */
    public void setSkuId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("skuId", value);
    }
    /**
     * Sets the usageRight property value. The affected usageRight, if one exists. Read-only.
     * @param value Value to set for the usageRight property.
     */
    public void setUsageRight(@jakarta.annotation.Nullable final UsageRight value) {
        this.backingStore.set("usageRight", value);
    }
}

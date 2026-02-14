package com.microsoft.graph.beta.models.tenantgovernanceservices;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LongRunningOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LongRunningOperation} and sets the default values.
     */
    public LongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LongRunningOperation}
     */
    @jakarta.annotation.Nonnull
    public static LongRunningOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LongRunningOperation();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus::forValue)); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the resourceLocation property value. The resourceLocation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.backingStore.get("resourceLocation");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link LongRunningOperationStatus}
     */
    @jakarta.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the statusDetail property value. The statusDetail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDetail() {
        return this.backingStore.get("statusDetail");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusDetail", this.getStatusDetail());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the resourceLocation property value. The resourceLocation property
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceLocation", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LongRunningOperationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the statusDetail property value. The statusDetail property
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusDetail", value);
    }
}

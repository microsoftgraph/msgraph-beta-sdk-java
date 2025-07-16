package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcPolicyApplyActionResult extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcPolicyApplyActionResult} and sets the default values.
     */
    public CloudPcPolicyApplyActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcPolicyApplyActionResult}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcPolicyApplyActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcPolicyApplyActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("finishDateTime", (n) -> { this.setFinishDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcPolicyApplyActionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finishDateTime property value. The date and time when the operation finished.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFinishDateTime() {
        return this.backingStore.get("finishDateTime");
    }
    /**
     * Gets the startDateTime property value. The date and time when the operation was applied.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CloudPcPolicyApplyActionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcPolicyApplyActionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("finishDateTime", this.getFinishDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the finishDateTime property value. The date and time when the operation finished.
     * @param value Value to set for the finishDateTime property.
     */
    public void setFinishDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("finishDateTime", value);
    }
    /**
     * Sets the startDateTime property value. The date and time when the operation was applied.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcPolicyApplyActionStatus value) {
        this.backingStore.set("status", value);
    }
}

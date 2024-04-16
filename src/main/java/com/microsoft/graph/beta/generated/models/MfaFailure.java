package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MfaFailure extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MfaFailure} and sets the default values.
     */
    public MfaFailure() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MfaFailure}
     */
    @jakarta.annotation.Nonnull
    public static MfaFailure createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MfaFailure();
    }
    /**
     * Gets the count property value. The count property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCount() {
        return this.backingStore.get("count");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("count", (n) -> { this.setCount(n.getLongValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("reasonCode", (n) -> { this.setReasonCode(n.getEnumValue(MfaFailureReasonCode::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Gets the reasonCode property value. The reasonCode property
     * @return a {@link MfaFailureReasonCode}
     */
    @jakarta.annotation.Nullable
    public MfaFailureReasonCode getReasonCode() {
        return this.backingStore.get("reasonCode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("count", this.getCount());
        writer.writeStringValue("reason", this.getReason());
        writer.writeEnumValue("reasonCode", this.getReasonCode());
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("count", value);
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
    /**
     * Sets the reasonCode property value. The reasonCode property
     * @param value Value to set for the reasonCode property.
     */
    public void setReasonCode(@jakarta.annotation.Nullable final MfaFailureReasonCode value) {
        this.backingStore.set("reasonCode", value);
    }
}

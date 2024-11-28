package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MfaUserCountMetric extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MfaUserCountMetric} and sets the default values.
     */
    public MfaUserCountMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MfaUserCountMetric}
     */
    @jakarta.annotation.Nonnull
    public static MfaUserCountMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MfaUserCountMetric();
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
     * Gets the factDate property value. The factDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getFactDate() {
        return this.backingStore.get("factDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("count", (n) -> { this.setCount(n.getLongValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("mfaType", (n) -> { this.setMfaType(n.getEnumValue(MfaType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mfaType property value. The mfaType property
     * @return a {@link MfaType}
     */
    @jakarta.annotation.Nullable
    public MfaType getMfaType() {
        return this.backingStore.get("mfaType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("count", this.getCount());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeEnumValue("mfaType", this.getMfaType());
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("count", value);
    }
    /**
     * Sets the factDate property value. The factDate property
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the mfaType property value. The mfaType property
     * @param value Value to set for the mfaType property.
     */
    public void setMfaType(@jakarta.annotation.Nullable final MfaType value) {
        this.backingStore.set("mfaType", value);
    }
}

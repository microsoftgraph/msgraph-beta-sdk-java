package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeSlotAvailability extends TimeSlot implements Parsable {
    /**
     * Instantiates a new {@link TimeSlotAvailability} and sets the default values.
     */
    public TimeSlotAvailability() {
        super();
        this.setOdataType("#microsoft.graph.timeSlotAvailability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimeSlotAvailability}
     */
    @jakarta.annotation.Nonnull
    public static TimeSlotAvailability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeSlotAvailability();
    }
    /**
     * Gets the availability property value. The availability property
     * @return a {@link FreeBusyStatus}
     */
    @jakarta.annotation.Nullable
    public FreeBusyStatus getAvailability() {
        return this.backingStore.get("availability");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getEnumValue(FreeBusyStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("availability", this.getAvailability());
    }
    /**
     * Sets the availability property value. The availability property
     * @param value Value to set for the availability property.
     */
    public void setAvailability(@jakarta.annotation.Nullable final FreeBusyStatus value) {
        this.backingStore.set("availability", value);
    }
}

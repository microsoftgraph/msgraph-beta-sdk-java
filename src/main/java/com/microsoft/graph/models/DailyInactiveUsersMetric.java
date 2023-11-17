package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DailyInactiveUsersMetric extends InactiveUsersMetricBase implements Parsable {
    /**
     * Instantiates a new DailyInactiveUsersMetric and sets the default values.
     */
    public DailyInactiveUsersMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DailyInactiveUsersMetric
     */
    @jakarta.annotation.Nonnull
    public static DailyInactiveUsersMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DailyInactiveUsersMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inactive1DayCount", (n) -> { this.setInactive1DayCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactive1DayCount property value. The inactive1DayCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInactive1DayCount() {
        return this.backingStore.get("inactive1DayCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("inactive1DayCount", this.getInactive1DayCount());
    }
    /**
     * Sets the inactive1DayCount property value. The inactive1DayCount property
     * @param value Value to set for the inactive1DayCount property.
     */
    public void setInactive1DayCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("inactive1DayCount", value);
    }
}

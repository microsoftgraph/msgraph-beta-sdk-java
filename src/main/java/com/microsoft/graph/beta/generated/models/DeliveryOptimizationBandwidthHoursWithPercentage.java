package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bandwidth limit as a percentage with business hours.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationBandwidthHoursWithPercentage extends DeliveryOptimizationBandwidth implements Parsable {
    /**
     * Instantiates a new {@link DeliveryOptimizationBandwidthHoursWithPercentage} and sets the default values.
     */
    public DeliveryOptimizationBandwidthHoursWithPercentage() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthHoursWithPercentage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeliveryOptimizationBandwidthHoursWithPercentage}
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationBandwidthHoursWithPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthHoursWithPercentage();
    }
    /**
     * Gets the bandwidthBackgroundPercentageHours property value. Background download percentage hours.
     * @return a {@link DeliveryOptimizationBandwidthBusinessHoursLimit}
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationBandwidthBusinessHoursLimit getBandwidthBackgroundPercentageHours() {
        return this.backingStore.get("bandwidthBackgroundPercentageHours");
    }
    /**
     * Gets the bandwidthForegroundPercentageHours property value. Foreground download percentage hours.
     * @return a {@link DeliveryOptimizationBandwidthBusinessHoursLimit}
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationBandwidthBusinessHoursLimit getBandwidthForegroundPercentageHours() {
        return this.backingStore.get("bandwidthForegroundPercentageHours");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bandwidthBackgroundPercentageHours", (n) -> { this.setBandwidthBackgroundPercentageHours(n.getObjectValue(DeliveryOptimizationBandwidthBusinessHoursLimit::createFromDiscriminatorValue)); });
        deserializerMap.put("bandwidthForegroundPercentageHours", (n) -> { this.setBandwidthForegroundPercentageHours(n.getObjectValue(DeliveryOptimizationBandwidthBusinessHoursLimit::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("bandwidthBackgroundPercentageHours", this.getBandwidthBackgroundPercentageHours());
        writer.writeObjectValue("bandwidthForegroundPercentageHours", this.getBandwidthForegroundPercentageHours());
    }
    /**
     * Sets the bandwidthBackgroundPercentageHours property value. Background download percentage hours.
     * @param value Value to set for the bandwidthBackgroundPercentageHours property.
     */
    public void setBandwidthBackgroundPercentageHours(@jakarta.annotation.Nullable final DeliveryOptimizationBandwidthBusinessHoursLimit value) {
        this.backingStore.set("bandwidthBackgroundPercentageHours", value);
    }
    /**
     * Sets the bandwidthForegroundPercentageHours property value. Foreground download percentage hours.
     * @param value Value to set for the bandwidthForegroundPercentageHours property.
     */
    public void setBandwidthForegroundPercentageHours(@jakarta.annotation.Nullable final DeliveryOptimizationBandwidthBusinessHoursLimit value) {
        this.backingStore.set("bandwidthForegroundPercentageHours", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bandwidth limits specified as a percentage.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationBandwidthPercentage extends DeliveryOptimizationBandwidth implements Parsable {
    /**
     * Instantiates a new {@link DeliveryOptimizationBandwidthPercentage} and sets the default values.
     */
    public DeliveryOptimizationBandwidthPercentage() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthPercentage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeliveryOptimizationBandwidthPercentage}
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationBandwidthPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthPercentage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumBackgroundBandwidthPercentage", (n) -> { this.setMaximumBackgroundBandwidthPercentage(n.getIntegerValue()); });
        deserializerMap.put("maximumForegroundBandwidthPercentage", (n) -> { this.setMaximumForegroundBandwidthPercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumBackgroundBandwidthPercentage property value. Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumBackgroundBandwidthPercentage() {
        return this.backingStore.get("maximumBackgroundBandwidthPercentage");
    }
    /**
     * Gets the maximumForegroundBandwidthPercentage property value. Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumForegroundBandwidthPercentage() {
        return this.backingStore.get("maximumForegroundBandwidthPercentage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumBackgroundBandwidthPercentage", this.getMaximumBackgroundBandwidthPercentage());
        writer.writeIntegerValue("maximumForegroundBandwidthPercentage", this.getMaximumForegroundBandwidthPercentage());
    }
    /**
     * Sets the maximumBackgroundBandwidthPercentage property value. Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @param value Value to set for the maximumBackgroundBandwidthPercentage property.
     */
    public void setMaximumBackgroundBandwidthPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumBackgroundBandwidthPercentage", value);
    }
    /**
     * Sets the maximumForegroundBandwidthPercentage property value. Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @param value Value to set for the maximumForegroundBandwidthPercentage property.
     */
    public void setMaximumForegroundBandwidthPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumForegroundBandwidthPercentage", value);
    }
}

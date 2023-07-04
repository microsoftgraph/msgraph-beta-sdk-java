package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationBandwidthPercentage extends DeliveryOptimizationBandwidth implements Parsable {
    /**
     * Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     */
    private Integer maximumBackgroundBandwidthPercentage;
    /**
     * Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     */
    private Integer maximumForegroundBandwidthPercentage;
    /**
     * Instantiates a new DeliveryOptimizationBandwidthPercentage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationBandwidthPercentage() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthPercentage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationBandwidthPercentage
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationBandwidthPercentage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthPercentage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumBackgroundBandwidthPercentage", (n) -> { this.setMaximumBackgroundBandwidthPercentage(n.getIntegerValue()); });
        deserializerMap.put("maximumForegroundBandwidthPercentage", (n) -> { this.setMaximumForegroundBandwidthPercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumBackgroundBandwidthPercentage property value. Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumBackgroundBandwidthPercentage() {
        return this.maximumBackgroundBandwidthPercentage;
    }
    /**
     * Gets the maximumForegroundBandwidthPercentage property value. Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumForegroundBandwidthPercentage() {
        return this.maximumForegroundBandwidthPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumBackgroundBandwidthPercentage", this.getMaximumBackgroundBandwidthPercentage());
        writer.writeIntegerValue("maximumForegroundBandwidthPercentage", this.getMaximumForegroundBandwidthPercentage());
    }
    /**
     * Sets the maximumBackgroundBandwidthPercentage property value. Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @param value Value to set for the maximumBackgroundBandwidthPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumBackgroundBandwidthPercentage(@javax.annotation.Nullable final Integer value) {
        this.maximumBackgroundBandwidthPercentage = value;
    }
    /**
     * Sets the maximumForegroundBandwidthPercentage property value. Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
     * @param value Value to set for the maximumForegroundBandwidthPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumForegroundBandwidthPercentage(@javax.annotation.Nullable final Integer value) {
        this.maximumForegroundBandwidthPercentage = value;
    }
}

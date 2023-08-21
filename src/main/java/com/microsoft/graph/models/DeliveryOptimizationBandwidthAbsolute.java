package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bandwidth limits in kilobytes per second.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationBandwidthAbsolute extends DeliveryOptimizationBandwidth implements Parsable {
    /**
     * Specifies the maximum download bandwidth in KiloBytes/second that the device can use across all concurrent download activities using Delivery Optimization. Valid values 0 to 4294967295
     */
    private Long maximumDownloadBandwidthInKilobytesPerSecond;
    /**
     * Specifies the maximum upload bandwidth in KiloBytes/second that a device will use across all concurrent upload activity using Delivery Optimization (0-4000000). Valid values 0 to 4000000
     */
    private Long maximumUploadBandwidthInKilobytesPerSecond;
    /**
     * Instantiates a new deliveryOptimizationBandwidthAbsolute and sets the default values.
     */
    public DeliveryOptimizationBandwidthAbsolute() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthAbsolute");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deliveryOptimizationBandwidthAbsolute
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationBandwidthAbsolute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthAbsolute();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumDownloadBandwidthInKilobytesPerSecond", (n) -> { this.setMaximumDownloadBandwidthInKilobytesPerSecond(n.getLongValue()); });
        deserializerMap.put("maximumUploadBandwidthInKilobytesPerSecond", (n) -> { this.setMaximumUploadBandwidthInKilobytesPerSecond(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumDownloadBandwidthInKilobytesPerSecond property value. Specifies the maximum download bandwidth in KiloBytes/second that the device can use across all concurrent download activities using Delivery Optimization. Valid values 0 to 4294967295
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMaximumDownloadBandwidthInKilobytesPerSecond() {
        return this.maximumDownloadBandwidthInKilobytesPerSecond;
    }
    /**
     * Gets the maximumUploadBandwidthInKilobytesPerSecond property value. Specifies the maximum upload bandwidth in KiloBytes/second that a device will use across all concurrent upload activity using Delivery Optimization (0-4000000). Valid values 0 to 4000000
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMaximumUploadBandwidthInKilobytesPerSecond() {
        return this.maximumUploadBandwidthInKilobytesPerSecond;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("maximumDownloadBandwidthInKilobytesPerSecond", this.getMaximumDownloadBandwidthInKilobytesPerSecond());
        writer.writeLongValue("maximumUploadBandwidthInKilobytesPerSecond", this.getMaximumUploadBandwidthInKilobytesPerSecond());
    }
    /**
     * Sets the maximumDownloadBandwidthInKilobytesPerSecond property value. Specifies the maximum download bandwidth in KiloBytes/second that the device can use across all concurrent download activities using Delivery Optimization. Valid values 0 to 4294967295
     * @param value Value to set for the maximumDownloadBandwidthInKilobytesPerSecond property.
     */
    public void setMaximumDownloadBandwidthInKilobytesPerSecond(@jakarta.annotation.Nullable final Long value) {
        this.maximumDownloadBandwidthInKilobytesPerSecond = value;
    }
    /**
     * Sets the maximumUploadBandwidthInKilobytesPerSecond property value. Specifies the maximum upload bandwidth in KiloBytes/second that a device will use across all concurrent upload activity using Delivery Optimization (0-4000000). Valid values 0 to 4000000
     * @param value Value to set for the maximumUploadBandwidthInKilobytesPerSecond property.
     */
    public void setMaximumUploadBandwidthInKilobytesPerSecond(@jakarta.annotation.Nullable final Long value) {
        this.maximumUploadBandwidthInKilobytesPerSecond = value;
    }
}

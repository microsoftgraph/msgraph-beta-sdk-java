package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationBandwidthAbsolute extends DeliveryOptimizationBandwidth implements Parsable {
    /** Specifies the maximum download bandwidth in KiloBytes/second that the device can use across all concurrent download activities using Delivery Optimization. Valid values 0 to 4294967295 */
    private Long _maximumDownloadBandwidthInKilobytesPerSecond;
    /** Specifies the maximum upload bandwidth in KiloBytes/second that a device will use across all concurrent upload activity using Delivery Optimization (0-4000000). Valid values 0 to 4000000 */
    private Long _maximumUploadBandwidthInKilobytesPerSecond;
    /**
     * Instantiates a new DeliveryOptimizationBandwidthAbsolute and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationBandwidthAbsolute() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationBandwidthAbsolute");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationBandwidthAbsolute
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationBandwidthAbsolute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthAbsolute();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeliveryOptimizationBandwidthAbsolute currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumDownloadBandwidthInKilobytesPerSecond", (n) -> { currentObject.setMaximumDownloadBandwidthInKilobytesPerSecond(n.getLongValue()); });
        deserializerMap.put("maximumUploadBandwidthInKilobytesPerSecond", (n) -> { currentObject.setMaximumUploadBandwidthInKilobytesPerSecond(n.getLongValue()); });
        return deserializerMap
    }
    /**
     * Gets the maximumDownloadBandwidthInKilobytesPerSecond property value. Specifies the maximum download bandwidth in KiloBytes/second that the device can use across all concurrent download activities using Delivery Optimization. Valid values 0 to 4294967295
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaximumDownloadBandwidthInKilobytesPerSecond() {
        return this._maximumDownloadBandwidthInKilobytesPerSecond;
    }
    /**
     * Gets the maximumUploadBandwidthInKilobytesPerSecond property value. Specifies the maximum upload bandwidth in KiloBytes/second that a device will use across all concurrent upload activity using Delivery Optimization (0-4000000). Valid values 0 to 4000000
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaximumUploadBandwidthInKilobytesPerSecond() {
        return this._maximumUploadBandwidthInKilobytesPerSecond;
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
        writer.writeLongValue("maximumDownloadBandwidthInKilobytesPerSecond", this.getMaximumDownloadBandwidthInKilobytesPerSecond());
        writer.writeLongValue("maximumUploadBandwidthInKilobytesPerSecond", this.getMaximumUploadBandwidthInKilobytesPerSecond());
    }
    /**
     * Sets the maximumDownloadBandwidthInKilobytesPerSecond property value. Specifies the maximum download bandwidth in KiloBytes/second that the device can use across all concurrent download activities using Delivery Optimization. Valid values 0 to 4294967295
     * @param value Value to set for the maximumDownloadBandwidthInKilobytesPerSecond property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumDownloadBandwidthInKilobytesPerSecond(@javax.annotation.Nullable final Long value) {
        this._maximumDownloadBandwidthInKilobytesPerSecond = value;
    }
    /**
     * Sets the maximumUploadBandwidthInKilobytesPerSecond property value. Specifies the maximum upload bandwidth in KiloBytes/second that a device will use across all concurrent upload activity using Delivery Optimization (0-4000000). Valid values 0 to 4000000
     * @param value Value to set for the maximumUploadBandwidthInKilobytesPerSecond property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumUploadBandwidthInKilobytesPerSecond(@javax.annotation.Nullable final Long value) {
        this._maximumUploadBandwidthInKilobytesPerSecond = value;
    }
}

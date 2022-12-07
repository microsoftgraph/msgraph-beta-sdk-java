package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationMaxCacheSizePercentage extends DeliveryOptimizationMaxCacheSize implements Parsable {
    /** Specifies the maximum cache size that Delivery Optimization can utilize, as a percentage of disk size (1-100). Valid values 1 to 100 */
    private Integer _maximumCacheSizePercentage;
    /**
     * Instantiates a new DeliveryOptimizationMaxCacheSizePercentage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationMaxCacheSizePercentage() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationMaxCacheSizePercentage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationMaxCacheSizePercentage
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationMaxCacheSizePercentage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationMaxCacheSizePercentage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCacheSizePercentage", (n) -> { this.setMaximumCacheSizePercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCacheSizePercentage property value. Specifies the maximum cache size that Delivery Optimization can utilize, as a percentage of disk size (1-100). Valid values 1 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumCacheSizePercentage() {
        return this._maximumCacheSizePercentage;
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
        writer.writeIntegerValue("maximumCacheSizePercentage", this.getMaximumCacheSizePercentage());
    }
    /**
     * Sets the maximumCacheSizePercentage property value. Specifies the maximum cache size that Delivery Optimization can utilize, as a percentage of disk size (1-100). Valid values 1 to 100
     * @param value Value to set for the maximumCacheSizePercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumCacheSizePercentage(@javax.annotation.Nullable final Integer value) {
        this._maximumCacheSizePercentage = value;
    }
}

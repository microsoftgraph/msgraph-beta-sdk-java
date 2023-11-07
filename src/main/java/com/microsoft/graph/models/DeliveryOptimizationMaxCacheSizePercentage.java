package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Delivery Optimization Max cache size percentage types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationMaxCacheSizePercentage extends DeliveryOptimizationMaxCacheSize implements Parsable {
    /**
     * Specifies the maximum cache size that Delivery Optimization can utilize, as a percentage of disk size (1-100). Valid values 1 to 100
     */
    private Integer maximumCacheSizePercentage;
    /**
     * Instantiates a new DeliveryOptimizationMaxCacheSizePercentage and sets the default values.
     */
    public DeliveryOptimizationMaxCacheSizePercentage() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationMaxCacheSizePercentage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationMaxCacheSizePercentage
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationMaxCacheSizePercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationMaxCacheSizePercentage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCacheSizePercentage", (n) -> { this.setMaximumCacheSizePercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCacheSizePercentage property value. Specifies the maximum cache size that Delivery Optimization can utilize, as a percentage of disk size (1-100). Valid values 1 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumCacheSizePercentage() {
        return this.maximumCacheSizePercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumCacheSizePercentage", this.getMaximumCacheSizePercentage());
    }
    /**
     * Sets the maximumCacheSizePercentage property value. Specifies the maximum cache size that Delivery Optimization can utilize, as a percentage of disk size (1-100). Valid values 1 to 100
     * @param value Value to set for the maximumCacheSizePercentage property.
     */
    public void setMaximumCacheSizePercentage(@jakarta.annotation.Nullable final Integer value) {
        this.maximumCacheSizePercentage = value;
    }
}

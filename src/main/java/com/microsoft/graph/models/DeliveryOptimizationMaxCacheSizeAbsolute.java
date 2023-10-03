package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Delivery Optimization max cache size absolute type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationMaxCacheSizeAbsolute extends DeliveryOptimizationMaxCacheSize implements Parsable {
    /**
     * Specifies the maximum size in GB of Delivery Optimization cache. Valid values 0 to 4294967295
     */
    private Long maximumCacheSizeInGigabytes;
    /**
     * Instantiates a new DeliveryOptimizationMaxCacheSizeAbsolute and sets the default values.
     */
    public DeliveryOptimizationMaxCacheSizeAbsolute() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationMaxCacheSizeAbsolute");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationMaxCacheSizeAbsolute
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationMaxCacheSizeAbsolute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationMaxCacheSizeAbsolute();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCacheSizeInGigabytes", (n) -> { this.setMaximumCacheSizeInGigabytes(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCacheSizeInGigabytes property value. Specifies the maximum size in GB of Delivery Optimization cache. Valid values 0 to 4294967295
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaximumCacheSizeInGigabytes() {
        return this.maximumCacheSizeInGigabytes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("maximumCacheSizeInGigabytes", this.getMaximumCacheSizeInGigabytes());
    }
    /**
     * Sets the maximumCacheSizeInGigabytes property value. Specifies the maximum size in GB of Delivery Optimization cache. Valid values 0 to 4294967295
     * @param value Value to set for the maximumCacheSizeInGigabytes property.
     */
    public void setMaximumCacheSizeInGigabytes(@jakarta.annotation.Nullable final Long value) {
        this.maximumCacheSizeInGigabytes = value;
    }
}

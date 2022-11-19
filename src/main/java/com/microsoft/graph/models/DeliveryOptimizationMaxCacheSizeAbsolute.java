package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationMaxCacheSizeAbsolute extends DeliveryOptimizationMaxCacheSize implements Parsable {
    /** Specifies the maximum size in GB of Delivery Optimization cache. Valid values 0 to 4294967295 */
    private Long _maximumCacheSizeInGigabytes;
    /**
     * Instantiates a new DeliveryOptimizationMaxCacheSizeAbsolute and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationMaxCacheSizeAbsolute() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationMaxCacheSizeAbsolute");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationMaxCacheSizeAbsolute
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationMaxCacheSizeAbsolute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationMaxCacheSizeAbsolute();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeliveryOptimizationMaxCacheSizeAbsolute currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCacheSizeInGigabytes", (n) -> { currentObject.setMaximumCacheSizeInGigabytes(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCacheSizeInGigabytes property value. Specifies the maximum size in GB of Delivery Optimization cache. Valid values 0 to 4294967295
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaximumCacheSizeInGigabytes() {
        return this._maximumCacheSizeInGigabytes;
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
        writer.writeLongValue("maximumCacheSizeInGigabytes", this.getMaximumCacheSizeInGigabytes());
    }
    /**
     * Sets the maximumCacheSizeInGigabytes property value. Specifies the maximum size in GB of Delivery Optimization cache. Valid values 0 to 4294967295
     * @param value Value to set for the maximumCacheSizeInGigabytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumCacheSizeInGigabytes(@javax.annotation.Nullable final Long value) {
        this._maximumCacheSizeInGigabytes = value;
    }
}

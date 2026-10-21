package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StreamingMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link StreamingMetadata} and sets the default values.
     */
    public StreamingMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StreamingMetadata}
     */
    @jakarta.annotation.Nonnull
    public static StreamingMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StreamingMetadata();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("frameDropRate", (n) -> { this.setFrameDropRate(n.getDoubleValue()); });
        deserializerMap.put("latencyMs", (n) -> { this.setLatencyMs(n.getIntegerValue()); });
        deserializerMap.put("networkJitterMs", (n) -> { this.setNetworkJitterMs(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frameDropRate property value. Percentage of frames dropped during streaming, expressed as a value between 0.0 and 1.0.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getFrameDropRate() {
        return this.backingStore.get("frameDropRate");
    }
    /**
     * Gets the latencyMs property value. Network latency in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLatencyMs() {
        return this.backingStore.get("latencyMs");
    }
    /**
     * Gets the networkJitterMs property value. Network jitter in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNetworkJitterMs() {
        return this.backingStore.get("networkJitterMs");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("frameDropRate", this.getFrameDropRate());
        writer.writeIntegerValue("latencyMs", this.getLatencyMs());
        writer.writeIntegerValue("networkJitterMs", this.getNetworkJitterMs());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the frameDropRate property value. Percentage of frames dropped during streaming, expressed as a value between 0.0 and 1.0.
     * @param value Value to set for the frameDropRate property.
     */
    public void setFrameDropRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("frameDropRate", value);
    }
    /**
     * Sets the latencyMs property value. Network latency in milliseconds.
     * @param value Value to set for the latencyMs property.
     */
    public void setLatencyMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("latencyMs", value);
    }
    /**
     * Sets the networkJitterMs property value. Network jitter in milliseconds.
     * @param value Value to set for the networkJitterMs property.
     */
    public void setNetworkJitterMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("networkJitterMs", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

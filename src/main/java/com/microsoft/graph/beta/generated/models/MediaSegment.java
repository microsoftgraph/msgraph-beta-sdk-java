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
public class MediaSegment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MediaSegment} and sets the default values.
     */
    public MediaSegment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MediaSegment}
     */
    @jakarta.annotation.Nonnull
    public static MediaSegment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaSegment();
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
     * Gets the endTimeSec property value. The endTimeSec property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEndTimeSec() {
        return this.backingStore.get("endTimeSec");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("endTimeSec", (n) -> { this.setEndTimeSec(n.getIntegerValue()); });
        deserializerMap.put("frameIndices", (n) -> { this.setFrameIndices(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startTimeSec", (n) -> { this.setStartTimeSec(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frameIndices property value. The frameIndices property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getFrameIndices() {
        return this.backingStore.get("frameIndices");
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
     * Gets the startTimeSec property value. The startTimeSec property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStartTimeSec() {
        return this.backingStore.get("startTimeSec");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("endTimeSec", this.getEndTimeSec());
        writer.writeCollectionOfPrimitiveValues("frameIndices", this.getFrameIndices());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("startTimeSec", this.getStartTimeSec());
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
     * Sets the endTimeSec property value. The endTimeSec property
     * @param value Value to set for the endTimeSec property.
     */
    public void setEndTimeSec(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("endTimeSec", value);
    }
    /**
     * Sets the frameIndices property value. The frameIndices property
     * @param value Value to set for the frameIndices property.
     */
    public void setFrameIndices(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("frameIndices", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the startTimeSec property value. The startTimeSec property
     * @param value Value to set for the startTimeSec property.
     */
    public void setStartTimeSec(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("startTimeSec", value);
    }
}

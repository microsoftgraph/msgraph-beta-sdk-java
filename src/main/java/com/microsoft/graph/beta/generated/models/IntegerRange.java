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
public class IntegerRange implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IntegerRange} and sets the default values.
     */
    public IntegerRange() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IntegerRange}
     */
    @jakarta.annotation.Nonnull
    public static IntegerRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntegerRange();
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
     * Gets the end property value. The inclusive upper bound of the integer range.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEnd() {
        return this.backingStore.get("end");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("end", (n) -> { this.setEnd(n.getLongValue()); });
        deserializerMap.put("maximum", (n) -> { this.setMaximum(n.getLongValue()); });
        deserializerMap.put("minimum", (n) -> { this.setMinimum(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximum property value. The maximum property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMaximum() {
        return this.backingStore.get("maximum");
    }
    /**
     * Gets the minimum property value. The minimum property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMinimum() {
        return this.backingStore.get("minimum");
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
     * Gets the start property value. The inclusive lower bound of the integer range.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStart() {
        return this.backingStore.get("start");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("end", this.getEnd());
        writer.writeLongValue("maximum", this.getMaximum());
        writer.writeLongValue("minimum", this.getMinimum());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("start", this.getStart());
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
     * Sets the end property value. The inclusive upper bound of the integer range.
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("end", value);
    }
    /**
     * Sets the maximum property value. The maximum property
     * @param value Value to set for the maximum property.
     */
    public void setMaximum(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maximum", value);
    }
    /**
     * Sets the minimum property value. The minimum property
     * @param value Value to set for the minimum property.
     */
    public void setMinimum(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("minimum", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the start property value. The inclusive lower bound of the integer range.
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("start", value);
    }
}

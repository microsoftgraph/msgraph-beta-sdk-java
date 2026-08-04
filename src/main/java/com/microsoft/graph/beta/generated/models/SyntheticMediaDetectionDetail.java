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
public class SyntheticMediaDetectionDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SyntheticMediaDetectionDetail} and sets the default values.
     */
    public SyntheticMediaDetectionDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SyntheticMediaDetectionDetail}
     */
    @jakarta.annotation.Nonnull
    public static SyntheticMediaDetectionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SyntheticMediaDetectionDetail();
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
     * Gets the confidence property value. The confidence property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConfidence() {
        return this.backingStore.get("confidence");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getDoubleValue()); });
        deserializerMap.put("modality", (n) -> { this.setModality(n.getEnumValue(ContentModality::forValue)); });
        deserializerMap.put("modelName", (n) -> { this.setModelName(n.getStringValue()); });
        deserializerMap.put("modelTasks", (n) -> { this.setModelTasks(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("segment", (n) -> { this.setSegment(n.getObjectValue(MediaSegment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modality property value. The modality property
     * @return a {@link ContentModality}
     */
    @jakarta.annotation.Nullable
    public ContentModality getModality() {
        return this.backingStore.get("modality");
    }
    /**
     * Gets the modelName property value. The modelName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModelName() {
        return this.backingStore.get("modelName");
    }
    /**
     * Gets the modelTasks property value. The modelTasks property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getModelTasks() {
        return this.backingStore.get("modelTasks");
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
     * Gets the segment property value. The segment property
     * @return a {@link MediaSegment}
     */
    @jakarta.annotation.Nullable
    public MediaSegment getSegment() {
        return this.backingStore.get("segment");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("confidence", this.getConfidence());
        writer.writeEnumValue("modality", this.getModality());
        writer.writeStringValue("modelName", this.getModelName());
        writer.writeCollectionOfPrimitiveValues("modelTasks", this.getModelTasks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("segment", this.getSegment());
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
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     */
    public void setConfidence(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("confidence", value);
    }
    /**
     * Sets the modality property value. The modality property
     * @param value Value to set for the modality property.
     */
    public void setModality(@jakarta.annotation.Nullable final ContentModality value) {
        this.backingStore.set("modality", value);
    }
    /**
     * Sets the modelName property value. The modelName property
     * @param value Value to set for the modelName property.
     */
    public void setModelName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("modelName", value);
    }
    /**
     * Sets the modelTasks property value. The modelTasks property
     * @param value Value to set for the modelTasks property.
     */
    public void setModelTasks(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("modelTasks", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the segment property value. The segment property
     * @param value Value to set for the segment property.
     */
    public void setSegment(@jakarta.annotation.Nullable final MediaSegment value) {
        this.backingStore.set("segment", value);
    }
}

package com.microsoft.graph.beta.models.security.dlp;

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
public class AttachmentSensitiveInformationDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AttachmentSensitiveInformationDetails} and sets the default values.
     */
    public AttachmentSensitiveInformationDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttachmentSensitiveInformationDetails}
     */
    @jakarta.annotation.Nonnull
    public static AttachmentSensitiveInformationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentSensitiveInformationDetails();
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
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensitiveInformationDetailedClassificationAttributes", (n) -> { this.setSensitiveInformationDetailedClassificationAttributes(n.getCollectionOfObjectValues(SensitiveInformationDetailedConfidenceLevelResult::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitiveInformationDetectionIndices", (n) -> { this.setSensitiveInformationDetectionIndices(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("sensitiveType", (n) -> { this.setSensitiveType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the sensitiveInformationDetailedClassificationAttributes property value. The sensitiveInformationDetailedClassificationAttributes property
     * @return a {@link java.util.List<SensitiveInformationDetailedConfidenceLevelResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitiveInformationDetailedConfidenceLevelResult> getSensitiveInformationDetailedClassificationAttributes() {
        return this.backingStore.get("sensitiveInformationDetailedClassificationAttributes");
    }
    /**
     * Gets the sensitiveInformationDetectionIndices property value. The sensitiveInformationDetectionIndices property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getSensitiveInformationDetectionIndices() {
        return this.backingStore.get("sensitiveInformationDetectionIndices");
    }
    /**
     * Gets the sensitiveType property value. The sensitiveType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensitiveType() {
        return this.backingStore.get("sensitiveType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("sensitiveInformationDetailedClassificationAttributes", this.getSensitiveInformationDetailedClassificationAttributes());
        writer.writeCollectionOfPrimitiveValues("sensitiveInformationDetectionIndices", this.getSensitiveInformationDetectionIndices());
        writer.writeStringValue("sensitiveType", this.getSensitiveType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sensitiveInformationDetailedClassificationAttributes property value. The sensitiveInformationDetailedClassificationAttributes property
     * @param value Value to set for the sensitiveInformationDetailedClassificationAttributes property.
     */
    public void setSensitiveInformationDetailedClassificationAttributes(@jakarta.annotation.Nullable final java.util.List<SensitiveInformationDetailedConfidenceLevelResult> value) {
        this.backingStore.set("sensitiveInformationDetailedClassificationAttributes", value);
    }
    /**
     * Sets the sensitiveInformationDetectionIndices property value. The sensitiveInformationDetectionIndices property
     * @param value Value to set for the sensitiveInformationDetectionIndices property.
     */
    public void setSensitiveInformationDetectionIndices(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("sensitiveInformationDetectionIndices", value);
    }
    /**
     * Sets the sensitiveType property value. The sensitiveType property
     * @param value Value to set for the sensitiveType property.
     */
    public void setSensitiveType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensitiveType", value);
    }
}

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
public class AttachmentInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AttachmentInfo} and sets the default values.
     */
    public AttachmentInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttachmentInfo}
     */
    @jakarta.annotation.Nonnull
    public static AttachmentInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentInfo();
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
     * Gets the checksum property value. The checksum property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getChecksum() {
        return this.backingStore.get("checksum");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("checksum", (n) -> { this.setChecksum(n.getLongValue()); });
        deserializerMap.put("labelNames", (n) -> { this.setLabelNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensitiveInformationDetails", (n) -> { this.setSensitiveInformationDetails(n.getCollectionOfObjectValues(AttachmentSensitiveInformationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labelNames property value. The labelNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLabelNames() {
        return this.backingStore.get("labelNames");
    }
    /**
     * Gets the labels property value. The labels property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLabels() {
        return this.backingStore.get("labels");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the sensitiveInformationDetails property value. The sensitiveInformationDetails property
     * @return a {@link java.util.List<AttachmentSensitiveInformationDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttachmentSensitiveInformationDetails> getSensitiveInformationDetails() {
        return this.backingStore.get("sensitiveInformationDetails");
    }
    /**
     * Gets the size property value. The size property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("checksum", this.getChecksum());
        writer.writeCollectionOfPrimitiveValues("labelNames", this.getLabelNames());
        writer.writeCollectionOfPrimitiveValues("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("sensitiveInformationDetails", this.getSensitiveInformationDetails());
        writer.writeLongValue("size", this.getSize());
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
     * Sets the checksum property value. The checksum property
     * @param value Value to set for the checksum property.
     */
    public void setChecksum(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("checksum", value);
    }
    /**
     * Sets the labelNames property value. The labelNames property
     * @param value Value to set for the labelNames property.
     */
    public void setLabelNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("labelNames", value);
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("labels", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sensitiveInformationDetails property value. The sensitiveInformationDetails property
     * @param value Value to set for the sensitiveInformationDetails property.
     */
    public void setSensitiveInformationDetails(@jakarta.annotation.Nullable final java.util.List<AttachmentSensitiveInformationDetails> value) {
        this.backingStore.set("sensitiveInformationDetails", value);
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
}

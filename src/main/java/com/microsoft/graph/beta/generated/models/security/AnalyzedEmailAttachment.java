package com.microsoft.graph.beta.models.security;

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
public class AnalyzedEmailAttachment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AnalyzedEmailAttachment} and sets the default values.
     */
    public AnalyzedEmailAttachment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyzedEmailAttachment}
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedEmailAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedEmailAttachment();
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
     * Gets the detonationDetails property value. The detonationDetails property
     * @return a {@link DetonationDetails}
     */
    @jakarta.annotation.Nullable
    public DetonationDetails getDetonationDetails() {
        return this.backingStore.get("detonationDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("detonationDetails", (n) -> { this.setDetonationDetails(n.getObjectValue(DetonationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sha256", (n) -> { this.setSha256(n.getStringValue()); });
        deserializerMap.put("threatName", (n) -> { this.setThreatName(n.getStringValue()); });
        deserializerMap.put("threatType", (n) -> { this.setThreatType(n.getEnumValue(ThreatType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the fileType property value. The fileType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.backingStore.get("fileType");
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
     * Gets the sha256 property value. The sha256 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha256() {
        return this.backingStore.get("sha256");
    }
    /**
     * Gets the threatName property value. The threatName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreatName() {
        return this.backingStore.get("threatName");
    }
    /**
     * Gets the threatType property value. The threatType property
     * @return a {@link ThreatType}
     */
    @jakarta.annotation.Nullable
    public ThreatType getThreatType() {
        return this.backingStore.get("threatType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("detonationDetails", this.getDetonationDetails());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sha256", this.getSha256());
        writer.writeStringValue("threatName", this.getThreatName());
        writer.writeEnumValue("threatType", this.getThreatType());
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
     * Sets the detonationDetails property value. The detonationDetails property
     * @param value Value to set for the detonationDetails property.
     */
    public void setDetonationDetails(@jakarta.annotation.Nullable final DetonationDetails value) {
        this.backingStore.set("detonationDetails", value);
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the fileType property value. The fileType property
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sha256 property value. The sha256 property
     * @param value Value to set for the sha256 property.
     */
    public void setSha256(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha256", value);
    }
    /**
     * Sets the threatName property value. The threatName property
     * @param value Value to set for the threatName property.
     */
    public void setThreatName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threatName", value);
    }
    /**
     * Sets the threatType property value. The threatType property
     * @param value Value to set for the threatType property.
     */
    public void setThreatType(@jakarta.annotation.Nullable final ThreatType value) {
        this.backingStore.set("threatType", value);
    }
}

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
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SyntheticMediaDetectionInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SyntheticMediaDetectionInfo} and sets the default values.
     */
    public SyntheticMediaDetectionInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SyntheticMediaDetectionInfo}
     */
    @jakarta.annotation.Nonnull
    public static SyntheticMediaDetectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SyntheticMediaDetectionInfo();
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
     * Gets the detectionId property value. The detectionId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getDetectionId() {
        return this.backingStore.get("detectionId");
    }
    /**
     * Gets the detectorBot property value. The detectorBot property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetectorBot() {
        return this.backingStore.get("detectorBot");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("detectionId", (n) -> { this.setDetectionId(n.getUUIDValue()); });
        deserializerMap.put("detectorBot", (n) -> { this.setDetectorBot(n.getStringValue()); });
        deserializerMap.put("isParticipantTrusted", (n) -> { this.setIsParticipantTrusted(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("syntheticConfidence", (n) -> { this.setSyntheticConfidence(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isParticipantTrusted property value. The isParticipantTrusted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsParticipantTrusted() {
        return this.backingStore.get("isParticipantTrusted");
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
     * Gets the syntheticConfidence property value. The syntheticConfidence property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSyntheticConfidence() {
        return this.backingStore.get("syntheticConfidence");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeUUIDValue("detectionId", this.getDetectionId());
        writer.writeStringValue("detectorBot", this.getDetectorBot());
        writer.writeBooleanValue("isParticipantTrusted", this.getIsParticipantTrusted());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("syntheticConfidence", this.getSyntheticConfidence());
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
     * Sets the detectionId property value. The detectionId property
     * @param value Value to set for the detectionId property.
     */
    public void setDetectionId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("detectionId", value);
    }
    /**
     * Sets the detectorBot property value. The detectorBot property
     * @param value Value to set for the detectorBot property.
     */
    public void setDetectorBot(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detectorBot", value);
    }
    /**
     * Sets the isParticipantTrusted property value. The isParticipantTrusted property
     * @param value Value to set for the isParticipantTrusted property.
     */
    public void setIsParticipantTrusted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isParticipantTrusted", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the syntheticConfidence property value. The syntheticConfidence property
     * @param value Value to set for the syntheticConfidence property.
     */
    public void setSyntheticConfidence(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("syntheticConfidence", value);
    }
}

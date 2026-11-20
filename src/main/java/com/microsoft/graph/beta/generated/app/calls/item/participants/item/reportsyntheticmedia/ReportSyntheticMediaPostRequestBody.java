package com.microsoft.graph.beta.app.calls.item.participants.item.reportsyntheticmedia;

import com.microsoft.graph.beta.models.DetectionSeverity;
import com.microsoft.graph.beta.models.MediaMetadata;
import com.microsoft.graph.beta.models.SyntheticMediaDetectionDetail;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportSyntheticMediaPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReportSyntheticMediaPostRequestBody} and sets the default values.
     */
    public ReportSyntheticMediaPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
        this.setIsMalicious(false);
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportSyntheticMediaPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ReportSyntheticMediaPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportSyntheticMediaPostRequestBody();
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
     * Gets the contentMetadata property value. The contentMetadata property
     * @return a {@link MediaMetadata}
     */
    @jakarta.annotation.Nullable
    public MediaMetadata getContentMetadata() {
        return this.backingStore.get("contentMetadata");
    }
    /**
     * Gets the detectionDateTime property value. The detectionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectionDateTime() {
        return this.backingStore.get("detectionDateTime");
    }
    /**
     * Gets the detections property value. The detections property
     * @return a {@link java.util.List<SyntheticMediaDetectionDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SyntheticMediaDetectionDetail> getDetections() {
        return this.backingStore.get("detections");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("contentMetadata", (n) -> { this.setContentMetadata(n.getObjectValue(MediaMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("detectionDateTime", (n) -> { this.setDetectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detections", (n) -> { this.setDetections(n.getCollectionOfObjectValues(SyntheticMediaDetectionDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("isMalicious", (n) -> { this.setIsMalicious(n.getBooleanValue()); });
        deserializerMap.put("overallConfidence", (n) -> { this.setOverallConfidence(n.getDoubleValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(DetectionSeverity::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the isMalicious property value. The isMalicious property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMalicious() {
        return this.backingStore.get("isMalicious");
    }
    /**
     * Gets the overallConfidence property value. The overallConfidence property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOverallConfidence() {
        return this.backingStore.get("overallConfidence");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link DetectionSeverity}
     */
    @jakarta.annotation.Nullable
    public DetectionSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentMetadata", this.getContentMetadata());
        writer.writeOffsetDateTimeValue("detectionDateTime", this.getDetectionDateTime());
        writer.writeCollectionOfObjectValues("detections", this.getDetections());
        writer.writeUUIDValue("id", this.getId());
        writer.writeBooleanValue("isMalicious", this.getIsMalicious());
        writer.writeDoubleValue("overallConfidence", this.getOverallConfidence());
        writer.writeEnumValue("severity", this.getSeverity());
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
     * Sets the contentMetadata property value. The contentMetadata property
     * @param value Value to set for the contentMetadata property.
     */
    public void setContentMetadata(@jakarta.annotation.Nullable final MediaMetadata value) {
        this.backingStore.set("contentMetadata", value);
    }
    /**
     * Sets the detectionDateTime property value. The detectionDateTime property
     * @param value Value to set for the detectionDateTime property.
     */
    public void setDetectionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("detectionDateTime", value);
    }
    /**
     * Sets the detections property value. The detections property
     * @param value Value to set for the detections property.
     */
    public void setDetections(@jakarta.annotation.Nullable final java.util.List<SyntheticMediaDetectionDetail> value) {
        this.backingStore.set("detections", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the isMalicious property value. The isMalicious property
     * @param value Value to set for the isMalicious property.
     */
    public void setIsMalicious(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMalicious", value);
    }
    /**
     * Sets the overallConfidence property value. The overallConfidence property
     * @param value Value to set for the overallConfidence property.
     */
    public void setOverallConfidence(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("overallConfidence", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final DetectionSeverity value) {
        this.backingStore.set("severity", value);
    }
}

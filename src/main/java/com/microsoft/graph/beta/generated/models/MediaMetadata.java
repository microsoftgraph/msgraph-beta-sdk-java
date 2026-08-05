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
public class MediaMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MediaMetadata} and sets the default values.
     */
    public MediaMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MediaMetadata}
     */
    @jakarta.annotation.Nonnull
    public static MediaMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaMetadata();
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
     * Gets the audioMetadata property value. The audioMetadata property
     * @return a {@link AudioMetadata}
     */
    @jakarta.annotation.Nullable
    public AudioMetadata getAudioMetadata() {
        return this.backingStore.get("audioMetadata");
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
     * Gets the byteSize property value. The byteSize property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getByteSize() {
        return this.backingStore.get("byteSize");
    }
    /**
     * Gets the duration property value. The duration property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("audioMetadata", (n) -> { this.setAudioMetadata(n.getObjectValue(AudioMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("byteSize", (n) -> { this.setByteSize(n.getLongValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("isRealTime", (n) -> { this.setIsRealTime(n.getBooleanValue()); });
        deserializerMap.put("mimeType", (n) -> { this.setMimeType(n.getStringValue()); });
        deserializerMap.put("modality", (n) -> { this.setModality(n.getEnumValue(ContentModality::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("streamingMetadata", (n) -> { this.setStreamingMetadata(n.getObjectValue(StreamingMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("videoMetadata", (n) -> { this.setVideoMetadata(n.getObjectValue(VideoMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isRealTime property value. The isRealTime property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRealTime() {
        return this.backingStore.get("isRealTime");
    }
    /**
     * Gets the mimeType property value. The mimeType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMimeType() {
        return this.backingStore.get("mimeType");
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
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the streamingMetadata property value. The streamingMetadata property
     * @return a {@link StreamingMetadata}
     */
    @jakarta.annotation.Nullable
    public StreamingMetadata getStreamingMetadata() {
        return this.backingStore.get("streamingMetadata");
    }
    /**
     * Gets the videoMetadata property value. The videoMetadata property
     * @return a {@link VideoMetadata}
     */
    @jakarta.annotation.Nullable
    public VideoMetadata getVideoMetadata() {
        return this.backingStore.get("videoMetadata");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("audioMetadata", this.getAudioMetadata());
        writer.writeLongValue("byteSize", this.getByteSize());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeBooleanValue("isRealTime", this.getIsRealTime());
        writer.writeStringValue("mimeType", this.getMimeType());
        writer.writeEnumValue("modality", this.getModality());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("streamingMetadata", this.getStreamingMetadata());
        writer.writeObjectValue("videoMetadata", this.getVideoMetadata());
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
     * Sets the audioMetadata property value. The audioMetadata property
     * @param value Value to set for the audioMetadata property.
     */
    public void setAudioMetadata(@jakarta.annotation.Nullable final AudioMetadata value) {
        this.backingStore.set("audioMetadata", value);
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
     * Sets the byteSize property value. The byteSize property
     * @param value Value to set for the byteSize property.
     */
    public void setByteSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("byteSize", value);
    }
    /**
     * Sets the duration property value. The duration property
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the isRealTime property value. The isRealTime property
     * @param value Value to set for the isRealTime property.
     */
    public void setIsRealTime(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRealTime", value);
    }
    /**
     * Sets the mimeType property value. The mimeType property
     * @param value Value to set for the mimeType property.
     */
    public void setMimeType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mimeType", value);
    }
    /**
     * Sets the modality property value. The modality property
     * @param value Value to set for the modality property.
     */
    public void setModality(@jakarta.annotation.Nullable final ContentModality value) {
        this.backingStore.set("modality", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the streamingMetadata property value. The streamingMetadata property
     * @param value Value to set for the streamingMetadata property.
     */
    public void setStreamingMetadata(@jakarta.annotation.Nullable final StreamingMetadata value) {
        this.backingStore.set("streamingMetadata", value);
    }
    /**
     * Sets the videoMetadata property value. The videoMetadata property
     * @param value Value to set for the videoMetadata property.
     */
    public void setVideoMetadata(@jakarta.annotation.Nullable final VideoMetadata value) {
        this.backingStore.set("videoMetadata", value);
    }
}

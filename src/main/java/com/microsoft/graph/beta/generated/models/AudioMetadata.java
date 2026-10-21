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
public class AudioMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AudioMetadata} and sets the default values.
     */
    public AudioMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AudioMetadata}
     */
    @jakarta.annotation.Nonnull
    public static AudioMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudioMetadata();
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
     * Gets the bitDepth property value. Bit depth of the audio samples (for example, 16, 24).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitDepth() {
        return this.backingStore.get("bitDepth");
    }
    /**
     * Gets the channels property value. Number of audio channels (for example, 1 for mono, 2 for stereo).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getChannels() {
        return this.backingStore.get("channels");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("bitDepth", (n) -> { this.setBitDepth(n.getIntegerValue()); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sampleRateHz", (n) -> { this.setSampleRateHz(n.getIntegerValue()); });
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
     * Gets the sampleRateHz property value. Sample rate in Hertz (for example, 16000, 48000).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSampleRateHz() {
        return this.backingStore.get("sampleRateHz");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bitDepth", this.getBitDepth());
        writer.writeIntegerValue("channels", this.getChannels());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("sampleRateHz", this.getSampleRateHz());
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
     * Sets the bitDepth property value. Bit depth of the audio samples (for example, 16, 24).
     * @param value Value to set for the bitDepth property.
     */
    public void setBitDepth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bitDepth", value);
    }
    /**
     * Sets the channels property value. Number of audio channels (for example, 1 for mono, 2 for stereo).
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("channels", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sampleRateHz property value. Sample rate in Hertz (for example, 16000, 48000).
     * @param value Value to set for the sampleRateHz property.
     */
    public void setSampleRateHz(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sampleRateHz", value);
    }
}

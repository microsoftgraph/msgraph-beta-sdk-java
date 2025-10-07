package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TranscriptPayload implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TranscriptPayload} and sets the default values.
     */
    public TranscriptPayload() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TranscriptPayload}
     */
    @jakarta.annotation.Nonnull
    public static TranscriptPayload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranscriptPayload();
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
     * Gets the audioCaptureDateTime property value. The audioCaptureDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAudioCaptureDateTime() {
        return this.backingStore.get("audioCaptureDateTime");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("audioCaptureDateTime", (n) -> { this.setAudioCaptureDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("speaker", (n) -> { this.setSpeaker(n.getObjectValue(TranscriptSpeaker::createFromDiscriminatorValue)); });
        deserializerMap.put("spokenLanguage", (n) -> { this.setSpokenLanguage(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
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
     * Gets the speaker property value. The speaker property
     * @return a {@link TranscriptSpeaker}
     */
    @jakarta.annotation.Nullable
    public TranscriptSpeaker getSpeaker() {
        return this.backingStore.get("speaker");
    }
    /**
     * Gets the spokenLanguage property value. The spokenLanguage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpokenLanguage() {
        return this.backingStore.get("spokenLanguage");
    }
    /**
     * Gets the text property value. The text property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.backingStore.get("text");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("audioCaptureDateTime", this.getAudioCaptureDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("speaker", this.getSpeaker());
        writer.writeStringValue("spokenLanguage", this.getSpokenLanguage());
        writer.writeStringValue("text", this.getText());
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
     * Sets the audioCaptureDateTime property value. The audioCaptureDateTime property
     * @param value Value to set for the audioCaptureDateTime property.
     */
    public void setAudioCaptureDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("audioCaptureDateTime", value);
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
     * Sets the speaker property value. The speaker property
     * @param value Value to set for the speaker property.
     */
    public void setSpeaker(@jakarta.annotation.Nullable final TranscriptSpeaker value) {
        this.backingStore.set("speaker", value);
    }
    /**
     * Sets the spokenLanguage property value. The spokenLanguage property
     * @param value Value to set for the spokenLanguage property.
     */
    public void setSpokenLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("spokenLanguage", value);
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("text", value);
    }
}

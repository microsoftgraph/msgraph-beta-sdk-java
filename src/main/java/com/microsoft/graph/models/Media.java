package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Media implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If a file has a transcript, this setting controls if the closed captions / transcription for the media file should be shown to people during viewing. Read-Write.
     */
    private Boolean isTranscriptionShown;
    /**
     * Information about the source of media. Read-only.
     */
    private MediaSource mediaSource;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new Media and sets the default values.
     */
    public Media() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Media
     */
    @jakarta.annotation.Nonnull
    public static Media createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Media();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isTranscriptionShown", (n) -> { this.setIsTranscriptionShown(n.getBooleanValue()); });
        deserializerMap.put("mediaSource", (n) -> { this.setMediaSource(n.getObjectValue(MediaSource::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTranscriptionShown property value. If a file has a transcript, this setting controls if the closed captions / transcription for the media file should be shown to people during viewing. Read-Write.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTranscriptionShown() {
        return this.isTranscriptionShown;
    }
    /**
     * Gets the mediaSource property value. Information about the source of media. Read-only.
     * @return a MediaSource
     */
    @jakarta.annotation.Nullable
    public MediaSource getMediaSource() {
        return this.mediaSource;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isTranscriptionShown", this.getIsTranscriptionShown());
        writer.writeObjectValue("mediaSource", this.getMediaSource());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isTranscriptionShown property value. If a file has a transcript, this setting controls if the closed captions / transcription for the media file should be shown to people during viewing. Read-Write.
     * @param value Value to set for the isTranscriptionShown property.
     */
    public void setIsTranscriptionShown(@jakarta.annotation.Nullable final Boolean value) {
        this.isTranscriptionShown = value;
    }
    /**
     * Sets the mediaSource property value. Information about the source of media. Read-only.
     * @param value Value to set for the mediaSource property.
     */
    public void setMediaSource(@jakarta.annotation.Nullable final MediaSource value) {
        this.mediaSource = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

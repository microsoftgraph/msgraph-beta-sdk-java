package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Media implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If a file has a transcript, this setting controls if the closed captions / transcription for the media file should be shown to people during viewing. Read-Write. */
    private Boolean _isTranscriptionShown;
    /** Information about the source of media. Read-only. */
    private MediaSource _mediaSource;
    /**
     * Instantiates a new media and sets the default values.
     * @return a void
     */
    public Media() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a media
     */
    @javax.annotation.Nonnull
    public static Media createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Media();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Media currentObject = this;
        return new HashMap<>(2) {{
            this.put("isTranscriptionShown", (n) -> { currentObject.setIsTranscriptionShown(n.getBooleanValue()); });
            this.put("mediaSource", (n) -> { currentObject.setMediaSource(n.getObjectValue(MediaSource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isTranscriptionShown property value. If a file has a transcript, this setting controls if the closed captions / transcription for the media file should be shown to people during viewing. Read-Write.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTranscriptionShown() {
        return this._isTranscriptionShown;
    }
    /**
     * Gets the mediaSource property value. Information about the source of media. Read-only.
     * @return a mediaSource
     */
    @javax.annotation.Nullable
    public MediaSource getMediaSource() {
        return this._mediaSource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isTranscriptionShown", this.getIsTranscriptionShown());
        writer.writeObjectValue("mediaSource", this.getMediaSource());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isTranscriptionShown property value. If a file has a transcript, this setting controls if the closed captions / transcription for the media file should be shown to people during viewing. Read-Write.
     * @param value Value to set for the isTranscriptionShown property.
     * @return a void
     */
    public void setIsTranscriptionShown(@javax.annotation.Nullable final Boolean value) {
        this._isTranscriptionShown = value;
    }
    /**
     * Sets the mediaSource property value. Information about the source of media. Read-only.
     * @param value Value to set for the mediaSource property.
     * @return a void
     */
    public void setMediaSource(@javax.annotation.Nullable final MediaSource value) {
        this._mediaSource = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingSpeaker implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Bio of the speaker. */
    private String _bio;
    /** Display name of the speaker. */
    private String _displayName;
    /**
     * Instantiates a new meetingSpeaker and sets the default values.
     * @return a void
     */
    public MeetingSpeaker() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingSpeaker
     */
    @javax.annotation.Nonnull
    public static MeetingSpeaker createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingSpeaker();
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
     * Gets the bio property value. Bio of the speaker.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBio() {
        return this._bio;
    }
    /**
     * Gets the displayName property value. Display name of the speaker.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingSpeaker currentObject = this;
        return new HashMap<>(2) {{
            this.put("bio", (n) -> { currentObject.setBio(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("bio", this.getBio());
        writer.writeStringValue("displayName", this.getDisplayName());
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
     * Sets the bio property value. Bio of the speaker.
     * @param value Value to set for the bio property.
     * @return a void
     */
    public void setBio(@javax.annotation.Nullable final String value) {
        this._bio = value;
    }
    /**
     * Sets the displayName property value. Display name of the speaker.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}

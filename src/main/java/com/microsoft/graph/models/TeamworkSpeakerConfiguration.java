package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkSpeakerConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The defaultCommunicationSpeaker property */
    private TeamworkPeripheral _defaultCommunicationSpeaker;
    /** The defaultSpeaker property */
    private TeamworkPeripheral _defaultSpeaker;
    /** True if the communication speaker is optional. Used to compute the health state if the communication speaker is not optional. */
    private Boolean _isCommunicationSpeakerOptional;
    /** True if the configured speaker is optional. Used to compute the health state if the speaker is not optional. */
    private Boolean _isSpeakerOptional;
    /** The OdataType property */
    private String _odataType;
    /** The speakers property */
    private java.util.List<TeamworkPeripheral> _speakers;
    /**
     * Instantiates a new teamworkSpeakerConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkSpeakerConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkSpeakerConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkSpeakerConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkSpeakerConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSpeakerConfiguration();
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
     * Gets the defaultCommunicationSpeaker property value. The defaultCommunicationSpeaker property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getDefaultCommunicationSpeaker() {
        return this._defaultCommunicationSpeaker;
    }
    /**
     * Gets the defaultSpeaker property value. The defaultSpeaker property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getDefaultSpeaker() {
        return this._defaultSpeaker;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkSpeakerConfiguration currentObject = this;
        return new HashMap<>(6) {{
            this.put("defaultCommunicationSpeaker", (n) -> { currentObject.setDefaultCommunicationSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
            this.put("defaultSpeaker", (n) -> { currentObject.setDefaultSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
            this.put("isCommunicationSpeakerOptional", (n) -> { currentObject.setIsCommunicationSpeakerOptional(n.getBooleanValue()); });
            this.put("isSpeakerOptional", (n) -> { currentObject.setIsSpeakerOptional(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("speakers", (n) -> { currentObject.setSpeakers(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isCommunicationSpeakerOptional property value. True if the communication speaker is optional. Used to compute the health state if the communication speaker is not optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCommunicationSpeakerOptional() {
        return this._isCommunicationSpeakerOptional;
    }
    /**
     * Gets the isSpeakerOptional property value. True if the configured speaker is optional. Used to compute the health state if the speaker is not optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSpeakerOptional() {
        return this._isSpeakerOptional;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the speakers property value. The speakers property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getSpeakers() {
        return this._speakers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultCommunicationSpeaker", this.getDefaultCommunicationSpeaker());
        writer.writeObjectValue("defaultSpeaker", this.getDefaultSpeaker());
        writer.writeBooleanValue("isCommunicationSpeakerOptional", this.getIsCommunicationSpeakerOptional());
        writer.writeBooleanValue("isSpeakerOptional", this.getIsSpeakerOptional());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("speakers", this.getSpeakers());
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
     * Sets the defaultCommunicationSpeaker property value. The defaultCommunicationSpeaker property
     * @param value Value to set for the defaultCommunicationSpeaker property.
     * @return a void
     */
    public void setDefaultCommunicationSpeaker(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._defaultCommunicationSpeaker = value;
    }
    /**
     * Sets the defaultSpeaker property value. The defaultSpeaker property
     * @param value Value to set for the defaultSpeaker property.
     * @return a void
     */
    public void setDefaultSpeaker(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._defaultSpeaker = value;
    }
    /**
     * Sets the isCommunicationSpeakerOptional property value. True if the communication speaker is optional. Used to compute the health state if the communication speaker is not optional.
     * @param value Value to set for the isCommunicationSpeakerOptional property.
     * @return a void
     */
    public void setIsCommunicationSpeakerOptional(@javax.annotation.Nullable final Boolean value) {
        this._isCommunicationSpeakerOptional = value;
    }
    /**
     * Sets the isSpeakerOptional property value. True if the configured speaker is optional. Used to compute the health state if the speaker is not optional.
     * @param value Value to set for the isSpeakerOptional property.
     * @return a void
     */
    public void setIsSpeakerOptional(@javax.annotation.Nullable final Boolean value) {
        this._isSpeakerOptional = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the speakers property value. The speakers property
     * @param value Value to set for the speakers property.
     * @return a void
     */
    public void setSpeakers(@javax.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this._speakers = value;
    }
}

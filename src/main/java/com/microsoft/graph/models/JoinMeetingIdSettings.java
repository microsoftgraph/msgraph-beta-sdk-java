package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class JoinMeetingIdSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The isPasscodeRequired property */
    private Boolean _isPasscodeRequired;
    /** The joinMeetingId property */
    private String _joinMeetingId;
    /** The passcode property */
    private String _passcode;
    /**
     * Instantiates a new joinMeetingIdSettings and sets the default values.
     * @return a void
     */
    public JoinMeetingIdSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a joinMeetingIdSettings
     */
    @javax.annotation.Nonnull
    public static JoinMeetingIdSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinMeetingIdSettings();
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
        final JoinMeetingIdSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("isPasscodeRequired", (n) -> { currentObject.setIsPasscodeRequired(n.getBooleanValue()); });
            this.put("joinMeetingId", (n) -> { currentObject.setJoinMeetingId(n.getStringValue()); });
            this.put("passcode", (n) -> { currentObject.setPasscode(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isPasscodeRequired property value. The isPasscodeRequired property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPasscodeRequired() {
        return this._isPasscodeRequired;
    }
    /**
     * Gets the joinMeetingId property value. The joinMeetingId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinMeetingId() {
        return this._joinMeetingId;
    }
    /**
     * Gets the passcode property value. The passcode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasscode() {
        return this._passcode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isPasscodeRequired", this.getIsPasscodeRequired());
        writer.writeStringValue("joinMeetingId", this.getJoinMeetingId());
        writer.writeStringValue("passcode", this.getPasscode());
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
     * Sets the isPasscodeRequired property value. The isPasscodeRequired property
     * @param value Value to set for the isPasscodeRequired property.
     * @return a void
     */
    public void setIsPasscodeRequired(@javax.annotation.Nullable final Boolean value) {
        this._isPasscodeRequired = value;
    }
    /**
     * Sets the joinMeetingId property value. The joinMeetingId property
     * @param value Value to set for the joinMeetingId property.
     * @return a void
     */
    public void setJoinMeetingId(@javax.annotation.Nullable final String value) {
        this._joinMeetingId = value;
    }
    /**
     * Sets the passcode property value. The passcode property
     * @param value Value to set for the passcode property.
     * @return a void
     */
    public void setPasscode(@javax.annotation.Nullable final String value) {
        this._passcode = value;
    }
}

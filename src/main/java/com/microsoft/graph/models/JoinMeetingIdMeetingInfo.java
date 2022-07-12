package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class JoinMeetingIdMeetingInfo extends MeetingInfo implements Parsable {
    /** The ID used to join the meeting. */
    private String _joinMeetingId;
    /** The passcode used to join the meeting. Optional. */
    private String _passcode;
    /**
     * Instantiates a new JoinMeetingIdMeetingInfo and sets the default values.
     * @return a void
     */
    public JoinMeetingIdMeetingInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JoinMeetingIdMeetingInfo
     */
    @javax.annotation.Nonnull
    public static JoinMeetingIdMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinMeetingIdMeetingInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final JoinMeetingIdMeetingInfo currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("joinMeetingId", (n) -> { currentObject.setJoinMeetingId(n.getStringValue()); });
            this.put("passcode", (n) -> { currentObject.setPasscode(n.getStringValue()); });
        }};
    }
    /**
     * Gets the joinMeetingId property value. The ID used to join the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinMeetingId() {
        return this._joinMeetingId;
    }
    /**
     * Gets the passcode property value. The passcode used to join the meeting. Optional.
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
        super.serialize(writer);
        writer.writeStringValue("joinMeetingId", this.getJoinMeetingId());
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the joinMeetingId property value. The ID used to join the meeting.
     * @param value Value to set for the joinMeetingId property.
     * @return a void
     */
    public void setJoinMeetingId(@javax.annotation.Nullable final String value) {
        this._joinMeetingId = value;
    }
    /**
     * Sets the passcode property value. The passcode used to join the meeting. Optional.
     * @param value Value to set for the passcode property.
     * @return a void
     */
    public void setPasscode(@javax.annotation.Nullable final String value) {
        this._passcode = value;
    }
}

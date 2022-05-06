package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingRegistrationBase extends Entity implements Parsable {
    /** Specifies who can register for the meeting.  */
    private MeetingAudience _allowedRegistrant;
    /** Registrants of the online meeting.  */
    private java.util.List<MeetingRegistrantBase> _registrants;
    /**
     * Instantiates a new meetingRegistrationBase and sets the default values.
     * @return a void
     */
    public MeetingRegistrationBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingRegistrationBase
     */
    @javax.annotation.Nonnull
    public static MeetingRegistrationBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistrationBase();
    }
    /**
     * Gets the allowedRegistrant property value. Specifies who can register for the meeting.
     * @return a meetingAudience
     */
    @javax.annotation.Nullable
    public MeetingAudience getAllowedRegistrant() {
        return this._allowedRegistrant;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingRegistrationBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedRegistrant", (n) -> { currentObject.setAllowedRegistrant(n.getEnumValue(MeetingAudience.class)); });
            this.put("registrants", (n) -> { currentObject.setRegistrants(n.getCollectionOfObjectValues(MeetingRegistrantBase::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the registrants property value. Registrants of the online meeting.
     * @return a meetingRegistrantBase
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingRegistrantBase> getRegistrants() {
        return this._registrants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowedRegistrant", this.getAllowedRegistrant());
        writer.writeCollectionOfObjectValues("registrants", this.getRegistrants());
    }
    /**
     * Sets the allowedRegistrant property value. Specifies who can register for the meeting.
     * @param value Value to set for the allowedRegistrant property.
     * @return a void
     */
    public void setAllowedRegistrant(@javax.annotation.Nullable final MeetingAudience value) {
        this._allowedRegistrant = value;
    }
    /**
     * Sets the registrants property value. Registrants of the online meeting.
     * @param value Value to set for the registrants property.
     * @return a void
     */
    public void setRegistrants(@javax.annotation.Nullable final java.util.List<MeetingRegistrantBase> value) {
        this._registrants = value;
    }
}

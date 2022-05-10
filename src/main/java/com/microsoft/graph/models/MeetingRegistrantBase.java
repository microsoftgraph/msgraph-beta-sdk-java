package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingRegistrantBase extends Entity implements Parsable {
    /** A unique web URL for the registrant to join the meeting. Read-only. */
    private String _joinWebUrl;
    /**
     * Instantiates a new meetingRegistrantBase and sets the default values.
     * @return a void
     */
    public MeetingRegistrantBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingRegistrantBase
     */
    @javax.annotation.Nonnull
    public static MeetingRegistrantBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistrantBase();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingRegistrantBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("joinWebUrl", (n) -> { currentObject.setJoinWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the joinWebUrl property value. A unique web URL for the registrant to join the meeting. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this._joinWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
    }
    /**
     * Sets the joinWebUrl property value. A unique web URL for the registrant to join the meeting. Read-only.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this._joinWebUrl = value;
    }
}

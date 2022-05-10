package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedEmailDomainInvitation extends Entity implements Parsable {
    /** The expiryTime property */
    private OffsetDateTime _expiryTime;
    /** The invitationDomain property */
    private String _invitationDomain;
    /** The invitationStatus property */
    private String _invitationStatus;
    /**
     * Instantiates a new sharedEmailDomainInvitation and sets the default values.
     * @return a void
     */
    public SharedEmailDomainInvitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedEmailDomainInvitation
     */
    @javax.annotation.Nonnull
    public static SharedEmailDomainInvitation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedEmailDomainInvitation();
    }
    /**
     * Gets the expiryTime property value. The expiryTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiryTime() {
        return this._expiryTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedEmailDomainInvitation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("expiryTime", (n) -> { currentObject.setExpiryTime(n.getOffsetDateTimeValue()); });
            this.put("invitationDomain", (n) -> { currentObject.setInvitationDomain(n.getStringValue()); });
            this.put("invitationStatus", (n) -> { currentObject.setInvitationStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the invitationDomain property value. The invitationDomain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitationDomain() {
        return this._invitationDomain;
    }
    /**
     * Gets the invitationStatus property value. The invitationStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitationStatus() {
        return this._invitationStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expiryTime", this.getExpiryTime());
        writer.writeStringValue("invitationDomain", this.getInvitationDomain());
        writer.writeStringValue("invitationStatus", this.getInvitationStatus());
    }
    /**
     * Sets the expiryTime property value. The expiryTime property
     * @param value Value to set for the expiryTime property.
     * @return a void
     */
    public void setExpiryTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiryTime = value;
    }
    /**
     * Sets the invitationDomain property value. The invitationDomain property
     * @param value Value to set for the invitationDomain property.
     * @return a void
     */
    public void setInvitationDomain(@javax.annotation.Nullable final String value) {
        this._invitationDomain = value;
    }
    /**
     * Sets the invitationStatus property value. The invitationStatus property
     * @param value Value to set for the invitationStatus property.
     * @return a void
     */
    public void setInvitationStatus(@javax.annotation.Nullable final String value) {
        this._invitationStatus = value;
    }
}

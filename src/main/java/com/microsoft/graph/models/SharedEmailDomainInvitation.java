package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedEmailDomainInvitation extends Entity implements Parsable {
    /** The expiryTime property */
    private OffsetDateTime expiryTime;
    /** The invitationDomain property */
    private String invitationDomain;
    /** The invitationStatus property */
    private String invitationStatus;
    /**
     * Instantiates a new sharedEmailDomainInvitation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.expiryTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expiryTime", (n) -> { this.setExpiryTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("invitationDomain", (n) -> { this.setInvitationDomain(n.getStringValue()); });
        deserializerMap.put("invitationStatus", (n) -> { this.setInvitationStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitationDomain property value. The invitationDomain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitationDomain() {
        return this.invitationDomain;
    }
    /**
     * Gets the invitationStatus property value. The invitationStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitationStatus() {
        return this.invitationStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setExpiryTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expiryTime = value;
    }
    /**
     * Sets the invitationDomain property value. The invitationDomain property
     * @param value Value to set for the invitationDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitationDomain(@javax.annotation.Nullable final String value) {
        this.invitationDomain = value;
    }
    /**
     * Sets the invitationStatus property value. The invitationStatus property
     * @param value Value to set for the invitationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitationStatus(@javax.annotation.Nullable final String value) {
        this.invitationStatus = value;
    }
}

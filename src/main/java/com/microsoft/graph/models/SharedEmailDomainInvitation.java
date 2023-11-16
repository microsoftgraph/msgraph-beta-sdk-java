package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedEmailDomainInvitation extends Entity implements Parsable {
    /**
     * Instantiates a new SharedEmailDomainInvitation and sets the default values.
     */
    public SharedEmailDomainInvitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedEmailDomainInvitation
     */
    @jakarta.annotation.Nonnull
    public static SharedEmailDomainInvitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedEmailDomainInvitation();
    }
    /**
     * Gets the expiryTime property value. The expiryTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiryTime() {
        return this.BackingStore.get("expiryTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expiryTime", (n) -> { this.setExpiryTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("invitationDomain", (n) -> { this.setInvitationDomain(n.getStringValue()); });
        deserializerMap.put("invitationStatus", (n) -> { this.setInvitationStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitationDomain property value. The invitationDomain property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInvitationDomain() {
        return this.BackingStore.get("invitationDomain");
    }
    /**
     * Gets the invitationStatus property value. The invitationStatus property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInvitationStatus() {
        return this.BackingStore.get("invitationStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expiryTime", this.getExpiryTime());
        writer.writeStringValue("invitationDomain", this.getInvitationDomain());
        writer.writeStringValue("invitationStatus", this.getInvitationStatus());
    }
    /**
     * Sets the expiryTime property value. The expiryTime property
     * @param value Value to set for the expiryTime property.
     */
    public void setExpiryTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("expiryTime", value);
    }
    /**
     * Sets the invitationDomain property value. The invitationDomain property
     * @param value Value to set for the invitationDomain property.
     */
    public void setInvitationDomain(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("invitationDomain", value);
    }
    /**
     * Sets the invitationStatus property value. The invitationStatus property
     * @param value Value to set for the invitationStatus property.
     */
    public void setInvitationStatus(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("invitationStatus", value);
    }
}

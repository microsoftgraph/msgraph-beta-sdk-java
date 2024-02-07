package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChannelSharingUpdatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Instantiates a new ChannelSharingUpdatedEventMessageDetail and sets the default values.
     */
    public ChannelSharingUpdatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.channelSharingUpdatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelSharingUpdatedEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static ChannelSharingUpdatedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelSharingUpdatedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("ownerTeamId", (n) -> { this.setOwnerTeamId(n.getStringValue()); });
        deserializerMap.put("ownerTenantId", (n) -> { this.setOwnerTenantId(n.getStringValue()); });
        deserializerMap.put("sharedChannelId", (n) -> { this.setSharedChannelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.backingStore.get("initiator");
    }
    /**
     * Gets the ownerTeamId property value. The ID of the team to which the shared channel belongs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerTeamId() {
        return this.backingStore.get("ownerTeamId");
    }
    /**
     * Gets the ownerTenantId property value. The ID of the tenant to which the shared channel belongs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerTenantId() {
        return this.backingStore.get("ownerTenantId");
    }
    /**
     * Gets the sharedChannelId property value. The ID of the shared channel.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSharedChannelId() {
        return this.backingStore.get("sharedChannelId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("ownerTeamId", this.getOwnerTeamId());
        writer.writeStringValue("ownerTenantId", this.getOwnerTenantId());
        writer.writeStringValue("sharedChannelId", this.getSharedChannelId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("initiator", value);
    }
    /**
     * Sets the ownerTeamId property value. The ID of the team to which the shared channel belongs.
     * @param value Value to set for the ownerTeamId property.
     */
    public void setOwnerTeamId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerTeamId", value);
    }
    /**
     * Sets the ownerTenantId property value. The ID of the tenant to which the shared channel belongs.
     * @param value Value to set for the ownerTenantId property.
     */
    public void setOwnerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerTenantId", value);
    }
    /**
     * Sets the sharedChannelId property value. The ID of the shared channel.
     * @param value Value to set for the sharedChannelId property.
     */
    public void setSharedChannelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sharedChannelId", value);
    }
}

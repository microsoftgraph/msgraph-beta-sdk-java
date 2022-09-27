package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChannelMembersNotificationRecipient extends TeamworkNotificationRecipient implements Parsable {
    /** The channel's identifier. */
    private String _channelId;
    /** The team's identifier under which the channel resides. */
    private String _teamId;
    /**
     * Instantiates a new ChannelMembersNotificationRecipient and sets the default values.
     * @return a void
     */
    public ChannelMembersNotificationRecipient() {
        super();
        this.setOdataType("#microsoft.graph.channelMembersNotificationRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelMembersNotificationRecipient
     */
    @javax.annotation.Nonnull
    public static ChannelMembersNotificationRecipient createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelMembersNotificationRecipient();
    }
    /**
     * Gets the channelId property value. The channel's identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChannelId() {
        return this._channelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChannelMembersNotificationRecipient currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("channelId", (n) -> { currentObject.setChannelId(n.getStringValue()); });
            this.put("teamId", (n) -> { currentObject.setTeamId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the teamId property value. The team's identifier under which the channel resides.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamId() {
        return this._teamId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("channelId", this.getChannelId());
        writer.writeStringValue("teamId", this.getTeamId());
    }
    /**
     * Sets the channelId property value. The channel's identifier.
     * @param value Value to set for the channelId property.
     * @return a void
     */
    public void setChannelId(@javax.annotation.Nullable final String value) {
        this._channelId = value;
    }
    /**
     * Sets the teamId property value. The team's identifier under which the channel resides.
     * @param value Value to set for the teamId property.
     * @return a void
     */
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this._teamId = value;
    }
}

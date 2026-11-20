package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkChannelTag extends TeamworkTag implements Parsable {
    /**
     * Instantiates a new {@link TeamworkChannelTag} and sets the default values.
     */
    public TeamworkChannelTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkChannelTag}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkChannelTag createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkChannelTag();
    }
    /**
     * Gets the channelId property value. The identifier of the channel that owns the tag. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannelId() {
        return this.backingStore.get("channelId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channelId", (n) -> { this.setChannelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("channelId", this.getChannelId());
    }
    /**
     * Sets the channelId property value. The identifier of the channel that owns the tag. Read-only.
     * @param value Value to set for the channelId property.
     */
    public void setChannelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("channelId", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkMessaging extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamworkMessaging} and sets the default values.
     */
    public TeamworkMessaging() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkMessaging}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkMessaging createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkMessaging();
    }
    /**
     * Gets the customEmojis property value. The customEmojis property
     * @return a {@link java.util.List<TeamworkCustomEmoji>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkCustomEmoji> getCustomEmojis() {
        return this.backingStore.get("customEmojis");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customEmojis", (n) -> { this.setCustomEmojis(n.getCollectionOfObjectValues(TeamworkCustomEmoji::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customEmojis", this.getCustomEmojis());
    }
    /**
     * Sets the customEmojis property value. The customEmojis property
     * @param value Value to set for the customEmojis property.
     */
    public void setCustomEmojis(@jakarta.annotation.Nullable final java.util.List<TeamworkCustomEmoji> value) {
        this.backingStore.set("customEmojis", value);
    }
}

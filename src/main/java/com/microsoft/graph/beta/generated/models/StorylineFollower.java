package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Engagement storyline follower.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorylineFollower extends Entity implements Parsable {
    /**
     * Instantiates a new {@link StorylineFollower} and sets the default values.
     */
    public StorylineFollower() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StorylineFollower}
     */
    @jakarta.annotation.Nonnull
    public static StorylineFollower createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StorylineFollower();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("follower", (n) -> { this.setFollower(n.getObjectValue(EngagementIdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the follower property value. The follower property
     * @return a {@link EngagementIdentitySet}
     */
    @jakarta.annotation.Nullable
    public EngagementIdentitySet getFollower() {
        return this.backingStore.get("follower");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("follower", this.getFollower());
    }
    /**
     * Sets the follower property value. The follower property
     * @param value Value to set for the follower property.
     */
    public void setFollower(@jakarta.annotation.Nullable final EngagementIdentitySet value) {
        this.backingStore.set("follower", value);
    }
}

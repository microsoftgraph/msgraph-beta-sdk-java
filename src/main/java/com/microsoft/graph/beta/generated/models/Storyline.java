package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * User&apos;s storyline singleton container.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Storyline extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Storyline} and sets the default values.
     */
    public Storyline() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Storyline}
     */
    @jakarta.annotation.Nonnull
    public static Storyline createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Storyline();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("followers", (n) -> { this.setFollowers(n.getCollectionOfObjectValues(StorylineFollower::createFromDiscriminatorValue)); });
        deserializerMap.put("followings", (n) -> { this.setFollowings(n.getCollectionOfObjectValues(StorylineFollowing::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the followers property value. The users who are following this user.
     * @return a {@link java.util.List<StorylineFollower>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StorylineFollower> getFollowers() {
        return this.backingStore.get("followers");
    }
    /**
     * Gets the followings property value. The users that this user is following.
     * @return a {@link java.util.List<StorylineFollowing>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StorylineFollowing> getFollowings() {
        return this.backingStore.get("followings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("followers", this.getFollowers());
        writer.writeCollectionOfObjectValues("followings", this.getFollowings());
    }
    /**
     * Sets the followers property value. The users who are following this user.
     * @param value Value to set for the followers property.
     */
    public void setFollowers(@jakarta.annotation.Nullable final java.util.List<StorylineFollower> value) {
        this.backingStore.set("followers", value);
    }
    /**
     * Sets the followings property value. The users that this user is following.
     * @param value Value to set for the followings property.
     */
    public void setFollowings(@jakarta.annotation.Nullable final java.util.List<StorylineFollowing> value) {
        this.backingStore.set("followings", value);
    }
}

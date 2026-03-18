package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Engagement storyline following.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorylineFollowing extends Entity implements Parsable {
    /**
     * Instantiates a new {@link StorylineFollowing} and sets the default values.
     */
    public StorylineFollowing() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StorylineFollowing}
     */
    @jakarta.annotation.Nonnull
    public static StorylineFollowing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StorylineFollowing();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("following", (n) -> { this.setFollowing(n.getObjectValue(EngagementIdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the following property value. The following property
     * @return a {@link EngagementIdentitySet}
     */
    @jakarta.annotation.Nullable
    public EngagementIdentitySet getFollowing() {
        return this.backingStore.get("following");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("following", this.getFollowing());
    }
    /**
     * Sets the following property value. The following property
     * @param value Value to set for the following property.
     */
    public void setFollowing(@jakarta.annotation.Nullable final EngagementIdentitySet value) {
        this.backingStore.set("following", value);
    }
}

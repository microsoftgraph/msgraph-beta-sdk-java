package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiUser extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiUser} and sets the default values.
     */
    public AiUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiUser}
     */
    @jakarta.annotation.Nonnull
    public static AiUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiUser();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("interactionHistory", (n) -> { this.setInteractionHistory(n.getObjectValue(AiInteractionHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeetings", (n) -> { this.setOnlineMeetings(n.getCollectionOfObjectValues(AiOnlineMeeting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the interactionHistory property value. The history of interactions between AI agents and users.
     * @return a {@link AiInteractionHistory}
     */
    @jakarta.annotation.Nullable
    public AiInteractionHistory getInteractionHistory() {
        return this.backingStore.get("interactionHistory");
    }
    /**
     * Gets the onlineMeetings property value. Information about an online meeting, including AI insights.
     * @return a {@link java.util.List<AiOnlineMeeting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiOnlineMeeting> getOnlineMeetings() {
        return this.backingStore.get("onlineMeetings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("interactionHistory", this.getInteractionHistory());
        writer.writeCollectionOfObjectValues("onlineMeetings", this.getOnlineMeetings());
    }
    /**
     * Sets the interactionHistory property value. The history of interactions between AI agents and users.
     * @param value Value to set for the interactionHistory property.
     */
    public void setInteractionHistory(@jakarta.annotation.Nullable final AiInteractionHistory value) {
        this.backingStore.set("interactionHistory", value);
    }
    /**
     * Sets the onlineMeetings property value. Information about an online meeting, including AI insights.
     * @param value Value to set for the onlineMeetings property.
     */
    public void setOnlineMeetings(@jakarta.annotation.Nullable final java.util.List<AiOnlineMeeting> value) {
        this.backingStore.set("onlineMeetings", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiInteractionHistory extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiInteractionHistory} and sets the default values.
     */
    public AiInteractionHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteractionHistory}
     */
    @jakarta.annotation.Nonnull
    public static AiInteractionHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteractionHistory();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("interactions", (n) -> { this.setInteractions(n.getCollectionOfObjectValues(AiInteraction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the interactions property value. The interactions property
     * @return a {@link java.util.List<AiInteraction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiInteraction> getInteractions() {
        return this.backingStore.get("interactions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("interactions", this.getInteractions());
    }
    /**
     * Sets the interactions property value. The interactions property
     * @param value Value to set for the interactions property.
     */
    public void setInteractions(@jakarta.annotation.Nullable final java.util.List<AiInteraction> value) {
        this.backingStore.set("interactions", value);
    }
}

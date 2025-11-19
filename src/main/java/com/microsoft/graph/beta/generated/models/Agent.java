package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Agent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Agent} and sets the default values.
     */
    public Agent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Agent}
     */
    @jakarta.annotation.Nonnull
    public static Agent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Agent();
    }
    /**
     * Gets the copilotTools property value. The copilotTools property
     * @return a {@link java.util.List<CopilotTool>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CopilotTool> getCopilotTools() {
        return this.backingStore.get("copilotTools");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("copilotTools", (n) -> { this.setCopilotTools(n.getCollectionOfObjectValues(CopilotTool::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("copilotTools", this.getCopilotTools());
    }
    /**
     * Sets the copilotTools property value. The copilotTools property
     * @param value Value to set for the copilotTools property.
     */
    public void setCopilotTools(@jakarta.annotation.Nullable final java.util.List<CopilotTool> value) {
        this.backingStore.set("copilotTools", value);
    }
}

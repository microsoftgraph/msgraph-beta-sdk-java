package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotCommunicationsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotCommunicationsRoot} and sets the default values.
     */
    public CopilotCommunicationsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotCommunicationsRoot}
     */
    @jakarta.annotation.Nonnull
    public static CopilotCommunicationsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotCommunicationsRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("realtimeActivityFeed", (n) -> { this.setRealtimeActivityFeed(n.getObjectValue(RealtimeActivityFeedRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the realtimeActivityFeed property value. The realtimeActivityFeed property
     * @return a {@link RealtimeActivityFeedRoot}
     */
    @jakarta.annotation.Nullable
    public RealtimeActivityFeedRoot getRealtimeActivityFeed() {
        return this.backingStore.get("realtimeActivityFeed");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("realtimeActivityFeed", this.getRealtimeActivityFeed());
    }
    /**
     * Sets the realtimeActivityFeed property value. The realtimeActivityFeed property
     * @param value Value to set for the realtimeActivityFeed property.
     */
    public void setRealtimeActivityFeed(@jakarta.annotation.Nullable final RealtimeActivityFeedRoot value) {
        this.backingStore.set("realtimeActivityFeed", value);
    }
}

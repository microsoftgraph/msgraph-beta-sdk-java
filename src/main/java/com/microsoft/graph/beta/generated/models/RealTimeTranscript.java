package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RealTimeTranscript extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RealTimeTranscript} and sets the default values.
     */
    public RealTimeTranscript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RealTimeTranscript}
     */
    @jakarta.annotation.Nonnull
    public static RealTimeTranscript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RealTimeTranscript();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payloads", (n) -> { this.setPayloads(n.getCollectionOfObjectValues(TranscriptPayload::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the payloads property value. The payloads property
     * @return a {@link java.util.List<TranscriptPayload>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TranscriptPayload> getPayloads() {
        return this.backingStore.get("payloads");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("payloads", this.getPayloads());
    }
    /**
     * Sets the payloads property value. The payloads property
     * @param value Value to set for the payloads property.
     */
    public void setPayloads(@jakarta.annotation.Nullable final java.util.List<TranscriptPayload> value) {
        this.backingStore.set("payloads", value);
    }
}

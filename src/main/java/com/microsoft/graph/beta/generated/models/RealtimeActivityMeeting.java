package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RealtimeActivityMeeting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RealtimeActivityMeeting} and sets the default values.
     */
    public RealtimeActivityMeeting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RealtimeActivityMeeting}
     */
    @jakarta.annotation.Nonnull
    public static RealtimeActivityMeeting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RealtimeActivityMeeting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("transcripts", (n) -> { this.setTranscripts(n.getCollectionOfObjectValues(RealTimeTranscript::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the transcripts property value. The transcripts property
     * @return a {@link java.util.List<RealTimeTranscript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RealTimeTranscript> getTranscripts() {
        return this.backingStore.get("transcripts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("transcripts", this.getTranscripts());
    }
    /**
     * Sets the transcripts property value. The transcripts property
     * @param value Value to set for the transcripts property.
     */
    public void setTranscripts(@jakarta.annotation.Nullable final java.util.List<RealTimeTranscript> value) {
        this.backingStore.set("transcripts", value);
    }
}

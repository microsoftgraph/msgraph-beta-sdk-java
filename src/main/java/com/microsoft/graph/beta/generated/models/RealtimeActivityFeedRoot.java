package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RealtimeActivityFeedRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RealtimeActivityFeedRoot} and sets the default values.
     */
    public RealtimeActivityFeedRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RealtimeActivityFeedRoot}
     */
    @jakarta.annotation.Nonnull
    public static RealtimeActivityFeedRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RealtimeActivityFeedRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("meetings", (n) -> { this.setMeetings(n.getCollectionOfObjectValues(RealtimeActivityMeeting::createFromDiscriminatorValue)); });
        deserializerMap.put("multiActivitySubscriptions", (n) -> { this.setMultiActivitySubscriptions(n.getCollectionOfObjectValues(MultiActivitySubscription::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the meetings property value. The meetings property
     * @return a {@link java.util.List<RealtimeActivityMeeting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RealtimeActivityMeeting> getMeetings() {
        return this.backingStore.get("meetings");
    }
    /**
     * Gets the multiActivitySubscriptions property value. The multiActivitySubscriptions property
     * @return a {@link java.util.List<MultiActivitySubscription>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiActivitySubscription> getMultiActivitySubscriptions() {
        return this.backingStore.get("multiActivitySubscriptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("meetings", this.getMeetings());
        writer.writeCollectionOfObjectValues("multiActivitySubscriptions", this.getMultiActivitySubscriptions());
    }
    /**
     * Sets the meetings property value. The meetings property
     * @param value Value to set for the meetings property.
     */
    public void setMeetings(@jakarta.annotation.Nullable final java.util.List<RealtimeActivityMeeting> value) {
        this.backingStore.set("meetings", value);
    }
    /**
     * Sets the multiActivitySubscriptions property value. The multiActivitySubscriptions property
     * @param value Value to set for the multiActivitySubscriptions property.
     */
    public void setMultiActivitySubscriptions(@jakarta.annotation.Nullable final java.util.List<MultiActivitySubscription> value) {
        this.backingStore.set("multiActivitySubscriptions", value);
    }
}

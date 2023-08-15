package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventsRoot extends Entity implements Parsable {
    /**
     * The events property
     */
    private java.util.List<VirtualEvent> events;
    /**
     * The webinars property
     */
    private java.util.List<VirtualEventWebinar> webinars;
    /**
     * Instantiates a new virtualEventsRoot and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public VirtualEventsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventsRoot
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventsRoot();
    }
    /**
     * Gets the events property value. The events property
     * @return a virtualEvent
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEvent> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(VirtualEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("webinars", (n) -> { this.setWebinars(n.getCollectionOfObjectValues(VirtualEventWebinar::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the webinars property value. The webinars property
     * @return a virtualEventWebinar
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventWebinar> getWebinars() {
        return this.webinars;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeCollectionOfObjectValues("webinars", this.getWebinars());
    }
    /**
     * Sets the events property value. The events property
     * @param value Value to set for the events property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<VirtualEvent> value) {
        this.events = value;
    }
    /**
     * Sets the webinars property value. The webinars property
     * @param value Value to set for the webinars property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWebinars(@jakarta.annotation.Nullable final java.util.List<VirtualEventWebinar> value) {
        this.webinars = value;
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventMessageResponse extends EventMessage implements Parsable {
    /**
     * Instantiates a new {@link EventMessageResponse} and sets the default values.
     */
    public EventMessageResponse() {
        super();
        this.setOdataType("#microsoft.graph.eventMessageResponse");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EventMessageResponse}
     */
    @jakarta.annotation.Nonnull
    public static EventMessageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventMessageResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("proposedNewTime", (n) -> { this.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("responseType", (n) -> { this.setResponseType(n.getEnumValue(ResponseType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the proposedNewTime property value. An alternate date/time proposed by an invitee for a meeting request to start and end. Read-only. Not filterable.
     * @return a {@link TimeSlot}
     */
    @jakarta.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this.backingStore.get("proposedNewTime");
    }
    /**
     * Gets the responseType property value. Specifies the type of response to a meeting request. Possible values are: tentativelyAccepted, accepted, declined. For the eventMessageResponse type, none, organizer, and notResponded are not supported. Read-only. Not filterable.
     * @return a {@link ResponseType}
     */
    @jakarta.annotation.Nullable
    public ResponseType getResponseType() {
        return this.backingStore.get("responseType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("proposedNewTime", this.getProposedNewTime());
        writer.writeEnumValue("responseType", this.getResponseType());
    }
    /**
     * Sets the proposedNewTime property value. An alternate date/time proposed by an invitee for a meeting request to start and end. Read-only. Not filterable.
     * @param value Value to set for the proposedNewTime property.
     */
    public void setProposedNewTime(@jakarta.annotation.Nullable final TimeSlot value) {
        this.backingStore.set("proposedNewTime", value);
    }
    /**
     * Sets the responseType property value. Specifies the type of response to a meeting request. Possible values are: tentativelyAccepted, accepted, declined. For the eventMessageResponse type, none, organizer, and notResponded are not supported. Read-only. Not filterable.
     * @param value Value to set for the responseType property.
     */
    public void setResponseType(@jakarta.annotation.Nullable final ResponseType value) {
        this.backingStore.set("responseType", value);
    }
}

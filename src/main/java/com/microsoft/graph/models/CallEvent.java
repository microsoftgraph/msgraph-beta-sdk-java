package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallEvent extends Entity implements Parsable {
    /**
     * The callEventType property
     */
    private CallEventType callEventType;
    /**
     * The direction property
     */
    private CallDirection direction;
    /**
     * The joinCallUrl property
     */
    private String joinCallUrl;
    /**
     * Instantiates a new CallEvent and sets the default values.
     */
    public CallEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallEvent
     */
    @jakarta.annotation.Nonnull
    public static CallEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallEvent();
    }
    /**
     * Gets the callEventType property value. The callEventType property
     * @return a CallEventType
     */
    @jakarta.annotation.Nullable
    public CallEventType getCallEventType() {
        return this.callEventType;
    }
    /**
     * Gets the direction property value. The direction property
     * @return a CallDirection
     */
    @jakarta.annotation.Nullable
    public CallDirection getDirection() {
        return this.direction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callEventType", (n) -> { this.setCallEventType(n.getEnumValue(CallEventType.class)); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getEnumValue(CallDirection.class)); });
        deserializerMap.put("joinCallUrl", (n) -> { this.setJoinCallUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinCallUrl property value. The joinCallUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJoinCallUrl() {
        return this.joinCallUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("callEventType", this.getCallEventType());
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeStringValue("joinCallUrl", this.getJoinCallUrl());
    }
    /**
     * Sets the callEventType property value. The callEventType property
     * @param value Value to set for the callEventType property.
     */
    public void setCallEventType(@jakarta.annotation.Nullable final CallEventType value) {
        this.callEventType = value;
    }
    /**
     * Sets the direction property value. The direction property
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final CallDirection value) {
        this.direction = value;
    }
    /**
     * Sets the joinCallUrl property value. The joinCallUrl property
     * @param value Value to set for the joinCallUrl property.
     */
    public void setJoinCallUrl(@jakarta.annotation.Nullable final String value) {
        this.joinCallUrl = value;
    }
}

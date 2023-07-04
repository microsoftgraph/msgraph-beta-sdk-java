package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnInteractiveAuthFlowStartListener extends AuthenticationEventListener implements Parsable {
    /**
     * Required. Configuration for what to invoke if the event resolves to this listener. This lets us define potential handler configurations per-event.
     */
    private OnInteractiveAuthFlowStartHandler handler;
    /**
     * Instantiates a new OnInteractiveAuthFlowStartListener and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnInteractiveAuthFlowStartListener() {
        super();
        this.setOdataType("#microsoft.graph.onInteractiveAuthFlowStartListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnInteractiveAuthFlowStartListener
     */
    @javax.annotation.Nonnull
    public static OnInteractiveAuthFlowStartListener createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnInteractiveAuthFlowStartListener();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("handler", (n) -> { this.setHandler(n.getObjectValue(OnInteractiveAuthFlowStartHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handler property value. Required. Configuration for what to invoke if the event resolves to this listener. This lets us define potential handler configurations per-event.
     * @return a onInteractiveAuthFlowStartHandler
     */
    @javax.annotation.Nullable
    public OnInteractiveAuthFlowStartHandler getHandler() {
        return this.handler;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("handler", this.getHandler());
    }
    /**
     * Sets the handler property value. Required. Configuration for what to invoke if the event resolves to this listener. This lets us define potential handler configurations per-event.
     * @param value Value to set for the handler property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHandler(@javax.annotation.Nullable final OnInteractiveAuthFlowStartHandler value) {
        this.handler = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnTokenIssuanceStartListener extends AuthenticationEventListener implements Parsable {
    /** The handler to invoke when conditions are met for this onTokenIssuanceStartListener. */
    private OnTokenIssuanceStartHandler handler;
    /**
     * Instantiates a new OnTokenIssuanceStartListener and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnTokenIssuanceStartListener() {
        super();
        this.setOdataType("#microsoft.graph.onTokenIssuanceStartListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnTokenIssuanceStartListener
     */
    @javax.annotation.Nonnull
    public static OnTokenIssuanceStartListener createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnTokenIssuanceStartListener();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("handler", (n) -> { this.setHandler(n.getObjectValue(OnTokenIssuanceStartHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handler property value. The handler to invoke when conditions are met for this onTokenIssuanceStartListener.
     * @return a onTokenIssuanceStartHandler
     */
    @javax.annotation.Nullable
    public OnTokenIssuanceStartHandler getHandler() {
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
     * Sets the handler property value. The handler to invoke when conditions are met for this onTokenIssuanceStartListener.
     * @param value Value to set for the handler property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHandler(@javax.annotation.Nullable final OnTokenIssuanceStartHandler value) {
        this.handler = value;
    }
}

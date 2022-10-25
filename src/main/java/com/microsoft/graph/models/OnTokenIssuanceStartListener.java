package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnTokenIssuanceStartListener extends AuthenticationEventListener implements Parsable {
    /** The handler property */
    private OnTokenIssuanceStartHandler _handler;
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnTokenIssuanceStartListener currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("handler", (n) -> { currentObject.setHandler(n.getObjectValue(OnTokenIssuanceStartHandler::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the handler property value. The handler property
     * @return a onTokenIssuanceStartHandler
     */
    @javax.annotation.Nullable
    public OnTokenIssuanceStartHandler getHandler() {
        return this._handler;
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
     * Sets the handler property value. The handler property
     * @param value Value to set for the handler property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHandler(@javax.annotation.Nullable final OnTokenIssuanceStartHandler value) {
        this._handler = value;
    }
}

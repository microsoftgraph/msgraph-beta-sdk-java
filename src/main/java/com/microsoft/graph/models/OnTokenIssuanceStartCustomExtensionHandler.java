package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnTokenIssuanceStartCustomExtensionHandler extends OnTokenIssuanceStartHandler implements Parsable {
    /** The customExtension property */
    private OnTokenIssuanceStartCustomExtension _customExtension;
    /**
     * Instantiates a new OnTokenIssuanceStartCustomExtensionHandler and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnTokenIssuanceStartCustomExtensionHandler() {
        super();
        this.setOdataType("#microsoft.graph.onTokenIssuanceStartCustomExtensionHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnTokenIssuanceStartCustomExtensionHandler
     */
    @javax.annotation.Nonnull
    public static OnTokenIssuanceStartCustomExtensionHandler createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnTokenIssuanceStartCustomExtensionHandler();
    }
    /**
     * Gets the customExtension property value. The customExtension property
     * @return a onTokenIssuanceStartCustomExtension
     */
    @javax.annotation.Nullable
    public OnTokenIssuanceStartCustomExtension getCustomExtension() {
        return this._customExtension;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnTokenIssuanceStartCustomExtensionHandler currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtension", (n) -> { currentObject.setCustomExtension(n.getObjectValue(OnTokenIssuanceStartCustomExtension::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("customExtension", this.getCustomExtension());
    }
    /**
     * Sets the customExtension property value. The customExtension property
     * @param value Value to set for the customExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtension(@javax.annotation.Nullable final OnTokenIssuanceStartCustomExtension value) {
        this._customExtension = value;
    }
}

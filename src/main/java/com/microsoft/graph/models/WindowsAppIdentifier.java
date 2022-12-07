package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAppIdentifier extends MobileAppIdentifier implements Parsable {
    /** The identifier for an app, as specified in the app store. */
    private String _windowsAppId;
    /**
     * Instantiates a new WindowsAppIdentifier and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsAppIdentifier() {
        super();
        this.setOdataType("#microsoft.graph.windowsAppIdentifier");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAppIdentifier
     */
    @javax.annotation.Nonnull
    public static WindowsAppIdentifier createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAppIdentifier();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("windowsAppId", (n) -> { this.setWindowsAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the windowsAppId property value. The identifier for an app, as specified in the app store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWindowsAppId() {
        return this._windowsAppId;
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
        writer.writeStringValue("windowsAppId", this.getWindowsAppId());
    }
    /**
     * Sets the windowsAppId property value. The identifier for an app, as specified in the app store.
     * @param value Value to set for the windowsAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAppId(@javax.annotation.Nullable final String value) {
        this._windowsAppId = value;
    }
}

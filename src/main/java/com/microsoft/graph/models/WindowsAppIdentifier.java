package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The identifier for a Windows app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAppIdentifier extends MobileAppIdentifier implements Parsable {
    /**
     * Instantiates a new WindowsAppIdentifier and sets the default values.
     */
    public WindowsAppIdentifier() {
        super();
        this.setOdataType("#microsoft.graph.windowsAppIdentifier");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAppIdentifier
     */
    @jakarta.annotation.Nonnull
    public static WindowsAppIdentifier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAppIdentifier();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("windowsAppId", (n) -> { this.setWindowsAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the windowsAppId property value. The identifier for an app, as specified in the app store.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWindowsAppId() {
        return this.backingStore.get("windowsAppId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("windowsAppId", this.getWindowsAppId());
    }
    /**
     * Sets the windowsAppId property value. The identifier for an app, as specified in the app store.
     * @param value Value to set for the windowsAppId property.
     */
    public void setWindowsAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windowsAppId", value);
    }
}

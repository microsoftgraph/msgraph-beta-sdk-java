package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Store apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsStoreApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new WindowsStoreApp and sets the default values.
     */
    public WindowsStoreApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsStoreApp
     */
    @jakarta.annotation.Nonnull
    public static WindowsStoreApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsStoreApp();
    }
    /**
     * Gets the appStoreUrl property value. The Windows app store URL.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.BackingStore.get("appStoreUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
    }
    /**
     * Sets the appStoreUrl property value. The Windows app store URL.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appStoreUrl", value);
    }
}

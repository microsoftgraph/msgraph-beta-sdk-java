package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Phone 8.1 Store apps. Inherits from graph.mobileApp. Will be deprecated in February 2023.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPhone81StoreApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link WindowsPhone81StoreApp} and sets the default values.
     */
    public WindowsPhone81StoreApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81StoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsPhone81StoreApp}
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81StoreApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81StoreApp();
    }
    /**
     * Gets the appStoreUrl property value. The Windows Phone 8.1 app store URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.backingStore.get("appStoreUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Sets the appStoreUrl property value. The Windows Phone 8.1 app store URL.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appStoreUrl", value);
    }
}

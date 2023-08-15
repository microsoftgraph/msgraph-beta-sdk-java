package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Phone 8.1 Store apps. Inherits from graph.mobileApp. Will be deprecated in February 2023.
 */
public class WindowsPhone81StoreApp extends MobileApp implements Parsable {
    /**
     * The Windows Phone 8.1 app store URL.
     */
    private String appStoreUrl;
    /**
     * Instantiates a new windowsPhone81StoreApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsPhone81StoreApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81StoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPhone81StoreApp
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81StoreApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81StoreApp();
    }
    /**
     * Gets the appStoreUrl property value. The Windows Phone 8.1 app store URL.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.appStoreUrl;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
    }
    /**
     * Sets the appStoreUrl property value. The Windows Phone 8.1 app store URL.
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.appStoreUrl = value;
    }
}

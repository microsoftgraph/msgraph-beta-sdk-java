package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A mobileApp that is based on a referenced application in a Win32CatalogApp repository
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32CatalogApp extends Win32LobApp implements Parsable {
    /**
     * Instantiates a new {@link Win32CatalogApp} and sets the default values.
     */
    public Win32CatalogApp() {
        super();
        this.setOdataType("#microsoft.graph.win32CatalogApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32CatalogApp}
     */
    @jakarta.annotation.Nonnull
    public static Win32CatalogApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32CatalogApp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mobileAppCatalogPackageId", (n) -> { this.setMobileAppCatalogPackageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mobileAppCatalogPackageId property value. The mobileAppCatalogPackageId property references the mobileAppCatalogPackage entity which contains information about an application catalog package that can be deployed to Intune-managed devices
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMobileAppCatalogPackageId() {
        return this.backingStore.get("mobileAppCatalogPackageId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("mobileAppCatalogPackageId", this.getMobileAppCatalogPackageId());
    }
    /**
     * Sets the mobileAppCatalogPackageId property value. The mobileAppCatalogPackageId property references the mobileAppCatalogPackage entity which contains information about an application catalog package that can be deployed to Intune-managed devices
     * @param value Value to set for the mobileAppCatalogPackageId property.
     */
    public void setMobileAppCatalogPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mobileAppCatalogPackageId", value);
    }
}

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
        deserializerMap.put("latestUpgradeCatalogPackage", (n) -> { this.setLatestUpgradeCatalogPackage(n.getObjectValue(MobileAppCatalogPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppCatalogPackageId", (n) -> { this.setMobileAppCatalogPackageId(n.getStringValue()); });
        deserializerMap.put("referencedCatalogPackage", (n) -> { this.setReferencedCatalogPackage(n.getObjectValue(MobileAppCatalogPackage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the latestUpgradeCatalogPackage property value. The latest available catalog package the app is upgradeable to. This property is read-only.
     * @return a {@link MobileAppCatalogPackage}
     */
    @jakarta.annotation.Nullable
    public MobileAppCatalogPackage getLatestUpgradeCatalogPackage() {
        return this.backingStore.get("latestUpgradeCatalogPackage");
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
     * Gets the referencedCatalogPackage property value. The current catalog package the app is synced from. This property is read-only.
     * @return a {@link MobileAppCatalogPackage}
     */
    @jakarta.annotation.Nullable
    public MobileAppCatalogPackage getReferencedCatalogPackage() {
        return this.backingStore.get("referencedCatalogPackage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("latestUpgradeCatalogPackage", this.getLatestUpgradeCatalogPackage());
        writer.writeStringValue("mobileAppCatalogPackageId", this.getMobileAppCatalogPackageId());
        writer.writeObjectValue("referencedCatalogPackage", this.getReferencedCatalogPackage());
    }
    /**
     * Sets the latestUpgradeCatalogPackage property value. The latest available catalog package the app is upgradeable to. This property is read-only.
     * @param value Value to set for the latestUpgradeCatalogPackage property.
     */
    public void setLatestUpgradeCatalogPackage(@jakarta.annotation.Nullable final MobileAppCatalogPackage value) {
        this.backingStore.set("latestUpgradeCatalogPackage", value);
    }
    /**
     * Sets the mobileAppCatalogPackageId property value. The mobileAppCatalogPackageId property references the mobileAppCatalogPackage entity which contains information about an application catalog package that can be deployed to Intune-managed devices
     * @param value Value to set for the mobileAppCatalogPackageId property.
     */
    public void setMobileAppCatalogPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mobileAppCatalogPackageId", value);
    }
    /**
     * Sets the referencedCatalogPackage property value. The current catalog package the app is synced from. This property is read-only.
     * @param value Value to set for the referencedCatalogPackage property.
     */
    public void setReferencedCatalogPackage(@jakarta.annotation.Nullable final MobileAppCatalogPackage value) {
        this.backingStore.set("referencedCatalogPackage", value);
    }
}

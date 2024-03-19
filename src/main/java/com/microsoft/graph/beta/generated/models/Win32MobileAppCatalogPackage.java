package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * win32MobileAppCatalogPackage extends mobileAppCatalogPackage by providing information necessary for the creation of a win32CatalogApp instance.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32MobileAppCatalogPackage extends MobileAppCatalogPackage implements Parsable {
    /**
     * Instantiates a new {@link Win32MobileAppCatalogPackage} and sets the default values.
     */
    public Win32MobileAppCatalogPackage() {
        super();
        this.setOdataType("#microsoft.graph.win32MobileAppCatalogPackage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32MobileAppCatalogPackage}
     */
    @jakarta.annotation.Nonnull
    public static Win32MobileAppCatalogPackage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32MobileAppCatalogPackage();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a {@link EnumSet<WindowsArchitecture>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getApplicableArchitectures() {
        return this.backingStore.get("applicableArchitectures");
    }
    /**
     * Gets the branchDisplayName property value. The product branch name, which is a specific subset of product functionality as defined by the publisher (example: "Fabrikam for Business (x64)"). A specific product will have one or more branchDisplayNames. Read-only. Supports $filter, $search, $select. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBranchDisplayName() {
        return this.backingStore.get("branchDisplayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumSetValue(WindowsArchitecture::forValue)); });
        deserializerMap.put("branchDisplayName", (n) -> { this.setBranchDisplayName(n.getStringValue()); });
        deserializerMap.put("locales", (n) -> { this.setLocales(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("packageAutoUpdateCapable", (n) -> { this.setPackageAutoUpdateCapable(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locales property value. One or more locale(s) supported by the branch. Value is a two-letter ISO 639 language tags with optional two-letter subtags (example: en-US, ko, de, de-DE), or mul to indicate multi-language. Read-only. This property is read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocales() {
        return this.backingStore.get("locales");
    }
    /**
     * Gets the packageAutoUpdateCapable property value. Indicates whether the package is capable to auto-update to latest when software/application updates are available. When TRUE, it indicates it is an auto-updating application. When FALSE, it indicates that it is not an auto-updating application. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPackageAutoUpdateCapable() {
        return this.backingStore.get("packageAutoUpdateCapable");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("applicableArchitectures", this.getApplicableArchitectures());
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     */
    public void setApplicableArchitectures(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("applicableArchitectures", value);
    }
    /**
     * Sets the branchDisplayName property value. The product branch name, which is a specific subset of product functionality as defined by the publisher (example: "Fabrikam for Business (x64)"). A specific product will have one or more branchDisplayNames. Read-only. Supports $filter, $search, $select. This property is read-only.
     * @param value Value to set for the branchDisplayName property.
     */
    public void setBranchDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("branchDisplayName", value);
    }
    /**
     * Sets the locales property value. One or more locale(s) supported by the branch. Value is a two-letter ISO 639 language tags with optional two-letter subtags (example: en-US, ko, de, de-DE), or mul to indicate multi-language. Read-only. This property is read-only.
     * @param value Value to set for the locales property.
     */
    public void setLocales(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("locales", value);
    }
    /**
     * Sets the packageAutoUpdateCapable property value. Indicates whether the package is capable to auto-update to latest when software/application updates are available. When TRUE, it indicates it is an auto-updating application. When FALSE, it indicates that it is not an auto-updating application. This property is read-only.
     * @param value Value to set for the packageAutoUpdateCapable property.
     */
    public void setPackageAutoUpdateCapable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("packageAutoUpdateCapable", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Microsoft Store for Business Apps. This class does not support Create, Delete, or Update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftStoreForBusinessApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftStoreForBusinessApp} and sets the default values.
     */
    public MicrosoftStoreForBusinessApp() {
        super();
        this.setOdataType("#microsoft.graph.microsoftStoreForBusinessApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftStoreForBusinessApp}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftStoreForBusinessApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessApp();
    }
    /**
     * Gets the containedApps property value. The collection of contained apps in a mobileApp acting as a package.
     * @return a {@link java.util.List<MobileContainedApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileContainedApp> getContainedApps() {
        return this.backingStore.get("containedApps");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containedApps", (n) -> { this.setContainedApps(n.getCollectionOfObjectValues(MobileContainedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(MicrosoftStoreForBusinessLicenseType::forValue)); });
        deserializerMap.put("licensingType", (n) -> { this.setLicensingType(n.getObjectValue(VppLicensingType::createFromDiscriminatorValue)); });
        deserializerMap.put("packageIdentityName", (n) -> { this.setPackageIdentityName(n.getStringValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a {@link MicrosoftStoreForBusinessLicenseType}
     */
    @jakarta.annotation.Nullable
    public MicrosoftStoreForBusinessLicenseType getLicenseType() {
        return this.backingStore.get("licenseType");
    }
    /**
     * Gets the licensingType property value. The supported License Type.
     * @return a {@link VppLicensingType}
     */
    @jakarta.annotation.Nullable
    public VppLicensingType getLicensingType() {
        return this.backingStore.get("licensingType");
    }
    /**
     * Gets the packageIdentityName property value. The app package identifier
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageIdentityName() {
        return this.backingStore.get("packageIdentityName");
    }
    /**
     * Gets the productKey property value. The app product key
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductKey() {
        return this.backingStore.get("productKey");
    }
    /**
     * Gets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.backingStore.get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.backingStore.get("usedLicenseCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("containedApps", this.getContainedApps());
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeObjectValue("licensingType", this.getLicensingType());
        writer.writeStringValue("packageIdentityName", this.getPackageIdentityName());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
    }
    /**
     * Sets the containedApps property value. The collection of contained apps in a mobileApp acting as a package.
     * @param value Value to set for the containedApps property.
     */
    public void setContainedApps(@jakarta.annotation.Nullable final java.util.List<MobileContainedApp> value) {
        this.backingStore.set("containedApps", value);
    }
    /**
     * Sets the licenseType property value. The licenseType property
     * @param value Value to set for the licenseType property.
     */
    public void setLicenseType(@jakarta.annotation.Nullable final MicrosoftStoreForBusinessLicenseType value) {
        this.backingStore.set("licenseType", value);
    }
    /**
     * Sets the licensingType property value. The supported License Type.
     * @param value Value to set for the licensingType property.
     */
    public void setLicensingType(@jakarta.annotation.Nullable final VppLicensingType value) {
        this.backingStore.set("licensingType", value);
    }
    /**
     * Sets the packageIdentityName property value. The app package identifier
     * @param value Value to set for the packageIdentityName property.
     */
    public void setPackageIdentityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageIdentityName", value);
    }
    /**
     * Sets the productKey property value. The app product key
     * @param value Value to set for the productKey property.
     */
    public void setProductKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productKey", value);
    }
    /**
     * Sets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
}

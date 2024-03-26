package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Android Managed Store Apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedStoreApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link AndroidManagedStoreApp} and sets the default values.
     */
    public AndroidManagedStoreApp() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidManagedStoreApp}
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedStoreApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedStoreWebApp": return new AndroidManagedStoreWebApp();
            }
        }
        return new AndroidManagedStoreApp();
    }
    /**
     * Gets the appIdentifier property value. The Identity Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppIdentifier() {
        return this.backingStore.get("appIdentifier");
    }
    /**
     * Gets the appStoreUrl property value. The Play for Work Store app URL. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.backingStore.get("appStoreUrl");
    }
    /**
     * Gets the appTracks property value. The tracks that are visible to this enterprise. This property is read-only.
     * @return a {@link java.util.List<AndroidManagedStoreAppTrack>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppTrack> getAppTracks() {
        return this.backingStore.get("appTracks");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIdentifier", (n) -> { this.setAppIdentifier(n.getStringValue()); });
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("appTracks", (n) -> { this.setAppTracks(n.getCollectionOfObjectValues(AndroidManagedStoreAppTrack::createFromDiscriminatorValue)); });
        deserializerMap.put("isPrivate", (n) -> { this.setIsPrivate(n.getBooleanValue()); });
        deserializerMap.put("isSystemApp", (n) -> { this.setIsSystemApp(n.getBooleanValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("supportsOemConfig", (n) -> { this.setSupportsOemConfig(n.getBooleanValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPrivate property value. Indicates whether the app is only available to a given enterprise's users. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPrivate() {
        return this.backingStore.get("isPrivate");
    }
    /**
     * Gets the isSystemApp property value. Indicates whether the app is a preinstalled system app.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemApp() {
        return this.backingStore.get("isSystemApp");
    }
    /**
     * Gets the packageId property value. The package identifier. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.backingStore.get("packageId");
    }
    /**
     * Gets the supportsOemConfig property value. Whether this app supports OEMConfig policy. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsOemConfig() {
        return this.backingStore.get("supportsOemConfig");
    }
    /**
     * Gets the totalLicenseCount property value. The total number of VPP licenses. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.backingStore.get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use. This property is read-only.
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
        writer.writeStringValue("appIdentifier", this.getAppIdentifier());
        writer.writeBooleanValue("isSystemApp", this.getIsSystemApp());
    }
    /**
     * Sets the appIdentifier property value. The Identity Name.
     * @param value Value to set for the appIdentifier property.
     */
    public void setAppIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appIdentifier", value);
    }
    /**
     * Sets the appStoreUrl property value. The Play for Work Store app URL. This property is read-only.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appStoreUrl", value);
    }
    /**
     * Sets the appTracks property value. The tracks that are visible to this enterprise. This property is read-only.
     * @param value Value to set for the appTracks property.
     */
    public void setAppTracks(@jakarta.annotation.Nullable final java.util.List<AndroidManagedStoreAppTrack> value) {
        this.backingStore.set("appTracks", value);
    }
    /**
     * Sets the isPrivate property value. Indicates whether the app is only available to a given enterprise's users. This property is read-only.
     * @param value Value to set for the isPrivate property.
     */
    public void setIsPrivate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPrivate", value);
    }
    /**
     * Sets the isSystemApp property value. Indicates whether the app is a preinstalled system app.
     * @param value Value to set for the isSystemApp property.
     */
    public void setIsSystemApp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSystemApp", value);
    }
    /**
     * Sets the packageId property value. The package identifier. This property is read-only.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageId", value);
    }
    /**
     * Sets the supportsOemConfig property value. Whether this app supports OEMConfig policy. This property is read-only.
     * @param value Value to set for the supportsOemConfig property.
     */
    public void setSupportsOemConfig(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("supportsOemConfig", value);
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses. This property is read-only.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use. This property is read-only.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
}

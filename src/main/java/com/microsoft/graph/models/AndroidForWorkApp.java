package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Android for Work (AFW) Apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new AndroidForWorkApp and sets the default values.
     */
    public AndroidForWorkApp() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkApp
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkApp();
    }
    /**
     * Gets the appIdentifier property value. The Identity Name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppIdentifier() {
        return this.backingStore.get("appIdentifier");
    }
    /**
     * Gets the appStoreUrl property value. The Play for Work Store app URL.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.backingStore.get("appStoreUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIdentifier", (n) -> { this.setAppIdentifier(n.getStringValue()); });
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the packageId property value. The package identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.backingStore.get("packageId");
    }
    /**
     * Gets the totalLicenseCount property value. The total number of VPP licenses.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.backingStore.get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a Integer
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
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
    }
    /**
     * Sets the appIdentifier property value. The Identity Name.
     * @param value Value to set for the appIdentifier property.
     */
    public void setAppIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appIdentifier", value);
    }
    /**
     * Sets the appStoreUrl property value. The Play for Work Store app URL.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appStoreUrl", value);
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageId", value);
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for an iOS store app that you can manage with an Intune app protection policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedIOSStoreApp extends ManagedApp implements Parsable {
    /**
     * Instantiates a new {@link ManagedIOSStoreApp} and sets the default values.
     */
    public ManagedIOSStoreApp() {
        super();
        this.setOdataType("#microsoft.graph.managedIOSStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedIOSStoreApp}
     */
    @jakarta.annotation.Nonnull
    public static ManagedIOSStoreApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedIOSStoreApp();
    }
    /**
     * Gets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @return a {@link IosDeviceType}
     */
    @jakarta.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this.backingStore.get("applicableDeviceType");
    }
    /**
     * Gets the appStoreUrl property value. The Apple AppStoreUrl.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.backingStore.get("appStoreUrl");
    }
    /**
     * Gets the bundleId property value. The app&apos;s Bundle ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.backingStore.get("bundleId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableDeviceType", (n) -> { this.setApplicableDeviceType(n.getObjectValue(IosDeviceType::createFromDiscriminatorValue)); });
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(IosMinimumOperatingSystem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. Contains properties of the minimum operating system required for an iOS mobile app.
     * @return a {@link IosMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public IosMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicableDeviceType", this.getApplicableDeviceType());
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
    }
    /**
     * Sets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @param value Value to set for the applicableDeviceType property.
     */
    public void setApplicableDeviceType(@jakarta.annotation.Nullable final IosDeviceType value) {
        this.backingStore.set("applicableDeviceType", value);
    }
    /**
     * Sets the appStoreUrl property value. The Apple AppStoreUrl.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appStoreUrl", value);
    }
    /**
     * Sets the bundleId property value. The app&apos;s Bundle ID.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleId", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. Contains properties of the minimum operating system required for an iOS mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final IosMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
}

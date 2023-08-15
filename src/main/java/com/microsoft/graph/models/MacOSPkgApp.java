package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the MacOSPkgApp.
 */
public class MacOSPkgApp extends MobileLobApp implements Parsable {
    /**
     * A value indicating whether the app's version will be used to detect the app after it is installed on a device. Set this to true for apps that use a self-update feature. Set this to false to install the app when it is not already installed on the device, or if the deploying app's version number does not match the version that's already installed on the device. The default value is false.
     */
    private Boolean ignoreVersionDetection;
    /**
     * The list of apps expected to be installed by the .pkg.
     */
    private java.util.List<MacOSIncludedApp> includedApps;
    /**
     * The value for the minimum applicable operating system.
     */
    private MacOSMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The primary CFBundleIdentifier of the .pkg.
     */
    private String primaryBundleId;
    /**
     * The primary CFBundleVersion of the .pkg.
     */
    private String primaryBundleVersion;
    /**
     * Instantiates a new macOSPkgApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSPkgApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSPkgApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSPkgApp
     */
    @jakarta.annotation.Nonnull
    public static MacOSPkgApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSPkgApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("includedApps", (n) -> { this.setIncludedApps(n.getCollectionOfObjectValues(MacOSIncludedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(MacOSMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("primaryBundleId", (n) -> { this.setPrimaryBundleId(n.getStringValue()); });
        deserializerMap.put("primaryBundleVersion", (n) -> { this.setPrimaryBundleVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreVersionDetection property value. A value indicating whether the app's version will be used to detect the app after it is installed on a device. Set this to true for apps that use a self-update feature. Set this to false to install the app when it is not already installed on the device, or if the deploying app's version number does not match the version that's already installed on the device. The default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.ignoreVersionDetection;
    }
    /**
     * Gets the includedApps property value. The list of apps expected to be installed by the .pkg.
     * @return a macOSIncludedApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSIncludedApp> getIncludedApps() {
        return this.includedApps;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a macOSMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public MacOSMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the primaryBundleId property value. The primary CFBundleIdentifier of the .pkg.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBundleId() {
        return this.primaryBundleId;
    }
    /**
     * Gets the primaryBundleVersion property value. The primary CFBundleVersion of the .pkg.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBundleVersion() {
        return this.primaryBundleVersion;
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
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeCollectionOfObjectValues("includedApps", this.getIncludedApps());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("primaryBundleId", this.getPrimaryBundleId());
        writer.writeStringValue("primaryBundleVersion", this.getPrimaryBundleVersion());
    }
    /**
     * Sets the ignoreVersionDetection property value. A value indicating whether the app's version will be used to detect the app after it is installed on a device. Set this to true for apps that use a self-update feature. Set this to false to install the app when it is not already installed on the device, or if the deploying app's version number does not match the version that's already installed on the device. The default value is false.
     * @param value Value to set for the ignoreVersionDetection property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreVersionDetection = value;
    }
    /**
     * Sets the includedApps property value. The list of apps expected to be installed by the .pkg.
     * @param value Value to set for the includedApps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncludedApps(@jakarta.annotation.Nullable final java.util.List<MacOSIncludedApp> value) {
        this.includedApps = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final MacOSMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the primaryBundleId property value. The primary CFBundleIdentifier of the .pkg.
     * @param value Value to set for the primaryBundleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrimaryBundleId(@jakarta.annotation.Nullable final String value) {
        this.primaryBundleId = value;
    }
    /**
     * Sets the primaryBundleVersion property value. The primary CFBundleVersion of the .pkg.
     * @param value Value to set for the primaryBundleVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrimaryBundleVersion(@jakarta.annotation.Nullable final String value) {
        this.primaryBundleVersion = value;
    }
}

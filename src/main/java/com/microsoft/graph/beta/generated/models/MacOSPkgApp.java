package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the MacOSPkgApp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSPkgApp extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link MacOSPkgApp} and sets the default values.
     */
    public MacOSPkgApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSPkgApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSPkgApp}
     */
    @jakarta.annotation.Nonnull
    public static MacOSPkgApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSPkgApp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("includedApps", (n) -> { this.setIncludedApps(n.getCollectionOfObjectValues(MacOSIncludedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(MacOSMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("postInstallScript", (n) -> { this.setPostInstallScript(n.getObjectValue(MacOSAppScript::createFromDiscriminatorValue)); });
        deserializerMap.put("preInstallScript", (n) -> { this.setPreInstallScript(n.getObjectValue(MacOSAppScript::createFromDiscriminatorValue)); });
        deserializerMap.put("primaryBundleId", (n) -> { this.setPrimaryBundleId(n.getStringValue()); });
        deserializerMap.put("primaryBundleVersion", (n) -> { this.setPrimaryBundleVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreVersionDetection property value. When TRUE, indicates that the app&apos;s version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app&apos;s version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.backingStore.get("ignoreVersionDetection");
    }
    /**
     * Gets the includedApps property value. The list of apps expected to be installed by the PKG. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<MacOSIncludedApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSIncludedApp> getIncludedApps() {
        return this.backingStore.get("includedApps");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @return a {@link MacOSMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public MacOSMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Gets the postInstallScript property value. ComplexType macOSAppScript the contains the post-install script for the app. This will execute on the macOS device after the app is installed.
     * @return a {@link MacOSAppScript}
     */
    @jakarta.annotation.Nullable
    public MacOSAppScript getPostInstallScript() {
        return this.backingStore.get("postInstallScript");
    }
    /**
     * Gets the preInstallScript property value. ComplexType macOSAppScript the contains the post-install script for the app. This will execute on the macOS device after the app is installed.
     * @return a {@link MacOSAppScript}
     */
    @jakarta.annotation.Nullable
    public MacOSAppScript getPreInstallScript() {
        return this.backingStore.get("preInstallScript");
    }
    /**
     * Gets the primaryBundleId property value. The bundleId of the primary app in the PKG. This maps to the CFBundleIdentifier in the app&apos;s bundle configuration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBundleId() {
        return this.backingStore.get("primaryBundleId");
    }
    /**
     * Gets the primaryBundleVersion property value. The version of the primary app in the PKG. This maps to the CFBundleShortVersion in the app&apos;s bundle configuration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBundleVersion() {
        return this.backingStore.get("primaryBundleVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeCollectionOfObjectValues("includedApps", this.getIncludedApps());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeObjectValue("postInstallScript", this.getPostInstallScript());
        writer.writeObjectValue("preInstallScript", this.getPreInstallScript());
        writer.writeStringValue("primaryBundleId", this.getPrimaryBundleId());
        writer.writeStringValue("primaryBundleVersion", this.getPrimaryBundleVersion());
    }
    /**
     * Sets the ignoreVersionDetection property value. When TRUE, indicates that the app&apos;s version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app&apos;s version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     * @param value Value to set for the ignoreVersionDetection property.
     */
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ignoreVersionDetection", value);
    }
    /**
     * Sets the includedApps property value. The list of apps expected to be installed by the PKG. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the includedApps property.
     */
    public void setIncludedApps(@jakarta.annotation.Nullable final java.util.List<MacOSIncludedApp> value) {
        this.backingStore.set("includedApps", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final MacOSMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
    /**
     * Sets the postInstallScript property value. ComplexType macOSAppScript the contains the post-install script for the app. This will execute on the macOS device after the app is installed.
     * @param value Value to set for the postInstallScript property.
     */
    public void setPostInstallScript(@jakarta.annotation.Nullable final MacOSAppScript value) {
        this.backingStore.set("postInstallScript", value);
    }
    /**
     * Sets the preInstallScript property value. ComplexType macOSAppScript the contains the post-install script for the app. This will execute on the macOS device after the app is installed.
     * @param value Value to set for the preInstallScript property.
     */
    public void setPreInstallScript(@jakarta.annotation.Nullable final MacOSAppScript value) {
        this.backingStore.set("preInstallScript", value);
    }
    /**
     * Sets the primaryBundleId property value. The bundleId of the primary app in the PKG. This maps to the CFBundleIdentifier in the app&apos;s bundle configuration.
     * @param value Value to set for the primaryBundleId property.
     */
    public void setPrimaryBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryBundleId", value);
    }
    /**
     * Sets the primaryBundleVersion property value. The version of the primary app in the PKG. This maps to the CFBundleShortVersion in the app&apos;s bundle configuration.
     * @param value Value to set for the primaryBundleVersion property.
     */
    public void setPrimaryBundleVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryBundleVersion", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSDmgApp extends MobileLobApp implements Parsable {
    /** A value indicating whether the app's version will be used to detect the app after it is installed on a device. Set this to true for apps that use a self-update feature. Set this to false to install the app when it is not already installed on the device, or if the deploying app's version number does not match the version that's already installed on the device. */
    private Boolean _ignoreVersionDetection;
    /** The list of apps expected to be installed by the DMG. */
    private java.util.List<MacOSIncludedApp> _includedApps;
    /** The value for the minimum applicable operating system. */
    private MacOSMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The primary CFBundleIdentifier of the DMG. */
    private String _primaryBundleId;
    /** The primary CFBundleVersion of the DMG. */
    private String _primaryBundleVersion;
    /**
     * Instantiates a new MacOSDmgApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSDmgApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSDmgApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSDmgApp
     */
    @javax.annotation.Nonnull
    public static MacOSDmgApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSDmgApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSDmgApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("ignoreVersionDetection", (n) -> { currentObject.setIgnoreVersionDetection(n.getBooleanValue()); });
            this.put("includedApps", (n) -> { currentObject.setIncludedApps(n.getCollectionOfObjectValues(MacOSIncludedApp::createFromDiscriminatorValue)); });
            this.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(MacOSMinimumOperatingSystem::createFromDiscriminatorValue)); });
            this.put("primaryBundleId", (n) -> { currentObject.setPrimaryBundleId(n.getStringValue()); });
            this.put("primaryBundleVersion", (n) -> { currentObject.setPrimaryBundleVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ignoreVersionDetection property value. A value indicating whether the app's version will be used to detect the app after it is installed on a device. Set this to true for apps that use a self-update feature. Set this to false to install the app when it is not already installed on the device, or if the deploying app's version number does not match the version that's already installed on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this._ignoreVersionDetection;
    }
    /**
     * Gets the includedApps property value. The list of apps expected to be installed by the DMG.
     * @return a macOSIncludedApp
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSIncludedApp> getIncludedApps() {
        return this._includedApps;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a macOSMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public MacOSMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the primaryBundleId property value. The primary CFBundleIdentifier of the DMG.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryBundleId() {
        return this._primaryBundleId;
    }
    /**
     * Gets the primaryBundleVersion property value. The primary CFBundleVersion of the DMG.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryBundleVersion() {
        return this._primaryBundleVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeCollectionOfObjectValues("includedApps", this.getIncludedApps());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("primaryBundleId", this.getPrimaryBundleId());
        writer.writeStringValue("primaryBundleVersion", this.getPrimaryBundleVersion());
    }
    /**
     * Sets the ignoreVersionDetection property value. A value indicating whether the app's version will be used to detect the app after it is installed on a device. Set this to true for apps that use a self-update feature. Set this to false to install the app when it is not already installed on the device, or if the deploying app's version number does not match the version that's already installed on the device.
     * @param value Value to set for the ignoreVersionDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIgnoreVersionDetection(@javax.annotation.Nullable final Boolean value) {
        this._ignoreVersionDetection = value;
    }
    /**
     * Sets the includedApps property value. The list of apps expected to be installed by the DMG.
     * @param value Value to set for the includedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludedApps(@javax.annotation.Nullable final java.util.List<MacOSIncludedApp> value) {
        this._includedApps = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final MacOSMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the primaryBundleId property value. The primary CFBundleIdentifier of the DMG.
     * @param value Value to set for the primaryBundleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryBundleId(@javax.annotation.Nullable final String value) {
        this._primaryBundleId = value;
    }
    /**
     * Sets the primaryBundleVersion property value. The primary CFBundleVersion of the DMG.
     * @param value Value to set for the primaryBundleVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryBundleVersion(@javax.annotation.Nullable final String value) {
        this._primaryBundleVersion = value;
    }
}

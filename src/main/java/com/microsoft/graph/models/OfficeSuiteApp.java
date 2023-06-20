package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeSuiteApp extends MobileApp implements Parsable {
    /** The value to accept the EULA automatically on the enduser's device. */
    private Boolean autoAcceptEula;
    /** The property to represent the apps which are excluded from the selected Office365 Product Id. */
    private ExcludedApps excludedApps;
    /** The Enum to specify the level of display for the Installation Progress Setup UI on the Device. */
    private OfficeSuiteInstallProgressDisplayLevel installProgressDisplayLevel;
    /** The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx */
    private java.util.List<String> localesToInstall;
    /** The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app. */
    private byte[] officeConfigurationXml;
    /** Contains properties for Windows architecture. */
    private WindowsArchitecture officePlatformArchitecture;
    /** Describes the OfficeSuiteApp file format types that can be selected. */
    private OfficeSuiteDefaultFileFormatType officeSuiteAppDefaultFileFormat;
    /** The Product Ids that represent the Office365 Suite SKU. */
    private java.util.List<OfficeProductId> productIds;
    /** The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not. */
    private Boolean shouldUninstallOlderVersionsOfOffice;
    /** The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices. */
    private String targetVersion;
    /** The Enum to specify the Office365 Updates Channel. */
    private OfficeUpdateChannel updateChannel;
    /** The property to represent the update version in which the specific target version is available for the Office365 app suite. */
    private String updateVersion;
    /** The property to represent that whether the shared computer activation is used not for Office365 app suite. */
    private Boolean useSharedComputerActivation;
    /**
     * Instantiates a new OfficeSuiteApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeSuiteApp() {
        super();
        this.setOdataType("#microsoft.graph.officeSuiteApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfficeSuiteApp
     */
    @javax.annotation.Nonnull
    public static OfficeSuiteApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeSuiteApp();
    }
    /**
     * Gets the autoAcceptEula property value. The value to accept the EULA automatically on the enduser's device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoAcceptEula() {
        return this.autoAcceptEula;
    }
    /**
     * Gets the excludedApps property value. The property to represent the apps which are excluded from the selected Office365 Product Id.
     * @return a excludedApps
     */
    @javax.annotation.Nullable
    public ExcludedApps getExcludedApps() {
        return this.excludedApps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoAcceptEula", (n) -> { this.setAutoAcceptEula(n.getBooleanValue()); });
        deserializerMap.put("excludedApps", (n) -> { this.setExcludedApps(n.getObjectValue(ExcludedApps::createFromDiscriminatorValue)); });
        deserializerMap.put("installProgressDisplayLevel", (n) -> { this.setInstallProgressDisplayLevel(n.getEnumValue(OfficeSuiteInstallProgressDisplayLevel.class)); });
        deserializerMap.put("localesToInstall", (n) -> { this.setLocalesToInstall(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("officeConfigurationXml", (n) -> { this.setOfficeConfigurationXml(n.getByteArrayValue()); });
        deserializerMap.put("officePlatformArchitecture", (n) -> { this.setOfficePlatformArchitecture(n.getEnumValue(WindowsArchitecture.class)); });
        deserializerMap.put("officeSuiteAppDefaultFileFormat", (n) -> { this.setOfficeSuiteAppDefaultFileFormat(n.getEnumValue(OfficeSuiteDefaultFileFormatType.class)); });
        deserializerMap.put("productIds", (n) -> { this.setProductIds(n.getCollectionOfEnumValues(OfficeProductId.class)); });
        deserializerMap.put("shouldUninstallOlderVersionsOfOffice", (n) -> { this.setShouldUninstallOlderVersionsOfOffice(n.getBooleanValue()); });
        deserializerMap.put("targetVersion", (n) -> { this.setTargetVersion(n.getStringValue()); });
        deserializerMap.put("updateChannel", (n) -> { this.setUpdateChannel(n.getEnumValue(OfficeUpdateChannel.class)); });
        deserializerMap.put("updateVersion", (n) -> { this.setUpdateVersion(n.getStringValue()); });
        deserializerMap.put("useSharedComputerActivation", (n) -> { this.setUseSharedComputerActivation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installProgressDisplayLevel property value. The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
     * @return a OfficeSuiteInstallProgressDisplayLevel
     */
    @javax.annotation.Nullable
    public OfficeSuiteInstallProgressDisplayLevel getInstallProgressDisplayLevel() {
        return this.installProgressDisplayLevel;
    }
    /**
     * Gets the localesToInstall property value. The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLocalesToInstall() {
        return this.localesToInstall;
    }
    /**
     * Gets the officeConfigurationXml property value. The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getOfficeConfigurationXml() {
        return this.officeConfigurationXml;
    }
    /**
     * Gets the officePlatformArchitecture property value. Contains properties for Windows architecture.
     * @return a WindowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getOfficePlatformArchitecture() {
        return this.officePlatformArchitecture;
    }
    /**
     * Gets the officeSuiteAppDefaultFileFormat property value. Describes the OfficeSuiteApp file format types that can be selected.
     * @return a OfficeSuiteDefaultFileFormatType
     */
    @javax.annotation.Nullable
    public OfficeSuiteDefaultFileFormatType getOfficeSuiteAppDefaultFileFormat() {
        return this.officeSuiteAppDefaultFileFormat;
    }
    /**
     * Gets the productIds property value. The Product Ids that represent the Office365 Suite SKU.
     * @return a OfficeProductId
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeProductId> getProductIds() {
        return this.productIds;
    }
    /**
     * Gets the shouldUninstallOlderVersionsOfOffice property value. The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShouldUninstallOlderVersionsOfOffice() {
        return this.shouldUninstallOlderVersionsOfOffice;
    }
    /**
     * Gets the targetVersion property value. The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetVersion() {
        return this.targetVersion;
    }
    /**
     * Gets the updateChannel property value. The Enum to specify the Office365 Updates Channel.
     * @return a OfficeUpdateChannel
     */
    @javax.annotation.Nullable
    public OfficeUpdateChannel getUpdateChannel() {
        return this.updateChannel;
    }
    /**
     * Gets the updateVersion property value. The property to represent the update version in which the specific target version is available for the Office365 app suite.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateVersion() {
        return this.updateVersion;
    }
    /**
     * Gets the useSharedComputerActivation property value. The property to represent that whether the shared computer activation is used not for Office365 app suite.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseSharedComputerActivation() {
        return this.useSharedComputerActivation;
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
        writer.writeBooleanValue("autoAcceptEula", this.getAutoAcceptEula());
        writer.writeObjectValue("excludedApps", this.getExcludedApps());
        writer.writeEnumValue("installProgressDisplayLevel", this.getInstallProgressDisplayLevel());
        writer.writeCollectionOfPrimitiveValues("localesToInstall", this.getLocalesToInstall());
        writer.writeByteArrayValue("officeConfigurationXml", this.getOfficeConfigurationXml());
        writer.writeEnumValue("officePlatformArchitecture", this.getOfficePlatformArchitecture());
        writer.writeEnumValue("officeSuiteAppDefaultFileFormat", this.getOfficeSuiteAppDefaultFileFormat());
        writer.writeCollectionOfEnumValues("productIds", this.getProductIds());
        writer.writeBooleanValue("shouldUninstallOlderVersionsOfOffice", this.getShouldUninstallOlderVersionsOfOffice());
        writer.writeStringValue("targetVersion", this.getTargetVersion());
        writer.writeEnumValue("updateChannel", this.getUpdateChannel());
        writer.writeStringValue("updateVersion", this.getUpdateVersion());
        writer.writeBooleanValue("useSharedComputerActivation", this.getUseSharedComputerActivation());
    }
    /**
     * Sets the autoAcceptEula property value. The value to accept the EULA automatically on the enduser's device.
     * @param value Value to set for the autoAcceptEula property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoAcceptEula(@javax.annotation.Nullable final Boolean value) {
        this.autoAcceptEula = value;
    }
    /**
     * Sets the excludedApps property value. The property to represent the apps which are excluded from the selected Office365 Product Id.
     * @param value Value to set for the excludedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedApps(@javax.annotation.Nullable final ExcludedApps value) {
        this.excludedApps = value;
    }
    /**
     * Sets the installProgressDisplayLevel property value. The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
     * @param value Value to set for the installProgressDisplayLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallProgressDisplayLevel(@javax.annotation.Nullable final OfficeSuiteInstallProgressDisplayLevel value) {
        this.installProgressDisplayLevel = value;
    }
    /**
     * Sets the localesToInstall property value. The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx
     * @param value Value to set for the localesToInstall property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalesToInstall(@javax.annotation.Nullable final java.util.List<String> value) {
        this.localesToInstall = value;
    }
    /**
     * Sets the officeConfigurationXml property value. The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     * @param value Value to set for the officeConfigurationXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeConfigurationXml(@javax.annotation.Nullable final byte[] value) {
        this.officeConfigurationXml = value;
    }
    /**
     * Sets the officePlatformArchitecture property value. Contains properties for Windows architecture.
     * @param value Value to set for the officePlatformArchitecture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficePlatformArchitecture(@javax.annotation.Nullable final WindowsArchitecture value) {
        this.officePlatformArchitecture = value;
    }
    /**
     * Sets the officeSuiteAppDefaultFileFormat property value. Describes the OfficeSuiteApp file format types that can be selected.
     * @param value Value to set for the officeSuiteAppDefaultFileFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeSuiteAppDefaultFileFormat(@javax.annotation.Nullable final OfficeSuiteDefaultFileFormatType value) {
        this.officeSuiteAppDefaultFileFormat = value;
    }
    /**
     * Sets the productIds property value. The Product Ids that represent the Office365 Suite SKU.
     * @param value Value to set for the productIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductIds(@javax.annotation.Nullable final java.util.List<OfficeProductId> value) {
        this.productIds = value;
    }
    /**
     * Sets the shouldUninstallOlderVersionsOfOffice property value. The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     * @param value Value to set for the shouldUninstallOlderVersionsOfOffice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShouldUninstallOlderVersionsOfOffice(@javax.annotation.Nullable final Boolean value) {
        this.shouldUninstallOlderVersionsOfOffice = value;
    }
    /**
     * Sets the targetVersion property value. The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     * @param value Value to set for the targetVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetVersion(@javax.annotation.Nullable final String value) {
        this.targetVersion = value;
    }
    /**
     * Sets the updateChannel property value. The Enum to specify the Office365 Updates Channel.
     * @param value Value to set for the updateChannel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateChannel(@javax.annotation.Nullable final OfficeUpdateChannel value) {
        this.updateChannel = value;
    }
    /**
     * Sets the updateVersion property value. The property to represent the update version in which the specific target version is available for the Office365 app suite.
     * @param value Value to set for the updateVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateVersion(@javax.annotation.Nullable final String value) {
        this.updateVersion = value;
    }
    /**
     * Sets the useSharedComputerActivation property value. The property to represent that whether the shared computer activation is used not for Office365 app suite.
     * @param value Value to set for the useSharedComputerActivation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseSharedComputerActivation(@javax.annotation.Nullable final Boolean value) {
        this.useSharedComputerActivation = value;
    }
}

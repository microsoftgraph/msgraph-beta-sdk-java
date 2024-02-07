package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the Office365 Suite App.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfficeSuiteApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new OfficeSuiteApp and sets the default values.
     */
    public OfficeSuiteApp() {
        super();
        this.setOdataType("#microsoft.graph.officeSuiteApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfficeSuiteApp
     */
    @jakarta.annotation.Nonnull
    public static OfficeSuiteApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeSuiteApp();
    }
    /**
     * Gets the autoAcceptEula property value. The value to accept the EULA automatically on the enduser's device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoAcceptEula() {
        return this.backingStore.get("autoAcceptEula");
    }
    /**
     * Gets the excludedApps property value. The property to represent the apps which are excluded from the selected Office365 Product Id.
     * @return a ExcludedApps
     */
    @jakarta.annotation.Nullable
    public ExcludedApps getExcludedApps() {
        return this.backingStore.get("excludedApps");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoAcceptEula", (n) -> { this.setAutoAcceptEula(n.getBooleanValue()); });
        deserializerMap.put("excludedApps", (n) -> { this.setExcludedApps(n.getObjectValue(ExcludedApps::createFromDiscriminatorValue)); });
        deserializerMap.put("installProgressDisplayLevel", (n) -> { this.setInstallProgressDisplayLevel(n.getEnumValue(OfficeSuiteInstallProgressDisplayLevel::forValue)); });
        deserializerMap.put("localesToInstall", (n) -> { this.setLocalesToInstall(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("officeConfigurationXml", (n) -> { this.setOfficeConfigurationXml(n.getByteArrayValue()); });
        deserializerMap.put("officePlatformArchitecture", (n) -> { this.setOfficePlatformArchitecture(n.getEnumSetValue(WindowsArchitecture::forValue)); });
        deserializerMap.put("officeSuiteAppDefaultFileFormat", (n) -> { this.setOfficeSuiteAppDefaultFileFormat(n.getEnumValue(OfficeSuiteDefaultFileFormatType::forValue)); });
        deserializerMap.put("productIds", (n) -> { this.setProductIds(n.getCollectionOfEnumValues(OfficeProductId::forValue)); });
        deserializerMap.put("shouldUninstallOlderVersionsOfOffice", (n) -> { this.setShouldUninstallOlderVersionsOfOffice(n.getBooleanValue()); });
        deserializerMap.put("targetVersion", (n) -> { this.setTargetVersion(n.getStringValue()); });
        deserializerMap.put("updateChannel", (n) -> { this.setUpdateChannel(n.getEnumValue(OfficeUpdateChannel::forValue)); });
        deserializerMap.put("updateVersion", (n) -> { this.setUpdateVersion(n.getStringValue()); });
        deserializerMap.put("useSharedComputerActivation", (n) -> { this.setUseSharedComputerActivation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installProgressDisplayLevel property value. The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
     * @return a OfficeSuiteInstallProgressDisplayLevel
     */
    @jakarta.annotation.Nullable
    public OfficeSuiteInstallProgressDisplayLevel getInstallProgressDisplayLevel() {
        return this.backingStore.get("installProgressDisplayLevel");
    }
    /**
     * Gets the localesToInstall property value. The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocalesToInstall() {
        return this.backingStore.get("localesToInstall");
    }
    /**
     * Gets the officeConfigurationXml property value. The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getOfficeConfigurationXml() {
        return this.backingStore.get("officeConfigurationXml");
    }
    /**
     * Gets the officePlatformArchitecture property value. Contains properties for Windows architecture.
     * @return a EnumSet<WindowsArchitecture>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getOfficePlatformArchitecture() {
        return this.backingStore.get("officePlatformArchitecture");
    }
    /**
     * Gets the officeSuiteAppDefaultFileFormat property value. Describes the OfficeSuiteApp file format types that can be selected.
     * @return a OfficeSuiteDefaultFileFormatType
     */
    @jakarta.annotation.Nullable
    public OfficeSuiteDefaultFileFormatType getOfficeSuiteAppDefaultFileFormat() {
        return this.backingStore.get("officeSuiteAppDefaultFileFormat");
    }
    /**
     * Gets the productIds property value. The Product Ids that represent the Office365 Suite SKU.
     * @return a java.util.List<OfficeProductId>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfficeProductId> getProductIds() {
        return this.backingStore.get("productIds");
    }
    /**
     * Gets the shouldUninstallOlderVersionsOfOffice property value. The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShouldUninstallOlderVersionsOfOffice() {
        return this.backingStore.get("shouldUninstallOlderVersionsOfOffice");
    }
    /**
     * Gets the targetVersion property value. The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetVersion() {
        return this.backingStore.get("targetVersion");
    }
    /**
     * Gets the updateChannel property value. The Enum to specify the Office365 Updates Channel.
     * @return a OfficeUpdateChannel
     */
    @jakarta.annotation.Nullable
    public OfficeUpdateChannel getUpdateChannel() {
        return this.backingStore.get("updateChannel");
    }
    /**
     * Gets the updateVersion property value. The property to represent the update version in which the specific target version is available for the Office365 app suite.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateVersion() {
        return this.backingStore.get("updateVersion");
    }
    /**
     * Gets the useSharedComputerActivation property value. The property to represent that whether the shared computer activation is used not for Office365 app suite.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseSharedComputerActivation() {
        return this.backingStore.get("useSharedComputerActivation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("autoAcceptEula", this.getAutoAcceptEula());
        writer.writeObjectValue("excludedApps", this.getExcludedApps());
        writer.writeEnumValue("installProgressDisplayLevel", this.getInstallProgressDisplayLevel());
        writer.writeCollectionOfPrimitiveValues("localesToInstall", this.getLocalesToInstall());
        writer.writeByteArrayValue("officeConfigurationXml", this.getOfficeConfigurationXml());
        writer.writeEnumSetValue("officePlatformArchitecture", this.getOfficePlatformArchitecture());
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
     */
    public void setAutoAcceptEula(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoAcceptEula", value);
    }
    /**
     * Sets the excludedApps property value. The property to represent the apps which are excluded from the selected Office365 Product Id.
     * @param value Value to set for the excludedApps property.
     */
    public void setExcludedApps(@jakarta.annotation.Nullable final ExcludedApps value) {
        this.backingStore.set("excludedApps", value);
    }
    /**
     * Sets the installProgressDisplayLevel property value. The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
     * @param value Value to set for the installProgressDisplayLevel property.
     */
    public void setInstallProgressDisplayLevel(@jakarta.annotation.Nullable final OfficeSuiteInstallProgressDisplayLevel value) {
        this.backingStore.set("installProgressDisplayLevel", value);
    }
    /**
     * Sets the localesToInstall property value. The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx
     * @param value Value to set for the localesToInstall property.
     */
    public void setLocalesToInstall(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("localesToInstall", value);
    }
    /**
     * Sets the officeConfigurationXml property value. The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     * @param value Value to set for the officeConfigurationXml property.
     */
    public void setOfficeConfigurationXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("officeConfigurationXml", value);
    }
    /**
     * Sets the officePlatformArchitecture property value. Contains properties for Windows architecture.
     * @param value Value to set for the officePlatformArchitecture property.
     */
    public void setOfficePlatformArchitecture(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("officePlatformArchitecture", value);
    }
    /**
     * Sets the officeSuiteAppDefaultFileFormat property value. Describes the OfficeSuiteApp file format types that can be selected.
     * @param value Value to set for the officeSuiteAppDefaultFileFormat property.
     */
    public void setOfficeSuiteAppDefaultFileFormat(@jakarta.annotation.Nullable final OfficeSuiteDefaultFileFormatType value) {
        this.backingStore.set("officeSuiteAppDefaultFileFormat", value);
    }
    /**
     * Sets the productIds property value. The Product Ids that represent the Office365 Suite SKU.
     * @param value Value to set for the productIds property.
     */
    public void setProductIds(@jakarta.annotation.Nullable final java.util.List<OfficeProductId> value) {
        this.backingStore.set("productIds", value);
    }
    /**
     * Sets the shouldUninstallOlderVersionsOfOffice property value. The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     * @param value Value to set for the shouldUninstallOlderVersionsOfOffice property.
     */
    public void setShouldUninstallOlderVersionsOfOffice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("shouldUninstallOlderVersionsOfOffice", value);
    }
    /**
     * Sets the targetVersion property value. The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     * @param value Value to set for the targetVersion property.
     */
    public void setTargetVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetVersion", value);
    }
    /**
     * Sets the updateChannel property value. The Enum to specify the Office365 Updates Channel.
     * @param value Value to set for the updateChannel property.
     */
    public void setUpdateChannel(@jakarta.annotation.Nullable final OfficeUpdateChannel value) {
        this.backingStore.set("updateChannel", value);
    }
    /**
     * Sets the updateVersion property value. The property to represent the update version in which the specific target version is available for the Office365 app suite.
     * @param value Value to set for the updateVersion property.
     */
    public void setUpdateVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("updateVersion", value);
    }
    /**
     * Sets the useSharedComputerActivation property value. The property to represent that whether the shared computer activation is used not for Office365 app suite.
     * @param value Value to set for the useSharedComputerActivation property.
     */
    public void setUseSharedComputerActivation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useSharedComputerActivation", value);
    }
}

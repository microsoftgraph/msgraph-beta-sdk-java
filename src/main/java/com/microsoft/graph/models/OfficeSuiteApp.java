package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeSuiteApp extends MobileApp implements Parsable {
    /** The value to accept the EULA automatically on the enduser's device. */
    private Boolean _autoAcceptEula;
    /** The property to represent the apps which are excluded from the selected Office365 Product Id. */
    private ExcludedApps _excludedApps;
    /** The Enum to specify the level of display for the Installation Progress Setup UI on the Device. */
    private OfficeSuiteInstallProgressDisplayLevel _installProgressDisplayLevel;
    /** The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx */
    private java.util.List<String> _localesToInstall;
    /** The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app. */
    private byte[] _officeConfigurationXml;
    /** Contains properties for Windows architecture. */
    private WindowsArchitecture _officePlatformArchitecture;
    /** The Product Ids that represent the Office365 Suite SKU. */
    private java.util.List<String> _productIds;
    /** The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not. */
    private Boolean _shouldUninstallOlderVersionsOfOffice;
    /** The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices. */
    private String _targetVersion;
    /** The Enum to specify the Office365 Updates Channel. */
    private OfficeUpdateChannel _updateChannel;
    /** The property to represent the update version in which the specific target version is available for the Office365 app suite. */
    private String _updateVersion;
    /** The property to represent that whether the shared computer activation is used not for Office365 app suite. */
    private Boolean _useSharedComputerActivation;
    /**
     * Instantiates a new OfficeSuiteApp and sets the default values.
     * @return a void
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
        return this._autoAcceptEula;
    }
    /**
     * Gets the excludedApps property value. The property to represent the apps which are excluded from the selected Office365 Product Id.
     * @return a excludedApps
     */
    @javax.annotation.Nullable
    public ExcludedApps getExcludedApps() {
        return this._excludedApps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeSuiteApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("autoAcceptEula", (n) -> { currentObject.setAutoAcceptEula(n.getBooleanValue()); });
            this.put("excludedApps", (n) -> { currentObject.setExcludedApps(n.getObjectValue(ExcludedApps::createFromDiscriminatorValue)); });
            this.put("installProgressDisplayLevel", (n) -> { currentObject.setInstallProgressDisplayLevel(n.getEnumValue(OfficeSuiteInstallProgressDisplayLevel.class)); });
            this.put("localesToInstall", (n) -> { currentObject.setLocalesToInstall(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("officeConfigurationXml", (n) -> { currentObject.setOfficeConfigurationXml(n.getByteArrayValue()); });
            this.put("officePlatformArchitecture", (n) -> { currentObject.setOfficePlatformArchitecture(n.getEnumValue(WindowsArchitecture.class)); });
            this.put("productIds", (n) -> { currentObject.setProductIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("shouldUninstallOlderVersionsOfOffice", (n) -> { currentObject.setShouldUninstallOlderVersionsOfOffice(n.getBooleanValue()); });
            this.put("targetVersion", (n) -> { currentObject.setTargetVersion(n.getStringValue()); });
            this.put("updateChannel", (n) -> { currentObject.setUpdateChannel(n.getEnumValue(OfficeUpdateChannel.class)); });
            this.put("updateVersion", (n) -> { currentObject.setUpdateVersion(n.getStringValue()); });
            this.put("useSharedComputerActivation", (n) -> { currentObject.setUseSharedComputerActivation(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the installProgressDisplayLevel property value. The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
     * @return a officeSuiteInstallProgressDisplayLevel
     */
    @javax.annotation.Nullable
    public OfficeSuiteInstallProgressDisplayLevel getInstallProgressDisplayLevel() {
        return this._installProgressDisplayLevel;
    }
    /**
     * Gets the localesToInstall property value. The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLocalesToInstall() {
        return this._localesToInstall;
    }
    /**
     * Gets the officeConfigurationXml property value. The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getOfficeConfigurationXml() {
        return this._officeConfigurationXml;
    }
    /**
     * Gets the officePlatformArchitecture property value. Contains properties for Windows architecture.
     * @return a windowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getOfficePlatformArchitecture() {
        return this._officePlatformArchitecture;
    }
    /**
     * Gets the productIds property value. The Product Ids that represent the Office365 Suite SKU.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProductIds() {
        return this._productIds;
    }
    /**
     * Gets the shouldUninstallOlderVersionsOfOffice property value. The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShouldUninstallOlderVersionsOfOffice() {
        return this._shouldUninstallOlderVersionsOfOffice;
    }
    /**
     * Gets the targetVersion property value. The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetVersion() {
        return this._targetVersion;
    }
    /**
     * Gets the updateChannel property value. The Enum to specify the Office365 Updates Channel.
     * @return a officeUpdateChannel
     */
    @javax.annotation.Nullable
    public OfficeUpdateChannel getUpdateChannel() {
        return this._updateChannel;
    }
    /**
     * Gets the updateVersion property value. The property to represent the update version in which the specific target version is available for the Office365 app suite.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateVersion() {
        return this._updateVersion;
    }
    /**
     * Gets the useSharedComputerActivation property value. The property to represent that whether the shared computer activation is used not for Office365 app suite.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseSharedComputerActivation() {
        return this._useSharedComputerActivation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("autoAcceptEula", this.getAutoAcceptEula());
        writer.writeObjectValue("excludedApps", this.getExcludedApps());
        writer.writeEnumValue("installProgressDisplayLevel", this.getInstallProgressDisplayLevel());
        writer.writeCollectionOfPrimitiveValues("localesToInstall", this.getLocalesToInstall());
        writer.writeByteArrayValue("officeConfigurationXml", this.getOfficeConfigurationXml());
        writer.writeEnumValue("officePlatformArchitecture", this.getOfficePlatformArchitecture());
        writer.writeCollectionOfPrimitiveValues("productIds", this.getProductIds());
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
    public void setAutoAcceptEula(@javax.annotation.Nullable final Boolean value) {
        this._autoAcceptEula = value;
    }
    /**
     * Sets the excludedApps property value. The property to represent the apps which are excluded from the selected Office365 Product Id.
     * @param value Value to set for the excludedApps property.
     * @return a void
     */
    public void setExcludedApps(@javax.annotation.Nullable final ExcludedApps value) {
        this._excludedApps = value;
    }
    /**
     * Sets the installProgressDisplayLevel property value. The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
     * @param value Value to set for the installProgressDisplayLevel property.
     * @return a void
     */
    public void setInstallProgressDisplayLevel(@javax.annotation.Nullable final OfficeSuiteInstallProgressDisplayLevel value) {
        this._installProgressDisplayLevel = value;
    }
    /**
     * Sets the localesToInstall property value. The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/library/cc179219(v=office.16).aspx
     * @param value Value to set for the localesToInstall property.
     * @return a void
     */
    public void setLocalesToInstall(@javax.annotation.Nullable final java.util.List<String> value) {
        this._localesToInstall = value;
    }
    /**
     * Sets the officeConfigurationXml property value. The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     * @param value Value to set for the officeConfigurationXml property.
     * @return a void
     */
    public void setOfficeConfigurationXml(@javax.annotation.Nullable final byte[] value) {
        this._officeConfigurationXml = value;
    }
    /**
     * Sets the officePlatformArchitecture property value. Contains properties for Windows architecture.
     * @param value Value to set for the officePlatformArchitecture property.
     * @return a void
     */
    public void setOfficePlatformArchitecture(@javax.annotation.Nullable final WindowsArchitecture value) {
        this._officePlatformArchitecture = value;
    }
    /**
     * Sets the productIds property value. The Product Ids that represent the Office365 Suite SKU.
     * @param value Value to set for the productIds property.
     * @return a void
     */
    public void setProductIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._productIds = value;
    }
    /**
     * Sets the shouldUninstallOlderVersionsOfOffice property value. The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     * @param value Value to set for the shouldUninstallOlderVersionsOfOffice property.
     * @return a void
     */
    public void setShouldUninstallOlderVersionsOfOffice(@javax.annotation.Nullable final Boolean value) {
        this._shouldUninstallOlderVersionsOfOffice = value;
    }
    /**
     * Sets the targetVersion property value. The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     * @param value Value to set for the targetVersion property.
     * @return a void
     */
    public void setTargetVersion(@javax.annotation.Nullable final String value) {
        this._targetVersion = value;
    }
    /**
     * Sets the updateChannel property value. The Enum to specify the Office365 Updates Channel.
     * @param value Value to set for the updateChannel property.
     * @return a void
     */
    public void setUpdateChannel(@javax.annotation.Nullable final OfficeUpdateChannel value) {
        this._updateChannel = value;
    }
    /**
     * Sets the updateVersion property value. The property to represent the update version in which the specific target version is available for the Office365 app suite.
     * @param value Value to set for the updateVersion property.
     * @return a void
     */
    public void setUpdateVersion(@javax.annotation.Nullable final String value) {
        this._updateVersion = value;
    }
    /**
     * Sets the useSharedComputerActivation property value. The property to represent that whether the shared computer activation is used not for Office365 app suite.
     * @param value Value to set for the useSharedComputerActivation property.
     * @return a void
     */
    public void setUseSharedComputerActivation(@javax.annotation.Nullable final Boolean value) {
        this._useSharedComputerActivation = value;
    }
}

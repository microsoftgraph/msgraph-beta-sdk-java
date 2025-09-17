package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Win32 apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobApp extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link Win32LobApp} and sets the default values.
     */
    public Win32LobApp() {
        super();
        this.setOdataType("#microsoft.graph.win32LobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32LobApp}
     */
    @jakarta.annotation.Nonnull
    public static Win32LobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.win32CatalogApp": return new Win32CatalogApp();
            }
        }
        return new Win32LobApp();
    }
    /**
     * Gets the activeInstallScript property value. Contains the unique identifier of the associated install script for this Win32 app to be used instead of the install command line by the managed device during app installation. When null, the install command line is used instead.
     * @return a {@link MobileAppScriptReference}
     */
    @jakarta.annotation.Nullable
    public MobileAppScriptReference getActiveInstallScript() {
        return this.backingStore.get("activeInstallScript");
    }
    /**
     * Gets the activeUninstallScript property value. Contains the unique identifier of the associated uninstall script for this Win32 app to be used instead of the uninstall command line by the managed device during app uninstallation. When null, the uninstall command line is used instead.
     * @return a {@link MobileAppScriptReference}
     */
    @jakarta.annotation.Nullable
    public MobileAppScriptReference getActiveUninstallScript() {
        return this.backingStore.get("activeUninstallScript");
    }
    /**
     * Gets the allowAvailableUninstall property value. Indicates whether the uninstall is supported from the company portal for the Win32 app with an available assignment. When TRUE, indicates that uninstall is supported from the company portal for the Windows app (Win32) with an available assignment. When FALSE, indicates that uninstall is not supported for the Windows app (Win32) with an Available assignment. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAvailableUninstall() {
        return this.backingStore.get("allowAvailableUninstall");
    }
    /**
     * Gets the allowedArchitectures property value. Indicates the Windows architecture(s) this app should be installed on. The app will be treated as not applicable for devices with architectures not matching the selected value. When a non-null value is provided for the allowedArchitectures property, the value of the applicableArchitectures property is set to none. Possible values are: null, x86, x64, arm64. Possible values are: none, x86, x64, arm, neutral, arm64.
     * @return a {@link EnumSet<WindowsArchitecture>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getAllowedArchitectures() {
        return this.backingStore.get("allowedArchitectures");
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a {@link EnumSet<WindowsArchitecture>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getApplicableArchitectures() {
        return this.backingStore.get("applicableArchitectures");
    }
    /**
     * Gets the detectionRules property value. Indicates the detection rules to detect Win32 Line of Business (LoB) app. Possible values are Win32LobAppPowerShellScriptDetection, Win32LobAppRegistryDetection, Win32LobAppFileSystemDetection, Win32LobAppProductCodeDetection.
     * @return a {@link java.util.List<Win32LobAppDetection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Win32LobAppDetection> getDetectionRules() {
        return this.backingStore.get("detectionRules");
    }
    /**
     * Gets the displayVersion property value. Indicates the version displayed in the UX for this app. Used to set the version of the app. Example: 1.0.3.215.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayVersion() {
        return this.backingStore.get("displayVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeInstallScript", (n) -> { this.setActiveInstallScript(n.getObjectValue(MobileAppScriptReference::createFromDiscriminatorValue)); });
        deserializerMap.put("activeUninstallScript", (n) -> { this.setActiveUninstallScript(n.getObjectValue(MobileAppScriptReference::createFromDiscriminatorValue)); });
        deserializerMap.put("allowAvailableUninstall", (n) -> { this.setAllowAvailableUninstall(n.getBooleanValue()); });
        deserializerMap.put("allowedArchitectures", (n) -> { this.setAllowedArchitectures(n.getEnumSetValue(WindowsArchitecture::forValue)); });
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumSetValue(WindowsArchitecture::forValue)); });
        deserializerMap.put("detectionRules", (n) -> { this.setDetectionRules(n.getCollectionOfObjectValues(Win32LobAppDetection::createFromDiscriminatorValue)); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("installCommandLine", (n) -> { this.setInstallCommandLine(n.getStringValue()); });
        deserializerMap.put("installExperience", (n) -> { this.setInstallExperience(n.getObjectValue(Win32LobAppInstallExperience::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumCpuSpeedInMHz", (n) -> { this.setMinimumCpuSpeedInMHz(n.getIntegerValue()); });
        deserializerMap.put("minimumFreeDiskSpaceInMB", (n) -> { this.setMinimumFreeDiskSpaceInMB(n.getIntegerValue()); });
        deserializerMap.put("minimumMemoryInMB", (n) -> { this.setMinimumMemoryInMB(n.getIntegerValue()); });
        deserializerMap.put("minimumNumberOfProcessors", (n) -> { this.setMinimumNumberOfProcessors(n.getIntegerValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumSupportedWindowsRelease", (n) -> { this.setMinimumSupportedWindowsRelease(n.getStringValue()); });
        deserializerMap.put("msiInformation", (n) -> { this.setMsiInformation(n.getObjectValue(Win32LobAppMsiInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("requirementRules", (n) -> { this.setRequirementRules(n.getCollectionOfObjectValues(Win32LobAppRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("returnCodes", (n) -> { this.setReturnCodes(n.getCollectionOfObjectValues(Win32LobAppReturnCode::createFromDiscriminatorValue)); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(Win32LobAppRule::createFromDiscriminatorValue)); });
        deserializerMap.put("setupFilePath", (n) -> { this.setSetupFilePath(n.getStringValue()); });
        deserializerMap.put("uninstallCommandLine", (n) -> { this.setUninstallCommandLine(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installCommandLine property value. Indicates the command line to install this app. Used to install the Win32 app. Example: msiexec /i &apos;Orca.Msi&apos; /qn.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstallCommandLine() {
        return this.backingStore.get("installCommandLine");
    }
    /**
     * Gets the installExperience property value. Indicates the install experience for this app.
     * @return a {@link Win32LobAppInstallExperience}
     */
    @jakarta.annotation.Nullable
    public Win32LobAppInstallExperience getInstallExperience() {
        return this.backingStore.get("installExperience");
    }
    /**
     * Gets the minimumCpuSpeedInMHz property value. Indicates the value for the minimum CPU speed which is required to install this app. Allowed range from 0 to clock speed from WMI helper.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumCpuSpeedInMHz() {
        return this.backingStore.get("minimumCpuSpeedInMHz");
    }
    /**
     * Gets the minimumFreeDiskSpaceInMB property value. Indicates the value for the minimum free disk space which is required to install this app. Allowed range from 0 to driver&apos;s maximum available free space.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumFreeDiskSpaceInMB() {
        return this.backingStore.get("minimumFreeDiskSpaceInMB");
    }
    /**
     * Gets the minimumMemoryInMB property value. Indicates the value for the minimum physical memory which is required to install this app. Allowed range from 0 to total physical memory from WMI helper.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumMemoryInMB() {
        return this.backingStore.get("minimumMemoryInMB");
    }
    /**
     * Gets the minimumNumberOfProcessors property value. Indicates the value for the minimum number of processors which is required to install this app. Minimum value is 0.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumNumberOfProcessors() {
        return this.backingStore.get("minimumNumberOfProcessors");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. Indicates the value for the minimum applicable operating system.
     * @return a {@link WindowsMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Gets the minimumSupportedWindowsRelease property value. Indicates the value for the minimum supported windows release. Example: Windows11_23H2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinimumSupportedWindowsRelease() {
        return this.backingStore.get("minimumSupportedWindowsRelease");
    }
    /**
     * Gets the msiInformation property value. Indicates the MSI details if this Win32 app is an MSI app.
     * @return a {@link Win32LobAppMsiInformation}
     */
    @jakarta.annotation.Nullable
    public Win32LobAppMsiInformation getMsiInformation() {
        return this.backingStore.get("msiInformation");
    }
    /**
     * Gets the requirementRules property value. Indicates the requirement rules to detect Win32 Line of Business (LoB) app. Possible values are: Win32LobAppFileSystemRequirement, Win32LobAppPowerShellScriptRequirement, Win32LobAppRegistryRequirement.
     * @return a {@link java.util.List<Win32LobAppRequirement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Win32LobAppRequirement> getRequirementRules() {
        return this.backingStore.get("requirementRules");
    }
    /**
     * Gets the returnCodes property value. Indicates the return codes for post installation behavior.
     * @return a {@link java.util.List<Win32LobAppReturnCode>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Win32LobAppReturnCode> getReturnCodes() {
        return this.backingStore.get("returnCodes");
    }
    /**
     * Gets the rules property value. Indicates the detection and requirement rules for this app. Possible values are: Win32LobAppFileSystemRule, Win32LobAppPowerShellScriptRule, Win32LobAppProductCodeRule, Win32LobAppRegistryRule.
     * @return a {@link java.util.List<Win32LobAppRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Win32LobAppRule> getRules() {
        return this.backingStore.get("rules");
    }
    /**
     * Gets the setupFilePath property value. Indicates the relative path of the setup file in the encrypted Win32LobApp package. Example: Intel-SA-00075 Detection and Mitigation Tool.msi.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSetupFilePath() {
        return this.backingStore.get("setupFilePath");
    }
    /**
     * Gets the uninstallCommandLine property value. Indicates the command line to uninstall this app. Used to uninstall the app. Example: msiexec /x &apos;{85F4CBCB-9BBC-4B50-A7D8-E1106771498D}&apos; /qn.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUninstallCommandLine() {
        return this.backingStore.get("uninstallCommandLine");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activeInstallScript", this.getActiveInstallScript());
        writer.writeObjectValue("activeUninstallScript", this.getActiveUninstallScript());
        writer.writeBooleanValue("allowAvailableUninstall", this.getAllowAvailableUninstall());
        writer.writeEnumSetValue("allowedArchitectures", this.getAllowedArchitectures());
        writer.writeEnumSetValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeCollectionOfObjectValues("detectionRules", this.getDetectionRules());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeStringValue("installCommandLine", this.getInstallCommandLine());
        writer.writeObjectValue("installExperience", this.getInstallExperience());
        writer.writeIntegerValue("minimumCpuSpeedInMHz", this.getMinimumCpuSpeedInMHz());
        writer.writeIntegerValue("minimumFreeDiskSpaceInMB", this.getMinimumFreeDiskSpaceInMB());
        writer.writeIntegerValue("minimumMemoryInMB", this.getMinimumMemoryInMB());
        writer.writeIntegerValue("minimumNumberOfProcessors", this.getMinimumNumberOfProcessors());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("minimumSupportedWindowsRelease", this.getMinimumSupportedWindowsRelease());
        writer.writeObjectValue("msiInformation", this.getMsiInformation());
        writer.writeCollectionOfObjectValues("requirementRules", this.getRequirementRules());
        writer.writeCollectionOfObjectValues("returnCodes", this.getReturnCodes());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeStringValue("setupFilePath", this.getSetupFilePath());
        writer.writeStringValue("uninstallCommandLine", this.getUninstallCommandLine());
    }
    /**
     * Sets the activeInstallScript property value. Contains the unique identifier of the associated install script for this Win32 app to be used instead of the install command line by the managed device during app installation. When null, the install command line is used instead.
     * @param value Value to set for the activeInstallScript property.
     */
    public void setActiveInstallScript(@jakarta.annotation.Nullable final MobileAppScriptReference value) {
        this.backingStore.set("activeInstallScript", value);
    }
    /**
     * Sets the activeUninstallScript property value. Contains the unique identifier of the associated uninstall script for this Win32 app to be used instead of the uninstall command line by the managed device during app uninstallation. When null, the uninstall command line is used instead.
     * @param value Value to set for the activeUninstallScript property.
     */
    public void setActiveUninstallScript(@jakarta.annotation.Nullable final MobileAppScriptReference value) {
        this.backingStore.set("activeUninstallScript", value);
    }
    /**
     * Sets the allowAvailableUninstall property value. Indicates whether the uninstall is supported from the company portal for the Win32 app with an available assignment. When TRUE, indicates that uninstall is supported from the company portal for the Windows app (Win32) with an available assignment. When FALSE, indicates that uninstall is not supported for the Windows app (Win32) with an Available assignment. Default value is FALSE.
     * @param value Value to set for the allowAvailableUninstall property.
     */
    public void setAllowAvailableUninstall(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAvailableUninstall", value);
    }
    /**
     * Sets the allowedArchitectures property value. Indicates the Windows architecture(s) this app should be installed on. The app will be treated as not applicable for devices with architectures not matching the selected value. When a non-null value is provided for the allowedArchitectures property, the value of the applicableArchitectures property is set to none. Possible values are: null, x86, x64, arm64. Possible values are: none, x86, x64, arm, neutral, arm64.
     * @param value Value to set for the allowedArchitectures property.
     */
    public void setAllowedArchitectures(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("allowedArchitectures", value);
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     */
    public void setApplicableArchitectures(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("applicableArchitectures", value);
    }
    /**
     * Sets the detectionRules property value. Indicates the detection rules to detect Win32 Line of Business (LoB) app. Possible values are Win32LobAppPowerShellScriptDetection, Win32LobAppRegistryDetection, Win32LobAppFileSystemDetection, Win32LobAppProductCodeDetection.
     * @param value Value to set for the detectionRules property.
     */
    public void setDetectionRules(@jakarta.annotation.Nullable final java.util.List<Win32LobAppDetection> value) {
        this.backingStore.set("detectionRules", value);
    }
    /**
     * Sets the displayVersion property value. Indicates the version displayed in the UX for this app. Used to set the version of the app. Example: 1.0.3.215.
     * @param value Value to set for the displayVersion property.
     */
    public void setDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayVersion", value);
    }
    /**
     * Sets the installCommandLine property value. Indicates the command line to install this app. Used to install the Win32 app. Example: msiexec /i &apos;Orca.Msi&apos; /qn.
     * @param value Value to set for the installCommandLine property.
     */
    public void setInstallCommandLine(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("installCommandLine", value);
    }
    /**
     * Sets the installExperience property value. Indicates the install experience for this app.
     * @param value Value to set for the installExperience property.
     */
    public void setInstallExperience(@jakarta.annotation.Nullable final Win32LobAppInstallExperience value) {
        this.backingStore.set("installExperience", value);
    }
    /**
     * Sets the minimumCpuSpeedInMHz property value. Indicates the value for the minimum CPU speed which is required to install this app. Allowed range from 0 to clock speed from WMI helper.
     * @param value Value to set for the minimumCpuSpeedInMHz property.
     */
    public void setMinimumCpuSpeedInMHz(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumCpuSpeedInMHz", value);
    }
    /**
     * Sets the minimumFreeDiskSpaceInMB property value. Indicates the value for the minimum free disk space which is required to install this app. Allowed range from 0 to driver&apos;s maximum available free space.
     * @param value Value to set for the minimumFreeDiskSpaceInMB property.
     */
    public void setMinimumFreeDiskSpaceInMB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumFreeDiskSpaceInMB", value);
    }
    /**
     * Sets the minimumMemoryInMB property value. Indicates the value for the minimum physical memory which is required to install this app. Allowed range from 0 to total physical memory from WMI helper.
     * @param value Value to set for the minimumMemoryInMB property.
     */
    public void setMinimumMemoryInMB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumMemoryInMB", value);
    }
    /**
     * Sets the minimumNumberOfProcessors property value. Indicates the value for the minimum number of processors which is required to install this app. Minimum value is 0.
     * @param value Value to set for the minimumNumberOfProcessors property.
     */
    public void setMinimumNumberOfProcessors(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumNumberOfProcessors", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. Indicates the value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
    /**
     * Sets the minimumSupportedWindowsRelease property value. Indicates the value for the minimum supported windows release. Example: Windows11_23H2.
     * @param value Value to set for the minimumSupportedWindowsRelease property.
     */
    public void setMinimumSupportedWindowsRelease(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumSupportedWindowsRelease", value);
    }
    /**
     * Sets the msiInformation property value. Indicates the MSI details if this Win32 app is an MSI app.
     * @param value Value to set for the msiInformation property.
     */
    public void setMsiInformation(@jakarta.annotation.Nullable final Win32LobAppMsiInformation value) {
        this.backingStore.set("msiInformation", value);
    }
    /**
     * Sets the requirementRules property value. Indicates the requirement rules to detect Win32 Line of Business (LoB) app. Possible values are: Win32LobAppFileSystemRequirement, Win32LobAppPowerShellScriptRequirement, Win32LobAppRegistryRequirement.
     * @param value Value to set for the requirementRules property.
     */
    public void setRequirementRules(@jakarta.annotation.Nullable final java.util.List<Win32LobAppRequirement> value) {
        this.backingStore.set("requirementRules", value);
    }
    /**
     * Sets the returnCodes property value. Indicates the return codes for post installation behavior.
     * @param value Value to set for the returnCodes property.
     */
    public void setReturnCodes(@jakarta.annotation.Nullable final java.util.List<Win32LobAppReturnCode> value) {
        this.backingStore.set("returnCodes", value);
    }
    /**
     * Sets the rules property value. Indicates the detection and requirement rules for this app. Possible values are: Win32LobAppFileSystemRule, Win32LobAppPowerShellScriptRule, Win32LobAppProductCodeRule, Win32LobAppRegistryRule.
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<Win32LobAppRule> value) {
        this.backingStore.set("rules", value);
    }
    /**
     * Sets the setupFilePath property value. Indicates the relative path of the setup file in the encrypted Win32LobApp package. Example: Intel-SA-00075 Detection and Mitigation Tool.msi.
     * @param value Value to set for the setupFilePath property.
     */
    public void setSetupFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("setupFilePath", value);
    }
    /**
     * Sets the uninstallCommandLine property value. Indicates the command line to uninstall this app. Used to uninstall the app. Example: msiexec /x &apos;{85F4CBCB-9BBC-4B50-A7D8-E1106771498D}&apos; /qn.
     * @param value Value to set for the uninstallCommandLine property.
     */
    public void setUninstallCommandLine(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uninstallCommandLine", value);
    }
}

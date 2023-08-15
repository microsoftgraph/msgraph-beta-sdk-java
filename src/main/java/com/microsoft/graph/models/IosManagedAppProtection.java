package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings targeted to specific security groups and for a specified set of apps on an iOS device
 */
public class IosManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /**
     * Semicolon seperated list of device models allowed, as a string, for the managed app to work.
     */
    private String allowedIosDeviceModels;
    /**
     * An admin initiated action to be applied on a managed app.
     */
    private ManagedAppRemediationAction appActionIfIosDeviceModelNotAllowed;
    /**
     * Represents the level to which app data is encrypted for managed apps
     */
    private ManagedAppDataEncryptionType appDataEncryptionType;
    /**
     * List of apps to which the policy is deployed.
     */
    private java.util.List<ManagedMobileApp> apps;
    /**
     * A custom browser protocol to open weblink on iOS.
     */
    private String customBrowserProtocol;
    /**
     * Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     */
    private String customDialerAppProtocol;
    /**
     * Count of apps to which the current policy is deployed.
     */
    private Integer deployedAppCount;
    /**
     * Navigation property to deployment summary of the configuration.
     */
    private ManagedAppPolicyDeploymentSummary deploymentSummary;
    /**
     * Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.
     */
    private Boolean disableProtectionOfManagedOutboundOpenInData;
    /**
     * Apps in this list will be exempt from the policy and will be able to receive data from managed apps.
     */
    private java.util.List<KeyValuePair> exemptedAppProtocols;
    /**
     * A list of custom urls that are allowed to invocate an unmanaged app
     */
    private java.util.List<String> exemptedUniversalLinks;
    /**
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     */
    private Boolean faceIdBlocked;
    /**
     * Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.
     */
    private Boolean filterOpenInToOnlyManagedApps;
    /**
     * A list of custom urls that are allowed to invocate a managed app
     */
    private java.util.List<String> managedUniversalLinks;
    /**
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    private String minimumRequiredSdkVersion;
    /**
     * Versions less than the specified version will result in warning message on the managed app from accessing company data.
     */
    private String minimumWarningSdkVersion;
    /**
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    private String minimumWipeSdkVersion;
    /**
     * Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.
     */
    private Boolean protectInboundDataFromUnknownSources;
    /**
     * Defines if third party keyboards are allowed while accessing a managed app
     */
    private Boolean thirdPartyKeyboardsBlocked;
    /**
     * Instantiates a new iosManagedAppProtection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IosManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.iosManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosManagedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static IosManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosManagedAppProtection();
    }
    /**
     * Gets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAllowedIosDeviceModels() {
        return this.allowedIosDeviceModels;
    }
    /**
     * Gets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfIosDeviceModelNotAllowed() {
        return this.appActionIfIosDeviceModelNotAllowed;
    }
    /**
     * Gets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @return a managedAppDataEncryptionType
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataEncryptionType getAppDataEncryptionType() {
        return this.appDataEncryptionType;
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a managedMobileApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this.apps;
    }
    /**
     * Gets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserProtocol() {
        return this.customBrowserProtocol;
    }
    /**
     * Gets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomDialerAppProtocol() {
        return this.customDialerAppProtocol;
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this.deployedAppCount;
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a managedAppPolicyDeploymentSummary
     */
    @jakarta.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this.deploymentSummary;
    }
    /**
     * Gets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableProtectionOfManagedOutboundOpenInData() {
        return this.disableProtectionOfManagedOutboundOpenInData;
    }
    /**
     * Gets the exemptedAppProtocols property value. Apps in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @return a keyValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppProtocols() {
        return this.exemptedAppProtocols;
    }
    /**
     * Gets the exemptedUniversalLinks property value. A list of custom urls that are allowed to invocate an unmanaged app
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExemptedUniversalLinks() {
        return this.exemptedUniversalLinks;
    }
    /**
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFaceIdBlocked() {
        return this.faceIdBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedIosDeviceModels", (n) -> { this.setAllowedIosDeviceModels(n.getStringValue()); });
        deserializerMap.put("appActionIfIosDeviceModelNotAllowed", (n) -> { this.setAppActionIfIosDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appDataEncryptionType", (n) -> { this.setAppDataEncryptionType(n.getEnumValue(ManagedAppDataEncryptionType.class)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("customBrowserProtocol", (n) -> { this.setCustomBrowserProtocol(n.getStringValue()); });
        deserializerMap.put("customDialerAppProtocol", (n) -> { this.setCustomDialerAppProtocol(n.getStringValue()); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deploymentSummary", (n) -> { this.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("disableProtectionOfManagedOutboundOpenInData", (n) -> { this.setDisableProtectionOfManagedOutboundOpenInData(n.getBooleanValue()); });
        deserializerMap.put("exemptedAppProtocols", (n) -> { this.setExemptedAppProtocols(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("exemptedUniversalLinks", (n) -> { this.setExemptedUniversalLinks(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("faceIdBlocked", (n) -> { this.setFaceIdBlocked(n.getBooleanValue()); });
        deserializerMap.put("filterOpenInToOnlyManagedApps", (n) -> { this.setFilterOpenInToOnlyManagedApps(n.getBooleanValue()); });
        deserializerMap.put("managedUniversalLinks", (n) -> { this.setManagedUniversalLinks(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("minimumRequiredSdkVersion", (n) -> { this.setMinimumRequiredSdkVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningSdkVersion", (n) -> { this.setMinimumWarningSdkVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeSdkVersion", (n) -> { this.setMinimumWipeSdkVersion(n.getStringValue()); });
        deserializerMap.put("protectInboundDataFromUnknownSources", (n) -> { this.setProtectInboundDataFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("thirdPartyKeyboardsBlocked", (n) -> { this.setThirdPartyKeyboardsBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFilterOpenInToOnlyManagedApps() {
        return this.filterOpenInToOnlyManagedApps;
    }
    /**
     * Gets the managedUniversalLinks property value. A list of custom urls that are allowed to invocate a managed app
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getManagedUniversalLinks() {
        return this.managedUniversalLinks;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this.minimumRequiredSdkVersion;
    }
    /**
     * Gets the minimumWarningSdkVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningSdkVersion() {
        return this.minimumWarningSdkVersion;
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this.minimumWipeSdkVersion;
    }
    /**
     * Gets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProtectInboundDataFromUnknownSources() {
        return this.protectInboundDataFromUnknownSources;
    }
    /**
     * Gets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getThirdPartyKeyboardsBlocked() {
        return this.thirdPartyKeyboardsBlocked;
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
        writer.writeStringValue("allowedIosDeviceModels", this.getAllowedIosDeviceModels());
        writer.writeEnumValue("appActionIfIosDeviceModelNotAllowed", this.getAppActionIfIosDeviceModelNotAllowed());
        writer.writeEnumValue("appDataEncryptionType", this.getAppDataEncryptionType());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeStringValue("customBrowserProtocol", this.getCustomBrowserProtocol());
        writer.writeStringValue("customDialerAppProtocol", this.getCustomDialerAppProtocol());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("disableProtectionOfManagedOutboundOpenInData", this.getDisableProtectionOfManagedOutboundOpenInData());
        writer.writeCollectionOfObjectValues("exemptedAppProtocols", this.getExemptedAppProtocols());
        writer.writeCollectionOfPrimitiveValues("exemptedUniversalLinks", this.getExemptedUniversalLinks());
        writer.writeBooleanValue("faceIdBlocked", this.getFaceIdBlocked());
        writer.writeBooleanValue("filterOpenInToOnlyManagedApps", this.getFilterOpenInToOnlyManagedApps());
        writer.writeCollectionOfPrimitiveValues("managedUniversalLinks", this.getManagedUniversalLinks());
        writer.writeStringValue("minimumRequiredSdkVersion", this.getMinimumRequiredSdkVersion());
        writer.writeStringValue("minimumWarningSdkVersion", this.getMinimumWarningSdkVersion());
        writer.writeStringValue("minimumWipeSdkVersion", this.getMinimumWipeSdkVersion());
        writer.writeBooleanValue("protectInboundDataFromUnknownSources", this.getProtectInboundDataFromUnknownSources());
        writer.writeBooleanValue("thirdPartyKeyboardsBlocked", this.getThirdPartyKeyboardsBlocked());
    }
    /**
     * Sets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work.
     * @param value Value to set for the allowedIosDeviceModels property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowedIosDeviceModels(@jakarta.annotation.Nullable final String value) {
        this.allowedIosDeviceModels = value;
    }
    /**
     * Sets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfIosDeviceModelNotAllowed property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppActionIfIosDeviceModelNotAllowed(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.appActionIfIosDeviceModelNotAllowed = value;
    }
    /**
     * Sets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @param value Value to set for the appDataEncryptionType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppDataEncryptionType(@jakarta.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this.appDataEncryptionType = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.apps = value;
    }
    /**
     * Sets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS.
     * @param value Value to set for the customBrowserProtocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomBrowserProtocol(@jakarta.annotation.Nullable final String value) {
        this.customBrowserProtocol = value;
    }
    /**
     * Sets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @param value Value to set for the customDialerAppProtocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomDialerAppProtocol(@jakarta.annotation.Nullable final String value) {
        this.customDialerAppProtocol = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeployedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeploymentSummary(@jakarta.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this.deploymentSummary = value;
    }
    /**
     * Sets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.
     * @param value Value to set for the disableProtectionOfManagedOutboundOpenInData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisableProtectionOfManagedOutboundOpenInData(@jakarta.annotation.Nullable final Boolean value) {
        this.disableProtectionOfManagedOutboundOpenInData = value;
    }
    /**
     * Sets the exemptedAppProtocols property value. Apps in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @param value Value to set for the exemptedAppProtocols property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExemptedAppProtocols(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.exemptedAppProtocols = value;
    }
    /**
     * Sets the exemptedUniversalLinks property value. A list of custom urls that are allowed to invocate an unmanaged app
     * @param value Value to set for the exemptedUniversalLinks property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExemptedUniversalLinks(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.exemptedUniversalLinks = value;
    }
    /**
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the faceIdBlocked property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFaceIdBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.faceIdBlocked = value;
    }
    /**
     * Sets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.
     * @param value Value to set for the filterOpenInToOnlyManagedApps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFilterOpenInToOnlyManagedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.filterOpenInToOnlyManagedApps = value;
    }
    /**
     * Sets the managedUniversalLinks property value. A list of custom urls that are allowed to invocate a managed app
     * @param value Value to set for the managedUniversalLinks property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedUniversalLinks(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.managedUniversalLinks = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumRequiredSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumRequiredSdkVersion = value;
    }
    /**
     * Sets the minimumWarningSdkVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningSdkVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumWarningSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWarningSdkVersion = value;
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumWipeSdkVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumWipeSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWipeSdkVersion = value;
    }
    /**
     * Sets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.
     * @param value Value to set for the protectInboundDataFromUnknownSources property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProtectInboundDataFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.protectInboundDataFromUnknownSources = value;
    }
    /**
     * Sets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app
     * @param value Value to set for the thirdPartyKeyboardsBlocked property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setThirdPartyKeyboardsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.thirdPartyKeyboardsBlocked = value;
    }
}

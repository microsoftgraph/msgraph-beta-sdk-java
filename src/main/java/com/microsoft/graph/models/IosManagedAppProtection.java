package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /** Semicolon seperated list of device models allowed, as a string, for the managed app to work. */
    private String _allowedIosDeviceModels;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfIosDeviceModelNotAllowed;
    /** Represents the level to which app data is encrypted for managed apps */
    private ManagedAppDataEncryptionType _appDataEncryptionType;
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> _apps;
    /** A custom browser protocol to open weblink on iOS. */
    private String _customBrowserProtocol;
    /** Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:. */
    private String _customDialerAppProtocol;
    /** Count of apps to which the current policy is deployed. */
    private Integer _deployedAppCount;
    /** Navigation property to deployment summary of the configuration. */
    private ManagedAppPolicyDeploymentSummary _deploymentSummary;
    /** Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. */
    private Boolean _disableProtectionOfManagedOutboundOpenInData;
    /** Apps in this list will be exempt from the policy and will be able to receive data from managed apps. */
    private java.util.List<KeyValuePair> _exemptedAppProtocols;
    /** A list of custom urls that are allowed to invocate an unmanaged app */
    private java.util.List<String> _exemptedUniversalLinks;
    /** Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. */
    private Boolean _faceIdBlocked;
    /** Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. */
    private Boolean _filterOpenInToOnlyManagedApps;
    /** A list of custom urls that are allowed to invocate a managed app */
    private java.util.List<String> _managedUniversalLinks;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumRequiredSdkVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. */
    private String _minimumWarningSdkVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumWipeSdkVersion;
    /** Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. */
    private Boolean _protectInboundDataFromUnknownSources;
    /** Defines if third party keyboards are allowed while accessing a managed app */
    private Boolean _thirdPartyKeyboardsBlocked;
    /**
     * Instantiates a new IosManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.iosManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static IosManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosManagedAppProtection();
    }
    /**
     * Gets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAllowedIosDeviceModels() {
        return this._allowedIosDeviceModels;
    }
    /**
     * Gets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfIosDeviceModelNotAllowed() {
        return this._appActionIfIosDeviceModelNotAllowed;
    }
    /**
     * Gets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @return a managedAppDataEncryptionType
     */
    @javax.annotation.Nullable
    public ManagedAppDataEncryptionType getAppDataEncryptionType() {
        return this._appDataEncryptionType;
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a managedMobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this._apps;
    }
    /**
     * Gets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserProtocol() {
        return this._customBrowserProtocol;
    }
    /**
     * Gets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomDialerAppProtocol() {
        return this._customDialerAppProtocol;
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this._deployedAppCount;
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a managedAppPolicyDeploymentSummary
     */
    @javax.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this._deploymentSummary;
    }
    /**
     * Gets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableProtectionOfManagedOutboundOpenInData() {
        return this._disableProtectionOfManagedOutboundOpenInData;
    }
    /**
     * Gets the exemptedAppProtocols property value. Apps in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppProtocols() {
        return this._exemptedAppProtocols;
    }
    /**
     * Gets the exemptedUniversalLinks property value. A list of custom urls that are allowed to invocate an unmanaged app
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExemptedUniversalLinks() {
        return this._exemptedUniversalLinks;
    }
    /**
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFaceIdBlocked() {
        return this._faceIdBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosManagedAppProtection currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedIosDeviceModels", (n) -> { currentObject.setAllowedIosDeviceModels(n.getStringValue()); });
            this.put("appActionIfIosDeviceModelNotAllowed", (n) -> { currentObject.setAppActionIfIosDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appDataEncryptionType", (n) -> { currentObject.setAppDataEncryptionType(n.getEnumValue(ManagedAppDataEncryptionType.class)); });
            this.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
            this.put("customBrowserProtocol", (n) -> { currentObject.setCustomBrowserProtocol(n.getStringValue()); });
            this.put("customDialerAppProtocol", (n) -> { currentObject.setCustomDialerAppProtocol(n.getStringValue()); });
            this.put("deployedAppCount", (n) -> { currentObject.setDeployedAppCount(n.getIntegerValue()); });
            this.put("deploymentSummary", (n) -> { currentObject.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
            this.put("disableProtectionOfManagedOutboundOpenInData", (n) -> { currentObject.setDisableProtectionOfManagedOutboundOpenInData(n.getBooleanValue()); });
            this.put("exemptedAppProtocols", (n) -> { currentObject.setExemptedAppProtocols(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("exemptedUniversalLinks", (n) -> { currentObject.setExemptedUniversalLinks(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("faceIdBlocked", (n) -> { currentObject.setFaceIdBlocked(n.getBooleanValue()); });
            this.put("filterOpenInToOnlyManagedApps", (n) -> { currentObject.setFilterOpenInToOnlyManagedApps(n.getBooleanValue()); });
            this.put("managedUniversalLinks", (n) -> { currentObject.setManagedUniversalLinks(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("minimumRequiredSdkVersion", (n) -> { currentObject.setMinimumRequiredSdkVersion(n.getStringValue()); });
            this.put("minimumWarningSdkVersion", (n) -> { currentObject.setMinimumWarningSdkVersion(n.getStringValue()); });
            this.put("minimumWipeSdkVersion", (n) -> { currentObject.setMinimumWipeSdkVersion(n.getStringValue()); });
            this.put("protectInboundDataFromUnknownSources", (n) -> { currentObject.setProtectInboundDataFromUnknownSources(n.getBooleanValue()); });
            this.put("thirdPartyKeyboardsBlocked", (n) -> { currentObject.setThirdPartyKeyboardsBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFilterOpenInToOnlyManagedApps() {
        return this._filterOpenInToOnlyManagedApps;
    }
    /**
     * Gets the managedUniversalLinks property value. A list of custom urls that are allowed to invocate a managed app
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getManagedUniversalLinks() {
        return this._managedUniversalLinks;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this._minimumRequiredSdkVersion;
    }
    /**
     * Gets the minimumWarningSdkVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningSdkVersion() {
        return this._minimumWarningSdkVersion;
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this._minimumWipeSdkVersion;
    }
    /**
     * Gets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProtectInboundDataFromUnknownSources() {
        return this._protectInboundDataFromUnknownSources;
    }
    /**
     * Gets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getThirdPartyKeyboardsBlocked() {
        return this._thirdPartyKeyboardsBlocked;
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
    @javax.annotation.Nonnull
    public void setAllowedIosDeviceModels(@javax.annotation.Nullable final String value) {
        this._allowedIosDeviceModels = value;
    }
    /**
     * Sets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfIosDeviceModelNotAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfIosDeviceModelNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfIosDeviceModelNotAllowed = value;
    }
    /**
     * Sets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @param value Value to set for the appDataEncryptionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDataEncryptionType(@javax.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this._appDataEncryptionType = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this._apps = value;
    }
    /**
     * Sets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS.
     * @param value Value to set for the customBrowserProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomBrowserProtocol(@javax.annotation.Nullable final String value) {
        this._customBrowserProtocol = value;
    }
    /**
     * Sets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @param value Value to set for the customDialerAppProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomDialerAppProtocol(@javax.annotation.Nullable final String value) {
        this._customDialerAppProtocol = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployedAppCount(@javax.annotation.Nullable final Integer value) {
        this._deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentSummary(@javax.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this._deploymentSummary = value;
    }
    /**
     * Sets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.
     * @param value Value to set for the disableProtectionOfManagedOutboundOpenInData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableProtectionOfManagedOutboundOpenInData(@javax.annotation.Nullable final Boolean value) {
        this._disableProtectionOfManagedOutboundOpenInData = value;
    }
    /**
     * Sets the exemptedAppProtocols property value. Apps in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @param value Value to set for the exemptedAppProtocols property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExemptedAppProtocols(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._exemptedAppProtocols = value;
    }
    /**
     * Sets the exemptedUniversalLinks property value. A list of custom urls that are allowed to invocate an unmanaged app
     * @param value Value to set for the exemptedUniversalLinks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExemptedUniversalLinks(@javax.annotation.Nullable final java.util.List<String> value) {
        this._exemptedUniversalLinks = value;
    }
    /**
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the faceIdBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFaceIdBlocked(@javax.annotation.Nullable final Boolean value) {
        this._faceIdBlocked = value;
    }
    /**
     * Sets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.
     * @param value Value to set for the filterOpenInToOnlyManagedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilterOpenInToOnlyManagedApps(@javax.annotation.Nullable final Boolean value) {
        this._filterOpenInToOnlyManagedApps = value;
    }
    /**
     * Sets the managedUniversalLinks property value. A list of custom urls that are allowed to invocate a managed app
     * @param value Value to set for the managedUniversalLinks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedUniversalLinks(@javax.annotation.Nullable final java.util.List<String> value) {
        this._managedUniversalLinks = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredSdkVersion = value;
    }
    /**
     * Sets the minimumWarningSdkVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningSdkVersion = value;
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumWipeSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWipeSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeSdkVersion = value;
    }
    /**
     * Sets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.
     * @param value Value to set for the protectInboundDataFromUnknownSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtectInboundDataFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this._protectInboundDataFromUnknownSources = value;
    }
    /**
     * Sets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app
     * @param value Value to set for the thirdPartyKeyboardsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThirdPartyKeyboardsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._thirdPartyKeyboardsBlocked = value;
    }
}

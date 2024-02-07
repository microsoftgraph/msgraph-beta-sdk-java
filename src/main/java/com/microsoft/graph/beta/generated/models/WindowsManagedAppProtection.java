package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings targeted to specific security groups and for a specified set of apps on a Windows device
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /**
     * Instantiates a new WindowsManagedAppProtection and sets the default values.
     */
    public WindowsManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.windowsManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsManagedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static WindowsManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagedAppProtection();
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a WindowsManagedAppDataTransferLevel
     */
    @jakarta.annotation.Nullable
    public WindowsManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this.backingStore.get("allowedInboundDataTransferSources");
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a WindowsManagedAppClipboardSharingLevel
     */
    @jakarta.annotation.Nullable
    public WindowsManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this.backingStore.get("allowedOutboundClipboardSharingLevel");
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a WindowsManagedAppDataTransferLevel
     */
    @jakarta.annotation.Nullable
    public WindowsManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this.backingStore.get("allowedOutboundDataTransferDestinations");
    }
    /**
     * Gets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfUnableToAuthenticateUser() {
        return this.backingStore.get("appActionIfUnableToAuthenticateUser");
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a java.util.List<ManagedMobileApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this.backingStore.get("apps");
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a java.util.List<TargetedManagedAppPolicyAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the deployedAppCount property value. Indicates the total number of applications for which the current policy is deployed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this.backingStore.get("deployedAppCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedInboundDataTransferSources", (n) -> { this.setAllowedInboundDataTransferSources(n.getEnumValue(WindowsManagedAppDataTransferLevel::forValue)); });
        deserializerMap.put("allowedOutboundClipboardSharingLevel", (n) -> { this.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(WindowsManagedAppClipboardSharingLevel::forValue)); });
        deserializerMap.put("allowedOutboundDataTransferDestinations", (n) -> { this.setAllowedOutboundDataTransferDestinations(n.getEnumValue(WindowsManagedAppDataTransferLevel::forValue)); });
        deserializerMap.put("appActionIfUnableToAuthenticateUser", (n) -> { this.setAppActionIfUnableToAuthenticateUser(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("maximumAllowedDeviceThreatLevel", (n) -> { this.setMaximumAllowedDeviceThreatLevel(n.getEnumValue(ManagedAppDeviceThreatLevel::forValue)); });
        deserializerMap.put("maximumRequiredOsVersion", (n) -> { this.setMaximumRequiredOsVersion(n.getStringValue()); });
        deserializerMap.put("maximumWarningOsVersion", (n) -> { this.setMaximumWarningOsVersion(n.getStringValue()); });
        deserializerMap.put("maximumWipeOsVersion", (n) -> { this.setMaximumWipeOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredAppVersion", (n) -> { this.setMinimumRequiredAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredOsVersion", (n) -> { this.setMinimumRequiredOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredSdkVersion", (n) -> { this.setMinimumRequiredSdkVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningAppVersion", (n) -> { this.setMinimumWarningAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningOsVersion", (n) -> { this.setMinimumWarningOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeAppVersion", (n) -> { this.setMinimumWipeAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeOsVersion", (n) -> { this.setMinimumWipeOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeSdkVersion", (n) -> { this.setMinimumWipeSdkVersion(n.getStringValue()); });
        deserializerMap.put("mobileThreatDefenseRemediationAction", (n) -> { this.setMobileThreatDefenseRemediationAction(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("periodOfflineBeforeAccessCheck", (n) -> { this.setPeriodOfflineBeforeAccessCheck(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOfflineBeforeWipeIsEnforced", (n) -> { this.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodAndDurationValue()); });
        deserializerMap.put("printBlocked", (n) -> { this.setPrintBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.backingStore.get("isAssigned");
    }
    /**
     * Gets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @return a ManagedAppDeviceThreatLevel
     */
    @jakarta.annotation.Nullable
    public ManagedAppDeviceThreatLevel getMaximumAllowedDeviceThreatLevel() {
        return this.backingStore.get("maximumAllowedDeviceThreatLevel");
    }
    /**
     * Gets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMaximumRequiredOsVersion() {
        return this.backingStore.get("maximumRequiredOsVersion");
    }
    /**
     * Gets the maximumWarningOsVersion property value. Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMaximumWarningOsVersion() {
        return this.backingStore.get("maximumWarningOsVersion");
    }
    /**
     * Gets the maximumWipeOsVersion property value. Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMaximumWipeOsVersion() {
        return this.backingStore.get("maximumWipeOsVersion");
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this.backingStore.get("minimumRequiredAppVersion");
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this.backingStore.get("minimumRequiredOsVersion");
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this.backingStore.get("minimumRequiredSdkVersion");
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this.backingStore.get("minimumWarningAppVersion");
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this.backingStore.get("minimumWarningOsVersion");
    }
    /**
     * Gets the minimumWipeAppVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeAppVersion() {
        return this.backingStore.get("minimumWipeAppVersion");
    }
    /**
     * Gets the minimumWipeOsVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeOsVersion() {
        return this.backingStore.get("minimumWipeOsVersion");
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this.backingStore.get("minimumWipeSdkVersion");
    }
    /**
     * Gets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getMobileThreatDefenseRemediationAction() {
        return this.backingStore.get("mobileThreatDefenseRemediationAction");
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOfflineBeforeAccessCheck() {
        return this.backingStore.get("periodOfflineBeforeAccessCheck");
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOfflineBeforeWipeIsEnforced() {
        return this.backingStore.get("periodOfflineBeforeWipeIsEnforced");
    }
    /**
     * Gets the printBlocked property value. When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this.backingStore.get("printBlocked");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowedInboundDataTransferSources", this.getAllowedInboundDataTransferSources());
        writer.writeEnumValue("allowedOutboundClipboardSharingLevel", this.getAllowedOutboundClipboardSharingLevel());
        writer.writeEnumValue("allowedOutboundDataTransferDestinations", this.getAllowedOutboundDataTransferDestinations());
        writer.writeEnumValue("appActionIfUnableToAuthenticateUser", this.getAppActionIfUnableToAuthenticateUser());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeEnumValue("maximumAllowedDeviceThreatLevel", this.getMaximumAllowedDeviceThreatLevel());
        writer.writeStringValue("maximumRequiredOsVersion", this.getMaximumRequiredOsVersion());
        writer.writeStringValue("maximumWarningOsVersion", this.getMaximumWarningOsVersion());
        writer.writeStringValue("maximumWipeOsVersion", this.getMaximumWipeOsVersion());
        writer.writeStringValue("minimumRequiredAppVersion", this.getMinimumRequiredAppVersion());
        writer.writeStringValue("minimumRequiredOsVersion", this.getMinimumRequiredOsVersion());
        writer.writeStringValue("minimumRequiredSdkVersion", this.getMinimumRequiredSdkVersion());
        writer.writeStringValue("minimumWarningAppVersion", this.getMinimumWarningAppVersion());
        writer.writeStringValue("minimumWarningOsVersion", this.getMinimumWarningOsVersion());
        writer.writeStringValue("minimumWipeAppVersion", this.getMinimumWipeAppVersion());
        writer.writeStringValue("minimumWipeOsVersion", this.getMinimumWipeOsVersion());
        writer.writeStringValue("minimumWipeSdkVersion", this.getMinimumWipeSdkVersion());
        writer.writeEnumValue("mobileThreatDefenseRemediationAction", this.getMobileThreatDefenseRemediationAction());
        writer.writePeriodAndDurationValue("periodOfflineBeforeAccessCheck", this.getPeriodOfflineBeforeAccessCheck());
        writer.writePeriodAndDurationValue("periodOfflineBeforeWipeIsEnforced", this.getPeriodOfflineBeforeWipeIsEnforced());
        writer.writeBooleanValue("printBlocked", this.getPrintBlocked());
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     */
    public void setAllowedInboundDataTransferSources(@jakarta.annotation.Nullable final WindowsManagedAppDataTransferLevel value) {
        this.backingStore.set("allowedInboundDataTransferSources", value);
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     */
    public void setAllowedOutboundClipboardSharingLevel(@jakarta.annotation.Nullable final WindowsManagedAppClipboardSharingLevel value) {
        this.backingStore.set("allowedOutboundClipboardSharingLevel", value);
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     */
    public void setAllowedOutboundDataTransferDestinations(@jakarta.annotation.Nullable final WindowsManagedAppDataTransferLevel value) {
        this.backingStore.set("allowedOutboundDataTransferDestinations", value);
    }
    /**
     * Sets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfUnableToAuthenticateUser property.
     */
    public void setAppActionIfUnableToAuthenticateUser(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfUnableToAuthenticateUser", value);
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.backingStore.set("apps", value);
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the deployedAppCount property value. Indicates the total number of applications for which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     */
    public void setDeployedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deployedAppCount", value);
    }
    /**
     * Sets the isAssigned property value. When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE.
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssigned", value);
    }
    /**
     * Sets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @param value Value to set for the maximumAllowedDeviceThreatLevel property.
     */
    public void setMaximumAllowedDeviceThreatLevel(@jakarta.annotation.Nullable final ManagedAppDeviceThreatLevel value) {
        this.backingStore.set("maximumAllowedDeviceThreatLevel", value);
    }
    /**
     * Sets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumRequiredOsVersion property.
     */
    public void setMaximumRequiredOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("maximumRequiredOsVersion", value);
    }
    /**
     * Sets the maximumWarningOsVersion property value. Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumWarningOsVersion property.
     */
    public void setMaximumWarningOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("maximumWarningOsVersion", value);
    }
    /**
     * Sets the maximumWipeOsVersion property value. Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumWipeOsVersion property.
     */
    public void setMaximumWipeOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("maximumWipeOsVersion", value);
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredAppVersion property.
     */
    public void setMinimumRequiredAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredAppVersion", value);
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredOsVersion property.
     */
    public void setMinimumRequiredOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredOsVersion", value);
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     */
    public void setMinimumRequiredSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredSdkVersion", value);
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWarningAppVersion property.
     */
    public void setMinimumWarningAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningAppVersion", value);
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWarningOsVersion property.
     */
    public void setMinimumWarningOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningOsVersion", value);
    }
    /**
     * Sets the minimumWipeAppVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeAppVersion property.
     */
    public void setMinimumWipeAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipeAppVersion", value);
    }
    /**
     * Sets the minimumWipeOsVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeOsVersion property.
     */
    public void setMinimumWipeOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipeOsVersion", value);
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeSdkVersion property.
     */
    public void setMinimumWipeSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipeSdkVersion", value);
    }
    /**
     * Sets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the mobileThreatDefenseRemediationAction property.
     */
    public void setMobileThreatDefenseRemediationAction(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("mobileThreatDefenseRemediationAction", value);
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     */
    public void setPeriodOfflineBeforeAccessCheck(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("periodOfflineBeforeAccessCheck", value);
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     */
    public void setPeriodOfflineBeforeWipeIsEnforced(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("periodOfflineBeforeWipeIsEnforced", value);
    }
    /**
     * Sets the printBlocked property value. When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE.
     * @param value Value to set for the printBlocked property.
     */
    public void setPrintBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("printBlocked", value);
    }
}

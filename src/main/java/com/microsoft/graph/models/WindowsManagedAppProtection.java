package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /** Data can be transferred from/to these classes of apps */
    private WindowsManagedAppDataTransferLevel allowedInboundDataTransferSources;
    /** Represents the level to which the device's clipboard may be shared between apps */
    private WindowsManagedAppClipboardSharingLevel allowedOutboundClipboardSharingLevel;
    /** Data can be transferred from/to these classes of apps */
    private WindowsManagedAppDataTransferLevel allowedOutboundDataTransferDestinations;
    /** If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn. */
    private ManagedAppRemediationAction appActionIfUnableToAuthenticateUser;
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> apps;
    /** Navigation property to list of inclusion and exclusion groups to which the policy is deployed. */
    private java.util.List<TargetedManagedAppPolicyAssignment> assignments;
    /** Indicates the total number of applications for which the current policy is deployed. */
    private Integer deployedAppCount;
    /** When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE. */
    private Boolean isAssigned;
    /** The maxium threat level allowed for an app to be compliant. */
    private ManagedAppDeviceThreatLevel maximumAllowedDeviceThreatLevel;
    /** Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String maximumRequiredOsVersion;
    /** Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String maximumWarningOsVersion;
    /** Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String maximumWipeOsVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumRequiredAppVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumRequiredOsVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumRequiredSdkVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumWarningAppVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumWarningOsVersion;
    /** Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumWipeAppVersion;
    /** Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumWipeOsVersion;
    /** Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String minimumWipeSdkVersion;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction mobileThreatDefenseRemediationAction;
    /** The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet. */
    private Period periodOfflineBeforeAccessCheck;
    /** The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet. */
    private Period periodOfflineBeforeWipeIsEnforced;
    /** When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE. */
    private Boolean printBlocked;
    /**
     * Instantiates a new WindowsManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.windowsManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static WindowsManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagedAppProtection();
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a WindowsManagedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public WindowsManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this.allowedInboundDataTransferSources;
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a WindowsManagedAppClipboardSharingLevel
     */
    @javax.annotation.Nullable
    public WindowsManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this.allowedOutboundClipboardSharingLevel;
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a WindowsManagedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public WindowsManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this.allowedOutboundDataTransferDestinations;
    }
    /**
     * Gets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfUnableToAuthenticateUser() {
        return this.appActionIfUnableToAuthenticateUser;
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a managedMobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this.apps;
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a targetedManagedAppPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the deployedAppCount property value. Indicates the total number of applications for which the current policy is deployed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this.deployedAppCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedInboundDataTransferSources", (n) -> { this.setAllowedInboundDataTransferSources(n.getEnumValue(WindowsManagedAppDataTransferLevel.class)); });
        deserializerMap.put("allowedOutboundClipboardSharingLevel", (n) -> { this.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(WindowsManagedAppClipboardSharingLevel.class)); });
        deserializerMap.put("allowedOutboundDataTransferDestinations", (n) -> { this.setAllowedOutboundDataTransferDestinations(n.getEnumValue(WindowsManagedAppDataTransferLevel.class)); });
        deserializerMap.put("appActionIfUnableToAuthenticateUser", (n) -> { this.setAppActionIfUnableToAuthenticateUser(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("maximumAllowedDeviceThreatLevel", (n) -> { this.setMaximumAllowedDeviceThreatLevel(n.getEnumValue(ManagedAppDeviceThreatLevel.class)); });
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
        deserializerMap.put("mobileThreatDefenseRemediationAction", (n) -> { this.setMobileThreatDefenseRemediationAction(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("periodOfflineBeforeAccessCheck", (n) -> { this.setPeriodOfflineBeforeAccessCheck(n.getPeriodValue()); });
        deserializerMap.put("periodOfflineBeforeWipeIsEnforced", (n) -> { this.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodValue()); });
        deserializerMap.put("printBlocked", (n) -> { this.setPrintBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.isAssigned;
    }
    /**
     * Gets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @return a ManagedAppDeviceThreatLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDeviceThreatLevel getMaximumAllowedDeviceThreatLevel() {
        return this.maximumAllowedDeviceThreatLevel;
    }
    /**
     * Gets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumRequiredOsVersion() {
        return this.maximumRequiredOsVersion;
    }
    /**
     * Gets the maximumWarningOsVersion property value. Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumWarningOsVersion() {
        return this.maximumWarningOsVersion;
    }
    /**
     * Gets the maximumWipeOsVersion property value. Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumWipeOsVersion() {
        return this.maximumWipeOsVersion;
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this.minimumRequiredAppVersion;
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this.minimumRequiredOsVersion;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this.minimumRequiredSdkVersion;
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this.minimumWarningAppVersion;
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this.minimumWarningOsVersion;
    }
    /**
     * Gets the minimumWipeAppVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeAppVersion() {
        return this.minimumWipeAppVersion;
    }
    /**
     * Gets the minimumWipeOsVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeOsVersion() {
        return this.minimumWipeOsVersion;
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this.minimumWipeSdkVersion;
    }
    /**
     * Gets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getMobileThreatDefenseRemediationAction() {
        return this.mobileThreatDefenseRemediationAction;
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeAccessCheck() {
        return this.periodOfflineBeforeAccessCheck;
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeWipeIsEnforced() {
        return this.periodOfflineBeforeWipeIsEnforced;
    }
    /**
     * Gets the printBlocked property value. When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this.printBlocked;
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
        writer.writePeriodValue("periodOfflineBeforeAccessCheck", this.getPeriodOfflineBeforeAccessCheck());
        writer.writePeriodValue("periodOfflineBeforeWipeIsEnforced", this.getPeriodOfflineBeforeWipeIsEnforced());
        writer.writeBooleanValue("printBlocked", this.getPrintBlocked());
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedInboundDataTransferSources(@javax.annotation.Nullable final WindowsManagedAppDataTransferLevel value) {
        this.allowedInboundDataTransferSources = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedOutboundClipboardSharingLevel(@javax.annotation.Nullable final WindowsManagedAppClipboardSharingLevel value) {
        this.allowedOutboundClipboardSharingLevel = value;
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedOutboundDataTransferDestinations(@javax.annotation.Nullable final WindowsManagedAppDataTransferLevel value) {
        this.allowedOutboundDataTransferDestinations = value;
    }
    /**
     * Sets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfUnableToAuthenticateUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfUnableToAuthenticateUser(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this.appActionIfUnableToAuthenticateUser = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.apps = value;
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the deployedAppCount property value. Indicates the total number of applications for which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployedAppCount(@javax.annotation.Nullable final Integer value) {
        this.deployedAppCount = value;
    }
    /**
     * Sets the isAssigned property value. When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this.isAssigned = value;
    }
    /**
     * Sets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @param value Value to set for the maximumAllowedDeviceThreatLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumAllowedDeviceThreatLevel(@javax.annotation.Nullable final ManagedAppDeviceThreatLevel value) {
        this.maximumAllowedDeviceThreatLevel = value;
    }
    /**
     * Sets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumRequiredOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this.maximumRequiredOsVersion = value;
    }
    /**
     * Sets the maximumWarningOsVersion property value. Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumWarningOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this.maximumWarningOsVersion = value;
    }
    /**
     * Sets the maximumWipeOsVersion property value. Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumWipeOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumWipeOsVersion(@javax.annotation.Nullable final String value) {
        this.maximumWipeOsVersion = value;
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredAppVersion(@javax.annotation.Nullable final String value) {
        this.minimumRequiredAppVersion = value;
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this.minimumRequiredOsVersion = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredSdkVersion(@javax.annotation.Nullable final String value) {
        this.minimumRequiredSdkVersion = value;
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWarningAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningAppVersion(@javax.annotation.Nullable final String value) {
        this.minimumWarningAppVersion = value;
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWarningOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this.minimumWarningOsVersion = value;
    }
    /**
     * Sets the minimumWipeAppVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWipeAppVersion(@javax.annotation.Nullable final String value) {
        this.minimumWipeAppVersion = value;
    }
    /**
     * Sets the minimumWipeOsVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWipeOsVersion(@javax.annotation.Nullable final String value) {
        this.minimumWipeOsVersion = value;
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWipeSdkVersion(@javax.annotation.Nullable final String value) {
        this.minimumWipeSdkVersion = value;
    }
    /**
     * Sets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the mobileThreatDefenseRemediationAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileThreatDefenseRemediationAction(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this.mobileThreatDefenseRemediationAction = value;
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodOfflineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this.periodOfflineBeforeAccessCheck = value;
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodOfflineBeforeWipeIsEnforced(@javax.annotation.Nullable final Period value) {
        this.periodOfflineBeforeWipeIsEnforced = value;
    }
    /**
     * Sets the printBlocked property value. When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE.
     * @param value Value to set for the printBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrintBlocked(@javax.annotation.Nullable final Boolean value) {
        this.printBlocked = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /** Data can be transferred from/to these classes of apps */
    private WindowsManagedAppDataTransferLevel _allowedInboundDataTransferSources;
    /** Represents the level to which the device's clipboard may be shared between apps */
    private WindowsManagedAppClipboardSharingLevel _allowedOutboundClipboardSharingLevel;
    /** Data can be transferred from/to these classes of apps */
    private WindowsManagedAppDataTransferLevel _allowedOutboundDataTransferDestinations;
    /** If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn. */
    private ManagedAppRemediationAction _appActionIfUnableToAuthenticateUser;
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> _apps;
    /** Navigation property to list of inclusion and exclusion groups to which the policy is deployed. */
    private java.util.List<TargetedManagedAppPolicyAssignment> _assignments;
    /** Indicates the total number of applications for which the current policy is deployed. */
    private Integer _deployedAppCount;
    /** When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE. */
    private Boolean _isAssigned;
    /** The maxium threat level allowed for an app to be compliant. */
    private ManagedAppDeviceThreatLevel _maximumAllowedDeviceThreatLevel;
    /** Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _maximumRequiredOsVersion;
    /** Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _maximumWarningOsVersion;
    /** Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String _maximumWipeOsVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumRequiredAppVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumRequiredOsVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumRequiredSdkVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumWarningAppVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumWarningOsVersion;
    /** Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumWipeAppVersion;
    /** Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumWipeOsVersion;
    /** Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'. */
    private String _minimumWipeSdkVersion;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _mobileThreatDefenseRemediationAction;
    /** The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet. */
    private Period _periodOfflineBeforeAccessCheck;
    /** The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet. */
    private Period _periodOfflineBeforeWipeIsEnforced;
    /** When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE. */
    private Boolean _printBlocked;
    /**
     * Instantiates a new WindowsManagedAppProtection and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static WindowsManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagedAppProtection();
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a windowsManagedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public WindowsManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this._allowedInboundDataTransferSources;
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a windowsManagedAppClipboardSharingLevel
     */
    @javax.annotation.Nullable
    public WindowsManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this._allowedOutboundClipboardSharingLevel;
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a windowsManagedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public WindowsManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this._allowedOutboundDataTransferDestinations;
    }
    /**
     * Gets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfUnableToAuthenticateUser() {
        return this._appActionIfUnableToAuthenticateUser;
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
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a targetedManagedAppPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the deployedAppCount property value. Indicates the total number of applications for which the current policy is deployed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this._deployedAppCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsManagedAppProtection currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedInboundDataTransferSources", (n) -> { currentObject.setAllowedInboundDataTransferSources(n.getEnumValue(WindowsManagedAppDataTransferLevel.class)); });
            this.put("allowedOutboundClipboardSharingLevel", (n) -> { currentObject.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(WindowsManagedAppClipboardSharingLevel.class)); });
            this.put("allowedOutboundDataTransferDestinations", (n) -> { currentObject.setAllowedOutboundDataTransferDestinations(n.getEnumValue(WindowsManagedAppDataTransferLevel.class)); });
            this.put("appActionIfUnableToAuthenticateUser", (n) -> { currentObject.setAppActionIfUnableToAuthenticateUser(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("deployedAppCount", (n) -> { currentObject.setDeployedAppCount(n.getIntegerValue()); });
            this.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
            this.put("maximumAllowedDeviceThreatLevel", (n) -> { currentObject.setMaximumAllowedDeviceThreatLevel(n.getEnumValue(ManagedAppDeviceThreatLevel.class)); });
            this.put("maximumRequiredOsVersion", (n) -> { currentObject.setMaximumRequiredOsVersion(n.getStringValue()); });
            this.put("maximumWarningOsVersion", (n) -> { currentObject.setMaximumWarningOsVersion(n.getStringValue()); });
            this.put("maximumWipeOsVersion", (n) -> { currentObject.setMaximumWipeOsVersion(n.getStringValue()); });
            this.put("minimumRequiredAppVersion", (n) -> { currentObject.setMinimumRequiredAppVersion(n.getStringValue()); });
            this.put("minimumRequiredOsVersion", (n) -> { currentObject.setMinimumRequiredOsVersion(n.getStringValue()); });
            this.put("minimumRequiredSdkVersion", (n) -> { currentObject.setMinimumRequiredSdkVersion(n.getStringValue()); });
            this.put("minimumWarningAppVersion", (n) -> { currentObject.setMinimumWarningAppVersion(n.getStringValue()); });
            this.put("minimumWarningOsVersion", (n) -> { currentObject.setMinimumWarningOsVersion(n.getStringValue()); });
            this.put("minimumWipeAppVersion", (n) -> { currentObject.setMinimumWipeAppVersion(n.getStringValue()); });
            this.put("minimumWipeOsVersion", (n) -> { currentObject.setMinimumWipeOsVersion(n.getStringValue()); });
            this.put("minimumWipeSdkVersion", (n) -> { currentObject.setMinimumWipeSdkVersion(n.getStringValue()); });
            this.put("mobileThreatDefenseRemediationAction", (n) -> { currentObject.setMobileThreatDefenseRemediationAction(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("periodOfflineBeforeAccessCheck", (n) -> { currentObject.setPeriodOfflineBeforeAccessCheck(n.getPeriodValue()); });
            this.put("periodOfflineBeforeWipeIsEnforced", (n) -> { currentObject.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodValue()); });
            this.put("printBlocked", (n) -> { currentObject.setPrintBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isAssigned property value. When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Gets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @return a managedAppDeviceThreatLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDeviceThreatLevel getMaximumAllowedDeviceThreatLevel() {
        return this._maximumAllowedDeviceThreatLevel;
    }
    /**
     * Gets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumRequiredOsVersion() {
        return this._maximumRequiredOsVersion;
    }
    /**
     * Gets the maximumWarningOsVersion property value. Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumWarningOsVersion() {
        return this._maximumWarningOsVersion;
    }
    /**
     * Gets the maximumWipeOsVersion property value. Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumWipeOsVersion() {
        return this._maximumWipeOsVersion;
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this._minimumRequiredAppVersion;
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this._minimumRequiredOsVersion;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this._minimumRequiredSdkVersion;
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this._minimumWarningAppVersion;
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this._minimumWarningOsVersion;
    }
    /**
     * Gets the minimumWipeAppVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeAppVersion() {
        return this._minimumWipeAppVersion;
    }
    /**
     * Gets the minimumWipeOsVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeOsVersion() {
        return this._minimumWipeOsVersion;
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this._minimumWipeSdkVersion;
    }
    /**
     * Gets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getMobileThreatDefenseRemediationAction() {
        return this._mobileThreatDefenseRemediationAction;
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeAccessCheck() {
        return this._periodOfflineBeforeAccessCheck;
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeWipeIsEnforced() {
        return this._periodOfflineBeforeWipeIsEnforced;
    }
    /**
     * Gets the printBlocked property value. When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this._printBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAllowedInboundDataTransferSources(@javax.annotation.Nullable final WindowsManagedAppDataTransferLevel value) {
        this._allowedInboundDataTransferSources = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     * @return a void
     */
    public void setAllowedOutboundClipboardSharingLevel(@javax.annotation.Nullable final WindowsManagedAppClipboardSharingLevel value) {
        this._allowedOutboundClipboardSharingLevel = value;
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     * @return a void
     */
    public void setAllowedOutboundDataTransferDestinations(@javax.annotation.Nullable final WindowsManagedAppDataTransferLevel value) {
        this._allowedOutboundDataTransferDestinations = value;
    }
    /**
     * Sets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Some possible values are block or wipe. If this property is not set, no action will be taken. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfUnableToAuthenticateUser property.
     * @return a void
     */
    public void setAppActionIfUnableToAuthenticateUser(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfUnableToAuthenticateUser = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this._apps = value;
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the deployedAppCount property value. Indicates the total number of applications for which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    public void setDeployedAppCount(@javax.annotation.Nullable final Integer value) {
        this._deployedAppCount = value;
    }
    /**
     * Sets the isAssigned property value. When TRUE, indicates that the policy is deployed to some inclusion groups. When FALSE, indicates that the policy is not deployed to any inclusion groups. Default value is FALSE.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
    /**
     * Sets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @param value Value to set for the maximumAllowedDeviceThreatLevel property.
     * @return a void
     */
    public void setMaximumAllowedDeviceThreatLevel(@javax.annotation.Nullable final ManagedAppDeviceThreatLevel value) {
        this._maximumAllowedDeviceThreatLevel = value;
    }
    /**
     * Sets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumRequiredOsVersion property.
     * @return a void
     */
    public void setMaximumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this._maximumRequiredOsVersion = value;
    }
    /**
     * Sets the maximumWarningOsVersion property value. Versions bigger than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumWarningOsVersion property.
     * @return a void
     */
    public void setMaximumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this._maximumWarningOsVersion = value;
    }
    /**
     * Sets the maximumWipeOsVersion property value. Versions bigger than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the maximumWipeOsVersion property.
     * @return a void
     */
    public void setMaximumWipeOsVersion(@javax.annotation.Nullable final String value) {
        this._maximumWipeOsVersion = value;
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredAppVersion property.
     * @return a void
     */
    public void setMinimumRequiredAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredAppVersion = value;
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredOsVersion property.
     * @return a void
     */
    public void setMinimumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredOsVersion = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    public void setMinimumRequiredSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredSdkVersion = value;
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWarningAppVersion property.
     * @return a void
     */
    public void setMinimumWarningAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningAppVersion = value;
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWarningOsVersion property.
     * @return a void
     */
    public void setMinimumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningOsVersion = value;
    }
    /**
     * Sets the minimumWipeAppVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeAppVersion property.
     * @return a void
     */
    public void setMinimumWipeAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeAppVersion = value;
    }
    /**
     * Sets the minimumWipeOsVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeOsVersion property.
     * @return a void
     */
    public void setMinimumWipeOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeOsVersion = value;
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will wipe the managed app and the associated company data. For example: '8.1.0' or '13.1.1'.
     * @param value Value to set for the minimumWipeSdkVersion property.
     * @return a void
     */
    public void setMinimumWipeSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeSdkVersion = value;
    }
    /**
     * Sets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the mobileThreatDefenseRemediationAction property.
     * @return a void
     */
    public void setMobileThreatDefenseRemediationAction(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._mobileThreatDefenseRemediationAction = value;
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet. For example, PT5M indicates that the interval is 5 minutes in duration. A timespan value of PT0S indicates that access will be blocked immediately when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     * @return a void
     */
    public void setPeriodOfflineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this._periodOfflineBeforeAccessCheck = value;
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. For example, P5D indicates that the interval is 5 days in duration. A timespan value of PT0S indicates that managed data will never be wiped when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     * @return a void
     */
    public void setPeriodOfflineBeforeWipeIsEnforced(@javax.annotation.Nullable final Period value) {
        this._periodOfflineBeforeWipeIsEnforced = value;
    }
    /**
     * Sets the printBlocked property value. When TRUE, indicates that printing is blocked from managed apps. When FALSE, indicates that printing is allowed from managed apps. Default value is FALSE.
     * @param value Value to set for the printBlocked property.
     * @return a void
     */
    public void setPrintBlocked(@javax.annotation.Nullable final Boolean value) {
        this._printBlocked = value;
    }
}

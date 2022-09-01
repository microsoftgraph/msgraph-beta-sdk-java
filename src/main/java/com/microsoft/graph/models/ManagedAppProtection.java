package com.microsoft.graph.models;

import com.microsoft.graph.models.AndroidManagedAppProtection;
import com.microsoft.graph.models.DefaultManagedAppProtection;
import com.microsoft.graph.models.IosManagedAppProtection;
import com.microsoft.graph.models.TargetedManagedAppProtection;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /** Data storage locations where a user may store managed data. */
    private java.util.List<String> _allowedDataIngestionLocations;
    /** Data storage locations where a user may store managed data. */
    private java.util.List<String> _allowedDataStorageLocations;
    /** Data can be transferred from/to these classes of apps */
    private ManagedAppDataTransferLevel _allowedInboundDataTransferSources;
    /** Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed. */
    private Integer _allowedOutboundClipboardSharingExceptionLength;
    /** Represents the level to which the device's clipboard may be shared between apps */
    private ManagedAppClipboardSharingLevel _allowedOutboundClipboardSharingLevel;
    /** Data can be transferred from/to these classes of apps */
    private ManagedAppDataTransferLevel _allowedOutboundDataTransferDestinations;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfDeviceComplianceRequired;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfMaximumPinRetriesExceeded;
    /** If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: block, wipe, warn. */
    private ManagedAppRemediationAction _appActionIfUnableToAuthenticateUser;
    /** Indicates whether a user can bring data into org documents. */
    private Boolean _blockDataIngestionIntoOrganizationDocuments;
    /** Indicates whether contacts can be synced to the user's device. */
    private Boolean _contactSyncBlocked;
    /** Indicates whether the backup of a managed app's data is blocked. */
    private Boolean _dataBackupBlocked;
    /** Indicates whether device compliance is required. */
    private Boolean _deviceComplianceRequired;
    /** The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages. */
    private ManagedAppPhoneNumberRedirectLevel _dialerRestrictionLevel;
    /** Indicates whether use of the app pin is required if the device pin is set. */
    private Boolean _disableAppPinIfDevicePinIsSet;
    /** Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True. */
    private Boolean _fingerprintBlocked;
    /** A grace period before blocking app access during off clock hours. */
    private Period _gracePeriodToBlockAppsDuringOffClockHours;
    /** Type of managed browser */
    private ManagedBrowserType _managedBrowser;
    /** Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android) */
    private Boolean _managedBrowserToOpenLinksRequired;
    /** The maxium threat level allowed for an app to be compliant. */
    private ManagedAppDeviceThreatLevel _maximumAllowedDeviceThreatLevel;
    /** Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. */
    private Integer _maximumPinRetries;
    /** Versions bigger than the specified version will block the managed app from accessing company data. */
    private String _maximumRequiredOsVersion;
    /** Versions bigger than the specified version will block the managed app from accessing company data. */
    private String _maximumWarningOsVersion;
    /** Versions bigger than the specified version will block the managed app from accessing company data. */
    private String _maximumWipeOsVersion;
    /** Minimum pin length required for an app-level pin if PinRequired is set to True */
    private Integer _minimumPinLength;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumRequiredAppVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumRequiredOsVersion;
    /** Versions less than the specified version will result in warning message on the managed app. */
    private String _minimumWarningAppVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. */
    private String _minimumWarningOsVersion;
    /** Versions less than or equal to the specified version will wipe the managed app and the associated company data. */
    private String _minimumWipeAppVersion;
    /** Versions less than or equal to the specified version will wipe the managed app and the associated company data. */
    private String _minimumWipeOsVersion;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _mobileThreatDefenseRemediationAction;
    /** Restrict managed app notification */
    private ManagedAppNotificationRestriction _notificationRestriction;
    /** Indicates whether organizational credentials are required for app use. */
    private Boolean _organizationalCredentialsRequired;
    /** TimePeriod before the all-level pin must be reset if PinRequired is set to True. */
    private Period _periodBeforePinReset;
    /** The period after which access is checked when the device is not connected to the internet. */
    private Period _periodOfflineBeforeAccessCheck;
    /** The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. */
    private Period _periodOfflineBeforeWipeIsEnforced;
    /** The period after which access is checked when the device is connected to the internet. */
    private Period _periodOnlineBeforeAccessCheck;
    /** Character set which is to be used for a user's app PIN */
    private ManagedAppPinCharacterSet _pinCharacterSet;
    /** Indicates whether an app-level pin is required. */
    private Boolean _pinRequired;
    /** Timeout in minutes for an app pin instead of non biometrics passcode */
    private Period _pinRequiredInsteadOfBiometricTimeout;
    /** Requires a pin to be unique from the number specified in this property. */
    private Integer _previousPinBlockCount;
    /** Indicates whether printing is allowed from managed apps. */
    private Boolean _printBlocked;
    /** Indicates whether users may use the 'Save As' menu item to save a copy of protected files. */
    private Boolean _saveAsBlocked;
    /** Indicates whether simplePin is blocked. */
    private Boolean _simplePinBlocked;
    /**
     * Instantiates a new ManagedAppProtection and sets the default values.
     * @return a void
     */
    public ManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.managedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static ManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedAppProtection": return new AndroidManagedAppProtection();
                case "#microsoft.graph.defaultManagedAppProtection": return new DefaultManagedAppProtection();
                case "#microsoft.graph.iosManagedAppProtection": return new IosManagedAppProtection();
                case "#microsoft.graph.targetedManagedAppProtection": return new TargetedManagedAppProtection();
            }
        }
        return new ManagedAppProtection();
    }
    /**
     * Gets the allowedDataIngestionLocations property value. Data storage locations where a user may store managed data.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedDataIngestionLocations() {
        return this._allowedDataIngestionLocations;
    }
    /**
     * Gets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedDataStorageLocations() {
        return this._allowedDataStorageLocations;
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a managedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this._allowedInboundDataTransferSources;
    }
    /**
     * Gets the allowedOutboundClipboardSharingExceptionLength property value. Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAllowedOutboundClipboardSharingExceptionLength() {
        return this._allowedOutboundClipboardSharingExceptionLength;
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a managedAppClipboardSharingLevel
     */
    @javax.annotation.Nullable
    public ManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this._allowedOutboundClipboardSharingLevel;
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a managedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this._allowedOutboundDataTransferDestinations;
    }
    /**
     * Gets the appActionIfDeviceComplianceRequired property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDeviceComplianceRequired() {
        return this._appActionIfDeviceComplianceRequired;
    }
    /**
     * Gets the appActionIfMaximumPinRetriesExceeded property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfMaximumPinRetriesExceeded() {
        return this._appActionIfMaximumPinRetriesExceeded;
    }
    /**
     * Gets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfUnableToAuthenticateUser() {
        return this._appActionIfUnableToAuthenticateUser;
    }
    /**
     * Gets the blockDataIngestionIntoOrganizationDocuments property value. Indicates whether a user can bring data into org documents.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockDataIngestionIntoOrganizationDocuments() {
        return this._blockDataIngestionIntoOrganizationDocuments;
    }
    /**
     * Gets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContactSyncBlocked() {
        return this._contactSyncBlocked;
    }
    /**
     * Gets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataBackupBlocked() {
        return this._dataBackupBlocked;
    }
    /**
     * Gets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceComplianceRequired() {
        return this._deviceComplianceRequired;
    }
    /**
     * Gets the dialerRestrictionLevel property value. The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages.
     * @return a managedAppPhoneNumberRedirectLevel
     */
    @javax.annotation.Nullable
    public ManagedAppPhoneNumberRedirectLevel getDialerRestrictionLevel() {
        return this._dialerRestrictionLevel;
    }
    /**
     * Gets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAppPinIfDevicePinIsSet() {
        return this._disableAppPinIfDevicePinIsSet;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAppProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedDataIngestionLocations", (n) -> { currentObject.setAllowedDataIngestionLocations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedDataStorageLocations", (n) -> { currentObject.setAllowedDataStorageLocations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedInboundDataTransferSources", (n) -> { currentObject.setAllowedInboundDataTransferSources(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
            this.put("allowedOutboundClipboardSharingExceptionLength", (n) -> { currentObject.setAllowedOutboundClipboardSharingExceptionLength(n.getIntegerValue()); });
            this.put("allowedOutboundClipboardSharingLevel", (n) -> { currentObject.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(ManagedAppClipboardSharingLevel.class)); });
            this.put("allowedOutboundDataTransferDestinations", (n) -> { currentObject.setAllowedOutboundDataTransferDestinations(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
            this.put("appActionIfDeviceComplianceRequired", (n) -> { currentObject.setAppActionIfDeviceComplianceRequired(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfMaximumPinRetriesExceeded", (n) -> { currentObject.setAppActionIfMaximumPinRetriesExceeded(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfUnableToAuthenticateUser", (n) -> { currentObject.setAppActionIfUnableToAuthenticateUser(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("blockDataIngestionIntoOrganizationDocuments", (n) -> { currentObject.setBlockDataIngestionIntoOrganizationDocuments(n.getBooleanValue()); });
            this.put("contactSyncBlocked", (n) -> { currentObject.setContactSyncBlocked(n.getBooleanValue()); });
            this.put("dataBackupBlocked", (n) -> { currentObject.setDataBackupBlocked(n.getBooleanValue()); });
            this.put("deviceComplianceRequired", (n) -> { currentObject.setDeviceComplianceRequired(n.getBooleanValue()); });
            this.put("dialerRestrictionLevel", (n) -> { currentObject.setDialerRestrictionLevel(n.getEnumValue(ManagedAppPhoneNumberRedirectLevel.class)); });
            this.put("disableAppPinIfDevicePinIsSet", (n) -> { currentObject.setDisableAppPinIfDevicePinIsSet(n.getBooleanValue()); });
            this.put("fingerprintBlocked", (n) -> { currentObject.setFingerprintBlocked(n.getBooleanValue()); });
            this.put("gracePeriodToBlockAppsDuringOffClockHours", (n) -> { currentObject.setGracePeriodToBlockAppsDuringOffClockHours(n.getPeriodValue()); });
            this.put("managedBrowser", (n) -> { currentObject.setManagedBrowser(n.getEnumValue(ManagedBrowserType.class)); });
            this.put("managedBrowserToOpenLinksRequired", (n) -> { currentObject.setManagedBrowserToOpenLinksRequired(n.getBooleanValue()); });
            this.put("maximumAllowedDeviceThreatLevel", (n) -> { currentObject.setMaximumAllowedDeviceThreatLevel(n.getEnumValue(ManagedAppDeviceThreatLevel.class)); });
            this.put("maximumPinRetries", (n) -> { currentObject.setMaximumPinRetries(n.getIntegerValue()); });
            this.put("maximumRequiredOsVersion", (n) -> { currentObject.setMaximumRequiredOsVersion(n.getStringValue()); });
            this.put("maximumWarningOsVersion", (n) -> { currentObject.setMaximumWarningOsVersion(n.getStringValue()); });
            this.put("maximumWipeOsVersion", (n) -> { currentObject.setMaximumWipeOsVersion(n.getStringValue()); });
            this.put("minimumPinLength", (n) -> { currentObject.setMinimumPinLength(n.getIntegerValue()); });
            this.put("minimumRequiredAppVersion", (n) -> { currentObject.setMinimumRequiredAppVersion(n.getStringValue()); });
            this.put("minimumRequiredOsVersion", (n) -> { currentObject.setMinimumRequiredOsVersion(n.getStringValue()); });
            this.put("minimumWarningAppVersion", (n) -> { currentObject.setMinimumWarningAppVersion(n.getStringValue()); });
            this.put("minimumWarningOsVersion", (n) -> { currentObject.setMinimumWarningOsVersion(n.getStringValue()); });
            this.put("minimumWipeAppVersion", (n) -> { currentObject.setMinimumWipeAppVersion(n.getStringValue()); });
            this.put("minimumWipeOsVersion", (n) -> { currentObject.setMinimumWipeOsVersion(n.getStringValue()); });
            this.put("mobileThreatDefenseRemediationAction", (n) -> { currentObject.setMobileThreatDefenseRemediationAction(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("notificationRestriction", (n) -> { currentObject.setNotificationRestriction(n.getEnumValue(ManagedAppNotificationRestriction.class)); });
            this.put("organizationalCredentialsRequired", (n) -> { currentObject.setOrganizationalCredentialsRequired(n.getBooleanValue()); });
            this.put("periodBeforePinReset", (n) -> { currentObject.setPeriodBeforePinReset(n.getPeriodValue()); });
            this.put("periodOfflineBeforeAccessCheck", (n) -> { currentObject.setPeriodOfflineBeforeAccessCheck(n.getPeriodValue()); });
            this.put("periodOfflineBeforeWipeIsEnforced", (n) -> { currentObject.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodValue()); });
            this.put("periodOnlineBeforeAccessCheck", (n) -> { currentObject.setPeriodOnlineBeforeAccessCheck(n.getPeriodValue()); });
            this.put("pinCharacterSet", (n) -> { currentObject.setPinCharacterSet(n.getEnumValue(ManagedAppPinCharacterSet.class)); });
            this.put("pinRequired", (n) -> { currentObject.setPinRequired(n.getBooleanValue()); });
            this.put("pinRequiredInsteadOfBiometricTimeout", (n) -> { currentObject.setPinRequiredInsteadOfBiometricTimeout(n.getPeriodValue()); });
            this.put("previousPinBlockCount", (n) -> { currentObject.setPreviousPinBlockCount(n.getIntegerValue()); });
            this.put("printBlocked", (n) -> { currentObject.setPrintBlocked(n.getBooleanValue()); });
            this.put("saveAsBlocked", (n) -> { currentObject.setSaveAsBlocked(n.getBooleanValue()); });
            this.put("simplePinBlocked", (n) -> { currentObject.setSimplePinBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFingerprintBlocked() {
        return this._fingerprintBlocked;
    }
    /**
     * Gets the gracePeriodToBlockAppsDuringOffClockHours property value. A grace period before blocking app access during off clock hours.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getGracePeriodToBlockAppsDuringOffClockHours() {
        return this._gracePeriodToBlockAppsDuringOffClockHours;
    }
    /**
     * Gets the managedBrowser property value. Type of managed browser
     * @return a managedBrowserType
     */
    @javax.annotation.Nullable
    public ManagedBrowserType getManagedBrowser() {
        return this._managedBrowser;
    }
    /**
     * Gets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedBrowserToOpenLinksRequired() {
        return this._managedBrowserToOpenLinksRequired;
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
     * Gets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumPinRetries() {
        return this._maximumPinRetries;
    }
    /**
     * Gets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumRequiredOsVersion() {
        return this._maximumRequiredOsVersion;
    }
    /**
     * Gets the maximumWarningOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumWarningOsVersion() {
        return this._maximumWarningOsVersion;
    }
    /**
     * Gets the maximumWipeOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumWipeOsVersion() {
        return this._maximumWipeOsVersion;
    }
    /**
     * Gets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this._minimumPinLength;
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this._minimumRequiredAppVersion;
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this._minimumRequiredOsVersion;
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this._minimumWarningAppVersion;
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this._minimumWarningOsVersion;
    }
    /**
     * Gets the minimumWipeAppVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeAppVersion() {
        return this._minimumWipeAppVersion;
    }
    /**
     * Gets the minimumWipeOsVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeOsVersion() {
        return this._minimumWipeOsVersion;
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
     * Gets the notificationRestriction property value. Restrict managed app notification
     * @return a managedAppNotificationRestriction
     */
    @javax.annotation.Nullable
    public ManagedAppNotificationRestriction getNotificationRestriction() {
        return this._notificationRestriction;
    }
    /**
     * Gets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOrganizationalCredentialsRequired() {
        return this._organizationalCredentialsRequired;
    }
    /**
     * Gets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodBeforePinReset() {
        return this._periodBeforePinReset;
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeAccessCheck() {
        return this._periodOfflineBeforeAccessCheck;
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeWipeIsEnforced() {
        return this._periodOfflineBeforeWipeIsEnforced;
    }
    /**
     * Gets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOnlineBeforeAccessCheck() {
        return this._periodOnlineBeforeAccessCheck;
    }
    /**
     * Gets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @return a managedAppPinCharacterSet
     */
    @javax.annotation.Nullable
    public ManagedAppPinCharacterSet getPinCharacterSet() {
        return this._pinCharacterSet;
    }
    /**
     * Gets the pinRequired property value. Indicates whether an app-level pin is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPinRequired() {
        return this._pinRequired;
    }
    /**
     * Gets the pinRequiredInsteadOfBiometricTimeout property value. Timeout in minutes for an app pin instead of non biometrics passcode
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPinRequiredInsteadOfBiometricTimeout() {
        return this._pinRequiredInsteadOfBiometricTimeout;
    }
    /**
     * Gets the previousPinBlockCount property value. Requires a pin to be unique from the number specified in this property.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPreviousPinBlockCount() {
        return this._previousPinBlockCount;
    }
    /**
     * Gets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this._printBlocked;
    }
    /**
     * Gets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSaveAsBlocked() {
        return this._saveAsBlocked;
    }
    /**
     * Gets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSimplePinBlocked() {
        return this._simplePinBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedDataIngestionLocations", this.getAllowedDataIngestionLocations());
        writer.writeCollectionOfPrimitiveValues("allowedDataStorageLocations", this.getAllowedDataStorageLocations());
        writer.writeEnumValue("allowedInboundDataTransferSources", this.getAllowedInboundDataTransferSources());
        writer.writeIntegerValue("allowedOutboundClipboardSharingExceptionLength", this.getAllowedOutboundClipboardSharingExceptionLength());
        writer.writeEnumValue("allowedOutboundClipboardSharingLevel", this.getAllowedOutboundClipboardSharingLevel());
        writer.writeEnumValue("allowedOutboundDataTransferDestinations", this.getAllowedOutboundDataTransferDestinations());
        writer.writeEnumValue("appActionIfDeviceComplianceRequired", this.getAppActionIfDeviceComplianceRequired());
        writer.writeEnumValue("appActionIfMaximumPinRetriesExceeded", this.getAppActionIfMaximumPinRetriesExceeded());
        writer.writeEnumValue("appActionIfUnableToAuthenticateUser", this.getAppActionIfUnableToAuthenticateUser());
        writer.writeBooleanValue("blockDataIngestionIntoOrganizationDocuments", this.getBlockDataIngestionIntoOrganizationDocuments());
        writer.writeBooleanValue("contactSyncBlocked", this.getContactSyncBlocked());
        writer.writeBooleanValue("dataBackupBlocked", this.getDataBackupBlocked());
        writer.writeBooleanValue("deviceComplianceRequired", this.getDeviceComplianceRequired());
        writer.writeEnumValue("dialerRestrictionLevel", this.getDialerRestrictionLevel());
        writer.writeBooleanValue("disableAppPinIfDevicePinIsSet", this.getDisableAppPinIfDevicePinIsSet());
        writer.writeBooleanValue("fingerprintBlocked", this.getFingerprintBlocked());
        writer.writePeriodValue("gracePeriodToBlockAppsDuringOffClockHours", this.getGracePeriodToBlockAppsDuringOffClockHours());
        writer.writeEnumValue("managedBrowser", this.getManagedBrowser());
        writer.writeBooleanValue("managedBrowserToOpenLinksRequired", this.getManagedBrowserToOpenLinksRequired());
        writer.writeEnumValue("maximumAllowedDeviceThreatLevel", this.getMaximumAllowedDeviceThreatLevel());
        writer.writeIntegerValue("maximumPinRetries", this.getMaximumPinRetries());
        writer.writeStringValue("maximumRequiredOsVersion", this.getMaximumRequiredOsVersion());
        writer.writeStringValue("maximumWarningOsVersion", this.getMaximumWarningOsVersion());
        writer.writeStringValue("maximumWipeOsVersion", this.getMaximumWipeOsVersion());
        writer.writeIntegerValue("minimumPinLength", this.getMinimumPinLength());
        writer.writeStringValue("minimumRequiredAppVersion", this.getMinimumRequiredAppVersion());
        writer.writeStringValue("minimumRequiredOsVersion", this.getMinimumRequiredOsVersion());
        writer.writeStringValue("minimumWarningAppVersion", this.getMinimumWarningAppVersion());
        writer.writeStringValue("minimumWarningOsVersion", this.getMinimumWarningOsVersion());
        writer.writeStringValue("minimumWipeAppVersion", this.getMinimumWipeAppVersion());
        writer.writeStringValue("minimumWipeOsVersion", this.getMinimumWipeOsVersion());
        writer.writeEnumValue("mobileThreatDefenseRemediationAction", this.getMobileThreatDefenseRemediationAction());
        writer.writeEnumValue("notificationRestriction", this.getNotificationRestriction());
        writer.writeBooleanValue("organizationalCredentialsRequired", this.getOrganizationalCredentialsRequired());
        writer.writePeriodValue("periodBeforePinReset", this.getPeriodBeforePinReset());
        writer.writePeriodValue("periodOfflineBeforeAccessCheck", this.getPeriodOfflineBeforeAccessCheck());
        writer.writePeriodValue("periodOfflineBeforeWipeIsEnforced", this.getPeriodOfflineBeforeWipeIsEnforced());
        writer.writePeriodValue("periodOnlineBeforeAccessCheck", this.getPeriodOnlineBeforeAccessCheck());
        writer.writeEnumValue("pinCharacterSet", this.getPinCharacterSet());
        writer.writeBooleanValue("pinRequired", this.getPinRequired());
        writer.writePeriodValue("pinRequiredInsteadOfBiometricTimeout", this.getPinRequiredInsteadOfBiometricTimeout());
        writer.writeIntegerValue("previousPinBlockCount", this.getPreviousPinBlockCount());
        writer.writeBooleanValue("printBlocked", this.getPrintBlocked());
        writer.writeBooleanValue("saveAsBlocked", this.getSaveAsBlocked());
        writer.writeBooleanValue("simplePinBlocked", this.getSimplePinBlocked());
    }
    /**
     * Sets the allowedDataIngestionLocations property value. Data storage locations where a user may store managed data.
     * @param value Value to set for the allowedDataIngestionLocations property.
     * @return a void
     */
    public void setAllowedDataIngestionLocations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedDataIngestionLocations = value;
    }
    /**
     * Sets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @param value Value to set for the allowedDataStorageLocations property.
     * @return a void
     */
    public void setAllowedDataStorageLocations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedDataStorageLocations = value;
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     * @return a void
     */
    public void setAllowedInboundDataTransferSources(@javax.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this._allowedInboundDataTransferSources = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingExceptionLength property value. Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     * @param value Value to set for the allowedOutboundClipboardSharingExceptionLength property.
     * @return a void
     */
    public void setAllowedOutboundClipboardSharingExceptionLength(@javax.annotation.Nullable final Integer value) {
        this._allowedOutboundClipboardSharingExceptionLength = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     * @return a void
     */
    public void setAllowedOutboundClipboardSharingLevel(@javax.annotation.Nullable final ManagedAppClipboardSharingLevel value) {
        this._allowedOutboundClipboardSharingLevel = value;
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     * @return a void
     */
    public void setAllowedOutboundDataTransferDestinations(@javax.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this._allowedOutboundDataTransferDestinations = value;
    }
    /**
     * Sets the appActionIfDeviceComplianceRequired property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfDeviceComplianceRequired property.
     * @return a void
     */
    public void setAppActionIfDeviceComplianceRequired(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDeviceComplianceRequired = value;
    }
    /**
     * Sets the appActionIfMaximumPinRetriesExceeded property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfMaximumPinRetriesExceeded property.
     * @return a void
     */
    public void setAppActionIfMaximumPinRetriesExceeded(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfMaximumPinRetriesExceeded = value;
    }
    /**
     * Sets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfUnableToAuthenticateUser property.
     * @return a void
     */
    public void setAppActionIfUnableToAuthenticateUser(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfUnableToAuthenticateUser = value;
    }
    /**
     * Sets the blockDataIngestionIntoOrganizationDocuments property value. Indicates whether a user can bring data into org documents.
     * @param value Value to set for the blockDataIngestionIntoOrganizationDocuments property.
     * @return a void
     */
    public void setBlockDataIngestionIntoOrganizationDocuments(@javax.annotation.Nullable final Boolean value) {
        this._blockDataIngestionIntoOrganizationDocuments = value;
    }
    /**
     * Sets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @param value Value to set for the contactSyncBlocked property.
     * @return a void
     */
    public void setContactSyncBlocked(@javax.annotation.Nullable final Boolean value) {
        this._contactSyncBlocked = value;
    }
    /**
     * Sets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @param value Value to set for the dataBackupBlocked property.
     * @return a void
     */
    public void setDataBackupBlocked(@javax.annotation.Nullable final Boolean value) {
        this._dataBackupBlocked = value;
    }
    /**
     * Sets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @param value Value to set for the deviceComplianceRequired property.
     * @return a void
     */
    public void setDeviceComplianceRequired(@javax.annotation.Nullable final Boolean value) {
        this._deviceComplianceRequired = value;
    }
    /**
     * Sets the dialerRestrictionLevel property value. The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages.
     * @param value Value to set for the dialerRestrictionLevel property.
     * @return a void
     */
    public void setDialerRestrictionLevel(@javax.annotation.Nullable final ManagedAppPhoneNumberRedirectLevel value) {
        this._dialerRestrictionLevel = value;
    }
    /**
     * Sets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @param value Value to set for the disableAppPinIfDevicePinIsSet property.
     * @return a void
     */
    public void setDisableAppPinIfDevicePinIsSet(@javax.annotation.Nullable final Boolean value) {
        this._disableAppPinIfDevicePinIsSet = value;
    }
    /**
     * Sets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the fingerprintBlocked property.
     * @return a void
     */
    public void setFingerprintBlocked(@javax.annotation.Nullable final Boolean value) {
        this._fingerprintBlocked = value;
    }
    /**
     * Sets the gracePeriodToBlockAppsDuringOffClockHours property value. A grace period before blocking app access during off clock hours.
     * @param value Value to set for the gracePeriodToBlockAppsDuringOffClockHours property.
     * @return a void
     */
    public void setGracePeriodToBlockAppsDuringOffClockHours(@javax.annotation.Nullable final Period value) {
        this._gracePeriodToBlockAppsDuringOffClockHours = value;
    }
    /**
     * Sets the managedBrowser property value. Type of managed browser
     * @param value Value to set for the managedBrowser property.
     * @return a void
     */
    public void setManagedBrowser(@javax.annotation.Nullable final ManagedBrowserType value) {
        this._managedBrowser = value;
    }
    /**
     * Sets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @param value Value to set for the managedBrowserToOpenLinksRequired property.
     * @return a void
     */
    public void setManagedBrowserToOpenLinksRequired(@javax.annotation.Nullable final Boolean value) {
        this._managedBrowserToOpenLinksRequired = value;
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
     * Sets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @param value Value to set for the maximumPinRetries property.
     * @return a void
     */
    public void setMaximumPinRetries(@javax.annotation.Nullable final Integer value) {
        this._maximumPinRetries = value;
    }
    /**
     * Sets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the maximumRequiredOsVersion property.
     * @return a void
     */
    public void setMaximumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this._maximumRequiredOsVersion = value;
    }
    /**
     * Sets the maximumWarningOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the maximumWarningOsVersion property.
     * @return a void
     */
    public void setMaximumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this._maximumWarningOsVersion = value;
    }
    /**
     * Sets the maximumWipeOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the maximumWipeOsVersion property.
     * @return a void
     */
    public void setMaximumWipeOsVersion(@javax.annotation.Nullable final String value) {
        this._maximumWipeOsVersion = value;
    }
    /**
     * Sets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @param value Value to set for the minimumPinLength property.
     * @return a void
     */
    public void setMinimumPinLength(@javax.annotation.Nullable final Integer value) {
        this._minimumPinLength = value;
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredAppVersion property.
     * @return a void
     */
    public void setMinimumRequiredAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredAppVersion = value;
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredOsVersion property.
     * @return a void
     */
    public void setMinimumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredOsVersion = value;
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @param value Value to set for the minimumWarningAppVersion property.
     * @return a void
     */
    public void setMinimumWarningAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningAppVersion = value;
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningOsVersion property.
     * @return a void
     */
    public void setMinimumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningOsVersion = value;
    }
    /**
     * Sets the minimumWipeAppVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipeAppVersion property.
     * @return a void
     */
    public void setMinimumWipeAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeAppVersion = value;
    }
    /**
     * Sets the minimumWipeOsVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipeOsVersion property.
     * @return a void
     */
    public void setMinimumWipeOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeOsVersion = value;
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
     * Sets the notificationRestriction property value. Restrict managed app notification
     * @param value Value to set for the notificationRestriction property.
     * @return a void
     */
    public void setNotificationRestriction(@javax.annotation.Nullable final ManagedAppNotificationRestriction value) {
        this._notificationRestriction = value;
    }
    /**
     * Sets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @param value Value to set for the organizationalCredentialsRequired property.
     * @return a void
     */
    public void setOrganizationalCredentialsRequired(@javax.annotation.Nullable final Boolean value) {
        this._organizationalCredentialsRequired = value;
    }
    /**
     * Sets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @param value Value to set for the periodBeforePinReset property.
     * @return a void
     */
    public void setPeriodBeforePinReset(@javax.annotation.Nullable final Period value) {
        this._periodBeforePinReset = value;
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     * @return a void
     */
    public void setPeriodOfflineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this._periodOfflineBeforeAccessCheck = value;
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     * @return a void
     */
    public void setPeriodOfflineBeforeWipeIsEnforced(@javax.annotation.Nullable final Period value) {
        this._periodOfflineBeforeWipeIsEnforced = value;
    }
    /**
     * Sets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @param value Value to set for the periodOnlineBeforeAccessCheck property.
     * @return a void
     */
    public void setPeriodOnlineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this._periodOnlineBeforeAccessCheck = value;
    }
    /**
     * Sets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @param value Value to set for the pinCharacterSet property.
     * @return a void
     */
    public void setPinCharacterSet(@javax.annotation.Nullable final ManagedAppPinCharacterSet value) {
        this._pinCharacterSet = value;
    }
    /**
     * Sets the pinRequired property value. Indicates whether an app-level pin is required.
     * @param value Value to set for the pinRequired property.
     * @return a void
     */
    public void setPinRequired(@javax.annotation.Nullable final Boolean value) {
        this._pinRequired = value;
    }
    /**
     * Sets the pinRequiredInsteadOfBiometricTimeout property value. Timeout in minutes for an app pin instead of non biometrics passcode
     * @param value Value to set for the pinRequiredInsteadOfBiometricTimeout property.
     * @return a void
     */
    public void setPinRequiredInsteadOfBiometricTimeout(@javax.annotation.Nullable final Period value) {
        this._pinRequiredInsteadOfBiometricTimeout = value;
    }
    /**
     * Sets the previousPinBlockCount property value. Requires a pin to be unique from the number specified in this property.
     * @param value Value to set for the previousPinBlockCount property.
     * @return a void
     */
    public void setPreviousPinBlockCount(@javax.annotation.Nullable final Integer value) {
        this._previousPinBlockCount = value;
    }
    /**
     * Sets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @param value Value to set for the printBlocked property.
     * @return a void
     */
    public void setPrintBlocked(@javax.annotation.Nullable final Boolean value) {
        this._printBlocked = value;
    }
    /**
     * Sets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @param value Value to set for the saveAsBlocked property.
     * @return a void
     */
    public void setSaveAsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._saveAsBlocked = value;
    }
    /**
     * Sets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @param value Value to set for the simplePinBlocked property.
     * @return a void
     */
    public void setSimplePinBlocked(@javax.annotation.Nullable final Boolean value) {
        this._simplePinBlocked = value;
    }
}

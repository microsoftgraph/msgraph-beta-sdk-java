package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings for a specified set of apps
 */
public class ManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /**
     * Data storage locations where a user may store managed data.
     */
    private java.util.List<ManagedAppDataIngestionLocation> allowedDataIngestionLocations;
    /**
     * Data storage locations where a user may store managed data.
     */
    private java.util.List<ManagedAppDataStorageLocation> allowedDataStorageLocations;
    /**
     * Data can be transferred from/to these classes of apps
     */
    private ManagedAppDataTransferLevel allowedInboundDataTransferSources;
    /**
     * Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     */
    private Integer allowedOutboundClipboardSharingExceptionLength;
    /**
     * Represents the level to which the device's clipboard may be shared between apps
     */
    private ManagedAppClipboardSharingLevel allowedOutboundClipboardSharingLevel;
    /**
     * Data can be transferred from/to these classes of apps
     */
    private ManagedAppDataTransferLevel allowedOutboundDataTransferDestinations;
    /**
     * An admin initiated action to be applied on a managed app.
     */
    private ManagedAppRemediationAction appActionIfDeviceComplianceRequired;
    /**
     * An admin initiated action to be applied on a managed app.
     */
    private ManagedAppRemediationAction appActionIfMaximumPinRetriesExceeded;
    /**
     * If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: block, wipe, warn.
     */
    private ManagedAppRemediationAction appActionIfUnableToAuthenticateUser;
    /**
     * Indicates whether a user can bring data into org documents.
     */
    private Boolean blockDataIngestionIntoOrganizationDocuments;
    /**
     * Indicates whether contacts can be synced to the user's device.
     */
    private Boolean contactSyncBlocked;
    /**
     * Indicates whether the backup of a managed app's data is blocked.
     */
    private Boolean dataBackupBlocked;
    /**
     * Indicates whether device compliance is required.
     */
    private Boolean deviceComplianceRequired;
    /**
     * The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages.
     */
    private ManagedAppPhoneNumberRedirectLevel dialerRestrictionLevel;
    /**
     * Indicates whether use of the app pin is required if the device pin is set.
     */
    private Boolean disableAppPinIfDevicePinIsSet;
    /**
     * Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     */
    private Boolean fingerprintBlocked;
    /**
     * A grace period before blocking app access during off clock hours.
     */
    private PeriodAndDuration gracePeriodToBlockAppsDuringOffClockHours;
    /**
     * Type of managed browser
     */
    private ManagedBrowserType managedBrowser;
    /**
     * Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     */
    private Boolean managedBrowserToOpenLinksRequired;
    /**
     * The maxium threat level allowed for an app to be compliant.
     */
    private ManagedAppDeviceThreatLevel maximumAllowedDeviceThreatLevel;
    /**
     * Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     */
    private Integer maximumPinRetries;
    /**
     * Versions bigger than the specified version will block the managed app from accessing company data.
     */
    private String maximumRequiredOsVersion;
    /**
     * Versions bigger than the specified version will block the managed app from accessing company data.
     */
    private String maximumWarningOsVersion;
    /**
     * Versions bigger than the specified version will block the managed app from accessing company data.
     */
    private String maximumWipeOsVersion;
    /**
     * Minimum pin length required for an app-level pin if PinRequired is set to True
     */
    private Integer minimumPinLength;
    /**
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    private String minimumRequiredAppVersion;
    /**
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    private String minimumRequiredOsVersion;
    /**
     * Versions less than the specified version will result in warning message on the managed app.
     */
    private String minimumWarningAppVersion;
    /**
     * Versions less than the specified version will result in warning message on the managed app from accessing company data.
     */
    private String minimumWarningOsVersion;
    /**
     * Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     */
    private String minimumWipeAppVersion;
    /**
     * Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     */
    private String minimumWipeOsVersion;
    /**
     * Indicates how to prioritize which Mobile Threat Defense (MTD) partner is enabled for a given platform, when more than one is enabled. An app can only be actively using a single Mobile Threat Defense partner. When NULL, Microsoft Defender will be given preference. Otherwise setting the value to defenderOverThirdPartyPartner or thirdPartyPartnerOverDefender will make explicit which partner to prioritize. Possible values are: null, defenderOverThirdPartyPartner, thirdPartyPartnerOverDefender and unknownFutureValue. Default value is null. Possible values are: defenderOverThirdPartyPartner, thirdPartyPartnerOverDefender, unknownFutureValue.
     */
    private MobileThreatDefensePartnerPriority mobileThreatDefensePartnerPriority;
    /**
     * An admin initiated action to be applied on a managed app.
     */
    private ManagedAppRemediationAction mobileThreatDefenseRemediationAction;
    /**
     * Restrict managed app notification
     */
    private ManagedAppNotificationRestriction notificationRestriction;
    /**
     * Indicates whether organizational credentials are required for app use.
     */
    private Boolean organizationalCredentialsRequired;
    /**
     * TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     */
    private PeriodAndDuration periodBeforePinReset;
    /**
     * The period after which access is checked when the device is not connected to the internet.
     */
    private PeriodAndDuration periodOfflineBeforeAccessCheck;
    /**
     * The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     */
    private PeriodAndDuration periodOfflineBeforeWipeIsEnforced;
    /**
     * The period after which access is checked when the device is connected to the internet.
     */
    private PeriodAndDuration periodOnlineBeforeAccessCheck;
    /**
     * Character set which is to be used for a user's app PIN
     */
    private ManagedAppPinCharacterSet pinCharacterSet;
    /**
     * Indicates whether an app-level pin is required.
     */
    private Boolean pinRequired;
    /**
     * Timeout in minutes for an app pin instead of non biometrics passcode
     */
    private PeriodAndDuration pinRequiredInsteadOfBiometricTimeout;
    /**
     * Requires a pin to be unique from the number specified in this property.
     */
    private Integer previousPinBlockCount;
    /**
     * Indicates whether printing is allowed from managed apps.
     */
    private Boolean printBlocked;
    /**
     * Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     */
    private Boolean saveAsBlocked;
    /**
     * Indicates whether simplePin is blocked.
     */
    private Boolean simplePinBlocked;
    /**
     * Instantiates a new managedAppProtection and sets the default values.
     */
    public ManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.managedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a managedAppDataIngestionLocation
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppDataIngestionLocation> getAllowedDataIngestionLocations() {
        return this.allowedDataIngestionLocations;
    }
    /**
     * Gets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @return a managedAppDataStorageLocation
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppDataStorageLocation> getAllowedDataStorageLocations() {
        return this.allowedDataStorageLocations;
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a managedAppDataTransferLevel
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this.allowedInboundDataTransferSources;
    }
    /**
     * Gets the allowedOutboundClipboardSharingExceptionLength property value. Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAllowedOutboundClipboardSharingExceptionLength() {
        return this.allowedOutboundClipboardSharingExceptionLength;
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a managedAppClipboardSharingLevel
     */
    @jakarta.annotation.Nullable
    public ManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this.allowedOutboundClipboardSharingLevel;
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a managedAppDataTransferLevel
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this.allowedOutboundDataTransferDestinations;
    }
    /**
     * Gets the appActionIfDeviceComplianceRequired property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDeviceComplianceRequired() {
        return this.appActionIfDeviceComplianceRequired;
    }
    /**
     * Gets the appActionIfMaximumPinRetriesExceeded property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfMaximumPinRetriesExceeded() {
        return this.appActionIfMaximumPinRetriesExceeded;
    }
    /**
     * Gets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfUnableToAuthenticateUser() {
        return this.appActionIfUnableToAuthenticateUser;
    }
    /**
     * Gets the blockDataIngestionIntoOrganizationDocuments property value. Indicates whether a user can bring data into org documents.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDataIngestionIntoOrganizationDocuments() {
        return this.blockDataIngestionIntoOrganizationDocuments;
    }
    /**
     * Gets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContactSyncBlocked() {
        return this.contactSyncBlocked;
    }
    /**
     * Gets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDataBackupBlocked() {
        return this.dataBackupBlocked;
    }
    /**
     * Gets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceComplianceRequired() {
        return this.deviceComplianceRequired;
    }
    /**
     * Gets the dialerRestrictionLevel property value. The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages.
     * @return a managedAppPhoneNumberRedirectLevel
     */
    @jakarta.annotation.Nullable
    public ManagedAppPhoneNumberRedirectLevel getDialerRestrictionLevel() {
        return this.dialerRestrictionLevel;
    }
    /**
     * Gets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAppPinIfDevicePinIsSet() {
        return this.disableAppPinIfDevicePinIsSet;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedDataIngestionLocations", (n) -> { this.setAllowedDataIngestionLocations(n.getCollectionOfEnumValues(ManagedAppDataIngestionLocation.class)); });
        deserializerMap.put("allowedDataStorageLocations", (n) -> { this.setAllowedDataStorageLocations(n.getCollectionOfEnumValues(ManagedAppDataStorageLocation.class)); });
        deserializerMap.put("allowedInboundDataTransferSources", (n) -> { this.setAllowedInboundDataTransferSources(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
        deserializerMap.put("allowedOutboundClipboardSharingExceptionLength", (n) -> { this.setAllowedOutboundClipboardSharingExceptionLength(n.getIntegerValue()); });
        deserializerMap.put("allowedOutboundClipboardSharingLevel", (n) -> { this.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(ManagedAppClipboardSharingLevel.class)); });
        deserializerMap.put("allowedOutboundDataTransferDestinations", (n) -> { this.setAllowedOutboundDataTransferDestinations(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
        deserializerMap.put("appActionIfDeviceComplianceRequired", (n) -> { this.setAppActionIfDeviceComplianceRequired(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfMaximumPinRetriesExceeded", (n) -> { this.setAppActionIfMaximumPinRetriesExceeded(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfUnableToAuthenticateUser", (n) -> { this.setAppActionIfUnableToAuthenticateUser(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("blockDataIngestionIntoOrganizationDocuments", (n) -> { this.setBlockDataIngestionIntoOrganizationDocuments(n.getBooleanValue()); });
        deserializerMap.put("contactSyncBlocked", (n) -> { this.setContactSyncBlocked(n.getBooleanValue()); });
        deserializerMap.put("dataBackupBlocked", (n) -> { this.setDataBackupBlocked(n.getBooleanValue()); });
        deserializerMap.put("deviceComplianceRequired", (n) -> { this.setDeviceComplianceRequired(n.getBooleanValue()); });
        deserializerMap.put("dialerRestrictionLevel", (n) -> { this.setDialerRestrictionLevel(n.getEnumValue(ManagedAppPhoneNumberRedirectLevel.class)); });
        deserializerMap.put("disableAppPinIfDevicePinIsSet", (n) -> { this.setDisableAppPinIfDevicePinIsSet(n.getBooleanValue()); });
        deserializerMap.put("fingerprintBlocked", (n) -> { this.setFingerprintBlocked(n.getBooleanValue()); });
        deserializerMap.put("gracePeriodToBlockAppsDuringOffClockHours", (n) -> { this.setGracePeriodToBlockAppsDuringOffClockHours(n.getPeriodAndDurationValue()); });
        deserializerMap.put("managedBrowser", (n) -> { this.setManagedBrowser(n.getEnumValue(ManagedBrowserType.class)); });
        deserializerMap.put("managedBrowserToOpenLinksRequired", (n) -> { this.setManagedBrowserToOpenLinksRequired(n.getBooleanValue()); });
        deserializerMap.put("maximumAllowedDeviceThreatLevel", (n) -> { this.setMaximumAllowedDeviceThreatLevel(n.getEnumValue(ManagedAppDeviceThreatLevel.class)); });
        deserializerMap.put("maximumPinRetries", (n) -> { this.setMaximumPinRetries(n.getIntegerValue()); });
        deserializerMap.put("maximumRequiredOsVersion", (n) -> { this.setMaximumRequiredOsVersion(n.getStringValue()); });
        deserializerMap.put("maximumWarningOsVersion", (n) -> { this.setMaximumWarningOsVersion(n.getStringValue()); });
        deserializerMap.put("maximumWipeOsVersion", (n) -> { this.setMaximumWipeOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumPinLength", (n) -> { this.setMinimumPinLength(n.getIntegerValue()); });
        deserializerMap.put("minimumRequiredAppVersion", (n) -> { this.setMinimumRequiredAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredOsVersion", (n) -> { this.setMinimumRequiredOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningAppVersion", (n) -> { this.setMinimumWarningAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningOsVersion", (n) -> { this.setMinimumWarningOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeAppVersion", (n) -> { this.setMinimumWipeAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeOsVersion", (n) -> { this.setMinimumWipeOsVersion(n.getStringValue()); });
        deserializerMap.put("mobileThreatDefensePartnerPriority", (n) -> { this.setMobileThreatDefensePartnerPriority(n.getEnumValue(MobileThreatDefensePartnerPriority.class)); });
        deserializerMap.put("mobileThreatDefenseRemediationAction", (n) -> { this.setMobileThreatDefenseRemediationAction(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("notificationRestriction", (n) -> { this.setNotificationRestriction(n.getEnumValue(ManagedAppNotificationRestriction.class)); });
        deserializerMap.put("organizationalCredentialsRequired", (n) -> { this.setOrganizationalCredentialsRequired(n.getBooleanValue()); });
        deserializerMap.put("periodBeforePinReset", (n) -> { this.setPeriodBeforePinReset(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOfflineBeforeAccessCheck", (n) -> { this.setPeriodOfflineBeforeAccessCheck(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOfflineBeforeWipeIsEnforced", (n) -> { this.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOnlineBeforeAccessCheck", (n) -> { this.setPeriodOnlineBeforeAccessCheck(n.getPeriodAndDurationValue()); });
        deserializerMap.put("pinCharacterSet", (n) -> { this.setPinCharacterSet(n.getEnumValue(ManagedAppPinCharacterSet.class)); });
        deserializerMap.put("pinRequired", (n) -> { this.setPinRequired(n.getBooleanValue()); });
        deserializerMap.put("pinRequiredInsteadOfBiometricTimeout", (n) -> { this.setPinRequiredInsteadOfBiometricTimeout(n.getPeriodAndDurationValue()); });
        deserializerMap.put("previousPinBlockCount", (n) -> { this.setPreviousPinBlockCount(n.getIntegerValue()); });
        deserializerMap.put("printBlocked", (n) -> { this.setPrintBlocked(n.getBooleanValue()); });
        deserializerMap.put("saveAsBlocked", (n) -> { this.setSaveAsBlocked(n.getBooleanValue()); });
        deserializerMap.put("simplePinBlocked", (n) -> { this.setSimplePinBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFingerprintBlocked() {
        return this.fingerprintBlocked;
    }
    /**
     * Gets the gracePeriodToBlockAppsDuringOffClockHours property value. A grace period before blocking app access during off clock hours.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getGracePeriodToBlockAppsDuringOffClockHours() {
        return this.gracePeriodToBlockAppsDuringOffClockHours;
    }
    /**
     * Gets the managedBrowser property value. Type of managed browser
     * @return a managedBrowserType
     */
    @jakarta.annotation.Nullable
    public ManagedBrowserType getManagedBrowser() {
        return this.managedBrowser;
    }
    /**
     * Gets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedBrowserToOpenLinksRequired() {
        return this.managedBrowserToOpenLinksRequired;
    }
    /**
     * Gets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @return a managedAppDeviceThreatLevel
     */
    @jakarta.annotation.Nullable
    public ManagedAppDeviceThreatLevel getMaximumAllowedDeviceThreatLevel() {
        return this.maximumAllowedDeviceThreatLevel;
    }
    /**
     * Gets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumPinRetries() {
        return this.maximumPinRetries;
    }
    /**
     * Gets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMaximumRequiredOsVersion() {
        return this.maximumRequiredOsVersion;
    }
    /**
     * Gets the maximumWarningOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMaximumWarningOsVersion() {
        return this.maximumWarningOsVersion;
    }
    /**
     * Gets the maximumWipeOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMaximumWipeOsVersion() {
        return this.maximumWipeOsVersion;
    }
    /**
     * Gets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this.minimumPinLength;
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this.minimumRequiredAppVersion;
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this.minimumRequiredOsVersion;
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this.minimumWarningAppVersion;
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this.minimumWarningOsVersion;
    }
    /**
     * Gets the minimumWipeAppVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeAppVersion() {
        return this.minimumWipeAppVersion;
    }
    /**
     * Gets the minimumWipeOsVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeOsVersion() {
        return this.minimumWipeOsVersion;
    }
    /**
     * Gets the mobileThreatDefensePartnerPriority property value. Indicates how to prioritize which Mobile Threat Defense (MTD) partner is enabled for a given platform, when more than one is enabled. An app can only be actively using a single Mobile Threat Defense partner. When NULL, Microsoft Defender will be given preference. Otherwise setting the value to defenderOverThirdPartyPartner or thirdPartyPartnerOverDefender will make explicit which partner to prioritize. Possible values are: null, defenderOverThirdPartyPartner, thirdPartyPartnerOverDefender and unknownFutureValue. Default value is null. Possible values are: defenderOverThirdPartyPartner, thirdPartyPartnerOverDefender, unknownFutureValue.
     * @return a mobileThreatDefensePartnerPriority
     */
    @jakarta.annotation.Nullable
    public MobileThreatDefensePartnerPriority getMobileThreatDefensePartnerPriority() {
        return this.mobileThreatDefensePartnerPriority;
    }
    /**
     * Gets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getMobileThreatDefenseRemediationAction() {
        return this.mobileThreatDefenseRemediationAction;
    }
    /**
     * Gets the notificationRestriction property value. Restrict managed app notification
     * @return a managedAppNotificationRestriction
     */
    @jakarta.annotation.Nullable
    public ManagedAppNotificationRestriction getNotificationRestriction() {
        return this.notificationRestriction;
    }
    /**
     * Gets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOrganizationalCredentialsRequired() {
        return this.organizationalCredentialsRequired;
    }
    /**
     * Gets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodBeforePinReset() {
        return this.periodBeforePinReset;
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOfflineBeforeAccessCheck() {
        return this.periodOfflineBeforeAccessCheck;
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOfflineBeforeWipeIsEnforced() {
        return this.periodOfflineBeforeWipeIsEnforced;
    }
    /**
     * Gets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOnlineBeforeAccessCheck() {
        return this.periodOnlineBeforeAccessCheck;
    }
    /**
     * Gets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @return a managedAppPinCharacterSet
     */
    @jakarta.annotation.Nullable
    public ManagedAppPinCharacterSet getPinCharacterSet() {
        return this.pinCharacterSet;
    }
    /**
     * Gets the pinRequired property value. Indicates whether an app-level pin is required.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPinRequired() {
        return this.pinRequired;
    }
    /**
     * Gets the pinRequiredInsteadOfBiometricTimeout property value. Timeout in minutes for an app pin instead of non biometrics passcode
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPinRequiredInsteadOfBiometricTimeout() {
        return this.pinRequiredInsteadOfBiometricTimeout;
    }
    /**
     * Gets the previousPinBlockCount property value. Requires a pin to be unique from the number specified in this property.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPreviousPinBlockCount() {
        return this.previousPinBlockCount;
    }
    /**
     * Gets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this.printBlocked;
    }
    /**
     * Gets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSaveAsBlocked() {
        return this.saveAsBlocked;
    }
    /**
     * Gets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSimplePinBlocked() {
        return this.simplePinBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("allowedDataIngestionLocations", this.getAllowedDataIngestionLocations());
        writer.writeCollectionOfEnumValues("allowedDataStorageLocations", this.getAllowedDataStorageLocations());
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
        writer.writePeriodAndDurationValue("gracePeriodToBlockAppsDuringOffClockHours", this.getGracePeriodToBlockAppsDuringOffClockHours());
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
        writer.writeEnumValue("mobileThreatDefensePartnerPriority", this.getMobileThreatDefensePartnerPriority());
        writer.writeEnumValue("mobileThreatDefenseRemediationAction", this.getMobileThreatDefenseRemediationAction());
        writer.writeEnumValue("notificationRestriction", this.getNotificationRestriction());
        writer.writeBooleanValue("organizationalCredentialsRequired", this.getOrganizationalCredentialsRequired());
        writer.writePeriodAndDurationValue("periodBeforePinReset", this.getPeriodBeforePinReset());
        writer.writePeriodAndDurationValue("periodOfflineBeforeAccessCheck", this.getPeriodOfflineBeforeAccessCheck());
        writer.writePeriodAndDurationValue("periodOfflineBeforeWipeIsEnforced", this.getPeriodOfflineBeforeWipeIsEnforced());
        writer.writePeriodAndDurationValue("periodOnlineBeforeAccessCheck", this.getPeriodOnlineBeforeAccessCheck());
        writer.writeEnumValue("pinCharacterSet", this.getPinCharacterSet());
        writer.writeBooleanValue("pinRequired", this.getPinRequired());
        writer.writePeriodAndDurationValue("pinRequiredInsteadOfBiometricTimeout", this.getPinRequiredInsteadOfBiometricTimeout());
        writer.writeIntegerValue("previousPinBlockCount", this.getPreviousPinBlockCount());
        writer.writeBooleanValue("printBlocked", this.getPrintBlocked());
        writer.writeBooleanValue("saveAsBlocked", this.getSaveAsBlocked());
        writer.writeBooleanValue("simplePinBlocked", this.getSimplePinBlocked());
    }
    /**
     * Sets the allowedDataIngestionLocations property value. Data storage locations where a user may store managed data.
     * @param value Value to set for the allowedDataIngestionLocations property.
     */
    public void setAllowedDataIngestionLocations(@jakarta.annotation.Nullable final java.util.List<ManagedAppDataIngestionLocation> value) {
        this.allowedDataIngestionLocations = value;
    }
    /**
     * Sets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @param value Value to set for the allowedDataStorageLocations property.
     */
    public void setAllowedDataStorageLocations(@jakarta.annotation.Nullable final java.util.List<ManagedAppDataStorageLocation> value) {
        this.allowedDataStorageLocations = value;
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     */
    public void setAllowedInboundDataTransferSources(@jakarta.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this.allowedInboundDataTransferSources = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingExceptionLength property value. Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     * @param value Value to set for the allowedOutboundClipboardSharingExceptionLength property.
     */
    public void setAllowedOutboundClipboardSharingExceptionLength(@jakarta.annotation.Nullable final Integer value) {
        this.allowedOutboundClipboardSharingExceptionLength = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     */
    public void setAllowedOutboundClipboardSharingLevel(@jakarta.annotation.Nullable final ManagedAppClipboardSharingLevel value) {
        this.allowedOutboundClipboardSharingLevel = value;
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     */
    public void setAllowedOutboundDataTransferDestinations(@jakarta.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this.allowedOutboundDataTransferDestinations = value;
    }
    /**
     * Sets the appActionIfDeviceComplianceRequired property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfDeviceComplianceRequired property.
     */
    public void setAppActionIfDeviceComplianceRequired(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.appActionIfDeviceComplianceRequired = value;
    }
    /**
     * Sets the appActionIfMaximumPinRetriesExceeded property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfMaximumPinRetriesExceeded property.
     */
    public void setAppActionIfMaximumPinRetriesExceeded(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.appActionIfMaximumPinRetriesExceeded = value;
    }
    /**
     * Sets the appActionIfUnableToAuthenticateUser property value. If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfUnableToAuthenticateUser property.
     */
    public void setAppActionIfUnableToAuthenticateUser(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.appActionIfUnableToAuthenticateUser = value;
    }
    /**
     * Sets the blockDataIngestionIntoOrganizationDocuments property value. Indicates whether a user can bring data into org documents.
     * @param value Value to set for the blockDataIngestionIntoOrganizationDocuments property.
     */
    public void setBlockDataIngestionIntoOrganizationDocuments(@jakarta.annotation.Nullable final Boolean value) {
        this.blockDataIngestionIntoOrganizationDocuments = value;
    }
    /**
     * Sets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @param value Value to set for the contactSyncBlocked property.
     */
    public void setContactSyncBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.contactSyncBlocked = value;
    }
    /**
     * Sets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @param value Value to set for the dataBackupBlocked property.
     */
    public void setDataBackupBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.dataBackupBlocked = value;
    }
    /**
     * Sets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @param value Value to set for the deviceComplianceRequired property.
     */
    public void setDeviceComplianceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.deviceComplianceRequired = value;
    }
    /**
     * Sets the dialerRestrictionLevel property value. The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages.
     * @param value Value to set for the dialerRestrictionLevel property.
     */
    public void setDialerRestrictionLevel(@jakarta.annotation.Nullable final ManagedAppPhoneNumberRedirectLevel value) {
        this.dialerRestrictionLevel = value;
    }
    /**
     * Sets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @param value Value to set for the disableAppPinIfDevicePinIsSet property.
     */
    public void setDisableAppPinIfDevicePinIsSet(@jakarta.annotation.Nullable final Boolean value) {
        this.disableAppPinIfDevicePinIsSet = value;
    }
    /**
     * Sets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the fingerprintBlocked property.
     */
    public void setFingerprintBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.fingerprintBlocked = value;
    }
    /**
     * Sets the gracePeriodToBlockAppsDuringOffClockHours property value. A grace period before blocking app access during off clock hours.
     * @param value Value to set for the gracePeriodToBlockAppsDuringOffClockHours property.
     */
    public void setGracePeriodToBlockAppsDuringOffClockHours(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.gracePeriodToBlockAppsDuringOffClockHours = value;
    }
    /**
     * Sets the managedBrowser property value. Type of managed browser
     * @param value Value to set for the managedBrowser property.
     */
    public void setManagedBrowser(@jakarta.annotation.Nullable final ManagedBrowserType value) {
        this.managedBrowser = value;
    }
    /**
     * Sets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @param value Value to set for the managedBrowserToOpenLinksRequired property.
     */
    public void setManagedBrowserToOpenLinksRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.managedBrowserToOpenLinksRequired = value;
    }
    /**
     * Sets the maximumAllowedDeviceThreatLevel property value. The maxium threat level allowed for an app to be compliant.
     * @param value Value to set for the maximumAllowedDeviceThreatLevel property.
     */
    public void setMaximumAllowedDeviceThreatLevel(@jakarta.annotation.Nullable final ManagedAppDeviceThreatLevel value) {
        this.maximumAllowedDeviceThreatLevel = value;
    }
    /**
     * Sets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @param value Value to set for the maximumPinRetries property.
     */
    public void setMaximumPinRetries(@jakarta.annotation.Nullable final Integer value) {
        this.maximumPinRetries = value;
    }
    /**
     * Sets the maximumRequiredOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the maximumRequiredOsVersion property.
     */
    public void setMaximumRequiredOsVersion(@jakarta.annotation.Nullable final String value) {
        this.maximumRequiredOsVersion = value;
    }
    /**
     * Sets the maximumWarningOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the maximumWarningOsVersion property.
     */
    public void setMaximumWarningOsVersion(@jakarta.annotation.Nullable final String value) {
        this.maximumWarningOsVersion = value;
    }
    /**
     * Sets the maximumWipeOsVersion property value. Versions bigger than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the maximumWipeOsVersion property.
     */
    public void setMaximumWipeOsVersion(@jakarta.annotation.Nullable final String value) {
        this.maximumWipeOsVersion = value;
    }
    /**
     * Sets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @param value Value to set for the minimumPinLength property.
     */
    public void setMinimumPinLength(@jakarta.annotation.Nullable final Integer value) {
        this.minimumPinLength = value;
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredAppVersion property.
     */
    public void setMinimumRequiredAppVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumRequiredAppVersion = value;
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredOsVersion property.
     */
    public void setMinimumRequiredOsVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumRequiredOsVersion = value;
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @param value Value to set for the minimumWarningAppVersion property.
     */
    public void setMinimumWarningAppVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWarningAppVersion = value;
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningOsVersion property.
     */
    public void setMinimumWarningOsVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWarningOsVersion = value;
    }
    /**
     * Sets the minimumWipeAppVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipeAppVersion property.
     */
    public void setMinimumWipeAppVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWipeAppVersion = value;
    }
    /**
     * Sets the minimumWipeOsVersion property value. Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipeOsVersion property.
     */
    public void setMinimumWipeOsVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumWipeOsVersion = value;
    }
    /**
     * Sets the mobileThreatDefensePartnerPriority property value. Indicates how to prioritize which Mobile Threat Defense (MTD) partner is enabled for a given platform, when more than one is enabled. An app can only be actively using a single Mobile Threat Defense partner. When NULL, Microsoft Defender will be given preference. Otherwise setting the value to defenderOverThirdPartyPartner or thirdPartyPartnerOverDefender will make explicit which partner to prioritize. Possible values are: null, defenderOverThirdPartyPartner, thirdPartyPartnerOverDefender and unknownFutureValue. Default value is null. Possible values are: defenderOverThirdPartyPartner, thirdPartyPartnerOverDefender, unknownFutureValue.
     * @param value Value to set for the mobileThreatDefensePartnerPriority property.
     */
    public void setMobileThreatDefensePartnerPriority(@jakarta.annotation.Nullable final MobileThreatDefensePartnerPriority value) {
        this.mobileThreatDefensePartnerPriority = value;
    }
    /**
     * Sets the mobileThreatDefenseRemediationAction property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the mobileThreatDefenseRemediationAction property.
     */
    public void setMobileThreatDefenseRemediationAction(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.mobileThreatDefenseRemediationAction = value;
    }
    /**
     * Sets the notificationRestriction property value. Restrict managed app notification
     * @param value Value to set for the notificationRestriction property.
     */
    public void setNotificationRestriction(@jakarta.annotation.Nullable final ManagedAppNotificationRestriction value) {
        this.notificationRestriction = value;
    }
    /**
     * Sets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @param value Value to set for the organizationalCredentialsRequired property.
     */
    public void setOrganizationalCredentialsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.organizationalCredentialsRequired = value;
    }
    /**
     * Sets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @param value Value to set for the periodBeforePinReset property.
     */
    public void setPeriodBeforePinReset(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.periodBeforePinReset = value;
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     */
    public void setPeriodOfflineBeforeAccessCheck(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.periodOfflineBeforeAccessCheck = value;
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     */
    public void setPeriodOfflineBeforeWipeIsEnforced(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.periodOfflineBeforeWipeIsEnforced = value;
    }
    /**
     * Sets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @param value Value to set for the periodOnlineBeforeAccessCheck property.
     */
    public void setPeriodOnlineBeforeAccessCheck(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.periodOnlineBeforeAccessCheck = value;
    }
    /**
     * Sets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @param value Value to set for the pinCharacterSet property.
     */
    public void setPinCharacterSet(@jakarta.annotation.Nullable final ManagedAppPinCharacterSet value) {
        this.pinCharacterSet = value;
    }
    /**
     * Sets the pinRequired property value. Indicates whether an app-level pin is required.
     * @param value Value to set for the pinRequired property.
     */
    public void setPinRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.pinRequired = value;
    }
    /**
     * Sets the pinRequiredInsteadOfBiometricTimeout property value. Timeout in minutes for an app pin instead of non biometrics passcode
     * @param value Value to set for the pinRequiredInsteadOfBiometricTimeout property.
     */
    public void setPinRequiredInsteadOfBiometricTimeout(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.pinRequiredInsteadOfBiometricTimeout = value;
    }
    /**
     * Sets the previousPinBlockCount property value. Requires a pin to be unique from the number specified in this property.
     * @param value Value to set for the previousPinBlockCount property.
     */
    public void setPreviousPinBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.previousPinBlockCount = value;
    }
    /**
     * Sets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @param value Value to set for the printBlocked property.
     */
    public void setPrintBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.printBlocked = value;
    }
    /**
     * Sets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @param value Value to set for the saveAsBlocked property.
     */
    public void setSaveAsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.saveAsBlocked = value;
    }
    /**
     * Sets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @param value Value to set for the simplePinBlocked property.
     */
    public void setSimplePinBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.simplePinBlocked = value;
    }
}

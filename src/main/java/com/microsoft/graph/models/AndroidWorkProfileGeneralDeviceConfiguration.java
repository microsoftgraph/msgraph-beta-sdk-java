package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Work Profile general device configuration.
 */
public class AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Determine domains allow-list for accounts that can be added to work profile.
     */
    private java.util.List<String> allowedGoogleAccountDomains;
    /**
     * Prevent using unified password for unlocking device and work profile.
     */
    private Boolean blockUnifiedPasswordForWorkProfile;
    /**
     * Indicates whether or not to block face unlock.
     */
    private Boolean passwordBlockFaceUnlock;
    /**
     * Indicates whether or not to block fingerprint unlock.
     */
    private Boolean passwordBlockFingerprintUnlock;
    /**
     * Indicates whether or not to block iris unlock.
     */
    private Boolean passwordBlockIrisUnlock;
    /**
     * Indicates whether or not to block Smart Lock and other trust agents.
     */
    private Boolean passwordBlockTrustAgents;
    /**
     * Number of days before the password expires. Valid values 1 to 365
     */
    private Integer passwordExpirationDays;
    /**
     * Minimum length of passwords. Valid values 4 to 16
     */
    private Integer passwordMinimumLength;
    /**
     * Minutes of inactivity before the screen times out.
     */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * Number of previous passwords to block. Valid values 0 to 24
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Android Work Profile required password type.
     */
    private AndroidWorkProfileRequiredPasswordType passwordRequiredType;
    /**
     * Number of sign in failures allowed before factory reset. Valid values 1 to 16
     */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /**
     * The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     */
    private AndroidRequiredPasswordComplexity requiredPasswordComplexity;
    /**
     * Require the Android Verify apps feature is turned on.
     */
    private Boolean securityRequireVerifyApps;
    /**
     * Enable lockdown mode for always-on VPN.
     */
    private String vpnAlwaysOnPackageIdentifier;
    /**
     * Enable lockdown mode for always-on VPN.
     */
    private Boolean vpnEnableAlwaysOnLockdownMode;
    /**
     * An enum representing possible values for account use in work profile.
     */
    private AndroidWorkProfileAccountUse workProfileAccountUse;
    /**
     * Indicates whether to allow installation of apps from unknown sources.
     */
    private Boolean workProfileAllowAppInstallsFromUnknownSources;
    /**
     * Allow widgets from work profile apps.
     */
    private Boolean workProfileAllowWidgets;
    /**
     * Block users from adding/removing accounts in work profile.
     */
    private Boolean workProfileBlockAddingAccounts;
    /**
     * Block work profile camera.
     */
    private Boolean workProfileBlockCamera;
    /**
     * Block display work profile caller ID in personal profile.
     */
    private Boolean workProfileBlockCrossProfileCallerId;
    /**
     * Block work profile contacts availability in personal profile.
     */
    private Boolean workProfileBlockCrossProfileContactsSearch;
    /**
     * Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     */
    private Boolean workProfileBlockCrossProfileCopyPaste;
    /**
     * Indicates whether or not to block notifications while device locked.
     */
    private Boolean workProfileBlockNotificationsWhileDeviceLocked;
    /**
     * Prevent app installations from unknown sources in the personal profile.
     */
    private Boolean workProfileBlockPersonalAppInstallsFromUnknownSources;
    /**
     * Block screen capture in work profile.
     */
    private Boolean workProfileBlockScreenCapture;
    /**
     * Allow bluetooth devices to access enterprise contacts.
     */
    private Boolean workProfileBluetoothEnableContactSharing;
    /**
     * Android Work Profile cross profile data sharing type.
     */
    private AndroidWorkProfileCrossProfileDataSharingType workProfileDataSharingType;
    /**
     * Android Work Profile default app permission policy type.
     */
    private AndroidWorkProfileDefaultAppPermissionPolicyType workProfileDefaultAppPermissionPolicy;
    /**
     * Indicates whether or not to block face unlock for work profile.
     */
    private Boolean workProfilePasswordBlockFaceUnlock;
    /**
     * Indicates whether or not to block fingerprint unlock for work profile.
     */
    private Boolean workProfilePasswordBlockFingerprintUnlock;
    /**
     * Indicates whether or not to block iris unlock for work profile.
     */
    private Boolean workProfilePasswordBlockIrisUnlock;
    /**
     * Indicates whether or not to block Smart Lock and other trust agents for work profile.
     */
    private Boolean workProfilePasswordBlockTrustAgents;
    /**
     * Number of days before the work profile password expires. Valid values 1 to 365
     */
    private Integer workProfilePasswordExpirationDays;
    /**
     * Minimum length of work profile password. Valid values 4 to 16
     */
    private Integer workProfilePasswordMinimumLength;
    /**
     * Minimum # of letter characters required in work profile password. Valid values 1 to 10
     */
    private Integer workProfilePasswordMinLetterCharacters;
    /**
     * Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     */
    private Integer workProfilePasswordMinLowerCaseCharacters;
    /**
     * Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     */
    private Integer workProfilePasswordMinNonLetterCharacters;
    /**
     * Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     */
    private Integer workProfilePasswordMinNumericCharacters;
    /**
     * Minimum # of symbols required in work profile password. Valid values 1 to 10
     */
    private Integer workProfilePasswordMinSymbolCharacters;
    /**
     * Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     */
    private Integer workProfilePasswordMinUpperCaseCharacters;
    /**
     * Minutes of inactivity before the screen times out.
     */
    private Integer workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * Number of previous work profile passwords to block. Valid values 0 to 24
     */
    private Integer workProfilePasswordPreviousPasswordBlockCount;
    /**
     * Android Work Profile required password type.
     */
    private AndroidWorkProfileRequiredPasswordType workProfilePasswordRequiredType;
    /**
     * Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     */
    private Integer workProfilePasswordSignInFailureCountBeforeFactoryReset;
    /**
     * The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     */
    private AndroidRequiredPasswordComplexity workProfileRequiredPasswordComplexity;
    /**
     * Password is required or not for work profile
     */
    private Boolean workProfileRequirePassword;
    /**
     * Instantiates a new androidWorkProfileGeneralDeviceConfiguration and sets the default values.
     */
    public AndroidWorkProfileGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidWorkProfileGeneralDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileGeneralDeviceConfiguration();
    }
    /**
     * Gets the allowedGoogleAccountDomains property value. Determine domains allow-list for accounts that can be added to work profile.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedGoogleAccountDomains() {
        return this.allowedGoogleAccountDomains;
    }
    /**
     * Gets the blockUnifiedPasswordForWorkProfile property value. Prevent using unified password for unlocking device and work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockUnifiedPasswordForWorkProfile() {
        return this.blockUnifiedPasswordForWorkProfile;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedGoogleAccountDomains", (n) -> { this.setAllowedGoogleAccountDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("blockUnifiedPasswordForWorkProfile", (n) -> { this.setBlockUnifiedPasswordForWorkProfile(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockFaceUnlock", (n) -> { this.setPasswordBlockFaceUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockFingerprintUnlock", (n) -> { this.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockIrisUnlock", (n) -> { this.setPasswordBlockIrisUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockTrustAgents", (n) -> { this.setPasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidWorkProfileRequiredPasswordType.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("requiredPasswordComplexity", (n) -> { this.setRequiredPasswordComplexity(n.getEnumValue(AndroidRequiredPasswordComplexity.class)); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { this.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("vpnAlwaysOnPackageIdentifier", (n) -> { this.setVpnAlwaysOnPackageIdentifier(n.getStringValue()); });
        deserializerMap.put("vpnEnableAlwaysOnLockdownMode", (n) -> { this.setVpnEnableAlwaysOnLockdownMode(n.getBooleanValue()); });
        deserializerMap.put("workProfileAccountUse", (n) -> { this.setWorkProfileAccountUse(n.getEnumValue(AndroidWorkProfileAccountUse.class)); });
        deserializerMap.put("workProfileAllowAppInstallsFromUnknownSources", (n) -> { this.setWorkProfileAllowAppInstallsFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("workProfileAllowWidgets", (n) -> { this.setWorkProfileAllowWidgets(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockAddingAccounts", (n) -> { this.setWorkProfileBlockAddingAccounts(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCamera", (n) -> { this.setWorkProfileBlockCamera(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileCallerId", (n) -> { this.setWorkProfileBlockCrossProfileCallerId(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileContactsSearch", (n) -> { this.setWorkProfileBlockCrossProfileContactsSearch(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileCopyPaste", (n) -> { this.setWorkProfileBlockCrossProfileCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockNotificationsWhileDeviceLocked", (n) -> { this.setWorkProfileBlockNotificationsWhileDeviceLocked(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockPersonalAppInstallsFromUnknownSources", (n) -> { this.setWorkProfileBlockPersonalAppInstallsFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockScreenCapture", (n) -> { this.setWorkProfileBlockScreenCapture(n.getBooleanValue()); });
        deserializerMap.put("workProfileBluetoothEnableContactSharing", (n) -> { this.setWorkProfileBluetoothEnableContactSharing(n.getBooleanValue()); });
        deserializerMap.put("workProfileDataSharingType", (n) -> { this.setWorkProfileDataSharingType(n.getEnumValue(AndroidWorkProfileCrossProfileDataSharingType.class)); });
        deserializerMap.put("workProfileDefaultAppPermissionPolicy", (n) -> { this.setWorkProfileDefaultAppPermissionPolicy(n.getEnumValue(AndroidWorkProfileDefaultAppPermissionPolicyType.class)); });
        deserializerMap.put("workProfilePasswordBlockFaceUnlock", (n) -> { this.setWorkProfilePasswordBlockFaceUnlock(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordBlockFingerprintUnlock", (n) -> { this.setWorkProfilePasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordBlockIrisUnlock", (n) -> { this.setWorkProfilePasswordBlockIrisUnlock(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordBlockTrustAgents", (n) -> { this.setWorkProfilePasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordExpirationDays", (n) -> { this.setWorkProfilePasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLength", (n) -> { this.setWorkProfilePasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinLetterCharacters", (n) -> { this.setWorkProfilePasswordMinLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinLowerCaseCharacters", (n) -> { this.setWorkProfilePasswordMinLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinNonLetterCharacters", (n) -> { this.setWorkProfilePasswordMinNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinNumericCharacters", (n) -> { this.setWorkProfilePasswordMinNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinSymbolCharacters", (n) -> { this.setWorkProfilePasswordMinSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinUpperCaseCharacters", (n) -> { this.setWorkProfilePasswordMinUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordPreviousPasswordBlockCount", (n) -> { this.setWorkProfilePasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordRequiredType", (n) -> { this.setWorkProfilePasswordRequiredType(n.getEnumValue(AndroidWorkProfileRequiredPasswordType.class)); });
        deserializerMap.put("workProfilePasswordSignInFailureCountBeforeFactoryReset", (n) -> { this.setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("workProfileRequiredPasswordComplexity", (n) -> { this.setWorkProfileRequiredPasswordComplexity(n.getEnumValue(AndroidRequiredPasswordComplexity.class)); });
        deserializerMap.put("workProfileRequirePassword", (n) -> { this.setWorkProfileRequirePassword(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBlockFaceUnlock property value. Indicates whether or not to block face unlock.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockFaceUnlock() {
        return this.passwordBlockFaceUnlock;
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this.passwordBlockFingerprintUnlock;
    }
    /**
     * Gets the passwordBlockIrisUnlock property value. Indicates whether or not to block iris unlock.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockIrisUnlock() {
        return this.passwordBlockIrisUnlock;
    }
    /**
     * Gets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockTrustAgents() {
        return this.passwordBlockTrustAgents;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequiredType property value. Android Work Profile required password type.
     * @return a androidWorkProfileRequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileRequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the requiredPasswordComplexity property value. The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     * @return a androidRequiredPasswordComplexity
     */
    @jakarta.annotation.Nullable
    public AndroidRequiredPasswordComplexity getRequiredPasswordComplexity() {
        return this.requiredPasswordComplexity;
    }
    /**
     * Gets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this.securityRequireVerifyApps;
    }
    /**
     * Gets the vpnAlwaysOnPackageIdentifier property value. Enable lockdown mode for always-on VPN.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVpnAlwaysOnPackageIdentifier() {
        return this.vpnAlwaysOnPackageIdentifier;
    }
    /**
     * Gets the vpnEnableAlwaysOnLockdownMode property value. Enable lockdown mode for always-on VPN.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVpnEnableAlwaysOnLockdownMode() {
        return this.vpnEnableAlwaysOnLockdownMode;
    }
    /**
     * Gets the workProfileAccountUse property value. An enum representing possible values for account use in work profile.
     * @return a androidWorkProfileAccountUse
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileAccountUse getWorkProfileAccountUse() {
        return this.workProfileAccountUse;
    }
    /**
     * Gets the workProfileAllowAppInstallsFromUnknownSources property value. Indicates whether to allow installation of apps from unknown sources.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileAllowAppInstallsFromUnknownSources() {
        return this.workProfileAllowAppInstallsFromUnknownSources;
    }
    /**
     * Gets the workProfileAllowWidgets property value. Allow widgets from work profile apps.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileAllowWidgets() {
        return this.workProfileAllowWidgets;
    }
    /**
     * Gets the workProfileBlockAddingAccounts property value. Block users from adding/removing accounts in work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockAddingAccounts() {
        return this.workProfileBlockAddingAccounts;
    }
    /**
     * Gets the workProfileBlockCamera property value. Block work profile camera.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCamera() {
        return this.workProfileBlockCamera;
    }
    /**
     * Gets the workProfileBlockCrossProfileCallerId property value. Block display work profile caller ID in personal profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileCallerId() {
        return this.workProfileBlockCrossProfileCallerId;
    }
    /**
     * Gets the workProfileBlockCrossProfileContactsSearch property value. Block work profile contacts availability in personal profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileContactsSearch() {
        return this.workProfileBlockCrossProfileContactsSearch;
    }
    /**
     * Gets the workProfileBlockCrossProfileCopyPaste property value. Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileCopyPaste() {
        return this.workProfileBlockCrossProfileCopyPaste;
    }
    /**
     * Gets the workProfileBlockNotificationsWhileDeviceLocked property value. Indicates whether or not to block notifications while device locked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockNotificationsWhileDeviceLocked() {
        return this.workProfileBlockNotificationsWhileDeviceLocked;
    }
    /**
     * Gets the workProfileBlockPersonalAppInstallsFromUnknownSources property value. Prevent app installations from unknown sources in the personal profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockPersonalAppInstallsFromUnknownSources() {
        return this.workProfileBlockPersonalAppInstallsFromUnknownSources;
    }
    /**
     * Gets the workProfileBlockScreenCapture property value. Block screen capture in work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockScreenCapture() {
        return this.workProfileBlockScreenCapture;
    }
    /**
     * Gets the workProfileBluetoothEnableContactSharing property value. Allow bluetooth devices to access enterprise contacts.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBluetoothEnableContactSharing() {
        return this.workProfileBluetoothEnableContactSharing;
    }
    /**
     * Gets the workProfileDataSharingType property value. Android Work Profile cross profile data sharing type.
     * @return a androidWorkProfileCrossProfileDataSharingType
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileCrossProfileDataSharingType getWorkProfileDataSharingType() {
        return this.workProfileDataSharingType;
    }
    /**
     * Gets the workProfileDefaultAppPermissionPolicy property value. Android Work Profile default app permission policy type.
     * @return a androidWorkProfileDefaultAppPermissionPolicyType
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileDefaultAppPermissionPolicyType getWorkProfileDefaultAppPermissionPolicy() {
        return this.workProfileDefaultAppPermissionPolicy;
    }
    /**
     * Gets the workProfilePasswordBlockFaceUnlock property value. Indicates whether or not to block face unlock for work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockFaceUnlock() {
        return this.workProfilePasswordBlockFaceUnlock;
    }
    /**
     * Gets the workProfilePasswordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock for work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockFingerprintUnlock() {
        return this.workProfilePasswordBlockFingerprintUnlock;
    }
    /**
     * Gets the workProfilePasswordBlockIrisUnlock property value. Indicates whether or not to block iris unlock for work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockIrisUnlock() {
        return this.workProfilePasswordBlockIrisUnlock;
    }
    /**
     * Gets the workProfilePasswordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents for work profile.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockTrustAgents() {
        return this.workProfilePasswordBlockTrustAgents;
    }
    /**
     * Gets the workProfilePasswordExpirationDays property value. Number of days before the work profile password expires. Valid values 1 to 365
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordExpirationDays() {
        return this.workProfilePasswordExpirationDays;
    }
    /**
     * Gets the workProfilePasswordMinimumLength property value. Minimum length of work profile password. Valid values 4 to 16
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLength() {
        return this.workProfilePasswordMinimumLength;
    }
    /**
     * Gets the workProfilePasswordMinLetterCharacters property value. Minimum # of letter characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinLetterCharacters() {
        return this.workProfilePasswordMinLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinLowerCaseCharacters property value. Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinLowerCaseCharacters() {
        return this.workProfilePasswordMinLowerCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordMinNonLetterCharacters property value. Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinNonLetterCharacters() {
        return this.workProfilePasswordMinNonLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinNumericCharacters property value. Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinNumericCharacters() {
        return this.workProfilePasswordMinNumericCharacters;
    }
    /**
     * Gets the workProfilePasswordMinSymbolCharacters property value. Minimum # of symbols required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinSymbolCharacters() {
        return this.workProfilePasswordMinSymbolCharacters;
    }
    /**
     * Gets the workProfilePasswordMinUpperCaseCharacters property value. Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinUpperCaseCharacters() {
        return this.workProfilePasswordMinUpperCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the workProfilePasswordPreviousPasswordBlockCount property value. Number of previous work profile passwords to block. Valid values 0 to 24
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordPreviousPasswordBlockCount() {
        return this.workProfilePasswordPreviousPasswordBlockCount;
    }
    /**
     * Gets the workProfilePasswordRequiredType property value. Android Work Profile required password type.
     * @return a androidWorkProfileRequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileRequiredPasswordType getWorkProfilePasswordRequiredType() {
        return this.workProfilePasswordRequiredType;
    }
    /**
     * Gets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordSignInFailureCountBeforeFactoryReset() {
        return this.workProfilePasswordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the workProfileRequiredPasswordComplexity property value. The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     * @return a androidRequiredPasswordComplexity
     */
    @jakarta.annotation.Nullable
    public AndroidRequiredPasswordComplexity getWorkProfileRequiredPasswordComplexity() {
        return this.workProfileRequiredPasswordComplexity;
    }
    /**
     * Gets the workProfileRequirePassword property value. Password is required or not for work profile
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileRequirePassword() {
        return this.workProfileRequirePassword;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedGoogleAccountDomains", this.getAllowedGoogleAccountDomains());
        writer.writeBooleanValue("blockUnifiedPasswordForWorkProfile", this.getBlockUnifiedPasswordForWorkProfile());
        writer.writeBooleanValue("passwordBlockFaceUnlock", this.getPasswordBlockFaceUnlock());
        writer.writeBooleanValue("passwordBlockFingerprintUnlock", this.getPasswordBlockFingerprintUnlock());
        writer.writeBooleanValue("passwordBlockIrisUnlock", this.getPasswordBlockIrisUnlock());
        writer.writeBooleanValue("passwordBlockTrustAgents", this.getPasswordBlockTrustAgents());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeEnumValue("requiredPasswordComplexity", this.getRequiredPasswordComplexity());
        writer.writeBooleanValue("securityRequireVerifyApps", this.getSecurityRequireVerifyApps());
        writer.writeStringValue("vpnAlwaysOnPackageIdentifier", this.getVpnAlwaysOnPackageIdentifier());
        writer.writeBooleanValue("vpnEnableAlwaysOnLockdownMode", this.getVpnEnableAlwaysOnLockdownMode());
        writer.writeEnumValue("workProfileAccountUse", this.getWorkProfileAccountUse());
        writer.writeBooleanValue("workProfileAllowAppInstallsFromUnknownSources", this.getWorkProfileAllowAppInstallsFromUnknownSources());
        writer.writeBooleanValue("workProfileAllowWidgets", this.getWorkProfileAllowWidgets());
        writer.writeBooleanValue("workProfileBlockAddingAccounts", this.getWorkProfileBlockAddingAccounts());
        writer.writeBooleanValue("workProfileBlockCamera", this.getWorkProfileBlockCamera());
        writer.writeBooleanValue("workProfileBlockCrossProfileCallerId", this.getWorkProfileBlockCrossProfileCallerId());
        writer.writeBooleanValue("workProfileBlockCrossProfileContactsSearch", this.getWorkProfileBlockCrossProfileContactsSearch());
        writer.writeBooleanValue("workProfileBlockCrossProfileCopyPaste", this.getWorkProfileBlockCrossProfileCopyPaste());
        writer.writeBooleanValue("workProfileBlockNotificationsWhileDeviceLocked", this.getWorkProfileBlockNotificationsWhileDeviceLocked());
        writer.writeBooleanValue("workProfileBlockPersonalAppInstallsFromUnknownSources", this.getWorkProfileBlockPersonalAppInstallsFromUnknownSources());
        writer.writeBooleanValue("workProfileBlockScreenCapture", this.getWorkProfileBlockScreenCapture());
        writer.writeBooleanValue("workProfileBluetoothEnableContactSharing", this.getWorkProfileBluetoothEnableContactSharing());
        writer.writeEnumValue("workProfileDataSharingType", this.getWorkProfileDataSharingType());
        writer.writeEnumValue("workProfileDefaultAppPermissionPolicy", this.getWorkProfileDefaultAppPermissionPolicy());
        writer.writeBooleanValue("workProfilePasswordBlockFaceUnlock", this.getWorkProfilePasswordBlockFaceUnlock());
        writer.writeBooleanValue("workProfilePasswordBlockFingerprintUnlock", this.getWorkProfilePasswordBlockFingerprintUnlock());
        writer.writeBooleanValue("workProfilePasswordBlockIrisUnlock", this.getWorkProfilePasswordBlockIrisUnlock());
        writer.writeBooleanValue("workProfilePasswordBlockTrustAgents", this.getWorkProfilePasswordBlockTrustAgents());
        writer.writeIntegerValue("workProfilePasswordExpirationDays", this.getWorkProfilePasswordExpirationDays());
        writer.writeIntegerValue("workProfilePasswordMinimumLength", this.getWorkProfilePasswordMinimumLength());
        writer.writeIntegerValue("workProfilePasswordMinLetterCharacters", this.getWorkProfilePasswordMinLetterCharacters());
        writer.writeIntegerValue("workProfilePasswordMinLowerCaseCharacters", this.getWorkProfilePasswordMinLowerCaseCharacters());
        writer.writeIntegerValue("workProfilePasswordMinNonLetterCharacters", this.getWorkProfilePasswordMinNonLetterCharacters());
        writer.writeIntegerValue("workProfilePasswordMinNumericCharacters", this.getWorkProfilePasswordMinNumericCharacters());
        writer.writeIntegerValue("workProfilePasswordMinSymbolCharacters", this.getWorkProfilePasswordMinSymbolCharacters());
        writer.writeIntegerValue("workProfilePasswordMinUpperCaseCharacters", this.getWorkProfilePasswordMinUpperCaseCharacters());
        writer.writeIntegerValue("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", this.getWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("workProfilePasswordPreviousPasswordBlockCount", this.getWorkProfilePasswordPreviousPasswordBlockCount());
        writer.writeEnumValue("workProfilePasswordRequiredType", this.getWorkProfilePasswordRequiredType());
        writer.writeIntegerValue("workProfilePasswordSignInFailureCountBeforeFactoryReset", this.getWorkProfilePasswordSignInFailureCountBeforeFactoryReset());
        writer.writeEnumValue("workProfileRequiredPasswordComplexity", this.getWorkProfileRequiredPasswordComplexity());
        writer.writeBooleanValue("workProfileRequirePassword", this.getWorkProfileRequirePassword());
    }
    /**
     * Sets the allowedGoogleAccountDomains property value. Determine domains allow-list for accounts that can be added to work profile.
     * @param value Value to set for the allowedGoogleAccountDomains property.
     */
    public void setAllowedGoogleAccountDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedGoogleAccountDomains = value;
    }
    /**
     * Sets the blockUnifiedPasswordForWorkProfile property value. Prevent using unified password for unlocking device and work profile.
     * @param value Value to set for the blockUnifiedPasswordForWorkProfile property.
     */
    public void setBlockUnifiedPasswordForWorkProfile(@jakarta.annotation.Nullable final Boolean value) {
        this.blockUnifiedPasswordForWorkProfile = value;
    }
    /**
     * Sets the passwordBlockFaceUnlock property value. Indicates whether or not to block face unlock.
     * @param value Value to set for the passwordBlockFaceUnlock property.
     */
    public void setPasswordBlockFaceUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockFaceUnlock = value;
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     */
    public void setPasswordBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passwordBlockIrisUnlock property value. Indicates whether or not to block iris unlock.
     * @param value Value to set for the passwordBlockIrisUnlock property.
     */
    public void setPasswordBlockIrisUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockIrisUnlock = value;
    }
    /**
     * Sets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @param value Value to set for the passwordBlockTrustAgents property.
     */
    public void setPasswordBlockTrustAgents(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockTrustAgents = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequiredType property value. Android Work Profile required password type.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final AndroidWorkProfileRequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the requiredPasswordComplexity property value. The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     * @param value Value to set for the requiredPasswordComplexity property.
     */
    public void setRequiredPasswordComplexity(@jakarta.annotation.Nullable final AndroidRequiredPasswordComplexity value) {
        this.requiredPasswordComplexity = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     */
    public void setSecurityRequireVerifyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.securityRequireVerifyApps = value;
    }
    /**
     * Sets the vpnAlwaysOnPackageIdentifier property value. Enable lockdown mode for always-on VPN.
     * @param value Value to set for the vpnAlwaysOnPackageIdentifier property.
     */
    public void setVpnAlwaysOnPackageIdentifier(@jakarta.annotation.Nullable final String value) {
        this.vpnAlwaysOnPackageIdentifier = value;
    }
    /**
     * Sets the vpnEnableAlwaysOnLockdownMode property value. Enable lockdown mode for always-on VPN.
     * @param value Value to set for the vpnEnableAlwaysOnLockdownMode property.
     */
    public void setVpnEnableAlwaysOnLockdownMode(@jakarta.annotation.Nullable final Boolean value) {
        this.vpnEnableAlwaysOnLockdownMode = value;
    }
    /**
     * Sets the workProfileAccountUse property value. An enum representing possible values for account use in work profile.
     * @param value Value to set for the workProfileAccountUse property.
     */
    public void setWorkProfileAccountUse(@jakarta.annotation.Nullable final AndroidWorkProfileAccountUse value) {
        this.workProfileAccountUse = value;
    }
    /**
     * Sets the workProfileAllowAppInstallsFromUnknownSources property value. Indicates whether to allow installation of apps from unknown sources.
     * @param value Value to set for the workProfileAllowAppInstallsFromUnknownSources property.
     */
    public void setWorkProfileAllowAppInstallsFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileAllowAppInstallsFromUnknownSources = value;
    }
    /**
     * Sets the workProfileAllowWidgets property value. Allow widgets from work profile apps.
     * @param value Value to set for the workProfileAllowWidgets property.
     */
    public void setWorkProfileAllowWidgets(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileAllowWidgets = value;
    }
    /**
     * Sets the workProfileBlockAddingAccounts property value. Block users from adding/removing accounts in work profile.
     * @param value Value to set for the workProfileBlockAddingAccounts property.
     */
    public void setWorkProfileBlockAddingAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockAddingAccounts = value;
    }
    /**
     * Sets the workProfileBlockCamera property value. Block work profile camera.
     * @param value Value to set for the workProfileBlockCamera property.
     */
    public void setWorkProfileBlockCamera(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockCamera = value;
    }
    /**
     * Sets the workProfileBlockCrossProfileCallerId property value. Block display work profile caller ID in personal profile.
     * @param value Value to set for the workProfileBlockCrossProfileCallerId property.
     */
    public void setWorkProfileBlockCrossProfileCallerId(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockCrossProfileCallerId = value;
    }
    /**
     * Sets the workProfileBlockCrossProfileContactsSearch property value. Block work profile contacts availability in personal profile.
     * @param value Value to set for the workProfileBlockCrossProfileContactsSearch property.
     */
    public void setWorkProfileBlockCrossProfileContactsSearch(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockCrossProfileContactsSearch = value;
    }
    /**
     * Sets the workProfileBlockCrossProfileCopyPaste property value. Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     * @param value Value to set for the workProfileBlockCrossProfileCopyPaste property.
     */
    public void setWorkProfileBlockCrossProfileCopyPaste(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockCrossProfileCopyPaste = value;
    }
    /**
     * Sets the workProfileBlockNotificationsWhileDeviceLocked property value. Indicates whether or not to block notifications while device locked.
     * @param value Value to set for the workProfileBlockNotificationsWhileDeviceLocked property.
     */
    public void setWorkProfileBlockNotificationsWhileDeviceLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockNotificationsWhileDeviceLocked = value;
    }
    /**
     * Sets the workProfileBlockPersonalAppInstallsFromUnknownSources property value. Prevent app installations from unknown sources in the personal profile.
     * @param value Value to set for the workProfileBlockPersonalAppInstallsFromUnknownSources property.
     */
    public void setWorkProfileBlockPersonalAppInstallsFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockPersonalAppInstallsFromUnknownSources = value;
    }
    /**
     * Sets the workProfileBlockScreenCapture property value. Block screen capture in work profile.
     * @param value Value to set for the workProfileBlockScreenCapture property.
     */
    public void setWorkProfileBlockScreenCapture(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBlockScreenCapture = value;
    }
    /**
     * Sets the workProfileBluetoothEnableContactSharing property value. Allow bluetooth devices to access enterprise contacts.
     * @param value Value to set for the workProfileBluetoothEnableContactSharing property.
     */
    public void setWorkProfileBluetoothEnableContactSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileBluetoothEnableContactSharing = value;
    }
    /**
     * Sets the workProfileDataSharingType property value. Android Work Profile cross profile data sharing type.
     * @param value Value to set for the workProfileDataSharingType property.
     */
    public void setWorkProfileDataSharingType(@jakarta.annotation.Nullable final AndroidWorkProfileCrossProfileDataSharingType value) {
        this.workProfileDataSharingType = value;
    }
    /**
     * Sets the workProfileDefaultAppPermissionPolicy property value. Android Work Profile default app permission policy type.
     * @param value Value to set for the workProfileDefaultAppPermissionPolicy property.
     */
    public void setWorkProfileDefaultAppPermissionPolicy(@jakarta.annotation.Nullable final AndroidWorkProfileDefaultAppPermissionPolicyType value) {
        this.workProfileDefaultAppPermissionPolicy = value;
    }
    /**
     * Sets the workProfilePasswordBlockFaceUnlock property value. Indicates whether or not to block face unlock for work profile.
     * @param value Value to set for the workProfilePasswordBlockFaceUnlock property.
     */
    public void setWorkProfilePasswordBlockFaceUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfilePasswordBlockFaceUnlock = value;
    }
    /**
     * Sets the workProfilePasswordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock for work profile.
     * @param value Value to set for the workProfilePasswordBlockFingerprintUnlock property.
     */
    public void setWorkProfilePasswordBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfilePasswordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the workProfilePasswordBlockIrisUnlock property value. Indicates whether or not to block iris unlock for work profile.
     * @param value Value to set for the workProfilePasswordBlockIrisUnlock property.
     */
    public void setWorkProfilePasswordBlockIrisUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfilePasswordBlockIrisUnlock = value;
    }
    /**
     * Sets the workProfilePasswordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents for work profile.
     * @param value Value to set for the workProfilePasswordBlockTrustAgents property.
     */
    public void setWorkProfilePasswordBlockTrustAgents(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfilePasswordBlockTrustAgents = value;
    }
    /**
     * Sets the workProfilePasswordExpirationDays property value. Number of days before the work profile password expires. Valid values 1 to 365
     * @param value Value to set for the workProfilePasswordExpirationDays property.
     */
    public void setWorkProfilePasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordExpirationDays = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLength property value. Minimum length of work profile password. Valid values 4 to 16
     * @param value Value to set for the workProfilePasswordMinimumLength property.
     */
    public void setWorkProfilePasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumLength = value;
    }
    /**
     * Sets the workProfilePasswordMinLetterCharacters property value. Minimum # of letter characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinLetterCharacters property.
     */
    public void setWorkProfilePasswordMinLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinLowerCaseCharacters property value. Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinLowerCaseCharacters property.
     */
    public void setWorkProfilePasswordMinLowerCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinLowerCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinNonLetterCharacters property value. Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinNonLetterCharacters property.
     */
    public void setWorkProfilePasswordMinNonLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinNonLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinNumericCharacters property value. Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinNumericCharacters property.
     */
    public void setWorkProfilePasswordMinNumericCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinNumericCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinSymbolCharacters property value. Minimum # of symbols required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinSymbolCharacters property.
     */
    public void setWorkProfilePasswordMinSymbolCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinSymbolCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinUpperCaseCharacters property value. Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinUpperCaseCharacters property.
     */
    public void setWorkProfilePasswordMinUpperCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinUpperCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the workProfilePasswordPreviousPasswordBlockCount property value. Number of previous work profile passwords to block. Valid values 0 to 24
     * @param value Value to set for the workProfilePasswordPreviousPasswordBlockCount property.
     */
    public void setWorkProfilePasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the workProfilePasswordRequiredType property value. Android Work Profile required password type.
     * @param value Value to set for the workProfilePasswordRequiredType property.
     */
    public void setWorkProfilePasswordRequiredType(@jakarta.annotation.Nullable final AndroidWorkProfileRequiredPasswordType value) {
        this.workProfilePasswordRequiredType = value;
    }
    /**
     * Sets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordSignInFailureCountBeforeFactoryReset property.
     */
    public void setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.workProfilePasswordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the workProfileRequiredPasswordComplexity property value. The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     * @param value Value to set for the workProfileRequiredPasswordComplexity property.
     */
    public void setWorkProfileRequiredPasswordComplexity(@jakarta.annotation.Nullable final AndroidRequiredPasswordComplexity value) {
        this.workProfileRequiredPasswordComplexity = value;
    }
    /**
     * Sets the workProfileRequirePassword property value. Password is required or not for work profile
     * @param value Value to set for the workProfileRequirePassword property.
     */
    public void setWorkProfileRequirePassword(@jakarta.annotation.Nullable final Boolean value) {
        this.workProfileRequirePassword = value;
    }
}

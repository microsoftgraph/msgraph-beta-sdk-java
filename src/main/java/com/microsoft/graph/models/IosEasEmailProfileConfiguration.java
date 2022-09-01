package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosEasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements Parsable {
    /** Account name. */
    private String _accountName;
    /** Authentication method for this Email profile. Possible values are: usernameAndPassword, certificate, derivedCredential. */
    private EasAuthenticationMethod _authenticationMethod;
    /** Indicates whether or not to block moving messages to other email accounts. */
    private Boolean _blockMovingMessagesToOtherEmailAccounts;
    /** Indicates whether or not to block sending email from third party apps. */
    private Boolean _blockSendingEmailFromThirdPartyApps;
    /** Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email. */
    private Boolean _blockSyncingRecentlyUsedEmailAddresses;
    /** Tenant level settings for the Derived Credentials to be used for authentication. */
    private DeviceManagementDerivedCredentialSettings _derivedCredentialSettings;
    /** Possible values for email sync duration. */
    private EmailSyncDuration _durationOfEmailToSync;
    /** Exchange data to sync. Possible values are: none, calendars, contacts, email, notes, reminders. */
    private EasServices _easServices;
    /** Allow users to change sync settings. */
    private Boolean _easServicesUserOverrideEnabled;
    /** Possible values for username source or email source. */
    private UserEmailSource _emailAddressSource;
    /** Encryption Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential. */
    private EmailCertificateType _encryptionCertificateType;
    /** Exchange location that (URL) that the native mail app connects to. */
    private String _hostName;
    /** Identity certificate. */
    private IosCertificateProfileBase _identityCertificate;
    /** Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client */
    private String _perAppVPNProfileId;
    /** Indicates whether or not to use S/MIME certificate. */
    private Boolean _requireSmime;
    /** Indicates whether or not to use SSL. */
    private Boolean _requireSsl;
    /** Signing Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential. */
    private EmailCertificateType _signingCertificateType;
    /** Indicates whether or not to allow unencrypted emails. */
    private Boolean _smimeEnablePerMessageSwitch;
    /** If set to true S/MIME encryption is enabled by default. */
    private Boolean _smimeEncryptByDefaultEnabled;
    /** If set to true, the user can toggle the encryption by default setting. */
    private Boolean _smimeEncryptByDefaultUserOverrideEnabled;
    /** S/MIME encryption certificate. */
    private IosCertificateProfile _smimeEncryptionCertificate;
    /** If set to true the user can select the S/MIME encryption identity. */
    private Boolean _smimeEncryptionCertificateUserOverrideEnabled;
    /** S/MIME signing certificate. */
    private IosCertificateProfile _smimeSigningCertificate;
    /** If set to true, the user can select the signing identity. */
    private Boolean _smimeSigningCertificateUserOverrideEnabled;
    /** If set to true S/MIME signing is enabled for this account */
    private Boolean _smimeSigningEnabled;
    /** If set to true, the user can toggle S/MIME signing on or off. */
    private Boolean _smimeSigningUserOverrideEnabled;
    /** Specifies whether the connection should use OAuth for authentication. */
    private Boolean _useOAuth;
    /**
     * Instantiates a new IosEasEmailProfileConfiguration and sets the default values.
     * @return a void
     */
    public IosEasEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosEasEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosEasEmailProfileConfiguration
     */
    @javax.annotation.Nonnull
    public static IosEasEmailProfileConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEasEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Account name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this._accountName;
    }
    /**
     * Gets the authenticationMethod property value. Authentication method for this Email profile. Possible values are: usernameAndPassword, certificate, derivedCredential.
     * @return a easAuthenticationMethod
     */
    @javax.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the blockMovingMessagesToOtherEmailAccounts property value. Indicates whether or not to block moving messages to other email accounts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockMovingMessagesToOtherEmailAccounts() {
        return this._blockMovingMessagesToOtherEmailAccounts;
    }
    /**
     * Gets the blockSendingEmailFromThirdPartyApps property value. Indicates whether or not to block sending email from third party apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockSendingEmailFromThirdPartyApps() {
        return this._blockSendingEmailFromThirdPartyApps;
    }
    /**
     * Gets the blockSyncingRecentlyUsedEmailAddresses property value. Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockSyncingRecentlyUsedEmailAddresses() {
        return this._blockSyncingRecentlyUsedEmailAddresses;
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this._derivedCredentialSettings;
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a emailSyncDuration
     */
    @javax.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this._durationOfEmailToSync;
    }
    /**
     * Gets the easServices property value. Exchange data to sync. Possible values are: none, calendars, contacts, email, notes, reminders.
     * @return a easServices
     */
    @javax.annotation.Nullable
    public EasServices getEasServices() {
        return this._easServices;
    }
    /**
     * Gets the easServicesUserOverrideEnabled property value. Allow users to change sync settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEasServicesUserOverrideEnabled() {
        return this._easServicesUserOverrideEnabled;
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a userEmailSource
     */
    @javax.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this._emailAddressSource;
    }
    /**
     * Gets the encryptionCertificateType property value. Encryption Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @return a emailCertificateType
     */
    @javax.annotation.Nullable
    public EmailCertificateType getEncryptionCertificateType() {
        return this._encryptionCertificateType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosEasEmailProfileConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountName", (n) -> { currentObject.setAccountName(n.getStringValue()); });
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod.class)); });
            this.put("blockMovingMessagesToOtherEmailAccounts", (n) -> { currentObject.setBlockMovingMessagesToOtherEmailAccounts(n.getBooleanValue()); });
            this.put("blockSendingEmailFromThirdPartyApps", (n) -> { currentObject.setBlockSendingEmailFromThirdPartyApps(n.getBooleanValue()); });
            this.put("blockSyncingRecentlyUsedEmailAddresses", (n) -> { currentObject.setBlockSyncingRecentlyUsedEmailAddresses(n.getBooleanValue()); });
            this.put("derivedCredentialSettings", (n) -> { currentObject.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
            this.put("durationOfEmailToSync", (n) -> { currentObject.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
            this.put("easServices", (n) -> { currentObject.setEasServices(n.getEnumValue(EasServices.class)); });
            this.put("easServicesUserOverrideEnabled", (n) -> { currentObject.setEasServicesUserOverrideEnabled(n.getBooleanValue()); });
            this.put("emailAddressSource", (n) -> { currentObject.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
            this.put("encryptionCertificateType", (n) -> { currentObject.setEncryptionCertificateType(n.getEnumValue(EmailCertificateType.class)); });
            this.put("hostName", (n) -> { currentObject.setHostName(n.getStringValue()); });
            this.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("perAppVPNProfileId", (n) -> { currentObject.setPerAppVPNProfileId(n.getStringValue()); });
            this.put("requireSmime", (n) -> { currentObject.setRequireSmime(n.getBooleanValue()); });
            this.put("requireSsl", (n) -> { currentObject.setRequireSsl(n.getBooleanValue()); });
            this.put("signingCertificateType", (n) -> { currentObject.setSigningCertificateType(n.getEnumValue(EmailCertificateType.class)); });
            this.put("smimeEnablePerMessageSwitch", (n) -> { currentObject.setSmimeEnablePerMessageSwitch(n.getBooleanValue()); });
            this.put("smimeEncryptByDefaultEnabled", (n) -> { currentObject.setSmimeEncryptByDefaultEnabled(n.getBooleanValue()); });
            this.put("smimeEncryptByDefaultUserOverrideEnabled", (n) -> { currentObject.setSmimeEncryptByDefaultUserOverrideEnabled(n.getBooleanValue()); });
            this.put("smimeEncryptionCertificate", (n) -> { currentObject.setSmimeEncryptionCertificate(n.getObjectValue(IosCertificateProfile::createFromDiscriminatorValue)); });
            this.put("smimeEncryptionCertificateUserOverrideEnabled", (n) -> { currentObject.setSmimeEncryptionCertificateUserOverrideEnabled(n.getBooleanValue()); });
            this.put("smimeSigningCertificate", (n) -> { currentObject.setSmimeSigningCertificate(n.getObjectValue(IosCertificateProfile::createFromDiscriminatorValue)); });
            this.put("smimeSigningCertificateUserOverrideEnabled", (n) -> { currentObject.setSmimeSigningCertificateUserOverrideEnabled(n.getBooleanValue()); });
            this.put("smimeSigningEnabled", (n) -> { currentObject.setSmimeSigningEnabled(n.getBooleanValue()); });
            this.put("smimeSigningUserOverrideEnabled", (n) -> { currentObject.setSmimeSigningUserOverrideEnabled(n.getBooleanValue()); });
            this.put("useOAuth", (n) -> { currentObject.setUseOAuth(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostName() {
        return this._hostName;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a iosCertificateProfileBase
     */
    @javax.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
    }
    /**
     * Gets the perAppVPNProfileId property value. Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPerAppVPNProfileId() {
        return this._perAppVPNProfileId;
    }
    /**
     * Gets the requireSmime property value. Indicates whether or not to use S/MIME certificate.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSmime() {
        return this._requireSmime;
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSsl() {
        return this._requireSsl;
    }
    /**
     * Gets the signingCertificateType property value. Signing Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @return a emailCertificateType
     */
    @javax.annotation.Nullable
    public EmailCertificateType getSigningCertificateType() {
        return this._signingCertificateType;
    }
    /**
     * Gets the smimeEnablePerMessageSwitch property value. Indicates whether or not to allow unencrypted emails.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeEnablePerMessageSwitch() {
        return this._smimeEnablePerMessageSwitch;
    }
    /**
     * Gets the smimeEncryptByDefaultEnabled property value. If set to true S/MIME encryption is enabled by default.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeEncryptByDefaultEnabled() {
        return this._smimeEncryptByDefaultEnabled;
    }
    /**
     * Gets the smimeEncryptByDefaultUserOverrideEnabled property value. If set to true, the user can toggle the encryption by default setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeEncryptByDefaultUserOverrideEnabled() {
        return this._smimeEncryptByDefaultUserOverrideEnabled;
    }
    /**
     * Gets the smimeEncryptionCertificate property value. S/MIME encryption certificate.
     * @return a iosCertificateProfile
     */
    @javax.annotation.Nullable
    public IosCertificateProfile getSmimeEncryptionCertificate() {
        return this._smimeEncryptionCertificate;
    }
    /**
     * Gets the smimeEncryptionCertificateUserOverrideEnabled property value. If set to true the user can select the S/MIME encryption identity.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeEncryptionCertificateUserOverrideEnabled() {
        return this._smimeEncryptionCertificateUserOverrideEnabled;
    }
    /**
     * Gets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @return a iosCertificateProfile
     */
    @javax.annotation.Nullable
    public IosCertificateProfile getSmimeSigningCertificate() {
        return this._smimeSigningCertificate;
    }
    /**
     * Gets the smimeSigningCertificateUserOverrideEnabled property value. If set to true, the user can select the signing identity.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeSigningCertificateUserOverrideEnabled() {
        return this._smimeSigningCertificateUserOverrideEnabled;
    }
    /**
     * Gets the smimeSigningEnabled property value. If set to true S/MIME signing is enabled for this account
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeSigningEnabled() {
        return this._smimeSigningEnabled;
    }
    /**
     * Gets the smimeSigningUserOverrideEnabled property value. If set to true, the user can toggle S/MIME signing on or off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmimeSigningUserOverrideEnabled() {
        return this._smimeSigningUserOverrideEnabled;
    }
    /**
     * Gets the useOAuth property value. Specifies whether the connection should use OAuth for authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseOAuth() {
        return this._useOAuth;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeBooleanValue("blockMovingMessagesToOtherEmailAccounts", this.getBlockMovingMessagesToOtherEmailAccounts());
        writer.writeBooleanValue("blockSendingEmailFromThirdPartyApps", this.getBlockSendingEmailFromThirdPartyApps());
        writer.writeBooleanValue("blockSyncingRecentlyUsedEmailAddresses", this.getBlockSyncingRecentlyUsedEmailAddresses());
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeEnumValue("durationOfEmailToSync", this.getDurationOfEmailToSync());
        writer.writeEnumValue("easServices", this.getEasServices());
        writer.writeBooleanValue("easServicesUserOverrideEnabled", this.getEasServicesUserOverrideEnabled());
        writer.writeEnumValue("emailAddressSource", this.getEmailAddressSource());
        writer.writeEnumValue("encryptionCertificateType", this.getEncryptionCertificateType());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("perAppVPNProfileId", this.getPerAppVPNProfileId());
        writer.writeBooleanValue("requireSmime", this.getRequireSmime());
        writer.writeBooleanValue("requireSsl", this.getRequireSsl());
        writer.writeEnumValue("signingCertificateType", this.getSigningCertificateType());
        writer.writeBooleanValue("smimeEnablePerMessageSwitch", this.getSmimeEnablePerMessageSwitch());
        writer.writeBooleanValue("smimeEncryptByDefaultEnabled", this.getSmimeEncryptByDefaultEnabled());
        writer.writeBooleanValue("smimeEncryptByDefaultUserOverrideEnabled", this.getSmimeEncryptByDefaultUserOverrideEnabled());
        writer.writeObjectValue("smimeEncryptionCertificate", this.getSmimeEncryptionCertificate());
        writer.writeBooleanValue("smimeEncryptionCertificateUserOverrideEnabled", this.getSmimeEncryptionCertificateUserOverrideEnabled());
        writer.writeObjectValue("smimeSigningCertificate", this.getSmimeSigningCertificate());
        writer.writeBooleanValue("smimeSigningCertificateUserOverrideEnabled", this.getSmimeSigningCertificateUserOverrideEnabled());
        writer.writeBooleanValue("smimeSigningEnabled", this.getSmimeSigningEnabled());
        writer.writeBooleanValue("smimeSigningUserOverrideEnabled", this.getSmimeSigningUserOverrideEnabled());
        writer.writeBooleanValue("useOAuth", this.getUseOAuth());
    }
    /**
     * Sets the accountName property value. Account name.
     * @param value Value to set for the accountName property.
     * @return a void
     */
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this._accountName = value;
    }
    /**
     * Sets the authenticationMethod property value. Authentication method for this Email profile. Possible values are: usernameAndPassword, certificate, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final EasAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the blockMovingMessagesToOtherEmailAccounts property value. Indicates whether or not to block moving messages to other email accounts.
     * @param value Value to set for the blockMovingMessagesToOtherEmailAccounts property.
     * @return a void
     */
    public void setBlockMovingMessagesToOtherEmailAccounts(@javax.annotation.Nullable final Boolean value) {
        this._blockMovingMessagesToOtherEmailAccounts = value;
    }
    /**
     * Sets the blockSendingEmailFromThirdPartyApps property value. Indicates whether or not to block sending email from third party apps.
     * @param value Value to set for the blockSendingEmailFromThirdPartyApps property.
     * @return a void
     */
    public void setBlockSendingEmailFromThirdPartyApps(@javax.annotation.Nullable final Boolean value) {
        this._blockSendingEmailFromThirdPartyApps = value;
    }
    /**
     * Sets the blockSyncingRecentlyUsedEmailAddresses property value. Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.
     * @param value Value to set for the blockSyncingRecentlyUsedEmailAddresses property.
     * @return a void
     */
    public void setBlockSyncingRecentlyUsedEmailAddresses(@javax.annotation.Nullable final Boolean value) {
        this._blockSyncingRecentlyUsedEmailAddresses = value;
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     * @return a void
     */
    public void setDerivedCredentialSettings(@javax.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this._derivedCredentialSettings = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     * @return a void
     */
    public void setDurationOfEmailToSync(@javax.annotation.Nullable final EmailSyncDuration value) {
        this._durationOfEmailToSync = value;
    }
    /**
     * Sets the easServices property value. Exchange data to sync. Possible values are: none, calendars, contacts, email, notes, reminders.
     * @param value Value to set for the easServices property.
     * @return a void
     */
    public void setEasServices(@javax.annotation.Nullable final EasServices value) {
        this._easServices = value;
    }
    /**
     * Sets the easServicesUserOverrideEnabled property value. Allow users to change sync settings.
     * @param value Value to set for the easServicesUserOverrideEnabled property.
     * @return a void
     */
    public void setEasServicesUserOverrideEnabled(@javax.annotation.Nullable final Boolean value) {
        this._easServicesUserOverrideEnabled = value;
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     * @return a void
     */
    public void setEmailAddressSource(@javax.annotation.Nullable final UserEmailSource value) {
        this._emailAddressSource = value;
    }
    /**
     * Sets the encryptionCertificateType property value. Encryption Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @param value Value to set for the encryptionCertificateType property.
     * @return a void
     */
    public void setEncryptionCertificateType(@javax.annotation.Nullable final EmailCertificateType value) {
        this._encryptionCertificateType = value;
    }
    /**
     * Sets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    public void setHostName(@javax.annotation.Nullable final String value) {
        this._hostName = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    public void setIdentityCertificate(@javax.annotation.Nullable final IosCertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the perAppVPNProfileId property value. Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client
     * @param value Value to set for the perAppVPNProfileId property.
     * @return a void
     */
    public void setPerAppVPNProfileId(@javax.annotation.Nullable final String value) {
        this._perAppVPNProfileId = value;
    }
    /**
     * Sets the requireSmime property value. Indicates whether or not to use S/MIME certificate.
     * @param value Value to set for the requireSmime property.
     * @return a void
     */
    public void setRequireSmime(@javax.annotation.Nullable final Boolean value) {
        this._requireSmime = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     * @return a void
     */
    public void setRequireSsl(@javax.annotation.Nullable final Boolean value) {
        this._requireSsl = value;
    }
    /**
     * Sets the signingCertificateType property value. Signing Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @param value Value to set for the signingCertificateType property.
     * @return a void
     */
    public void setSigningCertificateType(@javax.annotation.Nullable final EmailCertificateType value) {
        this._signingCertificateType = value;
    }
    /**
     * Sets the smimeEnablePerMessageSwitch property value. Indicates whether or not to allow unencrypted emails.
     * @param value Value to set for the smimeEnablePerMessageSwitch property.
     * @return a void
     */
    public void setSmimeEnablePerMessageSwitch(@javax.annotation.Nullable final Boolean value) {
        this._smimeEnablePerMessageSwitch = value;
    }
    /**
     * Sets the smimeEncryptByDefaultEnabled property value. If set to true S/MIME encryption is enabled by default.
     * @param value Value to set for the smimeEncryptByDefaultEnabled property.
     * @return a void
     */
    public void setSmimeEncryptByDefaultEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smimeEncryptByDefaultEnabled = value;
    }
    /**
     * Sets the smimeEncryptByDefaultUserOverrideEnabled property value. If set to true, the user can toggle the encryption by default setting.
     * @param value Value to set for the smimeEncryptByDefaultUserOverrideEnabled property.
     * @return a void
     */
    public void setSmimeEncryptByDefaultUserOverrideEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smimeEncryptByDefaultUserOverrideEnabled = value;
    }
    /**
     * Sets the smimeEncryptionCertificate property value. S/MIME encryption certificate.
     * @param value Value to set for the smimeEncryptionCertificate property.
     * @return a void
     */
    public void setSmimeEncryptionCertificate(@javax.annotation.Nullable final IosCertificateProfile value) {
        this._smimeEncryptionCertificate = value;
    }
    /**
     * Sets the smimeEncryptionCertificateUserOverrideEnabled property value. If set to true the user can select the S/MIME encryption identity.
     * @param value Value to set for the smimeEncryptionCertificateUserOverrideEnabled property.
     * @return a void
     */
    public void setSmimeEncryptionCertificateUserOverrideEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smimeEncryptionCertificateUserOverrideEnabled = value;
    }
    /**
     * Sets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @param value Value to set for the smimeSigningCertificate property.
     * @return a void
     */
    public void setSmimeSigningCertificate(@javax.annotation.Nullable final IosCertificateProfile value) {
        this._smimeSigningCertificate = value;
    }
    /**
     * Sets the smimeSigningCertificateUserOverrideEnabled property value. If set to true, the user can select the signing identity.
     * @param value Value to set for the smimeSigningCertificateUserOverrideEnabled property.
     * @return a void
     */
    public void setSmimeSigningCertificateUserOverrideEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smimeSigningCertificateUserOverrideEnabled = value;
    }
    /**
     * Sets the smimeSigningEnabled property value. If set to true S/MIME signing is enabled for this account
     * @param value Value to set for the smimeSigningEnabled property.
     * @return a void
     */
    public void setSmimeSigningEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smimeSigningEnabled = value;
    }
    /**
     * Sets the smimeSigningUserOverrideEnabled property value. If set to true, the user can toggle S/MIME signing on or off.
     * @param value Value to set for the smimeSigningUserOverrideEnabled property.
     * @return a void
     */
    public void setSmimeSigningUserOverrideEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smimeSigningUserOverrideEnabled = value;
    }
    /**
     * Sets the useOAuth property value. Specifies whether the connection should use OAuth for authentication.
     * @param value Value to set for the useOAuth property.
     * @return a void
     */
    public void setUseOAuth(@javax.annotation.Nullable final Boolean value) {
        this._useOAuth = value;
    }
}

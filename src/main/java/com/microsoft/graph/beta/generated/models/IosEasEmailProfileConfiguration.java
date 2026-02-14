package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing configurations in this profile you can instruct the native email client on iOS devices to communicate with an Exchange server and get email, contacts, calendar, reminders, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosEasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements Parsable {
    /**
     * Instantiates a new {@link IosEasEmailProfileConfiguration} and sets the default values.
     */
    public IosEasEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosEasEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosEasEmailProfileConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IosEasEmailProfileConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEasEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Account name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.backingStore.get("accountName");
    }
    /**
     * Gets the authenticationMethod property value. Authentication method for this Email profile. Possible values are: usernameAndPassword, certificate, derivedCredential.
     * @return a {@link EasAuthenticationMethod}
     */
    @jakarta.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the blockMovingMessagesToOtherEmailAccounts property value. Indicates whether or not to block moving messages to other email accounts.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockMovingMessagesToOtherEmailAccounts() {
        return this.backingStore.get("blockMovingMessagesToOtherEmailAccounts");
    }
    /**
     * Gets the blockSendingEmailFromThirdPartyApps property value. Indicates whether or not to block sending email from third party apps.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockSendingEmailFromThirdPartyApps() {
        return this.backingStore.get("blockSendingEmailFromThirdPartyApps");
    }
    /**
     * Gets the blockSyncingRecentlyUsedEmailAddresses property value. Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockSyncingRecentlyUsedEmailAddresses() {
        return this.backingStore.get("blockSyncingRecentlyUsedEmailAddresses");
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a {@link DeviceManagementDerivedCredentialSettings}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this.backingStore.get("derivedCredentialSettings");
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a {@link EmailSyncDuration}
     */
    @jakarta.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this.backingStore.get("durationOfEmailToSync");
    }
    /**
     * Gets the easServices property value. Exchange data to sync. Possible values are: none, calendars, contacts, email, notes, reminders.
     * @return a {@link EnumSet<EasServices>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<EasServices> getEasServices() {
        return this.backingStore.get("easServices");
    }
    /**
     * Gets the easServicesUserOverrideEnabled property value. Allow users to change sync settings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEasServicesUserOverrideEnabled() {
        return this.backingStore.get("easServicesUserOverrideEnabled");
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a {@link UserEmailSource}
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.backingStore.get("emailAddressSource");
    }
    /**
     * Gets the encryptionCertificateType property value. Encryption Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @return a {@link EmailCertificateType}
     */
    @jakarta.annotation.Nullable
    public EmailCertificateType getEncryptionCertificateType() {
        return this.backingStore.get("encryptionCertificateType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod::forValue)); });
        deserializerMap.put("blockMovingMessagesToOtherEmailAccounts", (n) -> { this.setBlockMovingMessagesToOtherEmailAccounts(n.getBooleanValue()); });
        deserializerMap.put("blockSendingEmailFromThirdPartyApps", (n) -> { this.setBlockSendingEmailFromThirdPartyApps(n.getBooleanValue()); });
        deserializerMap.put("blockSyncingRecentlyUsedEmailAddresses", (n) -> { this.setBlockSyncingRecentlyUsedEmailAddresses(n.getBooleanValue()); });
        deserializerMap.put("derivedCredentialSettings", (n) -> { this.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration::forValue)); });
        deserializerMap.put("easServices", (n) -> { this.setEasServices(n.getEnumSetValue(EasServices::forValue)); });
        deserializerMap.put("easServicesUserOverrideEnabled", (n) -> { this.setEasServicesUserOverrideEnabled(n.getBooleanValue()); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource::forValue)); });
        deserializerMap.put("encryptionCertificateType", (n) -> { this.setEncryptionCertificateType(n.getEnumValue(EmailCertificateType::forValue)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("perAppVPNProfileId", (n) -> { this.setPerAppVPNProfileId(n.getStringValue()); });
        deserializerMap.put("requireSmime", (n) -> { this.setRequireSmime(n.getBooleanValue()); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("signingCertificateType", (n) -> { this.setSigningCertificateType(n.getEnumValue(EmailCertificateType::forValue)); });
        deserializerMap.put("smimeEnablePerMessageSwitch", (n) -> { this.setSmimeEnablePerMessageSwitch(n.getBooleanValue()); });
        deserializerMap.put("smimeEncryptByDefaultEnabled", (n) -> { this.setSmimeEncryptByDefaultEnabled(n.getBooleanValue()); });
        deserializerMap.put("smimeEncryptByDefaultUserOverrideEnabled", (n) -> { this.setSmimeEncryptByDefaultUserOverrideEnabled(n.getBooleanValue()); });
        deserializerMap.put("smimeEncryptionCertificate", (n) -> { this.setSmimeEncryptionCertificate(n.getObjectValue(IosCertificateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("smimeEncryptionCertificateUserOverrideEnabled", (n) -> { this.setSmimeEncryptionCertificateUserOverrideEnabled(n.getBooleanValue()); });
        deserializerMap.put("smimeSigningCertificate", (n) -> { this.setSmimeSigningCertificate(n.getObjectValue(IosCertificateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("smimeSigningCertificateUserOverrideEnabled", (n) -> { this.setSmimeSigningCertificateUserOverrideEnabled(n.getBooleanValue()); });
        deserializerMap.put("smimeSigningEnabled", (n) -> { this.setSmimeSigningEnabled(n.getBooleanValue()); });
        deserializerMap.put("smimeSigningUserOverrideEnabled", (n) -> { this.setSmimeSigningUserOverrideEnabled(n.getBooleanValue()); });
        deserializerMap.put("useOAuth", (n) -> { this.setUseOAuth(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.backingStore.get("hostName");
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a {@link IosCertificateProfileBase}
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
    }
    /**
     * Gets the perAppVPNProfileId property value. Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPerAppVPNProfileId() {
        return this.backingStore.get("perAppVPNProfileId");
    }
    /**
     * Gets the requireSmime property value. Indicates whether or not to use S/MIME certificate.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSmime() {
        return this.backingStore.get("requireSmime");
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.backingStore.get("requireSsl");
    }
    /**
     * Gets the signingCertificateType property value. Signing Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @return a {@link EmailCertificateType}
     */
    @jakarta.annotation.Nullable
    public EmailCertificateType getSigningCertificateType() {
        return this.backingStore.get("signingCertificateType");
    }
    /**
     * Gets the smimeEnablePerMessageSwitch property value. Indicates whether or not to allow unencrypted emails.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeEnablePerMessageSwitch() {
        return this.backingStore.get("smimeEnablePerMessageSwitch");
    }
    /**
     * Gets the smimeEncryptByDefaultEnabled property value. If set to true S/MIME encryption is enabled by default.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeEncryptByDefaultEnabled() {
        return this.backingStore.get("smimeEncryptByDefaultEnabled");
    }
    /**
     * Gets the smimeEncryptByDefaultUserOverrideEnabled property value. If set to true, the user can toggle the encryption by default setting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeEncryptByDefaultUserOverrideEnabled() {
        return this.backingStore.get("smimeEncryptByDefaultUserOverrideEnabled");
    }
    /**
     * Gets the smimeEncryptionCertificate property value. S/MIME encryption certificate.
     * @return a {@link IosCertificateProfile}
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfile getSmimeEncryptionCertificate() {
        return this.backingStore.get("smimeEncryptionCertificate");
    }
    /**
     * Gets the smimeEncryptionCertificateUserOverrideEnabled property value. If set to true the user can select the S/MIME encryption identity.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeEncryptionCertificateUserOverrideEnabled() {
        return this.backingStore.get("smimeEncryptionCertificateUserOverrideEnabled");
    }
    /**
     * Gets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @return a {@link IosCertificateProfile}
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfile getSmimeSigningCertificate() {
        return this.backingStore.get("smimeSigningCertificate");
    }
    /**
     * Gets the smimeSigningCertificateUserOverrideEnabled property value. If set to true, the user can select the signing identity.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeSigningCertificateUserOverrideEnabled() {
        return this.backingStore.get("smimeSigningCertificateUserOverrideEnabled");
    }
    /**
     * Gets the smimeSigningEnabled property value. If set to true S/MIME signing is enabled for this account
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeSigningEnabled() {
        return this.backingStore.get("smimeSigningEnabled");
    }
    /**
     * Gets the smimeSigningUserOverrideEnabled property value. If set to true, the user can toggle S/MIME signing on or off.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmimeSigningUserOverrideEnabled() {
        return this.backingStore.get("smimeSigningUserOverrideEnabled");
    }
    /**
     * Gets the useOAuth property value. Specifies whether the connection should use OAuth for authentication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseOAuth() {
        return this.backingStore.get("useOAuth");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeBooleanValue("blockMovingMessagesToOtherEmailAccounts", this.getBlockMovingMessagesToOtherEmailAccounts());
        writer.writeBooleanValue("blockSendingEmailFromThirdPartyApps", this.getBlockSendingEmailFromThirdPartyApps());
        writer.writeBooleanValue("blockSyncingRecentlyUsedEmailAddresses", this.getBlockSyncingRecentlyUsedEmailAddresses());
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeEnumValue("durationOfEmailToSync", this.getDurationOfEmailToSync());
        writer.writeEnumSetValue("easServices", this.getEasServices());
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
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountName", value);
    }
    /**
     * Sets the authenticationMethod property value. Authentication method for this Email profile. Possible values are: usernameAndPassword, certificate, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final EasAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the blockMovingMessagesToOtherEmailAccounts property value. Indicates whether or not to block moving messages to other email accounts.
     * @param value Value to set for the blockMovingMessagesToOtherEmailAccounts property.
     */
    public void setBlockMovingMessagesToOtherEmailAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockMovingMessagesToOtherEmailAccounts", value);
    }
    /**
     * Sets the blockSendingEmailFromThirdPartyApps property value. Indicates whether or not to block sending email from third party apps.
     * @param value Value to set for the blockSendingEmailFromThirdPartyApps property.
     */
    public void setBlockSendingEmailFromThirdPartyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockSendingEmailFromThirdPartyApps", value);
    }
    /**
     * Sets the blockSyncingRecentlyUsedEmailAddresses property value. Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.
     * @param value Value to set for the blockSyncingRecentlyUsedEmailAddresses property.
     */
    public void setBlockSyncingRecentlyUsedEmailAddresses(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockSyncingRecentlyUsedEmailAddresses", value);
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     */
    public void setDerivedCredentialSettings(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this.backingStore.set("derivedCredentialSettings", value);
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     */
    public void setDurationOfEmailToSync(@jakarta.annotation.Nullable final EmailSyncDuration value) {
        this.backingStore.set("durationOfEmailToSync", value);
    }
    /**
     * Sets the easServices property value. Exchange data to sync. Possible values are: none, calendars, contacts, email, notes, reminders.
     * @param value Value to set for the easServices property.
     */
    public void setEasServices(@jakarta.annotation.Nullable final EnumSet<EasServices> value) {
        this.backingStore.set("easServices", value);
    }
    /**
     * Sets the easServicesUserOverrideEnabled property value. Allow users to change sync settings.
     * @param value Value to set for the easServicesUserOverrideEnabled property.
     */
    public void setEasServicesUserOverrideEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("easServicesUserOverrideEnabled", value);
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     */
    public void setEmailAddressSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.backingStore.set("emailAddressSource", value);
    }
    /**
     * Sets the encryptionCertificateType property value. Encryption Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @param value Value to set for the encryptionCertificateType property.
     */
    public void setEncryptionCertificateType(@jakarta.annotation.Nullable final EmailCertificateType value) {
        this.backingStore.set("encryptionCertificateType", value);
    }
    /**
     * Sets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostName", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final IosCertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
    }
    /**
     * Sets the perAppVPNProfileId property value. Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client
     * @param value Value to set for the perAppVPNProfileId property.
     */
    public void setPerAppVPNProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("perAppVPNProfileId", value);
    }
    /**
     * Sets the requireSmime property value. Indicates whether or not to use S/MIME certificate.
     * @param value Value to set for the requireSmime property.
     */
    public void setRequireSmime(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireSmime", value);
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     */
    public void setRequireSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireSsl", value);
    }
    /**
     * Sets the signingCertificateType property value. Signing Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     * @param value Value to set for the signingCertificateType property.
     */
    public void setSigningCertificateType(@jakarta.annotation.Nullable final EmailCertificateType value) {
        this.backingStore.set("signingCertificateType", value);
    }
    /**
     * Sets the smimeEnablePerMessageSwitch property value. Indicates whether or not to allow unencrypted emails.
     * @param value Value to set for the smimeEnablePerMessageSwitch property.
     */
    public void setSmimeEnablePerMessageSwitch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeEnablePerMessageSwitch", value);
    }
    /**
     * Sets the smimeEncryptByDefaultEnabled property value. If set to true S/MIME encryption is enabled by default.
     * @param value Value to set for the smimeEncryptByDefaultEnabled property.
     */
    public void setSmimeEncryptByDefaultEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeEncryptByDefaultEnabled", value);
    }
    /**
     * Sets the smimeEncryptByDefaultUserOverrideEnabled property value. If set to true, the user can toggle the encryption by default setting.
     * @param value Value to set for the smimeEncryptByDefaultUserOverrideEnabled property.
     */
    public void setSmimeEncryptByDefaultUserOverrideEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeEncryptByDefaultUserOverrideEnabled", value);
    }
    /**
     * Sets the smimeEncryptionCertificate property value. S/MIME encryption certificate.
     * @param value Value to set for the smimeEncryptionCertificate property.
     */
    public void setSmimeEncryptionCertificate(@jakarta.annotation.Nullable final IosCertificateProfile value) {
        this.backingStore.set("smimeEncryptionCertificate", value);
    }
    /**
     * Sets the smimeEncryptionCertificateUserOverrideEnabled property value. If set to true the user can select the S/MIME encryption identity.
     * @param value Value to set for the smimeEncryptionCertificateUserOverrideEnabled property.
     */
    public void setSmimeEncryptionCertificateUserOverrideEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeEncryptionCertificateUserOverrideEnabled", value);
    }
    /**
     * Sets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @param value Value to set for the smimeSigningCertificate property.
     */
    public void setSmimeSigningCertificate(@jakarta.annotation.Nullable final IosCertificateProfile value) {
        this.backingStore.set("smimeSigningCertificate", value);
    }
    /**
     * Sets the smimeSigningCertificateUserOverrideEnabled property value. If set to true, the user can select the signing identity.
     * @param value Value to set for the smimeSigningCertificateUserOverrideEnabled property.
     */
    public void setSmimeSigningCertificateUserOverrideEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeSigningCertificateUserOverrideEnabled", value);
    }
    /**
     * Sets the smimeSigningEnabled property value. If set to true S/MIME signing is enabled for this account
     * @param value Value to set for the smimeSigningEnabled property.
     */
    public void setSmimeSigningEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeSigningEnabled", value);
    }
    /**
     * Sets the smimeSigningUserOverrideEnabled property value. If set to true, the user can toggle S/MIME signing on or off.
     * @param value Value to set for the smimeSigningUserOverrideEnabled property.
     */
    public void setSmimeSigningUserOverrideEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smimeSigningUserOverrideEnabled", value);
    }
    /**
     * Sets the useOAuth property value. Specifies whether the connection should use OAuth for authentication.
     * @param value Value to set for the useOAuth property.
     */
    public void setUseOAuth(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useOAuth", value);
    }
}

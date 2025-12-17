package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing configurations in this profile you can instruct the native email client on KNOX devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidEasEmailProfileConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidEasEmailProfileConfiguration} and sets the default values.
     */
    public AndroidEasEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidEasEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidEasEmailProfileConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidEasEmailProfileConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidEasEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.backingStore.get("accountName");
    }
    /**
     * Gets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @return a {@link EasAuthenticationMethod}
     */
    @jakarta.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomDomainName() {
        return this.backingStore.get("customDomainName");
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
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a {@link UserEmailSource}
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.backingStore.get("emailAddressSource");
    }
    /**
     * Gets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @return a {@link EmailSyncSchedule}
     */
    @jakarta.annotation.Nullable
    public EmailSyncSchedule getEmailSyncSchedule() {
        return this.backingStore.get("emailSyncSchedule");
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
        deserializerMap.put("customDomainName", (n) -> { this.setCustomDomainName(n.getStringValue()); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration::forValue)); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource::forValue)); });
        deserializerMap.put("emailSyncSchedule", (n) -> { this.setEmailSyncSchedule(n.getEnumValue(EmailSyncSchedule::forValue)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("requireSmime", (n) -> { this.setRequireSmime(n.getBooleanValue()); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("smimeSigningCertificate", (n) -> { this.setSmimeSigningCertificate(n.getObjectValue(AndroidCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("syncCalendar", (n) -> { this.setSyncCalendar(n.getBooleanValue()); });
        deserializerMap.put("syncContacts", (n) -> { this.setSyncContacts(n.getBooleanValue()); });
        deserializerMap.put("syncNotes", (n) -> { this.setSyncNotes(n.getBooleanValue()); });
        deserializerMap.put("syncTasks", (n) -> { this.setSyncTasks(n.getBooleanValue()); });
        deserializerMap.put("userDomainNameSource", (n) -> { this.setUserDomainNameSource(n.getEnumValue(DomainNameSource::forValue)); });
        deserializerMap.put("usernameSource", (n) -> { this.setUsernameSource(n.getEnumValue(AndroidUsernameSource::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostName property value. Exchange location (URL) that the native mail app connects to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.backingStore.get("hostName");
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a {@link AndroidCertificateProfileBase}
     */
    @jakarta.annotation.Nullable
    public AndroidCertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
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
     * Gets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @return a {@link AndroidCertificateProfileBase}
     */
    @jakarta.annotation.Nullable
    public AndroidCertificateProfileBase getSmimeSigningCertificate() {
        return this.backingStore.get("smimeSigningCertificate");
    }
    /**
     * Gets the syncCalendar property value. Toggles syncing the calendar. If set to false calendar is turned off on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this.backingStore.get("syncCalendar");
    }
    /**
     * Gets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncContacts() {
        return this.backingStore.get("syncContacts");
    }
    /**
     * Gets the syncNotes property value. Toggles syncing notes. If set to false notes are turned off on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncNotes() {
        return this.backingStore.get("syncNotes");
    }
    /**
     * Gets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncTasks() {
        return this.backingStore.get("syncTasks");
    }
    /**
     * Gets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. The possible values are: fullDomainName, netBiosDomainName.
     * @return a {@link DomainNameSource}
     */
    @jakarta.annotation.Nullable
    public DomainNameSource getUserDomainNameSource() {
        return this.backingStore.get("userDomainNameSource");
    }
    /**
     * Gets the usernameSource property value. Android username source.
     * @return a {@link AndroidUsernameSource}
     */
    @jakarta.annotation.Nullable
    public AndroidUsernameSource getUsernameSource() {
        return this.backingStore.get("usernameSource");
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
        writer.writeStringValue("customDomainName", this.getCustomDomainName());
        writer.writeEnumValue("durationOfEmailToSync", this.getDurationOfEmailToSync());
        writer.writeEnumValue("emailAddressSource", this.getEmailAddressSource());
        writer.writeEnumValue("emailSyncSchedule", this.getEmailSyncSchedule());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeBooleanValue("requireSmime", this.getRequireSmime());
        writer.writeBooleanValue("requireSsl", this.getRequireSsl());
        writer.writeObjectValue("smimeSigningCertificate", this.getSmimeSigningCertificate());
        writer.writeBooleanValue("syncCalendar", this.getSyncCalendar());
        writer.writeBooleanValue("syncContacts", this.getSyncContacts());
        writer.writeBooleanValue("syncNotes", this.getSyncNotes());
        writer.writeBooleanValue("syncTasks", this.getSyncTasks());
        writer.writeEnumValue("userDomainNameSource", this.getUserDomainNameSource());
        writer.writeEnumValue("usernameSource", this.getUsernameSource());
    }
    /**
     * Sets the accountName property value. Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountName", value);
    }
    /**
     * Sets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final EasAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @param value Value to set for the customDomainName property.
     */
    public void setCustomDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customDomainName", value);
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     */
    public void setDurationOfEmailToSync(@jakarta.annotation.Nullable final EmailSyncDuration value) {
        this.backingStore.set("durationOfEmailToSync", value);
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     */
    public void setEmailAddressSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.backingStore.set("emailAddressSource", value);
    }
    /**
     * Sets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @param value Value to set for the emailSyncSchedule property.
     */
    public void setEmailSyncSchedule(@jakarta.annotation.Nullable final EmailSyncSchedule value) {
        this.backingStore.set("emailSyncSchedule", value);
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostName", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidCertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
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
     * Sets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @param value Value to set for the smimeSigningCertificate property.
     */
    public void setSmimeSigningCertificate(@jakarta.annotation.Nullable final AndroidCertificateProfileBase value) {
        this.backingStore.set("smimeSigningCertificate", value);
    }
    /**
     * Sets the syncCalendar property value. Toggles syncing the calendar. If set to false calendar is turned off on the device.
     * @param value Value to set for the syncCalendar property.
     */
    public void setSyncCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncCalendar", value);
    }
    /**
     * Sets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @param value Value to set for the syncContacts property.
     */
    public void setSyncContacts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncContacts", value);
    }
    /**
     * Sets the syncNotes property value. Toggles syncing notes. If set to false notes are turned off on the device.
     * @param value Value to set for the syncNotes property.
     */
    public void setSyncNotes(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncNotes", value);
    }
    /**
     * Sets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @param value Value to set for the syncTasks property.
     */
    public void setSyncTasks(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncTasks", value);
    }
    /**
     * Sets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. The possible values are: fullDomainName, netBiosDomainName.
     * @param value Value to set for the userDomainNameSource property.
     */
    public void setUserDomainNameSource(@jakarta.annotation.Nullable final DomainNameSource value) {
        this.backingStore.set("userDomainNameSource", value);
    }
    /**
     * Sets the usernameSource property value. Android username source.
     * @param value Value to set for the usernameSource property.
     */
    public void setUsernameSource(@jakarta.annotation.Nullable final AndroidUsernameSource value) {
        this.backingStore.set("usernameSource", value);
    }
}

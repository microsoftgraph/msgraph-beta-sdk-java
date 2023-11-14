package com.microsoft.graph.models;

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
     * Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     */
    private String accountName;
    /**
     * Exchange Active Sync authentication method.
     */
    private EasAuthenticationMethod authenticationMethod;
    /**
     * Custom domain name value used while generating an email profile before installing on the device.
     */
    private String customDomainName;
    /**
     * Possible values for email sync duration.
     */
    private EmailSyncDuration durationOfEmailToSync;
    /**
     * Possible values for username source or email source.
     */
    private UserEmailSource emailAddressSource;
    /**
     * Possible values for email sync schedule.
     */
    private EmailSyncSchedule emailSyncSchedule;
    /**
     * Exchange location (URL) that the native mail app connects to.
     */
    private String hostName;
    /**
     * Identity certificate.
     */
    private AndroidCertificateProfileBase identityCertificate;
    /**
     * Indicates whether or not to use S/MIME certificate.
     */
    private Boolean requireSmime;
    /**
     * Indicates whether or not to use SSL.
     */
    private Boolean requireSsl;
    /**
     * S/MIME signing certificate.
     */
    private AndroidCertificateProfileBase smimeSigningCertificate;
    /**
     * Toggles syncing the calendar. If set to false calendar is turned off on the device.
     */
    private Boolean syncCalendar;
    /**
     * Toggles syncing contacts. If set to false contacts are turned off on the device.
     */
    private Boolean syncContacts;
    /**
     * Toggles syncing notes. If set to false notes are turned off on the device.
     */
    private Boolean syncNotes;
    /**
     * Toggles syncing tasks. If set to false tasks are turned off on the device.
     */
    private Boolean syncTasks;
    /**
     * UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     */
    private DomainNameSource userDomainNameSource;
    /**
     * Android username source.
     */
    private AndroidUsernameSource usernameSource;
    /**
     * Instantiates a new AndroidEasEmailProfileConfiguration and sets the default values.
     */
    public AndroidEasEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidEasEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidEasEmailProfileConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidEasEmailProfileConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidEasEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Gets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @return a EasAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomDomainName() {
        return this.customDomainName;
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a EmailSyncDuration
     */
    @jakarta.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this.durationOfEmailToSync;
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a UserEmailSource
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.emailAddressSource;
    }
    /**
     * Gets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @return a EmailSyncSchedule
     */
    @jakarta.annotation.Nullable
    public EmailSyncSchedule getEmailSyncSchedule() {
        return this.emailSyncSchedule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod.class)); });
        deserializerMap.put("customDomainName", (n) -> { this.setCustomDomainName(n.getStringValue()); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
        deserializerMap.put("emailSyncSchedule", (n) -> { this.setEmailSyncSchedule(n.getEnumValue(EmailSyncSchedule.class)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("requireSmime", (n) -> { this.setRequireSmime(n.getBooleanValue()); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("smimeSigningCertificate", (n) -> { this.setSmimeSigningCertificate(n.getObjectValue(AndroidCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("syncCalendar", (n) -> { this.setSyncCalendar(n.getBooleanValue()); });
        deserializerMap.put("syncContacts", (n) -> { this.setSyncContacts(n.getBooleanValue()); });
        deserializerMap.put("syncNotes", (n) -> { this.setSyncNotes(n.getBooleanValue()); });
        deserializerMap.put("syncTasks", (n) -> { this.setSyncTasks(n.getBooleanValue()); });
        deserializerMap.put("userDomainNameSource", (n) -> { this.setUserDomainNameSource(n.getEnumValue(DomainNameSource.class)); });
        deserializerMap.put("usernameSource", (n) -> { this.setUsernameSource(n.getEnumValue(AndroidUsernameSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hostName property value. Exchange location (URL) that the native mail app connects to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a AndroidCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public AndroidCertificateProfileBase getIdentityCertificate() {
        return this.identityCertificate;
    }
    /**
     * Gets the requireSmime property value. Indicates whether or not to use S/MIME certificate.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSmime() {
        return this.requireSmime;
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.requireSsl;
    }
    /**
     * Gets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @return a AndroidCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public AndroidCertificateProfileBase getSmimeSigningCertificate() {
        return this.smimeSigningCertificate;
    }
    /**
     * Gets the syncCalendar property value. Toggles syncing the calendar. If set to false calendar is turned off on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this.syncCalendar;
    }
    /**
     * Gets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncContacts() {
        return this.syncContacts;
    }
    /**
     * Gets the syncNotes property value. Toggles syncing notes. If set to false notes are turned off on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncNotes() {
        return this.syncNotes;
    }
    /**
     * Gets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncTasks() {
        return this.syncTasks;
    }
    /**
     * Gets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @return a DomainNameSource
     */
    @jakarta.annotation.Nullable
    public DomainNameSource getUserDomainNameSource() {
        return this.userDomainNameSource;
    }
    /**
     * Gets the usernameSource property value. Android username source.
     * @return a AndroidUsernameSource
     */
    @jakarta.annotation.Nullable
    public AndroidUsernameSource getUsernameSource() {
        return this.usernameSource;
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
        this.accountName = value;
    }
    /**
     * Sets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final EasAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @param value Value to set for the customDomainName property.
     */
    public void setCustomDomainName(@jakarta.annotation.Nullable final String value) {
        this.customDomainName = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     */
    public void setDurationOfEmailToSync(@jakarta.annotation.Nullable final EmailSyncDuration value) {
        this.durationOfEmailToSync = value;
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     */
    public void setEmailAddressSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.emailAddressSource = value;
    }
    /**
     * Sets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @param value Value to set for the emailSyncSchedule property.
     */
    public void setEmailSyncSchedule(@jakarta.annotation.Nullable final EmailSyncSchedule value) {
        this.emailSyncSchedule = value;
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.hostName = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidCertificateProfileBase value) {
        this.identityCertificate = value;
    }
    /**
     * Sets the requireSmime property value. Indicates whether or not to use S/MIME certificate.
     * @param value Value to set for the requireSmime property.
     */
    public void setRequireSmime(@jakarta.annotation.Nullable final Boolean value) {
        this.requireSmime = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     */
    public void setRequireSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.requireSsl = value;
    }
    /**
     * Sets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @param value Value to set for the smimeSigningCertificate property.
     */
    public void setSmimeSigningCertificate(@jakarta.annotation.Nullable final AndroidCertificateProfileBase value) {
        this.smimeSigningCertificate = value;
    }
    /**
     * Sets the syncCalendar property value. Toggles syncing the calendar. If set to false calendar is turned off on the device.
     * @param value Value to set for the syncCalendar property.
     */
    public void setSyncCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.syncCalendar = value;
    }
    /**
     * Sets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @param value Value to set for the syncContacts property.
     */
    public void setSyncContacts(@jakarta.annotation.Nullable final Boolean value) {
        this.syncContacts = value;
    }
    /**
     * Sets the syncNotes property value. Toggles syncing notes. If set to false notes are turned off on the device.
     * @param value Value to set for the syncNotes property.
     */
    public void setSyncNotes(@jakarta.annotation.Nullable final Boolean value) {
        this.syncNotes = value;
    }
    /**
     * Sets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @param value Value to set for the syncTasks property.
     */
    public void setSyncTasks(@jakarta.annotation.Nullable final Boolean value) {
        this.syncTasks = value;
    }
    /**
     * Sets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @param value Value to set for the userDomainNameSource property.
     */
    public void setUserDomainNameSource(@jakarta.annotation.Nullable final DomainNameSource value) {
        this.userDomainNameSource = value;
    }
    /**
     * Sets the usernameSource property value. Android username source.
     * @param value Value to set for the usernameSource property.
     */
    public void setUsernameSource(@jakarta.annotation.Nullable final AndroidUsernameSource value) {
        this.usernameSource = value;
    }
}

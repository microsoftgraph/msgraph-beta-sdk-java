package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidEasEmailProfileConfiguration extends DeviceConfiguration implements Parsable {
    /** Exchange ActiveSync account name, displayed to users as name of EAS (this) profile. */
    private String _accountName;
    /** Exchange Active Sync authentication method. */
    private EasAuthenticationMethod _authenticationMethod;
    /** Custom domain name value used while generating an email profile before installing on the device. */
    private String _customDomainName;
    /** Possible values for email sync duration. */
    private EmailSyncDuration _durationOfEmailToSync;
    /** Possible values for username source or email source. */
    private UserEmailSource _emailAddressSource;
    /** Possible values for email sync schedule. */
    private EmailSyncSchedule _emailSyncSchedule;
    /** Exchange location (URL) that the native mail app connects to. */
    private String _hostName;
    /** Identity certificate. */
    private AndroidCertificateProfileBase _identityCertificate;
    /** Indicates whether or not to use S/MIME certificate. */
    private Boolean _requireSmime;
    /** Indicates whether or not to use SSL. */
    private Boolean _requireSsl;
    /** S/MIME signing certificate. */
    private AndroidCertificateProfileBase _smimeSigningCertificate;
    /** Toggles syncing the calendar. If set to false calendar is turned off on the device. */
    private Boolean _syncCalendar;
    /** Toggles syncing contacts. If set to false contacts are turned off on the device. */
    private Boolean _syncContacts;
    /** Toggles syncing notes. If set to false notes are turned off on the device. */
    private Boolean _syncNotes;
    /** Toggles syncing tasks. If set to false tasks are turned off on the device. */
    private Boolean _syncTasks;
    /** UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName. */
    private DomainNameSource _userDomainNameSource;
    /** Android username source. */
    private AndroidUsernameSource _usernameSource;
    /**
     * Instantiates a new AndroidEasEmailProfileConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static AndroidEasEmailProfileConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidEasEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this._accountName;
    }
    /**
     * Gets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @return a easAuthenticationMethod
     */
    @javax.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomDomainName() {
        return this._customDomainName;
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
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a userEmailSource
     */
    @javax.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this._emailAddressSource;
    }
    /**
     * Gets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @return a emailSyncSchedule
     */
    @javax.annotation.Nullable
    public EmailSyncSchedule getEmailSyncSchedule() {
        return this._emailSyncSchedule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidEasEmailProfileConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountName", (n) -> { currentObject.setAccountName(n.getStringValue()); });
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod.class)); });
            this.put("customDomainName", (n) -> { currentObject.setCustomDomainName(n.getStringValue()); });
            this.put("durationOfEmailToSync", (n) -> { currentObject.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
            this.put("emailAddressSource", (n) -> { currentObject.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
            this.put("emailSyncSchedule", (n) -> { currentObject.setEmailSyncSchedule(n.getEnumValue(EmailSyncSchedule.class)); });
            this.put("hostName", (n) -> { currentObject.setHostName(n.getStringValue()); });
            this.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(AndroidCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("requireSmime", (n) -> { currentObject.setRequireSmime(n.getBooleanValue()); });
            this.put("requireSsl", (n) -> { currentObject.setRequireSsl(n.getBooleanValue()); });
            this.put("smimeSigningCertificate", (n) -> { currentObject.setSmimeSigningCertificate(n.getObjectValue(AndroidCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("syncCalendar", (n) -> { currentObject.setSyncCalendar(n.getBooleanValue()); });
            this.put("syncContacts", (n) -> { currentObject.setSyncContacts(n.getBooleanValue()); });
            this.put("syncNotes", (n) -> { currentObject.setSyncNotes(n.getBooleanValue()); });
            this.put("syncTasks", (n) -> { currentObject.setSyncTasks(n.getBooleanValue()); });
            this.put("userDomainNameSource", (n) -> { currentObject.setUserDomainNameSource(n.getEnumValue(DomainNameSource.class)); });
            this.put("usernameSource", (n) -> { currentObject.setUsernameSource(n.getEnumValue(AndroidUsernameSource.class)); });
        }};
    }
    /**
     * Gets the hostName property value. Exchange location (URL) that the native mail app connects to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostName() {
        return this._hostName;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a androidCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidCertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
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
     * Gets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @return a androidCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidCertificateProfileBase getSmimeSigningCertificate() {
        return this._smimeSigningCertificate;
    }
    /**
     * Gets the syncCalendar property value. Toggles syncing the calendar. If set to false calendar is turned off on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this._syncCalendar;
    }
    /**
     * Gets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncContacts() {
        return this._syncContacts;
    }
    /**
     * Gets the syncNotes property value. Toggles syncing notes. If set to false notes are turned off on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncNotes() {
        return this._syncNotes;
    }
    /**
     * Gets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncTasks() {
        return this._syncTasks;
    }
    /**
     * Gets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @return a domainNameSource
     */
    @javax.annotation.Nullable
    public DomainNameSource getUserDomainNameSource() {
        return this._userDomainNameSource;
    }
    /**
     * Gets the usernameSource property value. Android username source.
     * @return a androidUsernameSource
     */
    @javax.annotation.Nullable
    public AndroidUsernameSource getUsernameSource() {
        return this._usernameSource;
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
     * @return a void
     */
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this._accountName = value;
    }
    /**
     * Sets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final EasAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @param value Value to set for the customDomainName property.
     * @return a void
     */
    public void setCustomDomainName(@javax.annotation.Nullable final String value) {
        this._customDomainName = value;
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
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     * @return a void
     */
    public void setEmailAddressSource(@javax.annotation.Nullable final UserEmailSource value) {
        this._emailAddressSource = value;
    }
    /**
     * Sets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @param value Value to set for the emailSyncSchedule property.
     * @return a void
     */
    public void setEmailSyncSchedule(@javax.annotation.Nullable final EmailSyncSchedule value) {
        this._emailSyncSchedule = value;
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the native mail app connects to.
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
    public void setIdentityCertificate(@javax.annotation.Nullable final AndroidCertificateProfileBase value) {
        this._identityCertificate = value;
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
     * Sets the smimeSigningCertificate property value. S/MIME signing certificate.
     * @param value Value to set for the smimeSigningCertificate property.
     * @return a void
     */
    public void setSmimeSigningCertificate(@javax.annotation.Nullable final AndroidCertificateProfileBase value) {
        this._smimeSigningCertificate = value;
    }
    /**
     * Sets the syncCalendar property value. Toggles syncing the calendar. If set to false calendar is turned off on the device.
     * @param value Value to set for the syncCalendar property.
     * @return a void
     */
    public void setSyncCalendar(@javax.annotation.Nullable final Boolean value) {
        this._syncCalendar = value;
    }
    /**
     * Sets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @param value Value to set for the syncContacts property.
     * @return a void
     */
    public void setSyncContacts(@javax.annotation.Nullable final Boolean value) {
        this._syncContacts = value;
    }
    /**
     * Sets the syncNotes property value. Toggles syncing notes. If set to false notes are turned off on the device.
     * @param value Value to set for the syncNotes property.
     * @return a void
     */
    public void setSyncNotes(@javax.annotation.Nullable final Boolean value) {
        this._syncNotes = value;
    }
    /**
     * Sets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @param value Value to set for the syncTasks property.
     * @return a void
     */
    public void setSyncTasks(@javax.annotation.Nullable final Boolean value) {
        this._syncTasks = value;
    }
    /**
     * Sets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @param value Value to set for the userDomainNameSource property.
     * @return a void
     */
    public void setUserDomainNameSource(@javax.annotation.Nullable final DomainNameSource value) {
        this._userDomainNameSource = value;
    }
    /**
     * Sets the usernameSource property value. Android username source.
     * @param value Value to set for the usernameSource property.
     * @return a void
     */
    public void setUsernameSource(@javax.annotation.Nullable final AndroidUsernameSource value) {
        this._usernameSource = value;
    }
}

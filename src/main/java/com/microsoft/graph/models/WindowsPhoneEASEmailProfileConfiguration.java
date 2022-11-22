package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhoneEASEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements Parsable {
    /** Account name. */
    private String _accountName;
    /** Value indicating whether this policy only applies to Windows 8.1. This property is read-only. */
    private Boolean _applyOnlyToWindowsPhone81;
    /** Possible values for email sync duration. */
    private EmailSyncDuration _durationOfEmailToSync;
    /** Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress. */
    private UserEmailSource _emailAddressSource;
    /** Possible values for email sync schedule. */
    private EmailSyncSchedule _emailSyncSchedule;
    /** Exchange location that (URL) that the native mail app connects to. */
    private String _hostName;
    /** Indicates whether or not to use SSL. */
    private Boolean _requireSsl;
    /** Whether or not to sync the calendar. */
    private Boolean _syncCalendar;
    /** Whether or not to sync contacts. */
    private Boolean _syncContacts;
    /** Whether or not to sync tasks. */
    private Boolean _syncTasks;
    /**
     * Instantiates a new WindowsPhoneEASEmailProfileConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsPhoneEASEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhoneEASEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhoneEASEmailProfileConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsPhoneEASEmailProfileConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhoneEASEmailProfileConfiguration();
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
     * Gets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyOnlyToWindowsPhone81() {
        return this._applyOnlyToWindowsPhone81;
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
     * Gets the emailAddressSource property value. Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("applyOnlyToWindowsPhone81", (n) -> { this.setApplyOnlyToWindowsPhone81(n.getBooleanValue()); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
        deserializerMap.put("emailSyncSchedule", (n) -> { this.setEmailSyncSchedule(n.getEnumValue(EmailSyncSchedule.class)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("syncCalendar", (n) -> { this.setSyncCalendar(n.getBooleanValue()); });
        deserializerMap.put("syncContacts", (n) -> { this.setSyncContacts(n.getBooleanValue()); });
        deserializerMap.put("syncTasks", (n) -> { this.setSyncTasks(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSsl() {
        return this._requireSsl;
    }
    /**
     * Gets the syncCalendar property value. Whether or not to sync the calendar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this._syncCalendar;
    }
    /**
     * Gets the syncContacts property value. Whether or not to sync contacts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncContacts() {
        return this._syncContacts;
    }
    /**
     * Gets the syncTasks property value. Whether or not to sync tasks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncTasks() {
        return this._syncTasks;
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
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeEnumValue("durationOfEmailToSync", this.getDurationOfEmailToSync());
        writer.writeEnumValue("emailAddressSource", this.getEmailAddressSource());
        writer.writeEnumValue("emailSyncSchedule", this.getEmailSyncSchedule());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeBooleanValue("requireSsl", this.getRequireSsl());
        writer.writeBooleanValue("syncCalendar", this.getSyncCalendar());
        writer.writeBooleanValue("syncContacts", this.getSyncContacts());
        writer.writeBooleanValue("syncTasks", this.getSyncTasks());
    }
    /**
     * Sets the accountName property value. Account name.
     * @param value Value to set for the accountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this._accountName = value;
    }
    /**
     * Sets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindowsPhone81 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyOnlyToWindowsPhone81(@javax.annotation.Nullable final Boolean value) {
        this._applyOnlyToWindowsPhone81 = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationOfEmailToSync(@javax.annotation.Nullable final EmailSyncDuration value) {
        this._durationOfEmailToSync = value;
    }
    /**
     * Sets the emailAddressSource property value. Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
     * @param value Value to set for the emailAddressSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddressSource(@javax.annotation.Nullable final UserEmailSource value) {
        this._emailAddressSource = value;
    }
    /**
     * Sets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @param value Value to set for the emailSyncSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSyncSchedule(@javax.annotation.Nullable final EmailSyncSchedule value) {
        this._emailSyncSchedule = value;
    }
    /**
     * Sets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostName(@javax.annotation.Nullable final String value) {
        this._hostName = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireSsl(@javax.annotation.Nullable final Boolean value) {
        this._requireSsl = value;
    }
    /**
     * Sets the syncCalendar property value. Whether or not to sync the calendar.
     * @param value Value to set for the syncCalendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncCalendar(@javax.annotation.Nullable final Boolean value) {
        this._syncCalendar = value;
    }
    /**
     * Sets the syncContacts property value. Whether or not to sync contacts.
     * @param value Value to set for the syncContacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncContacts(@javax.annotation.Nullable final Boolean value) {
        this._syncContacts = value;
    }
    /**
     * Sets the syncTasks property value. Whether or not to sync tasks.
     * @param value Value to set for the syncTasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncTasks(@javax.annotation.Nullable final Boolean value) {
        this._syncTasks = value;
    }
}

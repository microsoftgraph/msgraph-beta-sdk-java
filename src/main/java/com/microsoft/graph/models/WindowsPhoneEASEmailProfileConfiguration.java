package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing configurations in this profile you can instruct the native email client on Windows Phone to communicate with an Exchange server and get email, contacts, calendar, and tasks. Furthermore, you can also specify how much email to sync and how often the device should sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPhoneEASEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements Parsable {
    /**
     * Instantiates a new WindowsPhoneEASEmailProfileConfiguration and sets the default values.
     */
    public WindowsPhoneEASEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhoneEASEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhoneEASEmailProfileConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhoneEASEmailProfileConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhoneEASEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Account name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.BackingStore.get("accountName");
    }
    /**
     * Gets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyOnlyToWindowsPhone81() {
        return this.BackingStore.get("applyOnlyToWindowsPhone81");
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a EmailSyncDuration
     */
    @jakarta.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this.BackingStore.get("durationOfEmailToSync");
    }
    /**
     * Gets the emailAddressSource property value. Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
     * @return a UserEmailSource
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.BackingStore.get("emailAddressSource");
    }
    /**
     * Gets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @return a EmailSyncSchedule
     */
    @jakarta.annotation.Nullable
    public EmailSyncSchedule getEmailSyncSchedule() {
        return this.BackingStore.get("emailSyncSchedule");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.BackingStore.get("hostName");
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.BackingStore.get("requireSsl");
    }
    /**
     * Gets the syncCalendar property value. Whether or not to sync the calendar.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this.BackingStore.get("syncCalendar");
    }
    /**
     * Gets the syncContacts property value. Whether or not to sync contacts.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncContacts() {
        return this.BackingStore.get("syncContacts");
    }
    /**
     * Gets the syncTasks property value. Whether or not to sync tasks.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncTasks() {
        return this.BackingStore.get("syncTasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("accountName", value);
    }
    /**
     * Sets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindowsPhone81 property.
     */
    public void setApplyOnlyToWindowsPhone81(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("applyOnlyToWindowsPhone81", value);
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     */
    public void setDurationOfEmailToSync(@jakarta.annotation.Nullable final EmailSyncDuration value) {
        this.BackingStore.set("durationOfEmailToSync", value);
    }
    /**
     * Sets the emailAddressSource property value. Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
     * @param value Value to set for the emailAddressSource property.
     */
    public void setEmailAddressSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.BackingStore.set("emailAddressSource", value);
    }
    /**
     * Sets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @param value Value to set for the emailSyncSchedule property.
     */
    public void setEmailSyncSchedule(@jakarta.annotation.Nullable final EmailSyncSchedule value) {
        this.BackingStore.set("emailSyncSchedule", value);
    }
    /**
     * Sets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("hostName", value);
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     */
    public void setRequireSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("requireSsl", value);
    }
    /**
     * Sets the syncCalendar property value. Whether or not to sync the calendar.
     * @param value Value to set for the syncCalendar property.
     */
    public void setSyncCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("syncCalendar", value);
    }
    /**
     * Sets the syncContacts property value. Whether or not to sync contacts.
     * @param value Value to set for the syncContacts property.
     */
    public void setSyncContacts(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("syncContacts", value);
    }
    /**
     * Sets the syncTasks property value. Whether or not to sync tasks.
     * @param value Value to set for the syncTasks property.
     */
    public void setSyncTasks(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("syncTasks", value);
    }
}

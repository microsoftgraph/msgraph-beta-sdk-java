package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing configurations in this profile you can instruct the native email client (Outlook) on Windows 10 devices to communicate with an Exchange server and get email, contacts, calendar, and tasks. Furthermore, you can also specify how much email to sync and how often the device should sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10EasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements Parsable {
    /**
     * Instantiates a new {@link Windows10EasEmailProfileConfiguration} and sets the default values.
     */
    public Windows10EasEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EasEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows10EasEmailProfileConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static Windows10EasEmailProfileConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EasEmailProfileConfiguration();
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
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration::forValue)); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource::forValue)); });
        deserializerMap.put("emailSyncSchedule", (n) -> { this.setEmailSyncSchedule(n.getEnumValue(EmailSyncSchedule::forValue)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("syncCalendar", (n) -> { this.setSyncCalendar(n.getBooleanValue()); });
        deserializerMap.put("syncContacts", (n) -> { this.setSyncContacts(n.getBooleanValue()); });
        deserializerMap.put("syncTasks", (n) -> { this.setSyncTasks(n.getBooleanValue()); });
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
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.backingStore.get("requireSsl");
    }
    /**
     * Gets the syncCalendar property value. Whether or not to sync the calendar.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this.backingStore.get("syncCalendar");
    }
    /**
     * Gets the syncContacts property value. Whether or not to sync contacts.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncContacts() {
        return this.backingStore.get("syncContacts");
    }
    /**
     * Gets the syncTasks property value. Whether or not to sync tasks.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncTasks() {
        return this.backingStore.get("syncTasks");
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
        this.backingStore.set("accountName", value);
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
     * Sets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostName", value);
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     */
    public void setRequireSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireSsl", value);
    }
    /**
     * Sets the syncCalendar property value. Whether or not to sync the calendar.
     * @param value Value to set for the syncCalendar property.
     */
    public void setSyncCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncCalendar", value);
    }
    /**
     * Sets the syncContacts property value. Whether or not to sync contacts.
     * @param value Value to set for the syncContacts property.
     */
    public void setSyncContacts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncContacts", value);
    }
    /**
     * Sets the syncTasks property value. Whether or not to sync tasks.
     * @param value Value to set for the syncTasks property.
     */
    public void setSyncTasks(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncTasks", value);
    }
}

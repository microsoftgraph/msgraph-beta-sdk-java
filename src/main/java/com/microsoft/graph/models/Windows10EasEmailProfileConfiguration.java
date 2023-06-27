package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements Parsable {
    /**
     * Account name.
     */
    private String accountName;
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
     * Exchange location that (URL) that the native mail app connects to.
     */
    private String hostName;
    /**
     * Indicates whether or not to use SSL.
     */
    private Boolean requireSsl;
    /**
     * Whether or not to sync the calendar.
     */
    private Boolean syncCalendar;
    /**
     * Whether or not to sync contacts.
     */
    private Boolean syncContacts;
    /**
     * Whether or not to sync tasks.
     */
    private Boolean syncTasks;
    /**
     * Instantiates a new Windows10EasEmailProfileConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10EasEmailProfileConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EasEmailProfileConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EasEmailProfileConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10EasEmailProfileConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EasEmailProfileConfiguration();
    }
    /**
     * Gets the accountName property value. Account name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a EmailSyncDuration
     */
    @javax.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this.durationOfEmailToSync;
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a UserEmailSource
     */
    @javax.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.emailAddressSource;
    }
    /**
     * Gets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @return a EmailSyncSchedule
     */
    @javax.annotation.Nullable
    public EmailSyncSchedule getEmailSyncSchedule() {
        return this.emailSyncSchedule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
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
        return this.hostName;
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.requireSsl;
    }
    /**
     * Gets the syncCalendar property value. Whether or not to sync the calendar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this.syncCalendar;
    }
    /**
     * Gets the syncContacts property value. Whether or not to sync contacts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncContacts() {
        return this.syncContacts;
    }
    /**
     * Gets the syncTasks property value. Whether or not to sync tasks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncTasks() {
        return this.syncTasks;
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
        this.accountName = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationOfEmailToSync(@javax.annotation.Nullable final EmailSyncDuration value) {
        this.durationOfEmailToSync = value;
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddressSource(@javax.annotation.Nullable final UserEmailSource value) {
        this.emailAddressSource = value;
    }
    /**
     * Sets the emailSyncSchedule property value. Possible values for email sync schedule.
     * @param value Value to set for the emailSyncSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSyncSchedule(@javax.annotation.Nullable final EmailSyncSchedule value) {
        this.emailSyncSchedule = value;
    }
    /**
     * Sets the hostName property value. Exchange location that (URL) that the native mail app connects to.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostName(@javax.annotation.Nullable final String value) {
        this.hostName = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireSsl(@javax.annotation.Nullable final Boolean value) {
        this.requireSsl = value;
    }
    /**
     * Sets the syncCalendar property value. Whether or not to sync the calendar.
     * @param value Value to set for the syncCalendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncCalendar(@javax.annotation.Nullable final Boolean value) {
        this.syncCalendar = value;
    }
    /**
     * Sets the syncContacts property value. Whether or not to sync contacts.
     * @param value Value to set for the syncContacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncContacts(@javax.annotation.Nullable final Boolean value) {
        this.syncContacts = value;
    }
    /**
     * Sets the syncTasks property value. Whether or not to sync tasks.
     * @param value Value to set for the syncTasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncTasks(@javax.annotation.Nullable final Boolean value) {
        this.syncTasks = value;
    }
}

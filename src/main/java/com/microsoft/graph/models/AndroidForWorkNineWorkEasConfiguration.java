package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing configurations in this profile you can instruct the Nine Work email client on Android For Work devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkNineWorkEasConfiguration extends AndroidForWorkEasEmailProfileBase implements Parsable {
    /**
     * Instantiates a new AndroidForWorkNineWorkEasConfiguration and sets the default values.
     */
    public AndroidForWorkNineWorkEasConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkNineWorkEasConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkNineWorkEasConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkNineWorkEasConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkNineWorkEasConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("syncCalendar", (n) -> { this.setSyncCalendar(n.getBooleanValue()); });
        deserializerMap.put("syncContacts", (n) -> { this.setSyncContacts(n.getBooleanValue()); });
        deserializerMap.put("syncTasks", (n) -> { this.setSyncTasks(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the syncCalendar property value. Toggles syncing the calendar. If set to false the calendar is turned off on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncCalendar() {
        return this.backingStore.get("syncCalendar");
    }
    /**
     * Gets the syncContacts property value. Toggles syncing contacts. If set to false contacts are turned off on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncContacts() {
        return this.backingStore.get("syncContacts");
    }
    /**
     * Gets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @return a Boolean
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
        writer.writeBooleanValue("syncCalendar", this.getSyncCalendar());
        writer.writeBooleanValue("syncContacts", this.getSyncContacts());
        writer.writeBooleanValue("syncTasks", this.getSyncTasks());
    }
    /**
     * Sets the syncCalendar property value. Toggles syncing the calendar. If set to false the calendar is turned off on the device.
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
     * Sets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @param value Value to set for the syncTasks property.
     */
    public void setSyncTasks(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("syncTasks", value);
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileNineWorkEasConfiguration extends AndroidWorkProfileEasEmailProfileBase implements Parsable {
    /** Toggles syncing the calendar. If set to false the calendar is turned off on the device. */
    private Boolean _syncCalendar;
    /** Toggles syncing contacts. If set to false contacts are turned off on the device. */
    private Boolean _syncContacts;
    /** Toggles syncing tasks. If set to false tasks are turned off on the device. */
    private Boolean _syncTasks;
    /**
     * Instantiates a new AndroidWorkProfileNineWorkEasConfiguration and sets the default values.
     * @return a void
     */
    public AndroidWorkProfileNineWorkEasConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileNineWorkEasConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileNineWorkEasConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileNineWorkEasConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileNineWorkEasConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidWorkProfileNineWorkEasConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("syncCalendar", (n) -> { currentObject.setSyncCalendar(n.getBooleanValue()); });
            this.put("syncContacts", (n) -> { currentObject.setSyncContacts(n.getBooleanValue()); });
            this.put("syncTasks", (n) -> { currentObject.setSyncTasks(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the syncCalendar property value. Toggles syncing the calendar. If set to false the calendar is turned off on the device.
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
     * Gets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("syncCalendar", this.getSyncCalendar());
        writer.writeBooleanValue("syncContacts", this.getSyncContacts());
        writer.writeBooleanValue("syncTasks", this.getSyncTasks());
    }
    /**
     * Sets the syncCalendar property value. Toggles syncing the calendar. If set to false the calendar is turned off on the device.
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
     * Sets the syncTasks property value. Toggles syncing tasks. If set to false tasks are turned off on the device.
     * @param value Value to set for the syncTasks property.
     * @return a void
     */
    public void setSyncTasks(@javax.annotation.Nullable final Boolean value) {
        this._syncTasks = value;
    }
}

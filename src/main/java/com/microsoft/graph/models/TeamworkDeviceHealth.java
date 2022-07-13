package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceHealth extends Entity implements Parsable {
    /** The connection property */
    private TeamworkConnection _connection;
    /** Identity of the user who created the device health document. */
    private IdentitySet _createdBy;
    /** The UTC date and time when the device health document was created. */
    private OffsetDateTime _createdDateTime;
    /** Health details about the device hardware. */
    private TeamworkHardwareHealth _hardwareHealth;
    /** Identity of the user who last modified the device health details. */
    private IdentitySet _lastModifiedBy;
    /** The UTC date and time when the device health detail was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The login status of Microsoft Teams, Skype for Business, and Exchange. */
    private TeamworkLoginStatus _loginStatus;
    /** Health details about all peripherals (for example, speaker and microphone) attached to a device. */
    private TeamworkPeripheralsHealth _peripheralsHealth;
    /** Software updates available for the device. */
    private TeamworkSoftwareUpdateHealth _softwareUpdateHealth;
    /**
     * Instantiates a new TeamworkDeviceHealth and sets the default values.
     * @return a void
     */
    public TeamworkDeviceHealth() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkDeviceHealth
     */
    @javax.annotation.Nonnull
    public static TeamworkDeviceHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceHealth();
    }
    /**
     * Gets the connection property value. The connection property
     * @return a teamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getConnection() {
        return this._connection;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device health document.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device health document was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDeviceHealth currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("connection", (n) -> { currentObject.setConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("hardwareHealth", (n) -> { currentObject.setHardwareHealth(n.getObjectValue(TeamworkHardwareHealth::createFromDiscriminatorValue)); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("loginStatus", (n) -> { currentObject.setLoginStatus(n.getObjectValue(TeamworkLoginStatus::createFromDiscriminatorValue)); });
            this.put("peripheralsHealth", (n) -> { currentObject.setPeripheralsHealth(n.getObjectValue(TeamworkPeripheralsHealth::createFromDiscriminatorValue)); });
            this.put("softwareUpdateHealth", (n) -> { currentObject.setSoftwareUpdateHealth(n.getObjectValue(TeamworkSoftwareUpdateHealth::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hardwareHealth property value. Health details about the device hardware.
     * @return a teamworkHardwareHealth
     */
    @javax.annotation.Nullable
    public TeamworkHardwareHealth getHardwareHealth() {
        return this._hardwareHealth;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device health details.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device health detail was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the loginStatus property value. The login status of Microsoft Teams, Skype for Business, and Exchange.
     * @return a teamworkLoginStatus
     */
    @javax.annotation.Nullable
    public TeamworkLoginStatus getLoginStatus() {
        return this._loginStatus;
    }
    /**
     * Gets the peripheralsHealth property value. Health details about all peripherals (for example, speaker and microphone) attached to a device.
     * @return a teamworkPeripheralsHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralsHealth getPeripheralsHealth() {
        return this._peripheralsHealth;
    }
    /**
     * Gets the softwareUpdateHealth property value. Software updates available for the device.
     * @return a teamworkSoftwareUpdateHealth
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateHealth getSoftwareUpdateHealth() {
        return this._softwareUpdateHealth;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connection", this.getConnection());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("hardwareHealth", this.getHardwareHealth());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("loginStatus", this.getLoginStatus());
        writer.writeObjectValue("peripheralsHealth", this.getPeripheralsHealth());
        writer.writeObjectValue("softwareUpdateHealth", this.getSoftwareUpdateHealth());
    }
    /**
     * Sets the connection property value. The connection property
     * @param value Value to set for the connection property.
     * @return a void
     */
    public void setConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this._connection = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device health document.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device health document was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the hardwareHealth property value. Health details about the device hardware.
     * @param value Value to set for the hardwareHealth property.
     * @return a void
     */
    public void setHardwareHealth(@javax.annotation.Nullable final TeamworkHardwareHealth value) {
        this._hardwareHealth = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device health details.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device health detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the loginStatus property value. The login status of Microsoft Teams, Skype for Business, and Exchange.
     * @param value Value to set for the loginStatus property.
     * @return a void
     */
    public void setLoginStatus(@javax.annotation.Nullable final TeamworkLoginStatus value) {
        this._loginStatus = value;
    }
    /**
     * Sets the peripheralsHealth property value. Health details about all peripherals (for example, speaker and microphone) attached to a device.
     * @param value Value to set for the peripheralsHealth property.
     * @return a void
     */
    public void setPeripheralsHealth(@javax.annotation.Nullable final TeamworkPeripheralsHealth value) {
        this._peripheralsHealth = value;
    }
    /**
     * Sets the softwareUpdateHealth property value. Software updates available for the device.
     * @param value Value to set for the softwareUpdateHealth property.
     * @return a void
     */
    public void setSoftwareUpdateHealth(@javax.annotation.Nullable final TeamworkSoftwareUpdateHealth value) {
        this._softwareUpdateHealth = value;
    }
}

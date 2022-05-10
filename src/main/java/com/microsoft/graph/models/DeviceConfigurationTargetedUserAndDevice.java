package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Conflict summary for a set of device configuration policies. */
public class DeviceConfigurationTargetedUserAndDevice implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The id of the device in the checkin. */
    private String _deviceId;
    /** The name of the device in the checkin. */
    private String _deviceName;
    /** Last checkin time for this user/device pair. */
    private OffsetDateTime _lastCheckinDateTime;
    /** The display name of the user in the checkin */
    private String _userDisplayName;
    /** The id of the user in the checkin. */
    private String _userId;
    /** The UPN of the user in the checkin. */
    private String _userPrincipalName;
    /**
     * Instantiates a new deviceConfigurationTargetedUserAndDevice and sets the default values.
     * @return a void
     */
    public DeviceConfigurationTargetedUserAndDevice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationTargetedUserAndDevice
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationTargetedUserAndDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationTargetedUserAndDevice();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deviceId property value. The id of the device in the checkin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. The name of the device in the checkin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfigurationTargetedUserAndDevice currentObject = this;
        return new HashMap<>(6) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("lastCheckinDateTime", (n) -> { currentObject.setLastCheckinDateTime(n.getOffsetDateTimeValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastCheckinDateTime property value. Last checkin time for this user/device pair.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckinDateTime() {
        return this._lastCheckinDateTime;
    }
    /**
     * Gets the userDisplayName property value. The display name of the user in the checkin
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. The id of the user in the checkin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. The UPN of the user in the checkin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("lastCheckinDateTime", this.getLastCheckinDateTime());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceId property value. The id of the device in the checkin.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name of the device in the checkin.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the lastCheckinDateTime property value. Last checkin time for this user/device pair.
     * @param value Value to set for the lastCheckinDateTime property.
     * @return a void
     */
    public void setLastCheckinDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckinDateTime = value;
    }
    /**
     * Sets the userDisplayName property value. The display name of the user in the checkin
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. The id of the user in the checkin.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The UPN of the user in the checkin.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class WindowsUpdateState extends Entity implements Parsable {
    /** Device display name. */
    private String _deviceDisplayName;
    /** The id of the device. */
    private String _deviceId;
    /** The current feature update version of the device. */
    private String _featureUpdateVersion;
    /** The date time that the Windows Update Agent did a successful scan. */
    private OffsetDateTime _lastScanDateTime;
    /** Last date time that the device sync with with Microsoft Intune. */
    private OffsetDateTime _lastSyncDateTime;
    /** The Quality Update Version of the device. */
    private String _qualityUpdateVersion;
    /** Windows update for business configuration device states */
    private WindowsUpdateStatus _status;
    /** The id of the user. */
    private String _userId;
    /** User principal name. */
    private String _userPrincipalName;
    /**
     * Instantiates a new windowsUpdateState and sets the default values.
     * @return a void
     */
    public WindowsUpdateState() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdateState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsUpdateState
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateState();
    }
    /**
     * Gets the deviceDisplayName property value. Device display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the featureUpdateVersion property value. The current feature update version of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeatureUpdateVersion() {
        return this._featureUpdateVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsUpdateState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("featureUpdateVersion", (n) -> { currentObject.setFeatureUpdateVersion(n.getStringValue()); });
            this.put("lastScanDateTime", (n) -> { currentObject.setLastScanDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("qualityUpdateVersion", (n) -> { currentObject.setQualityUpdateVersion(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(WindowsUpdateStatus.class)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastScanDateTime property value. The date time that the Windows Update Agent did a successful scan.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastScanDateTime() {
        return this._lastScanDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. Last date time that the device sync with with Microsoft Intune.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the qualityUpdateVersion property value. The Quality Update Version of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQualityUpdateVersion() {
        return this._qualityUpdateVersion;
    }
    /**
     * Gets the status property value. Windows update for business configuration device states
     * @return a windowsUpdateStatus
     */
    @javax.annotation.Nullable
    public WindowsUpdateStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the userId property value. The id of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. User principal name.
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
        super.serialize(writer);
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("featureUpdateVersion", this.getFeatureUpdateVersion());
        writer.writeOffsetDateTimeValue("lastScanDateTime", this.getLastScanDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("qualityUpdateVersion", this.getQualityUpdateVersion());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deviceDisplayName property value. Device display name.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the featureUpdateVersion property value. The current feature update version of the device.
     * @param value Value to set for the featureUpdateVersion property.
     * @return a void
     */
    public void setFeatureUpdateVersion(@javax.annotation.Nullable final String value) {
        this._featureUpdateVersion = value;
    }
    /**
     * Sets the lastScanDateTime property value. The date time that the Windows Update Agent did a successful scan.
     * @param value Value to set for the lastScanDateTime property.
     * @return a void
     */
    public void setLastScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastScanDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last date time that the device sync with with Microsoft Intune.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the qualityUpdateVersion property value. The Quality Update Version of the device.
     * @param value Value to set for the qualityUpdateVersion property.
     * @return a void
     */
    public void setQualityUpdateVersion(@javax.annotation.Nullable final String value) {
        this._qualityUpdateVersion = value;
    }
    /**
     * Sets the status property value. Windows update for business configuration device states
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final WindowsUpdateStatus value) {
        this._status = value;
    }
    /**
     * Sets the userId property value. The id of the user.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}

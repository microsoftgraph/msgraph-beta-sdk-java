package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateState extends Entity implements Parsable {
    /**
     * Device display name.
     */
    private String deviceDisplayName;
    /**
     * The id of the device.
     */
    private String deviceId;
    /**
     * The current feature update version of the device.
     */
    private String featureUpdateVersion;
    /**
     * The date time that the Windows Update Agent did a successful scan.
     */
    private OffsetDateTime lastScanDateTime;
    /**
     * Last date time that the device sync with with Microsoft Intune.
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * The Quality Update Version of the device.
     */
    private String qualityUpdateVersion;
    /**
     * Windows update for business configuration device states
     */
    private WindowsUpdateStatus status;
    /**
     * The id of the user.
     */
    private String userId;
    /**
     * User principal name.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new WindowsUpdateState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsUpdateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateState
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
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the featureUpdateVersion property value. The current feature update version of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeatureUpdateVersion() {
        return this.featureUpdateVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("featureUpdateVersion", (n) -> { this.setFeatureUpdateVersion(n.getStringValue()); });
        deserializerMap.put("lastScanDateTime", (n) -> { this.setLastScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("qualityUpdateVersion", (n) -> { this.setQualityUpdateVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WindowsUpdateStatus.class)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastScanDateTime property value. The date time that the Windows Update Agent did a successful scan.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastScanDateTime() {
        return this.lastScanDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. Last date time that the device sync with with Microsoft Intune.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the qualityUpdateVersion property value. The Quality Update Version of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQualityUpdateVersion() {
        return this.qualityUpdateVersion;
    }
    /**
     * Gets the status property value. Windows update for business configuration device states
     * @return a WindowsUpdateStatus
     */
    @javax.annotation.Nullable
    public WindowsUpdateStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the userId property value. The id of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. User principal name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
    @javax.annotation.Nonnull
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the featureUpdateVersion property value. The current feature update version of the device.
     * @param value Value to set for the featureUpdateVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatureUpdateVersion(@javax.annotation.Nullable final String value) {
        this.featureUpdateVersion = value;
    }
    /**
     * Sets the lastScanDateTime property value. The date time that the Windows Update Agent did a successful scan.
     * @param value Value to set for the lastScanDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastScanDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last date time that the device sync with with Microsoft Intune.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the qualityUpdateVersion property value. The Quality Update Version of the device.
     * @param value Value to set for the qualityUpdateVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQualityUpdateVersion(@javax.annotation.Nullable final String value) {
        this.qualityUpdateVersion = value;
    }
    /**
     * Sets the status property value. Windows update for business configuration device states
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final WindowsUpdateStatus value) {
        this.status = value;
    }
    /**
     * Sets the userId property value. The id of the user.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}

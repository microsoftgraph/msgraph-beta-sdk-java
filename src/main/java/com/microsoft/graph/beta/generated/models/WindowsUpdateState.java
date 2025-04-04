package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsUpdateState extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsUpdateState} and sets the default values.
     */
    public WindowsUpdateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsUpdateState}
     */
    @jakarta.annotation.Nonnull
    public static WindowsUpdateState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateState();
    }
    /**
     * Gets the deviceDisplayName property value. Device display name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.backingStore.get("deviceDisplayName");
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the featureUpdateVersion property value. The current feature update version of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeatureUpdateVersion() {
        return this.backingStore.get("featureUpdateVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("featureUpdateVersion", (n) -> { this.setFeatureUpdateVersion(n.getStringValue()); });
        deserializerMap.put("lastScanDateTime", (n) -> { this.setLastScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("qualityUpdateVersion", (n) -> { this.setQualityUpdateVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WindowsUpdateStatus::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastScanDateTime property value. The date time that the Windows Update Agent did a successful scan.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastScanDateTime() {
        return this.backingStore.get("lastScanDateTime");
    }
    /**
     * Gets the lastSyncDateTime property value. Last date time that the device sync with with Microsoft Intune.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the qualityUpdateVersion property value. The Quality Update Version of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQualityUpdateVersion() {
        return this.backingStore.get("qualityUpdateVersion");
    }
    /**
     * Gets the status property value. Windows update for business configuration device states
     * @return a {@link WindowsUpdateStatus}
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userId property value. The id of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. User principal name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDisplayName", value);
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the featureUpdateVersion property value. The current feature update version of the device.
     * @param value Value to set for the featureUpdateVersion property.
     */
    public void setFeatureUpdateVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("featureUpdateVersion", value);
    }
    /**
     * Sets the lastScanDateTime property value. The date time that the Windows Update Agent did a successful scan.
     * @param value Value to set for the lastScanDateTime property.
     */
    public void setLastScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastScanDateTime", value);
    }
    /**
     * Sets the lastSyncDateTime property value. Last date time that the device sync with with Microsoft Intune.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the qualityUpdateVersion property value. The Quality Update Version of the device.
     * @param value Value to set for the qualityUpdateVersion property.
     */
    public void setQualityUpdateVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("qualityUpdateVersion", value);
    }
    /**
     * Sets the status property value. Windows update for business configuration device states
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final WindowsUpdateStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userId property value. The id of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. User principal name.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}

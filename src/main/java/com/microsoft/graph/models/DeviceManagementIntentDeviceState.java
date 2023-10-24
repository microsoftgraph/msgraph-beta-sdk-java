package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents device state for an intent
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntentDeviceState extends Entity implements Parsable {
    /**
     * Device name that is being reported
     */
    private String deviceDisplayName;
    /**
     * Device id that is being reported
     */
    private String deviceId;
    /**
     * Last modified date time of an intent report
     */
    private OffsetDateTime lastReportedDateTime;
    /**
     * The state property
     */
    private ComplianceStatus state;
    /**
     * The user name that is being reported on a device
     */
    private String userName;
    /**
     * The user principal name that is being reported on a device
     */
    private String userPrincipalName;
    /**
     * Instantiates a new DeviceManagementIntentDeviceState and sets the default values.
     */
    public DeviceManagementIntentDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntentDeviceState
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntentDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentDeviceState();
    }
    /**
     * Gets the deviceDisplayName property value. Device name that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. Device id that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of an intent report
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the state property value. The state property
     * @return a ComplianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getState() {
        return this.state;
    }
    /**
     * Gets the userName property value. The user name that is being reported on a device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name that is being reported on a device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deviceDisplayName property value. Device name that is being reported
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. Device id that is being reported
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of an intent report
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.state = value;
    }
    /**
     * Sets the userName property value. The user name that is being reported on a device
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name that is being reported on a device
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}

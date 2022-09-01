package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity that represents user state for an intent */
public class DeviceManagementIntentUserState extends Entity implements Parsable {
    /** Count of Devices that belongs to a user for an intent */
    private Integer _deviceCount;
    /** Last modified date time of an intent report */
    private OffsetDateTime _lastReportedDateTime;
    /** The state property */
    private ComplianceStatus _state;
    /** The user name that is being reported on a device */
    private String _userName;
    /** The user principal name that is being reported on a device */
    private String _userPrincipalName;
    /**
     * Instantiates a new deviceManagementIntentUserState and sets the default values.
     * @return a void
     */
    public DeviceManagementIntentUserState() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementIntentUserState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementIntentUserState
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntentUserState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentUserState();
    }
    /**
     * Gets the deviceCount property value. Count of Devices that belongs to a user for an intent
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementIntentUserState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceCount", (n) -> { currentObject.setDeviceCount(n.getIntegerValue()); });
            this.put("lastReportedDateTime", (n) -> { currentObject.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ComplianceStatus.class)); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of an intent report
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the state property value. The state property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getState() {
        return this._state;
    }
    /**
     * Gets the userName property value. The user name that is being reported on a device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name that is being reported on a device
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
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deviceCount property value. Count of Devices that belongs to a user for an intent
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    public void setDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._deviceCount = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of an intent report
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ComplianceStatus value) {
        this._state = value;
    }
    /**
     * Sets the userName property value. The user name that is being reported on a device
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name that is being reported on a device
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}

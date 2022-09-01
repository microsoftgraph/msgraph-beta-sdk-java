package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The security baseline compliance state summary of the security baseline for a device. */
public class SecurityBaselineDeviceState extends Entity implements Parsable {
    /** Display name of the device */
    private String _deviceDisplayName;
    /** Last modified date time of the policy report */
    private OffsetDateTime _lastReportedDateTime;
    /** Intune device id */
    private String _managedDeviceId;
    /** Security Baseline Compliance State */
    private SecurityBaselineComplianceState _state;
    /** User Principal Name */
    private String _userPrincipalName;
    /**
     * Instantiates a new securityBaselineDeviceState and sets the default values.
     * @return a void
     */
    public SecurityBaselineDeviceState() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineDeviceState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineDeviceState
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineDeviceState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineDeviceState();
    }
    /**
     * Gets the deviceDisplayName property value. Display name of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityBaselineDeviceState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
            this.put("lastReportedDateTime", (n) -> { currentObject.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(SecurityBaselineComplianceState.class)); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of the policy report
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. Intune device id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a securityBaselineComplianceState
     */
    @javax.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this._state;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
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
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deviceDisplayName property value. Display name of the device
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of the policy report
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. Intune device id
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final SecurityBaselineComplianceState value) {
        this._state = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}

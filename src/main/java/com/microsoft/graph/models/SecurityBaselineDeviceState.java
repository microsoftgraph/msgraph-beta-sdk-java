package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The security baseline compliance state summary of the security baseline for a device.
 */
public class SecurityBaselineDeviceState extends Entity implements Parsable {
    /**
     * Display name of the device
     */
    private String deviceDisplayName;
    /**
     * Last modified date time of the policy report
     */
    private OffsetDateTime lastReportedDateTime;
    /**
     * Intune device id
     */
    private String managedDeviceId;
    /**
     * Security Baseline Compliance State
     */
    private SecurityBaselineComplianceState state;
    /**
     * User Principal Name
     */
    private String userPrincipalName;
    /**
     * Instantiates a new securityBaselineDeviceState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineDeviceState
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineDeviceState();
    }
    /**
     * Gets the deviceDisplayName property value. Display name of the device
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SecurityBaselineComplianceState.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of the policy report
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. Intune device id
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a securityBaselineComplianceState
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this.state;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of the policy report
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. Intune device id
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setState(@jakarta.annotation.Nullable final SecurityBaselineComplianceState value) {
        this.state = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}

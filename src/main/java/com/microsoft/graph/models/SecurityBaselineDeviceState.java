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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityBaselineDeviceState extends Entity implements Parsable {
    /**
     * Instantiates a new SecurityBaselineDeviceState and sets the default values.
     */
    public SecurityBaselineDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityBaselineDeviceState
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineDeviceState();
    }
    /**
     * Gets the deviceDisplayName property value. Display name of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.backingStore.get("deviceDisplayName");
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
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SecurityBaselineComplianceState::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of the policy report
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.backingStore.get("lastReportedDateTime");
    }
    /**
     * Gets the managedDeviceId property value. Intune device id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a SecurityBaselineComplianceState
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
     * @return a String
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
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deviceDisplayName property value. Display name of the device
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDisplayName", value);
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of the policy report
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastReportedDateTime", value);
    }
    /**
     * Sets the managedDeviceId property value. Intune device id
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SecurityBaselineComplianceState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}

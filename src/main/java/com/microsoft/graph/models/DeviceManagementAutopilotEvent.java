package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an Autopilot flow event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementAutopilotEvent extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementAutopilotEvent and sets the default values.
     */
    public DeviceManagementAutopilotEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementAutopilotEvent
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementAutopilotEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAutopilotEvent();
    }
    /**
     * Gets the accountSetupDuration property value. Time spent in user ESP.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAccountSetupDuration() {
        return this.backingStore.get("accountSetupDuration");
    }
    /**
     * Gets the accountSetupStatus property value. Deployment states for Autopilot devices
     * @return a WindowsAutopilotDeploymentState
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeploymentState getAccountSetupStatus() {
        return this.backingStore.get("accountSetupStatus");
    }
    /**
     * Gets the deploymentDuration property value. Autopilot deployment duration including enrollment.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDeploymentDuration() {
        return this.backingStore.get("deploymentDuration");
    }
    /**
     * Gets the deploymentEndDateTime property value. Deployment end time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeploymentEndDateTime() {
        return this.backingStore.get("deploymentEndDateTime");
    }
    /**
     * Gets the deploymentStartDateTime property value. Deployment start time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeploymentStartDateTime() {
        return this.backingStore.get("deploymentStartDateTime");
    }
    /**
     * Gets the deploymentState property value. Deployment states for Autopilot devices
     * @return a WindowsAutopilotDeploymentState
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeploymentState getDeploymentState() {
        return this.backingStore.get("deploymentState");
    }
    /**
     * Gets the deploymentTotalDuration property value. Total deployment duration from enrollment to Desktop screen.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDeploymentTotalDuration() {
        return this.backingStore.get("deploymentTotalDuration");
    }
    /**
     * Gets the deviceId property value. Device id associated with the object
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the devicePreparationDuration property value. Time spent in device enrollment.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDevicePreparationDuration() {
        return this.backingStore.get("devicePreparationDuration");
    }
    /**
     * Gets the deviceRegisteredDateTime property value. Device registration date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeviceRegisteredDateTime() {
        return this.backingStore.get("deviceRegisteredDateTime");
    }
    /**
     * Gets the deviceSerialNumber property value. Device serial number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceSerialNumber() {
        return this.backingStore.get("deviceSerialNumber");
    }
    /**
     * Gets the deviceSetupDuration property value. Time spent in device ESP.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDeviceSetupDuration() {
        return this.backingStore.get("deviceSetupDuration");
    }
    /**
     * Gets the deviceSetupStatus property value. Deployment states for Autopilot devices
     * @return a WindowsAutopilotDeploymentState
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeploymentState getDeviceSetupStatus() {
        return this.backingStore.get("deviceSetupStatus");
    }
    /**
     * Gets the enrollmentFailureDetails property value. Enrollment failure details.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentFailureDetails() {
        return this.backingStore.get("enrollmentFailureDetails");
    }
    /**
     * Gets the enrollmentStartDateTime property value. Device enrollment start date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEnrollmentStartDateTime() {
        return this.backingStore.get("enrollmentStartDateTime");
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a EnrollmentState
     */
    @jakarta.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.backingStore.get("enrollmentState");
    }
    /**
     * Gets the enrollmentType property value. The enrollmentType property
     * @return a WindowsAutopilotEnrollmentType
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotEnrollmentType getEnrollmentType() {
        return this.backingStore.get("enrollmentType");
    }
    /**
     * Gets the eventDateTime property value. Time when the event occurred .
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountSetupDuration", (n) -> { this.setAccountSetupDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("accountSetupStatus", (n) -> { this.setAccountSetupStatus(n.getEnumValue(WindowsAutopilotDeploymentState.class)); });
        deserializerMap.put("deploymentDuration", (n) -> { this.setDeploymentDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("deploymentEndDateTime", (n) -> { this.setDeploymentEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentStartDateTime", (n) -> { this.setDeploymentStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentState", (n) -> { this.setDeploymentState(n.getEnumValue(WindowsAutopilotDeploymentState.class)); });
        deserializerMap.put("deploymentTotalDuration", (n) -> { this.setDeploymentTotalDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("devicePreparationDuration", (n) -> { this.setDevicePreparationDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("deviceRegisteredDateTime", (n) -> { this.setDeviceRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceSerialNumber", (n) -> { this.setDeviceSerialNumber(n.getStringValue()); });
        deserializerMap.put("deviceSetupDuration", (n) -> { this.setDeviceSetupDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("deviceSetupStatus", (n) -> { this.setDeviceSetupStatus(n.getEnumValue(WindowsAutopilotDeploymentState.class)); });
        deserializerMap.put("enrollmentFailureDetails", (n) -> { this.setEnrollmentFailureDetails(n.getStringValue()); });
        deserializerMap.put("enrollmentStartDateTime", (n) -> { this.setEnrollmentStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enrollmentState", (n) -> { this.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
        deserializerMap.put("enrollmentType", (n) -> { this.setEnrollmentType(n.getEnumValue(WindowsAutopilotEnrollmentType.class)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("policyStatusDetails", (n) -> { this.setPolicyStatusDetails(n.getCollectionOfObjectValues(DeviceManagementAutopilotPolicyStatusDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedAppCount", (n) -> { this.setTargetedAppCount(n.getIntegerValue()); });
        deserializerMap.put("targetedPolicyCount", (n) -> { this.setTargetedPolicyCount(n.getIntegerValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("windows10EnrollmentCompletionPageConfigurationDisplayName", (n) -> { this.setWindows10EnrollmentCompletionPageConfigurationDisplayName(n.getStringValue()); });
        deserializerMap.put("windows10EnrollmentCompletionPageConfigurationId", (n) -> { this.setWindows10EnrollmentCompletionPageConfigurationId(n.getStringValue()); });
        deserializerMap.put("windowsAutopilotDeploymentProfileDisplayName", (n) -> { this.setWindowsAutopilotDeploymentProfileDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceName property value. Managed device name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.backingStore.get("managedDeviceName");
    }
    /**
     * Gets the osVersion property value. Device operating system version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the policyStatusDetails property value. Policy and application status details for this device.
     * @return a java.util.List<DeviceManagementAutopilotPolicyStatusDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementAutopilotPolicyStatusDetail> getPolicyStatusDetails() {
        return this.backingStore.get("policyStatusDetails");
    }
    /**
     * Gets the targetedAppCount property value. Count of applications targeted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTargetedAppCount() {
        return this.backingStore.get("targetedAppCount");
    }
    /**
     * Gets the targetedPolicyCount property value. Count of policies targeted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTargetedPolicyCount() {
        return this.backingStore.get("targetedPolicyCount");
    }
    /**
     * Gets the userPrincipalName property value. User principal name used to enroll the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the windows10EnrollmentCompletionPageConfigurationDisplayName property value. Enrollment Status Page profile name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWindows10EnrollmentCompletionPageConfigurationDisplayName() {
        return this.backingStore.get("windows10EnrollmentCompletionPageConfigurationDisplayName");
    }
    /**
     * Gets the windows10EnrollmentCompletionPageConfigurationId property value. Enrollment Status Page profile ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWindows10EnrollmentCompletionPageConfigurationId() {
        return this.backingStore.get("windows10EnrollmentCompletionPageConfigurationId");
    }
    /**
     * Gets the windowsAutopilotDeploymentProfileDisplayName property value. Autopilot profile name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWindowsAutopilotDeploymentProfileDisplayName() {
        return this.backingStore.get("windowsAutopilotDeploymentProfileDisplayName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("accountSetupDuration", this.getAccountSetupDuration());
        writer.writeEnumValue("accountSetupStatus", this.getAccountSetupStatus());
        writer.writePeriodAndDurationValue("deploymentDuration", this.getDeploymentDuration());
        writer.writeOffsetDateTimeValue("deploymentEndDateTime", this.getDeploymentEndDateTime());
        writer.writeOffsetDateTimeValue("deploymentStartDateTime", this.getDeploymentStartDateTime());
        writer.writeEnumValue("deploymentState", this.getDeploymentState());
        writer.writePeriodAndDurationValue("deploymentTotalDuration", this.getDeploymentTotalDuration());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writePeriodAndDurationValue("devicePreparationDuration", this.getDevicePreparationDuration());
        writer.writeOffsetDateTimeValue("deviceRegisteredDateTime", this.getDeviceRegisteredDateTime());
        writer.writeStringValue("deviceSerialNumber", this.getDeviceSerialNumber());
        writer.writePeriodAndDurationValue("deviceSetupDuration", this.getDeviceSetupDuration());
        writer.writeEnumValue("deviceSetupStatus", this.getDeviceSetupStatus());
        writer.writeStringValue("enrollmentFailureDetails", this.getEnrollmentFailureDetails());
        writer.writeOffsetDateTimeValue("enrollmentStartDateTime", this.getEnrollmentStartDateTime());
        writer.writeEnumValue("enrollmentState", this.getEnrollmentState());
        writer.writeEnumValue("enrollmentType", this.getEnrollmentType());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeCollectionOfObjectValues("policyStatusDetails", this.getPolicyStatusDetails());
        writer.writeIntegerValue("targetedAppCount", this.getTargetedAppCount());
        writer.writeIntegerValue("targetedPolicyCount", this.getTargetedPolicyCount());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("windows10EnrollmentCompletionPageConfigurationDisplayName", this.getWindows10EnrollmentCompletionPageConfigurationDisplayName());
        writer.writeStringValue("windows10EnrollmentCompletionPageConfigurationId", this.getWindows10EnrollmentCompletionPageConfigurationId());
        writer.writeStringValue("windowsAutopilotDeploymentProfileDisplayName", this.getWindowsAutopilotDeploymentProfileDisplayName());
    }
    /**
     * Sets the accountSetupDuration property value. Time spent in user ESP.
     * @param value Value to set for the accountSetupDuration property.
     */
    public void setAccountSetupDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("accountSetupDuration", value);
    }
    /**
     * Sets the accountSetupStatus property value. Deployment states for Autopilot devices
     * @param value Value to set for the accountSetupStatus property.
     */
    public void setAccountSetupStatus(@jakarta.annotation.Nullable final WindowsAutopilotDeploymentState value) {
        this.backingStore.set("accountSetupStatus", value);
    }
    /**
     * Sets the deploymentDuration property value. Autopilot deployment duration including enrollment.
     * @param value Value to set for the deploymentDuration property.
     */
    public void setDeploymentDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("deploymentDuration", value);
    }
    /**
     * Sets the deploymentEndDateTime property value. Deployment end time.
     * @param value Value to set for the deploymentEndDateTime property.
     */
    public void setDeploymentEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deploymentEndDateTime", value);
    }
    /**
     * Sets the deploymentStartDateTime property value. Deployment start time.
     * @param value Value to set for the deploymentStartDateTime property.
     */
    public void setDeploymentStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deploymentStartDateTime", value);
    }
    /**
     * Sets the deploymentState property value. Deployment states for Autopilot devices
     * @param value Value to set for the deploymentState property.
     */
    public void setDeploymentState(@jakarta.annotation.Nullable final WindowsAutopilotDeploymentState value) {
        this.backingStore.set("deploymentState", value);
    }
    /**
     * Sets the deploymentTotalDuration property value. Total deployment duration from enrollment to Desktop screen.
     * @param value Value to set for the deploymentTotalDuration property.
     */
    public void setDeploymentTotalDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("deploymentTotalDuration", value);
    }
    /**
     * Sets the deviceId property value. Device id associated with the object
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the devicePreparationDuration property value. Time spent in device enrollment.
     * @param value Value to set for the devicePreparationDuration property.
     */
    public void setDevicePreparationDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("devicePreparationDuration", value);
    }
    /**
     * Sets the deviceRegisteredDateTime property value. Device registration date.
     * @param value Value to set for the deviceRegisteredDateTime property.
     */
    public void setDeviceRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deviceRegisteredDateTime", value);
    }
    /**
     * Sets the deviceSerialNumber property value. Device serial number.
     * @param value Value to set for the deviceSerialNumber property.
     */
    public void setDeviceSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceSerialNumber", value);
    }
    /**
     * Sets the deviceSetupDuration property value. Time spent in device ESP.
     * @param value Value to set for the deviceSetupDuration property.
     */
    public void setDeviceSetupDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("deviceSetupDuration", value);
    }
    /**
     * Sets the deviceSetupStatus property value. Deployment states for Autopilot devices
     * @param value Value to set for the deviceSetupStatus property.
     */
    public void setDeviceSetupStatus(@jakarta.annotation.Nullable final WindowsAutopilotDeploymentState value) {
        this.backingStore.set("deviceSetupStatus", value);
    }
    /**
     * Sets the enrollmentFailureDetails property value. Enrollment failure details.
     * @param value Value to set for the enrollmentFailureDetails property.
     */
    public void setEnrollmentFailureDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enrollmentFailureDetails", value);
    }
    /**
     * Sets the enrollmentStartDateTime property value. Device enrollment start date.
     * @param value Value to set for the enrollmentStartDateTime property.
     */
    public void setEnrollmentStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("enrollmentStartDateTime", value);
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     */
    public void setEnrollmentState(@jakarta.annotation.Nullable final EnrollmentState value) {
        this.backingStore.set("enrollmentState", value);
    }
    /**
     * Sets the enrollmentType property value. The enrollmentType property
     * @param value Value to set for the enrollmentType property.
     */
    public void setEnrollmentType(@jakarta.annotation.Nullable final WindowsAutopilotEnrollmentType value) {
        this.backingStore.set("enrollmentType", value);
    }
    /**
     * Sets the eventDateTime property value. Time when the event occurred .
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the managedDeviceName property value. Managed device name.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the osVersion property value. Device operating system version.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the policyStatusDetails property value. Policy and application status details for this device.
     * @param value Value to set for the policyStatusDetails property.
     */
    public void setPolicyStatusDetails(@jakarta.annotation.Nullable final java.util.List<DeviceManagementAutopilotPolicyStatusDetail> value) {
        this.backingStore.set("policyStatusDetails", value);
    }
    /**
     * Sets the targetedAppCount property value. Count of applications targeted.
     * @param value Value to set for the targetedAppCount property.
     */
    public void setTargetedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("targetedAppCount", value);
    }
    /**
     * Sets the targetedPolicyCount property value. Count of policies targeted.
     * @param value Value to set for the targetedPolicyCount property.
     */
    public void setTargetedPolicyCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("targetedPolicyCount", value);
    }
    /**
     * Sets the userPrincipalName property value. User principal name used to enroll the device.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the windows10EnrollmentCompletionPageConfigurationDisplayName property value. Enrollment Status Page profile name
     * @param value Value to set for the windows10EnrollmentCompletionPageConfigurationDisplayName property.
     */
    public void setWindows10EnrollmentCompletionPageConfigurationDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windows10EnrollmentCompletionPageConfigurationDisplayName", value);
    }
    /**
     * Sets the windows10EnrollmentCompletionPageConfigurationId property value. Enrollment Status Page profile ID
     * @param value Value to set for the windows10EnrollmentCompletionPageConfigurationId property.
     */
    public void setWindows10EnrollmentCompletionPageConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windows10EnrollmentCompletionPageConfigurationId", value);
    }
    /**
     * Sets the windowsAutopilotDeploymentProfileDisplayName property value. Autopilot profile name.
     * @param value Value to set for the windowsAutopilotDeploymentProfileDisplayName property.
     */
    public void setWindowsAutopilotDeploymentProfileDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windowsAutopilotDeploymentProfileDisplayName", value);
    }
}

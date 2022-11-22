package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents an Autopilot flow event. */
public class DeviceManagementAutopilotEvent extends Entity implements Parsable {
    /** Time spent in user ESP. */
    private Period _accountSetupDuration;
    /** The accountSetupStatus property */
    private WindowsAutopilotDeploymentState _accountSetupStatus;
    /** Autopilot deployment duration including enrollment. */
    private Period _deploymentDuration;
    /** Deployment end time. */
    private OffsetDateTime _deploymentEndDateTime;
    /** Deployment start time. */
    private OffsetDateTime _deploymentStartDateTime;
    /** The deploymentState property */
    private WindowsAutopilotDeploymentState _deploymentState;
    /** Total deployment duration from enrollment to Desktop screen. */
    private Period _deploymentTotalDuration;
    /** Device id associated with the object */
    private String _deviceId;
    /** Time spent in device enrollment. */
    private Period _devicePreparationDuration;
    /** Device registration date. */
    private OffsetDateTime _deviceRegisteredDateTime;
    /** Device serial number. */
    private String _deviceSerialNumber;
    /** Time spent in device ESP. */
    private Period _deviceSetupDuration;
    /** The deviceSetupStatus property */
    private WindowsAutopilotDeploymentState _deviceSetupStatus;
    /** Enrollment failure details. */
    private String _enrollmentFailureDetails;
    /** Device enrollment start date. */
    private OffsetDateTime _enrollmentStartDateTime;
    /** The enrollmentState property */
    private EnrollmentState _enrollmentState;
    /** The enrollmentType property */
    private WindowsAutopilotEnrollmentType _enrollmentType;
    /** Time when the event occurred . */
    private OffsetDateTime _eventDateTime;
    /** Managed device name. */
    private String _managedDeviceName;
    /** Device operating system version. */
    private String _osVersion;
    /** Policy and application status details for this device. */
    private java.util.List<DeviceManagementAutopilotPolicyStatusDetail> _policyStatusDetails;
    /** Count of applications targeted. */
    private Integer _targetedAppCount;
    /** Count of policies targeted. */
    private Integer _targetedPolicyCount;
    /** User principal name used to enroll the device. */
    private String _userPrincipalName;
    /** Enrollment Status Page profile name */
    private String _windows10EnrollmentCompletionPageConfigurationDisplayName;
    /** Enrollment Status Page profile ID */
    private String _windows10EnrollmentCompletionPageConfigurationId;
    /** Autopilot profile name. */
    private String _windowsAutopilotDeploymentProfileDisplayName;
    /**
     * Instantiates a new deviceManagementAutopilotEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementAutopilotEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementAutopilotEvent
     */
    @javax.annotation.Nonnull
    public static DeviceManagementAutopilotEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAutopilotEvent();
    }
    /**
     * Gets the accountSetupDuration property value. Time spent in user ESP.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAccountSetupDuration() {
        return this._accountSetupDuration;
    }
    /**
     * Gets the accountSetupStatus property value. The accountSetupStatus property
     * @return a windowsAutopilotDeploymentState
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeploymentState getAccountSetupStatus() {
        return this._accountSetupStatus;
    }
    /**
     * Gets the deploymentDuration property value. Autopilot deployment duration including enrollment.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDeploymentDuration() {
        return this._deploymentDuration;
    }
    /**
     * Gets the deploymentEndDateTime property value. Deployment end time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeploymentEndDateTime() {
        return this._deploymentEndDateTime;
    }
    /**
     * Gets the deploymentStartDateTime property value. Deployment start time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeploymentStartDateTime() {
        return this._deploymentStartDateTime;
    }
    /**
     * Gets the deploymentState property value. The deploymentState property
     * @return a windowsAutopilotDeploymentState
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeploymentState getDeploymentState() {
        return this._deploymentState;
    }
    /**
     * Gets the deploymentTotalDuration property value. Total deployment duration from enrollment to Desktop screen.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDeploymentTotalDuration() {
        return this._deploymentTotalDuration;
    }
    /**
     * Gets the deviceId property value. Device id associated with the object
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the devicePreparationDuration property value. Time spent in device enrollment.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDevicePreparationDuration() {
        return this._devicePreparationDuration;
    }
    /**
     * Gets the deviceRegisteredDateTime property value. Device registration date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeviceRegisteredDateTime() {
        return this._deviceRegisteredDateTime;
    }
    /**
     * Gets the deviceSerialNumber property value. Device serial number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceSerialNumber() {
        return this._deviceSerialNumber;
    }
    /**
     * Gets the deviceSetupDuration property value. Time spent in device ESP.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDeviceSetupDuration() {
        return this._deviceSetupDuration;
    }
    /**
     * Gets the deviceSetupStatus property value. The deviceSetupStatus property
     * @return a windowsAutopilotDeploymentState
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeploymentState getDeviceSetupStatus() {
        return this._deviceSetupStatus;
    }
    /**
     * Gets the enrollmentFailureDetails property value. Enrollment failure details.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentFailureDetails() {
        return this._enrollmentFailureDetails;
    }
    /**
     * Gets the enrollmentStartDateTime property value. Device enrollment start date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrollmentStartDateTime() {
        return this._enrollmentStartDateTime;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a enrollmentState
     */
    @javax.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this._enrollmentState;
    }
    /**
     * Gets the enrollmentType property value. The enrollmentType property
     * @return a windowsAutopilotEnrollmentType
     */
    @javax.annotation.Nullable
    public WindowsAutopilotEnrollmentType getEnrollmentType() {
        return this._enrollmentType;
    }
    /**
     * Gets the eventDateTime property value. Time when the event occurred .
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountSetupDuration", (n) -> { this.setAccountSetupDuration(n.getPeriodValue()); });
        deserializerMap.put("accountSetupStatus", (n) -> { this.setAccountSetupStatus(n.getEnumValue(WindowsAutopilotDeploymentState.class)); });
        deserializerMap.put("deploymentDuration", (n) -> { this.setDeploymentDuration(n.getPeriodValue()); });
        deserializerMap.put("deploymentEndDateTime", (n) -> { this.setDeploymentEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentStartDateTime", (n) -> { this.setDeploymentStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentState", (n) -> { this.setDeploymentState(n.getEnumValue(WindowsAutopilotDeploymentState.class)); });
        deserializerMap.put("deploymentTotalDuration", (n) -> { this.setDeploymentTotalDuration(n.getPeriodValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("devicePreparationDuration", (n) -> { this.setDevicePreparationDuration(n.getPeriodValue()); });
        deserializerMap.put("deviceRegisteredDateTime", (n) -> { this.setDeviceRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceSerialNumber", (n) -> { this.setDeviceSerialNumber(n.getStringValue()); });
        deserializerMap.put("deviceSetupDuration", (n) -> { this.setDeviceSetupDuration(n.getPeriodValue()); });
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the osVersion property value. Device operating system version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the policyStatusDetails property value. Policy and application status details for this device.
     * @return a deviceManagementAutopilotPolicyStatusDetail
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementAutopilotPolicyStatusDetail> getPolicyStatusDetails() {
        return this._policyStatusDetails;
    }
    /**
     * Gets the targetedAppCount property value. Count of applications targeted.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTargetedAppCount() {
        return this._targetedAppCount;
    }
    /**
     * Gets the targetedPolicyCount property value. Count of policies targeted.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTargetedPolicyCount() {
        return this._targetedPolicyCount;
    }
    /**
     * Gets the userPrincipalName property value. User principal name used to enroll the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the windows10EnrollmentCompletionPageConfigurationDisplayName property value. Enrollment Status Page profile name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWindows10EnrollmentCompletionPageConfigurationDisplayName() {
        return this._windows10EnrollmentCompletionPageConfigurationDisplayName;
    }
    /**
     * Gets the windows10EnrollmentCompletionPageConfigurationId property value. Enrollment Status Page profile ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWindows10EnrollmentCompletionPageConfigurationId() {
        return this._windows10EnrollmentCompletionPageConfigurationId;
    }
    /**
     * Gets the windowsAutopilotDeploymentProfileDisplayName property value. Autopilot profile name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWindowsAutopilotDeploymentProfileDisplayName() {
        return this._windowsAutopilotDeploymentProfileDisplayName;
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
        writer.writePeriodValue("accountSetupDuration", this.getAccountSetupDuration());
        writer.writeEnumValue("accountSetupStatus", this.getAccountSetupStatus());
        writer.writePeriodValue("deploymentDuration", this.getDeploymentDuration());
        writer.writeOffsetDateTimeValue("deploymentEndDateTime", this.getDeploymentEndDateTime());
        writer.writeOffsetDateTimeValue("deploymentStartDateTime", this.getDeploymentStartDateTime());
        writer.writeEnumValue("deploymentState", this.getDeploymentState());
        writer.writePeriodValue("deploymentTotalDuration", this.getDeploymentTotalDuration());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writePeriodValue("devicePreparationDuration", this.getDevicePreparationDuration());
        writer.writeOffsetDateTimeValue("deviceRegisteredDateTime", this.getDeviceRegisteredDateTime());
        writer.writeStringValue("deviceSerialNumber", this.getDeviceSerialNumber());
        writer.writePeriodValue("deviceSetupDuration", this.getDeviceSetupDuration());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountSetupDuration(@javax.annotation.Nullable final Period value) {
        this._accountSetupDuration = value;
    }
    /**
     * Sets the accountSetupStatus property value. The accountSetupStatus property
     * @param value Value to set for the accountSetupStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountSetupStatus(@javax.annotation.Nullable final WindowsAutopilotDeploymentState value) {
        this._accountSetupStatus = value;
    }
    /**
     * Sets the deploymentDuration property value. Autopilot deployment duration including enrollment.
     * @param value Value to set for the deploymentDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentDuration(@javax.annotation.Nullable final Period value) {
        this._deploymentDuration = value;
    }
    /**
     * Sets the deploymentEndDateTime property value. Deployment end time.
     * @param value Value to set for the deploymentEndDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deploymentEndDateTime = value;
    }
    /**
     * Sets the deploymentStartDateTime property value. Deployment start time.
     * @param value Value to set for the deploymentStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deploymentStartDateTime = value;
    }
    /**
     * Sets the deploymentState property value. The deploymentState property
     * @param value Value to set for the deploymentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentState(@javax.annotation.Nullable final WindowsAutopilotDeploymentState value) {
        this._deploymentState = value;
    }
    /**
     * Sets the deploymentTotalDuration property value. Total deployment duration from enrollment to Desktop screen.
     * @param value Value to set for the deploymentTotalDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentTotalDuration(@javax.annotation.Nullable final Period value) {
        this._deploymentTotalDuration = value;
    }
    /**
     * Sets the deviceId property value. Device id associated with the object
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the devicePreparationDuration property value. Time spent in device enrollment.
     * @param value Value to set for the devicePreparationDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicePreparationDuration(@javax.annotation.Nullable final Period value) {
        this._devicePreparationDuration = value;
    }
    /**
     * Sets the deviceRegisteredDateTime property value. Device registration date.
     * @param value Value to set for the deviceRegisteredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deviceRegisteredDateTime = value;
    }
    /**
     * Sets the deviceSerialNumber property value. Device serial number.
     * @param value Value to set for the deviceSerialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceSerialNumber(@javax.annotation.Nullable final String value) {
        this._deviceSerialNumber = value;
    }
    /**
     * Sets the deviceSetupDuration property value. Time spent in device ESP.
     * @param value Value to set for the deviceSetupDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceSetupDuration(@javax.annotation.Nullable final Period value) {
        this._deviceSetupDuration = value;
    }
    /**
     * Sets the deviceSetupStatus property value. The deviceSetupStatus property
     * @param value Value to set for the deviceSetupStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceSetupStatus(@javax.annotation.Nullable final WindowsAutopilotDeploymentState value) {
        this._deviceSetupStatus = value;
    }
    /**
     * Sets the enrollmentFailureDetails property value. Enrollment failure details.
     * @param value Value to set for the enrollmentFailureDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentFailureDetails(@javax.annotation.Nullable final String value) {
        this._enrollmentFailureDetails = value;
    }
    /**
     * Sets the enrollmentStartDateTime property value. Device enrollment start date.
     * @param value Value to set for the enrollmentStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._enrollmentStartDateTime = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentState(@javax.annotation.Nullable final EnrollmentState value) {
        this._enrollmentState = value;
    }
    /**
     * Sets the enrollmentType property value. The enrollmentType property
     * @param value Value to set for the enrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentType(@javax.annotation.Nullable final WindowsAutopilotEnrollmentType value) {
        this._enrollmentType = value;
    }
    /**
     * Sets the eventDateTime property value. Time when the event occurred .
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the managedDeviceName property value. Managed device name.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the osVersion property value. Device operating system version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the policyStatusDetails property value. Policy and application status details for this device.
     * @param value Value to set for the policyStatusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyStatusDetails(@javax.annotation.Nullable final java.util.List<DeviceManagementAutopilotPolicyStatusDetail> value) {
        this._policyStatusDetails = value;
    }
    /**
     * Sets the targetedAppCount property value. Count of applications targeted.
     * @param value Value to set for the targetedAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedAppCount(@javax.annotation.Nullable final Integer value) {
        this._targetedAppCount = value;
    }
    /**
     * Sets the targetedPolicyCount property value. Count of policies targeted.
     * @param value Value to set for the targetedPolicyCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedPolicyCount(@javax.annotation.Nullable final Integer value) {
        this._targetedPolicyCount = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name used to enroll the device.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the windows10EnrollmentCompletionPageConfigurationDisplayName property value. Enrollment Status Page profile name
     * @param value Value to set for the windows10EnrollmentCompletionPageConfigurationDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows10EnrollmentCompletionPageConfigurationDisplayName(@javax.annotation.Nullable final String value) {
        this._windows10EnrollmentCompletionPageConfigurationDisplayName = value;
    }
    /**
     * Sets the windows10EnrollmentCompletionPageConfigurationId property value. Enrollment Status Page profile ID
     * @param value Value to set for the windows10EnrollmentCompletionPageConfigurationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows10EnrollmentCompletionPageConfigurationId(@javax.annotation.Nullable final String value) {
        this._windows10EnrollmentCompletionPageConfigurationId = value;
    }
    /**
     * Sets the windowsAutopilotDeploymentProfileDisplayName property value. Autopilot profile name.
     * @param value Value to set for the windowsAutopilotDeploymentProfileDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAutopilotDeploymentProfileDisplayName(@javax.annotation.Nullable final String value) {
        this._windowsAutopilotDeploymentProfileDisplayName = value;
    }
}

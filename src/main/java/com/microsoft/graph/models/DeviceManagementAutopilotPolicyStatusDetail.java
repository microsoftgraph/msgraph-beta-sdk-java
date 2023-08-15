package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy status detail item contained by an autopilot event.
 */
public class DeviceManagementAutopilotPolicyStatusDetail extends Entity implements Parsable {
    /**
     * The complianceStatus property
     */
    private DeviceManagementAutopilotPolicyComplianceStatus complianceStatus;
    /**
     * The friendly name of the policy.
     */
    private String displayName;
    /**
     * The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.
     */
    private Integer errorCode;
    /**
     * Timestamp of the reported policy status
     */
    private OffsetDateTime lastReportedDateTime;
    /**
     * The policyType property
     */
    private DeviceManagementAutopilotPolicyType policyType;
    /**
     * Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session
     */
    private Boolean trackedOnEnrollmentStatus;
    /**
     * Instantiates a new deviceManagementAutopilotPolicyStatusDetail and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementAutopilotPolicyStatusDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementAutopilotPolicyStatusDetail
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementAutopilotPolicyStatusDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAutopilotPolicyStatusDetail();
    }
    /**
     * Gets the complianceStatus property value. The complianceStatus property
     * @return a deviceManagementAutopilotPolicyComplianceStatus
     */
    @jakarta.annotation.Nullable
    public DeviceManagementAutopilotPolicyComplianceStatus getComplianceStatus() {
        return this.complianceStatus;
    }
    /**
     * Gets the displayName property value. The friendly name of the policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the errorCode property value. The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceStatus", (n) -> { this.setComplianceStatus(n.getEnumValue(DeviceManagementAutopilotPolicyComplianceStatus.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(DeviceManagementAutopilotPolicyType.class)); });
        deserializerMap.put("trackedOnEnrollmentStatus", (n) -> { this.setTrackedOnEnrollmentStatus(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastReportedDateTime property value. Timestamp of the reported policy status
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the policyType property value. The policyType property
     * @return a deviceManagementAutopilotPolicyType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementAutopilotPolicyType getPolicyType() {
        return this.policyType;
    }
    /**
     * Gets the trackedOnEnrollmentStatus property value. Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTrackedOnEnrollmentStatus() {
        return this.trackedOnEnrollmentStatus;
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
        writer.writeEnumValue("complianceStatus", this.getComplianceStatus());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeBooleanValue("trackedOnEnrollmentStatus", this.getTrackedOnEnrollmentStatus());
    }
    /**
     * Sets the complianceStatus property value. The complianceStatus property
     * @param value Value to set for the complianceStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setComplianceStatus(@jakarta.annotation.Nullable final DeviceManagementAutopilotPolicyComplianceStatus value) {
        this.complianceStatus = value;
    }
    /**
     * Sets the displayName property value. The friendly name of the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the errorCode property value. The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Timestamp of the reported policy status
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the policyType property value. The policyType property
     * @param value Value to set for the policyType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicyType(@jakarta.annotation.Nullable final DeviceManagementAutopilotPolicyType value) {
        this.policyType = value;
    }
    /**
     * Sets the trackedOnEnrollmentStatus property value. Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session
     * @param value Value to set for the trackedOnEnrollmentStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrackedOnEnrollmentStatus(@jakarta.annotation.Nullable final Boolean value) {
        this.trackedOnEnrollmentStatus = value;
    }
}

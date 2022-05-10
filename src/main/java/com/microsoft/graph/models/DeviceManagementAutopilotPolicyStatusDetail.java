package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementAutopilotPolicyStatusDetail extends Entity implements Parsable {
    /** The policy compliance status. Possible values are: unknown, compliant, installed, notCompliant, notInstalled, error. */
    private DeviceManagementAutopilotPolicyComplianceStatus _complianceStatus;
    /** The friendly name of the policy. */
    private String _displayName;
    /** The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists. */
    private Integer _errorCode;
    /** Timestamp of the reported policy status */
    private OffsetDateTime _lastReportedDateTime;
    /** The type of policy. Possible values are: unknown, application, appModel, configurationPolicy. */
    private DeviceManagementAutopilotPolicyType _policyType;
    /** Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session */
    private Boolean _trackedOnEnrollmentStatus;
    /**
     * Instantiates a new deviceManagementAutopilotPolicyStatusDetail and sets the default values.
     * @return a void
     */
    public DeviceManagementAutopilotPolicyStatusDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementAutopilotPolicyStatusDetail
     */
    @javax.annotation.Nonnull
    public static DeviceManagementAutopilotPolicyStatusDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAutopilotPolicyStatusDetail();
    }
    /**
     * Gets the complianceStatus property value. The policy compliance status. Possible values are: unknown, compliant, installed, notCompliant, notInstalled, error.
     * @return a deviceManagementAutopilotPolicyComplianceStatus
     */
    @javax.annotation.Nullable
    public DeviceManagementAutopilotPolicyComplianceStatus getComplianceStatus() {
        return this._complianceStatus;
    }
    /**
     * Gets the displayName property value. The friendly name of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the errorCode property value. The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementAutopilotPolicyStatusDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("complianceStatus", (n) -> { currentObject.setComplianceStatus(n.getEnumValue(DeviceManagementAutopilotPolicyComplianceStatus.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
            this.put("lastReportedDateTime", (n) -> { currentObject.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
            this.put("policyType", (n) -> { currentObject.setPolicyType(n.getEnumValue(DeviceManagementAutopilotPolicyType.class)); });
            this.put("trackedOnEnrollmentStatus", (n) -> { currentObject.setTrackedOnEnrollmentStatus(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the lastReportedDateTime property value. Timestamp of the reported policy status
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the policyType property value. The type of policy. Possible values are: unknown, application, appModel, configurationPolicy.
     * @return a deviceManagementAutopilotPolicyType
     */
    @javax.annotation.Nullable
    public DeviceManagementAutopilotPolicyType getPolicyType() {
        return this._policyType;
    }
    /**
     * Gets the trackedOnEnrollmentStatus property value. Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTrackedOnEnrollmentStatus() {
        return this._trackedOnEnrollmentStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the complianceStatus property value. The policy compliance status. Possible values are: unknown, compliant, installed, notCompliant, notInstalled, error.
     * @param value Value to set for the complianceStatus property.
     * @return a void
     */
    public void setComplianceStatus(@javax.annotation.Nullable final DeviceManagementAutopilotPolicyComplianceStatus value) {
        this._complianceStatus = value;
    }
    /**
     * Sets the displayName property value. The friendly name of the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the errorCode property value. The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Timestamp of the reported policy status
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the policyType property value. The type of policy. Possible values are: unknown, application, appModel, configurationPolicy.
     * @param value Value to set for the policyType property.
     * @return a void
     */
    public void setPolicyType(@javax.annotation.Nullable final DeviceManagementAutopilotPolicyType value) {
        this._policyType = value;
    }
    /**
     * Sets the trackedOnEnrollmentStatus property value. Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session
     * @param value Value to set for the trackedOnEnrollmentStatus property.
     * @return a void
     */
    public void setTrackedOnEnrollmentStatus(@javax.annotation.Nullable final Boolean value) {
        this._trackedOnEnrollmentStatus = value;
    }
}

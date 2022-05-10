package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptDeviceState extends Entity implements Parsable {
    /** A list of the assignment filter ids used for health script applicability evaluation */
    private java.util.List<String> _assignmentFilterIds;
    /** Detection state from the lastest device health script execution. Possible values are: unknown, success, fail, scriptError, pending, notApplicable. */
    private RunState _detectionState;
    /** The next timestamp of when the device health script is expected to execute */
    private OffsetDateTime _expectedStateUpdateDateTime;
    /** The last timestamp of when the device health script executed */
    private OffsetDateTime _lastStateUpdateDateTime;
    /** The last time that Intune Managment Extension synced with Intune */
    private OffsetDateTime _lastSyncDateTime;
    /** The managed device on which the device health script executed */
    private ManagedDevice _managedDevice;
    /** Error from the detection script after remediation */
    private String _postRemediationDetectionScriptError;
    /** Detection script output after remediation */
    private String _postRemediationDetectionScriptOutput;
    /** Error from the detection script before remediation */
    private String _preRemediationDetectionScriptError;
    /** Output of the detection script before remediation */
    private String _preRemediationDetectionScriptOutput;
    /** Error output of the remediation script */
    private String _remediationScriptError;
    /** Remediation state from the lastest device health script execution. Possible values are: unknown, skipped, success, remediationFailed, scriptError. */
    private RemediationState _remediationState;
    /**
     * Instantiates a new deviceHealthScriptDeviceState and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptDeviceState
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptDeviceState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptDeviceState();
    }
    /**
     * Gets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this._assignmentFilterIds;
    }
    /**
     * Gets the detectionState property value. Detection state from the lastest device health script execution. Possible values are: unknown, success, fail, scriptError, pending, notApplicable.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getDetectionState() {
        return this._detectionState;
    }
    /**
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpectedStateUpdateDateTime() {
        return this._expectedStateUpdateDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptDeviceState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignmentFilterIds", (n) -> { currentObject.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("detectionState", (n) -> { currentObject.setDetectionState(n.getEnumValue(RunState.class)); });
            this.put("expectedStateUpdateDateTime", (n) -> { currentObject.setExpectedStateUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastStateUpdateDateTime", (n) -> { currentObject.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDevice", (n) -> { currentObject.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("postRemediationDetectionScriptError", (n) -> { currentObject.setPostRemediationDetectionScriptError(n.getStringValue()); });
            this.put("postRemediationDetectionScriptOutput", (n) -> { currentObject.setPostRemediationDetectionScriptOutput(n.getStringValue()); });
            this.put("preRemediationDetectionScriptError", (n) -> { currentObject.setPreRemediationDetectionScriptError(n.getStringValue()); });
            this.put("preRemediationDetectionScriptOutput", (n) -> { currentObject.setPreRemediationDetectionScriptOutput(n.getStringValue()); });
            this.put("remediationScriptError", (n) -> { currentObject.setRemediationScriptError(n.getStringValue()); });
            this.put("remediationState", (n) -> { currentObject.setRemediationState(n.getEnumValue(RemediationState.class)); });
        }};
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this._lastStateUpdateDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the managedDevice property value. The managed device on which the device health script executed
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this._managedDevice;
    }
    /**
     * Gets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostRemediationDetectionScriptError() {
        return this._postRemediationDetectionScriptError;
    }
    /**
     * Gets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostRemediationDetectionScriptOutput() {
        return this._postRemediationDetectionScriptOutput;
    }
    /**
     * Gets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreRemediationDetectionScriptError() {
        return this._preRemediationDetectionScriptError;
    }
    /**
     * Gets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreRemediationDetectionScriptOutput() {
        return this._preRemediationDetectionScriptOutput;
    }
    /**
     * Gets the remediationScriptError property value. Error output of the remediation script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationScriptError() {
        return this._remediationScriptError;
    }
    /**
     * Gets the remediationState property value. Remediation state from the lastest device health script execution. Possible values are: unknown, skipped, success, remediationFailed, scriptError.
     * @return a remediationState
     */
    @javax.annotation.Nullable
    public RemediationState getRemediationState() {
        return this._remediationState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("assignmentFilterIds", this.getAssignmentFilterIds());
        writer.writeEnumValue("detectionState", this.getDetectionState());
        writer.writeOffsetDateTimeValue("expectedStateUpdateDateTime", this.getExpectedStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeObjectValue("managedDevice", this.getManagedDevice());
        writer.writeStringValue("postRemediationDetectionScriptError", this.getPostRemediationDetectionScriptError());
        writer.writeStringValue("postRemediationDetectionScriptOutput", this.getPostRemediationDetectionScriptOutput());
        writer.writeStringValue("preRemediationDetectionScriptError", this.getPreRemediationDetectionScriptError());
        writer.writeStringValue("preRemediationDetectionScriptOutput", this.getPreRemediationDetectionScriptOutput());
        writer.writeStringValue("remediationScriptError", this.getRemediationScriptError());
        writer.writeEnumValue("remediationState", this.getRemediationState());
    }
    /**
     * Sets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @param value Value to set for the assignmentFilterIds property.
     * @return a void
     */
    public void setAssignmentFilterIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._assignmentFilterIds = value;
    }
    /**
     * Sets the detectionState property value. Detection state from the lastest device health script execution. Possible values are: unknown, success, fail, scriptError, pending, notApplicable.
     * @param value Value to set for the detectionState property.
     * @return a void
     */
    public void setDetectionState(@javax.annotation.Nullable final RunState value) {
        this._detectionState = value;
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     * @return a void
     */
    public void setExpectedStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expectedStateUpdateDateTime = value;
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     * @return a void
     */
    public void setLastStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastStateUpdateDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the managedDevice property value. The managed device on which the device health script executed
     * @param value Value to set for the managedDevice property.
     * @return a void
     */
    public void setManagedDevice(@javax.annotation.Nullable final ManagedDevice value) {
        this._managedDevice = value;
    }
    /**
     * Sets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @param value Value to set for the postRemediationDetectionScriptError property.
     * @return a void
     */
    public void setPostRemediationDetectionScriptError(@javax.annotation.Nullable final String value) {
        this._postRemediationDetectionScriptError = value;
    }
    /**
     * Sets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @param value Value to set for the postRemediationDetectionScriptOutput property.
     * @return a void
     */
    public void setPostRemediationDetectionScriptOutput(@javax.annotation.Nullable final String value) {
        this._postRemediationDetectionScriptOutput = value;
    }
    /**
     * Sets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptError property.
     * @return a void
     */
    public void setPreRemediationDetectionScriptError(@javax.annotation.Nullable final String value) {
        this._preRemediationDetectionScriptError = value;
    }
    /**
     * Sets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptOutput property.
     * @return a void
     */
    public void setPreRemediationDetectionScriptOutput(@javax.annotation.Nullable final String value) {
        this._preRemediationDetectionScriptOutput = value;
    }
    /**
     * Sets the remediationScriptError property value. Error output of the remediation script
     * @param value Value to set for the remediationScriptError property.
     * @return a void
     */
    public void setRemediationScriptError(@javax.annotation.Nullable final String value) {
        this._remediationScriptError = value;
    }
    /**
     * Sets the remediationState property value. Remediation state from the lastest device health script execution. Possible values are: unknown, skipped, success, remediationFailed, scriptError.
     * @param value Value to set for the remediationState property.
     * @return a void
     */
    public void setRemediationState(@javax.annotation.Nullable final RemediationState value) {
        this._remediationState = value;
    }
}

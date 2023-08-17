package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for policy run state of the device health script.
 */
public class DeviceHealthScriptPolicyState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of the assignment filter ids used for health script applicability evaluation
     */
    private java.util.List<String> assignmentFilterIds;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RunState detectionState;
    /**
     * The Intune device Id
     */
    private String deviceId;
    /**
     * Display name of the device
     */
    private String deviceName;
    /**
     * The next timestamp of when the device health script is expected to execute
     */
    private OffsetDateTime expectedStateUpdateDateTime;
    /**
     * Key of the device health script policy state is a concatenation of the MT sideCar policy Id and Intune device Id
     */
    private String id;
    /**
     * The last timestamp of when the device health script executed
     */
    private OffsetDateTime lastStateUpdateDateTime;
    /**
     * The last time that Intune Managment Extension synced with Intune
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Value of the OS Version in string
     */
    private String osVersion;
    /**
     * The MT sideCar policy Id
     */
    private String policyId;
    /**
     * Display name of the device health script
     */
    private String policyName;
    /**
     * Error from the detection script after remediation
     */
    private String postRemediationDetectionScriptError;
    /**
     * Detection script output after remediation
     */
    private String postRemediationDetectionScriptOutput;
    /**
     * Error from the detection script before remediation
     */
    private String preRemediationDetectionScriptError;
    /**
     * Output of the detection script before remediation
     */
    private String preRemediationDetectionScriptOutput;
    /**
     * Error output of the remediation script
     */
    private String remediationScriptError;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RemediationState remediationState;
    /**
     * Name of the user whom ran the device health script
     */
    private String userName;
    /**
     * Instantiates a new deviceHealthScriptPolicyState and sets the default values.
     */
    public DeviceHealthScriptPolicyState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptPolicyState
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptPolicyState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptPolicyState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this.assignmentFilterIds;
    }
    /**
     * Gets the detectionState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @jakarta.annotation.Nullable
    public RunState getDetectionState() {
        return this.detectionState;
    }
    /**
     * Gets the deviceId property value. The Intune device Id
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. Display name of the device
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpectedStateUpdateDateTime() {
        return this.expectedStateUpdateDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("assignmentFilterIds", (n) -> { this.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detectionState", (n) -> { this.setDetectionState(n.getEnumValue(RunState.class)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("expectedStateUpdateDateTime", (n) -> { this.setExpectedStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("postRemediationDetectionScriptError", (n) -> { this.setPostRemediationDetectionScriptError(n.getStringValue()); });
        deserializerMap.put("postRemediationDetectionScriptOutput", (n) -> { this.setPostRemediationDetectionScriptOutput(n.getStringValue()); });
        deserializerMap.put("preRemediationDetectionScriptError", (n) -> { this.setPreRemediationDetectionScriptError(n.getStringValue()); });
        deserializerMap.put("preRemediationDetectionScriptOutput", (n) -> { this.setPreRemediationDetectionScriptOutput(n.getStringValue()); });
        deserializerMap.put("remediationScriptError", (n) -> { this.setRemediationScriptError(n.getStringValue()); });
        deserializerMap.put("remediationState", (n) -> { this.setRemediationState(n.getEnumValue(RemediationState.class)); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Key of the device health script policy state is a concatenation of the MT sideCar policy Id and Intune device Id
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.lastStateUpdateDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the osVersion property value. Value of the OS Version in string
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the policyId property value. The MT sideCar policy Id
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the policyName property value. Display name of the device health script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.policyName;
    }
    /**
     * Gets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPostRemediationDetectionScriptError() {
        return this.postRemediationDetectionScriptError;
    }
    /**
     * Gets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPostRemediationDetectionScriptOutput() {
        return this.postRemediationDetectionScriptOutput;
    }
    /**
     * Gets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPreRemediationDetectionScriptError() {
        return this.preRemediationDetectionScriptError;
    }
    /**
     * Gets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPreRemediationDetectionScriptOutput() {
        return this.preRemediationDetectionScriptOutput;
    }
    /**
     * Gets the remediationScriptError property value. Error output of the remediation script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRemediationScriptError() {
        return this.remediationScriptError;
    }
    /**
     * Gets the remediationState property value. Indicates the type of execution status of the device management script.
     * @return a remediationState
     */
    @jakarta.annotation.Nullable
    public RemediationState getRemediationState() {
        return this.remediationState;
    }
    /**
     * Gets the userName property value. Name of the user whom ran the device health script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("assignmentFilterIds", this.getAssignmentFilterIds());
        writer.writeEnumValue("detectionState", this.getDetectionState());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("expectedStateUpdateDateTime", this.getExpectedStateUpdateDateTime());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeStringValue("postRemediationDetectionScriptError", this.getPostRemediationDetectionScriptError());
        writer.writeStringValue("postRemediationDetectionScriptOutput", this.getPostRemediationDetectionScriptOutput());
        writer.writeStringValue("preRemediationDetectionScriptError", this.getPreRemediationDetectionScriptError());
        writer.writeStringValue("preRemediationDetectionScriptOutput", this.getPreRemediationDetectionScriptOutput());
        writer.writeStringValue("remediationScriptError", this.getRemediationScriptError());
        writer.writeEnumValue("remediationState", this.getRemediationState());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @param value Value to set for the assignmentFilterIds property.
     */
    public void setAssignmentFilterIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.assignmentFilterIds = value;
    }
    /**
     * Sets the detectionState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the detectionState property.
     */
    public void setDetectionState(@jakarta.annotation.Nullable final RunState value) {
        this.detectionState = value;
    }
    /**
     * Sets the deviceId property value. The Intune device Id
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. Display name of the device
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     */
    public void setExpectedStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expectedStateUpdateDateTime = value;
    }
    /**
     * Sets the id property value. Key of the device health script policy state is a concatenation of the MT sideCar policy Id and Intune device Id
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     */
    public void setLastStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastStateUpdateDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the osVersion property value. Value of the OS Version in string
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the policyId property value. The MT sideCar policy Id
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the policyName property value. Display name of the device health script
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.policyName = value;
    }
    /**
     * Sets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @param value Value to set for the postRemediationDetectionScriptError property.
     */
    public void setPostRemediationDetectionScriptError(@jakarta.annotation.Nullable final String value) {
        this.postRemediationDetectionScriptError = value;
    }
    /**
     * Sets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @param value Value to set for the postRemediationDetectionScriptOutput property.
     */
    public void setPostRemediationDetectionScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.postRemediationDetectionScriptOutput = value;
    }
    /**
     * Sets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptError property.
     */
    public void setPreRemediationDetectionScriptError(@jakarta.annotation.Nullable final String value) {
        this.preRemediationDetectionScriptError = value;
    }
    /**
     * Sets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptOutput property.
     */
    public void setPreRemediationDetectionScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.preRemediationDetectionScriptOutput = value;
    }
    /**
     * Sets the remediationScriptError property value. Error output of the remediation script
     * @param value Value to set for the remediationScriptError property.
     */
    public void setRemediationScriptError(@jakarta.annotation.Nullable final String value) {
        this.remediationScriptError = value;
    }
    /**
     * Sets the remediationState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the remediationState property.
     */
    public void setRemediationState(@jakarta.annotation.Nullable final RemediationState value) {
        this.remediationState = value;
    }
    /**
     * Sets the userName property value. Name of the user whom ran the device health script
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}

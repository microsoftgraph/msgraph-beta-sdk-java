package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for policy run state of the device health script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthScriptPolicyState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceHealthScriptPolicyState and sets the default values.
     */
    public DeviceHealthScriptPolicyState() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthScriptPolicyState
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptPolicyState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptPolicyState();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this.backingStore.get("assignmentFilterIds");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the detectionState property value. Indicates the type of execution status of the device management script.
     * @return a RunState
     */
    @jakarta.annotation.Nullable
    public RunState getDetectionState() {
        return this.backingStore.get("detectionState");
    }
    /**
     * Gets the deviceId property value. The Intune device Id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. Display name of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpectedStateUpdateDateTime() {
        return this.backingStore.get("expectedStateUpdateDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("assignmentFilterIds", (n) -> { this.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detectionState", (n) -> { this.setDetectionState(n.getEnumValue(RunState::forValue)); });
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
        deserializerMap.put("remediationState", (n) -> { this.setRemediationState(n.getEnumValue(RemediationState::forValue)); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Key of the device health script policy state is a concatenation of the MT sideCar policy Id and Intune device Id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.backingStore.get("lastStateUpdateDateTime");
    }
    /**
     * Gets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the osVersion property value. Value of the OS Version in string
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the policyId property value. The MT sideCar policy Id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyName property value. Display name of the device health script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostRemediationDetectionScriptError() {
        return this.backingStore.get("postRemediationDetectionScriptError");
    }
    /**
     * Gets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostRemediationDetectionScriptOutput() {
        return this.backingStore.get("postRemediationDetectionScriptOutput");
    }
    /**
     * Gets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreRemediationDetectionScriptError() {
        return this.backingStore.get("preRemediationDetectionScriptError");
    }
    /**
     * Gets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreRemediationDetectionScriptOutput() {
        return this.backingStore.get("preRemediationDetectionScriptOutput");
    }
    /**
     * Gets the remediationScriptError property value. Error output of the remediation script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemediationScriptError() {
        return this.backingStore.get("remediationScriptError");
    }
    /**
     * Gets the remediationState property value. Indicates the type of execution status of the device management script.
     * @return a RemediationState
     */
    @jakarta.annotation.Nullable
    public RemediationState getRemediationState() {
        return this.backingStore.get("remediationState");
    }
    /**
     * Gets the userName property value. Name of the user whom ran the device health script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @param value Value to set for the assignmentFilterIds property.
     */
    public void setAssignmentFilterIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("assignmentFilterIds", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the detectionState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the detectionState property.
     */
    public void setDetectionState(@jakarta.annotation.Nullable final RunState value) {
        this.backingStore.set("detectionState", value);
    }
    /**
     * Sets the deviceId property value. The Intune device Id
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. Display name of the device
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     */
    public void setExpectedStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expectedStateUpdateDateTime", value);
    }
    /**
     * Sets the id property value. Key of the device health script policy state is a concatenation of the MT sideCar policy Id and Intune device Id
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     */
    public void setLastStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastStateUpdateDateTime", value);
    }
    /**
     * Sets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the osVersion property value. Value of the OS Version in string
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the policyId property value. The MT sideCar policy Id
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. Display name of the device health script
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @param value Value to set for the postRemediationDetectionScriptError property.
     */
    public void setPostRemediationDetectionScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postRemediationDetectionScriptError", value);
    }
    /**
     * Sets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @param value Value to set for the postRemediationDetectionScriptOutput property.
     */
    public void setPostRemediationDetectionScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postRemediationDetectionScriptOutput", value);
    }
    /**
     * Sets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptError property.
     */
    public void setPreRemediationDetectionScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preRemediationDetectionScriptError", value);
    }
    /**
     * Sets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptOutput property.
     */
    public void setPreRemediationDetectionScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preRemediationDetectionScriptOutput", value);
    }
    /**
     * Sets the remediationScriptError property value. Error output of the remediation script
     * @param value Value to set for the remediationScriptError property.
     */
    public void setRemediationScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediationScriptError", value);
    }
    /**
     * Sets the remediationState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the remediationState property.
     */
    public void setRemediationState(@jakarta.annotation.Nullable final RemediationState value) {
        this.backingStore.set("remediationState", value);
    }
    /**
     * Sets the userName property value. Name of the user whom ran the device health script
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
}

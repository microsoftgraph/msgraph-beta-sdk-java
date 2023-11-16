package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The endpoint privilege management elevation result entity representing a single elevation action on a client device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegeManagementElevation extends Entity implements Parsable {
    /**
     * Instantiates a new PrivilegeManagementElevation and sets the default values.
     */
    public PrivilegeManagementElevation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegeManagementElevation
     */
    @jakarta.annotation.Nonnull
    public static PrivilegeManagementElevation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegeManagementElevation();
    }
    /**
     * Gets the certificatePayload property value. The certificate payload of the application. This is computed by hashing the certificate information on the client. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a50`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificatePayload() {
        return this.backingStore.get("certificatePayload");
    }
    /**
     * Gets the companyName property value. The company name of the application. This value is set by the creator of the application. Example: `Microsoft Corporation`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.backingStore.get("companyName");
    }
    /**
     * Gets the deviceId property value. The Intune deviceId. Unique identifier for the managed device. Example: `92ce5047-9553-4731-817f-9b401a999a1b`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. The name associated with the device in the intune database. Example: `JOHNDOE-LAPTOP`.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the elevationType property value. Indicates the type of elevation occured
     * @return a PrivilegeManagementElevationType
     */
    @jakarta.annotation.Nullable
    public PrivilegeManagementElevationType getElevationType() {
        return this.backingStore.get("elevationType");
    }
    /**
     * Gets the eventDateTime property value. The date and time when the application was elevated. Example:`2014-01-01T00:00:00Z`
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
        deserializerMap.put("certificatePayload", (n) -> { this.setCertificatePayload(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("elevationType", (n) -> { this.setElevationType(n.getEnumValue(PrivilegeManagementElevationType.class)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileDescription", (n) -> { this.setFileDescription(n.getStringValue()); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("fileVersion", (n) -> { this.setFileVersion(n.getStringValue()); });
        deserializerMap.put("hash", (n) -> { this.setHash(n.getStringValue()); });
        deserializerMap.put("internalName", (n) -> { this.setInternalName(n.getStringValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("parentProcessName", (n) -> { this.setParentProcessName(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("processType", (n) -> { this.setProcessType(n.getEnumValue(PrivilegeManagementProcessType.class)); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getIntegerValue()); });
        deserializerMap.put("ruleId", (n) -> { this.setRuleId(n.getStringValue()); });
        deserializerMap.put("upn", (n) -> { this.setUpn(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(PrivilegeManagementEndUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the fileDescription property value. The file description of the application. This value is set by the creator of the application. Example: `Editor of multiple coding languages.`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileDescription() {
        return this.backingStore.get("fileDescription");
    }
    /**
     * Gets the filePath property value. The full file path of the application including the filename and file extension. Example: `C:/Program Files/vscode.exe`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.backingStore.get("filePath");
    }
    /**
     * Gets the fileVersion property value. The version of the application. This value is set by the creator of the application. Example: `6.2211.1035.1000`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileVersion() {
        return this.backingStore.get("fileVersion");
    }
    /**
     * Gets the hash property value. The sha256 hash of the application. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a57`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHash() {
        return this.backingStore.get("hash");
    }
    /**
     * Gets the internalName property value. The internal name of the application. This value is set by the creator of the application. Example: `VS code`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternalName() {
        return this.backingStore.get("internalName");
    }
    /**
     * Gets the justification property value. The justification to elevate the application. This is an input by the user when the privilegeManagementElevationType is of type userConfirmedElevation or support approved elevation. This will be null in all other scenarios. The length is capped at 256 char, enforced on the client side. Example: `To install debug tool.`.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the parentProcessName property value. The name of parent process associated with the elevated process. This is always populated for both parent and child process types
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentProcessName() {
        return this.backingStore.get("parentProcessName");
    }
    /**
     * Gets the policyId property value. Unique Identifier of the policy configured to run the application with elevated access
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyName property value. The name of the policy configured to run the application in elevated access
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the processType property value. Indicates the type of elevated process
     * @return a PrivilegeManagementProcessType
     */
    @jakarta.annotation.Nullable
    public PrivilegeManagementProcessType getProcessType() {
        return this.backingStore.get("processType");
    }
    /**
     * Gets the productName property value. The product name of the application. This value is set by the creator of the application. Example: `Visual Studio`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the result property value. The result of the elevation action with 0 being success, and everything else being exit code if the elevation was unsuccessful. The value will always be 0 on all unmanaged elevation. Example: `0`. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getResult() {
        return this.backingStore.get("result");
    }
    /**
     * Gets the ruleId property value. Unique identifier of the rule configured to run the application with elevated access
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRuleId() {
        return this.backingStore.get("ruleId");
    }
    /**
     * Gets the upn property value. The User Principal Name of the user who performed the elevation. Example: `john@domain.com`
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpn() {
        return this.backingStore.get("upn");
    }
    /**
     * Gets the userType property value. The type of user account on Windows that was used to performed the elevation.
     * @return a PrivilegeManagementEndUserType
     */
    @jakarta.annotation.Nullable
    public PrivilegeManagementEndUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificatePayload", this.getCertificatePayload());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("elevationType", this.getElevationType());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("fileDescription", this.getFileDescription());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeStringValue("fileVersion", this.getFileVersion());
        writer.writeStringValue("hash", this.getHash());
        writer.writeStringValue("internalName", this.getInternalName());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("parentProcessName", this.getParentProcessName());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeEnumValue("processType", this.getProcessType());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeIntegerValue("result", this.getResult());
        writer.writeStringValue("ruleId", this.getRuleId());
        writer.writeStringValue("upn", this.getUpn());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the certificatePayload property value. The certificate payload of the application. This is computed by hashing the certificate information on the client. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a50`
     * @param value Value to set for the certificatePayload property.
     */
    public void setCertificatePayload(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificatePayload", value);
    }
    /**
     * Sets the companyName property value. The company name of the application. This value is set by the creator of the application. Example: `Microsoft Corporation`
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyName", value);
    }
    /**
     * Sets the deviceId property value. The Intune deviceId. Unique identifier for the managed device. Example: `92ce5047-9553-4731-817f-9b401a999a1b`
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. The name associated with the device in the intune database. Example: `JOHNDOE-LAPTOP`.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the elevationType property value. Indicates the type of elevation occured
     * @param value Value to set for the elevationType property.
     */
    public void setElevationType(@jakarta.annotation.Nullable final PrivilegeManagementElevationType value) {
        this.backingStore.set("elevationType", value);
    }
    /**
     * Sets the eventDateTime property value. The date and time when the application was elevated. Example:`2014-01-01T00:00:00Z`
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the fileDescription property value. The file description of the application. This value is set by the creator of the application. Example: `Editor of multiple coding languages.`
     * @param value Value to set for the fileDescription property.
     */
    public void setFileDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileDescription", value);
    }
    /**
     * Sets the filePath property value. The full file path of the application including the filename and file extension. Example: `C:/Program Files/vscode.exe`
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePath", value);
    }
    /**
     * Sets the fileVersion property value. The version of the application. This value is set by the creator of the application. Example: `6.2211.1035.1000`
     * @param value Value to set for the fileVersion property.
     */
    public void setFileVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileVersion", value);
    }
    /**
     * Sets the hash property value. The sha256 hash of the application. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a57`
     * @param value Value to set for the hash property.
     */
    public void setHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hash", value);
    }
    /**
     * Sets the internalName property value. The internal name of the application. This value is set by the creator of the application. Example: `VS code`
     * @param value Value to set for the internalName property.
     */
    public void setInternalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internalName", value);
    }
    /**
     * Sets the justification property value. The justification to elevate the application. This is an input by the user when the privilegeManagementElevationType is of type userConfirmedElevation or support approved elevation. This will be null in all other scenarios. The length is capped at 256 char, enforced on the client side. Example: `To install debug tool.`.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the parentProcessName property value. The name of parent process associated with the elevated process. This is always populated for both parent and child process types
     * @param value Value to set for the parentProcessName property.
     */
    public void setParentProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentProcessName", value);
    }
    /**
     * Sets the policyId property value. Unique Identifier of the policy configured to run the application with elevated access
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. The name of the policy configured to run the application in elevated access
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the processType property value. Indicates the type of elevated process
     * @param value Value to set for the processType property.
     */
    public void setProcessType(@jakarta.annotation.Nullable final PrivilegeManagementProcessType value) {
        this.backingStore.set("processType", value);
    }
    /**
     * Sets the productName property value. The product name of the application. This value is set by the creator of the application. Example: `Visual Studio`
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the result property value. The result of the elevation action with 0 being success, and everything else being exit code if the elevation was unsuccessful. The value will always be 0 on all unmanaged elevation. Example: `0`. Valid values 0 to 2147483647
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("result", value);
    }
    /**
     * Sets the ruleId property value. Unique identifier of the rule configured to run the application with elevated access
     * @param value Value to set for the ruleId property.
     */
    public void setRuleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ruleId", value);
    }
    /**
     * Sets the upn property value. The User Principal Name of the user who performed the elevation. Example: `john@domain.com`
     * @param value Value to set for the upn property.
     */
    public void setUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("upn", value);
    }
    /**
     * Sets the userType property value. The type of user account on Windows that was used to performed the elevation.
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final PrivilegeManagementEndUserType value) {
        this.backingStore.set("userType", value);
    }
}

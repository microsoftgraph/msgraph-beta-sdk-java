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
public class PrivilegeManagementElevation extends Entity implements Parsable {
    /**
     * The certificate payload of the application. This is computed by hashing the certificate information on the client. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a50`
     */
    private String certificatePayload;
    /**
     * The company name of the application. This value is set by the creator of the application. Example: `Microsoft Corporation`
     */
    private String companyName;
    /**
     * The Intune deviceId. Unique identifier for the managed device. Example: `92ce5047-9553-4731-817f-9b401a999a1b`
     */
    private String deviceId;
    /**
     * The name associated with the device in the intune database. Example: `JOHNDOE-LAPTOP`.
     */
    private String deviceName;
    /**
     * Indicates the type of elevation occured
     */
    private PrivilegeManagementElevationType elevationType;
    /**
     * The date and time when the application was elevated. Example:`2014-01-01T00:00:00Z`
     */
    private OffsetDateTime eventDateTime;
    /**
     * The file description of the application. This value is set by the creator of the application. Example: `Editor of multiple coding languages.`
     */
    private String fileDescription;
    /**
     * The full file path of the application including the filename and file extension. Example: `C:/Program Files/vscode.exe`
     */
    private String filePath;
    /**
     * The version of the application. This value is set by the creator of the application. Example: `6.2211.1035.1000`
     */
    private String fileVersion;
    /**
     * The sha256 hash of the application. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a57`
     */
    private String hash;
    /**
     * The internal name of the application. This value is set by the creator of the application. Example: `VS code`
     */
    private String internalName;
    /**
     * The justification to elevate the application. This is an input by the user when the privilegeManagementElevationType is of type userConfirmedElevation or support approved elevation. This will be null in all other scenarios. The length is capped at 256 char, enforced on the client side. Example: `To install debug tool.`.
     */
    private String justification;
    /**
     * The product name of the application. This value is set by the creator of the application. Example: `Visual Studio`
     */
    private String productName;
    /**
     * The result of the elevation action with 0 being success, and everything else being exit code if the elevation was unsuccessful. The value will always be 0 on all unmanaged elevation. Example: `0`. Valid values 0 to 2147483647
     */
    private Integer result;
    /**
     * The User Principal Name of the user who performed the elevation. Example: `john@domain.com`
     */
    private String upn;
    /**
     * The type of user account on Windows that was used to performed the elevation.
     */
    private PrivilegeManagementEndUserType userType;
    /**
     * Instantiates a new privilegeManagementElevation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PrivilegeManagementElevation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegeManagementElevation
     */
    @jakarta.annotation.Nonnull
    public static PrivilegeManagementElevation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegeManagementElevation();
    }
    /**
     * Gets the certificatePayload property value. The certificate payload of the application. This is computed by hashing the certificate information on the client. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a50`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificatePayload() {
        return this.certificatePayload;
    }
    /**
     * Gets the companyName property value. The company name of the application. This value is set by the creator of the application. Example: `Microsoft Corporation`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the deviceId property value. The Intune deviceId. Unique identifier for the managed device. Example: `92ce5047-9553-4731-817f-9b401a999a1b`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. The name associated with the device in the intune database. Example: `JOHNDOE-LAPTOP`.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the elevationType property value. Indicates the type of elevation occured
     * @return a privilegeManagementElevationType
     */
    @jakarta.annotation.Nullable
    public PrivilegeManagementElevationType getElevationType() {
        return this.elevationType;
    }
    /**
     * Gets the eventDateTime property value. The date and time when the application was elevated. Example:`2014-01-01T00:00:00Z`
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
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
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getIntegerValue()); });
        deserializerMap.put("upn", (n) -> { this.setUpn(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(PrivilegeManagementEndUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the fileDescription property value. The file description of the application. This value is set by the creator of the application. Example: `Editor of multiple coding languages.`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileDescription() {
        return this.fileDescription;
    }
    /**
     * Gets the filePath property value. The full file path of the application including the filename and file extension. Example: `C:/Program Files/vscode.exe`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * Gets the fileVersion property value. The version of the application. This value is set by the creator of the application. Example: `6.2211.1035.1000`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileVersion() {
        return this.fileVersion;
    }
    /**
     * Gets the hash property value. The sha256 hash of the application. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a57`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHash() {
        return this.hash;
    }
    /**
     * Gets the internalName property value. The internal name of the application. This value is set by the creator of the application. Example: `VS code`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInternalName() {
        return this.internalName;
    }
    /**
     * Gets the justification property value. The justification to elevate the application. This is an input by the user when the privilegeManagementElevationType is of type userConfirmedElevation or support approved elevation. This will be null in all other scenarios. The length is capped at 256 char, enforced on the client side. Example: `To install debug tool.`.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the productName property value. The product name of the application. This value is set by the creator of the application. Example: `Visual Studio`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.productName;
    }
    /**
     * Gets the result property value. The result of the elevation action with 0 being success, and everything else being exit code if the elevation was unsuccessful. The value will always be 0 on all unmanaged elevation. Example: `0`. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getResult() {
        return this.result;
    }
    /**
     * Gets the upn property value. The User Principal Name of the user who performed the elevation. Example: `john@domain.com`
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUpn() {
        return this.upn;
    }
    /**
     * Gets the userType property value. The type of user account on Windows that was used to performed the elevation.
     * @return a privilegeManagementEndUserType
     */
    @jakarta.annotation.Nullable
    public PrivilegeManagementEndUserType getUserType() {
        return this.userType;
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
        writer.writeStringValue("productName", this.getProductName());
        writer.writeIntegerValue("result", this.getResult());
        writer.writeStringValue("upn", this.getUpn());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the certificatePayload property value. The certificate payload of the application. This is computed by hashing the certificate information on the client. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a50`
     * @param value Value to set for the certificatePayload property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificatePayload(@jakarta.annotation.Nullable final String value) {
        this.certificatePayload = value;
    }
    /**
     * Sets the companyName property value. The company name of the application. This value is set by the creator of the application. Example: `Microsoft Corporation`
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the deviceId property value. The Intune deviceId. Unique identifier for the managed device. Example: `92ce5047-9553-4731-817f-9b401a999a1b`
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name associated with the device in the intune database. Example: `JOHNDOE-LAPTOP`.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the elevationType property value. Indicates the type of elevation occured
     * @param value Value to set for the elevationType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setElevationType(@jakarta.annotation.Nullable final PrivilegeManagementElevationType value) {
        this.elevationType = value;
    }
    /**
     * Sets the eventDateTime property value. The date and time when the application was elevated. Example:`2014-01-01T00:00:00Z`
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the fileDescription property value. The file description of the application. This value is set by the creator of the application. Example: `Editor of multiple coding languages.`
     * @param value Value to set for the fileDescription property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileDescription(@jakarta.annotation.Nullable final String value) {
        this.fileDescription = value;
    }
    /**
     * Sets the filePath property value. The full file path of the application including the filename and file extension. Example: `C:/Program Files/vscode.exe`
     * @param value Value to set for the filePath property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.filePath = value;
    }
    /**
     * Sets the fileVersion property value. The version of the application. This value is set by the creator of the application. Example: `6.2211.1035.1000`
     * @param value Value to set for the fileVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVersion(@jakarta.annotation.Nullable final String value) {
        this.fileVersion = value;
    }
    /**
     * Sets the hash property value. The sha256 hash of the application. Example: `32c220482c68413fbf8290e3b1e49b0a85901cfcd62ab0738760568a2a6e8a57`
     * @param value Value to set for the hash property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHash(@jakarta.annotation.Nullable final String value) {
        this.hash = value;
    }
    /**
     * Sets the internalName property value. The internal name of the application. This value is set by the creator of the application. Example: `VS code`
     * @param value Value to set for the internalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInternalName(@jakarta.annotation.Nullable final String value) {
        this.internalName = value;
    }
    /**
     * Sets the justification property value. The justification to elevate the application. This is an input by the user when the privilegeManagementElevationType is of type userConfirmedElevation or support approved elevation. This will be null in all other scenarios. The length is capped at 256 char, enforced on the client side. Example: `To install debug tool.`.
     * @param value Value to set for the justification property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the productName property value. The product name of the application. This value is set by the creator of the application. Example: `Visual Studio`
     * @param value Value to set for the productName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.productName = value;
    }
    /**
     * Sets the result property value. The result of the elevation action with 0 being success, and everything else being exit code if the elevation was unsuccessful. The value will always be 0 on all unmanaged elevation. Example: `0`. Valid values 0 to 2147483647
     * @param value Value to set for the result property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResult(@jakarta.annotation.Nullable final Integer value) {
        this.result = value;
    }
    /**
     * Sets the upn property value. The User Principal Name of the user who performed the elevation. Example: `john@domain.com`
     * @param value Value to set for the upn property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpn(@jakarta.annotation.Nullable final String value) {
        this.upn = value;
    }
    /**
     * Sets the userType property value. The type of user account on Windows that was used to performed the elevation.
     * @param value Value to set for the userType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserType(@jakarta.annotation.Nullable final PrivilegeManagementEndUserType value) {
        this.userType = value;
    }
}

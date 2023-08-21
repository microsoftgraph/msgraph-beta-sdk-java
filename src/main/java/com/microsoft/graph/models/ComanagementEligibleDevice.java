package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Co-Management eligibility state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComanagementEligibleDevice extends Entity implements Parsable {
    /**
     * Device registration status.
     */
    private DeviceRegistrationState clientRegistrationStatus;
    /**
     * DeviceName
     */
    private String deviceName;
    /**
     * Device type.
     */
    private DeviceType deviceType;
    /**
     * EntitySource
     */
    private Integer entitySource;
    /**
     * Management agent type.
     */
    private ManagementAgentType managementAgents;
    /**
     * Management state of device in Microsoft Intune.
     */
    private ManagementState managementState;
    /**
     * Manufacturer
     */
    private String manufacturer;
    /**
     * MDMStatus
     */
    private String mdmStatus;
    /**
     * Model
     */
    private String model;
    /**
     * OSDescription
     */
    private String osDescription;
    /**
     * OSVersion
     */
    private String osVersion;
    /**
     * Owner type of device.
     */
    private OwnerType ownerType;
    /**
     * ReferenceId
     */
    private String referenceId;
    /**
     * SerialNumber
     */
    private String serialNumber;
    /**
     * The status property
     */
    private ComanagementEligibleType status;
    /**
     * UPN
     */
    private String upn;
    /**
     * UserEmail
     */
    private String userEmail;
    /**
     * UserId
     */
    private String userId;
    /**
     * UserName
     */
    private String userName;
    /**
     * Instantiates a new comanagementEligibleDevice and sets the default values.
     */
    public ComanagementEligibleDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a comanagementEligibleDevice
     */
    @jakarta.annotation.Nonnull
    public static ComanagementEligibleDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComanagementEligibleDevice();
    }
    /**
     * Gets the clientRegistrationStatus property value. Device registration status.
     * @return a deviceRegistrationState
     */
    @jakarta.annotation.Nullable
    public DeviceRegistrationState getClientRegistrationStatus() {
        return this.clientRegistrationStatus;
    }
    /**
     * Gets the deviceName property value. DeviceName
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceType
     */
    @jakarta.annotation.Nullable
    public DeviceType getDeviceType() {
        return this.deviceType;
    }
    /**
     * Gets the entitySource property value. EntitySource
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEntitySource() {
        return this.entitySource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientRegistrationStatus", (n) -> { this.setClientRegistrationStatus(n.getEnumValue(DeviceRegistrationState.class)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceType.class)); });
        deserializerMap.put("entitySource", (n) -> { this.setEntitySource(n.getIntegerValue()); });
        deserializerMap.put("managementAgents", (n) -> { this.setManagementAgents(n.getEnumValue(ManagementAgentType.class)); });
        deserializerMap.put("managementState", (n) -> { this.setManagementState(n.getEnumValue(ManagementState.class)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("mdmStatus", (n) -> { this.setMdmStatus(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getEnumValue(OwnerType.class)); });
        deserializerMap.put("referenceId", (n) -> { this.setReferenceId(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ComanagementEligibleType.class)); });
        deserializerMap.put("upn", (n) -> { this.setUpn(n.getStringValue()); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managementAgents property value. Management agent type.
     * @return a managementAgentType
     */
    @jakarta.annotation.Nullable
    public ManagementAgentType getManagementAgents() {
        return this.managementAgents;
    }
    /**
     * Gets the managementState property value. Management state of device in Microsoft Intune.
     * @return a managementState
     */
    @jakarta.annotation.Nullable
    public ManagementState getManagementState() {
        return this.managementState;
    }
    /**
     * Gets the manufacturer property value. Manufacturer
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the mdmStatus property value. MDMStatus
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMdmStatus() {
        return this.mdmStatus;
    }
    /**
     * Gets the model property value. Model
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the osDescription property value. OSDescription
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsDescription() {
        return this.osDescription;
    }
    /**
     * Gets the osVersion property value. OSVersion
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a ownerType
     */
    @jakarta.annotation.Nullable
    public OwnerType getOwnerType() {
        return this.ownerType;
    }
    /**
     * Gets the referenceId property value. ReferenceId
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.referenceId;
    }
    /**
     * Gets the serialNumber property value. SerialNumber
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the status property value. The status property
     * @return a comanagementEligibleType
     */
    @jakarta.annotation.Nullable
    public ComanagementEligibleType getStatus() {
        return this.status;
    }
    /**
     * Gets the upn property value. UPN
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUpn() {
        return this.upn;
    }
    /**
     * Gets the userEmail property value. UserEmail
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Gets the userId property value. UserId
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. UserName
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
        super.serialize(writer);
        writer.writeEnumValue("clientRegistrationStatus", this.getClientRegistrationStatus());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeIntegerValue("entitySource", this.getEntitySource());
        writer.writeEnumValue("managementAgents", this.getManagementAgents());
        writer.writeEnumValue("managementState", this.getManagementState());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("mdmStatus", this.getMdmStatus());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("ownerType", this.getOwnerType());
        writer.writeStringValue("referenceId", this.getReferenceId());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("upn", this.getUpn());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the clientRegistrationStatus property value. Device registration status.
     * @param value Value to set for the clientRegistrationStatus property.
     */
    public void setClientRegistrationStatus(@jakarta.annotation.Nullable final DeviceRegistrationState value) {
        this.clientRegistrationStatus = value;
    }
    /**
     * Sets the deviceName property value. DeviceName
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final DeviceType value) {
        this.deviceType = value;
    }
    /**
     * Sets the entitySource property value. EntitySource
     * @param value Value to set for the entitySource property.
     */
    public void setEntitySource(@jakarta.annotation.Nullable final Integer value) {
        this.entitySource = value;
    }
    /**
     * Sets the managementAgents property value. Management agent type.
     * @param value Value to set for the managementAgents property.
     */
    public void setManagementAgents(@jakarta.annotation.Nullable final ManagementAgentType value) {
        this.managementAgents = value;
    }
    /**
     * Sets the managementState property value. Management state of device in Microsoft Intune.
     * @param value Value to set for the managementState property.
     */
    public void setManagementState(@jakarta.annotation.Nullable final ManagementState value) {
        this.managementState = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the mdmStatus property value. MDMStatus
     * @param value Value to set for the mdmStatus property.
     */
    public void setMdmStatus(@jakarta.annotation.Nullable final String value) {
        this.mdmStatus = value;
    }
    /**
     * Sets the model property value. Model
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the osDescription property value. OSDescription
     * @param value Value to set for the osDescription property.
     */
    public void setOsDescription(@jakarta.annotation.Nullable final String value) {
        this.osDescription = value;
    }
    /**
     * Sets the osVersion property value. OSVersion
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     */
    public void setOwnerType(@jakarta.annotation.Nullable final OwnerType value) {
        this.ownerType = value;
    }
    /**
     * Sets the referenceId property value. ReferenceId
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.referenceId = value;
    }
    /**
     * Sets the serialNumber property value. SerialNumber
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ComanagementEligibleType value) {
        this.status = value;
    }
    /**
     * Sets the upn property value. UPN
     * @param value Value to set for the upn property.
     */
    public void setUpn(@jakarta.annotation.Nullable final String value) {
        this.upn = value;
    }
    /**
     * Sets the userEmail property value. UserEmail
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
    /**
     * Sets the userId property value. UserId
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. UserName
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}

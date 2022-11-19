package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Co-Management eligibility state */
public class ComanagementEligibleDevice extends Entity implements Parsable {
    /** Device registration status. */
    private DeviceRegistrationState _clientRegistrationStatus;
    /** DeviceName */
    private String _deviceName;
    /** Device type. */
    private DeviceType _deviceType;
    /** EntitySource */
    private Integer _entitySource;
    /** Management agent type. */
    private ManagementAgentType _managementAgents;
    /** Management state of device in Microsoft Intune. */
    private ManagementState _managementState;
    /** Manufacturer */
    private String _manufacturer;
    /** MDMStatus */
    private String _mdmStatus;
    /** Model */
    private String _model;
    /** OSDescription */
    private String _osDescription;
    /** OSVersion */
    private String _osVersion;
    /** Owner type of device. */
    private OwnerType _ownerType;
    /** ReferenceId */
    private String _referenceId;
    /** SerialNumber */
    private String _serialNumber;
    /** The status property */
    private ComanagementEligibleType _status;
    /** UPN */
    private String _upn;
    /** UserEmail */
    private String _userEmail;
    /** UserId */
    private String _userId;
    /** UserName */
    private String _userName;
    /**
     * Instantiates a new comanagementEligibleDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ComanagementEligibleDevice() {
        super();
        this.setOdataType("#microsoft.graph.comanagementEligibleDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a comanagementEligibleDevice
     */
    @javax.annotation.Nonnull
    public static ComanagementEligibleDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComanagementEligibleDevice();
    }
    /**
     * Gets the clientRegistrationStatus property value. Device registration status.
     * @return a deviceRegistrationState
     */
    @javax.annotation.Nullable
    public DeviceRegistrationState getClientRegistrationStatus() {
        return this._clientRegistrationStatus;
    }
    /**
     * Gets the deviceName property value. DeviceName
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceType
     */
    @javax.annotation.Nullable
    public DeviceType getDeviceType() {
        return this._deviceType;
    }
    /**
     * Gets the entitySource property value. EntitySource
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEntitySource() {
        return this._entitySource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ComanagementEligibleDevice currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientRegistrationStatus", (n) -> { currentObject.setClientRegistrationStatus(n.getEnumValue(DeviceRegistrationState.class)); });
        deserializerMap.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { currentObject.setDeviceType(n.getEnumValue(DeviceType.class)); });
        deserializerMap.put("entitySource", (n) -> { currentObject.setEntitySource(n.getIntegerValue()); });
        deserializerMap.put("managementAgents", (n) -> { currentObject.setManagementAgents(n.getEnumValue(ManagementAgentType.class)); });
        deserializerMap.put("managementState", (n) -> { currentObject.setManagementState(n.getEnumValue(ManagementState.class)); });
        deserializerMap.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
        deserializerMap.put("mdmStatus", (n) -> { currentObject.setMdmStatus(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
        deserializerMap.put("osDescription", (n) -> { currentObject.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { currentObject.setOwnerType(n.getEnumValue(OwnerType.class)); });
        deserializerMap.put("referenceId", (n) -> { currentObject.setReferenceId(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ComanagementEligibleType.class)); });
        deserializerMap.put("upn", (n) -> { currentObject.setUpn(n.getStringValue()); });
        deserializerMap.put("userEmail", (n) -> { currentObject.setUserEmail(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managementAgents property value. Management agent type.
     * @return a managementAgentType
     */
    @javax.annotation.Nullable
    public ManagementAgentType getManagementAgents() {
        return this._managementAgents;
    }
    /**
     * Gets the managementState property value. Management state of device in Microsoft Intune.
     * @return a managementState
     */
    @javax.annotation.Nullable
    public ManagementState getManagementState() {
        return this._managementState;
    }
    /**
     * Gets the manufacturer property value. Manufacturer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the mdmStatus property value. MDMStatus
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmStatus() {
        return this._mdmStatus;
    }
    /**
     * Gets the model property value. Model
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the osDescription property value. OSDescription
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this._osDescription;
    }
    /**
     * Gets the osVersion property value. OSVersion
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a ownerType
     */
    @javax.annotation.Nullable
    public OwnerType getOwnerType() {
        return this._ownerType;
    }
    /**
     * Gets the referenceId property value. ReferenceId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferenceId() {
        return this._referenceId;
    }
    /**
     * Gets the serialNumber property value. SerialNumber
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the status property value. The status property
     * @return a comanagementEligibleType
     */
    @javax.annotation.Nullable
    public ComanagementEligibleType getStatus() {
        return this._status;
    }
    /**
     * Gets the upn property value. UPN
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpn() {
        return this._upn;
    }
    /**
     * Gets the userEmail property value. UserEmail
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this._userEmail;
    }
    /**
     * Gets the userId property value. UserId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userName property value. UserName
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientRegistrationStatus(@javax.annotation.Nullable final DeviceRegistrationState value) {
        this._clientRegistrationStatus = value;
    }
    /**
     * Sets the deviceName property value. DeviceName
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final DeviceType value) {
        this._deviceType = value;
    }
    /**
     * Sets the entitySource property value. EntitySource
     * @param value Value to set for the entitySource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntitySource(@javax.annotation.Nullable final Integer value) {
        this._entitySource = value;
    }
    /**
     * Sets the managementAgents property value. Management agent type.
     * @param value Value to set for the managementAgents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementAgents(@javax.annotation.Nullable final ManagementAgentType value) {
        this._managementAgents = value;
    }
    /**
     * Sets the managementState property value. Management state of device in Microsoft Intune.
     * @param value Value to set for the managementState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementState(@javax.annotation.Nullable final ManagementState value) {
        this._managementState = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the mdmStatus property value. MDMStatus
     * @param value Value to set for the mdmStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmStatus(@javax.annotation.Nullable final String value) {
        this._mdmStatus = value;
    }
    /**
     * Sets the model property value. Model
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the osDescription property value. OSDescription
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this._osDescription = value;
    }
    /**
     * Sets the osVersion property value. OSVersion
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerType(@javax.annotation.Nullable final OwnerType value) {
        this._ownerType = value;
    }
    /**
     * Sets the referenceId property value. ReferenceId
     * @param value Value to set for the referenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferenceId(@javax.annotation.Nullable final String value) {
        this._referenceId = value;
    }
    /**
     * Sets the serialNumber property value. SerialNumber
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ComanagementEligibleType value) {
        this._status = value;
    }
    /**
     * Sets the upn property value. UPN
     * @param value Value to set for the upn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpn(@javax.annotation.Nullable final String value) {
        this._upn = value;
    }
    /**
     * Sets the userEmail property value. UserEmail
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this._userEmail = value;
    }
    /**
     * Sets the userId property value. UserId
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userName property value. UserName
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}

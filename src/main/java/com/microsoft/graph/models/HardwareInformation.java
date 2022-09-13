package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Hardware information of a given device. */
public class HardwareInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647 */
    private Integer _batteryChargeCycles;
    /** The devices current batterys health percentage. Valid values 0 to 100 */
    private Integer _batteryHealthPercentage;
    /** The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100 */
    private Double _batteryLevelPercentage;
    /** The serial number of the devices current battery */
    private String _batterySerialNumber;
    /** Cellular technology of the device */
    private String _cellularTechnology;
    /** Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string. */
    private String _deviceFullQualifiedDomainName;
    /** The deviceGuardLocalSystemAuthorityCredentialGuardState property */
    private DeviceGuardLocalSystemAuthorityCredentialGuardState _deviceGuardLocalSystemAuthorityCredentialGuardState;
    /** The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property */
    private DeviceGuardVirtualizationBasedSecurityHardwareRequirementState _deviceGuardVirtualizationBasedSecurityHardwareRequirementState;
    /** The deviceGuardVirtualizationBasedSecurityState property */
    private DeviceGuardVirtualizationBasedSecurityState _deviceGuardVirtualizationBasedSecurityState;
    /** A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647 */
    private Integer _deviceLicensingLastErrorCode;
    /** Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. */
    private String _deviceLicensingLastErrorDescription;
    /** Indicates the device licensing status after Windows device based subscription has been enabled. */
    private DeviceLicensingStatus _deviceLicensingStatus;
    /** eSIM identifier */
    private String _esimIdentifier;
    /** Free storage space of the device. */
    private Long _freeStorageSpace;
    /** IMEI */
    private String _imei;
    /** IPAddressV4 */
    private String _ipAddressV4;
    /** Encryption status of the device */
    private Boolean _isEncrypted;
    /** Shared iPad */
    private Boolean _isSharedDevice;
    /** Supervised mode of the device */
    private Boolean _isSupervised;
    /** Manufacturer of the device */
    private String _manufacturer;
    /** MEID */
    private String _meid;
    /** Model of the device */
    private String _model;
    /** The OdataType property */
    private String _odataType;
    /** String that specifies the OS edition. */
    private String _operatingSystemEdition;
    /** Operating system language of the device */
    private String _operatingSystemLanguage;
    /** Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647 */
    private Integer _operatingSystemProductType;
    /** Operating System Build Number on Android device */
    private String _osBuildNumber;
    /** Phone number of the device */
    private String _phoneNumber;
    /** The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained. */
    private String _productName;
    /** The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647 */
    private Integer _residentUsersCount;
    /** Serial number. */
    private String _serialNumber;
    /** All users on the shared Apple device */
    private java.util.List<SharedAppleDeviceUser> _sharedDeviceCachedUsers;
    /** SubnetAddress */
    private String _subnetAddress;
    /** Subscriber carrier of the device */
    private String _subscriberCarrier;
    /** BIOS version as reported by SMBIOS */
    private String _systemManagementBIOSVersion;
    /** Total storage space of the device. */
    private Long _totalStorageSpace;
    /** The identifying information that uniquely names the TPM manufacturer */
    private String _tpmManufacturer;
    /** String that specifies the specification version. */
    private String _tpmSpecificationVersion;
    /** The version of the TPM, as specified by the manufacturer */
    private String _tpmVersion;
    /** WiFi MAC address of the device */
    private String _wifiMac;
    /** A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows. */
    private java.util.List<String> _wiredIPv4Addresses;
    /**
     * Instantiates a new hardwareInformation and sets the default values.
     * @return a void
     */
    public HardwareInformation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.hardwareInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hardwareInformation
     */
    @javax.annotation.Nonnull
    public static HardwareInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the batteryChargeCycles property value. The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryChargeCycles() {
        return this._batteryChargeCycles;
    }
    /**
     * Gets the batteryHealthPercentage property value. The devices current batterys health percentage. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryHealthPercentage() {
        return this._batteryHealthPercentage;
    }
    /**
     * Gets the batteryLevelPercentage property value. The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBatteryLevelPercentage() {
        return this._batteryLevelPercentage;
    }
    /**
     * Gets the batterySerialNumber property value. The serial number of the devices current battery
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBatterySerialNumber() {
        return this._batterySerialNumber;
    }
    /**
     * Gets the cellularTechnology property value. Cellular technology of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCellularTechnology() {
        return this._cellularTechnology;
    }
    /**
     * Gets the deviceFullQualifiedDomainName property value. Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceFullQualifiedDomainName() {
        return this._deviceFullQualifiedDomainName;
    }
    /**
     * Gets the deviceGuardLocalSystemAuthorityCredentialGuardState property value. The deviceGuardLocalSystemAuthorityCredentialGuardState property
     * @return a deviceGuardLocalSystemAuthorityCredentialGuardState
     */
    @javax.annotation.Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardState getDeviceGuardLocalSystemAuthorityCredentialGuardState() {
        return this._deviceGuardLocalSystemAuthorityCredentialGuardState;
    }
    /**
     * Gets the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property value. The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property
     * @return a deviceGuardVirtualizationBasedSecurityHardwareRequirementState
     */
    @javax.annotation.Nullable
    public DeviceGuardVirtualizationBasedSecurityHardwareRequirementState getDeviceGuardVirtualizationBasedSecurityHardwareRequirementState() {
        return this._deviceGuardVirtualizationBasedSecurityHardwareRequirementState;
    }
    /**
     * Gets the deviceGuardVirtualizationBasedSecurityState property value. The deviceGuardVirtualizationBasedSecurityState property
     * @return a deviceGuardVirtualizationBasedSecurityState
     */
    @javax.annotation.Nullable
    public DeviceGuardVirtualizationBasedSecurityState getDeviceGuardVirtualizationBasedSecurityState() {
        return this._deviceGuardVirtualizationBasedSecurityState;
    }
    /**
     * Gets the deviceLicensingLastErrorCode property value. A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceLicensingLastErrorCode() {
        return this._deviceLicensingLastErrorCode;
    }
    /**
     * Gets the deviceLicensingLastErrorDescription property value. Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceLicensingLastErrorDescription() {
        return this._deviceLicensingLastErrorDescription;
    }
    /**
     * Gets the deviceLicensingStatus property value. Indicates the device licensing status after Windows device based subscription has been enabled.
     * @return a deviceLicensingStatus
     */
    @javax.annotation.Nullable
    public DeviceLicensingStatus getDeviceLicensingStatus() {
        return this._deviceLicensingStatus;
    }
    /**
     * Gets the esimIdentifier property value. eSIM identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEsimIdentifier() {
        return this._esimIdentifier;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HardwareInformation currentObject = this;
        return new HashMap<>(41) {{
            this.put("batteryChargeCycles", (n) -> { currentObject.setBatteryChargeCycles(n.getIntegerValue()); });
            this.put("batteryHealthPercentage", (n) -> { currentObject.setBatteryHealthPercentage(n.getIntegerValue()); });
            this.put("batteryLevelPercentage", (n) -> { currentObject.setBatteryLevelPercentage(n.getDoubleValue()); });
            this.put("batterySerialNumber", (n) -> { currentObject.setBatterySerialNumber(n.getStringValue()); });
            this.put("cellularTechnology", (n) -> { currentObject.setCellularTechnology(n.getStringValue()); });
            this.put("deviceFullQualifiedDomainName", (n) -> { currentObject.setDeviceFullQualifiedDomainName(n.getStringValue()); });
            this.put("deviceGuardLocalSystemAuthorityCredentialGuardState", (n) -> { currentObject.setDeviceGuardLocalSystemAuthorityCredentialGuardState(n.getEnumValue(DeviceGuardLocalSystemAuthorityCredentialGuardState.class)); });
            this.put("deviceGuardVirtualizationBasedSecurityHardwareRequirementState", (n) -> { currentObject.setDeviceGuardVirtualizationBasedSecurityHardwareRequirementState(n.getEnumValue(DeviceGuardVirtualizationBasedSecurityHardwareRequirementState.class)); });
            this.put("deviceGuardVirtualizationBasedSecurityState", (n) -> { currentObject.setDeviceGuardVirtualizationBasedSecurityState(n.getEnumValue(DeviceGuardVirtualizationBasedSecurityState.class)); });
            this.put("deviceLicensingLastErrorCode", (n) -> { currentObject.setDeviceLicensingLastErrorCode(n.getIntegerValue()); });
            this.put("deviceLicensingLastErrorDescription", (n) -> { currentObject.setDeviceLicensingLastErrorDescription(n.getStringValue()); });
            this.put("deviceLicensingStatus", (n) -> { currentObject.setDeviceLicensingStatus(n.getEnumValue(DeviceLicensingStatus.class)); });
            this.put("esimIdentifier", (n) -> { currentObject.setEsimIdentifier(n.getStringValue()); });
            this.put("freeStorageSpace", (n) -> { currentObject.setFreeStorageSpace(n.getLongValue()); });
            this.put("imei", (n) -> { currentObject.setImei(n.getStringValue()); });
            this.put("ipAddressV4", (n) -> { currentObject.setIpAddressV4(n.getStringValue()); });
            this.put("isEncrypted", (n) -> { currentObject.setIsEncrypted(n.getBooleanValue()); });
            this.put("isSharedDevice", (n) -> { currentObject.setIsSharedDevice(n.getBooleanValue()); });
            this.put("isSupervised", (n) -> { currentObject.setIsSupervised(n.getBooleanValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("meid", (n) -> { currentObject.setMeid(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("operatingSystemEdition", (n) -> { currentObject.setOperatingSystemEdition(n.getStringValue()); });
            this.put("operatingSystemLanguage", (n) -> { currentObject.setOperatingSystemLanguage(n.getStringValue()); });
            this.put("operatingSystemProductType", (n) -> { currentObject.setOperatingSystemProductType(n.getIntegerValue()); });
            this.put("osBuildNumber", (n) -> { currentObject.setOsBuildNumber(n.getStringValue()); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("productName", (n) -> { currentObject.setProductName(n.getStringValue()); });
            this.put("residentUsersCount", (n) -> { currentObject.setResidentUsersCount(n.getIntegerValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("sharedDeviceCachedUsers", (n) -> { currentObject.setSharedDeviceCachedUsers(n.getCollectionOfObjectValues(SharedAppleDeviceUser::createFromDiscriminatorValue)); });
            this.put("subnetAddress", (n) -> { currentObject.setSubnetAddress(n.getStringValue()); });
            this.put("subscriberCarrier", (n) -> { currentObject.setSubscriberCarrier(n.getStringValue()); });
            this.put("systemManagementBIOSVersion", (n) -> { currentObject.setSystemManagementBIOSVersion(n.getStringValue()); });
            this.put("totalStorageSpace", (n) -> { currentObject.setTotalStorageSpace(n.getLongValue()); });
            this.put("tpmManufacturer", (n) -> { currentObject.setTpmManufacturer(n.getStringValue()); });
            this.put("tpmSpecificationVersion", (n) -> { currentObject.setTpmSpecificationVersion(n.getStringValue()); });
            this.put("tpmVersion", (n) -> { currentObject.setTpmVersion(n.getStringValue()); });
            this.put("wifiMac", (n) -> { currentObject.setWifiMac(n.getStringValue()); });
            this.put("wiredIPv4Addresses", (n) -> { currentObject.setWiredIPv4Addresses(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the freeStorageSpace property value. Free storage space of the device.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFreeStorageSpace() {
        return this._freeStorageSpace;
    }
    /**
     * Gets the imei property value. IMEI
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImei() {
        return this._imei;
    }
    /**
     * Gets the ipAddressV4 property value. IPAddressV4
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddressV4() {
        return this._ipAddressV4;
    }
    /**
     * Gets the isEncrypted property value. Encryption status of the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this._isEncrypted;
    }
    /**
     * Gets the isSharedDevice property value. Shared iPad
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSharedDevice() {
        return this._isSharedDevice;
    }
    /**
     * Gets the isSupervised property value. Supervised mode of the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupervised() {
        return this._isSupervised;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the meid property value. MEID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMeid() {
        return this._meid;
    }
    /**
     * Gets the model property value. Model of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the operatingSystemEdition property value. String that specifies the OS edition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemEdition() {
        return this._operatingSystemEdition;
    }
    /**
     * Gets the operatingSystemLanguage property value. Operating system language of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemLanguage() {
        return this._operatingSystemLanguage;
    }
    /**
     * Gets the operatingSystemProductType property value. Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOperatingSystemProductType() {
        return this._operatingSystemProductType;
    }
    /**
     * Gets the osBuildNumber property value. Operating System Build Number on Android device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this._osBuildNumber;
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the productName property value. The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this._productName;
    }
    /**
     * Gets the residentUsersCount property value. The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResidentUsersCount() {
        return this._residentUsersCount;
    }
    /**
     * Gets the serialNumber property value. Serial number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the sharedDeviceCachedUsers property value. All users on the shared Apple device
     * @return a sharedAppleDeviceUser
     */
    @javax.annotation.Nullable
    public java.util.List<SharedAppleDeviceUser> getSharedDeviceCachedUsers() {
        return this._sharedDeviceCachedUsers;
    }
    /**
     * Gets the subnetAddress property value. SubnetAddress
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnetAddress() {
        return this._subnetAddress;
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber carrier of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriberCarrier() {
        return this._subscriberCarrier;
    }
    /**
     * Gets the systemManagementBIOSVersion property value. BIOS version as reported by SMBIOS
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemManagementBIOSVersion() {
        return this._systemManagementBIOSVersion;
    }
    /**
     * Gets the totalStorageSpace property value. Total storage space of the device.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalStorageSpace() {
        return this._totalStorageSpace;
    }
    /**
     * Gets the tpmManufacturer property value. The identifying information that uniquely names the TPM manufacturer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmManufacturer() {
        return this._tpmManufacturer;
    }
    /**
     * Gets the tpmSpecificationVersion property value. String that specifies the specification version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmSpecificationVersion() {
        return this._tpmSpecificationVersion;
    }
    /**
     * Gets the tpmVersion property value. The version of the TPM, as specified by the manufacturer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmVersion() {
        return this._tpmVersion;
    }
    /**
     * Gets the wifiMac property value. WiFi MAC address of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiMac() {
        return this._wifiMac;
    }
    /**
     * Gets the wiredIPv4Addresses property value. A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getWiredIPv4Addresses() {
        return this._wiredIPv4Addresses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("batteryChargeCycles", this.getBatteryChargeCycles());
        writer.writeIntegerValue("batteryHealthPercentage", this.getBatteryHealthPercentage());
        writer.writeDoubleValue("batteryLevelPercentage", this.getBatteryLevelPercentage());
        writer.writeStringValue("batterySerialNumber", this.getBatterySerialNumber());
        writer.writeStringValue("cellularTechnology", this.getCellularTechnology());
        writer.writeStringValue("deviceFullQualifiedDomainName", this.getDeviceFullQualifiedDomainName());
        writer.writeEnumValue("deviceGuardLocalSystemAuthorityCredentialGuardState", this.getDeviceGuardLocalSystemAuthorityCredentialGuardState());
        writer.writeEnumValue("deviceGuardVirtualizationBasedSecurityHardwareRequirementState", this.getDeviceGuardVirtualizationBasedSecurityHardwareRequirementState());
        writer.writeEnumValue("deviceGuardVirtualizationBasedSecurityState", this.getDeviceGuardVirtualizationBasedSecurityState());
        writer.writeIntegerValue("deviceLicensingLastErrorCode", this.getDeviceLicensingLastErrorCode());
        writer.writeStringValue("deviceLicensingLastErrorDescription", this.getDeviceLicensingLastErrorDescription());
        writer.writeEnumValue("deviceLicensingStatus", this.getDeviceLicensingStatus());
        writer.writeStringValue("esimIdentifier", this.getEsimIdentifier());
        writer.writeLongValue("freeStorageSpace", this.getFreeStorageSpace());
        writer.writeStringValue("imei", this.getImei());
        writer.writeStringValue("ipAddressV4", this.getIpAddressV4());
        writer.writeBooleanValue("isEncrypted", this.getIsEncrypted());
        writer.writeBooleanValue("isSharedDevice", this.getIsSharedDevice());
        writer.writeBooleanValue("isSupervised", this.getIsSupervised());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("meid", this.getMeid());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystemEdition", this.getOperatingSystemEdition());
        writer.writeStringValue("operatingSystemLanguage", this.getOperatingSystemLanguage());
        writer.writeIntegerValue("operatingSystemProductType", this.getOperatingSystemProductType());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeIntegerValue("residentUsersCount", this.getResidentUsersCount());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeCollectionOfObjectValues("sharedDeviceCachedUsers", this.getSharedDeviceCachedUsers());
        writer.writeStringValue("subnetAddress", this.getSubnetAddress());
        writer.writeStringValue("subscriberCarrier", this.getSubscriberCarrier());
        writer.writeStringValue("systemManagementBIOSVersion", this.getSystemManagementBIOSVersion());
        writer.writeLongValue("totalStorageSpace", this.getTotalStorageSpace());
        writer.writeStringValue("tpmManufacturer", this.getTpmManufacturer());
        writer.writeStringValue("tpmSpecificationVersion", this.getTpmSpecificationVersion());
        writer.writeStringValue("tpmVersion", this.getTpmVersion());
        writer.writeStringValue("wifiMac", this.getWifiMac());
        writer.writeCollectionOfPrimitiveValues("wiredIPv4Addresses", this.getWiredIPv4Addresses());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the batteryChargeCycles property value. The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647
     * @param value Value to set for the batteryChargeCycles property.
     * @return a void
     */
    public void setBatteryChargeCycles(@javax.annotation.Nullable final Integer value) {
        this._batteryChargeCycles = value;
    }
    /**
     * Sets the batteryHealthPercentage property value. The devices current batterys health percentage. Valid values 0 to 100
     * @param value Value to set for the batteryHealthPercentage property.
     * @return a void
     */
    public void setBatteryHealthPercentage(@javax.annotation.Nullable final Integer value) {
        this._batteryHealthPercentage = value;
    }
    /**
     * Sets the batteryLevelPercentage property value. The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100
     * @param value Value to set for the batteryLevelPercentage property.
     * @return a void
     */
    public void setBatteryLevelPercentage(@javax.annotation.Nullable final Double value) {
        this._batteryLevelPercentage = value;
    }
    /**
     * Sets the batterySerialNumber property value. The serial number of the devices current battery
     * @param value Value to set for the batterySerialNumber property.
     * @return a void
     */
    public void setBatterySerialNumber(@javax.annotation.Nullable final String value) {
        this._batterySerialNumber = value;
    }
    /**
     * Sets the cellularTechnology property value. Cellular technology of the device
     * @param value Value to set for the cellularTechnology property.
     * @return a void
     */
    public void setCellularTechnology(@javax.annotation.Nullable final String value) {
        this._cellularTechnology = value;
    }
    /**
     * Sets the deviceFullQualifiedDomainName property value. Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     * @param value Value to set for the deviceFullQualifiedDomainName property.
     * @return a void
     */
    public void setDeviceFullQualifiedDomainName(@javax.annotation.Nullable final String value) {
        this._deviceFullQualifiedDomainName = value;
    }
    /**
     * Sets the deviceGuardLocalSystemAuthorityCredentialGuardState property value. The deviceGuardLocalSystemAuthorityCredentialGuardState property
     * @param value Value to set for the deviceGuardLocalSystemAuthorityCredentialGuardState property.
     * @return a void
     */
    public void setDeviceGuardLocalSystemAuthorityCredentialGuardState(@javax.annotation.Nullable final DeviceGuardLocalSystemAuthorityCredentialGuardState value) {
        this._deviceGuardLocalSystemAuthorityCredentialGuardState = value;
    }
    /**
     * Sets the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property value. The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property
     * @param value Value to set for the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property.
     * @return a void
     */
    public void setDeviceGuardVirtualizationBasedSecurityHardwareRequirementState(@javax.annotation.Nullable final DeviceGuardVirtualizationBasedSecurityHardwareRequirementState value) {
        this._deviceGuardVirtualizationBasedSecurityHardwareRequirementState = value;
    }
    /**
     * Sets the deviceGuardVirtualizationBasedSecurityState property value. The deviceGuardVirtualizationBasedSecurityState property
     * @param value Value to set for the deviceGuardVirtualizationBasedSecurityState property.
     * @return a void
     */
    public void setDeviceGuardVirtualizationBasedSecurityState(@javax.annotation.Nullable final DeviceGuardVirtualizationBasedSecurityState value) {
        this._deviceGuardVirtualizationBasedSecurityState = value;
    }
    /**
     * Sets the deviceLicensingLastErrorCode property value. A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647
     * @param value Value to set for the deviceLicensingLastErrorCode property.
     * @return a void
     */
    public void setDeviceLicensingLastErrorCode(@javax.annotation.Nullable final Integer value) {
        this._deviceLicensingLastErrorCode = value;
    }
    /**
     * Sets the deviceLicensingLastErrorDescription property value. Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing.
     * @param value Value to set for the deviceLicensingLastErrorDescription property.
     * @return a void
     */
    public void setDeviceLicensingLastErrorDescription(@javax.annotation.Nullable final String value) {
        this._deviceLicensingLastErrorDescription = value;
    }
    /**
     * Sets the deviceLicensingStatus property value. Indicates the device licensing status after Windows device based subscription has been enabled.
     * @param value Value to set for the deviceLicensingStatus property.
     * @return a void
     */
    public void setDeviceLicensingStatus(@javax.annotation.Nullable final DeviceLicensingStatus value) {
        this._deviceLicensingStatus = value;
    }
    /**
     * Sets the esimIdentifier property value. eSIM identifier
     * @param value Value to set for the esimIdentifier property.
     * @return a void
     */
    public void setEsimIdentifier(@javax.annotation.Nullable final String value) {
        this._esimIdentifier = value;
    }
    /**
     * Sets the freeStorageSpace property value. Free storage space of the device.
     * @param value Value to set for the freeStorageSpace property.
     * @return a void
     */
    public void setFreeStorageSpace(@javax.annotation.Nullable final Long value) {
        this._freeStorageSpace = value;
    }
    /**
     * Sets the imei property value. IMEI
     * @param value Value to set for the imei property.
     * @return a void
     */
    public void setImei(@javax.annotation.Nullable final String value) {
        this._imei = value;
    }
    /**
     * Sets the ipAddressV4 property value. IPAddressV4
     * @param value Value to set for the ipAddressV4 property.
     * @return a void
     */
    public void setIpAddressV4(@javax.annotation.Nullable final String value) {
        this._ipAddressV4 = value;
    }
    /**
     * Sets the isEncrypted property value. Encryption status of the device
     * @param value Value to set for the isEncrypted property.
     * @return a void
     */
    public void setIsEncrypted(@javax.annotation.Nullable final Boolean value) {
        this._isEncrypted = value;
    }
    /**
     * Sets the isSharedDevice property value. Shared iPad
     * @param value Value to set for the isSharedDevice property.
     * @return a void
     */
    public void setIsSharedDevice(@javax.annotation.Nullable final Boolean value) {
        this._isSharedDevice = value;
    }
    /**
     * Sets the isSupervised property value. Supervised mode of the device
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    public void setIsSupervised(@javax.annotation.Nullable final Boolean value) {
        this._isSupervised = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the meid property value. MEID
     * @param value Value to set for the meid property.
     * @return a void
     */
    public void setMeid(@javax.annotation.Nullable final String value) {
        this._meid = value;
    }
    /**
     * Sets the model property value. Model of the device
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operatingSystemEdition property value. String that specifies the OS edition.
     * @param value Value to set for the operatingSystemEdition property.
     * @return a void
     */
    public void setOperatingSystemEdition(@javax.annotation.Nullable final String value) {
        this._operatingSystemEdition = value;
    }
    /**
     * Sets the operatingSystemLanguage property value. Operating system language of the device
     * @param value Value to set for the operatingSystemLanguage property.
     * @return a void
     */
    public void setOperatingSystemLanguage(@javax.annotation.Nullable final String value) {
        this._operatingSystemLanguage = value;
    }
    /**
     * Sets the operatingSystemProductType property value. Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     * @param value Value to set for the operatingSystemProductType property.
     * @return a void
     */
    public void setOperatingSystemProductType(@javax.annotation.Nullable final Integer value) {
        this._operatingSystemProductType = value;
    }
    /**
     * Sets the osBuildNumber property value. Operating System Build Number on Android device
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this._osBuildNumber = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the productName property value. The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained.
     * @param value Value to set for the productName property.
     * @return a void
     */
    public void setProductName(@javax.annotation.Nullable final String value) {
        this._productName = value;
    }
    /**
     * Sets the residentUsersCount property value. The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647
     * @param value Value to set for the residentUsersCount property.
     * @return a void
     */
    public void setResidentUsersCount(@javax.annotation.Nullable final Integer value) {
        this._residentUsersCount = value;
    }
    /**
     * Sets the serialNumber property value. Serial number.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the sharedDeviceCachedUsers property value. All users on the shared Apple device
     * @param value Value to set for the sharedDeviceCachedUsers property.
     * @return a void
     */
    public void setSharedDeviceCachedUsers(@javax.annotation.Nullable final java.util.List<SharedAppleDeviceUser> value) {
        this._sharedDeviceCachedUsers = value;
    }
    /**
     * Sets the subnetAddress property value. SubnetAddress
     * @param value Value to set for the subnetAddress property.
     * @return a void
     */
    public void setSubnetAddress(@javax.annotation.Nullable final String value) {
        this._subnetAddress = value;
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber carrier of the device
     * @param value Value to set for the subscriberCarrier property.
     * @return a void
     */
    public void setSubscriberCarrier(@javax.annotation.Nullable final String value) {
        this._subscriberCarrier = value;
    }
    /**
     * Sets the systemManagementBIOSVersion property value. BIOS version as reported by SMBIOS
     * @param value Value to set for the systemManagementBIOSVersion property.
     * @return a void
     */
    public void setSystemManagementBIOSVersion(@javax.annotation.Nullable final String value) {
        this._systemManagementBIOSVersion = value;
    }
    /**
     * Sets the totalStorageSpace property value. Total storage space of the device.
     * @param value Value to set for the totalStorageSpace property.
     * @return a void
     */
    public void setTotalStorageSpace(@javax.annotation.Nullable final Long value) {
        this._totalStorageSpace = value;
    }
    /**
     * Sets the tpmManufacturer property value. The identifying information that uniquely names the TPM manufacturer
     * @param value Value to set for the tpmManufacturer property.
     * @return a void
     */
    public void setTpmManufacturer(@javax.annotation.Nullable final String value) {
        this._tpmManufacturer = value;
    }
    /**
     * Sets the tpmSpecificationVersion property value. String that specifies the specification version.
     * @param value Value to set for the tpmSpecificationVersion property.
     * @return a void
     */
    public void setTpmSpecificationVersion(@javax.annotation.Nullable final String value) {
        this._tpmSpecificationVersion = value;
    }
    /**
     * Sets the tpmVersion property value. The version of the TPM, as specified by the manufacturer
     * @param value Value to set for the tpmVersion property.
     * @return a void
     */
    public void setTpmVersion(@javax.annotation.Nullable final String value) {
        this._tpmVersion = value;
    }
    /**
     * Sets the wifiMac property value. WiFi MAC address of the device
     * @param value Value to set for the wifiMac property.
     * @return a void
     */
    public void setWifiMac(@javax.annotation.Nullable final String value) {
        this._wifiMac = value;
    }
    /**
     * Sets the wiredIPv4Addresses property value. A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows.
     * @param value Value to set for the wiredIPv4Addresses property.
     * @return a void
     */
    public void setWiredIPv4Addresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._wiredIPv4Addresses = value;
    }
}

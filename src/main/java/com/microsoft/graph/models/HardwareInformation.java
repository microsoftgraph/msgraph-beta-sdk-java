package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Hardware information of a given device.
 */
public class HardwareInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647 */
    private Integer batteryChargeCycles;
    /** The devices current batterys health percentage. Valid values 0 to 100 */
    private Integer batteryHealthPercentage;
    /** The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100 */
    private Double batteryLevelPercentage;
    /** The serial number of the devices current battery */
    private String batterySerialNumber;
    /** Cellular technology of the device */
    private String cellularTechnology;
    /** Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string. */
    private String deviceFullQualifiedDomainName;
    /** The deviceGuardLocalSystemAuthorityCredentialGuardState property */
    private DeviceGuardLocalSystemAuthorityCredentialGuardState deviceGuardLocalSystemAuthorityCredentialGuardState;
    /** The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property */
    private DeviceGuardVirtualizationBasedSecurityHardwareRequirementState deviceGuardVirtualizationBasedSecurityHardwareRequirementState;
    /** The deviceGuardVirtualizationBasedSecurityState property */
    private DeviceGuardVirtualizationBasedSecurityState deviceGuardVirtualizationBasedSecurityState;
    /** A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647 */
    private Integer deviceLicensingLastErrorCode;
    /** Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. */
    private String deviceLicensingLastErrorDescription;
    /** Indicates the device licensing status after Windows device based subscription has been enabled. */
    private DeviceLicensingStatus deviceLicensingStatus;
    /** eSIM identifier */
    private String esimIdentifier;
    /** Free storage space of the device. */
    private Long freeStorageSpace;
    /** IMEI */
    private String imei;
    /** IPAddressV4 */
    private String ipAddressV4;
    /** Encryption status of the device */
    private Boolean isEncrypted;
    /** Shared iPad */
    private Boolean isSharedDevice;
    /** Supervised mode of the device */
    private Boolean isSupervised;
    /** Manufacturer of the device */
    private String manufacturer;
    /** MEID */
    private String meid;
    /** Model of the device */
    private String model;
    /** The OdataType property */
    private String odataType;
    /** String that specifies the OS edition. */
    private String operatingSystemEdition;
    /** Operating system language of the device */
    private String operatingSystemLanguage;
    /** Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647 */
    private Integer operatingSystemProductType;
    /** Operating System Build Number on Android device */
    private String osBuildNumber;
    /** Phone number of the device */
    private String phoneNumber;
    /** The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained. */
    private String productName;
    /** The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647 */
    private Integer residentUsersCount;
    /** Serial number. */
    private String serialNumber;
    /** All users on the shared Apple device */
    private java.util.List<SharedAppleDeviceUser> sharedDeviceCachedUsers;
    /** SubnetAddress */
    private String subnetAddress;
    /** Subscriber carrier of the device */
    private String subscriberCarrier;
    /** BIOS version as reported by SMBIOS */
    private String systemManagementBIOSVersion;
    /** Total storage space of the device. */
    private Long totalStorageSpace;
    /** The identifying information that uniquely names the TPM manufacturer */
    private String tpmManufacturer;
    /** String that specifies the specification version. */
    private String tpmSpecificationVersion;
    /** The version of the TPM, as specified by the manufacturer */
    private String tpmVersion;
    /** WiFi MAC address of the device */
    private String wifiMac;
    /** A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows. */
    private java.util.List<String> wiredIPv4Addresses;
    /**
     * Instantiates a new hardwareInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public HardwareInformation() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the batteryChargeCycles property value. The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryChargeCycles() {
        return this.batteryChargeCycles;
    }
    /**
     * Gets the batteryHealthPercentage property value. The devices current batterys health percentage. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryHealthPercentage() {
        return this.batteryHealthPercentage;
    }
    /**
     * Gets the batteryLevelPercentage property value. The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBatteryLevelPercentage() {
        return this.batteryLevelPercentage;
    }
    /**
     * Gets the batterySerialNumber property value. The serial number of the devices current battery
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBatterySerialNumber() {
        return this.batterySerialNumber;
    }
    /**
     * Gets the cellularTechnology property value. Cellular technology of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCellularTechnology() {
        return this.cellularTechnology;
    }
    /**
     * Gets the deviceFullQualifiedDomainName property value. Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceFullQualifiedDomainName() {
        return this.deviceFullQualifiedDomainName;
    }
    /**
     * Gets the deviceGuardLocalSystemAuthorityCredentialGuardState property value. The deviceGuardLocalSystemAuthorityCredentialGuardState property
     * @return a deviceGuardLocalSystemAuthorityCredentialGuardState
     */
    @javax.annotation.Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardState getDeviceGuardLocalSystemAuthorityCredentialGuardState() {
        return this.deviceGuardLocalSystemAuthorityCredentialGuardState;
    }
    /**
     * Gets the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property value. The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property
     * @return a deviceGuardVirtualizationBasedSecurityHardwareRequirementState
     */
    @javax.annotation.Nullable
    public DeviceGuardVirtualizationBasedSecurityHardwareRequirementState getDeviceGuardVirtualizationBasedSecurityHardwareRequirementState() {
        return this.deviceGuardVirtualizationBasedSecurityHardwareRequirementState;
    }
    /**
     * Gets the deviceGuardVirtualizationBasedSecurityState property value. The deviceGuardVirtualizationBasedSecurityState property
     * @return a deviceGuardVirtualizationBasedSecurityState
     */
    @javax.annotation.Nullable
    public DeviceGuardVirtualizationBasedSecurityState getDeviceGuardVirtualizationBasedSecurityState() {
        return this.deviceGuardVirtualizationBasedSecurityState;
    }
    /**
     * Gets the deviceLicensingLastErrorCode property value. A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceLicensingLastErrorCode() {
        return this.deviceLicensingLastErrorCode;
    }
    /**
     * Gets the deviceLicensingLastErrorDescription property value. Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceLicensingLastErrorDescription() {
        return this.deviceLicensingLastErrorDescription;
    }
    /**
     * Gets the deviceLicensingStatus property value. Indicates the device licensing status after Windows device based subscription has been enabled.
     * @return a deviceLicensingStatus
     */
    @javax.annotation.Nullable
    public DeviceLicensingStatus getDeviceLicensingStatus() {
        return this.deviceLicensingStatus;
    }
    /**
     * Gets the esimIdentifier property value. eSIM identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEsimIdentifier() {
        return this.esimIdentifier;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(41);
        deserializerMap.put("batteryChargeCycles", (n) -> { this.setBatteryChargeCycles(n.getIntegerValue()); });
        deserializerMap.put("batteryHealthPercentage", (n) -> { this.setBatteryHealthPercentage(n.getIntegerValue()); });
        deserializerMap.put("batteryLevelPercentage", (n) -> { this.setBatteryLevelPercentage(n.getDoubleValue()); });
        deserializerMap.put("batterySerialNumber", (n) -> { this.setBatterySerialNumber(n.getStringValue()); });
        deserializerMap.put("cellularTechnology", (n) -> { this.setCellularTechnology(n.getStringValue()); });
        deserializerMap.put("deviceFullQualifiedDomainName", (n) -> { this.setDeviceFullQualifiedDomainName(n.getStringValue()); });
        deserializerMap.put("deviceGuardLocalSystemAuthorityCredentialGuardState", (n) -> { this.setDeviceGuardLocalSystemAuthorityCredentialGuardState(n.getEnumValue(DeviceGuardLocalSystemAuthorityCredentialGuardState.class)); });
        deserializerMap.put("deviceGuardVirtualizationBasedSecurityHardwareRequirementState", (n) -> { this.setDeviceGuardVirtualizationBasedSecurityHardwareRequirementState(n.getEnumValue(DeviceGuardVirtualizationBasedSecurityHardwareRequirementState.class)); });
        deserializerMap.put("deviceGuardVirtualizationBasedSecurityState", (n) -> { this.setDeviceGuardVirtualizationBasedSecurityState(n.getEnumValue(DeviceGuardVirtualizationBasedSecurityState.class)); });
        deserializerMap.put("deviceLicensingLastErrorCode", (n) -> { this.setDeviceLicensingLastErrorCode(n.getIntegerValue()); });
        deserializerMap.put("deviceLicensingLastErrorDescription", (n) -> { this.setDeviceLicensingLastErrorDescription(n.getStringValue()); });
        deserializerMap.put("deviceLicensingStatus", (n) -> { this.setDeviceLicensingStatus(n.getEnumValue(DeviceLicensingStatus.class)); });
        deserializerMap.put("esimIdentifier", (n) -> { this.setEsimIdentifier(n.getStringValue()); });
        deserializerMap.put("freeStorageSpace", (n) -> { this.setFreeStorageSpace(n.getLongValue()); });
        deserializerMap.put("imei", (n) -> { this.setImei(n.getStringValue()); });
        deserializerMap.put("ipAddressV4", (n) -> { this.setIpAddressV4(n.getStringValue()); });
        deserializerMap.put("isEncrypted", (n) -> { this.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isSharedDevice", (n) -> { this.setIsSharedDevice(n.getBooleanValue()); });
        deserializerMap.put("isSupervised", (n) -> { this.setIsSupervised(n.getBooleanValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("meid", (n) -> { this.setMeid(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystemEdition", (n) -> { this.setOperatingSystemEdition(n.getStringValue()); });
        deserializerMap.put("operatingSystemLanguage", (n) -> { this.setOperatingSystemLanguage(n.getStringValue()); });
        deserializerMap.put("operatingSystemProductType", (n) -> { this.setOperatingSystemProductType(n.getIntegerValue()); });
        deserializerMap.put("osBuildNumber", (n) -> { this.setOsBuildNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("residentUsersCount", (n) -> { this.setResidentUsersCount(n.getIntegerValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("sharedDeviceCachedUsers", (n) -> { this.setSharedDeviceCachedUsers(n.getCollectionOfObjectValues(SharedAppleDeviceUser::createFromDiscriminatorValue)); });
        deserializerMap.put("subnetAddress", (n) -> { this.setSubnetAddress(n.getStringValue()); });
        deserializerMap.put("subscriberCarrier", (n) -> { this.setSubscriberCarrier(n.getStringValue()); });
        deserializerMap.put("systemManagementBIOSVersion", (n) -> { this.setSystemManagementBIOSVersion(n.getStringValue()); });
        deserializerMap.put("totalStorageSpace", (n) -> { this.setTotalStorageSpace(n.getLongValue()); });
        deserializerMap.put("tpmManufacturer", (n) -> { this.setTpmManufacturer(n.getStringValue()); });
        deserializerMap.put("tpmSpecificationVersion", (n) -> { this.setTpmSpecificationVersion(n.getStringValue()); });
        deserializerMap.put("tpmVersion", (n) -> { this.setTpmVersion(n.getStringValue()); });
        deserializerMap.put("wifiMac", (n) -> { this.setWifiMac(n.getStringValue()); });
        deserializerMap.put("wiredIPv4Addresses", (n) -> { this.setWiredIPv4Addresses(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the freeStorageSpace property value. Free storage space of the device.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFreeStorageSpace() {
        return this.freeStorageSpace;
    }
    /**
     * Gets the imei property value. IMEI
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImei() {
        return this.imei;
    }
    /**
     * Gets the ipAddressV4 property value. IPAddressV4
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddressV4() {
        return this.ipAddressV4;
    }
    /**
     * Gets the isEncrypted property value. Encryption status of the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }
    /**
     * Gets the isSharedDevice property value. Shared iPad
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSharedDevice() {
        return this.isSharedDevice;
    }
    /**
     * Gets the isSupervised property value. Supervised mode of the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupervised() {
        return this.isSupervised;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the meid property value. MEID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMeid() {
        return this.meid;
    }
    /**
     * Gets the model property value. Model of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operatingSystemEdition property value. String that specifies the OS edition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemEdition() {
        return this.operatingSystemEdition;
    }
    /**
     * Gets the operatingSystemLanguage property value. Operating system language of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemLanguage() {
        return this.operatingSystemLanguage;
    }
    /**
     * Gets the operatingSystemProductType property value. Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOperatingSystemProductType() {
        return this.operatingSystemProductType;
    }
    /**
     * Gets the osBuildNumber property value. Operating System Build Number on Android device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this.osBuildNumber;
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the productName property value. The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this.productName;
    }
    /**
     * Gets the residentUsersCount property value. The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResidentUsersCount() {
        return this.residentUsersCount;
    }
    /**
     * Gets the serialNumber property value. Serial number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the sharedDeviceCachedUsers property value. All users on the shared Apple device
     * @return a sharedAppleDeviceUser
     */
    @javax.annotation.Nullable
    public java.util.List<SharedAppleDeviceUser> getSharedDeviceCachedUsers() {
        return this.sharedDeviceCachedUsers;
    }
    /**
     * Gets the subnetAddress property value. SubnetAddress
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnetAddress() {
        return this.subnetAddress;
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber carrier of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriberCarrier() {
        return this.subscriberCarrier;
    }
    /**
     * Gets the systemManagementBIOSVersion property value. BIOS version as reported by SMBIOS
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemManagementBIOSVersion() {
        return this.systemManagementBIOSVersion;
    }
    /**
     * Gets the totalStorageSpace property value. Total storage space of the device.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalStorageSpace() {
        return this.totalStorageSpace;
    }
    /**
     * Gets the tpmManufacturer property value. The identifying information that uniquely names the TPM manufacturer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmManufacturer() {
        return this.tpmManufacturer;
    }
    /**
     * Gets the tpmSpecificationVersion property value. String that specifies the specification version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmSpecificationVersion() {
        return this.tpmSpecificationVersion;
    }
    /**
     * Gets the tpmVersion property value. The version of the TPM, as specified by the manufacturer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmVersion() {
        return this.tpmVersion;
    }
    /**
     * Gets the wifiMac property value. WiFi MAC address of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiMac() {
        return this.wifiMac;
    }
    /**
     * Gets the wiredIPv4Addresses property value. A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getWiredIPv4Addresses() {
        return this.wiredIPv4Addresses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the batteryChargeCycles property value. The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647
     * @param value Value to set for the batteryChargeCycles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryChargeCycles(@javax.annotation.Nullable final Integer value) {
        this.batteryChargeCycles = value;
    }
    /**
     * Sets the batteryHealthPercentage property value. The devices current batterys health percentage. Valid values 0 to 100
     * @param value Value to set for the batteryHealthPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryHealthPercentage(@javax.annotation.Nullable final Integer value) {
        this.batteryHealthPercentage = value;
    }
    /**
     * Sets the batteryLevelPercentage property value. The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100
     * @param value Value to set for the batteryLevelPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryLevelPercentage(@javax.annotation.Nullable final Double value) {
        this.batteryLevelPercentage = value;
    }
    /**
     * Sets the batterySerialNumber property value. The serial number of the devices current battery
     * @param value Value to set for the batterySerialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatterySerialNumber(@javax.annotation.Nullable final String value) {
        this.batterySerialNumber = value;
    }
    /**
     * Sets the cellularTechnology property value. Cellular technology of the device
     * @param value Value to set for the cellularTechnology property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularTechnology(@javax.annotation.Nullable final String value) {
        this.cellularTechnology = value;
    }
    /**
     * Sets the deviceFullQualifiedDomainName property value. Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     * @param value Value to set for the deviceFullQualifiedDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceFullQualifiedDomainName(@javax.annotation.Nullable final String value) {
        this.deviceFullQualifiedDomainName = value;
    }
    /**
     * Sets the deviceGuardLocalSystemAuthorityCredentialGuardState property value. The deviceGuardLocalSystemAuthorityCredentialGuardState property
     * @param value Value to set for the deviceGuardLocalSystemAuthorityCredentialGuardState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardLocalSystemAuthorityCredentialGuardState(@javax.annotation.Nullable final DeviceGuardLocalSystemAuthorityCredentialGuardState value) {
        this.deviceGuardLocalSystemAuthorityCredentialGuardState = value;
    }
    /**
     * Sets the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property value. The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property
     * @param value Value to set for the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardVirtualizationBasedSecurityHardwareRequirementState(@javax.annotation.Nullable final DeviceGuardVirtualizationBasedSecurityHardwareRequirementState value) {
        this.deviceGuardVirtualizationBasedSecurityHardwareRequirementState = value;
    }
    /**
     * Sets the deviceGuardVirtualizationBasedSecurityState property value. The deviceGuardVirtualizationBasedSecurityState property
     * @param value Value to set for the deviceGuardVirtualizationBasedSecurityState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardVirtualizationBasedSecurityState(@javax.annotation.Nullable final DeviceGuardVirtualizationBasedSecurityState value) {
        this.deviceGuardVirtualizationBasedSecurityState = value;
    }
    /**
     * Sets the deviceLicensingLastErrorCode property value. A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647
     * @param value Value to set for the deviceLicensingLastErrorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceLicensingLastErrorCode(@javax.annotation.Nullable final Integer value) {
        this.deviceLicensingLastErrorCode = value;
    }
    /**
     * Sets the deviceLicensingLastErrorDescription property value. Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing.
     * @param value Value to set for the deviceLicensingLastErrorDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceLicensingLastErrorDescription(@javax.annotation.Nullable final String value) {
        this.deviceLicensingLastErrorDescription = value;
    }
    /**
     * Sets the deviceLicensingStatus property value. Indicates the device licensing status after Windows device based subscription has been enabled.
     * @param value Value to set for the deviceLicensingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceLicensingStatus(@javax.annotation.Nullable final DeviceLicensingStatus value) {
        this.deviceLicensingStatus = value;
    }
    /**
     * Sets the esimIdentifier property value. eSIM identifier
     * @param value Value to set for the esimIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEsimIdentifier(@javax.annotation.Nullable final String value) {
        this.esimIdentifier = value;
    }
    /**
     * Sets the freeStorageSpace property value. Free storage space of the device.
     * @param value Value to set for the freeStorageSpace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFreeStorageSpace(@javax.annotation.Nullable final Long value) {
        this.freeStorageSpace = value;
    }
    /**
     * Sets the imei property value. IMEI
     * @param value Value to set for the imei property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImei(@javax.annotation.Nullable final String value) {
        this.imei = value;
    }
    /**
     * Sets the ipAddressV4 property value. IPAddressV4
     * @param value Value to set for the ipAddressV4 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddressV4(@javax.annotation.Nullable final String value) {
        this.ipAddressV4 = value;
    }
    /**
     * Sets the isEncrypted property value. Encryption status of the device
     * @param value Value to set for the isEncrypted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEncrypted(@javax.annotation.Nullable final Boolean value) {
        this.isEncrypted = value;
    }
    /**
     * Sets the isSharedDevice property value. Shared iPad
     * @param value Value to set for the isSharedDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSharedDevice(@javax.annotation.Nullable final Boolean value) {
        this.isSharedDevice = value;
    }
    /**
     * Sets the isSupervised property value. Supervised mode of the device
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSupervised(@javax.annotation.Nullable final Boolean value) {
        this.isSupervised = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the meid property value. MEID
     * @param value Value to set for the meid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeid(@javax.annotation.Nullable final String value) {
        this.meid = value;
    }
    /**
     * Sets the model property value. Model of the device
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operatingSystemEdition property value. String that specifies the OS edition.
     * @param value Value to set for the operatingSystemEdition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemEdition(@javax.annotation.Nullable final String value) {
        this.operatingSystemEdition = value;
    }
    /**
     * Sets the operatingSystemLanguage property value. Operating system language of the device
     * @param value Value to set for the operatingSystemLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemLanguage(@javax.annotation.Nullable final String value) {
        this.operatingSystemLanguage = value;
    }
    /**
     * Sets the operatingSystemProductType property value. Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     * @param value Value to set for the operatingSystemProductType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemProductType(@javax.annotation.Nullable final Integer value) {
        this.operatingSystemProductType = value;
    }
    /**
     * Sets the osBuildNumber property value. Operating System Build Number on Android device
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this.osBuildNumber = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the productName property value. The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained.
     * @param value Value to set for the productName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductName(@javax.annotation.Nullable final String value) {
        this.productName = value;
    }
    /**
     * Sets the residentUsersCount property value. The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647
     * @param value Value to set for the residentUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResidentUsersCount(@javax.annotation.Nullable final Integer value) {
        this.residentUsersCount = value;
    }
    /**
     * Sets the serialNumber property value. Serial number.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the sharedDeviceCachedUsers property value. All users on the shared Apple device
     * @param value Value to set for the sharedDeviceCachedUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedDeviceCachedUsers(@javax.annotation.Nullable final java.util.List<SharedAppleDeviceUser> value) {
        this.sharedDeviceCachedUsers = value;
    }
    /**
     * Sets the subnetAddress property value. SubnetAddress
     * @param value Value to set for the subnetAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubnetAddress(@javax.annotation.Nullable final String value) {
        this.subnetAddress = value;
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber carrier of the device
     * @param value Value to set for the subscriberCarrier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriberCarrier(@javax.annotation.Nullable final String value) {
        this.subscriberCarrier = value;
    }
    /**
     * Sets the systemManagementBIOSVersion property value. BIOS version as reported by SMBIOS
     * @param value Value to set for the systemManagementBIOSVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemManagementBIOSVersion(@javax.annotation.Nullable final String value) {
        this.systemManagementBIOSVersion = value;
    }
    /**
     * Sets the totalStorageSpace property value. Total storage space of the device.
     * @param value Value to set for the totalStorageSpace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalStorageSpace(@javax.annotation.Nullable final Long value) {
        this.totalStorageSpace = value;
    }
    /**
     * Sets the tpmManufacturer property value. The identifying information that uniquely names the TPM manufacturer
     * @param value Value to set for the tpmManufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmManufacturer(@javax.annotation.Nullable final String value) {
        this.tpmManufacturer = value;
    }
    /**
     * Sets the tpmSpecificationVersion property value. String that specifies the specification version.
     * @param value Value to set for the tpmSpecificationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmSpecificationVersion(@javax.annotation.Nullable final String value) {
        this.tpmSpecificationVersion = value;
    }
    /**
     * Sets the tpmVersion property value. The version of the TPM, as specified by the manufacturer
     * @param value Value to set for the tpmVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmVersion(@javax.annotation.Nullable final String value) {
        this.tpmVersion = value;
    }
    /**
     * Sets the wifiMac property value. WiFi MAC address of the device
     * @param value Value to set for the wifiMac property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiMac(@javax.annotation.Nullable final String value) {
        this.wifiMac = value;
    }
    /**
     * Sets the wiredIPv4Addresses property value. A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows.
     * @param value Value to set for the wiredIPv4Addresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiredIPv4Addresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this.wiredIPv4Addresses = value;
    }
}

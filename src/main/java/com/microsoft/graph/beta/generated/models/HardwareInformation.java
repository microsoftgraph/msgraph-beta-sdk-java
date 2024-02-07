package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Hardware information of a given device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareInformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new HardwareInformation and sets the default values.
     */
    public HardwareInformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HardwareInformation
     */
    @jakarta.annotation.Nonnull
    public static HardwareInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareInformation();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the batteryChargeCycles property value. The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryChargeCycles() {
        return this.backingStore.get("batteryChargeCycles");
    }
    /**
     * Gets the batteryHealthPercentage property value. The devices current batterys health percentage. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryHealthPercentage() {
        return this.backingStore.get("batteryHealthPercentage");
    }
    /**
     * Gets the batteryLevelPercentage property value. The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getBatteryLevelPercentage() {
        return this.backingStore.get("batteryLevelPercentage");
    }
    /**
     * Gets the batterySerialNumber property value. The serial number of the devices current battery
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBatterySerialNumber() {
        return this.backingStore.get("batterySerialNumber");
    }
    /**
     * Gets the cellularTechnology property value. Cellular technology of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCellularTechnology() {
        return this.backingStore.get("cellularTechnology");
    }
    /**
     * Gets the deviceFullQualifiedDomainName property value. Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceFullQualifiedDomainName() {
        return this.backingStore.get("deviceFullQualifiedDomainName");
    }
    /**
     * Gets the deviceGuardLocalSystemAuthorityCredentialGuardState property value. The deviceGuardLocalSystemAuthorityCredentialGuardState property
     * @return a DeviceGuardLocalSystemAuthorityCredentialGuardState
     */
    @jakarta.annotation.Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardState getDeviceGuardLocalSystemAuthorityCredentialGuardState() {
        return this.backingStore.get("deviceGuardLocalSystemAuthorityCredentialGuardState");
    }
    /**
     * Gets the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property value. The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property
     * @return a DeviceGuardVirtualizationBasedSecurityHardwareRequirementState
     */
    @jakarta.annotation.Nullable
    public DeviceGuardVirtualizationBasedSecurityHardwareRequirementState getDeviceGuardVirtualizationBasedSecurityHardwareRequirementState() {
        return this.backingStore.get("deviceGuardVirtualizationBasedSecurityHardwareRequirementState");
    }
    /**
     * Gets the deviceGuardVirtualizationBasedSecurityState property value. The deviceGuardVirtualizationBasedSecurityState property
     * @return a DeviceGuardVirtualizationBasedSecurityState
     */
    @jakarta.annotation.Nullable
    public DeviceGuardVirtualizationBasedSecurityState getDeviceGuardVirtualizationBasedSecurityState() {
        return this.backingStore.get("deviceGuardVirtualizationBasedSecurityState");
    }
    /**
     * Gets the deviceLicensingLastErrorCode property value. A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceLicensingLastErrorCode() {
        return this.backingStore.get("deviceLicensingLastErrorCode");
    }
    /**
     * Gets the deviceLicensingLastErrorDescription property value. Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceLicensingLastErrorDescription() {
        return this.backingStore.get("deviceLicensingLastErrorDescription");
    }
    /**
     * Gets the deviceLicensingStatus property value. Indicates the device licensing status after Windows device based subscription has been enabled.
     * @return a DeviceLicensingStatus
     */
    @jakarta.annotation.Nullable
    public DeviceLicensingStatus getDeviceLicensingStatus() {
        return this.backingStore.get("deviceLicensingStatus");
    }
    /**
     * Gets the esimIdentifier property value. eSIM identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEsimIdentifier() {
        return this.backingStore.get("esimIdentifier");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(41);
        deserializerMap.put("batteryChargeCycles", (n) -> { this.setBatteryChargeCycles(n.getIntegerValue()); });
        deserializerMap.put("batteryHealthPercentage", (n) -> { this.setBatteryHealthPercentage(n.getIntegerValue()); });
        deserializerMap.put("batteryLevelPercentage", (n) -> { this.setBatteryLevelPercentage(n.getDoubleValue()); });
        deserializerMap.put("batterySerialNumber", (n) -> { this.setBatterySerialNumber(n.getStringValue()); });
        deserializerMap.put("cellularTechnology", (n) -> { this.setCellularTechnology(n.getStringValue()); });
        deserializerMap.put("deviceFullQualifiedDomainName", (n) -> { this.setDeviceFullQualifiedDomainName(n.getStringValue()); });
        deserializerMap.put("deviceGuardLocalSystemAuthorityCredentialGuardState", (n) -> { this.setDeviceGuardLocalSystemAuthorityCredentialGuardState(n.getEnumValue(DeviceGuardLocalSystemAuthorityCredentialGuardState::forValue)); });
        deserializerMap.put("deviceGuardVirtualizationBasedSecurityHardwareRequirementState", (n) -> { this.setDeviceGuardVirtualizationBasedSecurityHardwareRequirementState(n.getEnumValue(DeviceGuardVirtualizationBasedSecurityHardwareRequirementState::forValue)); });
        deserializerMap.put("deviceGuardVirtualizationBasedSecurityState", (n) -> { this.setDeviceGuardVirtualizationBasedSecurityState(n.getEnumValue(DeviceGuardVirtualizationBasedSecurityState::forValue)); });
        deserializerMap.put("deviceLicensingLastErrorCode", (n) -> { this.setDeviceLicensingLastErrorCode(n.getIntegerValue()); });
        deserializerMap.put("deviceLicensingLastErrorDescription", (n) -> { this.setDeviceLicensingLastErrorDescription(n.getStringValue()); });
        deserializerMap.put("deviceLicensingStatus", (n) -> { this.setDeviceLicensingStatus(n.getEnumValue(DeviceLicensingStatus::forValue)); });
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
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFreeStorageSpace() {
        return this.backingStore.get("freeStorageSpace");
    }
    /**
     * Gets the imei property value. IMEI
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImei() {
        return this.backingStore.get("imei");
    }
    /**
     * Gets the ipAddressV4 property value. IPAddressV4
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddressV4() {
        return this.backingStore.get("ipAddressV4");
    }
    /**
     * Gets the isEncrypted property value. Encryption status of the device
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.backingStore.get("isEncrypted");
    }
    /**
     * Gets the isSharedDevice property value. Shared iPad
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharedDevice() {
        return this.backingStore.get("isSharedDevice");
    }
    /**
     * Gets the isSupervised property value. Supervised mode of the device
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSupervised() {
        return this.backingStore.get("isSupervised");
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the meid property value. MEID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMeid() {
        return this.backingStore.get("meid");
    }
    /**
     * Gets the model property value. Model of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
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
     * Gets the operatingSystemEdition property value. String that specifies the OS edition.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemEdition() {
        return this.backingStore.get("operatingSystemEdition");
    }
    /**
     * Gets the operatingSystemLanguage property value. Operating system language of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemLanguage() {
        return this.backingStore.get("operatingSystemLanguage");
    }
    /**
     * Gets the operatingSystemProductType property value. Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOperatingSystemProductType() {
        return this.backingStore.get("operatingSystemProductType");
    }
    /**
     * Gets the osBuildNumber property value. Operating System Build Number on Android device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsBuildNumber() {
        return this.backingStore.get("osBuildNumber");
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the productName property value. The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the residentUsersCount property value. The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getResidentUsersCount() {
        return this.backingStore.get("residentUsersCount");
    }
    /**
     * Gets the serialNumber property value. Serial number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the sharedDeviceCachedUsers property value. All users on the shared Apple device
     * @return a java.util.List<SharedAppleDeviceUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharedAppleDeviceUser> getSharedDeviceCachedUsers() {
        return this.backingStore.get("sharedDeviceCachedUsers");
    }
    /**
     * Gets the subnetAddress property value. SubnetAddress
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubnetAddress() {
        return this.backingStore.get("subnetAddress");
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber carrier of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubscriberCarrier() {
        return this.backingStore.get("subscriberCarrier");
    }
    /**
     * Gets the systemManagementBIOSVersion property value. BIOS version as reported by SMBIOS
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSystemManagementBIOSVersion() {
        return this.backingStore.get("systemManagementBIOSVersion");
    }
    /**
     * Gets the totalStorageSpace property value. Total storage space of the device.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalStorageSpace() {
        return this.backingStore.get("totalStorageSpace");
    }
    /**
     * Gets the tpmManufacturer property value. The identifying information that uniquely names the TPM manufacturer
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTpmManufacturer() {
        return this.backingStore.get("tpmManufacturer");
    }
    /**
     * Gets the tpmSpecificationVersion property value. String that specifies the specification version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTpmSpecificationVersion() {
        return this.backingStore.get("tpmSpecificationVersion");
    }
    /**
     * Gets the tpmVersion property value. The version of the TPM, as specified by the manufacturer
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTpmVersion() {
        return this.backingStore.get("tpmVersion");
    }
    /**
     * Gets the wifiMac property value. WiFi MAC address of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiMac() {
        return this.backingStore.get("wifiMac");
    }
    /**
     * Gets the wiredIPv4Addresses property value. A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWiredIPv4Addresses() {
        return this.backingStore.get("wiredIPv4Addresses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the batteryChargeCycles property value. The number of charge cycles the devices current battery has gone through. Valid values 0 to 2147483647
     * @param value Value to set for the batteryChargeCycles property.
     */
    public void setBatteryChargeCycles(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryChargeCycles", value);
    }
    /**
     * Sets the batteryHealthPercentage property value. The devices current batterys health percentage. Valid values 0 to 100
     * @param value Value to set for the batteryHealthPercentage property.
     */
    public void setBatteryHealthPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryHealthPercentage", value);
    }
    /**
     * Sets the batteryLevelPercentage property value. The battery level, between 0.0 and 100, or null if the battery level cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 5.0 and later, and is available only when Device Information access right is obtained. Valid values 0 to 100
     * @param value Value to set for the batteryLevelPercentage property.
     */
    public void setBatteryLevelPercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("batteryLevelPercentage", value);
    }
    /**
     * Sets the batterySerialNumber property value. The serial number of the devices current battery
     * @param value Value to set for the batterySerialNumber property.
     */
    public void setBatterySerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("batterySerialNumber", value);
    }
    /**
     * Sets the cellularTechnology property value. Cellular technology of the device
     * @param value Value to set for the cellularTechnology property.
     */
    public void setCellularTechnology(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cellularTechnology", value);
    }
    /**
     * Sets the deviceFullQualifiedDomainName property value. Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     * @param value Value to set for the deviceFullQualifiedDomainName property.
     */
    public void setDeviceFullQualifiedDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceFullQualifiedDomainName", value);
    }
    /**
     * Sets the deviceGuardLocalSystemAuthorityCredentialGuardState property value. The deviceGuardLocalSystemAuthorityCredentialGuardState property
     * @param value Value to set for the deviceGuardLocalSystemAuthorityCredentialGuardState property.
     */
    public void setDeviceGuardLocalSystemAuthorityCredentialGuardState(@jakarta.annotation.Nullable final DeviceGuardLocalSystemAuthorityCredentialGuardState value) {
        this.backingStore.set("deviceGuardLocalSystemAuthorityCredentialGuardState", value);
    }
    /**
     * Sets the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property value. The deviceGuardVirtualizationBasedSecurityHardwareRequirementState property
     * @param value Value to set for the deviceGuardVirtualizationBasedSecurityHardwareRequirementState property.
     */
    public void setDeviceGuardVirtualizationBasedSecurityHardwareRequirementState(@jakarta.annotation.Nullable final DeviceGuardVirtualizationBasedSecurityHardwareRequirementState value) {
        this.backingStore.set("deviceGuardVirtualizationBasedSecurityHardwareRequirementState", value);
    }
    /**
     * Sets the deviceGuardVirtualizationBasedSecurityState property value. The deviceGuardVirtualizationBasedSecurityState property
     * @param value Value to set for the deviceGuardVirtualizationBasedSecurityState property.
     */
    public void setDeviceGuardVirtualizationBasedSecurityState(@jakarta.annotation.Nullable final DeviceGuardVirtualizationBasedSecurityState value) {
        this.backingStore.set("deviceGuardVirtualizationBasedSecurityState", value);
    }
    /**
     * Sets the deviceLicensingLastErrorCode property value. A standard error code indicating the last error, or 0 indicating no error (default). The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing. Valid values 0 to 2147483647
     * @param value Value to set for the deviceLicensingLastErrorCode property.
     */
    public void setDeviceLicensingLastErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceLicensingLastErrorCode", value);
    }
    /**
     * Sets the deviceLicensingLastErrorDescription property value. Error text message as a descripition for deviceLicensingLastErrorCode. The update frequency of this property is daily. Note this property is currently supported only for Windows based Device based subscription licensing.
     * @param value Value to set for the deviceLicensingLastErrorDescription property.
     */
    public void setDeviceLicensingLastErrorDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceLicensingLastErrorDescription", value);
    }
    /**
     * Sets the deviceLicensingStatus property value. Indicates the device licensing status after Windows device based subscription has been enabled.
     * @param value Value to set for the deviceLicensingStatus property.
     */
    public void setDeviceLicensingStatus(@jakarta.annotation.Nullable final DeviceLicensingStatus value) {
        this.backingStore.set("deviceLicensingStatus", value);
    }
    /**
     * Sets the esimIdentifier property value. eSIM identifier
     * @param value Value to set for the esimIdentifier property.
     */
    public void setEsimIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("esimIdentifier", value);
    }
    /**
     * Sets the freeStorageSpace property value. Free storage space of the device.
     * @param value Value to set for the freeStorageSpace property.
     */
    public void setFreeStorageSpace(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("freeStorageSpace", value);
    }
    /**
     * Sets the imei property value. IMEI
     * @param value Value to set for the imei property.
     */
    public void setImei(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imei", value);
    }
    /**
     * Sets the ipAddressV4 property value. IPAddressV4
     * @param value Value to set for the ipAddressV4 property.
     */
    public void setIpAddressV4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddressV4", value);
    }
    /**
     * Sets the isEncrypted property value. Encryption status of the device
     * @param value Value to set for the isEncrypted property.
     */
    public void setIsEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEncrypted", value);
    }
    /**
     * Sets the isSharedDevice property value. Shared iPad
     * @param value Value to set for the isSharedDevice property.
     */
    public void setIsSharedDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSharedDevice", value);
    }
    /**
     * Sets the isSupervised property value. Supervised mode of the device
     * @param value Value to set for the isSupervised property.
     */
    public void setIsSupervised(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSupervised", value);
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the meid property value. MEID
     * @param value Value to set for the meid property.
     */
    public void setMeid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("meid", value);
    }
    /**
     * Sets the model property value. Model of the device
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operatingSystemEdition property value. String that specifies the OS edition.
     * @param value Value to set for the operatingSystemEdition property.
     */
    public void setOperatingSystemEdition(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemEdition", value);
    }
    /**
     * Sets the operatingSystemLanguage property value. Operating system language of the device
     * @param value Value to set for the operatingSystemLanguage property.
     */
    public void setOperatingSystemLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemLanguage", value);
    }
    /**
     * Sets the operatingSystemProductType property value. Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     * @param value Value to set for the operatingSystemProductType property.
     */
    public void setOperatingSystemProductType(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("operatingSystemProductType", value);
    }
    /**
     * Sets the osBuildNumber property value. Operating System Build Number on Android device
     * @param value Value to set for the osBuildNumber property.
     */
    public void setOsBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osBuildNumber", value);
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the productName property value. The product name, e.g. iPad8,12 etc. The update frequency of this property is weekly. Note this property is currently supported only on iOS/MacOS devices, and is available only when Device Information access right is obtained.
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the residentUsersCount property value. The number of users currently on this device, or null (default) if the value of this property cannot be determined. The update frequency of this property is per-checkin. Note this property is currently supported only on devices running iOS 13.4 and later, and is available only when Device Information access right is obtained. Valid values 0 to 2147483647
     * @param value Value to set for the residentUsersCount property.
     */
    public void setResidentUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("residentUsersCount", value);
    }
    /**
     * Sets the serialNumber property value. Serial number.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the sharedDeviceCachedUsers property value. All users on the shared Apple device
     * @param value Value to set for the sharedDeviceCachedUsers property.
     */
    public void setSharedDeviceCachedUsers(@jakarta.annotation.Nullable final java.util.List<SharedAppleDeviceUser> value) {
        this.backingStore.set("sharedDeviceCachedUsers", value);
    }
    /**
     * Sets the subnetAddress property value. SubnetAddress
     * @param value Value to set for the subnetAddress property.
     */
    public void setSubnetAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subnetAddress", value);
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber carrier of the device
     * @param value Value to set for the subscriberCarrier property.
     */
    public void setSubscriberCarrier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriberCarrier", value);
    }
    /**
     * Sets the systemManagementBIOSVersion property value. BIOS version as reported by SMBIOS
     * @param value Value to set for the systemManagementBIOSVersion property.
     */
    public void setSystemManagementBIOSVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("systemManagementBIOSVersion", value);
    }
    /**
     * Sets the totalStorageSpace property value. Total storage space of the device.
     * @param value Value to set for the totalStorageSpace property.
     */
    public void setTotalStorageSpace(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalStorageSpace", value);
    }
    /**
     * Sets the tpmManufacturer property value. The identifying information that uniquely names the TPM manufacturer
     * @param value Value to set for the tpmManufacturer property.
     */
    public void setTpmManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tpmManufacturer", value);
    }
    /**
     * Sets the tpmSpecificationVersion property value. String that specifies the specification version.
     * @param value Value to set for the tpmSpecificationVersion property.
     */
    public void setTpmSpecificationVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tpmSpecificationVersion", value);
    }
    /**
     * Sets the tpmVersion property value. The version of the TPM, as specified by the manufacturer
     * @param value Value to set for the tpmVersion property.
     */
    public void setTpmVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tpmVersion", value);
    }
    /**
     * Sets the wifiMac property value. WiFi MAC address of the device
     * @param value Value to set for the wifiMac property.
     */
    public void setWifiMac(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wifiMac", value);
    }
    /**
     * Sets the wiredIPv4Addresses property value. A list of wired IPv4 addresses. The update frequency (the maximum delay for the change of property value to be synchronized from the device to the cloud storage) of this property is daily. Note this property is currently supported only on devices running on Windows.
     * @param value Value to set for the wiredIPv4Addresses property.
     */
    public void setWiredIPv4Addresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("wiredIPv4Addresses", value);
    }
}

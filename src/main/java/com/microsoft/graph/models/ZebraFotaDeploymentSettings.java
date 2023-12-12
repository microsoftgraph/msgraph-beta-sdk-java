package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ZebraFotaDeploymentSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ZebraFotaDeploymentSettings and sets the default values.
     */
    public ZebraFotaDeploymentSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ZebraFotaDeploymentSettings
     */
    @jakarta.annotation.Nonnull
    public static ZebraFotaDeploymentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeploymentSettings();
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
     * Gets the batteryRuleMinimumBatteryLevelPercentage property value. Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryRuleMinimumBatteryLevelPercentage() {
        return this.backingStore.get("batteryRuleMinimumBatteryLevelPercentage");
    }
    /**
     * Gets the batteryRuleRequireCharger property value. Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBatteryRuleRequireCharger() {
        return this.backingStore.get("batteryRuleRequireCharger");
    }
    /**
     * Gets the deviceModel property value. Deploy update for devices with this model only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
    }
    /**
     * Gets the downloadRuleNetworkType property value. Represents various network types for Zebra FOTA deployment.
     * @return a ZebraFotaNetworkType
     */
    @jakarta.annotation.Nullable
    public ZebraFotaNetworkType getDownloadRuleNetworkType() {
        return this.backingStore.get("downloadRuleNetworkType");
    }
    /**
     * Gets the downloadRuleStartDateTime property value. Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDownloadRuleStartDateTime() {
        return this.backingStore.get("downloadRuleStartDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("batteryRuleMinimumBatteryLevelPercentage", (n) -> { this.setBatteryRuleMinimumBatteryLevelPercentage(n.getIntegerValue()); });
        deserializerMap.put("batteryRuleRequireCharger", (n) -> { this.setBatteryRuleRequireCharger(n.getBooleanValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("downloadRuleNetworkType", (n) -> { this.setDownloadRuleNetworkType(n.getEnumValue(ZebraFotaNetworkType::forValue)); });
        deserializerMap.put("downloadRuleStartDateTime", (n) -> { this.setDownloadRuleStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("firmwareTargetArtifactDescription", (n) -> { this.setFirmwareTargetArtifactDescription(n.getStringValue()); });
        deserializerMap.put("firmwareTargetBoardSupportPackageVersion", (n) -> { this.setFirmwareTargetBoardSupportPackageVersion(n.getStringValue()); });
        deserializerMap.put("firmwareTargetOsVersion", (n) -> { this.setFirmwareTargetOsVersion(n.getStringValue()); });
        deserializerMap.put("firmwareTargetPatch", (n) -> { this.setFirmwareTargetPatch(n.getStringValue()); });
        deserializerMap.put("installRuleStartDateTime", (n) -> { this.setInstallRuleStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("installRuleWindowEndTime", (n) -> { this.setInstallRuleWindowEndTime(n.getLocalTimeValue()); });
        deserializerMap.put("installRuleWindowStartTime", (n) -> { this.setInstallRuleWindowStartTime(n.getLocalTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scheduleDurationInDays", (n) -> { this.setScheduleDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("scheduleMode", (n) -> { this.setScheduleMode(n.getEnumValue(ZebraFotaScheduleMode::forValue)); });
        deserializerMap.put("timeZoneOffsetInMinutes", (n) -> { this.setTimeZoneOffsetInMinutes(n.getIntegerValue()); });
        deserializerMap.put("updateType", (n) -> { this.setUpdateType(n.getEnumValue(ZebraFotaUpdateType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareTargetArtifactDescription property value. A description provided by Zebra for the the firmware artifact to update the device to (e.g.: LifeGuard Update 120 (released 29-June-2022).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetArtifactDescription() {
        return this.backingStore.get("firmwareTargetArtifactDescription");
    }
    /**
     * Gets the firmwareTargetBoardSupportPackageVersion property value. Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetBoardSupportPackageVersion() {
        return this.backingStore.get("firmwareTargetBoardSupportPackageVersion");
    }
    /**
     * Gets the firmwareTargetOsVersion property value. Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetOsVersion() {
        return this.backingStore.get("firmwareTargetOsVersion");
    }
    /**
     * Gets the firmwareTargetPatch property value. Target patch name (e.g.: 'U06'). Required only for custom update type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetPatch() {
        return this.backingStore.get("firmwareTargetPatch");
    }
    /**
     * Gets the installRuleStartDateTime property value. Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInstallRuleStartDateTime() {
        return this.backingStore.get("installRuleStartDateTime");
    }
    /**
     * Gets the installRuleWindowEndTime property value. Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getInstallRuleWindowEndTime() {
        return this.backingStore.get("installRuleWindowEndTime");
    }
    /**
     * Gets the installRuleWindowStartTime property value. Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getInstallRuleWindowStartTime() {
        return this.backingStore.get("installRuleWindowStartTime");
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
     * Gets the scheduleDurationInDays property value. Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getScheduleDurationInDays() {
        return this.backingStore.get("scheduleDurationInDays");
    }
    /**
     * Gets the scheduleMode property value. Represents various schedule modes for Zebra FOTA deployment.
     * @return a ZebraFotaScheduleMode
     */
    @jakarta.annotation.Nullable
    public ZebraFotaScheduleMode getScheduleMode() {
        return this.backingStore.get("scheduleMode");
    }
    /**
     * Gets the timeZoneOffsetInMinutes property value. This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTimeZoneOffsetInMinutes() {
        return this.backingStore.get("timeZoneOffsetInMinutes");
    }
    /**
     * Gets the updateType property value. Represents various update types for Zebra FOTA deployment.
     * @return a ZebraFotaUpdateType
     */
    @jakarta.annotation.Nullable
    public ZebraFotaUpdateType getUpdateType() {
        return this.backingStore.get("updateType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("batteryRuleMinimumBatteryLevelPercentage", this.getBatteryRuleMinimumBatteryLevelPercentage());
        writer.writeBooleanValue("batteryRuleRequireCharger", this.getBatteryRuleRequireCharger());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("downloadRuleNetworkType", this.getDownloadRuleNetworkType());
        writer.writeOffsetDateTimeValue("downloadRuleStartDateTime", this.getDownloadRuleStartDateTime());
        writer.writeStringValue("firmwareTargetArtifactDescription", this.getFirmwareTargetArtifactDescription());
        writer.writeStringValue("firmwareTargetBoardSupportPackageVersion", this.getFirmwareTargetBoardSupportPackageVersion());
        writer.writeStringValue("firmwareTargetOsVersion", this.getFirmwareTargetOsVersion());
        writer.writeStringValue("firmwareTargetPatch", this.getFirmwareTargetPatch());
        writer.writeOffsetDateTimeValue("installRuleStartDateTime", this.getInstallRuleStartDateTime());
        writer.writeLocalTimeValue("installRuleWindowEndTime", this.getInstallRuleWindowEndTime());
        writer.writeLocalTimeValue("installRuleWindowStartTime", this.getInstallRuleWindowStartTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("scheduleDurationInDays", this.getScheduleDurationInDays());
        writer.writeEnumValue("scheduleMode", this.getScheduleMode());
        writer.writeIntegerValue("timeZoneOffsetInMinutes", this.getTimeZoneOffsetInMinutes());
        writer.writeEnumValue("updateType", this.getUpdateType());
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
     * Sets the batteryRuleMinimumBatteryLevelPercentage property value. Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     * @param value Value to set for the batteryRuleMinimumBatteryLevelPercentage property.
     */
    public void setBatteryRuleMinimumBatteryLevelPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryRuleMinimumBatteryLevelPercentage", value);
    }
    /**
     * Sets the batteryRuleRequireCharger property value. Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     * @param value Value to set for the batteryRuleRequireCharger property.
     */
    public void setBatteryRuleRequireCharger(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("batteryRuleRequireCharger", value);
    }
    /**
     * Sets the deviceModel property value. Deploy update for devices with this model only.
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the downloadRuleNetworkType property value. Represents various network types for Zebra FOTA deployment.
     * @param value Value to set for the downloadRuleNetworkType property.
     */
    public void setDownloadRuleNetworkType(@jakarta.annotation.Nullable final ZebraFotaNetworkType value) {
        this.backingStore.set("downloadRuleNetworkType", value);
    }
    /**
     * Sets the downloadRuleStartDateTime property value. Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     * @param value Value to set for the downloadRuleStartDateTime property.
     */
    public void setDownloadRuleStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("downloadRuleStartDateTime", value);
    }
    /**
     * Sets the firmwareTargetArtifactDescription property value. A description provided by Zebra for the the firmware artifact to update the device to (e.g.: LifeGuard Update 120 (released 29-June-2022).
     * @param value Value to set for the firmwareTargetArtifactDescription property.
     */
    public void setFirmwareTargetArtifactDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firmwareTargetArtifactDescription", value);
    }
    /**
     * Sets the firmwareTargetBoardSupportPackageVersion property value. Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetBoardSupportPackageVersion property.
     */
    public void setFirmwareTargetBoardSupportPackageVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firmwareTargetBoardSupportPackageVersion", value);
    }
    /**
     * Sets the firmwareTargetOsVersion property value. Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetOsVersion property.
     */
    public void setFirmwareTargetOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firmwareTargetOsVersion", value);
    }
    /**
     * Sets the firmwareTargetPatch property value. Target patch name (e.g.: 'U06'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetPatch property.
     */
    public void setFirmwareTargetPatch(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firmwareTargetPatch", value);
    }
    /**
     * Sets the installRuleStartDateTime property value. Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     * @param value Value to set for the installRuleStartDateTime property.
     */
    public void setInstallRuleStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("installRuleStartDateTime", value);
    }
    /**
     * Sets the installRuleWindowEndTime property value. Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     * @param value Value to set for the installRuleWindowEndTime property.
     */
    public void setInstallRuleWindowEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("installRuleWindowEndTime", value);
    }
    /**
     * Sets the installRuleWindowStartTime property value. Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     * @param value Value to set for the installRuleWindowStartTime property.
     */
    public void setInstallRuleWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("installRuleWindowStartTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the scheduleDurationInDays property value. Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     * @param value Value to set for the scheduleDurationInDays property.
     */
    public void setScheduleDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("scheduleDurationInDays", value);
    }
    /**
     * Sets the scheduleMode property value. Represents various schedule modes for Zebra FOTA deployment.
     * @param value Value to set for the scheduleMode property.
     */
    public void setScheduleMode(@jakarta.annotation.Nullable final ZebraFotaScheduleMode value) {
        this.backingStore.set("scheduleMode", value);
    }
    /**
     * Sets the timeZoneOffsetInMinutes property value. This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     * @param value Value to set for the timeZoneOffsetInMinutes property.
     */
    public void setTimeZoneOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("timeZoneOffsetInMinutes", value);
    }
    /**
     * Sets the updateType property value. Represents various update types for Zebra FOTA deployment.
     * @param value Value to set for the updateType property.
     */
    public void setUpdateType(@jakarta.annotation.Nullable final ZebraFotaUpdateType value) {
        this.backingStore.set("updateType", value);
    }
}

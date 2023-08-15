package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
 */
public class ZebraFotaDeploymentSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     */
    private Integer batteryRuleMinimumBatteryLevelPercentage;
    /**
     * Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     */
    private Boolean batteryRuleRequireCharger;
    /**
     * Deploy update for devices with this model only.
     */
    private String deviceModel;
    /**
     * Represents various network types for Zebra FOTA deployment.
     */
    private ZebraFotaNetworkType downloadRuleNetworkType;
    /**
     * Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     */
    private OffsetDateTime downloadRuleStartDateTime;
    /**
     * A description provided by Zebra for the the firmware artifact to update the device to (e.g.: LifeGuard Update 120 (released 29-June-2022).
     */
    private String firmwareTargetArtifactDescription;
    /**
     * Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     */
    private String firmwareTargetBoardSupportPackageVersion;
    /**
     * Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     */
    private String firmwareTargetOsVersion;
    /**
     * Target patch name (e.g.: 'U06'). Required only for custom update type.
     */
    private String firmwareTargetPatch;
    /**
     * Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     */
    private OffsetDateTime installRuleStartDateTime;
    /**
     * Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     */
    private LocalTime installRuleWindowEndTime;
    /**
     * Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     */
    private LocalTime installRuleWindowStartTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     */
    private Integer scheduleDurationInDays;
    /**
     * Represents various schedule modes for Zebra FOTA deployment.
     */
    private ZebraFotaScheduleMode scheduleMode;
    /**
     * This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     */
    private Integer timeZoneOffsetInMinutes;
    /**
     * Represents various update types for Zebra FOTA deployment.
     */
    private ZebraFotaUpdateType updateType;
    /**
     * Instantiates a new zebraFotaDeploymentSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ZebraFotaDeploymentSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a zebraFotaDeploymentSettings
     */
    @jakarta.annotation.Nonnull
    public static ZebraFotaDeploymentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeploymentSettings();
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
     * Gets the batteryRuleMinimumBatteryLevelPercentage property value. Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryRuleMinimumBatteryLevelPercentage() {
        return this.batteryRuleMinimumBatteryLevelPercentage;
    }
    /**
     * Gets the batteryRuleRequireCharger property value. Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBatteryRuleRequireCharger() {
        return this.batteryRuleRequireCharger;
    }
    /**
     * Gets the deviceModel property value. Deploy update for devices with this model only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * Gets the downloadRuleNetworkType property value. Represents various network types for Zebra FOTA deployment.
     * @return a zebraFotaNetworkType
     */
    @jakarta.annotation.Nullable
    public ZebraFotaNetworkType getDownloadRuleNetworkType() {
        return this.downloadRuleNetworkType;
    }
    /**
     * Gets the downloadRuleStartDateTime property value. Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDownloadRuleStartDateTime() {
        return this.downloadRuleStartDateTime;
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
        deserializerMap.put("downloadRuleNetworkType", (n) -> { this.setDownloadRuleNetworkType(n.getEnumValue(ZebraFotaNetworkType.class)); });
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
        deserializerMap.put("scheduleMode", (n) -> { this.setScheduleMode(n.getEnumValue(ZebraFotaScheduleMode.class)); });
        deserializerMap.put("timeZoneOffsetInMinutes", (n) -> { this.setTimeZoneOffsetInMinutes(n.getIntegerValue()); });
        deserializerMap.put("updateType", (n) -> { this.setUpdateType(n.getEnumValue(ZebraFotaUpdateType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareTargetArtifactDescription property value. A description provided by Zebra for the the firmware artifact to update the device to (e.g.: LifeGuard Update 120 (released 29-June-2022).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetArtifactDescription() {
        return this.firmwareTargetArtifactDescription;
    }
    /**
     * Gets the firmwareTargetBoardSupportPackageVersion property value. Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetBoardSupportPackageVersion() {
        return this.firmwareTargetBoardSupportPackageVersion;
    }
    /**
     * Gets the firmwareTargetOsVersion property value. Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetOsVersion() {
        return this.firmwareTargetOsVersion;
    }
    /**
     * Gets the firmwareTargetPatch property value. Target patch name (e.g.: 'U06'). Required only for custom update type.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFirmwareTargetPatch() {
        return this.firmwareTargetPatch;
    }
    /**
     * Gets the installRuleStartDateTime property value. Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInstallRuleStartDateTime() {
        return this.installRuleStartDateTime;
    }
    /**
     * Gets the installRuleWindowEndTime property value. Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getInstallRuleWindowEndTime() {
        return this.installRuleWindowEndTime;
    }
    /**
     * Gets the installRuleWindowStartTime property value. Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getInstallRuleWindowStartTime() {
        return this.installRuleWindowStartTime;
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
     * Gets the scheduleDurationInDays property value. Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getScheduleDurationInDays() {
        return this.scheduleDurationInDays;
    }
    /**
     * Gets the scheduleMode property value. Represents various schedule modes for Zebra FOTA deployment.
     * @return a zebraFotaScheduleMode
     */
    @jakarta.annotation.Nullable
    public ZebraFotaScheduleMode getScheduleMode() {
        return this.scheduleMode;
    }
    /**
     * Gets the timeZoneOffsetInMinutes property value. This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTimeZoneOffsetInMinutes() {
        return this.timeZoneOffsetInMinutes;
    }
    /**
     * Gets the updateType property value. Represents various update types for Zebra FOTA deployment.
     * @return a zebraFotaUpdateType
     */
    @jakarta.annotation.Nullable
    public ZebraFotaUpdateType getUpdateType() {
        return this.updateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the batteryRuleMinimumBatteryLevelPercentage property value. Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     * @param value Value to set for the batteryRuleMinimumBatteryLevelPercentage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBatteryRuleMinimumBatteryLevelPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.batteryRuleMinimumBatteryLevelPercentage = value;
    }
    /**
     * Sets the batteryRuleRequireCharger property value. Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     * @param value Value to set for the batteryRuleRequireCharger property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBatteryRuleRequireCharger(@jakarta.annotation.Nullable final Boolean value) {
        this.batteryRuleRequireCharger = value;
    }
    /**
     * Sets the deviceModel property value. Deploy update for devices with this model only.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the downloadRuleNetworkType property value. Represents various network types for Zebra FOTA deployment.
     * @param value Value to set for the downloadRuleNetworkType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDownloadRuleNetworkType(@jakarta.annotation.Nullable final ZebraFotaNetworkType value) {
        this.downloadRuleNetworkType = value;
    }
    /**
     * Sets the downloadRuleStartDateTime property value. Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     * @param value Value to set for the downloadRuleStartDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDownloadRuleStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.downloadRuleStartDateTime = value;
    }
    /**
     * Sets the firmwareTargetArtifactDescription property value. A description provided by Zebra for the the firmware artifact to update the device to (e.g.: LifeGuard Update 120 (released 29-June-2022).
     * @param value Value to set for the firmwareTargetArtifactDescription property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirmwareTargetArtifactDescription(@jakarta.annotation.Nullable final String value) {
        this.firmwareTargetArtifactDescription = value;
    }
    /**
     * Sets the firmwareTargetBoardSupportPackageVersion property value. Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetBoardSupportPackageVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirmwareTargetBoardSupportPackageVersion(@jakarta.annotation.Nullable final String value) {
        this.firmwareTargetBoardSupportPackageVersion = value;
    }
    /**
     * Sets the firmwareTargetOsVersion property value. Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetOsVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirmwareTargetOsVersion(@jakarta.annotation.Nullable final String value) {
        this.firmwareTargetOsVersion = value;
    }
    /**
     * Sets the firmwareTargetPatch property value. Target patch name (e.g.: 'U06'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetPatch property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirmwareTargetPatch(@jakarta.annotation.Nullable final String value) {
        this.firmwareTargetPatch = value;
    }
    /**
     * Sets the installRuleStartDateTime property value. Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     * @param value Value to set for the installRuleStartDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstallRuleStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.installRuleStartDateTime = value;
    }
    /**
     * Sets the installRuleWindowEndTime property value. Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     * @param value Value to set for the installRuleWindowEndTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstallRuleWindowEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.installRuleWindowEndTime = value;
    }
    /**
     * Sets the installRuleWindowStartTime property value. Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     * @param value Value to set for the installRuleWindowStartTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstallRuleWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.installRuleWindowStartTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scheduleDurationInDays property value. Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     * @param value Value to set for the scheduleDurationInDays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScheduleDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.scheduleDurationInDays = value;
    }
    /**
     * Sets the scheduleMode property value. Represents various schedule modes for Zebra FOTA deployment.
     * @param value Value to set for the scheduleMode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScheduleMode(@jakarta.annotation.Nullable final ZebraFotaScheduleMode value) {
        this.scheduleMode = value;
    }
    /**
     * Sets the timeZoneOffsetInMinutes property value. This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     * @param value Value to set for the timeZoneOffsetInMinutes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTimeZoneOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.timeZoneOffsetInMinutes = value;
    }
    /**
     * Sets the updateType property value. Represents various update types for Zebra FOTA deployment.
     * @param value Value to set for the updateType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpdateType(@jakarta.annotation.Nullable final ZebraFotaUpdateType value) {
        this.updateType = value;
    }
}

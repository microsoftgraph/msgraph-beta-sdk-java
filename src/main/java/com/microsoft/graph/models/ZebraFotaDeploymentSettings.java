package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment. */
public class ZebraFotaDeploymentSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100. */
    private Integer _batteryRuleMinimumBatteryLevelPercentage;
    /** Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false. */
    private Boolean _batteryRuleRequireCharger;
    /** Deploy update for devices with this model only. */
    private String _deviceModel;
    /** Represents various network types for Zebra FOTA deployment. */
    private ZebraFotaNetworkType _downloadRuleNetworkType;
    /** Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation. */
    private OffsetDateTime _downloadRuleStartDateTime;
    /** Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type. */
    private String _firmwareTargetBoardSupportPackageVersion;
    /** Target OS Version (e.g.: '8.1.0'). Required only for custom update type. */
    private String _firmwareTargetOsVersion;
    /** Target patch name (e.g.: 'U06'). Required only for custom update type. */
    private String _firmwareTargetPatch;
    /** Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto. */
    private OffsetDateTime _installRuleStartDateTime;
    /** Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO. */
    private LocalTime _installRuleWindowEndTime;
    /** Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO. */
    private LocalTime _installRuleWindowStartTime;
    /** The OdataType property */
    private String _odataType;
    /** Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used. */
    private Integer _scheduleDurationInDays;
    /** Represents various schedule modes for Zebra FOTA deployment. */
    private ZebraFotaScheduleMode _scheduleMode;
    /** This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone */
    private Integer _timeZoneOffsetInMinutes;
    /** Represents various update types for Zebra FOTA deployment. */
    private ZebraFotaUpdateType _updateType;
    /**
     * Instantiates a new zebraFotaDeploymentSettings and sets the default values.
     * @return a void
     */
    public ZebraFotaDeploymentSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.zebraFotaDeploymentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a zebraFotaDeploymentSettings
     */
    @javax.annotation.Nonnull
    public static ZebraFotaDeploymentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeploymentSettings();
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
     * Gets the batteryRuleMinimumBatteryLevelPercentage property value. Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryRuleMinimumBatteryLevelPercentage() {
        return this._batteryRuleMinimumBatteryLevelPercentage;
    }
    /**
     * Gets the batteryRuleRequireCharger property value. Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBatteryRuleRequireCharger() {
        return this._batteryRuleRequireCharger;
    }
    /**
     * Gets the deviceModel property value. Deploy update for devices with this model only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this._deviceModel;
    }
    /**
     * Gets the downloadRuleNetworkType property value. Represents various network types for Zebra FOTA deployment.
     * @return a zebraFotaNetworkType
     */
    @javax.annotation.Nullable
    public ZebraFotaNetworkType getDownloadRuleNetworkType() {
        return this._downloadRuleNetworkType;
    }
    /**
     * Gets the downloadRuleStartDateTime property value. Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDownloadRuleStartDateTime() {
        return this._downloadRuleStartDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ZebraFotaDeploymentSettings currentObject = this;
        return new HashMap<>(16) {{
            this.put("batteryRuleMinimumBatteryLevelPercentage", (n) -> { currentObject.setBatteryRuleMinimumBatteryLevelPercentage(n.getIntegerValue()); });
            this.put("batteryRuleRequireCharger", (n) -> { currentObject.setBatteryRuleRequireCharger(n.getBooleanValue()); });
            this.put("deviceModel", (n) -> { currentObject.setDeviceModel(n.getStringValue()); });
            this.put("downloadRuleNetworkType", (n) -> { currentObject.setDownloadRuleNetworkType(n.getEnumValue(ZebraFotaNetworkType.class)); });
            this.put("downloadRuleStartDateTime", (n) -> { currentObject.setDownloadRuleStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("firmwareTargetBoardSupportPackageVersion", (n) -> { currentObject.setFirmwareTargetBoardSupportPackageVersion(n.getStringValue()); });
            this.put("firmwareTargetOsVersion", (n) -> { currentObject.setFirmwareTargetOsVersion(n.getStringValue()); });
            this.put("firmwareTargetPatch", (n) -> { currentObject.setFirmwareTargetPatch(n.getStringValue()); });
            this.put("installRuleStartDateTime", (n) -> { currentObject.setInstallRuleStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("installRuleWindowEndTime", (n) -> { currentObject.setInstallRuleWindowEndTime(n.getLocalTimeValue()); });
            this.put("installRuleWindowStartTime", (n) -> { currentObject.setInstallRuleWindowStartTime(n.getLocalTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("scheduleDurationInDays", (n) -> { currentObject.setScheduleDurationInDays(n.getIntegerValue()); });
            this.put("scheduleMode", (n) -> { currentObject.setScheduleMode(n.getEnumValue(ZebraFotaScheduleMode.class)); });
            this.put("timeZoneOffsetInMinutes", (n) -> { currentObject.setTimeZoneOffsetInMinutes(n.getIntegerValue()); });
            this.put("updateType", (n) -> { currentObject.setUpdateType(n.getEnumValue(ZebraFotaUpdateType.class)); });
        }};
    }
    /**
     * Gets the firmwareTargetBoardSupportPackageVersion property value. Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirmwareTargetBoardSupportPackageVersion() {
        return this._firmwareTargetBoardSupportPackageVersion;
    }
    /**
     * Gets the firmwareTargetOsVersion property value. Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirmwareTargetOsVersion() {
        return this._firmwareTargetOsVersion;
    }
    /**
     * Gets the firmwareTargetPatch property value. Target patch name (e.g.: 'U06'). Required only for custom update type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirmwareTargetPatch() {
        return this._firmwareTargetPatch;
    }
    /**
     * Gets the installRuleStartDateTime property value. Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInstallRuleStartDateTime() {
        return this._installRuleStartDateTime;
    }
    /**
     * Gets the installRuleWindowEndTime property value. Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getInstallRuleWindowEndTime() {
        return this._installRuleWindowEndTime;
    }
    /**
     * Gets the installRuleWindowStartTime property value. Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getInstallRuleWindowStartTime() {
        return this._installRuleWindowStartTime;
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
     * Gets the scheduleDurationInDays property value. Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getScheduleDurationInDays() {
        return this._scheduleDurationInDays;
    }
    /**
     * Gets the scheduleMode property value. Represents various schedule modes for Zebra FOTA deployment.
     * @return a zebraFotaScheduleMode
     */
    @javax.annotation.Nullable
    public ZebraFotaScheduleMode getScheduleMode() {
        return this._scheduleMode;
    }
    /**
     * Gets the timeZoneOffsetInMinutes property value. This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTimeZoneOffsetInMinutes() {
        return this._timeZoneOffsetInMinutes;
    }
    /**
     * Gets the updateType property value. Represents various update types for Zebra FOTA deployment.
     * @return a zebraFotaUpdateType
     */
    @javax.annotation.Nullable
    public ZebraFotaUpdateType getUpdateType() {
        return this._updateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("batteryRuleMinimumBatteryLevelPercentage", this.getBatteryRuleMinimumBatteryLevelPercentage());
        writer.writeBooleanValue("batteryRuleRequireCharger", this.getBatteryRuleRequireCharger());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("downloadRuleNetworkType", this.getDownloadRuleNetworkType());
        writer.writeOffsetDateTimeValue("downloadRuleStartDateTime", this.getDownloadRuleStartDateTime());
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the batteryRuleMinimumBatteryLevelPercentage property value. Minimum battery level (%) required for both download and installation. Default: -1 (System defaults). Maximum is 100.
     * @param value Value to set for the batteryRuleMinimumBatteryLevelPercentage property.
     * @return a void
     */
    public void setBatteryRuleMinimumBatteryLevelPercentage(@javax.annotation.Nullable final Integer value) {
        this._batteryRuleMinimumBatteryLevelPercentage = value;
    }
    /**
     * Sets the batteryRuleRequireCharger property value. Flag indicating if charger is required. When set to false, the client can install updates whether the device is in or out of the charger. Applied only for installation. Defaults to false.
     * @param value Value to set for the batteryRuleRequireCharger property.
     * @return a void
     */
    public void setBatteryRuleRequireCharger(@javax.annotation.Nullable final Boolean value) {
        this._batteryRuleRequireCharger = value;
    }
    /**
     * Sets the deviceModel property value. Deploy update for devices with this model only.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this._deviceModel = value;
    }
    /**
     * Sets the downloadRuleNetworkType property value. Represents various network types for Zebra FOTA deployment.
     * @param value Value to set for the downloadRuleNetworkType property.
     * @return a void
     */
    public void setDownloadRuleNetworkType(@javax.annotation.Nullable final ZebraFotaNetworkType value) {
        this._downloadRuleNetworkType = value;
    }
    /**
     * Sets the downloadRuleStartDateTime property value. Date and time in the device time zone when the download will start (e.g., 2018-07-25T10:20:32). The default value is UTC now and the maximum is 10 days from deployment creation.
     * @param value Value to set for the downloadRuleStartDateTime property.
     * @return a void
     */
    public void setDownloadRuleStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._downloadRuleStartDateTime = value;
    }
    /**
     * Sets the firmwareTargetBoardSupportPackageVersion property value. Deployment's Board Support Package (BSP. E.g.: '01.18.02.00'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetBoardSupportPackageVersion property.
     * @return a void
     */
    public void setFirmwareTargetBoardSupportPackageVersion(@javax.annotation.Nullable final String value) {
        this._firmwareTargetBoardSupportPackageVersion = value;
    }
    /**
     * Sets the firmwareTargetOsVersion property value. Target OS Version (e.g.: '8.1.0'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetOsVersion property.
     * @return a void
     */
    public void setFirmwareTargetOsVersion(@javax.annotation.Nullable final String value) {
        this._firmwareTargetOsVersion = value;
    }
    /**
     * Sets the firmwareTargetPatch property value. Target patch name (e.g.: 'U06'). Required only for custom update type.
     * @param value Value to set for the firmwareTargetPatch property.
     * @return a void
     */
    public void setFirmwareTargetPatch(@javax.annotation.Nullable final String value) {
        this._firmwareTargetPatch = value;
    }
    /**
     * Sets the installRuleStartDateTime property value. Date and time in device time zone when the install will start. Default - download startDate if configured, otherwise defaults to NOW. Ignored when deployment update type was set to auto.
     * @param value Value to set for the installRuleStartDateTime property.
     * @return a void
     */
    public void setInstallRuleStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._installRuleStartDateTime = value;
    }
    /**
     * Sets the installRuleWindowEndTime property value. Time of day after which the install cannot start. Possible range is 00:30:00 to 23:59:59. Should be greater than 'installRuleWindowStartTime' by 30 mins. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 23:59:59. Respected for all values of update type, including AUTO.
     * @param value Value to set for the installRuleWindowEndTime property.
     * @return a void
     */
    public void setInstallRuleWindowEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._installRuleWindowEndTime = value;
    }
    /**
     * Sets the installRuleWindowStartTime property value. Time of day (00:00:00 - 23:30:00) when installation should begin. The time is expressed in a 24-hour format, as hh:mm, and is in the device time zone. Default - 00:00:00. Respected for all values of update type, including AUTO.
     * @param value Value to set for the installRuleWindowStartTime property.
     * @return a void
     */
    public void setInstallRuleWindowStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._installRuleWindowStartTime = value;
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
     * Sets the scheduleDurationInDays property value. Maximum 28 days. Default is 28 days. Sequence of dates are: 1) Download start date. 2) Install start date. 3) Schedule end date. If any of the values are not provided, the date provided in the preceding step of the sequence is used. If no values are provided, the string value of the current UTC is used.
     * @param value Value to set for the scheduleDurationInDays property.
     * @return a void
     */
    public void setScheduleDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._scheduleDurationInDays = value;
    }
    /**
     * Sets the scheduleMode property value. Represents various schedule modes for Zebra FOTA deployment.
     * @param value Value to set for the scheduleMode property.
     * @return a void
     */
    public void setScheduleMode(@javax.annotation.Nullable final ZebraFotaScheduleMode value) {
        this._scheduleMode = value;
    }
    /**
     * Sets the timeZoneOffsetInMinutes property value. This attribute indicates the deployment time offset (e.g.180 represents an offset of +03:00, and -270 represents an offset of -04:30). The time offset is the time timezone where the devices are located. The deployment start and end data uses this timezone
     * @param value Value to set for the timeZoneOffsetInMinutes property.
     * @return a void
     */
    public void setTimeZoneOffsetInMinutes(@javax.annotation.Nullable final Integer value) {
        this._timeZoneOffsetInMinutes = value;
    }
    /**
     * Sets the updateType property value. Represents various update types for Zebra FOTA deployment.
     * @param value Value to set for the updateType property.
     * @return a void
     */
    public void setUpdateType(@javax.annotation.Nullable final ZebraFotaUpdateType value) {
        this._updateType = value;
    }
}

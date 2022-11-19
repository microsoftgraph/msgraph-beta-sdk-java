package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics Work From Anywhere metrics devices summary. */
public class UserExperienceAnalyticsWorkFromAnywhereDevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The value of work from anywhere autopilot devices summary. */
    private UserExperienceAnalyticsAutopilotDevicesSummary _autopilotDevicesSummary;
    /** The user experience analytics work from anywhere Cloud Identity devices summary. */
    private UserExperienceAnalyticsCloudIdentityDevicesSummary _cloudIdentityDevicesSummary;
    /** The user experience work from anywhere Cloud management devices summary. */
    private UserExperienceAnalyticsCloudManagementDevicesSummary _cloudManagementDevicesSummary;
    /** Total number of co-managed devices. Valid values -2147483648 to 2147483647 */
    private Integer _coManagedDevices;
    /** The count of intune devices that are not autopilot registerd. Valid values -2147483648 to 2147483647 */
    private Integer _devicesNotAutopilotRegistered;
    /** The count of intune devices not autopilot profile assigned. Valid values -2147483648 to 2147483647 */
    private Integer _devicesWithoutAutopilotProfileAssigned;
    /** The count of devices that are not cloud identity. Valid values -2147483648 to 2147483647 */
    private Integer _devicesWithoutCloudIdentity;
    /** The count of intune devices that are not autopilot registerd. Valid values -2147483648 to 2147483647 */
    private Integer _intuneDevices;
    /** The OdataType property */
    private String _odataType;
    /** Total count of tenant attach devices. Valid values -2147483648 to 2147483647 */
    private Integer _tenantAttachDevices;
    /** The total count of devices. Valid values -2147483648 to 2147483647 */
    private Integer _totalDevices;
    /** The count of Windows 10 devices that have unsupported OS versions. Valid values -2147483648 to 2147483647 */
    private Integer _unsupportedOSversionDevices;
    /** The count of windows 10 devices. Valid values -2147483648 to 2147483647 */
    private Integer _windows10Devices;
    /** The user experience analytics work from anywhere Windows 10 devices summary. */
    private UserExperienceAnalyticsWindows10DevicesSummary _windows10DevicesSummary;
    /** The count of windows 10 devices that are Intune and Comanaged. Valid values -2147483648 to 2147483647 */
    private Integer _windows10DevicesWithoutTenantAttach;
    /**
     * Instantiates a new userExperienceAnalyticsWorkFromAnywhereDevicesSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevicesSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWorkFromAnywhereDevicesSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereDevicesSummary();
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
     * Gets the autopilotDevicesSummary property value. The value of work from anywhere autopilot devices summary.
     * @return a userExperienceAnalyticsAutopilotDevicesSummary
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAutopilotDevicesSummary getAutopilotDevicesSummary() {
        return this._autopilotDevicesSummary;
    }
    /**
     * Gets the cloudIdentityDevicesSummary property value. The user experience analytics work from anywhere Cloud Identity devices summary.
     * @return a userExperienceAnalyticsCloudIdentityDevicesSummary
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCloudIdentityDevicesSummary getCloudIdentityDevicesSummary() {
        return this._cloudIdentityDevicesSummary;
    }
    /**
     * Gets the cloudManagementDevicesSummary property value. The user experience work from anywhere Cloud management devices summary.
     * @return a userExperienceAnalyticsCloudManagementDevicesSummary
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCloudManagementDevicesSummary getCloudManagementDevicesSummary() {
        return this._cloudManagementDevicesSummary;
    }
    /**
     * Gets the coManagedDevices property value. Total number of co-managed devices. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoManagedDevices() {
        return this._coManagedDevices;
    }
    /**
     * Gets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDevicesNotAutopilotRegistered() {
        return this._devicesNotAutopilotRegistered;
    }
    /**
     * Gets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDevicesWithoutAutopilotProfileAssigned() {
        return this._devicesWithoutAutopilotProfileAssigned;
    }
    /**
     * Gets the devicesWithoutCloudIdentity property value. The count of devices that are not cloud identity. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDevicesWithoutCloudIdentity() {
        return this._devicesWithoutCloudIdentity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsWorkFromAnywhereDevicesSummary currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(15);
        deserializerMap.put("autopilotDevicesSummary", (n) -> { currentObject.setAutopilotDevicesSummary(n.getObjectValue(UserExperienceAnalyticsAutopilotDevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudIdentityDevicesSummary", (n) -> { currentObject.setCloudIdentityDevicesSummary(n.getObjectValue(UserExperienceAnalyticsCloudIdentityDevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudManagementDevicesSummary", (n) -> { currentObject.setCloudManagementDevicesSummary(n.getObjectValue(UserExperienceAnalyticsCloudManagementDevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("coManagedDevices", (n) -> { currentObject.setCoManagedDevices(n.getIntegerValue()); });
        deserializerMap.put("devicesNotAutopilotRegistered", (n) -> { currentObject.setDevicesNotAutopilotRegistered(n.getIntegerValue()); });
        deserializerMap.put("devicesWithoutAutopilotProfileAssigned", (n) -> { currentObject.setDevicesWithoutAutopilotProfileAssigned(n.getIntegerValue()); });
        deserializerMap.put("devicesWithoutCloudIdentity", (n) -> { currentObject.setDevicesWithoutCloudIdentity(n.getIntegerValue()); });
        deserializerMap.put("intuneDevices", (n) -> { currentObject.setIntuneDevices(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantAttachDevices", (n) -> { currentObject.setTenantAttachDevices(n.getIntegerValue()); });
        deserializerMap.put("totalDevices", (n) -> { currentObject.setTotalDevices(n.getIntegerValue()); });
        deserializerMap.put("unsupportedOSversionDevices", (n) -> { currentObject.setUnsupportedOSversionDevices(n.getIntegerValue()); });
        deserializerMap.put("windows10Devices", (n) -> { currentObject.setWindows10Devices(n.getIntegerValue()); });
        deserializerMap.put("windows10DevicesSummary", (n) -> { currentObject.setWindows10DevicesSummary(n.getObjectValue(UserExperienceAnalyticsWindows10DevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windows10DevicesWithoutTenantAttach", (n) -> { currentObject.setWindows10DevicesWithoutTenantAttach(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the intuneDevices property value. The count of intune devices that are not autopilot registerd. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIntuneDevices() {
        return this._intuneDevices;
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
     * Gets the tenantAttachDevices property value. Total count of tenant attach devices. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTenantAttachDevices() {
        return this._tenantAttachDevices;
    }
    /**
     * Gets the totalDevices property value. The total count of devices. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalDevices() {
        return this._totalDevices;
    }
    /**
     * Gets the unsupportedOSversionDevices property value. The count of Windows 10 devices that have unsupported OS versions. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnsupportedOSversionDevices() {
        return this._unsupportedOSversionDevices;
    }
    /**
     * Gets the windows10Devices property value. The count of windows 10 devices. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindows10Devices() {
        return this._windows10Devices;
    }
    /**
     * Gets the windows10DevicesSummary property value. The user experience analytics work from anywhere Windows 10 devices summary.
     * @return a userExperienceAnalyticsWindows10DevicesSummary
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsWindows10DevicesSummary getWindows10DevicesSummary() {
        return this._windows10DevicesSummary;
    }
    /**
     * Gets the windows10DevicesWithoutTenantAttach property value. The count of windows 10 devices that are Intune and Comanaged. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindows10DevicesWithoutTenantAttach() {
        return this._windows10DevicesWithoutTenantAttach;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("autopilotDevicesSummary", this.getAutopilotDevicesSummary());
        writer.writeObjectValue("cloudIdentityDevicesSummary", this.getCloudIdentityDevicesSummary());
        writer.writeObjectValue("cloudManagementDevicesSummary", this.getCloudManagementDevicesSummary());
        writer.writeIntegerValue("coManagedDevices", this.getCoManagedDevices());
        writer.writeIntegerValue("devicesNotAutopilotRegistered", this.getDevicesNotAutopilotRegistered());
        writer.writeIntegerValue("devicesWithoutAutopilotProfileAssigned", this.getDevicesWithoutAutopilotProfileAssigned());
        writer.writeIntegerValue("devicesWithoutCloudIdentity", this.getDevicesWithoutCloudIdentity());
        writer.writeIntegerValue("intuneDevices", this.getIntuneDevices());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("tenantAttachDevices", this.getTenantAttachDevices());
        writer.writeIntegerValue("totalDevices", this.getTotalDevices());
        writer.writeIntegerValue("unsupportedOSversionDevices", this.getUnsupportedOSversionDevices());
        writer.writeIntegerValue("windows10Devices", this.getWindows10Devices());
        writer.writeObjectValue("windows10DevicesSummary", this.getWindows10DevicesSummary());
        writer.writeIntegerValue("windows10DevicesWithoutTenantAttach", this.getWindows10DevicesWithoutTenantAttach());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the autopilotDevicesSummary property value. The value of work from anywhere autopilot devices summary.
     * @param value Value to set for the autopilotDevicesSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutopilotDevicesSummary(@javax.annotation.Nullable final UserExperienceAnalyticsAutopilotDevicesSummary value) {
        this._autopilotDevicesSummary = value;
    }
    /**
     * Sets the cloudIdentityDevicesSummary property value. The user experience analytics work from anywhere Cloud Identity devices summary.
     * @param value Value to set for the cloudIdentityDevicesSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudIdentityDevicesSummary(@javax.annotation.Nullable final UserExperienceAnalyticsCloudIdentityDevicesSummary value) {
        this._cloudIdentityDevicesSummary = value;
    }
    /**
     * Sets the cloudManagementDevicesSummary property value. The user experience work from anywhere Cloud management devices summary.
     * @param value Value to set for the cloudManagementDevicesSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudManagementDevicesSummary(@javax.annotation.Nullable final UserExperienceAnalyticsCloudManagementDevicesSummary value) {
        this._cloudManagementDevicesSummary = value;
    }
    /**
     * Sets the coManagedDevices property value. Total number of co-managed devices. Valid values -2147483648 to 2147483647
     * @param value Value to set for the coManagedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoManagedDevices(@javax.annotation.Nullable final Integer value) {
        this._coManagedDevices = value;
    }
    /**
     * Sets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd. Valid values -2147483648 to 2147483647
     * @param value Value to set for the devicesNotAutopilotRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicesNotAutopilotRegistered(@javax.annotation.Nullable final Integer value) {
        this._devicesNotAutopilotRegistered = value;
    }
    /**
     * Sets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned. Valid values -2147483648 to 2147483647
     * @param value Value to set for the devicesWithoutAutopilotProfileAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicesWithoutAutopilotProfileAssigned(@javax.annotation.Nullable final Integer value) {
        this._devicesWithoutAutopilotProfileAssigned = value;
    }
    /**
     * Sets the devicesWithoutCloudIdentity property value. The count of devices that are not cloud identity. Valid values -2147483648 to 2147483647
     * @param value Value to set for the devicesWithoutCloudIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicesWithoutCloudIdentity(@javax.annotation.Nullable final Integer value) {
        this._devicesWithoutCloudIdentity = value;
    }
    /**
     * Sets the intuneDevices property value. The count of intune devices that are not autopilot registerd. Valid values -2147483648 to 2147483647
     * @param value Value to set for the intuneDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneDevices(@javax.annotation.Nullable final Integer value) {
        this._intuneDevices = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tenantAttachDevices property value. Total count of tenant attach devices. Valid values -2147483648 to 2147483647
     * @param value Value to set for the tenantAttachDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantAttachDevices(@javax.annotation.Nullable final Integer value) {
        this._tenantAttachDevices = value;
    }
    /**
     * Sets the totalDevices property value. The total count of devices. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalDevices(@javax.annotation.Nullable final Integer value) {
        this._totalDevices = value;
    }
    /**
     * Sets the unsupportedOSversionDevices property value. The count of Windows 10 devices that have unsupported OS versions. Valid values -2147483648 to 2147483647
     * @param value Value to set for the unsupportedOSversionDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnsupportedOSversionDevices(@javax.annotation.Nullable final Integer value) {
        this._unsupportedOSversionDevices = value;
    }
    /**
     * Sets the windows10Devices property value. The count of windows 10 devices. Valid values -2147483648 to 2147483647
     * @param value Value to set for the windows10Devices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows10Devices(@javax.annotation.Nullable final Integer value) {
        this._windows10Devices = value;
    }
    /**
     * Sets the windows10DevicesSummary property value. The user experience analytics work from anywhere Windows 10 devices summary.
     * @param value Value to set for the windows10DevicesSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows10DevicesSummary(@javax.annotation.Nullable final UserExperienceAnalyticsWindows10DevicesSummary value) {
        this._windows10DevicesSummary = value;
    }
    /**
     * Sets the windows10DevicesWithoutTenantAttach property value. The count of windows 10 devices that are Intune and Comanaged. Valid values -2147483648 to 2147483647
     * @param value Value to set for the windows10DevicesWithoutTenantAttach property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows10DevicesWithoutTenantAttach(@javax.annotation.Nullable final Integer value) {
        this._windows10DevicesWithoutTenantAttach = value;
    }
}

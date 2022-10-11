package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric extends Entity implements Parsable {
    /** The percentage of devices for which OS check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _osCheckFailedPercentage;
    /** The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _processor64BitCheckFailedPercentage;
    /** The percentage of devices for which processor hardware core count check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _processorCoreCountCheckFailedPercentage;
    /** The percentage of devices for which processor hardware family check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _processorFamilyCheckFailedPercentage;
    /** The percentage of devices for which processor hardware speed check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _processorSpeedCheckFailedPercentage;
    /** The percentage of devices for which RAM hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _ramCheckFailedPercentage;
    /** The percentage of devices for which secure boot hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _secureBootCheckFailedPercentage;
    /** The percentage of devices for which storage hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _storageCheckFailedPercentage;
    /** The count of total devices in an organization. Valid values -2147483648 to 2147483647 */
    private Integer _totalDeviceCount;
    /** The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _tpmCheckFailedPercentage;
    /** The count of devices in an organization eligible for windows upgrade. Valid values -2147483648 to 2147483647 */
    private Integer _upgradeEligibleDeviceCount;
    /**
     * Instantiates a new userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("osCheckFailedPercentage", (n) -> { currentObject.setOsCheckFailedPercentage(n.getDoubleValue()); });
            this.put("processor64BitCheckFailedPercentage", (n) -> { currentObject.setProcessor64BitCheckFailedPercentage(n.getDoubleValue()); });
            this.put("processorCoreCountCheckFailedPercentage", (n) -> { currentObject.setProcessorCoreCountCheckFailedPercentage(n.getDoubleValue()); });
            this.put("processorFamilyCheckFailedPercentage", (n) -> { currentObject.setProcessorFamilyCheckFailedPercentage(n.getDoubleValue()); });
            this.put("processorSpeedCheckFailedPercentage", (n) -> { currentObject.setProcessorSpeedCheckFailedPercentage(n.getDoubleValue()); });
            this.put("ramCheckFailedPercentage", (n) -> { currentObject.setRamCheckFailedPercentage(n.getDoubleValue()); });
            this.put("secureBootCheckFailedPercentage", (n) -> { currentObject.setSecureBootCheckFailedPercentage(n.getDoubleValue()); });
            this.put("storageCheckFailedPercentage", (n) -> { currentObject.setStorageCheckFailedPercentage(n.getDoubleValue()); });
            this.put("totalDeviceCount", (n) -> { currentObject.setTotalDeviceCount(n.getIntegerValue()); });
            this.put("tpmCheckFailedPercentage", (n) -> { currentObject.setTpmCheckFailedPercentage(n.getDoubleValue()); });
            this.put("upgradeEligibleDeviceCount", (n) -> { currentObject.setUpgradeEligibleDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the osCheckFailedPercentage property value. The percentage of devices for which OS check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getOsCheckFailedPercentage() {
        return this._osCheckFailedPercentage;
    }
    /**
     * Gets the processor64BitCheckFailedPercentage property value. The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getProcessor64BitCheckFailedPercentage() {
        return this._processor64BitCheckFailedPercentage;
    }
    /**
     * Gets the processorCoreCountCheckFailedPercentage property value. The percentage of devices for which processor hardware core count check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getProcessorCoreCountCheckFailedPercentage() {
        return this._processorCoreCountCheckFailedPercentage;
    }
    /**
     * Gets the processorFamilyCheckFailedPercentage property value. The percentage of devices for which processor hardware family check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getProcessorFamilyCheckFailedPercentage() {
        return this._processorFamilyCheckFailedPercentage;
    }
    /**
     * Gets the processorSpeedCheckFailedPercentage property value. The percentage of devices for which processor hardware speed check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getProcessorSpeedCheckFailedPercentage() {
        return this._processorSpeedCheckFailedPercentage;
    }
    /**
     * Gets the ramCheckFailedPercentage property value. The percentage of devices for which RAM hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRamCheckFailedPercentage() {
        return this._ramCheckFailedPercentage;
    }
    /**
     * Gets the secureBootCheckFailedPercentage property value. The percentage of devices for which secure boot hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSecureBootCheckFailedPercentage() {
        return this._secureBootCheckFailedPercentage;
    }
    /**
     * Gets the storageCheckFailedPercentage property value. The percentage of devices for which storage hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStorageCheckFailedPercentage() {
        return this._storageCheckFailedPercentage;
    }
    /**
     * Gets the totalDeviceCount property value. The count of total devices in an organization. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalDeviceCount() {
        return this._totalDeviceCount;
    }
    /**
     * Gets the tpmCheckFailedPercentage property value. The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTpmCheckFailedPercentage() {
        return this._tpmCheckFailedPercentage;
    }
    /**
     * Gets the upgradeEligibleDeviceCount property value. The count of devices in an organization eligible for windows upgrade. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUpgradeEligibleDeviceCount() {
        return this._upgradeEligibleDeviceCount;
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
        writer.writeDoubleValue("osCheckFailedPercentage", this.getOsCheckFailedPercentage());
        writer.writeDoubleValue("processor64BitCheckFailedPercentage", this.getProcessor64BitCheckFailedPercentage());
        writer.writeDoubleValue("processorCoreCountCheckFailedPercentage", this.getProcessorCoreCountCheckFailedPercentage());
        writer.writeDoubleValue("processorFamilyCheckFailedPercentage", this.getProcessorFamilyCheckFailedPercentage());
        writer.writeDoubleValue("processorSpeedCheckFailedPercentage", this.getProcessorSpeedCheckFailedPercentage());
        writer.writeDoubleValue("ramCheckFailedPercentage", this.getRamCheckFailedPercentage());
        writer.writeDoubleValue("secureBootCheckFailedPercentage", this.getSecureBootCheckFailedPercentage());
        writer.writeDoubleValue("storageCheckFailedPercentage", this.getStorageCheckFailedPercentage());
        writer.writeIntegerValue("totalDeviceCount", this.getTotalDeviceCount());
        writer.writeDoubleValue("tpmCheckFailedPercentage", this.getTpmCheckFailedPercentage());
        writer.writeIntegerValue("upgradeEligibleDeviceCount", this.getUpgradeEligibleDeviceCount());
    }
    /**
     * Sets the osCheckFailedPercentage property value. The percentage of devices for which OS check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the osCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._osCheckFailedPercentage = value;
    }
    /**
     * Sets the processor64BitCheckFailedPercentage property value. The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processor64BitCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessor64BitCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._processor64BitCheckFailedPercentage = value;
    }
    /**
     * Sets the processorCoreCountCheckFailedPercentage property value. The percentage of devices for which processor hardware core count check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorCoreCountCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorCoreCountCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._processorCoreCountCheckFailedPercentage = value;
    }
    /**
     * Sets the processorFamilyCheckFailedPercentage property value. The percentage of devices for which processor hardware family check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorFamilyCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorFamilyCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._processorFamilyCheckFailedPercentage = value;
    }
    /**
     * Sets the processorSpeedCheckFailedPercentage property value. The percentage of devices for which processor hardware speed check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorSpeedCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorSpeedCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._processorSpeedCheckFailedPercentage = value;
    }
    /**
     * Sets the ramCheckFailedPercentage property value. The percentage of devices for which RAM hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the ramCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRamCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._ramCheckFailedPercentage = value;
    }
    /**
     * Sets the secureBootCheckFailedPercentage property value. The percentage of devices for which secure boot hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the secureBootCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureBootCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._secureBootCheckFailedPercentage = value;
    }
    /**
     * Sets the storageCheckFailedPercentage property value. The percentage of devices for which storage hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the storageCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._storageCheckFailedPercentage = value;
    }
    /**
     * Sets the totalDeviceCount property value. The count of total devices in an organization. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._totalDeviceCount = value;
    }
    /**
     * Sets the tpmCheckFailedPercentage property value. The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the tpmCheckFailedPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmCheckFailedPercentage(@javax.annotation.Nullable final Double value) {
        this._tpmCheckFailedPercentage = value;
    }
    /**
     * Sets the upgradeEligibleDeviceCount property value. The count of devices in an organization eligible for windows upgrade. Valid values -2147483648 to 2147483647
     * @param value Value to set for the upgradeEligibleDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeEligibleDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._upgradeEligibleDeviceCount = value;
    }
}

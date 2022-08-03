package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Hardware information of a given device. */
public class DeviceProtectionOverview implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Clean device count. */
    private Integer _cleanDeviceCount;
    /** Critical failures device count. */
    private Integer _criticalFailuresDeviceCount;
    /** Device with inactive threat agent count */
    private Integer _inactiveThreatAgentDeviceCount;
    /** The OdataType property */
    private String _odataType;
    /** Pending full scan device count. */
    private Integer _pendingFullScanDeviceCount;
    /** Pending manual steps device count. */
    private Integer _pendingManualStepsDeviceCount;
    /** Pending offline scan device count. */
    private Integer _pendingOfflineScanDeviceCount;
    /** Pending quick scan device count. Valid values -2147483648 to 2147483647 */
    private Integer _pendingQuickScanDeviceCount;
    /** Pending restart device count. */
    private Integer _pendingRestartDeviceCount;
    /** Device with old signature count. */
    private Integer _pendingSignatureUpdateDeviceCount;
    /** Total device count. */
    private Integer _totalReportedDeviceCount;
    /** Device with threat agent state as unknown count. */
    private Integer _unknownStateThreatAgentDeviceCount;
    /**
     * Instantiates a new deviceProtectionOverview and sets the default values.
     * @return a void
     */
    public DeviceProtectionOverview() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceProtectionOverview");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceProtectionOverview
     */
    @javax.annotation.Nonnull
    public static DeviceProtectionOverview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceProtectionOverview();
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
     * Gets the cleanDeviceCount property value. Clean device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCleanDeviceCount() {
        return this._cleanDeviceCount;
    }
    /**
     * Gets the criticalFailuresDeviceCount property value. Critical failures device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCriticalFailuresDeviceCount() {
        return this._criticalFailuresDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceProtectionOverview currentObject = this;
        return new HashMap<>(12) {{
            this.put("cleanDeviceCount", (n) -> { currentObject.setCleanDeviceCount(n.getIntegerValue()); });
            this.put("criticalFailuresDeviceCount", (n) -> { currentObject.setCriticalFailuresDeviceCount(n.getIntegerValue()); });
            this.put("inactiveThreatAgentDeviceCount", (n) -> { currentObject.setInactiveThreatAgentDeviceCount(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("pendingFullScanDeviceCount", (n) -> { currentObject.setPendingFullScanDeviceCount(n.getIntegerValue()); });
            this.put("pendingManualStepsDeviceCount", (n) -> { currentObject.setPendingManualStepsDeviceCount(n.getIntegerValue()); });
            this.put("pendingOfflineScanDeviceCount", (n) -> { currentObject.setPendingOfflineScanDeviceCount(n.getIntegerValue()); });
            this.put("pendingQuickScanDeviceCount", (n) -> { currentObject.setPendingQuickScanDeviceCount(n.getIntegerValue()); });
            this.put("pendingRestartDeviceCount", (n) -> { currentObject.setPendingRestartDeviceCount(n.getIntegerValue()); });
            this.put("pendingSignatureUpdateDeviceCount", (n) -> { currentObject.setPendingSignatureUpdateDeviceCount(n.getIntegerValue()); });
            this.put("totalReportedDeviceCount", (n) -> { currentObject.setTotalReportedDeviceCount(n.getIntegerValue()); });
            this.put("unknownStateThreatAgentDeviceCount", (n) -> { currentObject.setUnknownStateThreatAgentDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the inactiveThreatAgentDeviceCount property value. Device with inactive threat agent count
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInactiveThreatAgentDeviceCount() {
        return this._inactiveThreatAgentDeviceCount;
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
     * Gets the pendingFullScanDeviceCount property value. Pending full scan device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingFullScanDeviceCount() {
        return this._pendingFullScanDeviceCount;
    }
    /**
     * Gets the pendingManualStepsDeviceCount property value. Pending manual steps device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingManualStepsDeviceCount() {
        return this._pendingManualStepsDeviceCount;
    }
    /**
     * Gets the pendingOfflineScanDeviceCount property value. Pending offline scan device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingOfflineScanDeviceCount() {
        return this._pendingOfflineScanDeviceCount;
    }
    /**
     * Gets the pendingQuickScanDeviceCount property value. Pending quick scan device count. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingQuickScanDeviceCount() {
        return this._pendingQuickScanDeviceCount;
    }
    /**
     * Gets the pendingRestartDeviceCount property value. Pending restart device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingRestartDeviceCount() {
        return this._pendingRestartDeviceCount;
    }
    /**
     * Gets the pendingSignatureUpdateDeviceCount property value. Device with old signature count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingSignatureUpdateDeviceCount() {
        return this._pendingSignatureUpdateDeviceCount;
    }
    /**
     * Gets the totalReportedDeviceCount property value. Total device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalReportedDeviceCount() {
        return this._totalReportedDeviceCount;
    }
    /**
     * Gets the unknownStateThreatAgentDeviceCount property value. Device with threat agent state as unknown count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownStateThreatAgentDeviceCount() {
        return this._unknownStateThreatAgentDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("cleanDeviceCount", this.getCleanDeviceCount());
        writer.writeIntegerValue("criticalFailuresDeviceCount", this.getCriticalFailuresDeviceCount());
        writer.writeIntegerValue("inactiveThreatAgentDeviceCount", this.getInactiveThreatAgentDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingFullScanDeviceCount", this.getPendingFullScanDeviceCount());
        writer.writeIntegerValue("pendingManualStepsDeviceCount", this.getPendingManualStepsDeviceCount());
        writer.writeIntegerValue("pendingOfflineScanDeviceCount", this.getPendingOfflineScanDeviceCount());
        writer.writeIntegerValue("pendingQuickScanDeviceCount", this.getPendingQuickScanDeviceCount());
        writer.writeIntegerValue("pendingRestartDeviceCount", this.getPendingRestartDeviceCount());
        writer.writeIntegerValue("pendingSignatureUpdateDeviceCount", this.getPendingSignatureUpdateDeviceCount());
        writer.writeIntegerValue("totalReportedDeviceCount", this.getTotalReportedDeviceCount());
        writer.writeIntegerValue("unknownStateThreatAgentDeviceCount", this.getUnknownStateThreatAgentDeviceCount());
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
     * Sets the cleanDeviceCount property value. Clean device count.
     * @param value Value to set for the cleanDeviceCount property.
     * @return a void
     */
    public void setCleanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._cleanDeviceCount = value;
    }
    /**
     * Sets the criticalFailuresDeviceCount property value. Critical failures device count.
     * @param value Value to set for the criticalFailuresDeviceCount property.
     * @return a void
     */
    public void setCriticalFailuresDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._criticalFailuresDeviceCount = value;
    }
    /**
     * Sets the inactiveThreatAgentDeviceCount property value. Device with inactive threat agent count
     * @param value Value to set for the inactiveThreatAgentDeviceCount property.
     * @return a void
     */
    public void setInactiveThreatAgentDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._inactiveThreatAgentDeviceCount = value;
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
     * Sets the pendingFullScanDeviceCount property value. Pending full scan device count.
     * @param value Value to set for the pendingFullScanDeviceCount property.
     * @return a void
     */
    public void setPendingFullScanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingFullScanDeviceCount = value;
    }
    /**
     * Sets the pendingManualStepsDeviceCount property value. Pending manual steps device count.
     * @param value Value to set for the pendingManualStepsDeviceCount property.
     * @return a void
     */
    public void setPendingManualStepsDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingManualStepsDeviceCount = value;
    }
    /**
     * Sets the pendingOfflineScanDeviceCount property value. Pending offline scan device count.
     * @param value Value to set for the pendingOfflineScanDeviceCount property.
     * @return a void
     */
    public void setPendingOfflineScanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingOfflineScanDeviceCount = value;
    }
    /**
     * Sets the pendingQuickScanDeviceCount property value. Pending quick scan device count. Valid values -2147483648 to 2147483647
     * @param value Value to set for the pendingQuickScanDeviceCount property.
     * @return a void
     */
    public void setPendingQuickScanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingQuickScanDeviceCount = value;
    }
    /**
     * Sets the pendingRestartDeviceCount property value. Pending restart device count.
     * @param value Value to set for the pendingRestartDeviceCount property.
     * @return a void
     */
    public void setPendingRestartDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingRestartDeviceCount = value;
    }
    /**
     * Sets the pendingSignatureUpdateDeviceCount property value. Device with old signature count.
     * @param value Value to set for the pendingSignatureUpdateDeviceCount property.
     * @return a void
     */
    public void setPendingSignatureUpdateDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingSignatureUpdateDeviceCount = value;
    }
    /**
     * Sets the totalReportedDeviceCount property value. Total device count.
     * @param value Value to set for the totalReportedDeviceCount property.
     * @return a void
     */
    public void setTotalReportedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._totalReportedDeviceCount = value;
    }
    /**
     * Sets the unknownStateThreatAgentDeviceCount property value. Device with threat agent state as unknown count.
     * @param value Value to set for the unknownStateThreatAgentDeviceCount property.
     * @return a void
     */
    public void setUnknownStateThreatAgentDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownStateThreatAgentDeviceCount = value;
    }
}

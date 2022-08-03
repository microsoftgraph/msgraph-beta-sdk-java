package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptRunSummary extends Entity implements Parsable {
    /** Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647 */
    private Integer _detectionScriptErrorDeviceCount;
    /** Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647 */
    private Integer _detectionScriptPendingDeviceCount;
    /** Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647 */
    private Integer _issueDetectedDeviceCount;
    /** Last run time for the script across all devices */
    private OffsetDateTime _lastScriptRunDateTime;
    /** Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647 */
    private Integer _noIssueDetectedDeviceCount;
    /**
     * Instantiates a new deviceComplianceScriptRunSummary and sets the default values.
     * @return a void
     */
    public DeviceComplianceScriptRunSummary() {
        super();
        this.setOdataType("#microsoft.graph.deviceComplianceScriptRunSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptRunSummary
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptRunSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRunSummary();
    }
    /**
     * Gets the detectionScriptErrorDeviceCount property value. Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDetectionScriptErrorDeviceCount() {
        return this._detectionScriptErrorDeviceCount;
    }
    /**
     * Gets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDetectionScriptPendingDeviceCount() {
        return this._detectionScriptPendingDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceScriptRunSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("detectionScriptErrorDeviceCount", (n) -> { currentObject.setDetectionScriptErrorDeviceCount(n.getIntegerValue()); });
            this.put("detectionScriptPendingDeviceCount", (n) -> { currentObject.setDetectionScriptPendingDeviceCount(n.getIntegerValue()); });
            this.put("issueDetectedDeviceCount", (n) -> { currentObject.setIssueDetectedDeviceCount(n.getIntegerValue()); });
            this.put("lastScriptRunDateTime", (n) -> { currentObject.setLastScriptRunDateTime(n.getOffsetDateTimeValue()); });
            this.put("noIssueDetectedDeviceCount", (n) -> { currentObject.setNoIssueDetectedDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIssueDetectedDeviceCount() {
        return this._issueDetectedDeviceCount;
    }
    /**
     * Gets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastScriptRunDateTime() {
        return this._lastScriptRunDateTime;
    }
    /**
     * Gets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNoIssueDetectedDeviceCount() {
        return this._noIssueDetectedDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("detectionScriptErrorDeviceCount", this.getDetectionScriptErrorDeviceCount());
        writer.writeIntegerValue("detectionScriptPendingDeviceCount", this.getDetectionScriptPendingDeviceCount());
        writer.writeIntegerValue("issueDetectedDeviceCount", this.getIssueDetectedDeviceCount());
        writer.writeOffsetDateTimeValue("lastScriptRunDateTime", this.getLastScriptRunDateTime());
        writer.writeIntegerValue("noIssueDetectedDeviceCount", this.getNoIssueDetectedDeviceCount());
    }
    /**
     * Sets the detectionScriptErrorDeviceCount property value. Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647
     * @param value Value to set for the detectionScriptErrorDeviceCount property.
     * @return a void
     */
    public void setDetectionScriptErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._detectionScriptErrorDeviceCount = value;
    }
    /**
     * Sets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     * @param value Value to set for the detectionScriptPendingDeviceCount property.
     * @return a void
     */
    public void setDetectionScriptPendingDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._detectionScriptPendingDeviceCount = value;
    }
    /**
     * Sets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     * @param value Value to set for the issueDetectedDeviceCount property.
     * @return a void
     */
    public void setIssueDetectedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._issueDetectedDeviceCount = value;
    }
    /**
     * Sets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @param value Value to set for the lastScriptRunDateTime property.
     * @return a void
     */
    public void setLastScriptRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastScriptRunDateTime = value;
    }
    /**
     * Sets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     * @param value Value to set for the noIssueDetectedDeviceCount property.
     * @return a void
     */
    public void setNoIssueDetectedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._noIssueDetectedDeviceCount = value;
    }
}

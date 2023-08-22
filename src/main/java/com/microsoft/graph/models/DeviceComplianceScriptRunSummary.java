package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the run summary of a device management script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceScriptRunSummary extends Entity implements Parsable {
    /**
     * Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647
     */
    private Integer detectionScriptErrorDeviceCount;
    /**
     * Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     */
    private Integer detectionScriptPendingDeviceCount;
    /**
     * Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     */
    private Integer issueDetectedDeviceCount;
    /**
     * Last run time for the script across all devices
     */
    private OffsetDateTime lastScriptRunDateTime;
    /**
     * Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     */
    private Integer noIssueDetectedDeviceCount;
    /**
     * Instantiates a new deviceComplianceScriptRunSummary and sets the default values.
     */
    public DeviceComplianceScriptRunSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptRunSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScriptRunSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRunSummary();
    }
    /**
     * Gets the detectionScriptErrorDeviceCount property value. Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDetectionScriptErrorDeviceCount() {
        return this.detectionScriptErrorDeviceCount;
    }
    /**
     * Gets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDetectionScriptPendingDeviceCount() {
        return this.detectionScriptPendingDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionScriptErrorDeviceCount", (n) -> { this.setDetectionScriptErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("detectionScriptPendingDeviceCount", (n) -> { this.setDetectionScriptPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("issueDetectedDeviceCount", (n) -> { this.setIssueDetectedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("lastScriptRunDateTime", (n) -> { this.setLastScriptRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("noIssueDetectedDeviceCount", (n) -> { this.setNoIssueDetectedDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getIssueDetectedDeviceCount() {
        return this.issueDetectedDeviceCount;
    }
    /**
     * Gets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastScriptRunDateTime() {
        return this.lastScriptRunDateTime;
    }
    /**
     * Gets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNoIssueDetectedDeviceCount() {
        return this.noIssueDetectedDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDetectionScriptErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.detectionScriptErrorDeviceCount = value;
    }
    /**
     * Sets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     * @param value Value to set for the detectionScriptPendingDeviceCount property.
     */
    public void setDetectionScriptPendingDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.detectionScriptPendingDeviceCount = value;
    }
    /**
     * Sets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     * @param value Value to set for the issueDetectedDeviceCount property.
     */
    public void setIssueDetectedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.issueDetectedDeviceCount = value;
    }
    /**
     * Sets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @param value Value to set for the lastScriptRunDateTime property.
     */
    public void setLastScriptRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastScriptRunDateTime = value;
    }
    /**
     * Sets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     * @param value Value to set for the noIssueDetectedDeviceCount property.
     */
    public void setNoIssueDetectedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.noIssueDetectedDeviceCount = value;
    }
}

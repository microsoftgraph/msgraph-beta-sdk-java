package com.microsoft.graph.beta.models;

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
public class DeviceHealthScriptRunSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceHealthScriptRunSummary} and sets the default values.
     */
    public DeviceHealthScriptRunSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceHealthScriptRunSummary}
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptRunSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRunSummary();
    }
    /**
     * Gets the detectionScriptErrorDeviceCount property value. Number of devices on which the detection script execution encountered an error and did not complete
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDetectionScriptErrorDeviceCount() {
        return this.backingStore.get("detectionScriptErrorDeviceCount");
    }
    /**
     * Gets the detectionScriptNotApplicableDeviceCount property value. Number of devices for which the detection script was not applicable
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDetectionScriptNotApplicableDeviceCount() {
        return this.backingStore.get("detectionScriptNotApplicableDeviceCount");
    }
    /**
     * Gets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device health script
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDetectionScriptPendingDeviceCount() {
        return this.backingStore.get("detectionScriptPendingDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionScriptErrorDeviceCount", (n) -> { this.setDetectionScriptErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("detectionScriptNotApplicableDeviceCount", (n) -> { this.setDetectionScriptNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("detectionScriptPendingDeviceCount", (n) -> { this.setDetectionScriptPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("issueDetectedDeviceCount", (n) -> { this.setIssueDetectedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("issueRemediatedCumulativeDeviceCount", (n) -> { this.setIssueRemediatedCumulativeDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("issueRemediatedDeviceCount", (n) -> { this.setIssueRemediatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("issueReoccurredDeviceCount", (n) -> { this.setIssueReoccurredDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("lastScriptRunDateTime", (n) -> { this.setLastScriptRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("noIssueDetectedDeviceCount", (n) -> { this.setNoIssueDetectedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediationScriptErrorDeviceCount", (n) -> { this.setRemediationScriptErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediationSkippedDeviceCount", (n) -> { this.setRemediationSkippedDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIssueDetectedDeviceCount() {
        return this.backingStore.get("issueDetectedDeviceCount");
    }
    /**
     * Gets the issueRemediatedCumulativeDeviceCount property value. Number of devices that were remediated over the last 30 days
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIssueRemediatedCumulativeDeviceCount() {
        return this.backingStore.get("issueRemediatedCumulativeDeviceCount");
    }
    /**
     * Gets the issueRemediatedDeviceCount property value. Number of devices for which the remediation script was able to resolve the detected issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIssueRemediatedDeviceCount() {
        return this.backingStore.get("issueRemediatedDeviceCount");
    }
    /**
     * Gets the issueReoccurredDeviceCount property value. Number of devices for which the remediation script executed successfully but failed to resolve the detected issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIssueReoccurredDeviceCount() {
        return this.backingStore.get("issueReoccurredDeviceCount");
    }
    /**
     * Gets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastScriptRunDateTime() {
        return this.backingStore.get("lastScriptRunDateTime");
    }
    /**
     * Gets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNoIssueDetectedDeviceCount() {
        return this.backingStore.get("noIssueDetectedDeviceCount");
    }
    /**
     * Gets the remediationScriptErrorDeviceCount property value. Number of devices for which the remediation script execution encountered an error and did not complete
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRemediationScriptErrorDeviceCount() {
        return this.backingStore.get("remediationScriptErrorDeviceCount");
    }
    /**
     * Gets the remediationSkippedDeviceCount property value. Number of devices for which remediation was skipped
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRemediationSkippedDeviceCount() {
        return this.backingStore.get("remediationSkippedDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("detectionScriptErrorDeviceCount", this.getDetectionScriptErrorDeviceCount());
        writer.writeIntegerValue("detectionScriptNotApplicableDeviceCount", this.getDetectionScriptNotApplicableDeviceCount());
        writer.writeIntegerValue("detectionScriptPendingDeviceCount", this.getDetectionScriptPendingDeviceCount());
        writer.writeIntegerValue("issueDetectedDeviceCount", this.getIssueDetectedDeviceCount());
        writer.writeIntegerValue("issueRemediatedCumulativeDeviceCount", this.getIssueRemediatedCumulativeDeviceCount());
        writer.writeIntegerValue("issueRemediatedDeviceCount", this.getIssueRemediatedDeviceCount());
        writer.writeIntegerValue("issueReoccurredDeviceCount", this.getIssueReoccurredDeviceCount());
        writer.writeOffsetDateTimeValue("lastScriptRunDateTime", this.getLastScriptRunDateTime());
        writer.writeIntegerValue("noIssueDetectedDeviceCount", this.getNoIssueDetectedDeviceCount());
        writer.writeIntegerValue("remediationScriptErrorDeviceCount", this.getRemediationScriptErrorDeviceCount());
        writer.writeIntegerValue("remediationSkippedDeviceCount", this.getRemediationSkippedDeviceCount());
    }
    /**
     * Sets the detectionScriptErrorDeviceCount property value. Number of devices on which the detection script execution encountered an error and did not complete
     * @param value Value to set for the detectionScriptErrorDeviceCount property.
     */
    public void setDetectionScriptErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("detectionScriptErrorDeviceCount", value);
    }
    /**
     * Sets the detectionScriptNotApplicableDeviceCount property value. Number of devices for which the detection script was not applicable
     * @param value Value to set for the detectionScriptNotApplicableDeviceCount property.
     */
    public void setDetectionScriptNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("detectionScriptNotApplicableDeviceCount", value);
    }
    /**
     * Sets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device health script
     * @param value Value to set for the detectionScriptPendingDeviceCount property.
     */
    public void setDetectionScriptPendingDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("detectionScriptPendingDeviceCount", value);
    }
    /**
     * Sets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue
     * @param value Value to set for the issueDetectedDeviceCount property.
     */
    public void setIssueDetectedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("issueDetectedDeviceCount", value);
    }
    /**
     * Sets the issueRemediatedCumulativeDeviceCount property value. Number of devices that were remediated over the last 30 days
     * @param value Value to set for the issueRemediatedCumulativeDeviceCount property.
     */
    public void setIssueRemediatedCumulativeDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("issueRemediatedCumulativeDeviceCount", value);
    }
    /**
     * Sets the issueRemediatedDeviceCount property value. Number of devices for which the remediation script was able to resolve the detected issue
     * @param value Value to set for the issueRemediatedDeviceCount property.
     */
    public void setIssueRemediatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("issueRemediatedDeviceCount", value);
    }
    /**
     * Sets the issueReoccurredDeviceCount property value. Number of devices for which the remediation script executed successfully but failed to resolve the detected issue
     * @param value Value to set for the issueReoccurredDeviceCount property.
     */
    public void setIssueReoccurredDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("issueReoccurredDeviceCount", value);
    }
    /**
     * Sets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @param value Value to set for the lastScriptRunDateTime property.
     */
    public void setLastScriptRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastScriptRunDateTime", value);
    }
    /**
     * Sets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy
     * @param value Value to set for the noIssueDetectedDeviceCount property.
     */
    public void setNoIssueDetectedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("noIssueDetectedDeviceCount", value);
    }
    /**
     * Sets the remediationScriptErrorDeviceCount property value. Number of devices for which the remediation script execution encountered an error and did not complete
     * @param value Value to set for the remediationScriptErrorDeviceCount property.
     */
    public void setRemediationScriptErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remediationScriptErrorDeviceCount", value);
    }
    /**
     * Sets the remediationSkippedDeviceCount property value. Number of devices for which remediation was skipped
     * @param value Value to set for the remediationSkippedDeviceCount property.
     */
    public void setRemediationSkippedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remediationSkippedDeviceCount", value);
    }
}

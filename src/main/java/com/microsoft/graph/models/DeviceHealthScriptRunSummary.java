package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptRunSummary extends Entity implements Parsable {
    /**
     * Number of devices on which the detection script execution encountered an error and did not complete
     */
    private Integer detectionScriptErrorDeviceCount;
    /**
     * Number of devices for which the detection script was not applicable
     */
    private Integer detectionScriptNotApplicableDeviceCount;
    /**
     * Number of devices which have not yet run the latest version of the device health script
     */
    private Integer detectionScriptPendingDeviceCount;
    /**
     * Number of devices for which the detection script found an issue
     */
    private Integer issueDetectedDeviceCount;
    /**
     * Number of devices that were remediated over the last 30 days
     */
    private Integer issueRemediatedCumulativeDeviceCount;
    /**
     * Number of devices for which the remediation script was able to resolve the detected issue
     */
    private Integer issueRemediatedDeviceCount;
    /**
     * Number of devices for which the remediation script executed successfully but failed to resolve the detected issue
     */
    private Integer issueReoccurredDeviceCount;
    /**
     * Last run time for the script across all devices
     */
    private OffsetDateTime lastScriptRunDateTime;
    /**
     * Number of devices for which the detection script did not find an issue and the device is healthy
     */
    private Integer noIssueDetectedDeviceCount;
    /**
     * Number of devices for which the remediation script execution encountered an error and did not complete
     */
    private Integer remediationScriptErrorDeviceCount;
    /**
     * Number of devices for which remediation was skipped
     */
    private Integer remediationSkippedDeviceCount;
    /**
     * Instantiates a new deviceHealthScriptRunSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptRunSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptRunSummary
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRunSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRunSummary();
    }
    /**
     * Gets the detectionScriptErrorDeviceCount property value. Number of devices on which the detection script execution encountered an error and did not complete
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDetectionScriptErrorDeviceCount() {
        return this.detectionScriptErrorDeviceCount;
    }
    /**
     * Gets the detectionScriptNotApplicableDeviceCount property value. Number of devices for which the detection script was not applicable
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDetectionScriptNotApplicableDeviceCount() {
        return this.detectionScriptNotApplicableDeviceCount;
    }
    /**
     * Gets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device health script
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDetectionScriptPendingDeviceCount() {
        return this.detectionScriptPendingDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIssueDetectedDeviceCount() {
        return this.issueDetectedDeviceCount;
    }
    /**
     * Gets the issueRemediatedCumulativeDeviceCount property value. Number of devices that were remediated over the last 30 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIssueRemediatedCumulativeDeviceCount() {
        return this.issueRemediatedCumulativeDeviceCount;
    }
    /**
     * Gets the issueRemediatedDeviceCount property value. Number of devices for which the remediation script was able to resolve the detected issue
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIssueRemediatedDeviceCount() {
        return this.issueRemediatedDeviceCount;
    }
    /**
     * Gets the issueReoccurredDeviceCount property value. Number of devices for which the remediation script executed successfully but failed to resolve the detected issue
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIssueReoccurredDeviceCount() {
        return this.issueReoccurredDeviceCount;
    }
    /**
     * Gets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastScriptRunDateTime() {
        return this.lastScriptRunDateTime;
    }
    /**
     * Gets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNoIssueDetectedDeviceCount() {
        return this.noIssueDetectedDeviceCount;
    }
    /**
     * Gets the remediationScriptErrorDeviceCount property value. Number of devices for which the remediation script execution encountered an error and did not complete
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediationScriptErrorDeviceCount() {
        return this.remediationScriptErrorDeviceCount;
    }
    /**
     * Gets the remediationSkippedDeviceCount property value. Number of devices for which remediation was skipped
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediationSkippedDeviceCount() {
        return this.remediationSkippedDeviceCount;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionScriptErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.detectionScriptErrorDeviceCount = value;
    }
    /**
     * Sets the detectionScriptNotApplicableDeviceCount property value. Number of devices for which the detection script was not applicable
     * @param value Value to set for the detectionScriptNotApplicableDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionScriptNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.detectionScriptNotApplicableDeviceCount = value;
    }
    /**
     * Sets the detectionScriptPendingDeviceCount property value. Number of devices which have not yet run the latest version of the device health script
     * @param value Value to set for the detectionScriptPendingDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionScriptPendingDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.detectionScriptPendingDeviceCount = value;
    }
    /**
     * Sets the issueDetectedDeviceCount property value. Number of devices for which the detection script found an issue
     * @param value Value to set for the issueDetectedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueDetectedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.issueDetectedDeviceCount = value;
    }
    /**
     * Sets the issueRemediatedCumulativeDeviceCount property value. Number of devices that were remediated over the last 30 days
     * @param value Value to set for the issueRemediatedCumulativeDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueRemediatedCumulativeDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.issueRemediatedCumulativeDeviceCount = value;
    }
    /**
     * Sets the issueRemediatedDeviceCount property value. Number of devices for which the remediation script was able to resolve the detected issue
     * @param value Value to set for the issueRemediatedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.issueRemediatedDeviceCount = value;
    }
    /**
     * Sets the issueReoccurredDeviceCount property value. Number of devices for which the remediation script executed successfully but failed to resolve the detected issue
     * @param value Value to set for the issueReoccurredDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueReoccurredDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.issueReoccurredDeviceCount = value;
    }
    /**
     * Sets the lastScriptRunDateTime property value. Last run time for the script across all devices
     * @param value Value to set for the lastScriptRunDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastScriptRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastScriptRunDateTime = value;
    }
    /**
     * Sets the noIssueDetectedDeviceCount property value. Number of devices for which the detection script did not find an issue and the device is healthy
     * @param value Value to set for the noIssueDetectedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNoIssueDetectedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.noIssueDetectedDeviceCount = value;
    }
    /**
     * Sets the remediationScriptErrorDeviceCount property value. Number of devices for which the remediation script execution encountered an error and did not complete
     * @param value Value to set for the remediationScriptErrorDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationScriptErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.remediationScriptErrorDeviceCount = value;
    }
    /**
     * Sets the remediationSkippedDeviceCount property value. Number of devices for which remediation was skipped
     * @param value Value to set for the remediationSkippedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationSkippedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.remediationSkippedDeviceCount = value;
    }
}

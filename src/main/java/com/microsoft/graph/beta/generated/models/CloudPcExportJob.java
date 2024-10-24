package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcExportJob extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcExportJob} and sets the default values.
     */
    public CloudPcExportJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcExportJob}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExportJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExportJob();
    }
    /**
     * Gets the expirationDateTime property value. The date and time when the export job expires.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * Gets the exportJobStatus property value. The status of the export job. The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     * @return a {@link CloudPcExportJobStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcExportJobStatus getExportJobStatus() {
        return this.backingStore.get("exportJobStatus");
    }
    /**
     * Gets the exportUrl property value. The storage account URL of the exported report. It can be used to download the file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExportUrl() {
        return this.backingStore.get("exportUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("exportJobStatus", (n) -> { this.setExportJobStatus(n.getEnumValue(CloudPcExportJobStatus::forValue)); });
        deserializerMap.put("exportUrl", (n) -> { this.setExportUrl(n.getStringValue()); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("reportName", (n) -> { this.setReportName(n.getEnumValue(CloudPcReportName::forValue)); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. The filter applied on the report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilter() {
        return this.backingStore.get("filter");
    }
    /**
     * Gets the format property value. The format of the exported report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the reportName property value. The report name. The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, sharedUseLicenseUsageReport, sharedUseLicenseUsageRealTimeReport, unknownFutureValue,  noLicenseAvailableConnectivityFailureReport, frontlineLicenseUsageReport, frontlineLicenseUsageRealTimeReport,  remoteConnectionQualityReports, inaccessibleCloudPcReports, actionStatusReport, rawRemoteConnectionReports, cloudPcUsageCategoryReports, crossRegionDisasterRecoveryReport, regionalConnectionQualityTrendReport, regionalConnectionQualityInsightsReport, remoteConnectionQualityReport, bulkActionStatusReport. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: noLicenseAvailableConnectivityFailureReport, frontlineLicenseUsageReport, frontlineLicenseUsageRealTimeReport, remoteConnectionQualityReports, inaccessibleCloudPcReports, rawRemoteConnectionReports, cloudPcUsageCategoryReports, crossRegionDisasterRecoveryReport.
     * @return a {@link CloudPcReportName}
     */
    @jakarta.annotation.Nullable
    public CloudPcReportName getReportName() {
        return this.backingStore.get("reportName");
    }
    /**
     * Gets the requestDateTime property value. The date and time when the export job was requested.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.backingStore.get("requestDateTime");
    }
    /**
     * Gets the select property value. The selected columns of the report.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.backingStore.get("select");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeEnumValue("exportJobStatus", this.getExportJobStatus());
        writer.writeStringValue("exportUrl", this.getExportUrl());
        writer.writeStringValue("filter", this.getFilter());
        writer.writeStringValue("format", this.getFormat());
        writer.writeEnumValue("reportName", this.getReportName());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
    }
    /**
     * Sets the expirationDateTime property value. The date and time when the export job expires.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the exportJobStatus property value. The status of the export job. The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     * @param value Value to set for the exportJobStatus property.
     */
    public void setExportJobStatus(@jakarta.annotation.Nullable final CloudPcExportJobStatus value) {
        this.backingStore.set("exportJobStatus", value);
    }
    /**
     * Sets the exportUrl property value. The storage account URL of the exported report. It can be used to download the file.
     * @param value Value to set for the exportUrl property.
     */
    public void setExportUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("exportUrl", value);
    }
    /**
     * Sets the filter property value. The filter applied on the report.
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filter", value);
    }
    /**
     * Sets the format property value. The format of the exported report.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the reportName property value. The report name. The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, sharedUseLicenseUsageReport, sharedUseLicenseUsageRealTimeReport, unknownFutureValue,  noLicenseAvailableConnectivityFailureReport, frontlineLicenseUsageReport, frontlineLicenseUsageRealTimeReport,  remoteConnectionQualityReports, inaccessibleCloudPcReports, actionStatusReport, rawRemoteConnectionReports, cloudPcUsageCategoryReports, crossRegionDisasterRecoveryReport, regionalConnectionQualityTrendReport, regionalConnectionQualityInsightsReport, remoteConnectionQualityReport, bulkActionStatusReport. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: noLicenseAvailableConnectivityFailureReport, frontlineLicenseUsageReport, frontlineLicenseUsageRealTimeReport, remoteConnectionQualityReports, inaccessibleCloudPcReports, rawRemoteConnectionReports, cloudPcUsageCategoryReports, crossRegionDisasterRecoveryReport.
     * @param value Value to set for the reportName property.
     */
    public void setReportName(@jakarta.annotation.Nullable final CloudPcReportName value) {
        this.backingStore.set("reportName", value);
    }
    /**
     * Sets the requestDateTime property value. The date and time when the export job was requested.
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestDateTime", value);
    }
    /**
     * Sets the select property value. The selected columns of the report.
     * @param value Value to set for the select property.
     */
    public void setSelect(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("select", value);
    }
}

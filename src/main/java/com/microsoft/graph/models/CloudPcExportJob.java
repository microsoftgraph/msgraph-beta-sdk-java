package com.microsoft.graph.models;

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
     * The date and time when the export job expires.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The status of the export job. The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     */
    private CloudPcExportJobStatus exportJobStatus;
    /**
     * The storage account URL of the exported report. It can be used to download the file.
     */
    private String exportUrl;
    /**
     * The filter applied on the report.
     */
    private String filter;
    /**
     * The format of the exported report.
     */
    private String format;
    /**
     * The report name. The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, sharedUseLicenseUsageReport, sharedUseLicenseUsageRealTimeReport, unknownFutureValue,  noLicenseAvailableConnectivityFailureReport. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: noLicenseAvailableConnectivityFailureReport.
     */
    private CloudPcReportName reportName;
    /**
     * The date and time when the export job was requested.
     */
    private OffsetDateTime requestDateTime;
    /**
     * The selected columns of the report.
     */
    private java.util.List<String> select;
    /**
     * Instantiates a new cloudPcExportJob and sets the default values.
     */
    public CloudPcExportJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcExportJob
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExportJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExportJob();
    }
    /**
     * Gets the expirationDateTime property value. The date and time when the export job expires.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * Gets the exportJobStatus property value. The status of the export job. The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     * @return a cloudPcExportJobStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcExportJobStatus getExportJobStatus() {
        return this.exportJobStatus;
    }
    /**
     * Gets the exportUrl property value. The storage account URL of the exported report. It can be used to download the file.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExportUrl() {
        return this.exportUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("exportJobStatus", (n) -> { this.setExportJobStatus(n.getEnumValue(CloudPcExportJobStatus.class)); });
        deserializerMap.put("exportUrl", (n) -> { this.setExportUrl(n.getStringValue()); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("reportName", (n) -> { this.setReportName(n.getEnumValue(CloudPcReportName.class)); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. The filter applied on the report.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFilter() {
        return this.filter;
    }
    /**
     * Gets the format property value. The format of the exported report.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
    }
    /**
     * Gets the reportName property value. The report name. The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, sharedUseLicenseUsageReport, sharedUseLicenseUsageRealTimeReport, unknownFutureValue,  noLicenseAvailableConnectivityFailureReport. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: noLicenseAvailableConnectivityFailureReport.
     * @return a cloudPcReportName
     */
    @jakarta.annotation.Nullable
    public CloudPcReportName getReportName() {
        return this.reportName;
    }
    /**
     * Gets the requestDateTime property value. The date and time when the export job was requested.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.requestDateTime;
    }
    /**
     * Gets the select property value. The selected columns of the report.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.select;
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
        this.expirationDateTime = value;
    }
    /**
     * Sets the exportJobStatus property value. The status of the export job. The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     * @param value Value to set for the exportJobStatus property.
     */
    public void setExportJobStatus(@jakarta.annotation.Nullable final CloudPcExportJobStatus value) {
        this.exportJobStatus = value;
    }
    /**
     * Sets the exportUrl property value. The storage account URL of the exported report. It can be used to download the file.
     * @param value Value to set for the exportUrl property.
     */
    public void setExportUrl(@jakarta.annotation.Nullable final String value) {
        this.exportUrl = value;
    }
    /**
     * Sets the filter property value. The filter applied on the report.
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final String value) {
        this.filter = value;
    }
    /**
     * Sets the format property value. The format of the exported report.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the reportName property value. The report name. The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, sharedUseLicenseUsageReport, sharedUseLicenseUsageRealTimeReport, unknownFutureValue,  noLicenseAvailableConnectivityFailureReport. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: noLicenseAvailableConnectivityFailureReport.
     * @param value Value to set for the reportName property.
     */
    public void setReportName(@jakarta.annotation.Nullable final CloudPcReportName value) {
        this.reportName = value;
    }
    /**
     * Sets the requestDateTime property value. The date and time when the export job was requested.
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.requestDateTime = value;
    }
    /**
     * Sets the select property value. The selected columns of the report.
     * @param value Value to set for the select property.
     */
    public void setSelect(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.select = value;
    }
}

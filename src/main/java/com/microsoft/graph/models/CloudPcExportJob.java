package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcExportJob extends Entity implements Parsable {
    /** The date time when the export job expires. */
    private OffsetDateTime _expirationDateTime;
    /** The status of the export job.The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only. */
    private CloudPcExportJobStatus _exportJobStatus;
    /** The storage account url of the exported report, it can be used to download the file. */
    private String _exportUrl;
    /** The filter applied on the report. */
    private String _filter;
    /** The format of the exported report. */
    private String _format;
    /** The report name.The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, unknownFutureValue. */
    private CloudPcReportName _reportName;
    /** The date time when the export job was requested. */
    private OffsetDateTime _requestDateTime;
    /** The selected columns of the report. */
    private java.util.List<String> _select;
    /**
     * Instantiates a new CloudPcExportJob and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcExportJob() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcExportJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcExportJob
     */
    @javax.annotation.Nonnull
    public static CloudPcExportJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExportJob();
    }
    /**
     * Gets the expirationDateTime property value. The date time when the export job expires.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * Gets the exportJobStatus property value. The status of the export job.The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     * @return a cloudPcExportJobStatus
     */
    @javax.annotation.Nullable
    public CloudPcExportJobStatus getExportJobStatus() {
        return this._exportJobStatus;
    }
    /**
     * Gets the exportUrl property value. The storage account url of the exported report, it can be used to download the file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExportUrl() {
        return this._exportUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcExportJob currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("exportJobStatus", (n) -> { currentObject.setExportJobStatus(n.getEnumValue(CloudPcExportJobStatus.class)); });
        deserializerMap.put("exportUrl", (n) -> { currentObject.setExportUrl(n.getStringValue()); });
        deserializerMap.put("filter", (n) -> { currentObject.setFilter(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { currentObject.setFormat(n.getStringValue()); });
        deserializerMap.put("reportName", (n) -> { currentObject.setReportName(n.getEnumValue(CloudPcReportName.class)); });
        deserializerMap.put("requestDateTime", (n) -> { currentObject.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("select", (n) -> { currentObject.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap
    }
    /**
     * Gets the filter property value. The filter applied on the report.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilter() {
        return this._filter;
    }
    /**
     * Gets the format property value. The format of the exported report.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormat() {
        return this._format;
    }
    /**
     * Gets the reportName property value. The report name.The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, unknownFutureValue.
     * @return a cloudPcReportName
     */
    @javax.annotation.Nullable
    public CloudPcReportName getReportName() {
        return this._reportName;
    }
    /**
     * Gets the requestDateTime property value. The date time when the export job was requested.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this._requestDateTime;
    }
    /**
     * Gets the select property value. The selected columns of the report.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this._select;
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
     * Sets the expirationDateTime property value. The date time when the export job expires.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the exportJobStatus property value. The status of the export job.The possible values are: notStarted, inProgress, completed, unknownFutureValue. Read-only.
     * @param value Value to set for the exportJobStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportJobStatus(@javax.annotation.Nullable final CloudPcExportJobStatus value) {
        this._exportJobStatus = value;
    }
    /**
     * Sets the exportUrl property value. The storage account url of the exported report, it can be used to download the file.
     * @param value Value to set for the exportUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportUrl(@javax.annotation.Nullable final String value) {
        this._exportUrl = value;
    }
    /**
     * Sets the filter property value. The filter applied on the report.
     * @param value Value to set for the filter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilter(@javax.annotation.Nullable final String value) {
        this._filter = value;
    }
    /**
     * Sets the format property value. The format of the exported report.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final String value) {
        this._format = value;
    }
    /**
     * Sets the reportName property value. The report name.The possible values are: remoteConnectionHistoricalReports, dailyAggregatedRemoteConnectionReports, totalAggregatedRemoteConnectionReports, unknownFutureValue.
     * @param value Value to set for the reportName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportName(@javax.annotation.Nullable final CloudPcReportName value) {
        this._reportName = value;
    }
    /**
     * Sets the requestDateTime property value. The date time when the export job was requested.
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestDateTime = value;
    }
    /**
     * Sets the select property value. The selected columns of the report.
     * @param value Value to set for the select property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelect(@javax.annotation.Nullable final java.util.List<String> value) {
        this._select = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing the configuration of a cached report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementCachedReportConfiguration extends Entity implements Parsable {
    /**
     * Time that the cached report expires. This property is read-only.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Filters applied on report creation.
     */
    private String filter;
    /**
     * Time that the cached report was last refreshed. This property is read-only.
     */
    private OffsetDateTime lastRefreshDateTime;
    /**
     * Caller-managed metadata associated with the report
     */
    private String metadata;
    /**
     * Ordering of columns in the report
     */
    private java.util.List<String> orderBy;
    /**
     * Name of the report. This property is read-only.
     */
    private String reportName;
    /**
     * Columns selected from the report
     */
    private java.util.List<String> select;
    /**
     * Possible statuses associated with a generated report
     */
    private DeviceManagementReportStatus status;
    /**
     * Instantiates a new DeviceManagementCachedReportConfiguration and sets the default values.
     */
    public DeviceManagementCachedReportConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementCachedReportConfiguration
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementCachedReportConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementCachedReportConfiguration();
    }
    /**
     * Gets the expirationDateTime property value. Time that the cached report expires. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("lastRefreshDateTime", (n) -> { this.setLastRefreshDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getStringValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("reportName", (n) -> { this.setReportName(n.getStringValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceManagementReportStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. Filters applied on report creation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilter() {
        return this.filter;
    }
    /**
     * Gets the lastRefreshDateTime property value. Time that the cached report was last refreshed. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshDateTime() {
        return this.lastRefreshDateTime;
    }
    /**
     * Gets the metadata property value. Caller-managed metadata associated with the report
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the orderBy property value. Ordering of columns in the report
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }
    /**
     * Gets the reportName property value. Name of the report. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReportName() {
        return this.reportName;
    }
    /**
     * Gets the select property value. Columns selected from the report
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.select;
    }
    /**
     * Gets the status property value. Possible statuses associated with a generated report
     * @return a DeviceManagementReportStatus
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReportStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("filter", this.getFilter());
        writer.writeOffsetDateTimeValue("lastRefreshDateTime", this.getLastRefreshDateTime());
        writer.writeStringValue("metadata", this.getMetadata());
        writer.writeCollectionOfPrimitiveValues("orderBy", this.getOrderBy());
        writer.writeStringValue("reportName", this.getReportName());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the expirationDateTime property value. Time that the cached report expires. This property is read-only.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the filter property value. Filters applied on report creation.
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final String value) {
        this.filter = value;
    }
    /**
     * Sets the lastRefreshDateTime property value. Time that the cached report was last refreshed. This property is read-only.
     * @param value Value to set for the lastRefreshDateTime property.
     */
    public void setLastRefreshDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshDateTime = value;
    }
    /**
     * Sets the metadata property value. Caller-managed metadata associated with the report
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final String value) {
        this.metadata = value;
    }
    /**
     * Sets the orderBy property value. Ordering of columns in the report
     * @param value Value to set for the orderBy property.
     */
    public void setOrderBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.orderBy = value;
    }
    /**
     * Sets the reportName property value. Name of the report. This property is read-only.
     * @param value Value to set for the reportName property.
     */
    public void setReportName(@jakarta.annotation.Nullable final String value) {
        this.reportName = value;
    }
    /**
     * Sets the select property value. Columns selected from the report
     * @param value Value to set for the select property.
     */
    public void setSelect(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.select = value;
    }
    /**
     * Sets the status property value. Possible statuses associated with a generated report
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DeviceManagementReportStatus value) {
        this.status = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementCachedReportConfiguration extends Entity implements Parsable {
    /** Time that the cached report expires  */
    private OffsetDateTime _expirationDateTime;
    /** Filters applied on report creation.  */
    private String _filter;
    /** Time that the cached report was last refreshed  */
    private OffsetDateTime _lastRefreshDateTime;
    /** Caller-managed metadata associated with the report  */
    private String _metadata;
    /** Ordering of columns in the report  */
    private java.util.List<String> _orderBy;
    /** Name of the report  */
    private String _reportName;
    /** Columns selected from the report  */
    private java.util.List<String> _select;
    /** Status of the cached report. Possible values are: unknown, notStarted, inProgress, completed, failed.  */
    private DeviceManagementReportStatus _status;
    /**
     * Instantiates a new deviceManagementCachedReportConfiguration and sets the default values.
     * @return a void
     */
    public DeviceManagementCachedReportConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementCachedReportConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceManagementCachedReportConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementCachedReportConfiguration();
    }
    /**
     * Gets the expirationDateTime property value. Time that the cached report expires
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementCachedReportConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("filter", (n) -> { currentObject.setFilter(n.getStringValue()); });
            this.put("lastRefreshDateTime", (n) -> { currentObject.setLastRefreshDateTime(n.getOffsetDateTimeValue()); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getStringValue()); });
            this.put("orderBy", (n) -> { currentObject.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("reportName", (n) -> { currentObject.setReportName(n.getStringValue()); });
            this.put("select", (n) -> { currentObject.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DeviceManagementReportStatus.class)); });
        }};
    }
    /**
     * Gets the filter property value. Filters applied on report creation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilter() {
        return this._filter;
    }
    /**
     * Gets the lastRefreshDateTime property value. Time that the cached report was last refreshed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshDateTime() {
        return this._lastRefreshDateTime;
    }
    /**
     * Gets the metadata property value. Caller-managed metadata associated with the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetadata() {
        return this._metadata;
    }
    /**
     * Gets the orderBy property value. Ordering of columns in the report
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this._orderBy;
    }
    /**
     * Gets the reportName property value. Name of the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportName() {
        return this._reportName;
    }
    /**
     * Gets the select property value. Columns selected from the report
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this._select;
    }
    /**
     * Gets the status property value. Status of the cached report. Possible values are: unknown, notStarted, inProgress, completed, failed.
     * @return a deviceManagementReportStatus
     */
    @javax.annotation.Nullable
    public DeviceManagementReportStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the expirationDateTime property value. Time that the cached report expires
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the filter property value. Filters applied on report creation.
     * @param value Value to set for the filter property.
     * @return a void
     */
    public void setFilter(@javax.annotation.Nullable final String value) {
        this._filter = value;
    }
    /**
     * Sets the lastRefreshDateTime property value. Time that the cached report was last refreshed
     * @param value Value to set for the lastRefreshDateTime property.
     * @return a void
     */
    public void setLastRefreshDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshDateTime = value;
    }
    /**
     * Sets the metadata property value. Caller-managed metadata associated with the report
     * @param value Value to set for the metadata property.
     * @return a void
     */
    public void setMetadata(@javax.annotation.Nullable final String value) {
        this._metadata = value;
    }
    /**
     * Sets the orderBy property value. Ordering of columns in the report
     * @param value Value to set for the orderBy property.
     * @return a void
     */
    public void setOrderBy(@javax.annotation.Nullable final java.util.List<String> value) {
        this._orderBy = value;
    }
    /**
     * Sets the reportName property value. Name of the report
     * @param value Value to set for the reportName property.
     * @return a void
     */
    public void setReportName(@javax.annotation.Nullable final String value) {
        this._reportName = value;
    }
    /**
     * Sets the select property value. Columns selected from the report
     * @param value Value to set for the select property.
     * @return a void
     */
    public void setSelect(@javax.annotation.Nullable final java.util.List<String> value) {
        this._select = value;
    }
    /**
     * Sets the status property value. Status of the cached report. Possible values are: unknown, notStarted, inProgress, completed, failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DeviceManagementReportStatus value) {
        this._status = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365GroupsActivityFileCounts extends Entity implements Parsable {
    /** The number of files that were viewed, edited, shared, or synced in the group's SharePoint document library. */
    private Long _active;
    /** The date on which a number of files were active in the group's SharePoint site. */
    private LocalDate _reportDate;
    /** The number of days the report covers. */
    private String _reportPeriod;
    /** The latest date of the content. */
    private LocalDate _reportRefreshDate;
    /** The total number of files in the group's SharePoint document library. */
    private Long _total;
    /**
     * Instantiates a new office365GroupsActivityFileCounts and sets the default values.
     * @return a void
     */
    public Office365GroupsActivityFileCounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a office365GroupsActivityFileCounts
     */
    @javax.annotation.Nonnull
    public static Office365GroupsActivityFileCounts createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityFileCounts();
    }
    /**
     * Gets the active property value. The number of files that were viewed, edited, shared, or synced in the group's SharePoint document library.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getActive() {
        return this._active;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Office365GroupsActivityFileCounts currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("active", (n) -> { currentObject.setActive(n.getLongValue()); });
            this.put("reportDate", (n) -> { currentObject.setReportDate(n.getLocalDateValue()); });
            this.put("reportPeriod", (n) -> { currentObject.setReportPeriod(n.getStringValue()); });
            this.put("reportRefreshDate", (n) -> { currentObject.setReportRefreshDate(n.getLocalDateValue()); });
            this.put("total", (n) -> { currentObject.setTotal(n.getLongValue()); });
        }};
    }
    /**
     * Gets the reportDate property value. The date on which a number of files were active in the group's SharePoint site.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportDate() {
        return this._reportDate;
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportPeriod() {
        return this._reportPeriod;
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this._reportRefreshDate;
    }
    /**
     * Gets the total property value. The total number of files in the group's SharePoint document library.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotal() {
        return this._total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("active", this.getActive());
        writer.writeLocalDateValue("reportDate", this.getReportDate());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("total", this.getTotal());
    }
    /**
     * Sets the active property value. The number of files that were viewed, edited, shared, or synced in the group's SharePoint document library.
     * @param value Value to set for the active property.
     * @return a void
     */
    public void setActive(@javax.annotation.Nullable final Long value) {
        this._active = value;
    }
    /**
     * Sets the reportDate property value. The date on which a number of files were active in the group's SharePoint site.
     * @param value Value to set for the reportDate property.
     * @return a void
     */
    public void setReportDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportDate = value;
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     * @return a void
     */
    public void setReportPeriod(@javax.annotation.Nullable final String value) {
        this._reportPeriod = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     * @return a void
     */
    public void setReportRefreshDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportRefreshDate = value;
    }
    /**
     * Sets the total property value. The total number of files in the group's SharePoint document library.
     * @param value Value to set for the total property.
     * @return a void
     */
    public void setTotal(@javax.annotation.Nullable final Long value) {
        this._total = value;
    }
}

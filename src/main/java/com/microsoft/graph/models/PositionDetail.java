package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PositionDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Detail about the company or employer.  */
    private CompanyDetail _company;
    /** Description of the position in question.  */
    private String _description;
    /** When the position ended.  */
    private LocalDate _endMonthYear;
    /** The title held when in that position.  */
    private String _jobTitle;
    /** The role the position entailed.  */
    private String _role;
    /** The start month and year of the position.  */
    private LocalDate _startMonthYear;
    /** Short summary of the position.  */
    private String _summary;
    /**
     * Instantiates a new positionDetail and sets the default values.
     * @return a void
     */
    public PositionDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a positionDetail
     */
    @javax.annotation.Nonnull
    public static PositionDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PositionDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the company property value. Detail about the company or employer.
     * @return a companyDetail
     */
    @javax.annotation.Nullable
    public CompanyDetail getCompany() {
        return this._company;
    }
    /**
     * Gets the description property value. Description of the position in question.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the endMonthYear property value. When the position ended.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndMonthYear() {
        return this._endMonthYear;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PositionDetail currentObject = this;
        return new HashMap<>(7) {{
            this.put("company", (n) -> { currentObject.setCompany(n.getObjectValue(CompanyDetail::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("endMonthYear", (n) -> { currentObject.setEndMonthYear(n.getLocalDateValue()); });
            this.put("jobTitle", (n) -> { currentObject.setJobTitle(n.getStringValue()); });
            this.put("role", (n) -> { currentObject.setRole(n.getStringValue()); });
            this.put("startMonthYear", (n) -> { currentObject.setStartMonthYear(n.getLocalDateValue()); });
            this.put("summary", (n) -> { currentObject.setSummary(n.getStringValue()); });
        }};
    }
    /**
     * Gets the jobTitle property value. The title held when in that position.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this._jobTitle;
    }
    /**
     * Gets the role property value. The role the position entailed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this._role;
    }
    /**
     * Gets the startMonthYear property value. The start month and year of the position.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartMonthYear() {
        return this._startMonthYear;
    }
    /**
     * Gets the summary property value. Short summary of the position.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSummary() {
        return this._summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("company", this.getCompany());
        writer.writeStringValue("description", this.getDescription());
        writer.writeLocalDateValue("endMonthYear", this.getEndMonthYear());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("role", this.getRole());
        writer.writeLocalDateValue("startMonthYear", this.getStartMonthYear());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the company property value. Detail about the company or employer.
     * @param value Value to set for the company property.
     * @return a void
     */
    public void setCompany(@javax.annotation.Nullable final CompanyDetail value) {
        this._company = value;
    }
    /**
     * Sets the description property value. Description of the position in question.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the endMonthYear property value. When the position ended.
     * @param value Value to set for the endMonthYear property.
     * @return a void
     */
    public void setEndMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this._endMonthYear = value;
    }
    /**
     * Sets the jobTitle property value. The title held when in that position.
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this._jobTitle = value;
    }
    /**
     * Sets the role property value. The role the position entailed.
     * @param value Value to set for the role property.
     * @return a void
     */
    public void setRole(@javax.annotation.Nullable final String value) {
        this._role = value;
    }
    /**
     * Sets the startMonthYear property value. The start month and year of the position.
     * @param value Value to set for the startMonthYear property.
     * @return a void
     */
    public void setStartMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this._startMonthYear = value;
    }
    /**
     * Sets the summary property value. Short summary of the position.
     * @param value Value to set for the summary property.
     * @return a void
     */
    public void setSummary(@javax.annotation.Nullable final String value) {
        this._summary = value;
    }
}

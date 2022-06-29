package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationalActivity extends ItemFacet implements Parsable {
    /** The month and year the user graduated or completed the activity. */
    private LocalDate _completionMonthYear;
    /** The month and year the user completed the educational activity referenced. */
    private LocalDate _endMonthYear;
    /** The institution property */
    private InstitutionData _institution;
    /** The program property */
    private EducationalActivityDetail _program;
    /** The month and year the user commenced the activity referenced. */
    private LocalDate _startMonthYear;
    /**
     * Instantiates a new EducationalActivity and sets the default values.
     * @return a void
     */
    public EducationalActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationalActivity
     */
    @javax.annotation.Nonnull
    public static EducationalActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationalActivity();
    }
    /**
     * Gets the completionMonthYear property value. The month and year the user graduated or completed the activity.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getCompletionMonthYear() {
        return this._completionMonthYear;
    }
    /**
     * Gets the endMonthYear property value. The month and year the user completed the educational activity referenced.
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
        final EducationalActivity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("completionMonthYear", (n) -> { currentObject.setCompletionMonthYear(n.getLocalDateValue()); });
            this.put("endMonthYear", (n) -> { currentObject.setEndMonthYear(n.getLocalDateValue()); });
            this.put("institution", (n) -> { currentObject.setInstitution(n.getObjectValue(InstitutionData::createFromDiscriminatorValue)); });
            this.put("program", (n) -> { currentObject.setProgram(n.getObjectValue(EducationalActivityDetail::createFromDiscriminatorValue)); });
            this.put("startMonthYear", (n) -> { currentObject.setStartMonthYear(n.getLocalDateValue()); });
        }};
    }
    /**
     * Gets the institution property value. The institution property
     * @return a institutionData
     */
    @javax.annotation.Nullable
    public InstitutionData getInstitution() {
        return this._institution;
    }
    /**
     * Gets the program property value. The program property
     * @return a educationalActivityDetail
     */
    @javax.annotation.Nullable
    public EducationalActivityDetail getProgram() {
        return this._program;
    }
    /**
     * Gets the startMonthYear property value. The month and year the user commenced the activity referenced.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartMonthYear() {
        return this._startMonthYear;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("completionMonthYear", this.getCompletionMonthYear());
        writer.writeLocalDateValue("endMonthYear", this.getEndMonthYear());
        writer.writeObjectValue("institution", this.getInstitution());
        writer.writeObjectValue("program", this.getProgram());
        writer.writeLocalDateValue("startMonthYear", this.getStartMonthYear());
    }
    /**
     * Sets the completionMonthYear property value. The month and year the user graduated or completed the activity.
     * @param value Value to set for the completionMonthYear property.
     * @return a void
     */
    public void setCompletionMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this._completionMonthYear = value;
    }
    /**
     * Sets the endMonthYear property value. The month and year the user completed the educational activity referenced.
     * @param value Value to set for the endMonthYear property.
     * @return a void
     */
    public void setEndMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this._endMonthYear = value;
    }
    /**
     * Sets the institution property value. The institution property
     * @param value Value to set for the institution property.
     * @return a void
     */
    public void setInstitution(@javax.annotation.Nullable final InstitutionData value) {
        this._institution = value;
    }
    /**
     * Sets the program property value. The program property
     * @param value Value to set for the program property.
     * @return a void
     */
    public void setProgram(@javax.annotation.Nullable final EducationalActivityDetail value) {
        this._program = value;
    }
    /**
     * Sets the startMonthYear property value. The month and year the user commenced the activity referenced.
     * @param value Value to set for the startMonthYear property.
     * @return a void
     */
    public void setStartMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this._startMonthYear = value;
    }
}

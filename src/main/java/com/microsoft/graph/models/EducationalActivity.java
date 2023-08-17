package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationalActivity extends ItemFacet implements Parsable {
    /**
     * The month and year the user graduated or completed the activity.
     */
    private LocalDate completionMonthYear;
    /**
     * The month and year the user completed the educational activity referenced.
     */
    private LocalDate endMonthYear;
    /**
     * The institution property
     */
    private InstitutionData institution;
    /**
     * The program property
     */
    private EducationalActivityDetail program;
    /**
     * The month and year the user commenced the activity referenced.
     */
    private LocalDate startMonthYear;
    /**
     * Instantiates a new educationalActivity and sets the default values.
     */
    public EducationalActivity() {
        super();
        this.setOdataType("#microsoft.graph.educationalActivity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationalActivity
     */
    @jakarta.annotation.Nonnull
    public static EducationalActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationalActivity();
    }
    /**
     * Gets the completionMonthYear property value. The month and year the user graduated or completed the activity.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getCompletionMonthYear() {
        return this.completionMonthYear;
    }
    /**
     * Gets the endMonthYear property value. The month and year the user completed the educational activity referenced.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndMonthYear() {
        return this.endMonthYear;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionMonthYear", (n) -> { this.setCompletionMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("endMonthYear", (n) -> { this.setEndMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("institution", (n) -> { this.setInstitution(n.getObjectValue(InstitutionData::createFromDiscriminatorValue)); });
        deserializerMap.put("program", (n) -> { this.setProgram(n.getObjectValue(EducationalActivityDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("startMonthYear", (n) -> { this.setStartMonthYear(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the institution property value. The institution property
     * @return a institutionData
     */
    @jakarta.annotation.Nullable
    public InstitutionData getInstitution() {
        return this.institution;
    }
    /**
     * Gets the program property value. The program property
     * @return a educationalActivityDetail
     */
    @jakarta.annotation.Nullable
    public EducationalActivityDetail getProgram() {
        return this.program;
    }
    /**
     * Gets the startMonthYear property value. The month and year the user commenced the activity referenced.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartMonthYear() {
        return this.startMonthYear;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCompletionMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.completionMonthYear = value;
    }
    /**
     * Sets the endMonthYear property value. The month and year the user completed the educational activity referenced.
     * @param value Value to set for the endMonthYear property.
     */
    public void setEndMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.endMonthYear = value;
    }
    /**
     * Sets the institution property value. The institution property
     * @param value Value to set for the institution property.
     */
    public void setInstitution(@jakarta.annotation.Nullable final InstitutionData value) {
        this.institution = value;
    }
    /**
     * Sets the program property value. The program property
     * @param value Value to set for the program property.
     */
    public void setProgram(@jakarta.annotation.Nullable final EducationalActivityDetail value) {
        this.program = value;
    }
    /**
     * Sets the startMonthYear property value. The month and year the user commenced the activity referenced.
     * @param value Value to set for the startMonthYear property.
     */
    public void setStartMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.startMonthYear = value;
    }
}

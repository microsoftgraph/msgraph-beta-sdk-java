package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationalActivityDetail implements AdditionalDataHolder, Parsable {
    /** Shortened name of the degree or program (example: PhD, MBA) */
    private String _abbreviation;
    /** Extracurricular activities undertaken alongside the program. */
    private java.util.List<String> _activities;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Any awards or honors associated with the program. */
    private java.util.List<String> _awards;
    /** Short description of the program provided by the user. */
    private String _description;
    /** Long-form name of the program that the user has provided. */
    private String _displayName;
    /** Majors and minors associated with the program. (if applicable) */
    private java.util.List<String> _fieldsOfStudy;
    /** The final grade, class, GPA or score. */
    private String _grade;
    /** Additional notes the user has provided. */
    private String _notes;
    /** The OdataType property */
    private String _odataType;
    /** Link to the degree or program page. */
    private String _webUrl;
    /**
     * Instantiates a new educationalActivityDetail and sets the default values.
     * @return a void
     */
    public EducationalActivityDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.educationalActivityDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationalActivityDetail
     */
    @javax.annotation.Nonnull
    public static EducationalActivityDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationalActivityDetail();
    }
    /**
     * Gets the abbreviation property value. Shortened name of the degree or program (example: PhD, MBA)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAbbreviation() {
        return this._abbreviation;
    }
    /**
     * Gets the activities property value. Extracurricular activities undertaken alongside the program.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getActivities() {
        return this._activities;
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
     * Gets the awards property value. Any awards or honors associated with the program.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAwards() {
        return this._awards;
    }
    /**
     * Gets the description property value. Short description of the program provided by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Long-form name of the program that the user has provided.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationalActivityDetail currentObject = this;
        return new HashMap<>(10) {{
            this.put("abbreviation", (n) -> { currentObject.setAbbreviation(n.getStringValue()); });
            this.put("activities", (n) -> { currentObject.setActivities(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("awards", (n) -> { currentObject.setAwards(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("fieldsOfStudy", (n) -> { currentObject.setFieldsOfStudy(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("grade", (n) -> { currentObject.setGrade(n.getStringValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fieldsOfStudy property value. Majors and minors associated with the program. (if applicable)
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFieldsOfStudy() {
        return this._fieldsOfStudy;
    }
    /**
     * Gets the grade property value. The final grade, class, GPA or score.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrade() {
        return this._grade;
    }
    /**
     * Gets the notes property value. Additional notes the user has provided.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the webUrl property value. Link to the degree or program page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("abbreviation", this.getAbbreviation());
        writer.writeCollectionOfPrimitiveValues("activities", this.getActivities());
        writer.writeCollectionOfPrimitiveValues("awards", this.getAwards());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("fieldsOfStudy", this.getFieldsOfStudy());
        writer.writeStringValue("grade", this.getGrade());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("webUrl", this.getWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the abbreviation property value. Shortened name of the degree or program (example: PhD, MBA)
     * @param value Value to set for the abbreviation property.
     * @return a void
     */
    public void setAbbreviation(@javax.annotation.Nullable final String value) {
        this._abbreviation = value;
    }
    /**
     * Sets the activities property value. Extracurricular activities undertaken alongside the program.
     * @param value Value to set for the activities property.
     * @return a void
     */
    public void setActivities(@javax.annotation.Nullable final java.util.List<String> value) {
        this._activities = value;
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
     * Sets the awards property value. Any awards or honors associated with the program.
     * @param value Value to set for the awards property.
     * @return a void
     */
    public void setAwards(@javax.annotation.Nullable final java.util.List<String> value) {
        this._awards = value;
    }
    /**
     * Sets the description property value. Short description of the program provided by the user.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Long-form name of the program that the user has provided.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the fieldsOfStudy property value. Majors and minors associated with the program. (if applicable)
     * @param value Value to set for the fieldsOfStudy property.
     * @return a void
     */
    public void setFieldsOfStudy(@javax.annotation.Nullable final java.util.List<String> value) {
        this._fieldsOfStudy = value;
    }
    /**
     * Sets the grade property value. The final grade, class, GPA or score.
     * @param value Value to set for the grade property.
     * @return a void
     */
    public void setGrade(@javax.annotation.Nullable final String value) {
        this._grade = value;
    }
    /**
     * Sets the notes property value. Additional notes the user has provided.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the webUrl property value. Link to the degree or program page.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationalActivityDetail implements AdditionalDataHolder, Parsable {
    /**
     * Shortened name of the degree or program (example: PhD, MBA)
     */
    private String abbreviation;
    /**
     * Extracurricular activities undertaken alongside the program.
     */
    private java.util.List<String> activities;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Any awards or honors associated with the program.
     */
    private java.util.List<String> awards;
    /**
     * Short description of the program provided by the user.
     */
    private String description;
    /**
     * Long-form name of the program that the user has provided.
     */
    private String displayName;
    /**
     * Majors and minors associated with the program. (if applicable)
     */
    private java.util.List<String> fieldsOfStudy;
    /**
     * The final grade, class, GPA or score.
     */
    private String grade;
    /**
     * Additional notes the user has provided.
     */
    private String notes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Link to the degree or program page.
     */
    private String webUrl;
    /**
     * Instantiates a new educationalActivityDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationalActivityDetail() {
        this.setAdditionalData(new HashMap<>());
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
        return this.abbreviation;
    }
    /**
     * Gets the activities property value. Extracurricular activities undertaken alongside the program.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getActivities() {
        return this.activities;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the awards property value. Any awards or honors associated with the program.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAwards() {
        return this.awards;
    }
    /**
     * Gets the description property value. Short description of the program provided by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Long-form name of the program that the user has provided.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("abbreviation", (n) -> { this.setAbbreviation(n.getStringValue()); });
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("awards", (n) -> { this.setAwards(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fieldsOfStudy", (n) -> { this.setFieldsOfStudy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("grade", (n) -> { this.setGrade(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fieldsOfStudy property value. Majors and minors associated with the program. (if applicable)
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFieldsOfStudy() {
        return this.fieldsOfStudy;
    }
    /**
     * Gets the grade property value. The final grade, class, GPA or score.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrade() {
        return this.grade;
    }
    /**
     * Gets the notes property value. Additional notes the user has provided.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the webUrl property value. Link to the degree or program page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAbbreviation(@javax.annotation.Nullable final String value) {
        this.abbreviation = value;
    }
    /**
     * Sets the activities property value. Extracurricular activities undertaken alongside the program.
     * @param value Value to set for the activities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivities(@javax.annotation.Nullable final java.util.List<String> value) {
        this.activities = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the awards property value. Any awards or honors associated with the program.
     * @param value Value to set for the awards property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAwards(@javax.annotation.Nullable final java.util.List<String> value) {
        this.awards = value;
    }
    /**
     * Sets the description property value. Short description of the program provided by the user.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Long-form name of the program that the user has provided.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the fieldsOfStudy property value. Majors and minors associated with the program. (if applicable)
     * @param value Value to set for the fieldsOfStudy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFieldsOfStudy(@javax.annotation.Nullable final java.util.List<String> value) {
        this.fieldsOfStudy = value;
    }
    /**
     * Sets the grade property value. The final grade, class, GPA or score.
     * @param value Value to set for the grade property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrade(@javax.annotation.Nullable final String value) {
        this.grade = value;
    }
    /**
     * Sets the notes property value. Additional notes the user has provided.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the webUrl property value. Link to the degree or program page.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}

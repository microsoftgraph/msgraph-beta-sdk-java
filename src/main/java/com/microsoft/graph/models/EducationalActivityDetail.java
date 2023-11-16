package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationalActivityDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new EducationalActivityDetail and sets the default values.
     */
    public EducationalActivityDetail() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationalActivityDetail
     */
    @jakarta.annotation.Nonnull
    public static EducationalActivityDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationalActivityDetail();
    }
    /**
     * Gets the abbreviation property value. Shortened name of the degree or program (example: PhD, MBA)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAbbreviation() {
        return this.BackingStore.get("abbreviation");
    }
    /**
     * Gets the activities property value. Extracurricular activities undertaken alongside the program.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getActivities() {
        return this.BackingStore.get("activities");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the awards property value. Any awards or honors associated with the program.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAwards() {
        return this.BackingStore.get("awards");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the description property value. Short description of the program provided by the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Long-form name of the program that the user has provided.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFieldsOfStudy() {
        return this.BackingStore.get("fieldsOfStudy");
    }
    /**
     * Gets the grade property value. The final grade, class, GPA or score.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGrade() {
        return this.BackingStore.get("grade");
    }
    /**
     * Gets the notes property value. Additional notes the user has provided.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.BackingStore.get("notes");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the webUrl property value. Link to the degree or program page.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.BackingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAbbreviation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("abbreviation", value);
    }
    /**
     * Sets the activities property value. Extracurricular activities undertaken alongside the program.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("activities", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the awards property value. Any awards or honors associated with the program.
     * @param value Value to set for the awards property.
     */
    public void setAwards(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("awards", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the description property value. Short description of the program provided by the user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Long-form name of the program that the user has provided.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the fieldsOfStudy property value. Majors and minors associated with the program. (if applicable)
     * @param value Value to set for the fieldsOfStudy property.
     */
    public void setFieldsOfStudy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("fieldsOfStudy", value);
    }
    /**
     * Sets the grade property value. The final grade, class, GPA or score.
     * @param value Value to set for the grade property.
     */
    public void setGrade(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("grade", value);
    }
    /**
     * Sets the notes property value. Additional notes the user has provided.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("notes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the webUrl property value. Link to the degree or program page.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("webUrl", value);
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SkillProficiency extends ItemFacet implements Parsable {
    /** Contains categories a user has associated with the skill (for example, personal, professional, hobby). */
    private java.util.List<String> _categories;
    /** Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove. */
    private java.util.List<String> _collaborationTags;
    /** Contains a friendly name for the skill. */
    private String _displayName;
    /** Detail of the users proficiency with this skill. Possible values are: elementary, limitedWorking, generalProfessional, advancedProfessional, expert, unknownFutureValue. */
    private SkillProficiencyLevel _proficiency;
    /** The thumbnailUrl property */
    private String _thumbnailUrl;
    /** Contains a link to an information source about the skill. */
    private String _webUrl;
    /**
     * Instantiates a new skillProficiency and sets the default values.
     * @return a void
     */
    public SkillProficiency() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a skillProficiency
     */
    @javax.annotation.Nonnull
    public static SkillProficiency createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkillProficiency();
    }
    /**
     * Gets the categories property value. Contains categories a user has associated with the skill (for example, personal, professional, hobby).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * Gets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCollaborationTags() {
        return this._collaborationTags;
    }
    /**
     * Gets the displayName property value. Contains a friendly name for the skill.
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
        final SkillProficiency currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("collaborationTags", (n) -> { currentObject.setCollaborationTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("proficiency", (n) -> { currentObject.setProficiency(n.getEnumValue(SkillProficiencyLevel.class)); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the proficiency property value. Detail of the users proficiency with this skill. Possible values are: elementary, limitedWorking, generalProfessional, advancedProfessional, expert, unknownFutureValue.
     * @return a skillProficiencyLevel
     */
    @javax.annotation.Nullable
    public SkillProficiencyLevel getProficiency() {
        return this._proficiency;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. Contains a link to an information source about the skill.
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
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfPrimitiveValues("collaborationTags", this.getCollaborationTags());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("proficiency", this.getProficiency());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the categories property value. Contains categories a user has associated with the skill (for example, personal, professional, hobby).
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @param value Value to set for the collaborationTags property.
     * @return a void
     */
    public void setCollaborationTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._collaborationTags = value;
    }
    /**
     * Sets the displayName property value. Contains a friendly name for the skill.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the proficiency property value. Detail of the users proficiency with this skill. Possible values are: elementary, limitedWorking, generalProfessional, advancedProfessional, expert, unknownFutureValue.
     * @param value Value to set for the proficiency property.
     * @return a void
     */
    public void setProficiency(@javax.annotation.Nullable final SkillProficiencyLevel value) {
        this._proficiency = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. Contains a link to an information source about the skill.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}

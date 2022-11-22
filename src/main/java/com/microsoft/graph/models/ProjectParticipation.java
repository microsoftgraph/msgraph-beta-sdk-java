package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProjectParticipation extends ItemFacet implements Parsable {
    /** Contains categories a user has associated with the project (for example, digital transformation, oil rig). */
    private java.util.List<String> _categories;
    /** Contains detailed information about the client the project was for. */
    private CompanyDetail _client;
    /** Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove. */
    private java.util.List<String> _collaborationTags;
    /** Lists people that also worked on the project. */
    private java.util.List<RelatedPerson> _colleagues;
    /** Contains detail about the user's role on the project. */
    private PositionDetail _detail;
    /** Contains a friendly name for the project. */
    private String _displayName;
    /** The Person or people who sponsored the project. */
    private java.util.List<RelatedPerson> _sponsors;
    /** The thumbnailUrl property */
    private String _thumbnailUrl;
    /**
     * Instantiates a new ProjectParticipation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectParticipation() {
        super();
        this.setOdataType("#microsoft.graph.projectParticipation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectParticipation
     */
    @javax.annotation.Nonnull
    public static ProjectParticipation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectParticipation();
    }
    /**
     * Gets the categories property value. Contains categories a user has associated with the project (for example, digital transformation, oil rig).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * Gets the client property value. Contains detailed information about the client the project was for.
     * @return a companyDetail
     */
    @javax.annotation.Nullable
    public CompanyDetail getClient() {
        return this._client;
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
     * Gets the colleagues property value. Lists people that also worked on the project.
     * @return a relatedPerson
     */
    @javax.annotation.Nullable
    public java.util.List<RelatedPerson> getColleagues() {
        return this._colleagues;
    }
    /**
     * Gets the detail property value. Contains detail about the user's role on the project.
     * @return a positionDetail
     */
    @javax.annotation.Nullable
    public PositionDetail getDetail() {
        return this._detail;
    }
    /**
     * Gets the displayName property value. Contains a friendly name for the project.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("client", (n) -> { this.setClient(n.getObjectValue(CompanyDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("collaborationTags", (n) -> { this.setCollaborationTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("colleagues", (n) -> { this.setColleagues(n.getCollectionOfObjectValues(RelatedPerson::createFromDiscriminatorValue)); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getObjectValue(PositionDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("sponsors", (n) -> { this.setSponsors(n.getCollectionOfObjectValues(RelatedPerson::createFromDiscriminatorValue)); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sponsors property value. The Person or people who sponsored the project.
     * @return a relatedPerson
     */
    @javax.annotation.Nullable
    public java.util.List<RelatedPerson> getSponsors() {
        return this._sponsors;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeObjectValue("client", this.getClient());
        writer.writeCollectionOfPrimitiveValues("collaborationTags", this.getCollaborationTags());
        writer.writeCollectionOfObjectValues("colleagues", this.getColleagues());
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("sponsors", this.getSponsors());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
    }
    /**
     * Sets the categories property value. Contains categories a user has associated with the project (for example, digital transformation, oil rig).
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the client property value. Contains detailed information about the client the project was for.
     * @param value Value to set for the client property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClient(@javax.annotation.Nullable final CompanyDetail value) {
        this._client = value;
    }
    /**
     * Sets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @param value Value to set for the collaborationTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollaborationTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._collaborationTags = value;
    }
    /**
     * Sets the colleagues property value. Lists people that also worked on the project.
     * @param value Value to set for the colleagues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColleagues(@javax.annotation.Nullable final java.util.List<RelatedPerson> value) {
        this._colleagues = value;
    }
    /**
     * Sets the detail property value. Contains detail about the user's role on the project.
     * @param value Value to set for the detail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetail(@javax.annotation.Nullable final PositionDetail value) {
        this._detail = value;
    }
    /**
     * Sets the displayName property value. Contains a friendly name for the project.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the sponsors property value. The Person or people who sponsored the project.
     * @param value Value to set for the sponsors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSponsors(@javax.annotation.Nullable final java.util.List<RelatedPerson> value) {
        this._sponsors = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
}

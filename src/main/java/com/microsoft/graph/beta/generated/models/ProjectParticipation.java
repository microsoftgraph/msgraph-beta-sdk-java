package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectParticipation extends ItemFacet implements Parsable {
    /**
     * Instantiates a new ProjectParticipation and sets the default values.
     */
    public ProjectParticipation() {
        super();
        this.setOdataType("#microsoft.graph.projectParticipation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectParticipation
     */
    @jakarta.annotation.Nonnull
    public static ProjectParticipation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectParticipation();
    }
    /**
     * Gets the categories property value. Contains categories a user has associated with the project (for example, digital transformation, oil rig).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the client property value. Contains detailed information about the client the project was for.
     * @return a CompanyDetail
     */
    @jakarta.annotation.Nullable
    public CompanyDetail getClient() {
        return this.backingStore.get("client");
    }
    /**
     * Gets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCollaborationTags() {
        return this.backingStore.get("collaborationTags");
    }
    /**
     * Gets the colleagues property value. Lists people that also worked on the project.
     * @return a java.util.List<RelatedPerson>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RelatedPerson> getColleagues() {
        return this.backingStore.get("colleagues");
    }
    /**
     * Gets the detail property value. Contains detail about the user's role on the project.
     * @return a PositionDetail
     */
    @jakarta.annotation.Nullable
    public PositionDetail getDetail() {
        return this.backingStore.get("detail");
    }
    /**
     * Gets the displayName property value. Contains a friendly name for the project.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a java.util.List<RelatedPerson>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RelatedPerson> getSponsors() {
        return this.backingStore.get("sponsors");
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.backingStore.get("thumbnailUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the client property value. Contains detailed information about the client the project was for.
     * @param value Value to set for the client property.
     */
    public void setClient(@jakarta.annotation.Nullable final CompanyDetail value) {
        this.backingStore.set("client", value);
    }
    /**
     * Sets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @param value Value to set for the collaborationTags property.
     */
    public void setCollaborationTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("collaborationTags", value);
    }
    /**
     * Sets the colleagues property value. Lists people that also worked on the project.
     * @param value Value to set for the colleagues property.
     */
    public void setColleagues(@jakarta.annotation.Nullable final java.util.List<RelatedPerson> value) {
        this.backingStore.set("colleagues", value);
    }
    /**
     * Sets the detail property value. Contains detail about the user's role on the project.
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final PositionDetail value) {
        this.backingStore.set("detail", value);
    }
    /**
     * Sets the displayName property value. Contains a friendly name for the project.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the sponsors property value. The Person or people who sponsored the project.
     * @param value Value to set for the sponsors property.
     */
    public void setSponsors(@jakarta.annotation.Nullable final java.util.List<RelatedPerson> value) {
        this.backingStore.set("sponsors", value);
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailUrl", value);
    }
}

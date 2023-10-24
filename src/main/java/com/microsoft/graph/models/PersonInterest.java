package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PersonInterest extends ItemFacet implements Parsable {
    /**
     * Contains categories a user has associated with the interest (for example, personal, recipies).
     */
    private java.util.List<String> categories;
    /**
     * Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     */
    private java.util.List<String> collaborationTags;
    /**
     * Contains a description of the interest.
     */
    private String description;
    /**
     * Contains a friendly name for the interest.
     */
    private String displayName;
    /**
     * The thumbnailUrl property
     */
    private String thumbnailUrl;
    /**
     * Contains a link to a web page or resource about the interest.
     */
    private String webUrl;
    /**
     * Instantiates a new PersonInterest and sets the default values.
     */
    public PersonInterest() {
        super();
        this.setOdataType("#microsoft.graph.personInterest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PersonInterest
     */
    @jakarta.annotation.Nonnull
    public static PersonInterest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonInterest();
    }
    /**
     * Gets the categories property value. Contains categories a user has associated with the interest (for example, personal, recipies).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.categories;
    }
    /**
     * Gets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCollaborationTags() {
        return this.collaborationTags;
    }
    /**
     * Gets the description property value. Contains a description of the interest.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Contains a friendly name for the interest.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("collaborationTags", (n) -> { this.setCollaborationTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. Contains a link to a web page or resource about the interest.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfPrimitiveValues("collaborationTags", this.getCollaborationTags());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the categories property value. Contains categories a user has associated with the interest (for example, personal, recipies).
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the collaborationTags property value. Contains experience scenario tags a user has associated with the interest. Allowed values in the collection are: askMeAbout, ableToMentor, wantsToLearn, wantsToImprove.
     * @param value Value to set for the collaborationTags property.
     */
    public void setCollaborationTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.collaborationTags = value;
    }
    /**
     * Sets the description property value. Contains a description of the interest.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Contains a friendly name for the interest.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. Contains a link to a web page or resource about the interest.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}

package com.microsoft.graph.models.ediscovery;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Tag extends Entity implements Parsable {
    /**
     * Instantiates a new Tag and sets the default values.
     */
    public Tag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Tag
     */
    @jakarta.annotation.Nonnull
    public static Tag createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Tag();
    }
    /**
     * Gets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @return a ChildSelectability
     */
    @jakarta.annotation.Nullable
    public ChildSelectability getChildSelectability() {
        return this.BackingStore.get("childSelectability");
    }
    /**
     * Gets the childTags property value. Returns the tags that are a child of a tag.
     * @return a java.util.List<Tag>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tag> getChildTags() {
        return this.BackingStore.get("childTags");
    }
    /**
     * Gets the createdBy property value. The user who created the tag.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.BackingStore.get("createdBy");
    }
    /**
     * Gets the description property value. The description for the tag.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name of the tag.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childSelectability", (n) -> { this.setChildSelectability(n.getEnumValue(ChildSelectability.class)); });
        deserializerMap.put("childTags", (n) -> { this.setChildTags(n.getCollectionOfObjectValues(Tag::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(Tag::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the tag was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the parent property value. Returns the parent tag of the specified tag.
     * @return a Tag
     */
    @jakarta.annotation.Nullable
    public Tag getParent() {
        return this.BackingStore.get("parent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("childSelectability", this.getChildSelectability());
        writer.writeCollectionOfObjectValues("childTags", this.getChildTags());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("parent", this.getParent());
    }
    /**
     * Sets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @param value Value to set for the childSelectability property.
     */
    public void setChildSelectability(@jakarta.annotation.Nullable final ChildSelectability value) {
        this.BackingStore.set("childSelectability", value);
    }
    /**
     * Sets the childTags property value. Returns the tags that are a child of a tag.
     * @param value Value to set for the childTags property.
     */
    public void setChildTags(@jakarta.annotation.Nullable final java.util.List<Tag> value) {
        this.BackingStore.set("childTags", value);
    }
    /**
     * Sets the createdBy property value. The user who created the tag.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("createdBy", value);
    }
    /**
     * Sets the description property value. The description for the tag.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name of the tag.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the tag was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the parent property value. Returns the parent tag of the specified tag.
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final Tag value) {
        this.BackingStore.set("parent", value);
    }
}

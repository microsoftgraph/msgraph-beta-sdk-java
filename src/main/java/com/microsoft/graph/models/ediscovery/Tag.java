package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.IdentitySet;
public class Tag extends Entity implements Parsable {
    /** Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group. */
    private ChildSelectability _childSelectability;
    /** Returns the tags that are a child of a tag. */
    private java.util.List<Tag> _childTags;
    /** The user who created the tag. */
    private IdentitySet _createdBy;
    /** The description for the tag. */
    private String _description;
    /** Display name of the tag. */
    private String _displayName;
    /** The date and time the tag was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Returns the parent tag of the specified tag. */
    private Tag _parent;
    /**
     * Instantiates a new Tag and sets the default values.
     * @return a void
     */
    public Tag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Tag
     */
    @javax.annotation.Nonnull
    public static Tag createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Tag();
    }
    /**
     * Gets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @return a childSelectability
     */
    @javax.annotation.Nullable
    public ChildSelectability getChildSelectability() {
        return this._childSelectability;
    }
    /**
     * Gets the childTags property value. Returns the tags that are a child of a tag.
     * @return a tag
     */
    @javax.annotation.Nullable
    public java.util.List<Tag> getChildTags() {
        return this._childTags;
    }
    /**
     * Gets the createdBy property value. The user who created the tag.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the description property value. The description for the tag.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name of the tag.
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
        final Tag currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("childSelectability", (n) -> { currentObject.setChildSelectability(n.getEnumValue(ChildSelectability.class)); });
            this.put("childTags", (n) -> { currentObject.setChildTags(n.getCollectionOfObjectValues(Tag::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(Tag::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the tag was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the parent property value. Returns the parent tag of the specified tag.
     * @return a tag
     */
    @javax.annotation.Nullable
    public Tag getParent() {
        return this._parent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setChildSelectability(@javax.annotation.Nullable final ChildSelectability value) {
        this._childSelectability = value;
    }
    /**
     * Sets the childTags property value. Returns the tags that are a child of a tag.
     * @param value Value to set for the childTags property.
     * @return a void
     */
    public void setChildTags(@javax.annotation.Nullable final java.util.List<Tag> value) {
        this._childTags = value;
    }
    /**
     * Sets the createdBy property value. The user who created the tag.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the description property value. The description for the tag.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name of the tag.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the tag was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the parent property value. Returns the parent tag of the specified tag.
     * @param value Value to set for the parent property.
     * @return a void
     */
    public void setParent(@javax.annotation.Nullable final Tag value) {
        this._parent = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The category entity stores the category of a group policy definition */
public class GroupPolicyCategory extends Entity implements Parsable {
    /** The children categories */
    private java.util.List<GroupPolicyCategory> _children;
    /** The id of the definition file the category came from */
    private GroupPolicyDefinitionFile _definitionFile;
    /** The immediate GroupPolicyDefinition children of the category */
    private java.util.List<GroupPolicyDefinition> _definitions;
    /** The string id of the category's display name */
    private String _displayName;
    /** Defines if the category is a root category */
    private Boolean _isRoot;
    /** The date and time the entity was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The parent category */
    private GroupPolicyCategory _parent;
    /**
     * Instantiates a new groupPolicyCategory and sets the default values.
     * @return a void
     */
    public GroupPolicyCategory() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyCategory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nonnull
    public static GroupPolicyCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyCategory();
    }
    /**
     * Gets the children property value. The children categories
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyCategory> getChildren() {
        return this._children;
    }
    /**
     * Gets the definitionFile property value. The id of the definition file the category came from
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionFile getDefinitionFile() {
        return this._definitionFile;
    }
    /**
     * Gets the definitions property value. The immediate GroupPolicyDefinition children of the category
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getDefinitions() {
        return this._definitions;
    }
    /**
     * Gets the displayName property value. The string id of the category's display name
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
        final GroupPolicyCategory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(GroupPolicyCategory::createFromDiscriminatorValue)); });
            this.put("definitionFile", (n) -> { currentObject.setDefinitionFile(n.getObjectValue(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
            this.put("definitions", (n) -> { currentObject.setDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isRoot", (n) -> { currentObject.setIsRoot(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(GroupPolicyCategory::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isRoot property value. Defines if the category is a root category
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRoot() {
        return this._isRoot;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the parent property value. The parent category
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public GroupPolicyCategory getParent() {
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
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeObjectValue("definitionFile", this.getDefinitionFile());
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRoot", this.getIsRoot());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("parent", this.getParent());
    }
    /**
     * Sets the children property value. The children categories
     * @param value Value to set for the children property.
     * @return a void
     */
    public void setChildren(@javax.annotation.Nullable final java.util.List<GroupPolicyCategory> value) {
        this._children = value;
    }
    /**
     * Sets the definitionFile property value. The id of the definition file the category came from
     * @param value Value to set for the definitionFile property.
     * @return a void
     */
    public void setDefinitionFile(@javax.annotation.Nullable final GroupPolicyDefinitionFile value) {
        this._definitionFile = value;
    }
    /**
     * Sets the definitions property value. The immediate GroupPolicyDefinition children of the category
     * @param value Value to set for the definitions property.
     * @return a void
     */
    public void setDefinitions(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this._definitions = value;
    }
    /**
     * Sets the displayName property value. The string id of the category's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isRoot property value. Defines if the category is a root category
     * @param value Value to set for the isRoot property.
     * @return a void
     */
    public void setIsRoot(@javax.annotation.Nullable final Boolean value) {
        this._isRoot = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the parent property value. The parent category
     * @param value Value to set for the parent property.
     * @return a void
     */
    public void setParent(@javax.annotation.Nullable final GroupPolicyCategory value) {
        this._parent = value;
    }
}

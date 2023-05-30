package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The category entity stores the category of a group policy definition
 */
public class GroupPolicyCategory extends Entity implements Parsable {
    /** The children categories */
    private java.util.List<GroupPolicyCategory> children;
    /** The id of the definition file the category came from */
    private GroupPolicyDefinitionFile definitionFile;
    /** The immediate GroupPolicyDefinition children of the category */
    private java.util.List<GroupPolicyDefinition> definitions;
    /** The string id of the category's display name */
    private String displayName;
    /** Category Ingestion source */
    private IngestionSource ingestionSource;
    /** Defines if the category is a root category */
    private Boolean isRoot;
    /** The date and time the entity was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** The parent category */
    private GroupPolicyCategory parent;
    /**
     * Instantiates a new groupPolicyCategory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyCategory() {
        super();
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
        return this.children;
    }
    /**
     * Gets the definitionFile property value. The id of the definition file the category came from
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionFile getDefinitionFile() {
        return this.definitionFile;
    }
    /**
     * Gets the definitions property value. The immediate GroupPolicyDefinition children of the category
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getDefinitions() {
        return this.definitions;
    }
    /**
     * Gets the displayName property value. The string id of the category's display name
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(GroupPolicyCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("definitionFile", (n) -> { this.setDefinitionFile(n.getObjectValue(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("ingestionSource", (n) -> { this.setIngestionSource(n.getEnumValue(IngestionSource.class)); });
        deserializerMap.put("isRoot", (n) -> { this.setIsRoot(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(GroupPolicyCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ingestionSource property value. Category Ingestion source
     * @return a ingestionSource
     */
    @javax.annotation.Nullable
    public IngestionSource getIngestionSource() {
        return this.ingestionSource;
    }
    /**
     * Gets the isRoot property value. Defines if the category is a root category
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRoot() {
        return this.isRoot;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the parent property value. The parent category
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public GroupPolicyCategory getParent() {
        return this.parent;
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
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeObjectValue("definitionFile", this.getDefinitionFile());
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("ingestionSource", this.getIngestionSource());
        writer.writeBooleanValue("isRoot", this.getIsRoot());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("parent", this.getParent());
    }
    /**
     * Sets the children property value. The children categories
     * @param value Value to set for the children property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildren(@javax.annotation.Nullable final java.util.List<GroupPolicyCategory> value) {
        this.children = value;
    }
    /**
     * Sets the definitionFile property value. The id of the definition file the category came from
     * @param value Value to set for the definitionFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionFile(@javax.annotation.Nullable final GroupPolicyDefinitionFile value) {
        this.definitionFile = value;
    }
    /**
     * Sets the definitions property value. The immediate GroupPolicyDefinition children of the category
     * @param value Value to set for the definitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitions(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this.definitions = value;
    }
    /**
     * Sets the displayName property value. The string id of the category's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the ingestionSource property value. Category Ingestion source
     * @param value Value to set for the ingestionSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIngestionSource(@javax.annotation.Nullable final IngestionSource value) {
        this.ingestionSource = value;
    }
    /**
     * Sets the isRoot property value. Defines if the category is a root category
     * @param value Value to set for the isRoot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRoot(@javax.annotation.Nullable final Boolean value) {
        this.isRoot = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the parent property value. The parent category
     * @param value Value to set for the parent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParent(@javax.annotation.Nullable final GroupPolicyCategory value) {
        this.parent = value;
    }
}

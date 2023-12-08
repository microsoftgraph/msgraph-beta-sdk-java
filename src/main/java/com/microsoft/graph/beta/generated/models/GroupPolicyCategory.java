package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyCategory extends Entity implements Parsable {
    /**
     * Instantiates a new GroupPolicyCategory and sets the default values.
     */
    public GroupPolicyCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyCategory
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyCategory();
    }
    /**
     * Gets the children property value. The children categories
     * @return a java.util.List<GroupPolicyCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyCategory> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * Gets the definitionFile property value. The id of the definition file the category came from
     * @return a GroupPolicyDefinitionFile
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinitionFile getDefinitionFile() {
        return this.backingStore.get("definitionFile");
    }
    /**
     * Gets the definitions property value. The immediate GroupPolicyDefinition children of the category
     * @return a java.util.List<GroupPolicyDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getDefinitions() {
        return this.backingStore.get("definitions");
    }
    /**
     * Gets the displayName property value. The string id of the category's display name
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
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(GroupPolicyCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("definitionFile", (n) -> { this.setDefinitionFile(n.getObjectValue(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("ingestionSource", (n) -> { this.setIngestionSource(n.getEnumValue(IngestionSource::forValue)); });
        deserializerMap.put("isRoot", (n) -> { this.setIsRoot(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(GroupPolicyCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ingestionSource property value. Category Ingestion source
     * @return a IngestionSource
     */
    @jakarta.annotation.Nullable
    public IngestionSource getIngestionSource() {
        return this.backingStore.get("ingestionSource");
    }
    /**
     * Gets the isRoot property value. Defines if the category is a root category
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRoot() {
        return this.backingStore.get("isRoot");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the parent property value. The parent category
     * @return a GroupPolicyCategory
     */
    @jakarta.annotation.Nullable
    public GroupPolicyCategory getParent() {
        return this.backingStore.get("parent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<GroupPolicyCategory> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the definitionFile property value. The id of the definition file the category came from
     * @param value Value to set for the definitionFile property.
     */
    public void setDefinitionFile(@jakarta.annotation.Nullable final GroupPolicyDefinitionFile value) {
        this.backingStore.set("definitionFile", value);
    }
    /**
     * Sets the definitions property value. The immediate GroupPolicyDefinition children of the category
     * @param value Value to set for the definitions property.
     */
    public void setDefinitions(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this.backingStore.set("definitions", value);
    }
    /**
     * Sets the displayName property value. The string id of the category's display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the ingestionSource property value. Category Ingestion source
     * @param value Value to set for the ingestionSource property.
     */
    public void setIngestionSource(@jakarta.annotation.Nullable final IngestionSource value) {
        this.backingStore.set("ingestionSource", value);
    }
    /**
     * Sets the isRoot property value. Defines if the category is a root category
     * @param value Value to set for the isRoot property.
     */
    public void setIsRoot(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRoot", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the parent property value. The parent category
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final GroupPolicyCategory value) {
        this.backingStore.set("parent", value);
    }
}

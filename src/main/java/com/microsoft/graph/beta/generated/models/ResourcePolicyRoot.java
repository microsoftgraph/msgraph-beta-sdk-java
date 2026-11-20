package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourcePolicyRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ResourcePolicyRoot} and sets the default values.
     */
    public ResourcePolicyRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourcePolicyRoot}
     */
    @jakarta.annotation.Nonnull
    public static ResourcePolicyRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourcePolicyRoot();
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a {@link java.util.List<ResourcePolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourcePolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the builtInDefinitions property value. The builtInDefinitions property
     * @return a {@link java.util.List<ResourcePolicyDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourcePolicyDefinition> getBuiltInDefinitions() {
        return this.backingStore.get("builtInDefinitions");
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a {@link ResourcePolicyConfiguration}
     */
    @jakarta.annotation.Nullable
    public ResourcePolicyConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the definitions property value. The definitions property
     * @return a {@link java.util.List<ResourcePolicyDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourcePolicyDefinition> getDefinitions() {
        return this.backingStore.get("definitions");
    }
    /**
     * Gets the deletedItems property value. The deletedItems property
     * @return a {@link ResourcePolicyDeletableRoot}
     */
    @jakarta.annotation.Nullable
    public ResourcePolicyDeletableRoot getDeletedItems() {
        return this.backingStore.get("deletedItems");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(ResourcePolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("builtInDefinitions", (n) -> { this.setBuiltInDefinitions(n.getCollectionOfObjectValues(ResourcePolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(ResourcePolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(ResourcePolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getObjectValue(ResourcePolicyDeletableRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("builtInDefinitions", this.getBuiltInDefinitions());
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeObjectValue("deletedItems", this.getDeletedItems());
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<ResourcePolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the builtInDefinitions property value. The builtInDefinitions property
     * @param value Value to set for the builtInDefinitions property.
     */
    public void setBuiltInDefinitions(@jakarta.annotation.Nullable final java.util.List<ResourcePolicyDefinition> value) {
        this.backingStore.set("builtInDefinitions", value);
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final ResourcePolicyConfiguration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the definitions property value. The definitions property
     * @param value Value to set for the definitions property.
     */
    public void setDefinitions(@jakarta.annotation.Nullable final java.util.List<ResourcePolicyDefinition> value) {
        this.backingStore.set("definitions", value);
    }
    /**
     * Sets the deletedItems property value. The deletedItems property
     * @param value Value to set for the deletedItems property.
     */
    public void setDeletedItems(@jakarta.annotation.Nullable final ResourcePolicyDeletableRoot value) {
        this.backingStore.set("deletedItems", value);
    }
}

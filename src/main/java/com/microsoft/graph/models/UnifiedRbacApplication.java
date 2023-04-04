package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRbacApplication extends Entity implements Parsable {
    /** The resourceNamespaces property */
    private java.util.List<UnifiedRbacResourceNamespace> resourceNamespaces;
    /** The roleAssignments property */
    private java.util.List<UnifiedRoleAssignment> roleAssignments;
    /** The roleDefinitions property */
    private java.util.List<UnifiedRoleDefinition> roleDefinitions;
    /** The transitiveRoleAssignments property */
    private java.util.List<UnifiedRoleAssignment> transitiveRoleAssignments;
    /**
     * Instantiates a new UnifiedRbacApplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRbacApplication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRbacApplication
     */
    @javax.annotation.Nonnull
    public static UnifiedRbacApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacApplication();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceNamespaces", (n) -> { this.setResourceNamespaces(n.getCollectionOfObjectValues(UnifiedRbacResourceNamespace::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveRoleAssignments", (n) -> { this.setTransitiveRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceNamespaces property value. The resourceNamespaces property
     * @return a unifiedRbacResourceNamespace
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this.resourceNamespaces;
    }
    /**
     * Gets the roleAssignments property value. The roleAssignments property
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The roleDefinitions property
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the transitiveRoleAssignments property value. The transitiveRoleAssignments property
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getTransitiveRoleAssignments() {
        return this.transitiveRoleAssignments;
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
        writer.writeCollectionOfObjectValues("resourceNamespaces", this.getResourceNamespaces());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("transitiveRoleAssignments", this.getTransitiveRoleAssignments());
    }
    /**
     * Sets the resourceNamespaces property value. The resourceNamespaces property
     * @param value Value to set for the resourceNamespaces property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceNamespaces(@javax.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this.resourceNamespaces = value;
    }
    /**
     * Sets the roleAssignments property value. The roleAssignments property
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The roleDefinitions property
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the transitiveRoleAssignments property value. The transitiveRoleAssignments property
     * @param value Value to set for the transitiveRoleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.transitiveRoleAssignments = value;
    }
}

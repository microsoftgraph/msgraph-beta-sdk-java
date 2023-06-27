package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRbacApplication extends Entity implements Parsable {
    /**
     * Workload-specific scope object that represents the resources for which the principal has been granted access.
     */
    private java.util.List<CustomAppScope> customAppScopes;
    /**
     * Resource that represents a collection of related actions.
     */
    private java.util.List<UnifiedRbacResourceNamespace> resourceNamespaces;
    /**
     * Resource to grant access to users or groups.
     */
    private java.util.List<UnifiedRoleAssignment> roleAssignments;
    /**
     * The roles allowed by RBAC providers and the permissions assigned to the roles.
     */
    private java.util.List<UnifiedRoleDefinition> roleDefinitions;
    /**
     * Resource to grant access to users or groups that are transitive.
     */
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
     * Gets the customAppScopes property value. Workload-specific scope object that represents the resources for which the principal has been granted access.
     * @return a customAppScope
     */
    @javax.annotation.Nullable
    public java.util.List<CustomAppScope> getCustomAppScopes() {
        return this.customAppScopes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customAppScopes", (n) -> { this.setCustomAppScopes(n.getCollectionOfObjectValues(CustomAppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceNamespaces", (n) -> { this.setResourceNamespaces(n.getCollectionOfObjectValues(UnifiedRbacResourceNamespace::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveRoleAssignments", (n) -> { this.setTransitiveRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceNamespaces property value. Resource that represents a collection of related actions.
     * @return a unifiedRbacResourceNamespace
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this.resourceNamespaces;
    }
    /**
     * Gets the roleAssignments property value. Resource to grant access to users or groups.
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The roles allowed by RBAC providers and the permissions assigned to the roles.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the transitiveRoleAssignments property value. Resource to grant access to users or groups that are transitive.
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
        writer.writeCollectionOfObjectValues("customAppScopes", this.getCustomAppScopes());
        writer.writeCollectionOfObjectValues("resourceNamespaces", this.getResourceNamespaces());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("transitiveRoleAssignments", this.getTransitiveRoleAssignments());
    }
    /**
     * Sets the customAppScopes property value. Workload-specific scope object that represents the resources for which the principal has been granted access.
     * @param value Value to set for the customAppScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomAppScopes(@javax.annotation.Nullable final java.util.List<CustomAppScope> value) {
        this.customAppScopes = value;
    }
    /**
     * Sets the resourceNamespaces property value. Resource that represents a collection of related actions.
     * @param value Value to set for the resourceNamespaces property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceNamespaces(@javax.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this.resourceNamespaces = value;
    }
    /**
     * Sets the roleAssignments property value. Resource to grant access to users or groups.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The roles allowed by RBAC providers and the permissions assigned to the roles.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the transitiveRoleAssignments property value. Resource to grant access to users or groups that are transitive.
     * @param value Value to set for the transitiveRoleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.transitiveRoleAssignments = value;
    }
}

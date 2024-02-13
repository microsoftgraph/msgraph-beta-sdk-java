package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRbacApplication extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRbacApplication} and sets the default values.
     */
    public UnifiedRbacApplication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRbacApplication}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRbacApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacApplication();
    }
    /**
     * Gets the customAppScopes property value. Workload-specific scope object that represents the resources for which the principal has been granted access.
     * @return a {@link java.util.List<CustomAppScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomAppScope> getCustomAppScopes() {
        return this.backingStore.get("customAppScopes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link java.util.List<UnifiedRbacResourceNamespace>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this.backingStore.get("resourceNamespaces");
    }
    /**
     * Gets the roleAssignments property value. Resource to grant access to users or groups.
     * @return a {@link java.util.List<UnifiedRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this.backingStore.get("roleAssignments");
    }
    /**
     * Gets the roleDefinitions property value. The roles allowed by RBAC providers and the permissions assigned to the roles.
     * @return a {@link java.util.List<UnifiedRoleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
    }
    /**
     * Gets the transitiveRoleAssignments property value. Resource to grant access to users or groups that are transitive.
     * @return a {@link java.util.List<UnifiedRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getTransitiveRoleAssignments() {
        return this.backingStore.get("transitiveRoleAssignments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCustomAppScopes(@jakarta.annotation.Nullable final java.util.List<CustomAppScope> value) {
        this.backingStore.set("customAppScopes", value);
    }
    /**
     * Sets the resourceNamespaces property value. Resource that represents a collection of related actions.
     * @param value Value to set for the resourceNamespaces property.
     */
    public void setResourceNamespaces(@jakarta.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this.backingStore.set("resourceNamespaces", value);
    }
    /**
     * Sets the roleAssignments property value. Resource to grant access to users or groups.
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.backingStore.set("roleAssignments", value);
    }
    /**
     * Sets the roleDefinitions property value. The roles allowed by RBAC providers and the permissions assigned to the roles.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
    /**
     * Sets the transitiveRoleAssignments property value. Resource to grant access to users or groups that are transitive.
     * @param value Value to set for the transitiveRoleAssignments property.
     */
    public void setTransitiveRoleAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.backingStore.set("transitiveRoleAssignments", value);
    }
}

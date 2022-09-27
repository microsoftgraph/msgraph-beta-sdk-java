package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RbacApplicationMultiple extends Entity implements Parsable {
    /** The resourceNamespaces property */
    private java.util.List<UnifiedRbacResourceNamespace> _resourceNamespaces;
    /** The roleAssignments property */
    private java.util.List<UnifiedRoleAssignmentMultiple> _roleAssignments;
    /** The roleDefinitions property */
    private java.util.List<UnifiedRoleDefinition> _roleDefinitions;
    /**
     * Instantiates a new RbacApplicationMultiple and sets the default values.
     * @return a void
     */
    public RbacApplicationMultiple() {
        super();
        this.setOdataType("#microsoft.graph.rbacApplicationMultiple");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RbacApplicationMultiple
     */
    @javax.annotation.Nonnull
    public static RbacApplicationMultiple createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RbacApplicationMultiple();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RbacApplicationMultiple currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("resourceNamespaces", (n) -> { currentObject.setResourceNamespaces(n.getCollectionOfObjectValues(UnifiedRbacResourceNamespace::createFromDiscriminatorValue)); });
            this.put("roleAssignments", (n) -> { currentObject.setRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignmentMultiple::createFromDiscriminatorValue)); });
            this.put("roleDefinitions", (n) -> { currentObject.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the resourceNamespaces property value. The resourceNamespaces property
     * @return a unifiedRbacResourceNamespace
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this._resourceNamespaces;
    }
    /**
     * Gets the roleAssignments property value. The roleAssignments property
     * @return a unifiedRoleAssignmentMultiple
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentMultiple> getRoleAssignments() {
        return this._roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The roleDefinitions property
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this._roleDefinitions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("resourceNamespaces", this.getResourceNamespaces());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
    }
    /**
     * Sets the resourceNamespaces property value. The resourceNamespaces property
     * @param value Value to set for the resourceNamespaces property.
     * @return a void
     */
    public void setResourceNamespaces(@javax.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this._resourceNamespaces = value;
    }
    /**
     * Sets the roleAssignments property value. The roleAssignments property
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentMultiple> value) {
        this._roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The roleDefinitions property
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this._roleDefinitions = value;
    }
}

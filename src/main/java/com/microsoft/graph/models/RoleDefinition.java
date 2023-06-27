package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleDefinition extends Entity implements Parsable {
    /**
     * Description of the Role definition.
     */
    private String description;
    /**
     * Display Name of the Role definition.
     */
    private String displayName;
    /**
     * Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     */
    private Boolean isBuiltIn;
    /**
     * Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     */
    private Boolean isBuiltInRoleDefinition;
    /**
     * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     */
    private java.util.List<RolePermission> permissions;
    /**
     * List of Role assignments for this role definition.
     */
    private java.util.List<RoleAssignment> roleAssignments;
    /**
     * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     */
    private java.util.List<RolePermission> rolePermissions;
    /**
     * List of Scope Tags for this Entity instance.
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Instantiates a new roleDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleDefinition
     */
    @javax.annotation.Nonnull
    public static RoleDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceAndAppManagementRoleDefinition": return new DeviceAndAppManagementRoleDefinition();
            }
        }
        return new RoleDefinition();
    }
    /**
     * Gets the description property value. Description of the Role definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display Name of the Role definition.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("isBuiltInRoleDefinition", (n) -> { this.setIsBuiltInRoleDefinition(n.getBooleanValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(RolePermission::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(RoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("rolePermissions", (n) -> { this.setRolePermissions(n.getCollectionOfObjectValues(RolePermission::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isBuiltIn property value. Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
    }
    /**
     * Gets the isBuiltInRoleDefinition property value. Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltInRoleDefinition() {
        return this.isBuiltInRoleDefinition;
    }
    /**
     * Gets the permissions property value. List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     * @return a rolePermission
     */
    @javax.annotation.Nullable
    public java.util.List<RolePermission> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the roleAssignments property value. List of Role assignments for this role definition.
     * @return a roleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<RoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the rolePermissions property value. List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     * @return a rolePermission
     */
    @javax.annotation.Nullable
    public java.util.List<RolePermission> getRolePermissions() {
        return this.rolePermissions;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeBooleanValue("isBuiltInRoleDefinition", this.getIsBuiltInRoleDefinition());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("rolePermissions", this.getRolePermissions());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the description property value. Description of the Role definition.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display Name of the Role definition.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isBuiltIn property value. Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this.isBuiltIn = value;
    }
    /**
     * Sets the isBuiltInRoleDefinition property value. Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     * @param value Value to set for the isBuiltInRoleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBuiltInRoleDefinition(@javax.annotation.Nullable final Boolean value) {
        this.isBuiltInRoleDefinition = value;
    }
    /**
     * Sets the permissions property value. List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     * @param value Value to set for the permissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissions(@javax.annotation.Nullable final java.util.List<RolePermission> value) {
        this.permissions = value;
    }
    /**
     * Sets the roleAssignments property value. List of Role assignments for this role definition.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<RoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the rolePermissions property value. List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     * @param value Value to set for the rolePermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRolePermissions(@javax.annotation.Nullable final java.util.List<RolePermission> value) {
        this.rolePermissions = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
}

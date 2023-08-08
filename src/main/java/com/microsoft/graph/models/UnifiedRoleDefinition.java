package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleDefinition extends Entity implements Parsable {
    /**
     * Types of principals that can be assigned the role. Read-only. The possible values are: user, servicePrincipal, group, unknownFutureValue. This is a multi-valued enumeration that can contain up to three values as a comma-separated string. For example, user, group. Supports $filter (eq).
     */
    private AllowedRolePrincipalTypes allowedPrincipalTypes;
    /**
     * The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     */
    private String description;
    /**
     * The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith).
     */
    private String displayName;
    /**
     * Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles support this attribute.
     */
    private java.util.List<UnifiedRoleDefinition> inheritsPermissionsFrom;
    /**
     * Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq).
     */
    private Boolean isBuiltIn;
    /**
     * Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     */
    private Boolean isEnabled;
    /**
     * The isPrivileged property
     */
    private Boolean isPrivileged;
    /**
     * List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     */
    private java.util.List<String> resourceScopes;
    /**
     * List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     */
    private java.util.List<UnifiedRolePermission> rolePermissions;
    /**
     * Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     */
    private String templateId;
    /**
     * Indicates the version of the unifiedRoleDefinition object. Read-only when isBuiltIn is true.
     */
    private String version;
    /**
     * Instantiates a new unifiedRoleDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleDefinition();
    }
    /**
     * Gets the allowedPrincipalTypes property value. Types of principals that can be assigned the role. Read-only. The possible values are: user, servicePrincipal, group, unknownFutureValue. This is a multi-valued enumeration that can contain up to three values as a comma-separated string. For example, user, group. Supports $filter (eq).
     * @return a allowedRolePrincipalTypes
     */
    @javax.annotation.Nullable
    public AllowedRolePrincipalTypes getAllowedPrincipalTypes() {
        return this.allowedPrincipalTypes;
    }
    /**
     * Gets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith).
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
        deserializerMap.put("allowedPrincipalTypes", (n) -> { this.setAllowedPrincipalTypes(n.getEnumValue(AllowedRolePrincipalTypes.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("inheritsPermissionsFrom", (n) -> { this.setInheritsPermissionsFrom(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPrivileged", (n) -> { this.setIsPrivileged(n.getBooleanValue()); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rolePermissions", (n) -> { this.setRolePermissions(n.getCollectionOfObjectValues(UnifiedRolePermission::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles support this attribute.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getInheritsPermissionsFrom() {
        return this.inheritsPermissionsFrom;
    }
    /**
     * Gets the isBuiltIn property value. Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
    }
    /**
     * Gets the isEnabled property value. Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isPrivileged property value. The isPrivileged property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPrivileged() {
        return this.isPrivileged;
    }
    /**
     * Gets the resourceScopes property value. List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this.resourceScopes;
    }
    /**
     * Gets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @return a unifiedRolePermission
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRolePermission> getRolePermissions() {
        return this.rolePermissions;
    }
    /**
     * Gets the templateId property value. Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Gets the version property value. Indicates the version of the unifiedRoleDefinition object. Read-only when isBuiltIn is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeEnumValue("allowedPrincipalTypes", this.getAllowedPrincipalTypes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("inheritsPermissionsFrom", this.getInheritsPermissionsFrom());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isPrivileged", this.getIsPrivileged());
        writer.writeCollectionOfPrimitiveValues("resourceScopes", this.getResourceScopes());
        writer.writeCollectionOfObjectValues("rolePermissions", this.getRolePermissions());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the allowedPrincipalTypes property value. Types of principals that can be assigned the role. Read-only. The possible values are: user, servicePrincipal, group, unknownFutureValue. This is a multi-valued enumeration that can contain up to three values as a comma-separated string. For example, user, group. Supports $filter (eq).
     * @param value Value to set for the allowedPrincipalTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedPrincipalTypes(@javax.annotation.Nullable final AllowedRolePrincipalTypes value) {
        this.allowedPrincipalTypes = value;
    }
    /**
     * Sets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles support this attribute.
     * @param value Value to set for the inheritsPermissionsFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInheritsPermissionsFrom(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.inheritsPermissionsFrom = value;
    }
    /**
     * Sets the isBuiltIn property value. Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq).
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this.isBuiltIn = value;
    }
    /**
     * Sets the isEnabled property value. Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isPrivileged property value. The isPrivileged property
     * @param value Value to set for the isPrivileged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPrivileged(@javax.annotation.Nullable final Boolean value) {
        this.isPrivileged = value;
    }
    /**
     * Sets the resourceScopes property value. List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     * @param value Value to set for the resourceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceScopes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.resourceScopes = value;
    }
    /**
     * Sets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @param value Value to set for the rolePermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRolePermissions(@javax.annotation.Nullable final java.util.List<UnifiedRolePermission> value) {
        this.rolePermissions = value;
    }
    /**
     * Sets the templateId property value. Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this.templateId = value;
    }
    /**
     * Sets the version property value. Indicates the version of the unifiedRoleDefinition object. Read-only when isBuiltIn is true.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}

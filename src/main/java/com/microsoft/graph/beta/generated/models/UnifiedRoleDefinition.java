package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new UnifiedRoleDefinition and sets the default values.
     */
    public UnifiedRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleDefinition
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleDefinition();
    }
    /**
     * Gets the allowedPrincipalTypes property value. Types of principals that can be assigned the role. Read-only. The possible values are: user, servicePrincipal, group, unknownFutureValue. This is a multi-valued enumeration that can contain up to three values as a comma-separated string. For example, user, group. Supports $filter (eq).
     * @return a EnumSet<AllowedRolePrincipalTypes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AllowedRolePrincipalTypes> getAllowedPrincipalTypes() {
        return this.backingStore.get("allowedPrincipalTypes");
    }
    /**
     * Gets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith).
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
        deserializerMap.put("allowedPrincipalTypes", (n) -> { this.setAllowedPrincipalTypes(n.getEnumSetValue(AllowedRolePrincipalTypes::forValue)); });
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
     * Gets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Microsoft Entra built-in roles support this attribute.
     * @return a java.util.List<UnifiedRoleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getInheritsPermissionsFrom() {
        return this.backingStore.get("inheritsPermissionsFrom");
    }
    /**
     * Gets the isBuiltIn property value. Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.backingStore.get("isBuiltIn");
    }
    /**
     * Gets the isEnabled property value. Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the isPrivileged property value. Flag indicating if the role is privileged. Microsoft Entra ID defines a role as privileged if it contains at least one sensitive resource action in the rolePermissions and allowedResourceActions objects. Applies only for actions in the microsoft.directory resource namespace. Read-only. Supports $filter (eq).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPrivileged() {
        return this.backingStore.get("isPrivileged");
    }
    /**
     * Gets the resourceScopes property value. List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this.backingStore.get("resourceScopes");
    }
    /**
     * Gets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @return a java.util.List<UnifiedRolePermission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRolePermission> getRolePermissions() {
        return this.backingStore.get("rolePermissions");
    }
    /**
     * Gets the templateId property value. Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Gets the version property value. Indicates the version of the unifiedRoleDefinition object. Read-only when isBuiltIn is true.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("allowedPrincipalTypes", this.getAllowedPrincipalTypes());
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
     */
    public void setAllowedPrincipalTypes(@jakarta.annotation.Nullable final EnumSet<AllowedRolePrincipalTypes> value) {
        this.backingStore.set("allowedPrincipalTypes", value);
    }
    /**
     * Sets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Microsoft Entra built-in roles support this attribute.
     * @param value Value to set for the inheritsPermissionsFrom property.
     */
    public void setInheritsPermissionsFrom(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.backingStore.set("inheritsPermissionsFrom", value);
    }
    /**
     * Sets the isBuiltIn property value. Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq).
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBuiltIn", value);
    }
    /**
     * Sets the isEnabled property value. Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the isPrivileged property value. Flag indicating if the role is privileged. Microsoft Entra ID defines a role as privileged if it contains at least one sensitive resource action in the rolePermissions and allowedResourceActions objects. Applies only for actions in the microsoft.directory resource namespace. Read-only. Supports $filter (eq).
     * @param value Value to set for the isPrivileged property.
     */
    public void setIsPrivileged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPrivileged", value);
    }
    /**
     * Sets the resourceScopes property value. List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     * @param value Value to set for the resourceScopes property.
     */
    public void setResourceScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceScopes", value);
    }
    /**
     * Sets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @param value Value to set for the rolePermissions property.
     */
    public void setRolePermissions(@jakarta.annotation.Nullable final java.util.List<UnifiedRolePermission> value) {
        this.backingStore.set("rolePermissions", value);
    }
    /**
     * Sets the templateId property value. Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
    /**
     * Sets the version property value. Indicates the version of the unifiedRoleDefinition object. Read-only when isBuiltIn is true.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}

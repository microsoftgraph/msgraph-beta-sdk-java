package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleAssignment extends Entity implements Parsable {
    /**
     * Details of the app specific scope when the assignment scope is app specific. Containment entity.
     */
    private AppScope appScope;
    /**
     * Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.
     */
    private String appScopeId;
    /**
     * The condition property
     */
    private String condition;
    /**
     * The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     */
    private DirectoryObject directoryScope;
    /**
     * Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     */
    private String directoryScopeId;
    /**
     * The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     */
    private DirectoryObject principal;
    /**
     * Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).
     */
    private String principalId;
    /**
     * The principalOrganizationId property
     */
    private String principalOrganizationId;
    /**
     * The scope at which the unifiedRoleAssignment applies. This is / for service-wide. DO NOT USE. This property will be deprecated soon.
     */
    private String resourceScope;
    /**
     * The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.
     */
    private UnifiedRoleDefinition roleDefinition;
    /**
     * Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).
     */
    private String roleDefinitionId;
    /**
     * Instantiates a new unifiedRoleAssignment and sets the default values.
     */
    public UnifiedRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleAssignment
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignment();
    }
    /**
     * Gets the appScope property value. Details of the app specific scope when the assignment scope is app specific. Containment entity.
     * @return a appScope
     */
    @jakarta.annotation.Nullable
    public AppScope getAppScope() {
        return this.appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppScopeId() {
        return this.appScopeId;
    }
    /**
     * Gets the condition property value. The condition property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCondition() {
        return this.condition;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this.directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDirectoryScopeId() {
        return this.directoryScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appScope", (n) -> { this.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopeId", (n) -> { this.setAppScopeId(n.getStringValue()); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getStringValue()); });
        deserializerMap.put("directoryScope", (n) -> { this.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryScopeId", (n) -> { this.setDirectoryScopeId(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("principalOrganizationId", (n) -> { this.setPrincipalOrganizationId(n.getStringValue()); });
        deserializerMap.put("resourceScope", (n) -> { this.setResourceScope(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principal property value. The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Gets the principalOrganizationId property value. The principalOrganizationId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrincipalOrganizationId() {
        return this.principalOrganizationId;
    }
    /**
     * Gets the resourceScope property value. The scope at which the unifiedRoleAssignment applies. This is / for service-wide. DO NOT USE. This property will be deprecated soon.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceScope() {
        return this.resourceScope;
    }
    /**
     * Gets the roleDefinition property value. The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.
     * @return a unifiedRoleDefinition
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this.roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appScope", this.getAppScope());
        writer.writeStringValue("appScopeId", this.getAppScopeId());
        writer.writeStringValue("condition", this.getCondition());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeStringValue("principalOrganizationId", this.getPrincipalOrganizationId());
        writer.writeStringValue("resourceScope", this.getResourceScope());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
    }
    /**
     * Sets the appScope property value. Details of the app specific scope when the assignment scope is app specific. Containment entity.
     * @param value Value to set for the appScope property.
     */
    public void setAppScope(@jakarta.annotation.Nullable final AppScope value) {
        this.appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.
     * @param value Value to set for the appScopeId property.
     */
    public void setAppScopeId(@jakarta.annotation.Nullable final String value) {
        this.appScopeId = value;
    }
    /**
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final String value) {
        this.condition = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @param value Value to set for the directoryScope property.
     */
    public void setDirectoryScope(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @param value Value to set for the directoryScopeId property.
     */
    public void setDirectoryScopeId(@jakarta.annotation.Nullable final String value) {
        this.directoryScopeId = value;
    }
    /**
     * Sets the principal property value. The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.principalId = value;
    }
    /**
     * Sets the principalOrganizationId property value. The principalOrganizationId property
     * @param value Value to set for the principalOrganizationId property.
     */
    public void setPrincipalOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.principalOrganizationId = value;
    }
    /**
     * Sets the resourceScope property value. The scope at which the unifiedRoleAssignment applies. This is / for service-wide. DO NOT USE. This property will be deprecated soon.
     * @param value Value to set for the resourceScope property.
     */
    public void setResourceScope(@jakarta.annotation.Nullable final String value) {
        this.resourceScope = value;
    }
    /**
     * Sets the roleDefinition property value. The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final UnifiedRoleDefinition value) {
        this.roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleAssignmentMultiple extends Entity implements Parsable {
    /**
     * Instantiates a new UnifiedRoleAssignmentMultiple and sets the default values.
     */
    public UnifiedRoleAssignmentMultiple() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleAssignmentMultiple
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleAssignmentMultiple createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentMultiple();
    }
    /**
     * Gets the appScopeIds property value. Ids of the app specific scopes when the assignment scopes are app specific. The scopes of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAppScopeIds() {
        return this.BackingStore.get("appScopeIds");
    }
    /**
     * Gets the appScopes property value. Read-only collection with details of the app specific scopes when the assignment scopes are app specific. Containment entity. Read-only.
     * @return a java.util.List<AppScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppScope> getAppScopes() {
        return this.BackingStore.get("appScopes");
    }
    /**
     * Gets the condition property value. The condition property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCondition() {
        return this.BackingStore.get("condition");
    }
    /**
     * Gets the description property value. Description of the role assignment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the directoryScopeIds property value. Ids of the directory objects that represent the scopes of the assignment. The scopes of an assignment determine the set of resources for which the principals have been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDirectoryScopeIds() {
        return this.BackingStore.get("directoryScopeIds");
    }
    /**
     * Gets the directoryScopes property value. Read-only collection that references the directory objects that are scope of the assignment. Provided so that callers can get the directory objects using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectoryScopes() {
        return this.BackingStore.get("directoryScopes");
    }
    /**
     * Gets the displayName property value. Name of the role assignment. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appScopeIds", (n) -> { this.setAppScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appScopes", (n) -> { this.setAppScopes(n.getCollectionOfObjectValues(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("directoryScopeIds", (n) -> { this.setDirectoryScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("directoryScopes", (n) -> { this.setDirectoryScopes(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("principalIds", (n) -> { this.setPrincipalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("principals", (n) -> { this.setPrincipals(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principalIds property value. Identifiers of the principals to which the assignment is granted.  Supports $filter (any operator only).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPrincipalIds() {
        return this.BackingStore.get("principalIds");
    }
    /**
     * Gets the principals property value. Read-only collection that references the assigned principals. Provided so that callers can get the principals using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getPrincipals() {
        return this.BackingStore.get("principals");
    }
    /**
     * Gets the roleDefinition property value. Specifies the roleDefinition that the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment.  Supports $filter (eq operator on id, isBuiltIn, and displayName, and startsWith operator on displayName)  and $expand.
     * @return a UnifiedRoleDefinition
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this.BackingStore.get("roleDefinition");
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.BackingStore.get("roleDefinitionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("appScopeIds", this.getAppScopeIds());
        writer.writeCollectionOfObjectValues("appScopes", this.getAppScopes());
        writer.writeStringValue("condition", this.getCondition());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("directoryScopeIds", this.getDirectoryScopeIds());
        writer.writeCollectionOfObjectValues("directoryScopes", this.getDirectoryScopes());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("principalIds", this.getPrincipalIds());
        writer.writeCollectionOfObjectValues("principals", this.getPrincipals());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
    }
    /**
     * Sets the appScopeIds property value. Ids of the app specific scopes when the assignment scopes are app specific. The scopes of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.
     * @param value Value to set for the appScopeIds property.
     */
    public void setAppScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("appScopeIds", value);
    }
    /**
     * Sets the appScopes property value. Read-only collection with details of the app specific scopes when the assignment scopes are app specific. Containment entity. Read-only.
     * @param value Value to set for the appScopes property.
     */
    public void setAppScopes(@jakarta.annotation.Nullable final java.util.List<AppScope> value) {
        this.BackingStore.set("appScopes", value);
    }
    /**
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("condition", value);
    }
    /**
     * Sets the description property value. Description of the role assignment.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the directoryScopeIds property value. Ids of the directory objects that represent the scopes of the assignment. The scopes of an assignment determine the set of resources for which the principals have been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @param value Value to set for the directoryScopeIds property.
     */
    public void setDirectoryScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("directoryScopeIds", value);
    }
    /**
     * Sets the directoryScopes property value. Read-only collection that references the directory objects that are scope of the assignment. Provided so that callers can get the directory objects using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @param value Value to set for the directoryScopes property.
     */
    public void setDirectoryScopes(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.BackingStore.set("directoryScopes", value);
    }
    /**
     * Sets the displayName property value. Name of the role assignment. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the principalIds property value. Identifiers of the principals to which the assignment is granted.  Supports $filter (any operator only).
     * @param value Value to set for the principalIds property.
     */
    public void setPrincipalIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("principalIds", value);
    }
    /**
     * Sets the principals property value. Read-only collection that references the assigned principals. Provided so that callers can get the principals using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @param value Value to set for the principals property.
     */
    public void setPrincipals(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.BackingStore.set("principals", value);
    }
    /**
     * Sets the roleDefinition property value. Specifies the roleDefinition that the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment.  Supports $filter (eq operator on id, isBuiltIn, and displayName, and startsWith operator on displayName)  and $expand.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final UnifiedRoleDefinition value) {
        this.BackingStore.set("roleDefinition", value);
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for.
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("roleDefinitionId", value);
    }
}

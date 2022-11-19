package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class UnifiedRoleAssignmentMultiple extends Entity implements Parsable {
    /** Ids of the app specific scopes when the assignment scopes are app specific. The scopes of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only. */
    private java.util.List<String> _appScopeIds;
    /** Read-only collection with details of the app specific scopes when the assignment scopes are app specific. Containment entity. Read-only. */
    private java.util.List<AppScope> _appScopes;
    /** The condition property */
    private String _condition;
    /** Description of the role assignment. */
    private String _description;
    /** Ids of the directory objects representing the scopes of the assignment. The scopes of an assignment determine the set of resources for which the principals have been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only. */
    private java.util.List<String> _directoryScopeIds;
    /** Read-only collection referencing the directory objects that are scope of the assignment. Provided so that callers can get the directory objects using $expand at the same time as getting the role assignment. Read-only.  Supports $expand. */
    private java.util.List<DirectoryObject> _directoryScopes;
    /** Name of the role assignment. Required. */
    private String _displayName;
    /** Identifiers of the principals to which the assignment is granted.  Supports $filter (any operator only). */
    private java.util.List<String> _principalIds;
    /** Read-only collection referencing the assigned principals. Provided so that callers can get the principals using $expand at the same time as getting the role assignment. Read-only.  Supports $expand. */
    private java.util.List<DirectoryObject> _principals;
    /** Specifies the roleDefinition that the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment.  Supports $filter (eq operator on id, isBuiltIn, and displayName, and startsWith operator on displayName)  and $expand. */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the unifiedRoleDefinition the assignment is for. */
    private String _roleDefinitionId;
    /**
     * Instantiates a new unifiedRoleAssignmentMultiple and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleAssignmentMultiple() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleAssignmentMultiple");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleAssignmentMultiple
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleAssignmentMultiple createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentMultiple();
    }
    /**
     * Gets the appScopeIds property value. Ids of the app specific scopes when the assignment scopes are app specific. The scopes of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAppScopeIds() {
        return this._appScopeIds;
    }
    /**
     * Gets the appScopes property value. Read-only collection with details of the app specific scopes when the assignment scopes are app specific. Containment entity. Read-only.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public java.util.List<AppScope> getAppScopes() {
        return this._appScopes;
    }
    /**
     * Gets the condition property value. The condition property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCondition() {
        return this._condition;
    }
    /**
     * Gets the description property value. Description of the role assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the directoryScopeIds property value. Ids of the directory objects representing the scopes of the assignment. The scopes of an assignment determine the set of resources for which the principals have been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDirectoryScopeIds() {
        return this._directoryScopeIds;
    }
    /**
     * Gets the directoryScopes property value. Read-only collection referencing the directory objects that are scope of the assignment. Provided so that callers can get the directory objects using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectoryScopes() {
        return this._directoryScopes;
    }
    /**
     * Gets the displayName property value. Name of the role assignment. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleAssignmentMultiple currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appScopeIds", (n) -> { currentObject.setAppScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appScopes", (n) -> { currentObject.setAppScopes(n.getCollectionOfObjectValues(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("condition", (n) -> { currentObject.setCondition(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("directoryScopeIds", (n) -> { currentObject.setDirectoryScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("directoryScopes", (n) -> { currentObject.setDirectoryScopes(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("principalIds", (n) -> { currentObject.setPrincipalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("principals", (n) -> { currentObject.setPrincipals(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the principalIds property value. Identifiers of the principals to which the assignment is granted.  Supports $filter (any operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPrincipalIds() {
        return this._principalIds;
    }
    /**
     * Gets the principals property value. Read-only collection referencing the assigned principals. Provided so that callers can get the principals using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getPrincipals() {
        return this._principals;
    }
    /**
     * Gets the roleDefinition property value. Specifies the roleDefinition that the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment.  Supports $filter (eq operator on id, isBuiltIn, and displayName, and startsWith operator on displayName)  and $expand.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScopeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._appScopeIds = value;
    }
    /**
     * Sets the appScopes property value. Read-only collection with details of the app specific scopes when the assignment scopes are app specific. Containment entity. Read-only.
     * @param value Value to set for the appScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScopes(@javax.annotation.Nullable final java.util.List<AppScope> value) {
        this._appScopes = value;
    }
    /**
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCondition(@javax.annotation.Nullable final String value) {
        this._condition = value;
    }
    /**
     * Sets the description property value. Description of the role assignment.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the directoryScopeIds property value. Ids of the directory objects representing the scopes of the assignment. The scopes of an assignment determine the set of resources for which the principals have been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @param value Value to set for the directoryScopeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScopeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._directoryScopeIds = value;
    }
    /**
     * Sets the directoryScopes property value. Read-only collection referencing the directory objects that are scope of the assignment. Provided so that callers can get the directory objects using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @param value Value to set for the directoryScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScopes(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._directoryScopes = value;
    }
    /**
     * Sets the displayName property value. Name of the role assignment. Required.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the principalIds property value. Identifiers of the principals to which the assignment is granted.  Supports $filter (any operator only).
     * @param value Value to set for the principalIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._principalIds = value;
    }
    /**
     * Sets the principals property value. Read-only collection referencing the assigned principals. Provided so that callers can get the principals using $expand at the same time as getting the role assignment. Read-only.  Supports $expand.
     * @param value Value to set for the principals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipals(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._principals = value;
    }
    /**
     * Sets the roleDefinition property value. Specifies the roleDefinition that the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment.  Supports $filter (eq operator on id, isBuiltIn, and displayName, and startsWith operator on displayName)  and $expand.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
}

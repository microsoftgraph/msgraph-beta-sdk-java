package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class PrivilegedAccess extends Entity implements Parsable {
    /** The display name of the provider managed by PIM. */
    private String _displayName;
    /** A collection of resources for the provider. */
    private java.util.List<GovernanceResource> _resources;
    /** A collection of role assignment requests for the provider. */
    private java.util.List<GovernanceRoleAssignmentRequest> _roleAssignmentRequests;
    /** A collection of role assignments for the provider. */
    private java.util.List<GovernanceRoleAssignment> _roleAssignments;
    /** A collection of role defintions for the provider. */
    private java.util.List<GovernanceRoleDefinition> _roleDefinitions;
    /** A collection of role settings for the provider. */
    private java.util.List<GovernanceRoleSetting> _roleSettings;
    /**
     * Instantiates a new privilegedAccess and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedAccess() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedAccess
     */
    @javax.annotation.Nonnull
    public static PrivilegedAccess createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccess();
    }
    /**
     * Gets the displayName property value. The display name of the provider managed by PIM.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(GovernanceResource::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentRequests", (n) -> { this.setRoleAssignmentRequests(n.getCollectionOfObjectValues(GovernanceRoleAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(GovernanceRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleSettings", (n) -> { this.setRoleSettings(n.getCollectionOfObjectValues(GovernanceRoleSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. A collection of resources for the provider.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceResource> getResources() {
        return this._resources;
    }
    /**
     * Gets the roleAssignmentRequests property value. A collection of role assignment requests for the provider.
     * @return a governanceRoleAssignmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleAssignmentRequest> getRoleAssignmentRequests() {
        return this._roleAssignmentRequests;
    }
    /**
     * Gets the roleAssignments property value. A collection of role assignments for the provider.
     * @return a governanceRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleAssignment> getRoleAssignments() {
        return this._roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. A collection of role defintions for the provider.
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleDefinition> getRoleDefinitions() {
        return this._roleDefinitions;
    }
    /**
     * Gets the roleSettings property value. A collection of role settings for the provider.
     * @return a governanceRoleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleSetting> getRoleSettings() {
        return this._roleSettings;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("roleAssignmentRequests", this.getRoleAssignmentRequests());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleSettings", this.getRoleSettings());
    }
    /**
     * Sets the displayName property value. The display name of the provider managed by PIM.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the resources property value. A collection of resources for the provider.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<GovernanceResource> value) {
        this._resources = value;
    }
    /**
     * Sets the roleAssignmentRequests property value. A collection of role assignment requests for the provider.
     * @param value Value to set for the roleAssignmentRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignmentRequests(@javax.annotation.Nullable final java.util.List<GovernanceRoleAssignmentRequest> value) {
        this._roleAssignmentRequests = value;
    }
    /**
     * Sets the roleAssignments property value. A collection of role assignments for the provider.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<GovernanceRoleAssignment> value) {
        this._roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. A collection of role defintions for the provider.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<GovernanceRoleDefinition> value) {
        this._roleDefinitions = value;
    }
    /**
     * Sets the roleSettings property value. A collection of role settings for the provider.
     * @param value Value to set for the roleSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleSettings(@javax.annotation.Nullable final java.util.List<GovernanceRoleSetting> value) {
        this._roleSettings = value;
    }
}

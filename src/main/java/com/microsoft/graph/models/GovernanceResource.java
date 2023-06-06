package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceResource extends Entity implements Parsable {
    /** The display name of the resource. */
    private String displayName;
    /** The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'. */
    private String externalId;
    /** Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to. */
    private GovernanceResource parent;
    /** Represents the date time when the resource is registered in PIM. */
    private OffsetDateTime registeredDateTime;
    /** The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources. */
    private String registeredRoot;
    /** The collection of role assignment requests for the resource. */
    private java.util.List<GovernanceRoleAssignmentRequest> roleAssignmentRequests;
    /** The collection of role assignments for the resource. */
    private java.util.List<GovernanceRoleAssignment> roleAssignments;
    /** The collection of role defintions for the resource. */
    private java.util.List<GovernanceRoleDefinition> roleDefinitions;
    /** The collection of role settings for the resource. */
    private java.util.List<GovernanceRoleSetting> roleSettings;
    /** The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios. */
    private String status;
    /** Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc. */
    private String type;
    /**
     * Instantiates a new GovernanceResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GovernanceResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernanceResource
     */
    @javax.annotation.Nonnull
    public static GovernanceResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceResource();
    }
    /**
     * Gets the displayName property value. The display name of the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
        deserializerMap.put("registeredDateTime", (n) -> { this.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registeredRoot", (n) -> { this.setRegisteredRoot(n.getStringValue()); });
        deserializerMap.put("roleAssignmentRequests", (n) -> { this.setRoleAssignmentRequests(n.getCollectionOfObjectValues(GovernanceRoleAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(GovernanceRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleSettings", (n) -> { this.setRoleSettings(n.getCollectionOfObjectValues(GovernanceRoleSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the parent property value. Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getParent() {
        return this.parent;
    }
    /**
     * Gets the registeredDateTime property value. Represents the date time when the resource is registered in PIM.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this.registeredDateTime;
    }
    /**
     * Gets the registeredRoot property value. The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegisteredRoot() {
        return this.registeredRoot;
    }
    /**
     * Gets the roleAssignmentRequests property value. The collection of role assignment requests for the resource.
     * @return a governanceRoleAssignmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleAssignmentRequest> getRoleAssignmentRequests() {
        return this.roleAssignmentRequests;
    }
    /**
     * Gets the roleAssignments property value. The collection of role assignments for the resource.
     * @return a governanceRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The collection of role defintions for the resource.
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the roleSettings property value. The collection of role settings for the resource.
     * @return a governanceRoleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleSetting> getRoleSettings() {
        return this.roleSettings;
    }
    /**
     * Gets the status property value. The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
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
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("parent", this.getParent());
        writer.writeOffsetDateTimeValue("registeredDateTime", this.getRegisteredDateTime());
        writer.writeStringValue("registeredRoot", this.getRegisteredRoot());
        writer.writeCollectionOfObjectValues("roleAssignmentRequests", this.getRoleAssignmentRequests());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleSettings", this.getRoleSettings());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the displayName property value. The display name of the resource.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the parent property value. Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to.
     * @param value Value to set for the parent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParent(@javax.annotation.Nullable final GovernanceResource value) {
        this.parent = value;
    }
    /**
     * Sets the registeredDateTime property value. Represents the date time when the resource is registered in PIM.
     * @param value Value to set for the registeredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.registeredDateTime = value;
    }
    /**
     * Sets the registeredRoot property value. The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     * @param value Value to set for the registeredRoot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredRoot(@javax.annotation.Nullable final String value) {
        this.registeredRoot = value;
    }
    /**
     * Sets the roleAssignmentRequests property value. The collection of role assignment requests for the resource.
     * @param value Value to set for the roleAssignmentRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignmentRequests(@javax.annotation.Nullable final java.util.List<GovernanceRoleAssignmentRequest> value) {
        this.roleAssignmentRequests = value;
    }
    /**
     * Sets the roleAssignments property value. The collection of role assignments for the resource.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<GovernanceRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The collection of role defintions for the resource.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<GovernanceRoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the roleSettings property value. The collection of role settings for the resource.
     * @param value Value to set for the roleSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleSettings(@javax.annotation.Nullable final java.util.List<GovernanceRoleSetting> value) {
        this.roleSettings = value;
    }
    /**
     * Sets the status property value. The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the type property value. Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}

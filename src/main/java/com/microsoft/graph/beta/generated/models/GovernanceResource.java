package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceResource extends Entity implements Parsable {
    /**
     * Instantiates a new GovernanceResource and sets the default values.
     */
    public GovernanceResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernanceResource
     */
    @jakarta.annotation.Nonnull
    public static GovernanceResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceResource();
    }
    /**
     * Gets the displayName property value. The display name of the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a GovernanceResource
     */
    @jakarta.annotation.Nullable
    public GovernanceResource getParent() {
        return this.backingStore.get("parent");
    }
    /**
     * Gets the registeredDateTime property value. Represents the date time when the resource is registered in PIM.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this.backingStore.get("registeredDateTime");
    }
    /**
     * Gets the registeredRoot property value. The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegisteredRoot() {
        return this.backingStore.get("registeredRoot");
    }
    /**
     * Gets the roleAssignmentRequests property value. The collection of role assignment requests for the resource.
     * @return a java.util.List<GovernanceRoleAssignmentRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleAssignmentRequest> getRoleAssignmentRequests() {
        return this.backingStore.get("roleAssignmentRequests");
    }
    /**
     * Gets the roleAssignments property value. The collection of role assignments for the resource.
     * @return a java.util.List<GovernanceRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleAssignment> getRoleAssignments() {
        return this.backingStore.get("roleAssignments");
    }
    /**
     * Gets the roleDefinitions property value. The collection of role definitions for the resource.
     * @return a java.util.List<GovernanceRoleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
    }
    /**
     * Gets the roleSettings property value. The collection of role settings for the resource.
     * @return a java.util.List<GovernanceRoleSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleSetting> getRoleSettings() {
        return this.backingStore.get("roleSettings");
    }
    /**
     * Gets the status property value. The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the type property value. Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the parent property value. Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to.
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final GovernanceResource value) {
        this.backingStore.set("parent", value);
    }
    /**
     * Sets the registeredDateTime property value. Represents the date time when the resource is registered in PIM.
     * @param value Value to set for the registeredDateTime property.
     */
    public void setRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registeredDateTime", value);
    }
    /**
     * Sets the registeredRoot property value. The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     * @param value Value to set for the registeredRoot property.
     */
    public void setRegisteredRoot(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("registeredRoot", value);
    }
    /**
     * Sets the roleAssignmentRequests property value. The collection of role assignment requests for the resource.
     * @param value Value to set for the roleAssignmentRequests property.
     */
    public void setRoleAssignmentRequests(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleAssignmentRequest> value) {
        this.backingStore.set("roleAssignmentRequests", value);
    }
    /**
     * Sets the roleAssignments property value. The collection of role assignments for the resource.
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleAssignment> value) {
        this.backingStore.set("roleAssignments", value);
    }
    /**
     * Sets the roleDefinitions property value. The collection of role definitions for the resource.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
    /**
     * Sets the roleSettings property value. The collection of role settings for the resource.
     * @param value Value to set for the roleSettings property.
     */
    public void setRoleSettings(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleSetting> value) {
        this.backingStore.set("roleSettings", value);
    }
    /**
     * Sets the status property value. The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the type property value. Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}

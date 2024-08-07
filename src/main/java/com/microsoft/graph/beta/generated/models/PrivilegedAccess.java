package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccess extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedAccess} and sets the default values.
     */
    public PrivilegedAccess() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedAccess}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccess();
    }
    /**
     * Gets the displayName property value. The display name of the provider managed by PIM.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a {@link java.util.List<GovernanceResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the roleAssignmentRequests property value. A collection of role assignment requests for the provider.
     * @return a {@link java.util.List<GovernanceRoleAssignmentRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleAssignmentRequest> getRoleAssignmentRequests() {
        return this.backingStore.get("roleAssignmentRequests");
    }
    /**
     * Gets the roleAssignments property value. A collection of role assignments for the provider.
     * @return a {@link java.util.List<GovernanceRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleAssignment> getRoleAssignments() {
        return this.backingStore.get("roleAssignments");
    }
    /**
     * Gets the roleDefinitions property value. A collection of role definitions for the provider.
     * @return a {@link java.util.List<GovernanceRoleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
    }
    /**
     * Gets the roleSettings property value. A collection of role settings for the provider.
     * @return a {@link java.util.List<GovernanceRoleSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRoleSetting> getRoleSettings() {
        return this.backingStore.get("roleSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the resources property value. A collection of resources for the provider.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<GovernanceResource> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the roleAssignmentRequests property value. A collection of role assignment requests for the provider.
     * @param value Value to set for the roleAssignmentRequests property.
     */
    public void setRoleAssignmentRequests(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleAssignmentRequest> value) {
        this.backingStore.set("roleAssignmentRequests", value);
    }
    /**
     * Sets the roleAssignments property value. A collection of role assignments for the provider.
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleAssignment> value) {
        this.backingStore.set("roleAssignments", value);
    }
    /**
     * Sets the roleDefinitions property value. A collection of role definitions for the provider.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
    /**
     * Sets the roleSettings property value. A collection of role settings for the provider.
     * @param value Value to set for the roleSettings property.
     */
    public void setRoleSettings(@jakarta.annotation.Nullable final java.util.List<GovernanceRoleSetting> value) {
        this.backingStore.set("roleSettings", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RbacApplication extends Entity implements Parsable {
    /**
     * Instantiates a new RbacApplication and sets the default values.
     */
    public RbacApplication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RbacApplication
     */
    @jakarta.annotation.Nonnull
    public static RbacApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RbacApplication();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceNamespaces", (n) -> { this.setResourceNamespaces(n.getCollectionOfObjectValues(UnifiedRbacResourceNamespace::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentApprovals", (n) -> { this.setRoleAssignmentApprovals(n.getCollectionOfObjectValues(Approval::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentScheduleInstances", (n) -> { this.setRoleAssignmentScheduleInstances(n.getCollectionOfObjectValues(UnifiedRoleAssignmentScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentScheduleRequests", (n) -> { this.setRoleAssignmentScheduleRequests(n.getCollectionOfObjectValues(UnifiedRoleAssignmentScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentSchedules", (n) -> { this.setRoleAssignmentSchedules(n.getCollectionOfObjectValues(UnifiedRoleAssignmentSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleEligibilityScheduleInstances", (n) -> { this.setRoleEligibilityScheduleInstances(n.getCollectionOfObjectValues(UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("roleEligibilityScheduleRequests", (n) -> { this.setRoleEligibilityScheduleRequests(n.getCollectionOfObjectValues(UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("roleEligibilitySchedules", (n) -> { this.setRoleEligibilitySchedules(n.getCollectionOfObjectValues(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveRoleAssignments", (n) -> { this.setTransitiveRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceNamespaces property value. The resourceNamespaces property
     * @return a java.util.List<UnifiedRbacResourceNamespace>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this.backingStore.get("resourceNamespaces");
    }
    /**
     * Gets the roleAssignmentApprovals property value. The roleAssignmentApprovals property
     * @return a java.util.List<Approval>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Approval> getRoleAssignmentApprovals() {
        return this.backingStore.get("roleAssignmentApprovals");
    }
    /**
     * Gets the roleAssignments property value. The roleAssignments property
     * @return a java.util.List<UnifiedRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this.backingStore.get("roleAssignments");
    }
    /**
     * Gets the roleAssignmentScheduleInstances property value. The roleAssignmentScheduleInstances property
     * @return a java.util.List<UnifiedRoleAssignmentScheduleInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleInstance> getRoleAssignmentScheduleInstances() {
        return this.backingStore.get("roleAssignmentScheduleInstances");
    }
    /**
     * Gets the roleAssignmentScheduleRequests property value. The roleAssignmentScheduleRequests property
     * @return a java.util.List<UnifiedRoleAssignmentScheduleRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleRequest> getRoleAssignmentScheduleRequests() {
        return this.backingStore.get("roleAssignmentScheduleRequests");
    }
    /**
     * Gets the roleAssignmentSchedules property value. The roleAssignmentSchedules property
     * @return a java.util.List<UnifiedRoleAssignmentSchedule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentSchedule> getRoleAssignmentSchedules() {
        return this.backingStore.get("roleAssignmentSchedules");
    }
    /**
     * Gets the roleDefinitions property value. The roleDefinitions property
     * @return a java.util.List<UnifiedRoleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
    }
    /**
     * Gets the roleEligibilityScheduleInstances property value. The roleEligibilityScheduleInstances property
     * @return a java.util.List<UnifiedRoleEligibilityScheduleInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleInstance> getRoleEligibilityScheduleInstances() {
        return this.backingStore.get("roleEligibilityScheduleInstances");
    }
    /**
     * Gets the roleEligibilityScheduleRequests property value. The roleEligibilityScheduleRequests property
     * @return a java.util.List<UnifiedRoleEligibilityScheduleRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleRequest> getRoleEligibilityScheduleRequests() {
        return this.backingStore.get("roleEligibilityScheduleRequests");
    }
    /**
     * Gets the roleEligibilitySchedules property value. The roleEligibilitySchedules property
     * @return a java.util.List<UnifiedRoleEligibilitySchedule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilitySchedule> getRoleEligibilitySchedules() {
        return this.backingStore.get("roleEligibilitySchedules");
    }
    /**
     * Gets the transitiveRoleAssignments property value. The transitiveRoleAssignments property
     * @return a java.util.List<UnifiedRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getTransitiveRoleAssignments() {
        return this.backingStore.get("transitiveRoleAssignments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("resourceNamespaces", this.getResourceNamespaces());
        writer.writeCollectionOfObjectValues("roleAssignmentApprovals", this.getRoleAssignmentApprovals());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleAssignmentScheduleInstances", this.getRoleAssignmentScheduleInstances());
        writer.writeCollectionOfObjectValues("roleAssignmentScheduleRequests", this.getRoleAssignmentScheduleRequests());
        writer.writeCollectionOfObjectValues("roleAssignmentSchedules", this.getRoleAssignmentSchedules());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleEligibilityScheduleInstances", this.getRoleEligibilityScheduleInstances());
        writer.writeCollectionOfObjectValues("roleEligibilityScheduleRequests", this.getRoleEligibilityScheduleRequests());
        writer.writeCollectionOfObjectValues("roleEligibilitySchedules", this.getRoleEligibilitySchedules());
        writer.writeCollectionOfObjectValues("transitiveRoleAssignments", this.getTransitiveRoleAssignments());
    }
    /**
     * Sets the resourceNamespaces property value. The resourceNamespaces property
     * @param value Value to set for the resourceNamespaces property.
     */
    public void setResourceNamespaces(@jakarta.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this.backingStore.set("resourceNamespaces", value);
    }
    /**
     * Sets the roleAssignmentApprovals property value. The roleAssignmentApprovals property
     * @param value Value to set for the roleAssignmentApprovals property.
     */
    public void setRoleAssignmentApprovals(@jakarta.annotation.Nullable final java.util.List<Approval> value) {
        this.backingStore.set("roleAssignmentApprovals", value);
    }
    /**
     * Sets the roleAssignments property value. The roleAssignments property
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.backingStore.set("roleAssignments", value);
    }
    /**
     * Sets the roleAssignmentScheduleInstances property value. The roleAssignmentScheduleInstances property
     * @param value Value to set for the roleAssignmentScheduleInstances property.
     */
    public void setRoleAssignmentScheduleInstances(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleInstance> value) {
        this.backingStore.set("roleAssignmentScheduleInstances", value);
    }
    /**
     * Sets the roleAssignmentScheduleRequests property value. The roleAssignmentScheduleRequests property
     * @param value Value to set for the roleAssignmentScheduleRequests property.
     */
    public void setRoleAssignmentScheduleRequests(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleRequest> value) {
        this.backingStore.set("roleAssignmentScheduleRequests", value);
    }
    /**
     * Sets the roleAssignmentSchedules property value. The roleAssignmentSchedules property
     * @param value Value to set for the roleAssignmentSchedules property.
     */
    public void setRoleAssignmentSchedules(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignmentSchedule> value) {
        this.backingStore.set("roleAssignmentSchedules", value);
    }
    /**
     * Sets the roleDefinitions property value. The roleDefinitions property
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
    /**
     * Sets the roleEligibilityScheduleInstances property value. The roleEligibilityScheduleInstances property
     * @param value Value to set for the roleEligibilityScheduleInstances property.
     */
    public void setRoleEligibilityScheduleInstances(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleInstance> value) {
        this.backingStore.set("roleEligibilityScheduleInstances", value);
    }
    /**
     * Sets the roleEligibilityScheduleRequests property value. The roleEligibilityScheduleRequests property
     * @param value Value to set for the roleEligibilityScheduleRequests property.
     */
    public void setRoleEligibilityScheduleRequests(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleRequest> value) {
        this.backingStore.set("roleEligibilityScheduleRequests", value);
    }
    /**
     * Sets the roleEligibilitySchedules property value. The roleEligibilitySchedules property
     * @param value Value to set for the roleEligibilitySchedules property.
     */
    public void setRoleEligibilitySchedules(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleEligibilitySchedule> value) {
        this.backingStore.set("roleEligibilitySchedules", value);
    }
    /**
     * Sets the transitiveRoleAssignments property value. The transitiveRoleAssignments property
     * @param value Value to set for the transitiveRoleAssignments property.
     */
    public void setTransitiveRoleAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.backingStore.set("transitiveRoleAssignments", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RbacApplication extends Entity implements Parsable {
    /**
     * The resourceNamespaces property
     */
    private java.util.List<UnifiedRbacResourceNamespace> resourceNamespaces;
    /**
     * The roleAssignmentApprovals property
     */
    private java.util.List<Approval> roleAssignmentApprovals;
    /**
     * The roleAssignments property
     */
    private java.util.List<UnifiedRoleAssignment> roleAssignments;
    /**
     * The roleAssignmentScheduleInstances property
     */
    private java.util.List<UnifiedRoleAssignmentScheduleInstance> roleAssignmentScheduleInstances;
    /**
     * The roleAssignmentScheduleRequests property
     */
    private java.util.List<UnifiedRoleAssignmentScheduleRequest> roleAssignmentScheduleRequests;
    /**
     * The roleAssignmentSchedules property
     */
    private java.util.List<UnifiedRoleAssignmentSchedule> roleAssignmentSchedules;
    /**
     * The roleDefinitions property
     */
    private java.util.List<UnifiedRoleDefinition> roleDefinitions;
    /**
     * The roleEligibilityScheduleInstances property
     */
    private java.util.List<UnifiedRoleEligibilityScheduleInstance> roleEligibilityScheduleInstances;
    /**
     * The roleEligibilityScheduleRequests property
     */
    private java.util.List<UnifiedRoleEligibilityScheduleRequest> roleEligibilityScheduleRequests;
    /**
     * The roleEligibilitySchedules property
     */
    private java.util.List<UnifiedRoleEligibilitySchedule> roleEligibilitySchedules;
    /**
     * The transitiveRoleAssignments property
     */
    private java.util.List<UnifiedRoleAssignment> transitiveRoleAssignments;
    /**
     * Instantiates a new rbacApplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RbacApplication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rbacApplication
     */
    @javax.annotation.Nonnull
    public static RbacApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RbacApplication();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a unifiedRbacResourceNamespace
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this.resourceNamespaces;
    }
    /**
     * Gets the roleAssignmentApprovals property value. The roleAssignmentApprovals property
     * @return a approval
     */
    @javax.annotation.Nullable
    public java.util.List<Approval> getRoleAssignmentApprovals() {
        return this.roleAssignmentApprovals;
    }
    /**
     * Gets the roleAssignments property value. The roleAssignments property
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleAssignmentScheduleInstances property value. The roleAssignmentScheduleInstances property
     * @return a unifiedRoleAssignmentScheduleInstance
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleInstance> getRoleAssignmentScheduleInstances() {
        return this.roleAssignmentScheduleInstances;
    }
    /**
     * Gets the roleAssignmentScheduleRequests property value. The roleAssignmentScheduleRequests property
     * @return a unifiedRoleAssignmentScheduleRequest
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleRequest> getRoleAssignmentScheduleRequests() {
        return this.roleAssignmentScheduleRequests;
    }
    /**
     * Gets the roleAssignmentSchedules property value. The roleAssignmentSchedules property
     * @return a unifiedRoleAssignmentSchedule
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentSchedule> getRoleAssignmentSchedules() {
        return this.roleAssignmentSchedules;
    }
    /**
     * Gets the roleDefinitions property value. The roleDefinitions property
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the roleEligibilityScheduleInstances property value. The roleEligibilityScheduleInstances property
     * @return a unifiedRoleEligibilityScheduleInstance
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleInstance> getRoleEligibilityScheduleInstances() {
        return this.roleEligibilityScheduleInstances;
    }
    /**
     * Gets the roleEligibilityScheduleRequests property value. The roleEligibilityScheduleRequests property
     * @return a unifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleRequest> getRoleEligibilityScheduleRequests() {
        return this.roleEligibilityScheduleRequests;
    }
    /**
     * Gets the roleEligibilitySchedules property value. The roleEligibilitySchedules property
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilitySchedule> getRoleEligibilitySchedules() {
        return this.roleEligibilitySchedules;
    }
    /**
     * Gets the transitiveRoleAssignments property value. The transitiveRoleAssignments property
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getTransitiveRoleAssignments() {
        return this.transitiveRoleAssignments;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceNamespaces(@javax.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this.resourceNamespaces = value;
    }
    /**
     * Sets the roleAssignmentApprovals property value. The roleAssignmentApprovals property
     * @param value Value to set for the roleAssignmentApprovals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignmentApprovals(@javax.annotation.Nullable final java.util.List<Approval> value) {
        this.roleAssignmentApprovals = value;
    }
    /**
     * Sets the roleAssignments property value. The roleAssignments property
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleAssignmentScheduleInstances property value. The roleAssignmentScheduleInstances property
     * @param value Value to set for the roleAssignmentScheduleInstances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignmentScheduleInstances(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleInstance> value) {
        this.roleAssignmentScheduleInstances = value;
    }
    /**
     * Sets the roleAssignmentScheduleRequests property value. The roleAssignmentScheduleRequests property
     * @param value Value to set for the roleAssignmentScheduleRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignmentScheduleRequests(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleRequest> value) {
        this.roleAssignmentScheduleRequests = value;
    }
    /**
     * Sets the roleAssignmentSchedules property value. The roleAssignmentSchedules property
     * @param value Value to set for the roleAssignmentSchedules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignmentSchedules(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentSchedule> value) {
        this.roleAssignmentSchedules = value;
    }
    /**
     * Sets the roleDefinitions property value. The roleDefinitions property
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the roleEligibilityScheduleInstances property value. The roleEligibilityScheduleInstances property
     * @param value Value to set for the roleEligibilityScheduleInstances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleEligibilityScheduleInstances(@javax.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleInstance> value) {
        this.roleEligibilityScheduleInstances = value;
    }
    /**
     * Sets the roleEligibilityScheduleRequests property value. The roleEligibilityScheduleRequests property
     * @param value Value to set for the roleEligibilityScheduleRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleEligibilityScheduleRequests(@javax.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleRequest> value) {
        this.roleEligibilityScheduleRequests = value;
    }
    /**
     * Sets the roleEligibilitySchedules property value. The roleEligibilitySchedules property
     * @param value Value to set for the roleEligibilitySchedules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleEligibilitySchedules(@javax.annotation.Nullable final java.util.List<UnifiedRoleEligibilitySchedule> value) {
        this.roleEligibilitySchedules = value;
    }
    /**
     * Sets the transitiveRoleAssignments property value. The transitiveRoleAssignments property
     * @param value Value to set for the transitiveRoleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.transitiveRoleAssignments = value;
    }
}

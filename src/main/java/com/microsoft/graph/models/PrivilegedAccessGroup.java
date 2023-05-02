package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedAccessGroup extends Entity implements Parsable {
    /** The assignmentApprovals property */
    private java.util.List<Approval> assignmentApprovals;
    /** The assignmentScheduleInstances property */
    private java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> assignmentScheduleInstances;
    /** The assignmentScheduleRequests property */
    private java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest> assignmentScheduleRequests;
    /** The assignmentSchedules property */
    private java.util.List<PrivilegedAccessGroupAssignmentSchedule> assignmentSchedules;
    /** The eligibilityScheduleInstances property */
    private java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance> eligibilityScheduleInstances;
    /** The eligibilityScheduleRequests property */
    private java.util.List<PrivilegedAccessGroupEligibilityScheduleRequest> eligibilityScheduleRequests;
    /** The eligibilitySchedules property */
    private java.util.List<PrivilegedAccessGroupEligibilitySchedule> eligibilitySchedules;
    /**
     * Instantiates a new privilegedAccessGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedAccessGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedAccessGroup
     */
    @javax.annotation.Nonnull
    public static PrivilegedAccessGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroup();
    }
    /**
     * Gets the assignmentApprovals property value. The assignmentApprovals property
     * @return a approval
     */
    @javax.annotation.Nullable
    public java.util.List<Approval> getAssignmentApprovals() {
        return this.assignmentApprovals;
    }
    /**
     * Gets the assignmentScheduleInstances property value. The assignmentScheduleInstances property
     * @return a privilegedAccessGroupAssignmentScheduleInstance
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> getAssignmentScheduleInstances() {
        return this.assignmentScheduleInstances;
    }
    /**
     * Gets the assignmentScheduleRequests property value. The assignmentScheduleRequests property
     * @return a privilegedAccessGroupAssignmentScheduleRequest
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest> getAssignmentScheduleRequests() {
        return this.assignmentScheduleRequests;
    }
    /**
     * Gets the assignmentSchedules property value. The assignmentSchedules property
     * @return a privilegedAccessGroupAssignmentSchedule
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentSchedule> getAssignmentSchedules() {
        return this.assignmentSchedules;
    }
    /**
     * Gets the eligibilityScheduleInstances property value. The eligibilityScheduleInstances property
     * @return a privilegedAccessGroupEligibilityScheduleInstance
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance> getEligibilityScheduleInstances() {
        return this.eligibilityScheduleInstances;
    }
    /**
     * Gets the eligibilityScheduleRequests property value. The eligibilityScheduleRequests property
     * @return a privilegedAccessGroupEligibilityScheduleRequest
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupEligibilityScheduleRequest> getEligibilityScheduleRequests() {
        return this.eligibilityScheduleRequests;
    }
    /**
     * Gets the eligibilitySchedules property value. The eligibilitySchedules property
     * @return a privilegedAccessGroupEligibilitySchedule
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupEligibilitySchedule> getEligibilitySchedules() {
        return this.eligibilitySchedules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentApprovals", (n) -> { this.setAssignmentApprovals(n.getCollectionOfObjectValues(Approval::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentScheduleInstances", (n) -> { this.setAssignmentScheduleInstances(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentScheduleRequests", (n) -> { this.setAssignmentScheduleRequests(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentSchedules", (n) -> { this.setAssignmentSchedules(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("eligibilityScheduleInstances", (n) -> { this.setEligibilityScheduleInstances(n.getCollectionOfObjectValues(PrivilegedAccessGroupEligibilityScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("eligibilityScheduleRequests", (n) -> { this.setEligibilityScheduleRequests(n.getCollectionOfObjectValues(PrivilegedAccessGroupEligibilityScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("eligibilitySchedules", (n) -> { this.setEligibilitySchedules(n.getCollectionOfObjectValues(PrivilegedAccessGroupEligibilitySchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("assignmentApprovals", this.getAssignmentApprovals());
        writer.writeCollectionOfObjectValues("assignmentScheduleInstances", this.getAssignmentScheduleInstances());
        writer.writeCollectionOfObjectValues("assignmentScheduleRequests", this.getAssignmentScheduleRequests());
        writer.writeCollectionOfObjectValues("assignmentSchedules", this.getAssignmentSchedules());
        writer.writeCollectionOfObjectValues("eligibilityScheduleInstances", this.getEligibilityScheduleInstances());
        writer.writeCollectionOfObjectValues("eligibilityScheduleRequests", this.getEligibilityScheduleRequests());
        writer.writeCollectionOfObjectValues("eligibilitySchedules", this.getEligibilitySchedules());
    }
    /**
     * Sets the assignmentApprovals property value. The assignmentApprovals property
     * @param value Value to set for the assignmentApprovals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentApprovals(@javax.annotation.Nullable final java.util.List<Approval> value) {
        this.assignmentApprovals = value;
    }
    /**
     * Sets the assignmentScheduleInstances property value. The assignmentScheduleInstances property
     * @param value Value to set for the assignmentScheduleInstances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentScheduleInstances(@javax.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> value) {
        this.assignmentScheduleInstances = value;
    }
    /**
     * Sets the assignmentScheduleRequests property value. The assignmentScheduleRequests property
     * @param value Value to set for the assignmentScheduleRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentScheduleRequests(@javax.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest> value) {
        this.assignmentScheduleRequests = value;
    }
    /**
     * Sets the assignmentSchedules property value. The assignmentSchedules property
     * @param value Value to set for the assignmentSchedules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentSchedules(@javax.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentSchedule> value) {
        this.assignmentSchedules = value;
    }
    /**
     * Sets the eligibilityScheduleInstances property value. The eligibilityScheduleInstances property
     * @param value Value to set for the eligibilityScheduleInstances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEligibilityScheduleInstances(@javax.annotation.Nullable final java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance> value) {
        this.eligibilityScheduleInstances = value;
    }
    /**
     * Sets the eligibilityScheduleRequests property value. The eligibilityScheduleRequests property
     * @param value Value to set for the eligibilityScheduleRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEligibilityScheduleRequests(@javax.annotation.Nullable final java.util.List<PrivilegedAccessGroupEligibilityScheduleRequest> value) {
        this.eligibilityScheduleRequests = value;
    }
    /**
     * Sets the eligibilitySchedules property value. The eligibilitySchedules property
     * @param value Value to set for the eligibilitySchedules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEligibilitySchedules(@javax.annotation.Nullable final java.util.List<PrivilegedAccessGroupEligibilitySchedule> value) {
        this.eligibilitySchedules = value;
    }
}

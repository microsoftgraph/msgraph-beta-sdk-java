package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignment extends Entity implements Parsable {
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     */
    private AccessPackage accessPackage;
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property
     */
    private AccessPackageAssignmentPolicy accessPackageAssignmentPolicy;
    /**
     * The accessPackageAssignmentRequests property
     */
    private java.util.List<AccessPackageAssignmentRequest> accessPackageAssignmentRequests;
    /**
     * The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     */
    private java.util.List<AccessPackageAssignmentResourceRole> accessPackageAssignmentResourceRoles;
    /**
     * The identifier of the access package. Read-only.
     */
    private String accessPackageId;
    /**
     * The identifier of the access package assignment policy. Read-only.
     */
    private String assignmentPolicyId;
    /**
     * The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only. Supports $filter (eq).
     */
    private String assignmentState;
    /**
     * More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     */
    private String assignmentStatus;
    /**
     * The identifier of the catalog containing the access package. Read-only.
     */
    private String catalogId;
    /**
     * Information about all the custom extension calls that were made during the access package assignment workflow.
     */
    private java.util.List<CustomExtensionCalloutInstance> customExtensionCalloutInstances;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime expiredDateTime;
    /**
     * Indicates whether the access package assignment is extended. Read-only.
     */
    private Boolean isExtended;
    /**
     * When the access assignment is to be in place. Read-only.
     */
    private RequestSchedule schedule;
    /**
     * The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     */
    private AccessPackageSubject target;
    /**
     * The ID of the subject with the assignment. Read-only.
     */
    private String targetId;
    /**
     * Instantiates a new accessPackageAssignment and sets the default values.
     */
    public AccessPackageAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignment
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignment();
    }
    /**
     * Gets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.accessPackage;
    }
    /**
     * Gets the accessPackageAssignmentPolicy property value. Read-only. Nullable. Supports $filter (eq) on the id property
     * @return a accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentPolicy getAccessPackageAssignmentPolicy() {
        return this.accessPackageAssignmentPolicy;
    }
    /**
     * Gets the accessPackageAssignmentRequests property value. The accessPackageAssignmentRequests property
     * @return a accessPackageAssignmentRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAccessPackageAssignmentRequests() {
        return this.accessPackageAssignmentRequests;
    }
    /**
     * Gets the accessPackageAssignmentResourceRoles property value. The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     * @return a accessPackageAssignmentResourceRole
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentResourceRole> getAccessPackageAssignmentResourceRoles() {
        return this.accessPackageAssignmentResourceRoles;
    }
    /**
     * Gets the accessPackageId property value. The identifier of the access package. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageId() {
        return this.accessPackageId;
    }
    /**
     * Gets the assignmentPolicyId property value. The identifier of the access package assignment policy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentPolicyId() {
        return this.assignmentPolicyId;
    }
    /**
     * Gets the assignmentState property value. The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only. Supports $filter (eq).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentState() {
        return this.assignmentState;
    }
    /**
     * Gets the assignmentStatus property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }
    /**
     * Gets the catalogId property value. The identifier of the catalog containing the access package. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Gets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment workflow.
     * @return a customExtensionCalloutInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionCalloutInstance> getCustomExtensionCalloutInstances() {
        return this.customExtensionCalloutInstances;
    }
    /**
     * Gets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiredDateTime() {
        return this.expiredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignmentPolicy", (n) -> { this.setAccessPackageAssignmentPolicy(n.getObjectValue(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignmentRequests", (n) -> { this.setAccessPackageAssignmentRequests(n.getCollectionOfObjectValues(AccessPackageAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignmentResourceRoles", (n) -> { this.setAccessPackageAssignmentResourceRoles(n.getCollectionOfObjectValues(AccessPackageAssignmentResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageId", (n) -> { this.setAccessPackageId(n.getStringValue()); });
        deserializerMap.put("assignmentPolicyId", (n) -> { this.setAssignmentPolicyId(n.getStringValue()); });
        deserializerMap.put("assignmentState", (n) -> { this.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("assignmentStatus", (n) -> { this.setAssignmentStatus(n.getStringValue()); });
        deserializerMap.put("catalogId", (n) -> { this.setCatalogId(n.getStringValue()); });
        deserializerMap.put("customExtensionCalloutInstances", (n) -> { this.setCustomExtensionCalloutInstances(n.getCollectionOfObjectValues(CustomExtensionCalloutInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("expiredDateTime", (n) -> { this.setExpiredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isExtended", (n) -> { this.setIsExtended(n.getBooleanValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("targetId", (n) -> { this.setTargetId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExtended property value. Indicates whether the access package assignment is extended. Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExtended() {
        return this.isExtended;
    }
    /**
     * Gets the schedule property value. When the access assignment is to be in place. Read-only.
     * @return a requestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @return a accessPackageSubject
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubject getTarget() {
        return this.target;
    }
    /**
     * Gets the targetId property value. The ID of the subject with the assignment. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("accessPackageAssignmentPolicy", this.getAccessPackageAssignmentPolicy());
        writer.writeCollectionOfObjectValues("accessPackageAssignmentRequests", this.getAccessPackageAssignmentRequests());
        writer.writeCollectionOfObjectValues("accessPackageAssignmentResourceRoles", this.getAccessPackageAssignmentResourceRoles());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
        writer.writeStringValue("assignmentPolicyId", this.getAssignmentPolicyId());
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeStringValue("assignmentStatus", this.getAssignmentStatus());
        writer.writeStringValue("catalogId", this.getCatalogId());
        writer.writeCollectionOfObjectValues("customExtensionCalloutInstances", this.getCustomExtensionCalloutInstances());
        writer.writeOffsetDateTimeValue("expiredDateTime", this.getExpiredDateTime());
        writer.writeBooleanValue("isExtended", this.getIsExtended());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("target", this.getTarget());
        writer.writeStringValue("targetId", this.getTargetId());
    }
    /**
     * Sets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.accessPackage = value;
    }
    /**
     * Sets the accessPackageAssignmentPolicy property value. Read-only. Nullable. Supports $filter (eq) on the id property
     * @param value Value to set for the accessPackageAssignmentPolicy property.
     */
    public void setAccessPackageAssignmentPolicy(@jakarta.annotation.Nullable final AccessPackageAssignmentPolicy value) {
        this.accessPackageAssignmentPolicy = value;
    }
    /**
     * Sets the accessPackageAssignmentRequests property value. The accessPackageAssignmentRequests property
     * @param value Value to set for the accessPackageAssignmentRequests property.
     */
    public void setAccessPackageAssignmentRequests(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this.accessPackageAssignmentRequests = value;
    }
    /**
     * Sets the accessPackageAssignmentResourceRoles property value. The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     * @param value Value to set for the accessPackageAssignmentResourceRoles property.
     */
    public void setAccessPackageAssignmentResourceRoles(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentResourceRole> value) {
        this.accessPackageAssignmentResourceRoles = value;
    }
    /**
     * Sets the accessPackageId property value. The identifier of the access package. Read-only.
     * @param value Value to set for the accessPackageId property.
     */
    public void setAccessPackageId(@jakarta.annotation.Nullable final String value) {
        this.accessPackageId = value;
    }
    /**
     * Sets the assignmentPolicyId property value. The identifier of the access package assignment policy. Read-only.
     * @param value Value to set for the assignmentPolicyId property.
     */
    public void setAssignmentPolicyId(@jakarta.annotation.Nullable final String value) {
        this.assignmentPolicyId = value;
    }
    /**
     * Sets the assignmentState property value. The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only. Supports $filter (eq).
     * @param value Value to set for the assignmentState property.
     */
    public void setAssignmentState(@jakarta.annotation.Nullable final String value) {
        this.assignmentState = value;
    }
    /**
     * Sets the assignmentStatus property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @param value Value to set for the assignmentStatus property.
     */
    public void setAssignmentStatus(@jakarta.annotation.Nullable final String value) {
        this.assignmentStatus = value;
    }
    /**
     * Sets the catalogId property value. The identifier of the catalog containing the access package. Read-only.
     * @param value Value to set for the catalogId property.
     */
    public void setCatalogId(@jakarta.annotation.Nullable final String value) {
        this.catalogId = value;
    }
    /**
     * Sets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment workflow.
     * @param value Value to set for the customExtensionCalloutInstances property.
     */
    public void setCustomExtensionCalloutInstances(@jakarta.annotation.Nullable final java.util.List<CustomExtensionCalloutInstance> value) {
        this.customExtensionCalloutInstances = value;
    }
    /**
     * Sets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expiredDateTime property.
     */
    public void setExpiredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiredDateTime = value;
    }
    /**
     * Sets the isExtended property value. Indicates whether the access package assignment is extended. Read-only.
     * @param value Value to set for the isExtended property.
     */
    public void setIsExtended(@jakarta.annotation.Nullable final Boolean value) {
        this.isExtended = value;
    }
    /**
     * Sets the schedule property value. When the access assignment is to be in place. Read-only.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final AccessPackageSubject value) {
        this.target = value;
    }
    /**
     * Sets the targetId property value. The ID of the subject with the assignment. Read-only.
     * @param value Value to set for the targetId property.
     */
    public void setTargetId(@jakarta.annotation.Nullable final String value) {
        this.targetId = value;
    }
}

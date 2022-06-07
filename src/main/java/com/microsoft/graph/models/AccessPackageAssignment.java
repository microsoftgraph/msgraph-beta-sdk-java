package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the identityGovernance singleton. */
public class AccessPackageAssignment extends Entity implements Parsable {
    /** Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters. */
    private AccessPackage _accessPackage;
    /** Read-only. Nullable. Supports $filter (eq) on the id property */
    private AccessPackageAssignmentPolicy _accessPackageAssignmentPolicy;
    /** The accessPackageAssignmentRequests property */
    private java.util.List<AccessPackageAssignmentRequest> _accessPackageAssignmentRequests;
    /** The resource roles delivered to the target user for this assignment. Read-only. Nullable. */
    private java.util.List<AccessPackageAssignmentResourceRole> _accessPackageAssignmentResourceRoles;
    /** The identifier of the access package. Read-only. */
    private String _accessPackageId;
    /** The identifier of the access package assignment policy. Read-only. */
    private String _assignmentPolicyId;
    /** The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only. Supports $filter (eq). */
    private String _assignmentState;
    /** More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only. */
    private String _assignmentStatus;
    /** The identifier of the catalog containing the access package. Read-only. */
    private String _catalogId;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _expiredDateTime;
    /** Indicates whether the access package assignment is extended. Read-only. */
    private Boolean _isExtended;
    /** When the access assignment is to be in place. Read-only. */
    private RequestSchedule _schedule;
    /** The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId. */
    private AccessPackageSubject _target;
    /** The ID of the subject with the assignment. Read-only. */
    private String _targetId;
    /**
     * Instantiates a new accessPackageAssignment and sets the default values.
     * @return a void
     */
    public AccessPackageAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignment
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignment();
    }
    /**
     * Gets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this._accessPackage;
    }
    /**
     * Gets the accessPackageAssignmentPolicy property value. Read-only. Nullable. Supports $filter (eq) on the id property
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentPolicy getAccessPackageAssignmentPolicy() {
        return this._accessPackageAssignmentPolicy;
    }
    /**
     * Gets the accessPackageAssignmentRequests property value. The accessPackageAssignmentRequests property
     * @return a accessPackageAssignmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAccessPackageAssignmentRequests() {
        return this._accessPackageAssignmentRequests;
    }
    /**
     * Gets the accessPackageAssignmentResourceRoles property value. The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     * @return a accessPackageAssignmentResourceRole
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentResourceRole> getAccessPackageAssignmentResourceRoles() {
        return this._accessPackageAssignmentResourceRoles;
    }
    /**
     * Gets the accessPackageId property value. The identifier of the access package. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessPackageId() {
        return this._accessPackageId;
    }
    /**
     * Gets the assignmentPolicyId property value. The identifier of the access package assignment policy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentPolicyId() {
        return this._assignmentPolicyId;
    }
    /**
     * Gets the assignmentState property value. The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentState() {
        return this._assignmentState;
    }
    /**
     * Gets the assignmentStatus property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentStatus() {
        return this._assignmentStatus;
    }
    /**
     * Gets the catalogId property value. The identifier of the catalog containing the access package. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCatalogId() {
        return this._catalogId;
    }
    /**
     * Gets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiredDateTime() {
        return this._expiredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessPackage", (n) -> { currentObject.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
            this.put("accessPackageAssignmentPolicy", (n) -> { currentObject.setAccessPackageAssignmentPolicy(n.getObjectValue(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
            this.put("accessPackageAssignmentRequests", (n) -> { currentObject.setAccessPackageAssignmentRequests(n.getCollectionOfObjectValues(AccessPackageAssignmentRequest::createFromDiscriminatorValue)); });
            this.put("accessPackageAssignmentResourceRoles", (n) -> { currentObject.setAccessPackageAssignmentResourceRoles(n.getCollectionOfObjectValues(AccessPackageAssignmentResourceRole::createFromDiscriminatorValue)); });
            this.put("accessPackageId", (n) -> { currentObject.setAccessPackageId(n.getStringValue()); });
            this.put("assignmentPolicyId", (n) -> { currentObject.setAssignmentPolicyId(n.getStringValue()); });
            this.put("assignmentState", (n) -> { currentObject.setAssignmentState(n.getStringValue()); });
            this.put("assignmentStatus", (n) -> { currentObject.setAssignmentStatus(n.getStringValue()); });
            this.put("catalogId", (n) -> { currentObject.setCatalogId(n.getStringValue()); });
            this.put("expiredDateTime", (n) -> { currentObject.setExpiredDateTime(n.getOffsetDateTimeValue()); });
            this.put("isExtended", (n) -> { currentObject.setIsExtended(n.getBooleanValue()); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
            this.put("targetId", (n) -> { currentObject.setTargetId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isExtended property value. Indicates whether the access package assignment is extended. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExtended() {
        return this._isExtended;
    }
    /**
     * Gets the schedule property value. When the access assignment is to be in place. Read-only.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Gets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @return a accessPackageSubject
     */
    @javax.annotation.Nullable
    public AccessPackageSubject getTarget() {
        return this._target;
    }
    /**
     * Gets the targetId property value. The ID of the subject with the assignment. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetId() {
        return this._targetId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeOffsetDateTimeValue("expiredDateTime", this.getExpiredDateTime());
        writer.writeBooleanValue("isExtended", this.getIsExtended());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("target", this.getTarget());
        writer.writeStringValue("targetId", this.getTargetId());
    }
    /**
     * Sets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param value Value to set for the accessPackage property.
     * @return a void
     */
    public void setAccessPackage(@javax.annotation.Nullable final AccessPackage value) {
        this._accessPackage = value;
    }
    /**
     * Sets the accessPackageAssignmentPolicy property value. Read-only. Nullable. Supports $filter (eq) on the id property
     * @param value Value to set for the accessPackageAssignmentPolicy property.
     * @return a void
     */
    public void setAccessPackageAssignmentPolicy(@javax.annotation.Nullable final AccessPackageAssignmentPolicy value) {
        this._accessPackageAssignmentPolicy = value;
    }
    /**
     * Sets the accessPackageAssignmentRequests property value. The accessPackageAssignmentRequests property
     * @param value Value to set for the accessPackageAssignmentRequests property.
     * @return a void
     */
    public void setAccessPackageAssignmentRequests(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this._accessPackageAssignmentRequests = value;
    }
    /**
     * Sets the accessPackageAssignmentResourceRoles property value. The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     * @param value Value to set for the accessPackageAssignmentResourceRoles property.
     * @return a void
     */
    public void setAccessPackageAssignmentResourceRoles(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentResourceRole> value) {
        this._accessPackageAssignmentResourceRoles = value;
    }
    /**
     * Sets the accessPackageId property value. The identifier of the access package. Read-only.
     * @param value Value to set for the accessPackageId property.
     * @return a void
     */
    public void setAccessPackageId(@javax.annotation.Nullable final String value) {
        this._accessPackageId = value;
    }
    /**
     * Sets the assignmentPolicyId property value. The identifier of the access package assignment policy. Read-only.
     * @param value Value to set for the assignmentPolicyId property.
     * @return a void
     */
    public void setAssignmentPolicyId(@javax.annotation.Nullable final String value) {
        this._assignmentPolicyId = value;
    }
    /**
     * Sets the assignmentState property value. The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only. Supports $filter (eq).
     * @param value Value to set for the assignmentState property.
     * @return a void
     */
    public void setAssignmentState(@javax.annotation.Nullable final String value) {
        this._assignmentState = value;
    }
    /**
     * Sets the assignmentStatus property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @param value Value to set for the assignmentStatus property.
     * @return a void
     */
    public void setAssignmentStatus(@javax.annotation.Nullable final String value) {
        this._assignmentStatus = value;
    }
    /**
     * Sets the catalogId property value. The identifier of the catalog containing the access package. Read-only.
     * @param value Value to set for the catalogId property.
     * @return a void
     */
    public void setCatalogId(@javax.annotation.Nullable final String value) {
        this._catalogId = value;
    }
    /**
     * Sets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expiredDateTime property.
     * @return a void
     */
    public void setExpiredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiredDateTime = value;
    }
    /**
     * Sets the isExtended property value. Indicates whether the access package assignment is extended. Read-only.
     * @param value Value to set for the isExtended property.
     * @return a void
     */
    public void setIsExtended(@javax.annotation.Nullable final Boolean value) {
        this._isExtended = value;
    }
    /**
     * Sets the schedule property value. When the access assignment is to be in place. Read-only.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final RequestSchedule value) {
        this._schedule = value;
    }
    /**
     * Sets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final AccessPackageSubject value) {
        this._target = value;
    }
    /**
     * Sets the targetId property value. The ID of the subject with the assignment. Read-only.
     * @param value Value to set for the targetId property.
     * @return a void
     */
    public void setTargetId(@javax.annotation.Nullable final String value) {
        this._targetId = value;
    }
}

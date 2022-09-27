package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AccessPackageAssignmentRequest extends Entity implements Parsable {
    /** The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable. Supports $expand. */
    private AccessPackage _accessPackage;
    /** For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand. */
    private AccessPackageAssignment _accessPackageAssignment;
    /** Answers provided by the requestor to accessPackageQuestions asked of them at the time of request. */
    private java.util.List<AccessPackageAnswer> _answers;
    /** The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _completedDate;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** A collection of custom workflow extension instances being run on an assignment request. Read-only. */
    private java.util.List<CustomExtensionHandlerInstance> _customExtensionHandlerInstances;
    /** The expirationDateTime property */
    private OffsetDateTime _expirationDateTime;
    /** True if the request is not to be processed for assignment. */
    private Boolean _isValidationOnly;
    /** The requestor's supplied justification. */
    private String _justification;
    /** The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand. */
    private AccessPackageSubject _requestor;
    /** One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only. */
    private String _requestState;
    /** More information on the request processing status. Read-only. */
    private String _requestStatus;
    /** One of UserAdd, UserExtend, UserUpdate, UserRemove, AdminAdd, AdminRemove or SystemRemove. A request from the user themselves would have requestType of UserAdd, UserUpdate or UserRemove. Read-only. */
    private String _requestType;
    /** The range of dates that access is to be assigned to the requestor. Read-only. */
    private RequestSchedule _schedule;
    /**
     * Instantiates a new accessPackageAssignmentRequest and sets the default values.
     * @return a void
     */
    public AccessPackageAssignmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequest
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequest();
    }
    /**
     * Gets the accessPackage property value. The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable. Supports $expand.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this._accessPackage;
    }
    /**
     * Gets the accessPackageAssignment property value. For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand.
     * @return a accessPackageAssignment
     */
    @javax.annotation.Nullable
    public AccessPackageAssignment getAccessPackageAssignment() {
        return this._accessPackageAssignment;
    }
    /**
     * Gets the answers property value. Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     * @return a accessPackageAnswer
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAnswer> getAnswers() {
        return this._answers;
    }
    /**
     * Gets the completedDate property value. The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDate() {
        return this._completedDate;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the customExtensionHandlerInstances property value. A collection of custom workflow extension instances being run on an assignment request. Read-only.
     * @return a customExtensionHandlerInstance
     */
    @javax.annotation.Nullable
    public java.util.List<CustomExtensionHandlerInstance> getCustomExtensionHandlerInstances() {
        return this._customExtensionHandlerInstances;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentRequest currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackage", (n) -> { currentObject.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
            this.put("accessPackageAssignment", (n) -> { currentObject.setAccessPackageAssignment(n.getObjectValue(AccessPackageAssignment::createFromDiscriminatorValue)); });
            this.put("answers", (n) -> { currentObject.setAnswers(n.getCollectionOfObjectValues(AccessPackageAnswer::createFromDiscriminatorValue)); });
            this.put("completedDate", (n) -> { currentObject.setCompletedDate(n.getOffsetDateTimeValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customExtensionHandlerInstances", (n) -> { currentObject.setCustomExtensionHandlerInstances(n.getCollectionOfObjectValues(CustomExtensionHandlerInstance::createFromDiscriminatorValue)); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("isValidationOnly", (n) -> { currentObject.setIsValidationOnly(n.getBooleanValue()); });
            this.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
            this.put("requestor", (n) -> { currentObject.setRequestor(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
            this.put("requestState", (n) -> { currentObject.setRequestState(n.getStringValue()); });
            this.put("requestStatus", (n) -> { currentObject.setRequestStatus(n.getStringValue()); });
            this.put("requestType", (n) -> { currentObject.setRequestType(n.getStringValue()); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isValidationOnly property value. True if the request is not to be processed for assignment.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this._isValidationOnly;
    }
    /**
     * Gets the justification property value. The requestor's supplied justification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the requestor property value. The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     * @return a accessPackageSubject
     */
    @javax.annotation.Nullable
    public AccessPackageSubject getRequestor() {
        return this._requestor;
    }
    /**
     * Gets the requestState property value. One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestState() {
        return this._requestState;
    }
    /**
     * Gets the requestStatus property value. More information on the request processing status. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestStatus() {
        return this._requestStatus;
    }
    /**
     * Gets the requestType property value. One of UserAdd, UserExtend, UserUpdate, UserRemove, AdminAdd, AdminRemove or SystemRemove. A request from the user themselves would have requestType of UserAdd, UserUpdate or UserRemove. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestType() {
        return this._requestType;
    }
    /**
     * Gets the schedule property value. The range of dates that access is to be assigned to the requestor. Read-only.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this._schedule;
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
        writer.writeObjectValue("accessPackageAssignment", this.getAccessPackageAssignment());
        writer.writeCollectionOfObjectValues("answers", this.getAnswers());
        writer.writeOffsetDateTimeValue("completedDate", this.getCompletedDate());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionHandlerInstances", this.getCustomExtensionHandlerInstances());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("requestor", this.getRequestor());
        writer.writeStringValue("requestState", this.getRequestState());
        writer.writeStringValue("requestStatus", this.getRequestStatus());
        writer.writeStringValue("requestType", this.getRequestType());
        writer.writeObjectValue("schedule", this.getSchedule());
    }
    /**
     * Sets the accessPackage property value. The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackage property.
     * @return a void
     */
    public void setAccessPackage(@javax.annotation.Nullable final AccessPackage value) {
        this._accessPackage = value;
    }
    /**
     * Sets the accessPackageAssignment property value. For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand.
     * @param value Value to set for the accessPackageAssignment property.
     * @return a void
     */
    public void setAccessPackageAssignment(@javax.annotation.Nullable final AccessPackageAssignment value) {
        this._accessPackageAssignment = value;
    }
    /**
     * Sets the answers property value. Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     * @param value Value to set for the answers property.
     * @return a void
     */
    public void setAnswers(@javax.annotation.Nullable final java.util.List<AccessPackageAnswer> value) {
        this._answers = value;
    }
    /**
     * Sets the completedDate property value. The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the completedDate property.
     * @return a void
     */
    public void setCompletedDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDate = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the customExtensionHandlerInstances property value. A collection of custom workflow extension instances being run on an assignment request. Read-only.
     * @param value Value to set for the customExtensionHandlerInstances property.
     * @return a void
     */
    public void setCustomExtensionHandlerInstances(@javax.annotation.Nullable final java.util.List<CustomExtensionHandlerInstance> value) {
        this._customExtensionHandlerInstances = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the isValidationOnly property value. True if the request is not to be processed for assignment.
     * @param value Value to set for the isValidationOnly property.
     * @return a void
     */
    public void setIsValidationOnly(@javax.annotation.Nullable final Boolean value) {
        this._isValidationOnly = value;
    }
    /**
     * Sets the justification property value. The requestor's supplied justification.
     * @param value Value to set for the justification property.
     * @return a void
     */
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the requestor property value. The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the requestor property.
     * @return a void
     */
    public void setRequestor(@javax.annotation.Nullable final AccessPackageSubject value) {
        this._requestor = value;
    }
    /**
     * Sets the requestState property value. One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only.
     * @param value Value to set for the requestState property.
     * @return a void
     */
    public void setRequestState(@javax.annotation.Nullable final String value) {
        this._requestState = value;
    }
    /**
     * Sets the requestStatus property value. More information on the request processing status. Read-only.
     * @param value Value to set for the requestStatus property.
     * @return a void
     */
    public void setRequestStatus(@javax.annotation.Nullable final String value) {
        this._requestStatus = value;
    }
    /**
     * Sets the requestType property value. One of UserAdd, UserExtend, UserUpdate, UserRemove, AdminAdd, AdminRemove or SystemRemove. A request from the user themselves would have requestType of UserAdd, UserUpdate or UserRemove. Read-only.
     * @param value Value to set for the requestType property.
     * @return a void
     */
    public void setRequestType(@javax.annotation.Nullable final String value) {
        this._requestType = value;
    }
    /**
     * Sets the schedule property value. The range of dates that access is to be assigned to the requestor. Read-only.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final RequestSchedule value) {
        this._schedule = value;
    }
}

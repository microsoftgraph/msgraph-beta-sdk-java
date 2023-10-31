package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentRequest extends Entity implements Parsable {
    /**
     * The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable. Supports $expand.
     */
    private AccessPackage accessPackage;
    /**
     * For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand.
     */
    private AccessPackageAssignment accessPackageAssignment;
    /**
     * Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     */
    private java.util.List<AccessPackageAnswer> answers;
    /**
     * The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime completedDate;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Information about all the custom extension calls that were made during the access package assignment request workflow.
     */
    private java.util.List<CustomExtensionCalloutInstance> customExtensionCalloutInstances;
    /**
     * A collection of custom workflow extension instances being run on an assignment request. Read-only.
     */
    private java.util.List<CustomExtensionHandlerInstance> customExtensionHandlerInstances;
    /**
     * The expirationDateTime property
     */
    private OffsetDateTime expirationDateTime;
    /**
     * True if the request is not to be processed for assignment.
     */
    private Boolean isValidationOnly;
    /**
     * The requestor's supplied justification.
     */
    private String justification;
    /**
     * The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     */
    private AccessPackageSubject requestor;
    /**
     * One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only.
     */
    private String requestState;
    /**
     * More information on the request processing status. Read-only.
     */
    private String requestStatus;
    /**
     * One of UserAdd, UserExtend, UserUpdate, UserRemove, AdminAdd, AdminRemove or SystemRemove. A request from the user themselves would have requestType of UserAdd, UserUpdate or UserRemove. Read-only.
     */
    private String requestType;
    /**
     * The range of dates that access is to be assigned to the requestor. Read-only.
     */
    private RequestSchedule schedule;
    /**
     * The details of the verifiable credential that was presented by the requestor, such as the issuer and claims. Read-only.
     */
    private java.util.List<VerifiedCredentialData> verifiedCredentialsData;
    /**
     * Instantiates a new AccessPackageAssignmentRequest and sets the default values.
     */
    public AccessPackageAssignmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageAssignmentRequest
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequest();
    }
    /**
     * Gets the accessPackage property value. The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable. Supports $expand.
     * @return a AccessPackage
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.accessPackage;
    }
    /**
     * Gets the accessPackageAssignment property value. For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand.
     * @return a AccessPackageAssignment
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment getAccessPackageAssignment() {
        return this.accessPackageAssignment;
    }
    /**
     * Gets the answers property value. Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     * @return a java.util.List<AccessPackageAnswer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAnswer> getAnswers() {
        return this.answers;
    }
    /**
     * Gets the completedDate property value. The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDate() {
        return this.completedDate;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment request workflow.
     * @return a java.util.List<CustomExtensionCalloutInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionCalloutInstance> getCustomExtensionCalloutInstances() {
        return this.customExtensionCalloutInstances;
    }
    /**
     * Gets the customExtensionHandlerInstances property value. A collection of custom workflow extension instances being run on an assignment request. Read-only.
     * @return a java.util.List<CustomExtensionHandlerInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionHandlerInstance> getCustomExtensionHandlerInstances() {
        return this.customExtensionHandlerInstances;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignment", (n) -> { this.setAccessPackageAssignment(n.getObjectValue(AccessPackageAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("answers", (n) -> { this.setAnswers(n.getCollectionOfObjectValues(AccessPackageAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDate", (n) -> { this.setCompletedDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customExtensionCalloutInstances", (n) -> { this.setCustomExtensionCalloutInstances(n.getCollectionOfObjectValues(CustomExtensionCalloutInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtensionHandlerInstances", (n) -> { this.setCustomExtensionHandlerInstances(n.getCollectionOfObjectValues(CustomExtensionHandlerInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isValidationOnly", (n) -> { this.setIsValidationOnly(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("requestor", (n) -> { this.setRequestor(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("requestState", (n) -> { this.setRequestState(n.getStringValue()); });
        deserializerMap.put("requestStatus", (n) -> { this.setRequestStatus(n.getStringValue()); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getStringValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedCredentialsData", (n) -> { this.setVerifiedCredentialsData(n.getCollectionOfObjectValues(VerifiedCredentialData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isValidationOnly property value. True if the request is not to be processed for assignment.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this.isValidationOnly;
    }
    /**
     * Gets the justification property value. The requestor's supplied justification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the requestor property value. The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     * @return a AccessPackageSubject
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubject getRequestor() {
        return this.requestor;
    }
    /**
     * Gets the requestState property value. One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestState() {
        return this.requestState;
    }
    /**
     * Gets the requestStatus property value. More information on the request processing status. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestStatus() {
        return this.requestStatus;
    }
    /**
     * Gets the requestType property value. One of UserAdd, UserExtend, UserUpdate, UserRemove, AdminAdd, AdminRemove or SystemRemove. A request from the user themselves would have requestType of UserAdd, UserUpdate or UserRemove. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestType() {
        return this.requestType;
    }
    /**
     * Gets the schedule property value. The range of dates that access is to be assigned to the requestor. Read-only.
     * @return a RequestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the verifiedCredentialsData property value. The details of the verifiable credential that was presented by the requestor, such as the issuer and claims. Read-only.
     * @return a java.util.List<VerifiedCredentialData>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VerifiedCredentialData> getVerifiedCredentialsData() {
        return this.verifiedCredentialsData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("accessPackageAssignment", this.getAccessPackageAssignment());
        writer.writeCollectionOfObjectValues("answers", this.getAnswers());
        writer.writeOffsetDateTimeValue("completedDate", this.getCompletedDate());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionCalloutInstances", this.getCustomExtensionCalloutInstances());
        writer.writeCollectionOfObjectValues("customExtensionHandlerInstances", this.getCustomExtensionHandlerInstances());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("requestor", this.getRequestor());
        writer.writeStringValue("requestState", this.getRequestState());
        writer.writeStringValue("requestStatus", this.getRequestStatus());
        writer.writeStringValue("requestType", this.getRequestType());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeCollectionOfObjectValues("verifiedCredentialsData", this.getVerifiedCredentialsData());
    }
    /**
     * Sets the accessPackage property value. The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.accessPackage = value;
    }
    /**
     * Sets the accessPackageAssignment property value. For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand.
     * @param value Value to set for the accessPackageAssignment property.
     */
    public void setAccessPackageAssignment(@jakarta.annotation.Nullable final AccessPackageAssignment value) {
        this.accessPackageAssignment = value;
    }
    /**
     * Sets the answers property value. Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     * @param value Value to set for the answers property.
     */
    public void setAnswers(@jakarta.annotation.Nullable final java.util.List<AccessPackageAnswer> value) {
        this.answers = value;
    }
    /**
     * Sets the completedDate property value. The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the completedDate property.
     */
    public void setCompletedDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedDate = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment request workflow.
     * @param value Value to set for the customExtensionCalloutInstances property.
     */
    public void setCustomExtensionCalloutInstances(@jakarta.annotation.Nullable final java.util.List<CustomExtensionCalloutInstance> value) {
        this.customExtensionCalloutInstances = value;
    }
    /**
     * Sets the customExtensionHandlerInstances property value. A collection of custom workflow extension instances being run on an assignment request. Read-only.
     * @param value Value to set for the customExtensionHandlerInstances property.
     */
    public void setCustomExtensionHandlerInstances(@jakarta.annotation.Nullable final java.util.List<CustomExtensionHandlerInstance> value) {
        this.customExtensionHandlerInstances = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the isValidationOnly property value. True if the request is not to be processed for assignment.
     * @param value Value to set for the isValidationOnly property.
     */
    public void setIsValidationOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.isValidationOnly = value;
    }
    /**
     * Sets the justification property value. The requestor's supplied justification.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the requestor property value. The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the requestor property.
     */
    public void setRequestor(@jakarta.annotation.Nullable final AccessPackageSubject value) {
        this.requestor = value;
    }
    /**
     * Sets the requestState property value. One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only.
     * @param value Value to set for the requestState property.
     */
    public void setRequestState(@jakarta.annotation.Nullable final String value) {
        this.requestState = value;
    }
    /**
     * Sets the requestStatus property value. More information on the request processing status. Read-only.
     * @param value Value to set for the requestStatus property.
     */
    public void setRequestStatus(@jakarta.annotation.Nullable final String value) {
        this.requestStatus = value;
    }
    /**
     * Sets the requestType property value. One of UserAdd, UserExtend, UserUpdate, UserRemove, AdminAdd, AdminRemove or SystemRemove. A request from the user themselves would have requestType of UserAdd, UserUpdate or UserRemove. Read-only.
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final String value) {
        this.requestType = value;
    }
    /**
     * Sets the schedule property value. The range of dates that access is to be assigned to the requestor. Read-only.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the verifiedCredentialsData property value. The details of the verifiable credential that was presented by the requestor, such as the issuer and claims. Read-only.
     * @param value Value to set for the verifiedCredentialsData property.
     */
    public void setVerifiedCredentialsData(@jakarta.annotation.Nullable final java.util.List<VerifiedCredentialData> value) {
        this.verifiedCredentialsData = value;
    }
}

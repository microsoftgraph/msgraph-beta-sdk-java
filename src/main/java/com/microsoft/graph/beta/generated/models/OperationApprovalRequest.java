package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The OperationApprovalRequest entity encompasses the operation an admin wishes to perform and is requesting approval to complete. It contains the detail of the operation one wishes to perform, user metadata of the requestor, and a justification for the change. It allows for several operations for both the requestor and the potential approver to either approve, deny, or cancel the request and a response justification to provide information for the decision.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationApprovalRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OperationApprovalRequest} and sets the default values.
     */
    public OperationApprovalRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperationApprovalRequest}
     */
    @jakarta.annotation.Nonnull
    public static OperationApprovalRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperationApprovalRequest();
    }
    /**
     * Gets the approvalJustification property value. Indicates the justification for approving or rejecting the request. Maximum length of justification is 1024 characters. For example: 'Approved per Change 23423 - needed for Feb 2023 application baseline updates.' Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApprovalJustification() {
        return this.backingStore.get("approvalJustification");
    }
    /**
     * Gets the approver property value. The identity of the approver as an Identity Set. Optionally contains the application ID, the device ID and the User ID. See information about this type here: https://learn.microsoft.com/graph/api/resources/identityset?view=graph-rest-1.0. Read-only. This property is read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getApprover() {
        return this.backingStore.get("approver");
    }
    /**
     * Gets the expirationDateTime property value. Indicates the DateTime when any action on the approval request is no longer permitted. The value cannot be modified and is automatically populated when the request is created using expiration offset values defined in the service controllers. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalJustification", (n) -> { this.setApprovalJustification(n.getStringValue()); });
        deserializerMap.put("approver", (n) -> { this.setApprover(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestJustification", (n) -> { this.setRequestJustification(n.getStringValue()); });
        deserializerMap.put("requestor", (n) -> { this.setRequestor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("requiredOperationApprovalPolicyTypes", (n) -> { this.setRequiredOperationApprovalPolicyTypes(n.getCollectionOfEnumValues(OperationApprovalPolicyType::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OperationApprovalRequestStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Indicates the last DateTime that the request was modified. The value cannot be modified and is automatically populated whenever values in the request are updated. For example, when the 'status' property changes from needsApproval to approved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the requestDateTime property value. Indicates the DateTime that the request was made. The value cannot be modified and is automatically populated when the request is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.backingStore.get("requestDateTime");
    }
    /**
     * Gets the requestJustification property value. Indicates the justification for creating the request. Maximum length of justification is 1024 characters. For example: 'Needed for Feb 2023 application baseline updates.' Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestJustification() {
        return this.backingStore.get("requestJustification");
    }
    /**
     * Gets the requestor property value. The identity of the requestor as an Identity Set. Optionally contains the application ID, the device ID and the User ID. See information about this type here: https://learn.microsoft.com/graph/api/resources/identityset?view=graph-rest-1.0. Read-only. This property is read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getRequestor() {
        return this.backingStore.get("requestor");
    }
    /**
     * Gets the requiredOperationApprovalPolicyTypes property value. Indicates the approval policy types required by the request in order for the request to be approved or rejected. Read-only. This property is read-only.
     * @return a {@link java.util.List<OperationApprovalPolicyType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperationApprovalPolicyType> getRequiredOperationApprovalPolicyTypes() {
        return this.backingStore.get("requiredOperationApprovalPolicyTypes");
    }
    /**
     * Gets the status property value. Indicates the status of the Approval Request. The status of a request will change when an action is successfully performed on it, such as when it is `approved` or `rejected`, or when the request's expiration DateTime passes and the result is `expired`.
     * @return a {@link OperationApprovalRequestStatus}
     */
    @jakarta.annotation.Nullable
    public OperationApprovalRequestStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the approvalJustification property value. Indicates the justification for approving or rejecting the request. Maximum length of justification is 1024 characters. For example: 'Approved per Change 23423 - needed for Feb 2023 application baseline updates.' Read-only. This property is read-only.
     * @param value Value to set for the approvalJustification property.
     */
    public void setApprovalJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("approvalJustification", value);
    }
    /**
     * Sets the approver property value. The identity of the approver as an Identity Set. Optionally contains the application ID, the device ID and the User ID. See information about this type here: https://learn.microsoft.com/graph/api/resources/identityset?view=graph-rest-1.0. Read-only. This property is read-only.
     * @param value Value to set for the approver property.
     */
    public void setApprover(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("approver", value);
    }
    /**
     * Sets the expirationDateTime property value. Indicates the DateTime when any action on the approval request is no longer permitted. The value cannot be modified and is automatically populated when the request is created using expiration offset values defined in the service controllers. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Indicates the last DateTime that the request was modified. The value cannot be modified and is automatically populated whenever values in the request are updated. For example, when the 'status' property changes from needsApproval to approved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the requestDateTime property value. Indicates the DateTime that the request was made. The value cannot be modified and is automatically populated when the request is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestDateTime", value);
    }
    /**
     * Sets the requestJustification property value. Indicates the justification for creating the request. Maximum length of justification is 1024 characters. For example: 'Needed for Feb 2023 application baseline updates.' Read-only. This property is read-only.
     * @param value Value to set for the requestJustification property.
     */
    public void setRequestJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestJustification", value);
    }
    /**
     * Sets the requestor property value. The identity of the requestor as an Identity Set. Optionally contains the application ID, the device ID and the User ID. See information about this type here: https://learn.microsoft.com/graph/api/resources/identityset?view=graph-rest-1.0. Read-only. This property is read-only.
     * @param value Value to set for the requestor property.
     */
    public void setRequestor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("requestor", value);
    }
    /**
     * Sets the requiredOperationApprovalPolicyTypes property value. Indicates the approval policy types required by the request in order for the request to be approved or rejected. Read-only. This property is read-only.
     * @param value Value to set for the requiredOperationApprovalPolicyTypes property.
     */
    public void setRequiredOperationApprovalPolicyTypes(@jakarta.annotation.Nullable final java.util.List<OperationApprovalPolicyType> value) {
        this.backingStore.set("requiredOperationApprovalPolicyTypes", value);
    }
    /**
     * Sets the status property value. Indicates the status of the Approval Request. The status of a request will change when an action is successfully performed on it, such as when it is `approved` or `rejected`, or when the request's expiration DateTime passes and the result is `expired`.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final OperationApprovalRequestStatus value) {
        this.backingStore.set("status", value);
    }
}

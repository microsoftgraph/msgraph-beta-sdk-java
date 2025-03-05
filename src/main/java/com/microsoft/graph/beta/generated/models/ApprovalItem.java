package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalItem extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApprovalItem} and sets the default values.
     */
    public ApprovalItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalItem}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalItem();
    }
    /**
     * Gets the allowCancel property value. Indicates whether the approval item can be canceled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCancel() {
        return this.backingStore.get("allowCancel");
    }
    /**
     * Gets the allowEmailNotification property value. Indicates whether email notification is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEmailNotification() {
        return this.backingStore.get("allowEmailNotification");
    }
    /**
     * Gets the approvalType property value. The workflow type of the approval item. The possible values are: basic, basicAwaitAll, custom, customAwaitAll. Required.
     * @return a {@link ApprovalItemType}
     */
    @jakarta.annotation.Nullable
    public ApprovalItemType getApprovalType() {
        return this.backingStore.get("approvalType");
    }
    /**
     * Gets the approvers property value. The identity of the principals to whom the approval item was initially assigned. Required.
     * @return a {@link java.util.List<ApprovalIdentitySet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalIdentitySet> getApprovers() {
        return this.backingStore.get("approvers");
    }
    /**
     * Gets the completedDateTime property value. Approval request completion date and time. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdDateTime property value. Creation date and time of the approval request. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of the approval request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName of the approval request. Required.
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
        deserializerMap.put("allowCancel", (n) -> { this.setAllowCancel(n.getBooleanValue()); });
        deserializerMap.put("allowEmailNotification", (n) -> { this.setAllowEmailNotification(n.getBooleanValue()); });
        deserializerMap.put("approvalType", (n) -> { this.setApprovalType(n.getEnumValue(ApprovalItemType::forValue)); });
        deserializerMap.put("approvers", (n) -> { this.setApprovers(n.getCollectionOfObjectValues(ApprovalIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(ApprovalIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(ApprovalItemRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("responsePrompts", (n) -> { this.setResponsePrompts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("responses", (n) -> { this.setResponses(n.getCollectionOfObjectValues(ApprovalItemResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ApprovalItemState::forValue)); });
        deserializerMap.put("viewPoint", (n) -> { this.setViewPoint(n.getObjectValue(ApprovalItemViewPoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the owner property value. The identity set of the principal who owns the approval item. Only provide a value for this property when creating an approval item on behalf of the principal. If the owner field isn&apos;t provided, the user information from the user context is used.
     * @return a {@link ApprovalIdentitySet}
     */
    @jakarta.annotation.Nullable
    public ApprovalIdentitySet getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the requests property value. A collection of requests created for each approver on the approval item.
     * @return a {@link java.util.List<ApprovalItemRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalItemRequest> getRequests() {
        return this.backingStore.get("requests");
    }
    /**
     * Gets the responsePrompts property value. Approval response prompts. Only provide a value for this property when creating a custom approval item. For custom approval items, supply two response prompt strings. The default response prompts are &apos;Approve&apos; and &apos;Reject&apos;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResponsePrompts() {
        return this.backingStore.get("responsePrompts");
    }
    /**
     * Gets the responses property value. A collection of responses created for the approval item.
     * @return a {@link java.util.List<ApprovalItemResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalItemResponse> getResponses() {
        return this.backingStore.get("responses");
    }
    /**
     * Gets the result property value. The result field is only populated once the approval item is in its final state. The result of the approval item is based on the approvalType. For basic approval items, the result is either &apos;Approved&apos; or &apos;Rejected&apos;. For custom approval items, the result could either be a single response or multiple responses separated by a semi-colon. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResult() {
        return this.backingStore.get("result");
    }
    /**
     * Gets the state property value. The approval item state. The possible values are: canceled, created, pending, completed. Read-only.
     * @return a {@link ApprovalItemState}
     */
    @jakarta.annotation.Nullable
    public ApprovalItemState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the viewPoint property value. Represents user viewpoints data on the ApprovalItem. The data includes the users roles regarding the approval item. Read-only.
     * @return a {@link ApprovalItemViewPoint}
     */
    @jakarta.annotation.Nullable
    public ApprovalItemViewPoint getViewPoint() {
        return this.backingStore.get("viewPoint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowEmailNotification", this.getAllowEmailNotification());
        writer.writeEnumValue("approvalType", this.getApprovalType());
        writer.writeCollectionOfObjectValues("approvers", this.getApprovers());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
        writer.writeCollectionOfPrimitiveValues("responsePrompts", this.getResponsePrompts());
        writer.writeCollectionOfObjectValues("responses", this.getResponses());
    }
    /**
     * Sets the allowCancel property value. Indicates whether the approval item can be canceled.
     * @param value Value to set for the allowCancel property.
     */
    public void setAllowCancel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCancel", value);
    }
    /**
     * Sets the allowEmailNotification property value. Indicates whether email notification is enabled.
     * @param value Value to set for the allowEmailNotification property.
     */
    public void setAllowEmailNotification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowEmailNotification", value);
    }
    /**
     * Sets the approvalType property value. The workflow type of the approval item. The possible values are: basic, basicAwaitAll, custom, customAwaitAll. Required.
     * @param value Value to set for the approvalType property.
     */
    public void setApprovalType(@jakarta.annotation.Nullable final ApprovalItemType value) {
        this.backingStore.set("approvalType", value);
    }
    /**
     * Sets the approvers property value. The identity of the principals to whom the approval item was initially assigned. Required.
     * @param value Value to set for the approvers property.
     */
    public void setApprovers(@jakarta.annotation.Nullable final java.util.List<ApprovalIdentitySet> value) {
        this.backingStore.set("approvers", value);
    }
    /**
     * Sets the completedDateTime property value. Approval request completion date and time. Read-only.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. Creation date and time of the approval request. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of the approval request.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName of the approval request. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the owner property value. The identity set of the principal who owns the approval item. Only provide a value for this property when creating an approval item on behalf of the principal. If the owner field isn&apos;t provided, the user information from the user context is used.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final ApprovalIdentitySet value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the requests property value. A collection of requests created for each approver on the approval item.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<ApprovalItemRequest> value) {
        this.backingStore.set("requests", value);
    }
    /**
     * Sets the responsePrompts property value. Approval response prompts. Only provide a value for this property when creating a custom approval item. For custom approval items, supply two response prompt strings. The default response prompts are &apos;Approve&apos; and &apos;Reject&apos;.
     * @param value Value to set for the responsePrompts property.
     */
    public void setResponsePrompts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("responsePrompts", value);
    }
    /**
     * Sets the responses property value. A collection of responses created for the approval item.
     * @param value Value to set for the responses property.
     */
    public void setResponses(@jakarta.annotation.Nullable final java.util.List<ApprovalItemResponse> value) {
        this.backingStore.set("responses", value);
    }
    /**
     * Sets the result property value. The result field is only populated once the approval item is in its final state. The result of the approval item is based on the approvalType. For basic approval items, the result is either &apos;Approved&apos; or &apos;Rejected&apos;. For custom approval items, the result could either be a single response or multiple responses separated by a semi-colon. Read-only.
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("result", value);
    }
    /**
     * Sets the state property value. The approval item state. The possible values are: canceled, created, pending, completed. Read-only.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ApprovalItemState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the viewPoint property value. Represents user viewpoints data on the ApprovalItem. The data includes the users roles regarding the approval item. Read-only.
     * @param value Value to set for the viewPoint property.
     */
    public void setViewPoint(@jakarta.annotation.Nullable final ApprovalItemViewPoint value) {
        this.backingStore.set("viewPoint", value);
    }
}

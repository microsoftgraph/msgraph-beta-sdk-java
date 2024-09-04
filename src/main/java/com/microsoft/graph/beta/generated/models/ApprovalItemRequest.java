package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalItemRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApprovalItemRequest} and sets the default values.
     */
    public ApprovalItemRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalItemRequest}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalItemRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalItemRequest();
    }
    /**
     * Gets the approver property value. The identity set of the principal assigned to this request.
     * @return a {@link ApprovalIdentitySet}
     */
    @jakarta.annotation.Nullable
    public ApprovalIdentitySet getApprover() {
        return this.backingStore.get("approver");
    }
    /**
     * Gets the createdDateTime property value. Creation date and time for the request.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approver", (n) -> { this.setApprover(n.getObjectValue(ApprovalIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isReassigned", (n) -> { this.setIsReassigned(n.getBooleanValue()); });
        deserializerMap.put("reassignedFrom", (n) -> { this.setReassignedFrom(n.getObjectValue(ApprovalIdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isReassigned property value. Indicates whether a request was reassigned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReassigned() {
        return this.backingStore.get("isReassigned");
    }
    /**
     * Gets the reassignedFrom property value. The identity set of the principal who reassigned the request.
     * @return a {@link ApprovalIdentitySet}
     */
    @jakarta.annotation.Nullable
    public ApprovalIdentitySet getReassignedFrom() {
        return this.backingStore.get("reassignedFrom");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the approver property value. The identity set of the principal assigned to this request.
     * @param value Value to set for the approver property.
     */
    public void setApprover(@jakarta.annotation.Nullable final ApprovalIdentitySet value) {
        this.backingStore.set("approver", value);
    }
    /**
     * Sets the createdDateTime property value. Creation date and time for the request.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isReassigned property value. Indicates whether a request was reassigned.
     * @param value Value to set for the isReassigned property.
     */
    public void setIsReassigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReassigned", value);
    }
    /**
     * Sets the reassignedFrom property value. The identity set of the principal who reassigned the request.
     * @param value Value to set for the reassignedFrom property.
     */
    public void setReassignedFrom(@jakarta.annotation.Nullable final ApprovalIdentitySet value) {
        this.backingStore.set("reassignedFrom", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalSolution extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApprovalSolution} and sets the default values.
     */
    public ApprovalSolution() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalSolution}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalSolution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalSolution();
    }
    /**
     * Gets the approvalItems property value. A collection of approval items.
     * @return a {@link java.util.List<ApprovalItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalItem> getApprovalItems() {
        return this.backingStore.get("approvalItems");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalItems", (n) -> { this.setApprovalItems(n.getCollectionOfObjectValues(ApprovalItem::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(ApprovalOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningStatus", (n) -> { this.setProvisioningStatus(n.getEnumValue(ProvisionState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the operations property value. The operations property
     * @return a {@link java.util.List<ApprovalOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the provisioningStatus property value. The approval provisioning status for a tenant on an environment. The possible values are: notProvisioned, provisioningInProgress, provisioningFailed, provisioningCompleted, unknownFutureValue.
     * @return a {@link ProvisionState}
     */
    @jakarta.annotation.Nullable
    public ProvisionState getProvisioningStatus() {
        return this.backingStore.get("provisioningStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("approvalItems", this.getApprovalItems());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeEnumValue("provisioningStatus", this.getProvisioningStatus());
    }
    /**
     * Sets the approvalItems property value. A collection of approval items.
     * @param value Value to set for the approvalItems property.
     */
    public void setApprovalItems(@jakarta.annotation.Nullable final java.util.List<ApprovalItem> value) {
        this.backingStore.set("approvalItems", value);
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<ApprovalOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the provisioningStatus property value. The approval provisioning status for a tenant on an environment. The possible values are: notProvisioned, provisioningInProgress, provisioningFailed, provisioningCompleted, unknownFutureValue.
     * @param value Value to set for the provisioningStatus property.
     */
    public void setProvisioningStatus(@jakarta.annotation.Nullable final ProvisionState value) {
        this.backingStore.set("provisioningStatus", value);
    }
}

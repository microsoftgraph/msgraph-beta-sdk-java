package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerBasicApprovalAttachment extends PlannerBaseApprovalAttachment implements Parsable {
    /**
     * Instantiates a new {@link PlannerBasicApprovalAttachment} and sets the default values.
     */
    public PlannerBasicApprovalAttachment() {
        super();
        this.setOdataType("#microsoft.graph.plannerBasicApprovalAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerBasicApprovalAttachment}
     */
    @jakarta.annotation.Nonnull
    public static PlannerBasicApprovalAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerBasicApprovalAttachment();
    }
    /**
     * Gets the approvalId property value. Read-only. The identifier of the approval in the approval service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApprovalId() {
        return this.backingStore.get("approvalId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalId", (n) -> { this.setApprovalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("approvalId", this.getApprovalId());
    }
    /**
     * Sets the approvalId property value. Read-only. The identifier of the approval in the approval service.
     * @param value Value to set for the approvalId property.
     */
    public void setApprovalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("approvalId", value);
    }
}

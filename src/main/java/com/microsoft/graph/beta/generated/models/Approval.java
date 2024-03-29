package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Approval extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Approval} and sets the default values.
     */
    public Approval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Approval}
     */
    @jakarta.annotation.Nonnull
    public static Approval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Approval();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("steps", (n) -> { this.setSteps(n.getCollectionOfObjectValues(ApprovalStep::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the steps property value. Used to represent the decision associated with a single step in the approval process configured in approvalStage.
     * @return a {@link java.util.List<ApprovalStep>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalStep> getSteps() {
        return this.backingStore.get("steps");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("steps", this.getSteps());
    }
    /**
     * Sets the steps property value. Used to represent the decision associated with a single step in the approval process configured in approvalStage.
     * @param value Value to set for the steps property.
     */
    public void setSteps(@jakarta.annotation.Nullable final java.util.List<ApprovalStep> value) {
        this.backingStore.set("steps", value);
    }
}

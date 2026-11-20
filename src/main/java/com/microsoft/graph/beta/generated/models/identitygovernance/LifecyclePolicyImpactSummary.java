package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicyImpactSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LifecyclePolicyImpactSummary} and sets the default values.
     */
    public LifecyclePolicyImpactSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicyImpactSummary}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicyImpactSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecyclePolicyImpactSummary();
    }
    /**
     * Gets the actionsTaken property value. The policy actions taken for the subject during the evaluation period.
     * @return a {@link java.util.List<LifecyclePolicyImpactAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LifecyclePolicyImpactAction> getActionsTaken() {
        return this.backingStore.get("actionsTaken");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionsTaken", (n) -> { this.setActionsTaken(n.getCollectionOfObjectValues(LifecyclePolicyImpactAction::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the subject property value. The subject evaluated by the policy.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actionsTaken", this.getActionsTaken());
        writer.writeObjectValue("subject", this.getSubject());
    }
    /**
     * Sets the actionsTaken property value. The policy actions taken for the subject during the evaluation period.
     * @param value Value to set for the actionsTaken property.
     */
    public void setActionsTaken(@jakarta.annotation.Nullable final java.util.List<LifecyclePolicyImpactAction> value) {
        this.backingStore.set("actionsTaken", value);
    }
    /**
     * Sets the subject property value. The subject evaluated by the policy.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("subject", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.identitygovernance.LifecyclePolicy;
import com.microsoft.graph.beta.models.identitygovernance.Workflow;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeletedItemContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeletedItemContainer} and sets the default values.
     */
    public DeletedItemContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeletedItemContainer}
     */
    @jakarta.annotation.Nonnull
    public static DeletedItemContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeletedItemContainer();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lifecyclePolicies", (n) -> { this.setLifecyclePolicies(n.getCollectionOfObjectValues(LifecyclePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("workflows", (n) -> { this.setWorkflows(n.getCollectionOfObjectValues(Workflow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecyclePolicies property value. The lifecyclePolicies property
     * @return a {@link java.util.List<LifecyclePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LifecyclePolicy> getLifecyclePolicies() {
        return this.backingStore.get("lifecyclePolicies");
    }
    /**
     * Gets the workflows property value. Deleted workflows that end up in the deletedItemsContainer.
     * @return a {@link java.util.List<Workflow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Workflow> getWorkflows() {
        return this.backingStore.get("workflows");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("lifecyclePolicies", this.getLifecyclePolicies());
        writer.writeCollectionOfObjectValues("workflows", this.getWorkflows());
    }
    /**
     * Sets the lifecyclePolicies property value. The lifecyclePolicies property
     * @param value Value to set for the lifecyclePolicies property.
     */
    public void setLifecyclePolicies(@jakarta.annotation.Nullable final java.util.List<LifecyclePolicy> value) {
        this.backingStore.set("lifecyclePolicies", value);
    }
    /**
     * Sets the workflows property value. Deleted workflows that end up in the deletedItemsContainer.
     * @param value Value to set for the workflows property.
     */
    public void setWorkflows(@jakarta.annotation.Nullable final java.util.List<Workflow> value) {
        this.backingStore.set("workflows", value);
    }
}

package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicyPriorityConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LifecyclePolicyPriorityConfiguration} and sets the default values.
     */
    public LifecyclePolicyPriorityConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicyPriorityConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicyPriorityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecyclePolicyPriorityConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("orderedPolicyIds", (n) -> { this.setOrderedPolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subjectType", (n) -> { this.setSubjectType(n.getEnumSetValue(SubjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orderedPolicyIds property value. The orderedPolicyIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrderedPolicyIds() {
        return this.backingStore.get("orderedPolicyIds");
    }
    /**
     * Gets the subjectType property value. The subjectType property
     * @return a {@link EnumSet<SubjectType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<SubjectType> getSubjectType() {
        return this.backingStore.get("subjectType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("orderedPolicyIds", this.getOrderedPolicyIds());
        writer.writeEnumSetValue("subjectType", this.getSubjectType());
    }
    /**
     * Sets the orderedPolicyIds property value. The orderedPolicyIds property
     * @param value Value to set for the orderedPolicyIds property.
     */
    public void setOrderedPolicyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("orderedPolicyIds", value);
    }
    /**
     * Sets the subjectType property value. The subjectType property
     * @param value Value to set for the subjectType property.
     */
    public void setSubjectType(@jakarta.annotation.Nullable final EnumSet<SubjectType> value) {
        this.backingStore.set("subjectType", value);
    }
}

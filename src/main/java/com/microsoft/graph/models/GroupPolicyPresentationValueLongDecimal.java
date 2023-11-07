package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The entity represents an unsigned long value of a long decimal text box presentation on a policy definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationValueLongDecimal extends GroupPolicyPresentationValue implements Parsable {
    /**
     * An unsigned long value for the associated presentation.
     */
    private Long value;
    /**
     * Instantiates a new GroupPolicyPresentationValueLongDecimal and sets the default values.
     */
    public GroupPolicyPresentationValueLongDecimal() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationValueLongDecimal
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationValueLongDecimal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationValueLongDecimal();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. An unsigned long value for the associated presentation.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("value", this.getValue());
    }
    /**
     * Sets the value property value. An unsigned long value for the associated presentation.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Long value) {
        this.value = value;
    }
}

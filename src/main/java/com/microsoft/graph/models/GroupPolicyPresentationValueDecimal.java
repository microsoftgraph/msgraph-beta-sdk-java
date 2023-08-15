package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The entity represents an unsigned integer value of a decimal text box presentation on a policy definition.
 */
public class GroupPolicyPresentationValueDecimal extends GroupPolicyPresentationValue implements Parsable {
    /**
     * An unsigned integer value for the associated presentation.
     */
    private Long value;
    /**
     * Instantiates a new groupPolicyPresentationValueDecimal and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GroupPolicyPresentationValueDecimal() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyPresentationValueDecimal
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationValueDecimal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationValueDecimal();
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
     * Gets the value property value. An unsigned integer value for the associated presentation.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("value", this.getValue());
    }
    /**
     * Sets the value property value. An unsigned integer value for the associated presentation.
     * @param value Value to set for the value property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValue(@jakarta.annotation.Nullable final Long value) {
        this.value = value;
    }
}

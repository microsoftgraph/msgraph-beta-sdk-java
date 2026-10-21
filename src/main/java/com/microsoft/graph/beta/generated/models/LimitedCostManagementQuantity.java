package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A quantity limited to a specific value. A value of zero permits no consumption and isdistinct from unlimited.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LimitedCostManagementQuantity extends CostManagementQuantity implements Parsable {
    /**
     * Instantiates a new {@link LimitedCostManagementQuantity} and sets the default values.
     */
    public LimitedCostManagementQuantity() {
        super();
        this.setOdataType("#microsoft.graph.limitedCostManagementQuantity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LimitedCostManagementQuantity}
     */
    @jakarta.annotation.Nonnull
    public static LimitedCostManagementQuantity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LimitedCostManagementQuantity();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The numeric value of the quantity, expressed in the stated unit.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("value", this.getValue());
    }
    /**
     * Sets the value property value. The numeric value of the quantity, expressed in the stated unit.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("value", value);
    }
}

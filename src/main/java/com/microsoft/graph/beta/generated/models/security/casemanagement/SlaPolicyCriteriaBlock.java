package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SlaPolicyCriteriaBlock extends SlaPolicyConditionBase implements Parsable {
    /**
     * Instantiates a new {@link SlaPolicyCriteriaBlock} and sets the default values.
     */
    public SlaPolicyCriteriaBlock() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.slaPolicyCriteriaBlock");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SlaPolicyCriteriaBlock}
     */
    @jakarta.annotation.Nonnull
    public static SlaPolicyCriteriaBlock createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SlaPolicyCriteriaBlock();
    }
    /**
     * Gets the conditions property value. The leaf conditions or nested groups evaluated by this block. The maximum nesting depth is two.
     * @return a {@link java.util.List<SlaPolicyConditionBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SlaPolicyConditionBase> getConditions() {
        return this.backingStore.get("conditions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getCollectionOfObjectValues(SlaPolicyConditionBase::createFromDiscriminatorValue)); });
        deserializerMap.put("logicalOperator", (n) -> { this.setLogicalOperator(n.getEnumValue(SlaPolicyLogicalOperator::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the logicalOperator property value. The logicalOperator property
     * @return a {@link SlaPolicyLogicalOperator}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyLogicalOperator getLogicalOperator() {
        return this.backingStore.get("logicalOperator");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("conditions", this.getConditions());
        writer.writeEnumValue("logicalOperator", this.getLogicalOperator());
    }
    /**
     * Sets the conditions property value. The leaf conditions or nested groups evaluated by this block. The maximum nesting depth is two.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final java.util.List<SlaPolicyConditionBase> value) {
        this.backingStore.set("conditions", value);
    }
    /**
     * Sets the logicalOperator property value. The logicalOperator property
     * @param value Value to set for the logicalOperator property.
     */
    public void setLogicalOperator(@jakarta.annotation.Nullable final SlaPolicyLogicalOperator value) {
        this.backingStore.set("logicalOperator", value);
    }
}

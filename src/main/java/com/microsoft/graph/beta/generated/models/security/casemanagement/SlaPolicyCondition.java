package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SlaPolicyCondition extends SlaPolicyConditionBase implements Parsable {
    /**
     * Instantiates a new {@link SlaPolicyCondition} and sets the default values.
     */
    public SlaPolicyCondition() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.slaPolicyCondition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SlaPolicyCondition}
     */
    @jakarta.annotation.Nonnull
    public static SlaPolicyCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SlaPolicyCondition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(SlaPolicyConditionOperator::forValue)); });
        deserializerMap.put("property", (n) -> { this.setProperty(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the operator property value. The operator property
     * @return a {@link SlaPolicyConditionOperator}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyConditionOperator getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Gets the property property value. The name of the case property to evaluate, such as priority.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProperty() {
        return this.backingStore.get("property");
    }
    /**
     * Gets the values property value. The comparison values for the condition.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("property", this.getProperty());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
    }
    /**
     * Sets the operator property value. The operator property
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final SlaPolicyConditionOperator value) {
        this.backingStore.set("operator", value);
    }
    /**
     * Sets the property property value. The name of the case property to evaluate, such as priority.
     * @param value Value to set for the property property.
     */
    public void setProperty(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("property", value);
    }
    /**
     * Sets the values property value. The comparison values for the condition.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("values", value);
    }
}

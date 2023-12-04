package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX decimalTextBox element and an ADMX decimal element.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationDecimalTextBox extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Instantiates a new GroupPolicyPresentationDecimalTextBox and sets the default values.
     */
    public GroupPolicyPresentationDecimalTextBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationDecimalTextBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationDecimalTextBox
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationDecimalTextBox createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationDecimalTextBox();
    }
    /**
     * Gets the defaultValue property value. An unsigned integer that specifies the initial value for the decimal text box. The default value is 1.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getLongValue()); });
        deserializerMap.put("maxValue", (n) -> { this.setMaxValue(n.getLongValue()); });
        deserializerMap.put("minValue", (n) -> { this.setMinValue(n.getLongValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("spin", (n) -> { this.setSpin(n.getBooleanValue()); });
        deserializerMap.put("spinStep", (n) -> { this.setSpinStep(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxValue property value. An unsigned integer that specifies the maximum allowed value. The default value is 9999.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxValue() {
        return this.backingStore.get("maxValue");
    }
    /**
     * Gets the minValue property value. An unsigned integer that specifies the minimum allowed value. The default value is 0.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMinValue() {
        return this.backingStore.get("minValue");
    }
    /**
     * Gets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Gets the spin property value. If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSpin() {
        return this.backingStore.get("spin");
    }
    /**
     * Gets the spinStep property value. An unsigned integer that specifies the increment of change for the spin control. The default value is 1.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSpinStep() {
        return this.backingStore.get("spinStep");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("defaultValue", this.getDefaultValue());
        writer.writeLongValue("maxValue", this.getMaxValue());
        writer.writeLongValue("minValue", this.getMinValue());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeBooleanValue("spin", this.getSpin());
        writer.writeLongValue("spinStep", this.getSpinStep());
    }
    /**
     * Sets the defaultValue property value. An unsigned integer that specifies the initial value for the decimal text box. The default value is 1.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the maxValue property value. An unsigned integer that specifies the maximum allowed value. The default value is 9999.
     * @param value Value to set for the maxValue property.
     */
    public void setMaxValue(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxValue", value);
    }
    /**
     * Sets the minValue property value. An unsigned integer that specifies the minimum allowed value. The default value is 0.
     * @param value Value to set for the minValue property.
     */
    public void setMinValue(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("minValue", value);
    }
    /**
     * Sets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
    /**
     * Sets the spin property value. If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true.
     * @param value Value to set for the spin property.
     */
    public void setSpin(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("spin", value);
    }
    /**
     * Sets the spinStep property value. An unsigned integer that specifies the increment of change for the spin control. The default value is 1.
     * @param value Value to set for the spinStep property.
     */
    public void setSpinStep(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("spinStep", value);
    }
}

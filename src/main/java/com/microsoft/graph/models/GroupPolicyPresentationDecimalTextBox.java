package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationDecimalTextBox extends GroupPolicyUploadedPresentation implements Parsable {
    /** An unsigned integer that specifies the initial value for the decimal text box. The default value is 1. */
    private Long _defaultValue;
    /** An unsigned integer that specifies the maximum allowed value. The default value is 9999. */
    private Long _maxValue;
    /** An unsigned integer that specifies the minimum allowed value. The default value is 0. */
    private Long _minValue;
    /** Requirement to enter a value in the parameter box. The default value is false. */
    private Boolean _required;
    /** If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true. */
    private Boolean _spin;
    /** An unsigned integer that specifies the increment of change for the spin control. The default value is 1. */
    private Long _spinStep;
    /**
     * Instantiates a new GroupPolicyPresentationDecimalTextBox and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationDecimalTextBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationDecimalTextBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationDecimalTextBox
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationDecimalTextBox createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationDecimalTextBox();
    }
    /**
     * Gets the defaultValue property value. An unsigned integer that specifies the initial value for the decimal text box. The default value is 1.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationDecimalTextBox currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getLongValue()); });
            this.put("maxValue", (n) -> { currentObject.setMaxValue(n.getLongValue()); });
            this.put("minValue", (n) -> { currentObject.setMinValue(n.getLongValue()); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
            this.put("spin", (n) -> { currentObject.setSpin(n.getBooleanValue()); });
            this.put("spinStep", (n) -> { currentObject.setSpinStep(n.getLongValue()); });
        }};
    }
    /**
     * Gets the maxValue property value. An unsigned integer that specifies the maximum allowed value. The default value is 9999.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxValue() {
        return this._maxValue;
    }
    /**
     * Gets the minValue property value. An unsigned integer that specifies the minimum allowed value. The default value is 0.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMinValue() {
        return this._minValue;
    }
    /**
     * Gets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Gets the spin property value. If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSpin() {
        return this._spin;
    }
    /**
     * Gets the spinStep property value. An unsigned integer that specifies the increment of change for the spin control. The default value is 1.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSpinStep() {
        return this._spinStep;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final Long value) {
        this._defaultValue = value;
    }
    /**
     * Sets the maxValue property value. An unsigned integer that specifies the maximum allowed value. The default value is 9999.
     * @param value Value to set for the maxValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxValue(@javax.annotation.Nullable final Long value) {
        this._maxValue = value;
    }
    /**
     * Sets the minValue property value. An unsigned integer that specifies the minimum allowed value. The default value is 0.
     * @param value Value to set for the minValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinValue(@javax.annotation.Nullable final Long value) {
        this._minValue = value;
    }
    /**
     * Sets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
    /**
     * Sets the spin property value. If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true.
     * @param value Value to set for the spin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpin(@javax.annotation.Nullable final Boolean value) {
        this._spin = value;
    }
    /**
     * Sets the spinStep property value. An unsigned integer that specifies the increment of change for the spin control. The default value is 1.
     * @param value Value to set for the spinStep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpinStep(@javax.annotation.Nullable final Long value) {
        this._spinStep = value;
    }
}

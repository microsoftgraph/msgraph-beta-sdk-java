package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationTextBox extends GroupPolicyUploadedPresentation implements Parsable {
    /** Localized default string displayed in the text box. The default value is empty. */
    private String _defaultValue;
    /** An unsigned integer that specifies the maximum number of text characters. Default value is 1023. */
    private Long _maxLength;
    /** Requirement to enter a value in the text box. Default value is false. */
    private Boolean _required;
    /**
     * Instantiates a new GroupPolicyPresentationTextBox and sets the default values.
     * @return a void
     */
    public GroupPolicyPresentationTextBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationTextBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationTextBox
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationTextBox createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationTextBox();
    }
    /**
     * Gets the defaultValue property value. Localized default string displayed in the text box. The default value is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationTextBox currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getStringValue()); });
            this.put("maxLength", (n) -> { currentObject.setMaxLength(n.getLongValue()); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxLength() {
        return this._maxLength;
    }
    /**
     * Gets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeLongValue("maxLength", this.getMaxLength());
        writer.writeBooleanValue("required", this.getRequired());
    }
    /**
     * Sets the defaultValue property value. Localized default string displayed in the text box. The default value is empty.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this._defaultValue = value;
    }
    /**
     * Sets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @param value Value to set for the maxLength property.
     * @return a void
     */
    public void setMaxLength(@javax.annotation.Nullable final Long value) {
        this._maxLength = value;
    }
    /**
     * Sets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @param value Value to set for the required property.
     * @return a void
     */
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
}

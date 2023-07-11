package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX textBox element and an ADMX text element.
 */
public class GroupPolicyPresentationTextBox extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Localized default string displayed in the text box. The default value is empty.
     */
    private String defaultValue;
    /**
     * An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     */
    private Long maxLength;
    /**
     * Requirement to enter a value in the text box. Default value is false.
     */
    private Boolean required;
    /**
     * Instantiates a new groupPolicyPresentationTextBox and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationTextBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationTextBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyPresentationTextBox
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
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getLongValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxLength() {
        return this.maxLength;
    }
    /**
     * Gets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
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
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeLongValue("maxLength", this.getMaxLength());
        writer.writeBooleanValue("required", this.getRequired());
    }
    /**
     * Sets the defaultValue property value. Localized default string displayed in the text box. The default value is empty.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
    /**
     * Sets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @param value Value to set for the maxLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxLength(@javax.annotation.Nullable final Long value) {
        this.maxLength = value;
    }
    /**
     * Sets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this.required = value;
    }
}

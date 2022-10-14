package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationComboBox extends GroupPolicyUploadedPresentation implements Parsable {
    /** Localized default string displayed in the combo box. The default value is empty. */
    private String _defaultValue;
    /** An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023. */
    private Long _maxLength;
    /** Specifies whether a value must be specified for the parameter. The default value is false. */
    private Boolean _required;
    /** Localized strings listed in the drop-down list of the combo box. The default value is empty. */
    private java.util.List<String> _suggestions;
    /**
     * Instantiates a new GroupPolicyPresentationComboBox and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationComboBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationComboBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationComboBox
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationComboBox createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationComboBox();
    }
    /**
     * Gets the defaultValue property value. Localized default string displayed in the combo box. The default value is empty.
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
        final GroupPolicyPresentationComboBox currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getStringValue()); });
            this.put("maxLength", (n) -> { currentObject.setMaxLength(n.getLongValue()); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
            this.put("suggestions", (n) -> { currentObject.setSuggestions(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the maxLength property value. An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxLength() {
        return this._maxLength;
    }
    /**
     * Gets the required property value. Specifies whether a value must be specified for the parameter. The default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Gets the suggestions property value. Localized strings listed in the drop-down list of the combo box. The default value is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSuggestions() {
        return this._suggestions;
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
        writer.writeCollectionOfPrimitiveValues("suggestions", this.getSuggestions());
    }
    /**
     * Sets the defaultValue property value. Localized default string displayed in the combo box. The default value is empty.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this._defaultValue = value;
    }
    /**
     * Sets the maxLength property value. An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023.
     * @param value Value to set for the maxLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxLength(@javax.annotation.Nullable final Long value) {
        this._maxLength = value;
    }
    /**
     * Sets the required property value. Specifies whether a value must be specified for the parameter. The default value is false.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
    /**
     * Sets the suggestions property value. Localized strings listed in the drop-down list of the combo box. The default value is empty.
     * @param value Value to set for the suggestions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuggestions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._suggestions = value;
    }
}

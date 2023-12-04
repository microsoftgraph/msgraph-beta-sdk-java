package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX comboBox element and an ADMX text element.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationComboBox extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Instantiates a new GroupPolicyPresentationComboBox and sets the default values.
     */
    public GroupPolicyPresentationComboBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationComboBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationComboBox
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationComboBox createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationComboBox();
    }
    /**
     * Gets the defaultValue property value. Localized default string displayed in the combo box. The default value is empty.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getLongValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("suggestions", (n) -> { this.setSuggestions(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the maxLength property value. An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxLength() {
        return this.backingStore.get("maxLength");
    }
    /**
     * Gets the required property value. Specifies whether a value must be specified for the parameter. The default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Gets the suggestions property value. Localized strings listed in the drop-down list of the combo box. The default value is empty.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSuggestions() {
        return this.backingStore.get("suggestions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the maxLength property value. An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023.
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxLength", value);
    }
    /**
     * Sets the required property value. Specifies whether a value must be specified for the parameter. The default value is false.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
    /**
     * Sets the suggestions property value. Localized strings listed in the drop-down list of the combo box. The default value is empty.
     * @param value Value to set for the suggestions property.
     */
    public void setSuggestions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("suggestions", value);
    }
}

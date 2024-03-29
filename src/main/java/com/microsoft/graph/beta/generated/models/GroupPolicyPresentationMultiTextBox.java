package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX multiTextBox element and an ADMX multiText element.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationMultiTextBox extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyPresentationMultiTextBox} and sets the default values.
     */
    public GroupPolicyPresentationMultiTextBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationMultiTextBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyPresentationMultiTextBox}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationMultiTextBox createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationMultiTextBox();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getLongValue()); });
        deserializerMap.put("maxStrings", (n) -> { this.setMaxStrings(n.getLongValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMaxLength() {
        return this.backingStore.get("maxLength");
    }
    /**
     * Gets the maxStrings property value. An unsigned integer that specifies the maximum number of strings. Default value is 0.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMaxStrings() {
        return this.backingStore.get("maxStrings");
    }
    /**
     * Gets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("maxLength", this.getMaxLength());
        writer.writeLongValue("maxStrings", this.getMaxStrings());
        writer.writeBooleanValue("required", this.getRequired());
    }
    /**
     * Sets the maxLength property value. An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxLength", value);
    }
    /**
     * Sets the maxStrings property value. An unsigned integer that specifies the maximum number of strings. Default value is 0.
     * @param value Value to set for the maxStrings property.
     */
    public void setMaxStrings(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxStrings", value);
    }
    /**
     * Sets the required property value. Requirement to enter a value in the text box. Default value is false.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
}

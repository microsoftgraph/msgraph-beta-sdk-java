package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomFieldValue extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link CustomFieldValue} and sets the default values.
     */
    public CustomFieldValue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomFieldValue}
     */
    @jakarta.annotation.Nonnull
    public static CustomFieldValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomFieldValue();
    }
    /**
     * Gets the customFieldDefinitionId property value. ID of the customFieldDefinition this value is for. Immutable after creation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomFieldDefinitionId() {
        return this.backingStore.get("customFieldDefinitionId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customFieldDefinitionId", (n) -> { this.setCustomFieldDefinitionId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value of the custom field, formatted according to the field&apos;s valueType.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("customFieldDefinitionId", this.getCustomFieldDefinitionId());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the customFieldDefinitionId property value. ID of the customFieldDefinition this value is for. Immutable after creation.
     * @param value Value to set for the customFieldDefinitionId property.
     */
    public void setCustomFieldDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customFieldDefinitionId", value);
    }
    /**
     * Sets the value property value. The value of the custom field, formatted according to the field&apos;s valueType.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}

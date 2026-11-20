package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NumberCustomFieldDefinition extends CustomFieldDefinition implements Parsable {
    /**
     * Instantiates a new {@link NumberCustomFieldDefinition} and sets the default values.
     */
    public NumberCustomFieldDefinition() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.numberCustomFieldDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NumberCustomFieldDefinition}
     */
    @jakarta.annotation.Nonnull
    public static NumberCustomFieldDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberCustomFieldDefinition();
    }
    /**
     * Gets the defaultValue property value. The default numeric value applied to the field on a new case.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. The default numeric value applied to the field on a new case.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defaultValue", value);
    }
}

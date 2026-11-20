package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OptionsCustomFieldDefinition extends CustomFieldDefinition implements Parsable {
    /**
     * Instantiates a new {@link OptionsCustomFieldDefinition} and sets the default values.
     */
    public OptionsCustomFieldDefinition() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.optionsCustomFieldDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OptionsCustomFieldDefinition}
     */
    @jakarta.annotation.Nonnull
    public static OptionsCustomFieldDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OptionsCustomFieldDefinition();
    }
    /**
     * Gets the defaultValues property value. The option value or values selected by default on a new case.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultValues() {
        return this.backingStore.get("defaultValues");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValues", (n) -> { this.setDefaultValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. The allowed option values a case author can choose from.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOptions() {
        return this.backingStore.get("options");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("defaultValues", this.getDefaultValues());
        writer.writeCollectionOfPrimitiveValues("options", this.getOptions());
    }
    /**
     * Sets the defaultValues property value. The option value or values selected by default on a new case.
     * @param value Value to set for the defaultValues property.
     */
    public void setDefaultValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defaultValues", value);
    }
    /**
     * Sets the options property value. The allowed option values a case author can choose from.
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("options", value);
    }
}

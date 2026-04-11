package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Multiselect configuration item inside an Android application&apos;s custom configuration schema.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConfigurationSchemaItemMultiselectType extends AppConfigurationSchemaItemType implements Parsable {
    /**
     * Instantiates a new {@link AppConfigurationSchemaItemMultiselectType} and sets the default values.
     */
    public AppConfigurationSchemaItemMultiselectType() {
        super();
        this.setOdataType("#microsoft.graph.appConfigurationSchemaItemMultiselectType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppConfigurationSchemaItemMultiselectType}
     */
    @jakarta.annotation.Nonnull
    public static AppConfigurationSchemaItemMultiselectType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConfigurationSchemaItemMultiselectType();
    }
    /**
     * Gets the defaultValue property value. Default value, if specified by the app developer
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("selections", (n) -> { this.setSelections(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getSelections() {
        return this.backingStore.get("selections");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("defaultValue", this.getDefaultValue());
        writer.writeCollectionOfObjectValues("selections", this.getSelections());
    }
    /**
     * Sets the defaultValue property value. Default value, if specified by the app developer
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item
     * @param value Value to set for the selections property.
     */
    public void setSelections(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("selections", value);
    }
}

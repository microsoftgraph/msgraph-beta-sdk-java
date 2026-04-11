package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Hidden configuration item inside an Android application&apos;s custom configuration schema.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConfigurationSchemaItemHiddenType extends AppConfigurationSchemaItemType implements Parsable {
    /**
     * Instantiates a new {@link AppConfigurationSchemaItemHiddenType} and sets the default values.
     */
    public AppConfigurationSchemaItemHiddenType() {
        super();
        this.setOdataType("#microsoft.graph.appConfigurationSchemaItemHiddenType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppConfigurationSchemaItemHiddenType}
     */
    @jakarta.annotation.Nonnull
    public static AppConfigurationSchemaItemHiddenType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConfigurationSchemaItemHiddenType();
    }
    /**
     * Gets the defaultValue property value. Default value, if specified by the app developer
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. Default value, if specified by the app developer
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
}

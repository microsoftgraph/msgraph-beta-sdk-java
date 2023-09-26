package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Schema describing an Android for Work application's custom configurations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkAppConfigurationSchema extends Entity implements Parsable {
    /**
     * UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     */
    private Base64url exampleJson;
    /**
     * Collection of items each representing a named configuration option in the schema
     */
    private java.util.List<AndroidForWorkAppConfigurationSchemaItem> schemaItems;
    /**
     * Instantiates a new AndroidForWorkAppConfigurationSchema and sets the default values.
     */
    public AndroidForWorkAppConfigurationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkAppConfigurationSchema
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkAppConfigurationSchema createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkAppConfigurationSchema();
    }
    /**
     * Gets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getExampleJson() {
        return this.exampleJson;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exampleJson", (n) -> { this.setExampleJson(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("schemaItems", (n) -> { this.setSchemaItems(n.getCollectionOfObjectValues(AndroidForWorkAppConfigurationSchemaItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the schemaItems property value. Collection of items each representing a named configuration option in the schema
     * @return a java.util.List<AndroidForWorkAppConfigurationSchemaItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidForWorkAppConfigurationSchemaItem> getSchemaItems() {
        return this.schemaItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("exampleJson", this.getExampleJson());
        writer.writeCollectionOfObjectValues("schemaItems", this.getSchemaItems());
    }
    /**
     * Sets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @param value Value to set for the exampleJson property.
     */
    public void setExampleJson(@jakarta.annotation.Nullable final Base64url value) {
        this.exampleJson = value;
    }
    /**
     * Sets the schemaItems property value. Collection of items each representing a named configuration option in the schema
     * @param value Value to set for the schemaItems property.
     */
    public void setSchemaItems(@jakarta.annotation.Nullable final java.util.List<AndroidForWorkAppConfigurationSchemaItem> value) {
        this.schemaItems = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Schema describing an Android application's custom configurations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedStoreAppConfigurationSchema extends Entity implements Parsable {
    /**
     * Instantiates a new AndroidManagedStoreAppConfigurationSchema and sets the default values.
     */
    public AndroidManagedStoreAppConfigurationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreAppConfigurationSchema
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedStoreAppConfigurationSchema createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppConfigurationSchema();
    }
    /**
     * Gets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getExampleJson() {
        return this.backingStore.get("exampleJson");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exampleJson", (n) -> { this.setExampleJson(n.getByteArrayValue()); });
        deserializerMap.put("nestedSchemaItems", (n) -> { this.setNestedSchemaItems(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchemaItem::createFromDiscriminatorValue)); });
        deserializerMap.put("schemaItems", (n) -> { this.setSchemaItems(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchemaItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nestedSchemaItems property value. Collection of items each representing a named configuration option in the schema. It contains a flat list of all configuration.
     * @return a java.util.List<AndroidManagedStoreAppConfigurationSchemaItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> getNestedSchemaItems() {
        return this.backingStore.get("nestedSchemaItems");
    }
    /**
     * Gets the schemaItems property value. Collection of items each representing a named configuration option in the schema. It only contains the root-level configuration.
     * @return a java.util.List<AndroidManagedStoreAppConfigurationSchemaItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> getSchemaItems() {
        return this.backingStore.get("schemaItems");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("exampleJson", this.getExampleJson());
        writer.writeCollectionOfObjectValues("nestedSchemaItems", this.getNestedSchemaItems());
        writer.writeCollectionOfObjectValues("schemaItems", this.getSchemaItems());
    }
    /**
     * Sets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @param value Value to set for the exampleJson property.
     */
    public void setExampleJson(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("exampleJson", value);
    }
    /**
     * Sets the nestedSchemaItems property value. Collection of items each representing a named configuration option in the schema. It contains a flat list of all configuration.
     * @param value Value to set for the nestedSchemaItems property.
     */
    public void setNestedSchemaItems(@jakarta.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> value) {
        this.backingStore.set("nestedSchemaItems", value);
    }
    /**
     * Sets the schemaItems property value. Collection of items each representing a named configuration option in the schema. It only contains the root-level configuration.
     * @param value Value to set for the schemaItems property.
     */
    public void setSchemaItems(@jakarta.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> value) {
        this.backingStore.set("schemaItems", value);
    }
}

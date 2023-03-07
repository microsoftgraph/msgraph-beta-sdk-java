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
public class AndroidForWorkAppConfigurationSchema extends Entity implements Parsable {
    /** UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app */
    private byte[] exampleJson;
    /** Collection of items each representing a named configuration option in the schema */
    private java.util.List<AndroidForWorkAppConfigurationSchemaItem> schemaItems;
    /**
     * Instantiates a new androidForWorkAppConfigurationSchema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidForWorkAppConfigurationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidForWorkAppConfigurationSchema
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkAppConfigurationSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkAppConfigurationSchema();
    }
    /**
     * Gets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getExampleJson() {
        return this.exampleJson;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exampleJson", (n) -> { this.setExampleJson(n.getByteArrayValue()); });
        deserializerMap.put("schemaItems", (n) -> { this.setSchemaItems(n.getCollectionOfObjectValues(AndroidForWorkAppConfigurationSchemaItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the schemaItems property value. Collection of items each representing a named configuration option in the schema
     * @return a androidForWorkAppConfigurationSchemaItem
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidForWorkAppConfigurationSchemaItem> getSchemaItems() {
        return this.schemaItems;
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
        writer.writeByteArrayValue("exampleJson", this.getExampleJson());
        writer.writeCollectionOfObjectValues("schemaItems", this.getSchemaItems());
    }
    /**
     * Sets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @param value Value to set for the exampleJson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExampleJson(@javax.annotation.Nullable final byte[] value) {
        this.exampleJson = value;
    }
    /**
     * Sets the schemaItems property value. Collection of items each representing a named configuration option in the schema
     * @param value Value to set for the schemaItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchemaItems(@javax.annotation.Nullable final java.util.List<AndroidForWorkAppConfigurationSchemaItem> value) {
        this.schemaItems = value;
    }
}

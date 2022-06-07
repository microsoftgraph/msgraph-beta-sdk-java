package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Schema describing an Android application's custom configurations. */
public class AndroidManagedStoreAppConfigurationSchema extends Entity implements Parsable {
    /** UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app */
    private byte[] _exampleJson;
    /** Collection of items each representing a named configuration option in the schema. It contains a flat list of all configuration. */
    private java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> _nestedSchemaItems;
    /** Collection of items each representing a named configuration option in the schema. It only contains the root-level configuration. */
    private java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> _schemaItems;
    /**
     * Instantiates a new androidManagedStoreAppConfigurationSchema and sets the default values.
     * @return a void
     */
    public AndroidManagedStoreAppConfigurationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidManagedStoreAppConfigurationSchema
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreAppConfigurationSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppConfigurationSchema();
    }
    /**
     * Gets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getExampleJson() {
        return this._exampleJson;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedStoreAppConfigurationSchema currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("exampleJson", (n) -> { currentObject.setExampleJson(n.getByteArrayValue()); });
            this.put("nestedSchemaItems", (n) -> { currentObject.setNestedSchemaItems(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchemaItem::createFromDiscriminatorValue)); });
            this.put("schemaItems", (n) -> { currentObject.setSchemaItems(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchemaItem::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the nestedSchemaItems property value. Collection of items each representing a named configuration option in the schema. It contains a flat list of all configuration.
     * @return a androidManagedStoreAppConfigurationSchemaItem
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> getNestedSchemaItems() {
        return this._nestedSchemaItems;
    }
    /**
     * Gets the schemaItems property value. Collection of items each representing a named configuration option in the schema. It only contains the root-level configuration.
     * @return a androidManagedStoreAppConfigurationSchemaItem
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> getSchemaItems() {
        return this._schemaItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("exampleJson", this.getExampleJson());
        writer.writeCollectionOfObjectValues("nestedSchemaItems", this.getNestedSchemaItems());
        writer.writeCollectionOfObjectValues("schemaItems", this.getSchemaItems());
    }
    /**
     * Sets the exampleJson property value. UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app
     * @param value Value to set for the exampleJson property.
     * @return a void
     */
    public void setExampleJson(@javax.annotation.Nullable final byte[] value) {
        this._exampleJson = value;
    }
    /**
     * Sets the nestedSchemaItems property value. Collection of items each representing a named configuration option in the schema. It contains a flat list of all configuration.
     * @param value Value to set for the nestedSchemaItems property.
     * @return a void
     */
    public void setNestedSchemaItems(@javax.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> value) {
        this._nestedSchemaItems = value;
    }
    /**
     * Sets the schemaItems property value. Collection of items each representing a named configuration option in the schema. It only contains the root-level configuration.
     * @param value Value to set for the schemaItems property.
     * @return a void
     */
    public void setSchemaItems(@javax.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchemaItem> value) {
        this._schemaItems = value;
    }
}

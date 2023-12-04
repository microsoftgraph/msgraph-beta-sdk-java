package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalConnection extends Entity implements Parsable {
    /**
     * Instantiates a new ExternalConnection and sets the default values.
     */
    public ExternalConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalConnection
     */
    @jakarta.annotation.Nonnull
    public static ExternalConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalConnection();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a Configuration
     */
    @jakarta.annotation.Nullable
    public Configuration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(Configuration::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(ExternalGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ExternalItem::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(ConnectionOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(Schema::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConnectionState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a java.util.List<ExternalGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalGroup> getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Gets the items property value. The items property
     * @return a java.util.List<ExternalItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the operations property value. The operations property
     * @return a java.util.List<ConnectionOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectionOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the schema property value. The schema property
     * @return a Schema
     */
    @jakarta.annotation.Nullable
    public Schema getSchema() {
        return this.backingStore.get("schema");
    }
    /**
     * Gets the state property value. The state property
     * @return a ConnectionState
     */
    @jakarta.annotation.Nullable
    public ConnectionState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("schema", this.getSchema());
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final Configuration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<ExternalGroup> value) {
        this.backingStore.set("groups", value);
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ExternalItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<ConnectionOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the schema property value. The schema property
     * @param value Value to set for the schema property.
     */
    public void setSchema(@jakarta.annotation.Nullable final Schema value) {
        this.backingStore.set("schema", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ConnectionState value) {
        this.backingStore.set("state", value);
    }
}

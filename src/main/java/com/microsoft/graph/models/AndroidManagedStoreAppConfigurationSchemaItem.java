package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Single configuration item inside an Android application's custom configuration schema.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedStoreAppConfigurationSchemaItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AndroidManagedStoreAppConfigurationSchemaItem and sets the default values.
     */
    public AndroidManagedStoreAppConfigurationSchemaItem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreAppConfigurationSchemaItem
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedStoreAppConfigurationSchemaItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppConfigurationSchemaItem();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the dataType property value. Data type for a configuration item inside an Android application's custom configuration schema
     * @return a AndroidManagedStoreAppConfigurationSchemaItemDataType
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAppConfigurationSchemaItemDataType getDataType() {
        return this.backingStore.get("dataType");
    }
    /**
     * Gets the defaultBoolValue property value. Default value for boolean type items, if specified by the app developer
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefaultBoolValue() {
        return this.backingStore.get("defaultBoolValue");
    }
    /**
     * Gets the defaultIntValue property value. Default value for integer type items, if specified by the app developer
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefaultIntValue() {
        return this.backingStore.get("defaultIntValue");
    }
    /**
     * Gets the defaultStringArrayValue property value. Default value for string array type items, if specified by the app developer
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultStringArrayValue() {
        return this.backingStore.get("defaultStringArrayValue");
    }
    /**
     * Gets the defaultStringValue property value. Default value for string type items, if specified by the app developer
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultStringValue() {
        return this.backingStore.get("defaultStringValue");
    }
    /**
     * Gets the description property value. Description of what the item controls within the application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Human readable name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getEnumValue(AndroidManagedStoreAppConfigurationSchemaItemDataType.class)); });
        deserializerMap.put("defaultBoolValue", (n) -> { this.setDefaultBoolValue(n.getBooleanValue()); });
        deserializerMap.put("defaultIntValue", (n) -> { this.setDefaultIntValue(n.getIntegerValue()); });
        deserializerMap.put("defaultStringArrayValue", (n) -> { this.setDefaultStringArrayValue(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defaultStringValue", (n) -> { this.setDefaultStringValue(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentIndex", (n) -> { this.setParentIndex(n.getIntegerValue()); });
        deserializerMap.put("schemaItemKey", (n) -> { this.setSchemaItemKey(n.getStringValue()); });
        deserializerMap.put("selections", (n) -> { this.setSelections(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. Unique index the application uses to maintain nested schema items
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.backingStore.get("index");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the parentIndex property value. Index of parent schema item to track nested schema items
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getParentIndex() {
        return this.backingStore.get("parentIndex");
    }
    /**
     * Gets the schemaItemKey property value. Unique key the application uses to identify the item
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchemaItemKey() {
        return this.backingStore.get("schemaItemKey");
    }
    /**
     * Gets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     * @return a java.util.List<KeyValuePair>
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
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeBooleanValue("defaultBoolValue", this.getDefaultBoolValue());
        writer.writeIntegerValue("defaultIntValue", this.getDefaultIntValue());
        writer.writeCollectionOfPrimitiveValues("defaultStringArrayValue", this.getDefaultStringArrayValue());
        writer.writeStringValue("defaultStringValue", this.getDefaultStringValue());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("parentIndex", this.getParentIndex());
        writer.writeStringValue("schemaItemKey", this.getSchemaItemKey());
        writer.writeCollectionOfObjectValues("selections", this.getSelections());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the dataType property value. Data type for a configuration item inside an Android application's custom configuration schema
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final AndroidManagedStoreAppConfigurationSchemaItemDataType value) {
        this.backingStore.set("dataType", value);
    }
    /**
     * Sets the defaultBoolValue property value. Default value for boolean type items, if specified by the app developer
     * @param value Value to set for the defaultBoolValue property.
     */
    public void setDefaultBoolValue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defaultBoolValue", value);
    }
    /**
     * Sets the defaultIntValue property value. Default value for integer type items, if specified by the app developer
     * @param value Value to set for the defaultIntValue property.
     */
    public void setDefaultIntValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defaultIntValue", value);
    }
    /**
     * Sets the defaultStringArrayValue property value. Default value for string array type items, if specified by the app developer
     * @param value Value to set for the defaultStringArrayValue property.
     */
    public void setDefaultStringArrayValue(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defaultStringArrayValue", value);
    }
    /**
     * Sets the defaultStringValue property value. Default value for string type items, if specified by the app developer
     * @param value Value to set for the defaultStringValue property.
     */
    public void setDefaultStringValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultStringValue", value);
    }
    /**
     * Sets the description property value. Description of what the item controls within the application
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Human readable name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the index property value. Unique index the application uses to maintain nested schema items
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("index", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the parentIndex property value. Index of parent schema item to track nested schema items
     * @param value Value to set for the parentIndex property.
     */
    public void setParentIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("parentIndex", value);
    }
    /**
     * Sets the schemaItemKey property value. Unique key the application uses to identify the item
     * @param value Value to set for the schemaItemKey property.
     */
    public void setSchemaItemKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schemaItemKey", value);
    }
    /**
     * Sets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     * @param value Value to set for the selections property.
     */
    public void setSelections(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("selections", value);
    }
}

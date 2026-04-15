package com.microsoft.graph.beta.models;

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
 * Single configuration item inside an Android application&apos;s configuration schema.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConfigurationSchemaItemType implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppConfigurationSchemaItemType} and sets the default values.
     */
    public AppConfigurationSchemaItemType() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppConfigurationSchemaItemType}
     */
    @jakarta.annotation.Nonnull
    public static AppConfigurationSchemaItemType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.appConfigurationSchemaItemBooleanType": return new AppConfigurationSchemaItemBooleanType();
                case "#microsoft.graph.appConfigurationSchemaItemBundleArray": return new AppConfigurationSchemaItemBundleArray();
                case "#microsoft.graph.appConfigurationSchemaItemBundleType": return new AppConfigurationSchemaItemBundleType();
                case "#microsoft.graph.appConfigurationSchemaItemChoiceType": return new AppConfigurationSchemaItemChoiceType();
                case "#microsoft.graph.appConfigurationSchemaItemHiddenType": return new AppConfigurationSchemaItemHiddenType();
                case "#microsoft.graph.appConfigurationSchemaItemIntegerType": return new AppConfigurationSchemaItemIntegerType();
                case "#microsoft.graph.appConfigurationSchemaItemMultiselectType": return new AppConfigurationSchemaItemMultiselectType();
                case "#microsoft.graph.appConfigurationSchemaItemStringType": return new AppConfigurationSchemaItemStringType();
            }
        }
        return new AppConfigurationSchemaItemType();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the description property value. Description of what the item controls within the application
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Human readable name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentIndex", (n) -> { this.setParentIndex(n.getIntegerValue()); });
        deserializerMap.put("schemaItemKey", (n) -> { this.setSchemaItemKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. Unique index the application uses to maintain nested schema items. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.backingStore.get("index");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the parentIndex property value. Index of parent schema item to track nested schema items. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getParentIndex() {
        return this.backingStore.get("parentIndex");
    }
    /**
     * Gets the schemaItemKey property value. Unique key the application uses to identify the item
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaItemKey() {
        return this.backingStore.get("schemaItemKey");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("parentIndex", this.getParentIndex());
        writer.writeStringValue("schemaItemKey", this.getSchemaItemKey());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
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
     * Sets the index property value. Unique index the application uses to maintain nested schema items. Valid values 0 to 2147483647
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
     * Sets the parentIndex property value. Index of parent schema item to track nested schema items. Valid values 0 to 2147483647
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
}

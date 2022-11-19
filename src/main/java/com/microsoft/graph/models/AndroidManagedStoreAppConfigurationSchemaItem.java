package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Single configuration item inside an Android application's custom configuration schema. */
public class AndroidManagedStoreAppConfigurationSchemaItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Data type for a configuration item inside an Android application's custom configuration schema */
    private AndroidManagedStoreAppConfigurationSchemaItemDataType _dataType;
    /** Default value for boolean type items, if specified by the app developer */
    private Boolean _defaultBoolValue;
    /** Default value for integer type items, if specified by the app developer */
    private Integer _defaultIntValue;
    /** Default value for string array type items, if specified by the app developer */
    private java.util.List<String> _defaultStringArrayValue;
    /** Default value for string type items, if specified by the app developer */
    private String _defaultStringValue;
    /** Description of what the item controls within the application */
    private String _description;
    /** Human readable name */
    private String _displayName;
    /** Unique index the application uses to maintain nested schema items */
    private Integer _index;
    /** The OdataType property */
    private String _odataType;
    /** Index of parent schema item to track nested schema items */
    private Integer _parentIndex;
    /** Unique key the application uses to identify the item */
    private String _schemaItemKey;
    /** List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only) */
    private java.util.List<KeyValuePair> _selections;
    /**
     * Instantiates a new androidManagedStoreAppConfigurationSchemaItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAppConfigurationSchemaItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidManagedStoreAppConfigurationSchemaItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidManagedStoreAppConfigurationSchemaItem
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreAppConfigurationSchemaItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppConfigurationSchemaItem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the dataType property value. Data type for a configuration item inside an Android application's custom configuration schema
     * @return a androidManagedStoreAppConfigurationSchemaItemDataType
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAppConfigurationSchemaItemDataType getDataType() {
        return this._dataType;
    }
    /**
     * Gets the defaultBoolValue property value. Default value for boolean type items, if specified by the app developer
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefaultBoolValue() {
        return this._defaultBoolValue;
    }
    /**
     * Gets the defaultIntValue property value. Default value for integer type items, if specified by the app developer
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefaultIntValue() {
        return this._defaultIntValue;
    }
    /**
     * Gets the defaultStringArrayValue property value. Default value for string array type items, if specified by the app developer
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefaultStringArrayValue() {
        return this._defaultStringArrayValue;
    }
    /**
     * Gets the defaultStringValue property value. Default value for string type items, if specified by the app developer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultStringValue() {
        return this._defaultStringValue;
    }
    /**
     * Gets the description property value. Description of what the item controls within the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Human readable name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedStoreAppConfigurationSchemaItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(12);
        deserializerMap.put("dataType", (n) -> { currentObject.setDataType(n.getEnumValue(AndroidManagedStoreAppConfigurationSchemaItemDataType.class)); });
        deserializerMap.put("defaultBoolValue", (n) -> { currentObject.setDefaultBoolValue(n.getBooleanValue()); });
        deserializerMap.put("defaultIntValue", (n) -> { currentObject.setDefaultIntValue(n.getIntegerValue()); });
        deserializerMap.put("defaultStringArrayValue", (n) -> { currentObject.setDefaultStringArrayValue(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defaultStringValue", (n) -> { currentObject.setDefaultStringValue(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("index", (n) -> { currentObject.setIndex(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentIndex", (n) -> { currentObject.setParentIndex(n.getIntegerValue()); });
        deserializerMap.put("schemaItemKey", (n) -> { currentObject.setSchemaItemKey(n.getStringValue()); });
        deserializerMap.put("selections", (n) -> { currentObject.setSelections(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the index property value. Unique index the application uses to maintain nested schema items
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIndex() {
        return this._index;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the parentIndex property value. Index of parent schema item to track nested schema items
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getParentIndex() {
        return this._parentIndex;
    }
    /**
     * Gets the schemaItemKey property value. Unique key the application uses to identify the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchemaItemKey() {
        return this._schemaItemKey;
    }
    /**
     * Gets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getSelections() {
        return this._selections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the dataType property value. Data type for a configuration item inside an Android application's custom configuration schema
     * @param value Value to set for the dataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataType(@javax.annotation.Nullable final AndroidManagedStoreAppConfigurationSchemaItemDataType value) {
        this._dataType = value;
    }
    /**
     * Sets the defaultBoolValue property value. Default value for boolean type items, if specified by the app developer
     * @param value Value to set for the defaultBoolValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultBoolValue(@javax.annotation.Nullable final Boolean value) {
        this._defaultBoolValue = value;
    }
    /**
     * Sets the defaultIntValue property value. Default value for integer type items, if specified by the app developer
     * @param value Value to set for the defaultIntValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultIntValue(@javax.annotation.Nullable final Integer value) {
        this._defaultIntValue = value;
    }
    /**
     * Sets the defaultStringArrayValue property value. Default value for string array type items, if specified by the app developer
     * @param value Value to set for the defaultStringArrayValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultStringArrayValue(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defaultStringArrayValue = value;
    }
    /**
     * Sets the defaultStringValue property value. Default value for string type items, if specified by the app developer
     * @param value Value to set for the defaultStringValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultStringValue(@javax.annotation.Nullable final String value) {
        this._defaultStringValue = value;
    }
    /**
     * Sets the description property value. Description of what the item controls within the application
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Human readable name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the index property value. Unique index the application uses to maintain nested schema items
     * @param value Value to set for the index property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndex(@javax.annotation.Nullable final Integer value) {
        this._index = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the parentIndex property value. Index of parent schema item to track nested schema items
     * @param value Value to set for the parentIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentIndex(@javax.annotation.Nullable final Integer value) {
        this._parentIndex = value;
    }
    /**
     * Sets the schemaItemKey property value. Unique key the application uses to identify the item
     * @param value Value to set for the schemaItemKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchemaItemKey(@javax.annotation.Nullable final String value) {
        this._schemaItemKey = value;
    }
    /**
     * Sets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     * @param value Value to set for the selections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelections(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._selections = value;
    }
}

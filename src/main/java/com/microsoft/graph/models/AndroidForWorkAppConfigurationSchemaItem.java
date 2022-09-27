package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Single configuration item inside an Android for Work application's custom configuration schema. */
public class AndroidForWorkAppConfigurationSchemaItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Data type for a configuration item inside an Android for Work application's custom configuration schema */
    private AndroidForWorkAppConfigurationSchemaItemDataType _dataType;
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
    /** The OdataType property */
    private String _odataType;
    /** Unique key the application uses to identify the item */
    private String _schemaItemKey;
    /** List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only) */
    private java.util.List<KeyValuePair> _selections;
    /**
     * Instantiates a new androidForWorkAppConfigurationSchemaItem and sets the default values.
     * @return a void
     */
    public AndroidForWorkAppConfigurationSchemaItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidForWorkAppConfigurationSchemaItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidForWorkAppConfigurationSchemaItem
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkAppConfigurationSchemaItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkAppConfigurationSchemaItem();
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
     * Gets the dataType property value. Data type for a configuration item inside an Android for Work application's custom configuration schema
     * @return a androidForWorkAppConfigurationSchemaItemDataType
     */
    @javax.annotation.Nullable
    public AndroidForWorkAppConfigurationSchemaItemDataType getDataType() {
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
        final AndroidForWorkAppConfigurationSchemaItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(10) {{
            this.put("dataType", (n) -> { currentObject.setDataType(n.getEnumValue(AndroidForWorkAppConfigurationSchemaItemDataType.class)); });
            this.put("defaultBoolValue", (n) -> { currentObject.setDefaultBoolValue(n.getBooleanValue()); });
            this.put("defaultIntValue", (n) -> { currentObject.setDefaultIntValue(n.getIntegerValue()); });
            this.put("defaultStringArrayValue", (n) -> { currentObject.setDefaultStringArrayValue(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defaultStringValue", (n) -> { currentObject.setDefaultStringValue(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("schemaItemKey", (n) -> { currentObject.setSchemaItemKey(n.getStringValue()); });
            this.put("selections", (n) -> { currentObject.setSelections(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        }};
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeBooleanValue("defaultBoolValue", this.getDefaultBoolValue());
        writer.writeIntegerValue("defaultIntValue", this.getDefaultIntValue());
        writer.writeCollectionOfPrimitiveValues("defaultStringArrayValue", this.getDefaultStringArrayValue());
        writer.writeStringValue("defaultStringValue", this.getDefaultStringValue());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("schemaItemKey", this.getSchemaItemKey());
        writer.writeCollectionOfObjectValues("selections", this.getSelections());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the dataType property value. Data type for a configuration item inside an Android for Work application's custom configuration schema
     * @param value Value to set for the dataType property.
     * @return a void
     */
    public void setDataType(@javax.annotation.Nullable final AndroidForWorkAppConfigurationSchemaItemDataType value) {
        this._dataType = value;
    }
    /**
     * Sets the defaultBoolValue property value. Default value for boolean type items, if specified by the app developer
     * @param value Value to set for the defaultBoolValue property.
     * @return a void
     */
    public void setDefaultBoolValue(@javax.annotation.Nullable final Boolean value) {
        this._defaultBoolValue = value;
    }
    /**
     * Sets the defaultIntValue property value. Default value for integer type items, if specified by the app developer
     * @param value Value to set for the defaultIntValue property.
     * @return a void
     */
    public void setDefaultIntValue(@javax.annotation.Nullable final Integer value) {
        this._defaultIntValue = value;
    }
    /**
     * Sets the defaultStringArrayValue property value. Default value for string array type items, if specified by the app developer
     * @param value Value to set for the defaultStringArrayValue property.
     * @return a void
     */
    public void setDefaultStringArrayValue(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defaultStringArrayValue = value;
    }
    /**
     * Sets the defaultStringValue property value. Default value for string type items, if specified by the app developer
     * @param value Value to set for the defaultStringValue property.
     * @return a void
     */
    public void setDefaultStringValue(@javax.annotation.Nullable final String value) {
        this._defaultStringValue = value;
    }
    /**
     * Sets the description property value. Description of what the item controls within the application
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Human readable name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the schemaItemKey property value. Unique key the application uses to identify the item
     * @param value Value to set for the schemaItemKey property.
     * @return a void
     */
    public void setSchemaItemKey(@javax.annotation.Nullable final String value) {
        this._schemaItemKey = value;
    }
    /**
     * Sets the selections property value. List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     * @param value Value to set for the selections property.
     * @return a void
     */
    public void setSelections(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._selections = value;
    }
}

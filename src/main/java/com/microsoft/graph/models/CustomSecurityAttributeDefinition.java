package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomSecurityAttributeDefinition extends Entity implements Parsable {
    /** Values that are predefined for this custom security attribute.This navigation property is not returned by default and must be specified in an $expand query. For example, /directory/customSecurityAttributeDefinitions?$expand=allowedValues. */
    private java.util.List<AllowedValue> _allowedValues;
    /** Name of the attribute set. Case insensitive. */
    private String _attributeSet;
    /** Description of the custom security attribute. Can be up to 128 characters long and include Unicode characters. Can be changed later. */
    private String _description;
    /** Indicates whether multiple values can be assigned to the custom security attribute. Cannot be changed later. If type is set to Boolean, isCollection cannot be set to true. */
    private Boolean _isCollection;
    /** Indicates whether custom security attribute values will be indexed for searching on objects that are assigned attribute values. Cannot be changed later. */
    private Boolean _isSearchable;
    /** Name of the custom security attribute. Must be unique within an attribute set. Can be up to 32 characters long and include Unicode characters. Cannot contain spaces or special characters. Cannot be changed later. Case insensitive. */
    private String _name;
    /** Specifies whether the custom security attribute is active or deactivated. Acceptable values are Available and Deprecated. Can be changed later. */
    private String _status;
    /** Data type for the custom security attribute values. Supported types are Boolean, Integer, and String. Cannot be changed later. */
    private String _type;
    /** Indicates whether only predefined values can be assigned to the custom security attribute. If set to false, free-form values are allowed. Can later be changed from true to false, but cannot be changed from false to true. If type is set to Boolean, usePreDefinedValuesOnly cannot be set to true. */
    private Boolean _usePreDefinedValuesOnly;
    /**
     * Instantiates a new customSecurityAttributeDefinition and sets the default values.
     * @return a void
     */
    public CustomSecurityAttributeDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customSecurityAttributeDefinition
     */
    @javax.annotation.Nonnull
    public static CustomSecurityAttributeDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomSecurityAttributeDefinition();
    }
    /**
     * Gets the allowedValues property value. Values that are predefined for this custom security attribute.This navigation property is not returned by default and must be specified in an $expand query. For example, /directory/customSecurityAttributeDefinitions?$expand=allowedValues.
     * @return a allowedValue
     */
    @javax.annotation.Nullable
    public java.util.List<AllowedValue> getAllowedValues() {
        return this._allowedValues;
    }
    /**
     * Gets the attributeSet property value. Name of the attribute set. Case insensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttributeSet() {
        return this._attributeSet;
    }
    /**
     * Gets the description property value. Description of the custom security attribute. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomSecurityAttributeDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedValues", (n) -> { currentObject.setAllowedValues(n.getCollectionOfObjectValues(AllowedValue::createFromDiscriminatorValue)); });
            this.put("attributeSet", (n) -> { currentObject.setAttributeSet(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("isCollection", (n) -> { currentObject.setIsCollection(n.getBooleanValue()); });
            this.put("isSearchable", (n) -> { currentObject.setIsSearchable(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
            this.put("usePreDefinedValuesOnly", (n) -> { currentObject.setUsePreDefinedValuesOnly(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isCollection property value. Indicates whether multiple values can be assigned to the custom security attribute. Cannot be changed later. If type is set to Boolean, isCollection cannot be set to true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCollection() {
        return this._isCollection;
    }
    /**
     * Gets the isSearchable property value. Indicates whether custom security attribute values will be indexed for searching on objects that are assigned attribute values. Cannot be changed later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this._isSearchable;
    }
    /**
     * Gets the name property value. Name of the custom security attribute. Must be unique within an attribute set. Can be up to 32 characters long and include Unicode characters. Cannot contain spaces or special characters. Cannot be changed later. Case insensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the status property value. Specifies whether the custom security attribute is active or deactivated. Acceptable values are Available and Deprecated. Can be changed later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the type property value. Data type for the custom security attribute values. Supported types are Boolean, Integer, and String. Cannot be changed later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the usePreDefinedValuesOnly property value. Indicates whether only predefined values can be assigned to the custom security attribute. If set to false, free-form values are allowed. Can later be changed from true to false, but cannot be changed from false to true. If type is set to Boolean, usePreDefinedValuesOnly cannot be set to true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsePreDefinedValuesOnly() {
        return this._usePreDefinedValuesOnly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("allowedValues", this.getAllowedValues());
        writer.writeStringValue("attributeSet", this.getAttributeSet());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isCollection", this.getIsCollection());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
        writer.writeBooleanValue("usePreDefinedValuesOnly", this.getUsePreDefinedValuesOnly());
    }
    /**
     * Sets the allowedValues property value. Values that are predefined for this custom security attribute.This navigation property is not returned by default and must be specified in an $expand query. For example, /directory/customSecurityAttributeDefinitions?$expand=allowedValues.
     * @param value Value to set for the allowedValues property.
     * @return a void
     */
    public void setAllowedValues(@javax.annotation.Nullable final java.util.List<AllowedValue> value) {
        this._allowedValues = value;
    }
    /**
     * Sets the attributeSet property value. Name of the attribute set. Case insensitive.
     * @param value Value to set for the attributeSet property.
     * @return a void
     */
    public void setAttributeSet(@javax.annotation.Nullable final String value) {
        this._attributeSet = value;
    }
    /**
     * Sets the description property value. Description of the custom security attribute. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the isCollection property value. Indicates whether multiple values can be assigned to the custom security attribute. Cannot be changed later. If type is set to Boolean, isCollection cannot be set to true.
     * @param value Value to set for the isCollection property.
     * @return a void
     */
    public void setIsCollection(@javax.annotation.Nullable final Boolean value) {
        this._isCollection = value;
    }
    /**
     * Sets the isSearchable property value. Indicates whether custom security attribute values will be indexed for searching on objects that are assigned attribute values. Cannot be changed later.
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this._isSearchable = value;
    }
    /**
     * Sets the name property value. Name of the custom security attribute. Must be unique within an attribute set. Can be up to 32 characters long and include Unicode characters. Cannot contain spaces or special characters. Cannot be changed later. Case insensitive.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the status property value. Specifies whether the custom security attribute is active or deactivated. Acceptable values are Available and Deprecated. Can be changed later.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the type property value. Data type for the custom security attribute values. Supported types are Boolean, Integer, and String. Cannot be changed later.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the usePreDefinedValuesOnly property value. Indicates whether only predefined values can be assigned to the custom security attribute. If set to false, free-form values are allowed. Can later be changed from true to false, but cannot be changed from false to true. If type is set to Boolean, usePreDefinedValuesOnly cannot be set to true.
     * @param value Value to set for the usePreDefinedValuesOnly property.
     * @return a void
     */
    public void setUsePreDefinedValuesOnly(@javax.annotation.Nullable final Boolean value) {
        this._usePreDefinedValuesOnly = value;
    }
}

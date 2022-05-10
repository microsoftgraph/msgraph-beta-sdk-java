package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents the information about the property which is supported in crafting the rule of AssignmentFilter. */
public class AssignmentFilterSupportedProperty implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The data type of the property. */
    private String _dataType;
    /** Indicates whether the property is a collection type or not. */
    private Boolean _isCollection;
    /** Name of the property. */
    private String _name;
    /** Regex string to do validation on the property value. */
    private String _propertyRegexConstraint;
    /** List of all supported operators on this property. */
    private java.util.List<AssignmentFilterOperator> _supportedOperators;
    /** List of all supported values for this propery, empty if everything is supported. */
    private java.util.List<String> _supportedValues;
    /**
     * Instantiates a new assignmentFilterSupportedProperty and sets the default values.
     * @return a void
     */
    public AssignmentFilterSupportedProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterSupportedProperty
     */
    @javax.annotation.Nonnull
    public static AssignmentFilterSupportedProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterSupportedProperty();
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
     * Gets the dataType property value. The data type of the property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataType() {
        return this._dataType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignmentFilterSupportedProperty currentObject = this;
        return new HashMap<>(6) {{
            this.put("dataType", (n) -> { currentObject.setDataType(n.getStringValue()); });
            this.put("isCollection", (n) -> { currentObject.setIsCollection(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("propertyRegexConstraint", (n) -> { currentObject.setPropertyRegexConstraint(n.getStringValue()); });
            this.put("supportedOperators", (n) -> { currentObject.setSupportedOperators(n.getCollectionOfEnumValues(AssignmentFilterOperator.class)); });
            this.put("supportedValues", (n) -> { currentObject.setSupportedValues(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the isCollection property value. Indicates whether the property is a collection type or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCollection() {
        return this._isCollection;
    }
    /**
     * Gets the name property value. Name of the property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the propertyRegexConstraint property value. Regex string to do validation on the property value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPropertyRegexConstraint() {
        return this._propertyRegexConstraint;
    }
    /**
     * Gets the supportedOperators property value. List of all supported operators on this property.
     * @return a assignmentFilterOperator
     */
    @javax.annotation.Nullable
    public java.util.List<AssignmentFilterOperator> getSupportedOperators() {
        return this._supportedOperators;
    }
    /**
     * Gets the supportedValues property value. List of all supported values for this propery, empty if everything is supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedValues() {
        return this._supportedValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeBooleanValue("isCollection", this.getIsCollection());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("propertyRegexConstraint", this.getPropertyRegexConstraint());
        writer.writeCollectionOfEnumValues("supportedOperators", this.getSupportedOperators());
        writer.writeCollectionOfPrimitiveValues("supportedValues", this.getSupportedValues());
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
     * Sets the dataType property value. The data type of the property.
     * @param value Value to set for the dataType property.
     * @return a void
     */
    public void setDataType(@javax.annotation.Nullable final String value) {
        this._dataType = value;
    }
    /**
     * Sets the isCollection property value. Indicates whether the property is a collection type or not.
     * @param value Value to set for the isCollection property.
     * @return a void
     */
    public void setIsCollection(@javax.annotation.Nullable final Boolean value) {
        this._isCollection = value;
    }
    /**
     * Sets the name property value. Name of the property.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the propertyRegexConstraint property value. Regex string to do validation on the property value.
     * @param value Value to set for the propertyRegexConstraint property.
     * @return a void
     */
    public void setPropertyRegexConstraint(@javax.annotation.Nullable final String value) {
        this._propertyRegexConstraint = value;
    }
    /**
     * Sets the supportedOperators property value. List of all supported operators on this property.
     * @param value Value to set for the supportedOperators property.
     * @return a void
     */
    public void setSupportedOperators(@javax.annotation.Nullable final java.util.List<AssignmentFilterOperator> value) {
        this._supportedOperators = value;
    }
    /**
     * Sets the supportedValues property value. List of all supported values for this propery, empty if everything is supported.
     * @param value Value to set for the supportedValues property.
     * @return a void
     */
    public void setSupportedValues(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedValues = value;
    }
}

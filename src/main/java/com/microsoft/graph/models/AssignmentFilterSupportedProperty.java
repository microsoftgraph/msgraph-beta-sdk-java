package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the information about the property which is supported in crafting the rule of AssignmentFilter.
 */
public class AssignmentFilterSupportedProperty implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The data type of the property.
     */
    private String dataType;
    /**
     * Indicates whether the property is a collection type or not.
     */
    private Boolean isCollection;
    /**
     * Name of the property.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Regex string to do validation on the property value.
     */
    private String propertyRegexConstraint;
    /**
     * List of all supported operators on this property.
     */
    private java.util.List<AssignmentFilterOperator> supportedOperators;
    /**
     * List of all supported values for this property, empty if everything is supported.
     */
    private java.util.List<String> supportedValues;
    /**
     * Instantiates a new assignmentFilterSupportedProperty and sets the default values.
     */
    public AssignmentFilterSupportedProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterSupportedProperty
     */
    @jakarta.annotation.Nonnull
    public static AssignmentFilterSupportedProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterSupportedProperty();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dataType property value. The data type of the property.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.dataType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("isCollection", (n) -> { this.setIsCollection(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("propertyRegexConstraint", (n) -> { this.setPropertyRegexConstraint(n.getStringValue()); });
        deserializerMap.put("supportedOperators", (n) -> { this.setSupportedOperators(n.getCollectionOfEnumValues(AssignmentFilterOperator.class)); });
        deserializerMap.put("supportedValues", (n) -> { this.setSupportedValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isCollection property value. Indicates whether the property is a collection type or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCollection() {
        return this.isCollection;
    }
    /**
     * Gets the name property value. Name of the property.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the propertyRegexConstraint property value. Regex string to do validation on the property value.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPropertyRegexConstraint() {
        return this.propertyRegexConstraint;
    }
    /**
     * Gets the supportedOperators property value. List of all supported operators on this property.
     * @return a assignmentFilterOperator
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentFilterOperator> getSupportedOperators() {
        return this.supportedOperators;
    }
    /**
     * Gets the supportedValues property value. List of all supported values for this property, empty if everything is supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedValues() {
        return this.supportedValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeBooleanValue("isCollection", this.getIsCollection());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("propertyRegexConstraint", this.getPropertyRegexConstraint());
        writer.writeCollectionOfEnumValues("supportedOperators", this.getSupportedOperators());
        writer.writeCollectionOfPrimitiveValues("supportedValues", this.getSupportedValues());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dataType property value. The data type of the property.
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.dataType = value;
    }
    /**
     * Sets the isCollection property value. Indicates whether the property is a collection type or not.
     * @param value Value to set for the isCollection property.
     */
    public void setIsCollection(@jakarta.annotation.Nullable final Boolean value) {
        this.isCollection = value;
    }
    /**
     * Sets the name property value. Name of the property.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the propertyRegexConstraint property value. Regex string to do validation on the property value.
     * @param value Value to set for the propertyRegexConstraint property.
     */
    public void setPropertyRegexConstraint(@jakarta.annotation.Nullable final String value) {
        this.propertyRegexConstraint = value;
    }
    /**
     * Sets the supportedOperators property value. List of all supported operators on this property.
     * @param value Value to set for the supportedOperators property.
     */
    public void setSupportedOperators(@jakarta.annotation.Nullable final java.util.List<AssignmentFilterOperator> value) {
        this.supportedOperators = value;
    }
    /**
     * Sets the supportedValues property value. List of all supported values for this property, empty if everything is supported.
     * @param value Value to set for the supportedValues property.
     */
    public void setSupportedValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportedValues = value;
    }
}

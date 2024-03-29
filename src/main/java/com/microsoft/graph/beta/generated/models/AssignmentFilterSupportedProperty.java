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
 * Represents the information about the property which is supported in crafting the rule of AssignmentFilter.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentFilterSupportedProperty implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AssignmentFilterSupportedProperty} and sets the default values.
     */
    public AssignmentFilterSupportedProperty() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AssignmentFilterSupportedProperty}
     */
    @jakarta.annotation.Nonnull
    public static AssignmentFilterSupportedProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterSupportedProperty();
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
     * Gets the dataType property value. The data type of the property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.backingStore.get("dataType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("isCollection", (n) -> { this.setIsCollection(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("propertyRegexConstraint", (n) -> { this.setPropertyRegexConstraint(n.getStringValue()); });
        deserializerMap.put("supportedOperators", (n) -> { this.setSupportedOperators(n.getCollectionOfEnumValues(AssignmentFilterOperator::forValue)); });
        deserializerMap.put("supportedValues", (n) -> { this.setSupportedValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isCollection property value. Indicates whether the property is a collection type or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCollection() {
        return this.backingStore.get("isCollection");
    }
    /**
     * Gets the name property value. Name of the property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the propertyRegexConstraint property value. Regex string to do validation on the property value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyRegexConstraint() {
        return this.backingStore.get("propertyRegexConstraint");
    }
    /**
     * Gets the supportedOperators property value. List of all supported operators on this property.
     * @return a {@link java.util.List<AssignmentFilterOperator>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentFilterOperator> getSupportedOperators() {
        return this.backingStore.get("supportedOperators");
    }
    /**
     * Gets the supportedValues property value. List of all supported values for this property, empty if everything is supported.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedValues() {
        return this.backingStore.get("supportedValues");
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
     * Sets the dataType property value. The data type of the property.
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataType", value);
    }
    /**
     * Sets the isCollection property value. Indicates whether the property is a collection type or not.
     * @param value Value to set for the isCollection property.
     */
    public void setIsCollection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCollection", value);
    }
    /**
     * Sets the name property value. Name of the property.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the propertyRegexConstraint property value. Regex string to do validation on the property value.
     * @param value Value to set for the propertyRegexConstraint property.
     */
    public void setPropertyRegexConstraint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("propertyRegexConstraint", value);
    }
    /**
     * Sets the supportedOperators property value. List of all supported operators on this property.
     * @param value Value to set for the supportedOperators property.
     */
    public void setSupportedOperators(@jakarta.annotation.Nullable final java.util.List<AssignmentFilterOperator> value) {
        this.backingStore.set("supportedOperators", value);
    }
    /**
     * Sets the supportedValues property value. List of all supported values for this property, empty if everything is supported.
     * @param value Value to set for the supportedValues property.
     */
    public void setSupportedValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedValues", value);
    }
}

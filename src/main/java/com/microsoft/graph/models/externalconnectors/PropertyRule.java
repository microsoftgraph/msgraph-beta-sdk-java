package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.BinaryOperator;
public class PropertyRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Specifies the operations to be performed during evaluation of a single propertyRule, where property and a string from the values collection are the respective operands. Possible values are: null, equals, notEquals, contains, notContains, lessThan, greaterThan, startsWith, unknownFutureValue. Required.  */
    private RuleOperation _operation;
    /** The property from the externalItem schema. Required.  */
    private String _property;
    /** A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.  */
    private java.util.List<String> _values;
    /** The join operator for evaluating multiple propertyRules. For example, if and is specified, then all propertyRules must be true for the propertyRule to be true. Possible values are: or, and. Required.  */
    private BinaryOperator _valuesJoinedBy;
    /**
     * Instantiates a new propertyRule and sets the default values.
     * @return a void
     */
    public PropertyRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a propertyRule
     */
    @javax.annotation.Nonnull
    public static PropertyRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyRule();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PropertyRule currentObject = this;
        return new HashMap<>(4) {{
            this.put("operation", (n) -> { currentObject.setOperation(n.getEnumValue(RuleOperation.class)); });
            this.put("property", (n) -> { currentObject.setProperty(n.getStringValue()); });
            this.put("values", (n) -> { currentObject.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("valuesJoinedBy", (n) -> { currentObject.setValuesJoinedBy(n.getEnumValue(BinaryOperator.class)); });
        }};
    }
    /**
     * Gets the operation property value. Specifies the operations to be performed during evaluation of a single propertyRule, where property and a string from the values collection are the respective operands. Possible values are: null, equals, notEquals, contains, notContains, lessThan, greaterThan, startsWith, unknownFutureValue. Required.
     * @return a ruleOperation
     */
    @javax.annotation.Nullable
    public RuleOperation getOperation() {
        return this._operation;
    }
    /**
     * Gets the property property value. The property from the externalItem schema. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProperty() {
        return this._property;
    }
    /**
     * Gets the values property value. A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getValues() {
        return this._values;
    }
    /**
     * Gets the valuesJoinedBy property value. The join operator for evaluating multiple propertyRules. For example, if and is specified, then all propertyRules must be true for the propertyRule to be true. Possible values are: or, and. Required.
     * @return a binaryOperator
     */
    @javax.annotation.Nullable
    public BinaryOperator getValuesJoinedBy() {
        return this._valuesJoinedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("operation", this.getOperation());
        writer.writeStringValue("property", this.getProperty());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
        writer.writeEnumValue("valuesJoinedBy", this.getValuesJoinedBy());
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
     * Sets the operation property value. Specifies the operations to be performed during evaluation of a single propertyRule, where property and a string from the values collection are the respective operands. Possible values are: null, equals, notEquals, contains, notContains, lessThan, greaterThan, startsWith, unknownFutureValue. Required.
     * @param value Value to set for the operation property.
     * @return a void
     */
    public void setOperation(@javax.annotation.Nullable final RuleOperation value) {
        this._operation = value;
    }
    /**
     * Sets the property property value. The property from the externalItem schema. Required.
     * @param value Value to set for the property property.
     * @return a void
     */
    public void setProperty(@javax.annotation.Nullable final String value) {
        this._property = value;
    }
    /**
     * Sets the values property value. A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final java.util.List<String> value) {
        this._values = value;
    }
    /**
     * Sets the valuesJoinedBy property value. The join operator for evaluating multiple propertyRules. For example, if and is specified, then all propertyRules must be true for the propertyRule to be true. Possible values are: or, and. Required.
     * @param value Value to set for the valuesJoinedBy property.
     * @return a void
     */
    public void setValuesJoinedBy(@javax.annotation.Nullable final BinaryOperator value) {
        this._valuesJoinedBy = value;
    }
}

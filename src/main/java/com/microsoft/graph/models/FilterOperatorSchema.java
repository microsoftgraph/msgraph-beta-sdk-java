package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FilterOperatorSchema extends Entity implements Parsable {
    /** The arity property */
    private ScopeOperatorType _arity;
    /** The multivaluedComparisonType property */
    private ScopeOperatorMultiValuedComparisonType _multivaluedComparisonType;
    /** Attribute types supported by the operator. Possible values are: Boolean, Binary, Reference, Integer, String. */
    private java.util.List<String> _supportedAttributeTypes;
    /**
     * Instantiates a new filterOperatorSchema and sets the default values.
     * @return a void
     */
    public FilterOperatorSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filterOperatorSchema
     */
    @javax.annotation.Nonnull
    public static FilterOperatorSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilterOperatorSchema();
    }
    /**
     * Gets the arity property value. The arity property
     * @return a scopeOperatorType
     */
    @javax.annotation.Nullable
    public ScopeOperatorType getArity() {
        return this._arity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FilterOperatorSchema currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("arity", (n) -> { currentObject.setArity(n.getEnumValue(ScopeOperatorType.class)); });
            this.put("multivaluedComparisonType", (n) -> { currentObject.setMultivaluedComparisonType(n.getEnumValue(ScopeOperatorMultiValuedComparisonType.class)); });
            this.put("supportedAttributeTypes", (n) -> { currentObject.setSupportedAttributeTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the multivaluedComparisonType property value. The multivaluedComparisonType property
     * @return a scopeOperatorMultiValuedComparisonType
     */
    @javax.annotation.Nullable
    public ScopeOperatorMultiValuedComparisonType getMultivaluedComparisonType() {
        return this._multivaluedComparisonType;
    }
    /**
     * Gets the supportedAttributeTypes property value. Attribute types supported by the operator. Possible values are: Boolean, Binary, Reference, Integer, String.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedAttributeTypes() {
        return this._supportedAttributeTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("arity", this.getArity());
        writer.writeEnumValue("multivaluedComparisonType", this.getMultivaluedComparisonType());
        writer.writeCollectionOfPrimitiveValues("supportedAttributeTypes", this.getSupportedAttributeTypes());
    }
    /**
     * Sets the arity property value. The arity property
     * @param value Value to set for the arity property.
     * @return a void
     */
    public void setArity(@javax.annotation.Nullable final ScopeOperatorType value) {
        this._arity = value;
    }
    /**
     * Sets the multivaluedComparisonType property value. The multivaluedComparisonType property
     * @param value Value to set for the multivaluedComparisonType property.
     * @return a void
     */
    public void setMultivaluedComparisonType(@javax.annotation.Nullable final ScopeOperatorMultiValuedComparisonType value) {
        this._multivaluedComparisonType = value;
    }
    /**
     * Sets the supportedAttributeTypes property value. Attribute types supported by the operator. Possible values are: Boolean, Binary, Reference, Integer, String.
     * @param value Value to set for the supportedAttributeTypes property.
     * @return a void
     */
    public void setSupportedAttributeTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedAttributeTypes = value;
    }
}

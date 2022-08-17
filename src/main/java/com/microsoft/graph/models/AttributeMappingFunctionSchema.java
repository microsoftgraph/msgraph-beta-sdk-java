package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeMappingFunctionSchema extends Entity implements Parsable {
    /** Collection of function parameters. */
    private java.util.List<AttributeMappingParameterSchema> _parameters;
    /**
     * Instantiates a new attributeMappingFunctionSchema and sets the default values.
     * @return a void
     */
    public AttributeMappingFunctionSchema() {
        super();
        this.setOdataType("#microsoft.graph.attributeMappingFunctionSchema");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeMappingFunctionSchema
     */
    @javax.annotation.Nonnull
    public static AttributeMappingFunctionSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMappingFunctionSchema();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeMappingFunctionSchema currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("parameters", (n) -> { currentObject.setParameters(n.getCollectionOfObjectValues(AttributeMappingParameterSchema::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the parameters property value. Collection of function parameters.
     * @return a attributeMappingParameterSchema
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeMappingParameterSchema> getParameters() {
        return this._parameters;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
    }
    /**
     * Sets the parameters property value. Collection of function parameters.
     * @param value Value to set for the parameters property.
     * @return a void
     */
    public void setParameters(@javax.annotation.Nullable final java.util.List<AttributeMappingParameterSchema> value) {
        this._parameters = value;
    }
}

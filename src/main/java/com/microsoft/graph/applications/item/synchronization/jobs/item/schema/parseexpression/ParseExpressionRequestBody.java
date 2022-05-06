package microsoft.graph.applications.item.synchronization.jobs.item.schema.parseexpression;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AttributeDefinition;
import microsoft.graph.models.ExpressionInputObject;
/** Provides operations to call the parseExpression method.  */
public class ParseExpressionRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The expression property  */
    private String _expression;
    /** The targetAttributeDefinition property  */
    private AttributeDefinition _targetAttributeDefinition;
    /** The testInputObject property  */
    private ExpressionInputObject _testInputObject;
    /**
     * Instantiates a new parseExpressionRequestBody and sets the default values.
     * @return a void
     */
    public ParseExpressionRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a parseExpressionRequestBody
     */
    @javax.annotation.Nonnull
    public static ParseExpressionRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParseExpressionRequestBody();
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
     * Gets the expression property value. The expression property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpression() {
        return this._expression;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ParseExpressionRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("expression", (n) -> { currentObject.setExpression(n.getStringValue()); });
            this.put("targetAttributeDefinition", (n) -> { currentObject.setTargetAttributeDefinition(n.getObjectValue(AttributeDefinition::createFromDiscriminatorValue)); });
            this.put("testInputObject", (n) -> { currentObject.setTestInputObject(n.getObjectValue(ExpressionInputObject::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the targetAttributeDefinition property value. The targetAttributeDefinition property
     * @return a attributeDefinition
     */
    @javax.annotation.Nullable
    public AttributeDefinition getTargetAttributeDefinition() {
        return this._targetAttributeDefinition;
    }
    /**
     * Gets the testInputObject property value. The testInputObject property
     * @return a expressionInputObject
     */
    @javax.annotation.Nullable
    public ExpressionInputObject getTestInputObject() {
        return this._testInputObject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeObjectValue("targetAttributeDefinition", this.getTargetAttributeDefinition());
        writer.writeObjectValue("testInputObject", this.getTestInputObject());
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
     * Sets the expression property value. The expression property
     * @param value Value to set for the expression property.
     * @return a void
     */
    public void setExpression(@javax.annotation.Nullable final String value) {
        this._expression = value;
    }
    /**
     * Sets the targetAttributeDefinition property value. The targetAttributeDefinition property
     * @param value Value to set for the targetAttributeDefinition property.
     * @return a void
     */
    public void setTargetAttributeDefinition(@javax.annotation.Nullable final AttributeDefinition value) {
        this._targetAttributeDefinition = value;
    }
    /**
     * Sets the testInputObject property value. The testInputObject property
     * @param value Value to set for the testInputObject property.
     * @return a void
     */
    public void setTestInputObject(@javax.annotation.Nullable final ExpressionInputObject value) {
        this._testInputObject = value;
    }
}

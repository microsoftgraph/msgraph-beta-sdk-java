package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParseExpressionResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Error details, if expression evaluation resulted in an error. */
    private PublicError _error;
    /** A collection of values produced by the evaluation of the expression. */
    private java.util.List<String> _evaluationResult;
    /** true if the evaluation was successful. */
    private Boolean _evaluationSucceeded;
    /** The OdataType property */
    private String _odataType;
    /** An attributeMappingSource object representing the parsed expression. */
    private AttributeMappingSource _parsedExpression;
    /** true if the expression was parsed successfully. */
    private Boolean _parsingSucceeded;
    /**
     * Instantiates a new parseExpressionResponse and sets the default values.
     * @return a void
     */
    public ParseExpressionResponse() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.parseExpressionResponse");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a parseExpressionResponse
     */
    @javax.annotation.Nonnull
    public static ParseExpressionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParseExpressionResponse();
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
     * Gets the error property value. Error details, if expression evaluation resulted in an error.
     * @return a publicError
     */
    @javax.annotation.Nullable
    public PublicError getError() {
        return this._error;
    }
    /**
     * Gets the evaluationResult property value. A collection of values produced by the evaluation of the expression.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEvaluationResult() {
        return this._evaluationResult;
    }
    /**
     * Gets the evaluationSucceeded property value. true if the evaluation was successful.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEvaluationSucceeded() {
        return this._evaluationSucceeded;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ParseExpressionResponse currentObject = this;
        return new HashMap<>(6) {{
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
            this.put("evaluationResult", (n) -> { currentObject.setEvaluationResult(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("evaluationSucceeded", (n) -> { currentObject.setEvaluationSucceeded(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("parsedExpression", (n) -> { currentObject.setParsedExpression(n.getObjectValue(AttributeMappingSource::createFromDiscriminatorValue)); });
            this.put("parsingSucceeded", (n) -> { currentObject.setParsingSucceeded(n.getBooleanValue()); });
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
     * Gets the parsedExpression property value. An attributeMappingSource object representing the parsed expression.
     * @return a attributeMappingSource
     */
    @javax.annotation.Nullable
    public AttributeMappingSource getParsedExpression() {
        return this._parsedExpression;
    }
    /**
     * Gets the parsingSucceeded property value. true if the expression was parsed successfully.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getParsingSucceeded() {
        return this._parsingSucceeded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeCollectionOfPrimitiveValues("evaluationResult", this.getEvaluationResult());
        writer.writeBooleanValue("evaluationSucceeded", this.getEvaluationSucceeded());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("parsedExpression", this.getParsedExpression());
        writer.writeBooleanValue("parsingSucceeded", this.getParsingSucceeded());
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
     * Sets the error property value. Error details, if expression evaluation resulted in an error.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final PublicError value) {
        this._error = value;
    }
    /**
     * Sets the evaluationResult property value. A collection of values produced by the evaluation of the expression.
     * @param value Value to set for the evaluationResult property.
     * @return a void
     */
    public void setEvaluationResult(@javax.annotation.Nullable final java.util.List<String> value) {
        this._evaluationResult = value;
    }
    /**
     * Sets the evaluationSucceeded property value. true if the evaluation was successful.
     * @param value Value to set for the evaluationSucceeded property.
     * @return a void
     */
    public void setEvaluationSucceeded(@javax.annotation.Nullable final Boolean value) {
        this._evaluationSucceeded = value;
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
     * Sets the parsedExpression property value. An attributeMappingSource object representing the parsed expression.
     * @param value Value to set for the parsedExpression property.
     * @return a void
     */
    public void setParsedExpression(@javax.annotation.Nullable final AttributeMappingSource value) {
        this._parsedExpression = value;
    }
    /**
     * Sets the parsingSucceeded property value. true if the expression was parsed successfully.
     * @param value Value to set for the parsingSucceeded property.
     * @return a void
     */
    public void setParsingSucceeded(@javax.annotation.Nullable final Boolean value) {
        this._parsingSucceeded = value;
    }
}

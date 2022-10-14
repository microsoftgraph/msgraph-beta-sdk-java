package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RuleThreshold implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The aggregation property */
    private AggregationType _aggregation;
    /** The OdataType property */
    private String _odataType;
    /** The operator property */
    private OperatorType _operator;
    /** The target property */
    private Integer _target;
    /**
     * Instantiates a new ruleThreshold and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RuleThreshold() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagement.ruleThreshold");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ruleThreshold
     */
    @javax.annotation.Nonnull
    public static RuleThreshold createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleThreshold();
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
     * Gets the aggregation property value. The aggregation property
     * @return a aggregationType
     */
    @javax.annotation.Nullable
    public AggregationType getAggregation() {
        return this._aggregation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RuleThreshold currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("aggregation", (n) -> { currentObject.setAggregation(n.getEnumValue(AggregationType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("operator", (n) -> { currentObject.setOperator(n.getEnumValue(OperatorType.class)); });
            this.put("target", (n) -> { currentObject.setTarget(n.getIntegerValue()); });
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
     * Gets the operator property value. The operator property
     * @return a operatorType
     */
    @javax.annotation.Nullable
    public OperatorType getOperator() {
        return this._operator;
    }
    /**
     * Gets the target property value. The target property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("aggregation", this.getAggregation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeIntegerValue("target", this.getTarget());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the aggregation property value. The aggregation property
     * @param value Value to set for the aggregation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregation(@javax.annotation.Nullable final AggregationType value) {
        this._aggregation = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operator property value. The operator property
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final OperatorType value) {
        this._operator = value;
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final Integer value) {
        this._target = value;
    }
}

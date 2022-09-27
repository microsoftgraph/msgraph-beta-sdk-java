package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EvaluateLabelJobResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The responsiblePolicy property */
    private ResponsiblePolicy _responsiblePolicy;
    /** The responsibleSensitiveTypes property */
    private java.util.List<ResponsibleSensitiveType> _responsibleSensitiveTypes;
    /** The sensitivityLabel property */
    private MatchingLabel _sensitivityLabel;
    /**
     * Instantiates a new evaluateLabelJobResult and sets the default values.
     * @return a void
     */
    public EvaluateLabelJobResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.evaluateLabelJobResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateLabelJobResult
     */
    @javax.annotation.Nonnull
    public static EvaluateLabelJobResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateLabelJobResult();
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
        final EvaluateLabelJobResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("responsiblePolicy", (n) -> { currentObject.setResponsiblePolicy(n.getObjectValue(ResponsiblePolicy::createFromDiscriminatorValue)); });
            this.put("responsibleSensitiveTypes", (n) -> { currentObject.setResponsibleSensitiveTypes(n.getCollectionOfObjectValues(ResponsibleSensitiveType::createFromDiscriminatorValue)); });
            this.put("sensitivityLabel", (n) -> { currentObject.setSensitivityLabel(n.getObjectValue(MatchingLabel::createFromDiscriminatorValue)); });
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
     * Gets the responsiblePolicy property value. The responsiblePolicy property
     * @return a responsiblePolicy
     */
    @javax.annotation.Nullable
    public ResponsiblePolicy getResponsiblePolicy() {
        return this._responsiblePolicy;
    }
    /**
     * Gets the responsibleSensitiveTypes property value. The responsibleSensitiveTypes property
     * @return a responsibleSensitiveType
     */
    @javax.annotation.Nullable
    public java.util.List<ResponsibleSensitiveType> getResponsibleSensitiveTypes() {
        return this._responsibleSensitiveTypes;
    }
    /**
     * Gets the sensitivityLabel property value. The sensitivityLabel property
     * @return a matchingLabel
     */
    @javax.annotation.Nullable
    public MatchingLabel getSensitivityLabel() {
        return this._sensitivityLabel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("responsiblePolicy", this.getResponsiblePolicy());
        writer.writeCollectionOfObjectValues("responsibleSensitiveTypes", this.getResponsibleSensitiveTypes());
        writer.writeObjectValue("sensitivityLabel", this.getSensitivityLabel());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the responsiblePolicy property value. The responsiblePolicy property
     * @param value Value to set for the responsiblePolicy property.
     * @return a void
     */
    public void setResponsiblePolicy(@javax.annotation.Nullable final ResponsiblePolicy value) {
        this._responsiblePolicy = value;
    }
    /**
     * Sets the responsibleSensitiveTypes property value. The responsibleSensitiveTypes property
     * @param value Value to set for the responsibleSensitiveTypes property.
     * @return a void
     */
    public void setResponsibleSensitiveTypes(@javax.annotation.Nullable final java.util.List<ResponsibleSensitiveType> value) {
        this._responsibleSensitiveTypes = value;
    }
    /**
     * Sets the sensitivityLabel property value. The sensitivityLabel property
     * @param value Value to set for the sensitivityLabel property.
     * @return a void
     */
    public void setSensitivityLabel(@javax.annotation.Nullable final MatchingLabel value) {
        this._sensitivityLabel = value;
    }
}

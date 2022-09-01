package com.microsoft.graph.models;

import com.microsoft.graph.models.AccessPackageAnswerString;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAnswer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The question the answer is for. Required and Read-only. */
    private AccessPackageQuestion _answeredQuestion;
    /** The display value of the answer. Required. */
    private String _displayValue;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new accessPackageAnswer and sets the default values.
     * @return a void
     */
    public AccessPackageAnswer() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAnswer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAnswer
     */
    @javax.annotation.Nonnull
    public static AccessPackageAnswer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackageAnswerString": return new AccessPackageAnswerString();
            }
        }
        return new AccessPackageAnswer();
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
     * Gets the answeredQuestion property value. The question the answer is for. Required and Read-only.
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nullable
    public AccessPackageQuestion getAnsweredQuestion() {
        return this._answeredQuestion;
    }
    /**
     * Gets the displayValue property value. The display value of the answer. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayValue() {
        return this._displayValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAnswer currentObject = this;
        return new HashMap<>(3) {{
            this.put("answeredQuestion", (n) -> { currentObject.setAnsweredQuestion(n.getObjectValue(AccessPackageQuestion::createFromDiscriminatorValue)); });
            this.put("displayValue", (n) -> { currentObject.setDisplayValue(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("answeredQuestion", this.getAnsweredQuestion());
        writer.writeStringValue("displayValue", this.getDisplayValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the answeredQuestion property value. The question the answer is for. Required and Read-only.
     * @param value Value to set for the answeredQuestion property.
     * @return a void
     */
    public void setAnsweredQuestion(@javax.annotation.Nullable final AccessPackageQuestion value) {
        this._answeredQuestion = value;
    }
    /**
     * Sets the displayValue property value. The display value of the answer. Required.
     * @param value Value to set for the displayValue property.
     * @return a void
     */
    public void setDisplayValue(@javax.annotation.Nullable final String value) {
        this._displayValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}

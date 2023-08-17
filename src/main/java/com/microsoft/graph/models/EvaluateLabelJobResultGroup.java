package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EvaluateLabelJobResultGroup implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The automatic property
     */
    private EvaluateLabelJobResult automatic;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The recommended property
     */
    private EvaluateLabelJobResult recommended;
    /**
     * Instantiates a new evaluateLabelJobResultGroup and sets the default values.
     */
    public EvaluateLabelJobResultGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateLabelJobResultGroup
     */
    @jakarta.annotation.Nonnull
    public static EvaluateLabelJobResultGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateLabelJobResultGroup();
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
     * Gets the automatic property value. The automatic property
     * @return a evaluateLabelJobResult
     */
    @jakarta.annotation.Nullable
    public EvaluateLabelJobResult getAutomatic() {
        return this.automatic;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("automatic", (n) -> { this.setAutomatic(n.getObjectValue(EvaluateLabelJobResult::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommended", (n) -> { this.setRecommended(n.getObjectValue(EvaluateLabelJobResult::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the recommended property value. The recommended property
     * @return a evaluateLabelJobResult
     */
    @jakarta.annotation.Nullable
    public EvaluateLabelJobResult getRecommended() {
        return this.recommended;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("automatic", this.getAutomatic());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("recommended", this.getRecommended());
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
     * Sets the automatic property value. The automatic property
     * @param value Value to set for the automatic property.
     */
    public void setAutomatic(@jakarta.annotation.Nullable final EvaluateLabelJobResult value) {
        this.automatic = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recommended property value. The recommended property
     * @param value Value to set for the recommended property.
     */
    public void setRecommended(@jakarta.annotation.Nullable final EvaluateLabelJobResult value) {
        this.recommended = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateAllowedCombinationsResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The additionalInformation property */
    private String _additionalInformation;
    /** The conditionalAccessReferences property */
    private java.util.List<String> _conditionalAccessReferences;
    /** The currentCombinations property */
    private java.util.List<String> _currentCombinations;
    /** The OdataType property */
    private String _odataType;
    /** The previousCombinations property */
    private java.util.List<String> _previousCombinations;
    /**
     * Instantiates a new updateAllowedCombinationsResult and sets the default values.
     * @return a void
     */
    public UpdateAllowedCombinationsResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.updateAllowedCombinationsResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateAllowedCombinationsResult
     */
    @javax.annotation.Nonnull
    public static UpdateAllowedCombinationsResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAllowedCombinationsResult();
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
     * Gets the additionalInformation property value. The additionalInformation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInformation() {
        return this._additionalInformation;
    }
    /**
     * Gets the conditionalAccessReferences property value. The conditionalAccessReferences property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getConditionalAccessReferences() {
        return this._conditionalAccessReferences;
    }
    /**
     * Gets the currentCombinations property value. The currentCombinations property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCurrentCombinations() {
        return this._currentCombinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateAllowedCombinationsResult currentObject = this;
        return new HashMap<>(5) {{
            this.put("additionalInformation", (n) -> { currentObject.setAdditionalInformation(n.getStringValue()); });
            this.put("conditionalAccessReferences", (n) -> { currentObject.setConditionalAccessReferences(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("currentCombinations", (n) -> { currentObject.setCurrentCombinations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("previousCombinations", (n) -> { currentObject.setPreviousCombinations(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the previousCombinations property value. The previousCombinations property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPreviousCombinations() {
        return this._previousCombinations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeCollectionOfPrimitiveValues("conditionalAccessReferences", this.getConditionalAccessReferences());
        writer.writeCollectionOfPrimitiveValues("currentCombinations", this.getCurrentCombinations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("previousCombinations", this.getPreviousCombinations());
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
     * Sets the additionalInformation property value. The additionalInformation property
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    public void setAdditionalInformation(@javax.annotation.Nullable final String value) {
        this._additionalInformation = value;
    }
    /**
     * Sets the conditionalAccessReferences property value. The conditionalAccessReferences property
     * @param value Value to set for the conditionalAccessReferences property.
     * @return a void
     */
    public void setConditionalAccessReferences(@javax.annotation.Nullable final java.util.List<String> value) {
        this._conditionalAccessReferences = value;
    }
    /**
     * Sets the currentCombinations property value. The currentCombinations property
     * @param value Value to set for the currentCombinations property.
     * @return a void
     */
    public void setCurrentCombinations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._currentCombinations = value;
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
     * Sets the previousCombinations property value. The previousCombinations property
     * @param value Value to set for the previousCombinations property.
     * @return a void
     */
    public void setPreviousCombinations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._previousCombinations = value;
    }
}

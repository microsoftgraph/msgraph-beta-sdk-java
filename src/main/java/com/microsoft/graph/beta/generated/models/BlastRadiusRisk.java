package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlastRadiusRisk implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BlastRadiusRisk} and sets the default values.
     */
    public BlastRadiusRisk() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BlastRadiusRisk}
     */
    @jakarta.annotation.Nonnull
    public static BlastRadiusRisk createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlastRadiusRisk();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("riskIndicators", (n) -> { this.setRiskIndicators(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        deserializerMap.put("riskRecommendations", (n) -> { this.setRiskRecommendations(n.getCollectionOfObjectValues(RiskRecommendation::createFromDiscriminatorValue)); });
        deserializerMap.put("riskUrl", (n) -> { this.setRiskUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the riskIndicators property value. The riskIndicators property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRiskIndicators() {
        return this.backingStore.get("riskIndicators");
    }
    /**
     * Gets the riskLevel property value. The riskLevel property
     * @return a {@link RiskLevel}
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this.backingStore.get("riskLevel");
    }
    /**
     * Gets the riskRecommendations property value. The riskRecommendations property
     * @return a {@link java.util.List<RiskRecommendation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskRecommendation> getRiskRecommendations() {
        return this.backingStore.get("riskRecommendations");
    }
    /**
     * Gets the riskUrl property value. The riskUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRiskUrl() {
        return this.backingStore.get("riskUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("riskIndicators", this.getRiskIndicators());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeCollectionOfObjectValues("riskRecommendations", this.getRiskRecommendations());
        writer.writeStringValue("riskUrl", this.getRiskUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the riskIndicators property value. The riskIndicators property
     * @param value Value to set for the riskIndicators property.
     */
    public void setRiskIndicators(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("riskIndicators", value);
    }
    /**
     * Sets the riskLevel property value. The riskLevel property
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.backingStore.set("riskLevel", value);
    }
    /**
     * Sets the riskRecommendations property value. The riskRecommendations property
     * @param value Value to set for the riskRecommendations property.
     */
    public void setRiskRecommendations(@jakarta.annotation.Nullable final java.util.List<RiskRecommendation> value) {
        this.backingStore.set("riskRecommendations", value);
    }
    /**
     * Sets the riskUrl property value. The riskUrl property
     * @param value Value to set for the riskUrl property.
     */
    public void setRiskUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("riskUrl", value);
    }
}

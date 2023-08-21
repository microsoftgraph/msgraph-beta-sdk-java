package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertTemplate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category property
     */
    private String category;
    /**
     * The description property
     */
    private String description;
    /**
     * The impactedAssets property
     */
    private java.util.List<ImpactedAsset> impactedAssets;
    /**
     * The mitreTechniques property
     */
    private java.util.List<String> mitreTechniques;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The recommendedActions property
     */
    private String recommendedActions;
    /**
     * The severity property
     */
    private AlertSeverity severity;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new alertTemplate and sets the default values.
     */
    public AlertTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertTemplate
     */
    @jakarta.annotation.Nonnull
    public static AlertTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertTemplate();
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
     * Gets the category property value. The category property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("impactedAssets", (n) -> { this.setImpactedAssets(n.getCollectionOfObjectValues(ImpactedAsset::createFromDiscriminatorValue)); });
        deserializerMap.put("mitreTechniques", (n) -> { this.setMitreTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { this.setRecommendedActions(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the impactedAssets property value. The impactedAssets property
     * @return a impactedAsset
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImpactedAsset> getImpactedAssets() {
        return this.impactedAssets;
    }
    /**
     * Gets the mitreTechniques property value. The mitreTechniques property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMitreTechniques() {
        return this.mitreTechniques;
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
     * Gets the recommendedActions property value. The recommendedActions property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecommendedActions() {
        return this.recommendedActions;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a alertSeverity
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("impactedAssets", this.getImpactedAssets());
        writer.writeCollectionOfPrimitiveValues("mitreTechniques", this.getMitreTechniques());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("recommendedActions", this.getRecommendedActions());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the impactedAssets property value. The impactedAssets property
     * @param value Value to set for the impactedAssets property.
     */
    public void setImpactedAssets(@jakarta.annotation.Nullable final java.util.List<ImpactedAsset> value) {
        this.impactedAssets = value;
    }
    /**
     * Sets the mitreTechniques property value. The mitreTechniques property
     * @param value Value to set for the mitreTechniques property.
     */
    public void setMitreTechniques(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.mitreTechniques = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recommendedActions property value. The recommendedActions property
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final String value) {
        this.recommendedActions = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}

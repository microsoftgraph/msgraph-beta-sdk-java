package com.microsoft.graph.beta.models.security;

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
public class CreateAlertInput implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CreateAlertInput} and sets the default values.
     */
    public CreateAlertInput() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateAlertInput}
     */
    @jakarta.annotation.Nonnull
    public static CreateAlertInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAlertInput();
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
     * Gets the category property value. MITRE ATT&amp;CK category for the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the description property value. Free-text explanation of the suspicious activity or policy violation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the entityDefinitions property value. Inline entity definitions that associate entities with the alert.
     * @return a {@link java.util.List<EntityDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EntityDefinition> getEntityDefinitions() {
        return this.backingStore.get("entityDefinitions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("entityDefinitions", (n) -> { this.setEntityDefinitions(n.getCollectionOfObjectValues(EntityDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("isExcludedFromCorrelation", (n) -> { this.setIsExcludedFromCorrelation(n.getBooleanValue()); });
        deserializerMap.put("linkToIncident", (n) -> { this.setLinkToIncident(n.getLongValue()); });
        deserializerMap.put("mitreTechniques", (n) -> { this.setMitreTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { this.setRecommendedActions(n.getStringValue()); });
        deserializerMap.put("sentinelWorkspace", (n) -> { this.setSentinelWorkspace(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity::forValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExcludedFromCorrelation property value. Whether the alert is excluded from automatic correlation. Defaults to false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExcludedFromCorrelation() {
        return this.backingStore.get("isExcludedFromCorrelation");
    }
    /**
     * Gets the linkToIncident property value. Incident ID to link the alert to. Use 0 or omit the value to create a new incident.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLinkToIncident() {
        return this.backingStore.get("linkToIncident");
    }
    /**
     * Gets the mitreTechniques property value. MITRE ATT&amp;CK technique identifiers associated with the alert.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMitreTechniques() {
        return this.backingStore.get("mitreTechniques");
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
     * Gets the recommendedActions property value. Recommended remediation actions for the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecommendedActions() {
        return this.backingStore.get("recommendedActions");
    }
    /**
     * Gets the sentinelWorkspace property value. Microsoft Sentinel workspace identifier used for workspace routing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSentinelWorkspace() {
        return this.backingStore.get("sentinelWorkspace");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link AlertSeverity}
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the title property value. Short display name shown for the alert in the Defender portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("entityDefinitions", this.getEntityDefinitions());
        writer.writeBooleanValue("isExcludedFromCorrelation", this.getIsExcludedFromCorrelation());
        writer.writeLongValue("linkToIncident", this.getLinkToIncident());
        writer.writeCollectionOfPrimitiveValues("mitreTechniques", this.getMitreTechniques());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("recommendedActions", this.getRecommendedActions());
        writer.writeStringValue("sentinelWorkspace", this.getSentinelWorkspace());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the category property value. MITRE ATT&amp;CK category for the alert.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the description property value. Free-text explanation of the suspicious activity or policy violation.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the entityDefinitions property value. Inline entity definitions that associate entities with the alert.
     * @param value Value to set for the entityDefinitions property.
     */
    public void setEntityDefinitions(@jakarta.annotation.Nullable final java.util.List<EntityDefinition> value) {
        this.backingStore.set("entityDefinitions", value);
    }
    /**
     * Sets the isExcludedFromCorrelation property value. Whether the alert is excluded from automatic correlation. Defaults to false.
     * @param value Value to set for the isExcludedFromCorrelation property.
     */
    public void setIsExcludedFromCorrelation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExcludedFromCorrelation", value);
    }
    /**
     * Sets the linkToIncident property value. Incident ID to link the alert to. Use 0 or omit the value to create a new incident.
     * @param value Value to set for the linkToIncident property.
     */
    public void setLinkToIncident(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("linkToIncident", value);
    }
    /**
     * Sets the mitreTechniques property value. MITRE ATT&amp;CK technique identifiers associated with the alert.
     * @param value Value to set for the mitreTechniques property.
     */
    public void setMitreTechniques(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mitreTechniques", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recommendedActions property value. Recommended remediation actions for the alert.
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedActions", value);
    }
    /**
     * Sets the sentinelWorkspace property value. Microsoft Sentinel workspace identifier used for workspace routing.
     * @param value Value to set for the sentinelWorkspace property.
     */
    public void setSentinelWorkspace(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sentinelWorkspace", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the title property value. Short display name shown for the alert in the Defender portal.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}

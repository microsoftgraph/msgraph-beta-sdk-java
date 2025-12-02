package com.microsoft.graph.beta.models.networkaccess;

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
public class CloudApplicationMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudApplicationMetadata} and sets the default values.
     */
    public CloudApplicationMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudApplicationMetadata}
     */
    @jakarta.annotation.Nonnull
    public static CloudApplicationMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudApplicationMetadata();
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
     * Gets the categories property value. The list of categories for the application. Supported values are: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design &amp; hosting.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the cloudApplicationCatalogId property value. The ID of the application in the SaaS application catalog.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudApplicationCatalogId() {
        return this.backingStore.get("cloudApplicationCatalogId");
    }
    /**
     * Gets the complianceScore property value. The compliance score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getComplianceScore() {
        return this.backingStore.get("complianceScore");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("cloudApplicationCatalogId", (n) -> { this.setCloudApplicationCatalogId(n.getStringValue()); });
        deserializerMap.put("complianceScore", (n) -> { this.setComplianceScore(n.getIntegerValue()); });
        deserializerMap.put("generalScore", (n) -> { this.setGeneralScore(n.getIntegerValue()); });
        deserializerMap.put("legalScore", (n) -> { this.setLegalScore(n.getIntegerValue()); });
        deserializerMap.put("loginUser", (n) -> { this.setLoginUser(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getIntegerValue()); });
        deserializerMap.put("securityScore", (n) -> { this.setSecurityScore(n.getIntegerValue()); });
        deserializerMap.put("subactivity", (n) -> { this.setSubactivity(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the generalScore property value. The general score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGeneralScore() {
        return this.backingStore.get("generalScore");
    }
    /**
     * Gets the legalScore property value. The legal score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLegalScore() {
        return this.backingStore.get("legalScore");
    }
    /**
     * Gets the loginUser property value. The username that was used to log into the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLoginUser() {
        return this.backingStore.get("loginUser");
    }
    /**
     * Gets the name property value. The name of the application (e.g., ChatGPT, Salesforce, Bing).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the riskScore property value. The risk score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the securityScore property value. The security score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSecurityScore() {
        return this.backingStore.get("securityScore");
    }
    /**
     * Gets the subactivity property value. The subactivity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubactivity() {
        return this.backingStore.get("subactivity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeStringValue("cloudApplicationCatalogId", this.getCloudApplicationCatalogId());
        writer.writeIntegerValue("complianceScore", this.getComplianceScore());
        writer.writeIntegerValue("generalScore", this.getGeneralScore());
        writer.writeIntegerValue("legalScore", this.getLegalScore());
        writer.writeStringValue("loginUser", this.getLoginUser());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("riskScore", this.getRiskScore());
        writer.writeIntegerValue("securityScore", this.getSecurityScore());
        writer.writeStringValue("subactivity", this.getSubactivity());
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
     * Sets the categories property value. The list of categories for the application. Supported values are: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design &amp; hosting.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the cloudApplicationCatalogId property value. The ID of the application in the SaaS application catalog.
     * @param value Value to set for the cloudApplicationCatalogId property.
     */
    public void setCloudApplicationCatalogId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudApplicationCatalogId", value);
    }
    /**
     * Sets the complianceScore property value. The compliance score of the application.
     * @param value Value to set for the complianceScore property.
     */
    public void setComplianceScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("complianceScore", value);
    }
    /**
     * Sets the generalScore property value. The general score of the application.
     * @param value Value to set for the generalScore property.
     */
    public void setGeneralScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("generalScore", value);
    }
    /**
     * Sets the legalScore property value. The legal score of the application.
     * @param value Value to set for the legalScore property.
     */
    public void setLegalScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("legalScore", value);
    }
    /**
     * Sets the loginUser property value. The username that was used to log into the application.
     * @param value Value to set for the loginUser property.
     */
    public void setLoginUser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("loginUser", value);
    }
    /**
     * Sets the name property value. The name of the application (e.g., ChatGPT, Salesforce, Bing).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the riskScore property value. The risk score of the application.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("riskScore", value);
    }
    /**
     * Sets the securityScore property value. The security score of the application.
     * @param value Value to set for the securityScore property.
     */
    public void setSecurityScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("securityScore", value);
    }
    /**
     * Sets the subactivity property value. The subactivity property
     * @param value Value to set for the subactivity property.
     */
    public void setSubactivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subactivity", value);
    }
}

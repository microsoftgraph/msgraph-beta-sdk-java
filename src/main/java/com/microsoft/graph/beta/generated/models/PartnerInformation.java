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
public class PartnerInformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PartnerInformation} and sets the default values.
     */
    public PartnerInformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PartnerInformation}
     */
    @jakarta.annotation.Nonnull
    public static PartnerInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PartnerInformation();
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
     * Gets the commerceUrl property value. The commerceUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommerceUrl() {
        return this.backingStore.get("commerceUrl");
    }
    /**
     * Gets the companyName property value. The companyName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.backingStore.get("companyName");
    }
    /**
     * Gets the companyType property value. The companyType property
     * @return a {@link PartnerTenantType}
     */
    @jakarta.annotation.Nullable
    public PartnerTenantType getCompanyType() {
        return this.backingStore.get("companyType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("commerceUrl", (n) -> { this.setCommerceUrl(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("companyType", (n) -> { this.setCompanyType(n.getEnumValue(PartnerTenantType::forValue)); });
        deserializerMap.put("helpUrl", (n) -> { this.setHelpUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("partnerTenantId", (n) -> { this.setPartnerTenantId(n.getStringValue()); });
        deserializerMap.put("supportEmails", (n) -> { this.setSupportEmails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportTelephones", (n) -> { this.setSupportTelephones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportUrl", (n) -> { this.setSupportUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpUrl property value. The helpUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpUrl() {
        return this.backingStore.get("helpUrl");
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
     * Gets the partnerTenantId property value. The partnerTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPartnerTenantId() {
        return this.backingStore.get("partnerTenantId");
    }
    /**
     * Gets the supportEmails property value. The supportEmails property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportEmails() {
        return this.backingStore.get("supportEmails");
    }
    /**
     * Gets the supportTelephones property value. The supportTelephones property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportTelephones() {
        return this.backingStore.get("supportTelephones");
    }
    /**
     * Gets the supportUrl property value. The supportUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSupportUrl() {
        return this.backingStore.get("supportUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("commerceUrl", this.getCommerceUrl());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeEnumValue("companyType", this.getCompanyType());
        writer.writeStringValue("helpUrl", this.getHelpUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("partnerTenantId", this.getPartnerTenantId());
        writer.writeCollectionOfPrimitiveValues("supportEmails", this.getSupportEmails());
        writer.writeCollectionOfPrimitiveValues("supportTelephones", this.getSupportTelephones());
        writer.writeStringValue("supportUrl", this.getSupportUrl());
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
     * Sets the commerceUrl property value. The commerceUrl property
     * @param value Value to set for the commerceUrl property.
     */
    public void setCommerceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commerceUrl", value);
    }
    /**
     * Sets the companyName property value. The companyName property
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyName", value);
    }
    /**
     * Sets the companyType property value. The companyType property
     * @param value Value to set for the companyType property.
     */
    public void setCompanyType(@jakarta.annotation.Nullable final PartnerTenantType value) {
        this.backingStore.set("companyType", value);
    }
    /**
     * Sets the helpUrl property value. The helpUrl property
     * @param value Value to set for the helpUrl property.
     */
    public void setHelpUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("helpUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the partnerTenantId property value. The partnerTenantId property
     * @param value Value to set for the partnerTenantId property.
     */
    public void setPartnerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("partnerTenantId", value);
    }
    /**
     * Sets the supportEmails property value. The supportEmails property
     * @param value Value to set for the supportEmails property.
     */
    public void setSupportEmails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportEmails", value);
    }
    /**
     * Sets the supportTelephones property value. The supportTelephones property
     * @param value Value to set for the supportTelephones property.
     */
    public void setSupportTelephones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportTelephones", value);
    }
    /**
     * Sets the supportUrl property value. The supportUrl property
     * @param value Value to set for the supportUrl property.
     */
    public void setSupportUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("supportUrl", value);
    }
}

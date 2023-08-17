package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PartnerInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The commerceUrl property
     */
    private String commerceUrl;
    /**
     * The companyName property
     */
    private String companyName;
    /**
     * The companyType property
     */
    private PartnerTenantType companyType;
    /**
     * The helpUrl property
     */
    private String helpUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The partnerTenantId property
     */
    private String partnerTenantId;
    /**
     * The supportEmails property
     */
    private java.util.List<String> supportEmails;
    /**
     * The supportTelephones property
     */
    private java.util.List<String> supportTelephones;
    /**
     * The supportUrl property
     */
    private String supportUrl;
    /**
     * Instantiates a new partnerInformation and sets the default values.
     */
    public PartnerInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a partnerInformation
     */
    @jakarta.annotation.Nonnull
    public static PartnerInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PartnerInformation();
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
     * Gets the commerceUrl property value. The commerceUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCommerceUrl() {
        return this.commerceUrl;
    }
    /**
     * Gets the companyName property value. The companyName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the companyType property value. The companyType property
     * @return a partnerTenantType
     */
    @jakarta.annotation.Nullable
    public PartnerTenantType getCompanyType() {
        return this.companyType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("commerceUrl", (n) -> { this.setCommerceUrl(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("companyType", (n) -> { this.setCompanyType(n.getEnumValue(PartnerTenantType.class)); });
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHelpUrl() {
        return this.helpUrl;
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
     * Gets the partnerTenantId property value. The partnerTenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPartnerTenantId() {
        return this.partnerTenantId;
    }
    /**
     * Gets the supportEmails property value. The supportEmails property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportEmails() {
        return this.supportEmails;
    }
    /**
     * Gets the supportTelephones property value. The supportTelephones property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportTelephones() {
        return this.supportTelephones;
    }
    /**
     * Gets the supportUrl property value. The supportUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSupportUrl() {
        return this.supportUrl;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the commerceUrl property value. The commerceUrl property
     * @param value Value to set for the commerceUrl property.
     */
    public void setCommerceUrl(@jakarta.annotation.Nullable final String value) {
        this.commerceUrl = value;
    }
    /**
     * Sets the companyName property value. The companyName property
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the companyType property value. The companyType property
     * @param value Value to set for the companyType property.
     */
    public void setCompanyType(@jakarta.annotation.Nullable final PartnerTenantType value) {
        this.companyType = value;
    }
    /**
     * Sets the helpUrl property value. The helpUrl property
     * @param value Value to set for the helpUrl property.
     */
    public void setHelpUrl(@jakarta.annotation.Nullable final String value) {
        this.helpUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the partnerTenantId property value. The partnerTenantId property
     * @param value Value to set for the partnerTenantId property.
     */
    public void setPartnerTenantId(@jakarta.annotation.Nullable final String value) {
        this.partnerTenantId = value;
    }
    /**
     * Sets the supportEmails property value. The supportEmails property
     * @param value Value to set for the supportEmails property.
     */
    public void setSupportEmails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportEmails = value;
    }
    /**
     * Sets the supportTelephones property value. The supportTelephones property
     * @param value Value to set for the supportTelephones property.
     */
    public void setSupportTelephones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportTelephones = value;
    }
    /**
     * Sets the supportUrl property value. The supportUrl property
     * @param value Value to set for the supportUrl property.
     */
    public void setSupportUrl(@jakarta.annotation.Nullable final String value) {
        this.supportUrl = value;
    }
}

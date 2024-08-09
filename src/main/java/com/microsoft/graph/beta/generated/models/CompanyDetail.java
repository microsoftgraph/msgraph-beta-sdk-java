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
public class CompanyDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CompanyDetail} and sets the default values.
     */
    public CompanyDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompanyDetail}
     */
    @jakarta.annotation.Nonnull
    public static CompanyDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanyDetail();
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
     * Gets the address property value. Address of the company.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.backingStore.get("address");
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
     * Gets the companyCode property value. Legal entity number of the company or its subdivision. For information on how to set the value for the companyCode, see profileSourceAnnotation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyCode() {
        return this.backingStore.get("companyCode");
    }
    /**
     * Gets the department property value. Department Name within a company.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the displayName property value. Company name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("companyCode", (n) -> { this.setCompanyCode(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("pronunciation", (n) -> { this.setPronunciation(n.getStringValue()); });
        deserializerMap.put("secondaryDepartment", (n) -> { this.setSecondaryDepartment(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
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
     * Gets the officeLocation property value. Office Location of the person referred to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.backingStore.get("officeLocation");
    }
    /**
     * Gets the pronunciation property value. Pronunciation guide for the company name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPronunciation() {
        return this.backingStore.get("pronunciation");
    }
    /**
     * Gets the secondaryDepartment property value. The secondaryDepartment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryDepartment() {
        return this.backingStore.get("secondaryDepartment");
    }
    /**
     * Gets the webUrl property value. Link to the company home page.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("companyCode", this.getCompanyCode());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeStringValue("pronunciation", this.getPronunciation());
        writer.writeStringValue("secondaryDepartment", this.getSecondaryDepartment());
        writer.writeStringValue("webUrl", this.getWebUrl());
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
     * Sets the address property value. Address of the company.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("address", value);
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
     * Sets the companyCode property value. Legal entity number of the company or its subdivision. For information on how to set the value for the companyCode, see profileSourceAnnotation.
     * @param value Value to set for the companyCode property.
     */
    public void setCompanyCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyCode", value);
    }
    /**
     * Sets the department property value. Department Name within a company.
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the displayName property value. Company name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the officeLocation property value. Office Location of the person referred to.
     * @param value Value to set for the officeLocation property.
     */
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("officeLocation", value);
    }
    /**
     * Sets the pronunciation property value. Pronunciation guide for the company name.
     * @param value Value to set for the pronunciation property.
     */
    public void setPronunciation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("pronunciation", value);
    }
    /**
     * Sets the secondaryDepartment property value. The secondaryDepartment property
     * @param value Value to set for the secondaryDepartment property.
     */
    public void setSecondaryDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secondaryDepartment", value);
    }
    /**
     * Sets the webUrl property value. Link to the company home page.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}

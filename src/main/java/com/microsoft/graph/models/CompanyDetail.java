package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CompanyDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Address of the company.
     */
    private PhysicalAddress address;
    /**
     * Department Name within a company.
     */
    private String department;
    /**
     * Company name.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Office Location of the person referred to.
     */
    private String officeLocation;
    /**
     * Pronunciation guide for the company name.
     */
    private String pronunciation;
    /**
     * Link to the company home page.
     */
    private String webUrl;
    /**
     * Instantiates a new companyDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanyDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a companyDetail
     */
    @javax.annotation.Nonnull
    public static CompanyDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanyDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. Address of the company.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the department property value. Department Name within a company.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the displayName property value. Company name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("pronunciation", (n) -> { this.setPronunciation(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the officeLocation property value. Office Location of the person referred to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfficeLocation() {
        return this.officeLocation;
    }
    /**
     * Gets the pronunciation property value. Pronunciation guide for the company name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPronunciation() {
        return this.pronunciation;
    }
    /**
     * Gets the webUrl property value. Link to the company home page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeStringValue("pronunciation", this.getPronunciation());
        writer.writeStringValue("webUrl", this.getWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. Address of the company.
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the department property value. Department Name within a company.
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the displayName property value. Company name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the officeLocation property value. Office Location of the person referred to.
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this.officeLocation = value;
    }
    /**
     * Sets the pronunciation property value. Pronunciation guide for the company name.
     * @param value Value to set for the pronunciation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPronunciation(@javax.annotation.Nullable final String value) {
        this.pronunciation = value;
    }
    /**
     * Sets the webUrl property value. Link to the company home page.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}

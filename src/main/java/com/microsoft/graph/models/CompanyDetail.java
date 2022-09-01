package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CompanyDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Address of the company. */
    private PhysicalAddress _address;
    /** Department Name within a company. */
    private String _department;
    /** Company name. */
    private String _displayName;
    /** The OdataType property */
    private String _odataType;
    /** Office Location of the person referred to. */
    private String _officeLocation;
    /** Pronunciation guide for the company name. */
    private String _pronunciation;
    /** Link to the company home page. */
    private String _webUrl;
    /**
     * Instantiates a new companyDetail and sets the default values.
     * @return a void
     */
    public CompanyDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.companyDetail");
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
        return this._additionalData;
    }
    /**
     * Gets the address property value. Address of the company.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this._address;
    }
    /**
     * Gets the department property value. Department Name within a company.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this._department;
    }
    /**
     * Gets the displayName property value. Company name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CompanyDetail currentObject = this;
        return new HashMap<>(7) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("department", (n) -> { currentObject.setDepartment(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("officeLocation", (n) -> { currentObject.setOfficeLocation(n.getStringValue()); });
            this.put("pronunciation", (n) -> { currentObject.setPronunciation(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
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
     * Gets the officeLocation property value. Office Location of the person referred to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfficeLocation() {
        return this._officeLocation;
    }
    /**
     * Gets the pronunciation property value. Pronunciation guide for the company name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPronunciation() {
        return this._pronunciation;
    }
    /**
     * Gets the webUrl property value. Link to the company home page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the address property value. Address of the company.
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._address = value;
    }
    /**
     * Sets the department property value. Department Name within a company.
     * @param value Value to set for the department property.
     * @return a void
     */
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this._department = value;
    }
    /**
     * Sets the displayName property value. Company name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
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
     * Sets the officeLocation property value. Office Location of the person referred to.
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this._officeLocation = value;
    }
    /**
     * Sets the pronunciation property value. Pronunciation guide for the company name.
     * @param value Value to set for the pronunciation property.
     * @return a void
     */
    public void setPronunciation(@javax.annotation.Nullable final String value) {
        this._pronunciation = value;
    }
    /**
     * Sets the webUrl property value. Link to the company home page.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}

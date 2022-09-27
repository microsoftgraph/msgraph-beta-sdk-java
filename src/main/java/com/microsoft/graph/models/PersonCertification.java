package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonCertification extends ItemFacet implements Parsable {
    /** The referenceable identifier for the certification. */
    private String _certificationId;
    /** Description of the certification. */
    private String _description;
    /** Title of the certification. */
    private String _displayName;
    /** The date that the certification expires. */
    private LocalDate _endDate;
    /** The date that the certification was issued. */
    private LocalDate _issuedDate;
    /** Authority which granted the certification. */
    private String _issuingAuthority;
    /** Company which granted the certification. */
    private String _issuingCompany;
    /** The date that the certification became valid. */
    private LocalDate _startDate;
    /** URL referencing a thumbnail of the certification. */
    private String _thumbnailUrl;
    /** URL referencing the certification. */
    private String _webUrl;
    /**
     * Instantiates a new PersonCertification and sets the default values.
     * @return a void
     */
    public PersonCertification() {
        super();
        this.setOdataType("#microsoft.graph.personCertification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PersonCertification
     */
    @javax.annotation.Nonnull
    public static PersonCertification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonCertification();
    }
    /**
     * Gets the certificationId property value. The referenceable identifier for the certification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationId() {
        return this._certificationId;
    }
    /**
     * Gets the description property value. Description of the certification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Title of the certification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endDate property value. The date that the certification expires.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this._endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PersonCertification currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("certificationId", (n) -> { currentObject.setCertificationId(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endDate", (n) -> { currentObject.setEndDate(n.getLocalDateValue()); });
            this.put("issuedDate", (n) -> { currentObject.setIssuedDate(n.getLocalDateValue()); });
            this.put("issuingAuthority", (n) -> { currentObject.setIssuingAuthority(n.getStringValue()); });
            this.put("issuingCompany", (n) -> { currentObject.setIssuingCompany(n.getStringValue()); });
            this.put("startDate", (n) -> { currentObject.setStartDate(n.getLocalDateValue()); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the issuedDate property value. The date that the certification was issued.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this._issuedDate;
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the certification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuingAuthority() {
        return this._issuingAuthority;
    }
    /**
     * Gets the issuingCompany property value. Company which granted the certification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuingCompany() {
        return this._issuingCompany;
    }
    /**
     * Gets the startDate property value. The date that the certification became valid.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this._startDate;
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the certification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. URL referencing the certification.
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
        super.serialize(writer);
        writer.writeStringValue("certificationId", this.getCertificationId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeLocalDateValue("issuedDate", this.getIssuedDate());
        writer.writeStringValue("issuingAuthority", this.getIssuingAuthority());
        writer.writeStringValue("issuingCompany", this.getIssuingCompany());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the certificationId property value. The referenceable identifier for the certification.
     * @param value Value to set for the certificationId property.
     * @return a void
     */
    public void setCertificationId(@javax.annotation.Nullable final String value) {
        this._certificationId = value;
    }
    /**
     * Sets the description property value. Description of the certification.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Title of the certification.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endDate property value. The date that the certification expires.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this._endDate = value;
    }
    /**
     * Sets the issuedDate property value. The date that the certification was issued.
     * @param value Value to set for the issuedDate property.
     * @return a void
     */
    public void setIssuedDate(@javax.annotation.Nullable final LocalDate value) {
        this._issuedDate = value;
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the certification.
     * @param value Value to set for the issuingAuthority property.
     * @return a void
     */
    public void setIssuingAuthority(@javax.annotation.Nullable final String value) {
        this._issuingAuthority = value;
    }
    /**
     * Sets the issuingCompany property value. Company which granted the certification.
     * @param value Value to set for the issuingCompany property.
     * @return a void
     */
    public void setIssuingCompany(@javax.annotation.Nullable final String value) {
        this._issuingCompany = value;
    }
    /**
     * Sets the startDate property value. The date that the certification became valid.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._startDate = value;
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the certification.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. URL referencing the certification.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}

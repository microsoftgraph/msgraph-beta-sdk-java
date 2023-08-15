package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonCertification extends ItemFacet implements Parsable {
    /**
     * The referenceable identifier for the certification.
     */
    private String certificationId;
    /**
     * Description of the certification.
     */
    private String description;
    /**
     * Title of the certification.
     */
    private String displayName;
    /**
     * The date that the certification expires.
     */
    private LocalDate endDate;
    /**
     * The date that the certification was issued.
     */
    private LocalDate issuedDate;
    /**
     * Authority which granted the certification.
     */
    private String issuingAuthority;
    /**
     * Company which granted the certification.
     */
    private String issuingCompany;
    /**
     * The date that the certification became valid.
     */
    private LocalDate startDate;
    /**
     * URL referencing a thumbnail of the certification.
     */
    private String thumbnailUrl;
    /**
     * URL referencing the certification.
     */
    private String webUrl;
    /**
     * Instantiates a new personCertification and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PersonCertification() {
        super();
        this.setOdataType("#microsoft.graph.personCertification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personCertification
     */
    @jakarta.annotation.Nonnull
    public static PersonCertification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonCertification();
    }
    /**
     * Gets the certificationId property value. The referenceable identifier for the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificationId() {
        return this.certificationId;
    }
    /**
     * Gets the description property value. Description of the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Title of the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDate property value. The date that the certification expires.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificationId", (n) -> { this.setCertificationId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("issuedDate", (n) -> { this.setIssuedDate(n.getLocalDateValue()); });
        deserializerMap.put("issuingAuthority", (n) -> { this.setIssuingAuthority(n.getStringValue()); });
        deserializerMap.put("issuingCompany", (n) -> { this.setIssuingCompany(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuedDate property value. The date that the certification was issued.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this.issuedDate;
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }
    /**
     * Gets the issuingCompany property value. Company which granted the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuingCompany() {
        return this.issuingCompany;
    }
    /**
     * Gets the startDate property value. The date that the certification became valid.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. URL referencing the certification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setCertificationId(@jakarta.annotation.Nullable final String value) {
        this.certificationId = value;
    }
    /**
     * Sets the description property value. Description of the certification.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Title of the certification.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDate property value. The date that the certification expires.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the issuedDate property value. The date that the certification was issued.
     * @param value Value to set for the issuedDate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIssuedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.issuedDate = value;
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the certification.
     * @param value Value to set for the issuingAuthority property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIssuingAuthority(@jakarta.annotation.Nullable final String value) {
        this.issuingAuthority = value;
    }
    /**
     * Sets the issuingCompany property value. Company which granted the certification.
     * @param value Value to set for the issuingCompany property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIssuingCompany(@jakarta.annotation.Nullable final String value) {
        this.issuingCompany = value;
    }
    /**
     * Sets the startDate property value. The date that the certification became valid.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the certification.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. URL referencing the certification.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}

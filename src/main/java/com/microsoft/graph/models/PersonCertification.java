package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PersonCertification extends ItemFacet implements Parsable {
    /**
     * Instantiates a new PersonCertification and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static PersonCertification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonCertification();
    }
    /**
     * Gets the certificationId property value. The referenceable identifier for the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificationId() {
        return this.BackingStore.get("certificationId");
    }
    /**
     * Gets the description property value. Description of the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Title of the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the endDate property value. The date that the certification expires.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.BackingStore.get("endDate");
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
        return this.BackingStore.get("issuedDate");
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuingAuthority() {
        return this.BackingStore.get("issuingAuthority");
    }
    /**
     * Gets the issuingCompany property value. Company which granted the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuingCompany() {
        return this.BackingStore.get("issuingCompany");
    }
    /**
     * Gets the startDate property value. The date that the certification became valid.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.BackingStore.get("startDate");
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.BackingStore.get("thumbnailUrl");
    }
    /**
     * Gets the webUrl property value. URL referencing the certification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.BackingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setCertificationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("certificationId", value);
    }
    /**
     * Sets the description property value. Description of the certification.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Title of the certification.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the endDate property value. The date that the certification expires.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("endDate", value);
    }
    /**
     * Sets the issuedDate property value. The date that the certification was issued.
     * @param value Value to set for the issuedDate property.
     */
    public void setIssuedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("issuedDate", value);
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the certification.
     * @param value Value to set for the issuingAuthority property.
     */
    public void setIssuingAuthority(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("issuingAuthority", value);
    }
    /**
     * Sets the issuingCompany property value. Company which granted the certification.
     * @param value Value to set for the issuingCompany property.
     */
    public void setIssuingCompany(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("issuingCompany", value);
    }
    /**
     * Sets the startDate property value. The date that the certification became valid.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("startDate", value);
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the certification.
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("thumbnailUrl", value);
    }
    /**
     * Sets the webUrl property value. URL referencing the certification.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("webUrl", value);
    }
}

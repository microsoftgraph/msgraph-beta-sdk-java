package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonAward extends ItemFacet implements Parsable {
    /**
     * Descpription of the award or honor.
     */
    private String description;
    /**
     * Name of the award or honor.
     */
    private String displayName;
    /**
     * The date that the award or honor was granted.
     */
    private LocalDate issuedDate;
    /**
     * Authority which granted the award or honor.
     */
    private String issuingAuthority;
    /**
     * URL referencing a thumbnail of the award or honor.
     */
    private String thumbnailUrl;
    /**
     * URL referencing the award or honor.
     */
    private String webUrl;
    /**
     * Instantiates a new personAward and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersonAward() {
        super();
        this.setOdataType("#microsoft.graph.personAward");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personAward
     */
    @javax.annotation.Nonnull
    public static PersonAward createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAward();
    }
    /**
     * Gets the description property value. Descpription of the award or honor.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Name of the award or honor.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("issuedDate", (n) -> { this.setIssuedDate(n.getLocalDateValue()); });
        deserializerMap.put("issuingAuthority", (n) -> { this.setIssuingAuthority(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuedDate property value. The date that the award or honor was granted.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this.issuedDate;
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the award or honor.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the award or honor.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. URL referencing the award or honor.
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
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("issuedDate", this.getIssuedDate());
        writer.writeStringValue("issuingAuthority", this.getIssuingAuthority());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Descpription of the award or honor.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Name of the award or honor.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the issuedDate property value. The date that the award or honor was granted.
     * @param value Value to set for the issuedDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssuedDate(@javax.annotation.Nullable final LocalDate value) {
        this.issuedDate = value;
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the award or honor.
     * @param value Value to set for the issuingAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssuingAuthority(@javax.annotation.Nullable final String value) {
        this.issuingAuthority = value;
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the award or honor.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. URL referencing the award or honor.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}

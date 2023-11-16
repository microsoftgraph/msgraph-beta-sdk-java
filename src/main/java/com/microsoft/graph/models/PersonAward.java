package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PersonAward extends ItemFacet implements Parsable {
    /**
     * Instantiates a new PersonAward and sets the default values.
     */
    public PersonAward() {
        super();
        this.setOdataType("#microsoft.graph.personAward");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PersonAward
     */
    @jakarta.annotation.Nonnull
    public static PersonAward createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAward();
    }
    /**
     * Gets the description property value. Descpription of the award or honor.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the award or honor.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this.BackingStore.get("issuedDate");
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the award or honor.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuingAuthority() {
        return this.BackingStore.get("issuingAuthority");
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the award or honor.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.BackingStore.get("thumbnailUrl");
    }
    /**
     * Gets the webUrl property value. URL referencing the award or honor.
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
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the award or honor.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the issuedDate property value. The date that the award or honor was granted.
     * @param value Value to set for the issuedDate property.
     */
    public void setIssuedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("issuedDate", value);
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the award or honor.
     * @param value Value to set for the issuingAuthority property.
     */
    public void setIssuingAuthority(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("issuingAuthority", value);
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the award or honor.
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("thumbnailUrl", value);
    }
    /**
     * Sets the webUrl property value. URL referencing the award or honor.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("webUrl", value);
    }
}

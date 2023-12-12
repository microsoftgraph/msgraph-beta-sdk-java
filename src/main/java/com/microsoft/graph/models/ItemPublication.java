package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemPublication extends ItemFacet implements Parsable {
    /**
     * Instantiates a new ItemPublication and sets the default values.
     */
    public ItemPublication() {
        super();
        this.setOdataType("#microsoft.graph.itemPublication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemPublication
     */
    @jakarta.annotation.Nonnull
    public static ItemPublication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPublication();
    }
    /**
     * Gets the description property value. Description of the publication.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Title of the publication.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
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
        deserializerMap.put("publishedDate", (n) -> { this.setPublishedDate(n.getLocalDateValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the publishedDate property value. The date that the publication was published.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getPublishedDate() {
        return this.backingStore.get("publishedDate");
    }
    /**
     * Gets the publisher property value. Publication or publisher for the publication.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the publication.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.backingStore.get("thumbnailUrl");
    }
    /**
     * Gets the webUrl property value. URL referencing the publication.
     * @return a String
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
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("publishedDate", this.getPublishedDate());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Description of the publication.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Title of the publication.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the publishedDate property value. The date that the publication was published.
     * @param value Value to set for the publishedDate property.
     */
    public void setPublishedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("publishedDate", value);
    }
    /**
     * Sets the publisher property value. Publication or publisher for the publication.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the publication.
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailUrl", value);
    }
    /**
     * Sets the webUrl property value. URL referencing the publication.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}

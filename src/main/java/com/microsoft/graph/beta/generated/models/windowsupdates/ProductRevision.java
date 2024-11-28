package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductRevision extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ProductRevision} and sets the default values.
     */
    public ProductRevision() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductRevision}
     */
    @jakarta.annotation.Nonnull
    public static ProductRevision createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductRevision();
    }
    /**
     * Gets the catalogEntry property value. The catalogEntry property
     * @return a {@link CatalogEntry}
     */
    @jakarta.annotation.Nullable
    public CatalogEntry getCatalogEntry() {
        return this.backingStore.get("catalogEntry");
    }
    /**
     * Gets the displayName property value. The display name of the content. Read-only.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogEntry", (n) -> { this.setCatalogEntry(n.getObjectValue(CatalogEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isHotpatchUpdate", (n) -> { this.setIsHotpatchUpdate(n.getBooleanValue()); });
        deserializerMap.put("knowledgeBaseArticle", (n) -> { this.setKnowledgeBaseArticle(n.getObjectValue(KnowledgeBaseArticle::createFromDiscriminatorValue)); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getObjectValue(BuildVersionDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHotpatchUpdate property value. True indicates that the content is hotpatchable; otherwise, false. For more information, see Deploy a hotpatch quality update using Windows Autopatch. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHotpatchUpdate() {
        return this.backingStore.get("isHotpatchUpdate");
    }
    /**
     * Gets the knowledgeBaseArticle property value. The knowledge base article associated with the product revision.
     * @return a {@link KnowledgeBaseArticle}
     */
    @jakarta.annotation.Nullable
    public KnowledgeBaseArticle getKnowledgeBaseArticle() {
        return this.backingStore.get("knowledgeBaseArticle");
    }
    /**
     * Gets the osBuild property value. The osBuild property
     * @return a {@link BuildVersionDetails}
     */
    @jakarta.annotation.Nullable
    public BuildVersionDetails getOsBuild() {
        return this.backingStore.get("osBuild");
    }
    /**
     * Gets the product property value. The product of the revision. Possible values are: Windows 10, Windows 11. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProduct() {
        return this.backingStore.get("product");
    }
    /**
     * Gets the releaseDateTime property value. The release date for the content. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.backingStore.get("releaseDateTime");
    }
    /**
     * Gets the version property value. The version of the feature update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("catalogEntry", this.getCatalogEntry());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isHotpatchUpdate", this.getIsHotpatchUpdate());
        writer.writeObjectValue("knowledgeBaseArticle", this.getKnowledgeBaseArticle());
        writer.writeObjectValue("osBuild", this.getOsBuild());
        writer.writeStringValue("product", this.getProduct());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the catalogEntry property value. The catalogEntry property
     * @param value Value to set for the catalogEntry property.
     */
    public void setCatalogEntry(@jakarta.annotation.Nullable final CatalogEntry value) {
        this.backingStore.set("catalogEntry", value);
    }
    /**
     * Sets the displayName property value. The display name of the content. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isHotpatchUpdate property value. True indicates that the content is hotpatchable; otherwise, false. For more information, see Deploy a hotpatch quality update using Windows Autopatch. Read-only.
     * @param value Value to set for the isHotpatchUpdate property.
     */
    public void setIsHotpatchUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHotpatchUpdate", value);
    }
    /**
     * Sets the knowledgeBaseArticle property value. The knowledge base article associated with the product revision.
     * @param value Value to set for the knowledgeBaseArticle property.
     */
    public void setKnowledgeBaseArticle(@jakarta.annotation.Nullable final KnowledgeBaseArticle value) {
        this.backingStore.set("knowledgeBaseArticle", value);
    }
    /**
     * Sets the osBuild property value. The osBuild property
     * @param value Value to set for the osBuild property.
     */
    public void setOsBuild(@jakarta.annotation.Nullable final BuildVersionDetails value) {
        this.backingStore.set("osBuild", value);
    }
    /**
     * Sets the product property value. The product of the revision. Possible values are: Windows 10, Windows 11. Read-only.
     * @param value Value to set for the product property.
     */
    public void setProduct(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("product", value);
    }
    /**
     * Sets the releaseDateTime property value. The release date for the content. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("releaseDateTime", value);
    }
    /**
     * Sets the version property value. The version of the feature update. Read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}

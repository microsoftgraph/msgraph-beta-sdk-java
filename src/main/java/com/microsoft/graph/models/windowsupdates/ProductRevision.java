package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
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
     * The displayName property
     */
    private String displayName;
    /**
     * The knowledgeBaseArticle property
     */
    private KnowledgeBaseArticle knowledgeBaseArticle;
    /**
     * The osBuild property
     */
    private BuildVersionDetails osBuild;
    /**
     * The product property
     */
    private String product;
    /**
     * The releaseDateTime property
     */
    private OffsetDateTime releaseDateTime;
    /**
     * The version property
     */
    private String version;
    /**
     * Instantiates a new productRevision and sets the default values.
     */
    public ProductRevision() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a productRevision
     */
    @jakarta.annotation.Nonnull
    public static ProductRevision createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductRevision();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("knowledgeBaseArticle", (n) -> { this.setKnowledgeBaseArticle(n.getObjectValue(KnowledgeBaseArticle::createFromDiscriminatorValue)); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getObjectValue(BuildVersionDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the knowledgeBaseArticle property value. The knowledgeBaseArticle property
     * @return a knowledgeBaseArticle
     */
    @jakarta.annotation.Nullable
    public KnowledgeBaseArticle getKnowledgeBaseArticle() {
        return this.knowledgeBaseArticle;
    }
    /**
     * Gets the osBuild property value. The osBuild property
     * @return a buildVersionDetails
     */
    @jakarta.annotation.Nullable
    public BuildVersionDetails getOsBuild() {
        return this.osBuild;
    }
    /**
     * Gets the product property value. The product property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProduct() {
        return this.product;
    }
    /**
     * Gets the releaseDateTime property value. The releaseDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.releaseDateTime;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("knowledgeBaseArticle", this.getKnowledgeBaseArticle());
        writer.writeObjectValue("osBuild", this.getOsBuild());
        writer.writeStringValue("product", this.getProduct());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the knowledgeBaseArticle property value. The knowledgeBaseArticle property
     * @param value Value to set for the knowledgeBaseArticle property.
     */
    public void setKnowledgeBaseArticle(@jakarta.annotation.Nullable final KnowledgeBaseArticle value) {
        this.knowledgeBaseArticle = value;
    }
    /**
     * Sets the osBuild property value. The osBuild property
     * @param value Value to set for the osBuild property.
     */
    public void setOsBuild(@jakarta.annotation.Nullable final BuildVersionDetails value) {
        this.osBuild = value;
    }
    /**
     * Sets the product property value. The product property
     * @param value Value to set for the product property.
     */
    public void setProduct(@jakarta.annotation.Nullable final String value) {
        this.product = value;
    }
    /**
     * Sets the releaseDateTime property value. The releaseDateTime property
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.releaseDateTime = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}

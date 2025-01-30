package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows update catalog item entity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateCatalogItem extends WindowsUpdateCatalogItem implements Parsable {
    /**
     * Instantiates a new {@link WindowsQualityUpdateCatalogItem} and sets the default values.
     */
    public WindowsQualityUpdateCatalogItem() {
        super();
        this.setOdataType("#microsoft.graph.windowsQualityUpdateCatalogItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateCatalogItem}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateCatalogItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateCatalogItem();
    }
    /**
     * Gets the classification property value. Windows quality update category
     * @return a {@link WindowsQualityUpdateCategory}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateCategory getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(WindowsQualityUpdateCategory::forValue)); });
        deserializerMap.put("isExpeditable", (n) -> { this.setIsExpeditable(n.getBooleanValue()); });
        deserializerMap.put("kbArticleId", (n) -> { this.setKbArticleId(n.getStringValue()); });
        deserializerMap.put("productRevisions", (n) -> { this.setProductRevisions(n.getCollectionOfObjectValues(WindowsQualityUpdateCatalogProductRevision::createFromDiscriminatorValue)); });
        deserializerMap.put("qualityUpdateCadence", (n) -> { this.setQualityUpdateCadence(n.getEnumValue(WindowsQualityUpdateCadence::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isExpeditable property value. Flag indicating if update qualifies for expedite
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExpeditable() {
        return this.backingStore.get("isExpeditable");
    }
    /**
     * Gets the kbArticleId property value. Knowledge base article id
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKbArticleId() {
        return this.backingStore.get("kbArticleId");
    }
    /**
     * Gets the productRevisions property value. The operating system product revisions that are released as part of this quality update. Read-only.
     * @return a {@link java.util.List<WindowsQualityUpdateCatalogProductRevision>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsQualityUpdateCatalogProductRevision> getProductRevisions() {
        return this.backingStore.get("productRevisions");
    }
    /**
     * Gets the qualityUpdateCadence property value. The publishing cadence of the quality update. Possible values are: monthly, outOfBand. This property cannot be modified and is automatically populated when the catalog is created.
     * @return a {@link WindowsQualityUpdateCadence}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateCadence getQualityUpdateCadence() {
        return this.backingStore.get("qualityUpdateCadence");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeBooleanValue("isExpeditable", this.getIsExpeditable());
        writer.writeStringValue("kbArticleId", this.getKbArticleId());
        writer.writeCollectionOfObjectValues("productRevisions", this.getProductRevisions());
        writer.writeEnumValue("qualityUpdateCadence", this.getQualityUpdateCadence());
    }
    /**
     * Sets the classification property value. Windows quality update category
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final WindowsQualityUpdateCategory value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the isExpeditable property value. Flag indicating if update qualifies for expedite
     * @param value Value to set for the isExpeditable property.
     */
    public void setIsExpeditable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExpeditable", value);
    }
    /**
     * Sets the kbArticleId property value. Knowledge base article id
     * @param value Value to set for the kbArticleId property.
     */
    public void setKbArticleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kbArticleId", value);
    }
    /**
     * Sets the productRevisions property value. The operating system product revisions that are released as part of this quality update. Read-only.
     * @param value Value to set for the productRevisions property.
     */
    public void setProductRevisions(@jakarta.annotation.Nullable final java.util.List<WindowsQualityUpdateCatalogProductRevision> value) {
        this.backingStore.set("productRevisions", value);
    }
    /**
     * Sets the qualityUpdateCadence property value. The publishing cadence of the quality update. Possible values are: monthly, outOfBand. This property cannot be modified and is automatically populated when the catalog is created.
     * @param value Value to set for the qualityUpdateCadence property.
     */
    public void setQualityUpdateCadence(@jakarta.annotation.Nullable final WindowsQualityUpdateCadence value) {
        this.backingStore.set("qualityUpdateCadence", value);
    }
}

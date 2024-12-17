package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChangeItemBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ChangeItemBase} and sets the default values.
     */
    public ChangeItemBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChangeItemBase}
     */
    @jakarta.annotation.Nonnull
    public static ChangeItemBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.announcement": return new Announcement();
                case "#microsoft.graph.roadmap": return new Roadmap();
            }
        }
        return new ChangeItemBase();
    }
    /**
     * Gets the changeItemService property value. Specifies the Microsoft Entra service name to which this item belongs. Supports $filter (eq, ne, in) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangeItemService() {
        return this.backingStore.get("changeItemService");
    }
    /**
     * Gets the description property value. Description of the new feature or change announcement. Supports $filter (eq, ne, in, startswith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the documentationUrls property value. Link to the feature or change documentation. Supports $filter (any with eq).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDocumentationUrls() {
        return this.backingStore.get("documentationUrls");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("changeItemService", (n) -> { this.setChangeItemService(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("documentationUrls", (n) -> { this.setDocumentationUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shortDescription", (n) -> { this.setShortDescription(n.getStringValue()); });
        deserializerMap.put("systemTags", (n) -> { this.setSystemTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shortDescription property value. A short description of the feature or change. Supports $filter (eq, ne, in, startswith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShortDescription() {
        return this.backingStore.get("shortDescription");
    }
    /**
     * Gets the systemTags property value. Microsoft Entra-specific tags. Example values: Top announcement - entraroadmaphighlightproductnews, New release highlight - entraroadmaphighlightnewfeature. Supports $filter (any with eq).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSystemTags() {
        return this.backingStore.get("systemTags");
    }
    /**
     * Gets the tags property value. Identity and Access Management (IAM) related tags. Example values: External Identities, Reliability and Resilience. Supports $filter (any with eq).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the title property value. Title of the feature or change. Supports $filter (eq, ne, in, startswith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("changeItemService", this.getChangeItemService());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("documentationUrls", this.getDocumentationUrls());
        writer.writeStringValue("shortDescription", this.getShortDescription());
        writer.writeCollectionOfPrimitiveValues("systemTags", this.getSystemTags());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the changeItemService property value. Specifies the Microsoft Entra service name to which this item belongs. Supports $filter (eq, ne, in) and $orderby.
     * @param value Value to set for the changeItemService property.
     */
    public void setChangeItemService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("changeItemService", value);
    }
    /**
     * Sets the description property value. Description of the new feature or change announcement. Supports $filter (eq, ne, in, startswith) and $orderby.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the documentationUrls property value. Link to the feature or change documentation. Supports $filter (any with eq).
     * @param value Value to set for the documentationUrls property.
     */
    public void setDocumentationUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("documentationUrls", value);
    }
    /**
     * Sets the shortDescription property value. A short description of the feature or change. Supports $filter (eq, ne, in, startswith) and $orderby.
     * @param value Value to set for the shortDescription property.
     */
    public void setShortDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("shortDescription", value);
    }
    /**
     * Sets the systemTags property value. Microsoft Entra-specific tags. Example values: Top announcement - entraroadmaphighlightproductnews, New release highlight - entraroadmaphighlightnewfeature. Supports $filter (any with eq).
     * @param value Value to set for the systemTags property.
     */
    public void setSystemTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("systemTags", value);
    }
    /**
     * Sets the tags property value. Identity and Access Management (IAM) related tags. Example values: External Identities, Reliability and Resilience. Supports $filter (any with eq).
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the title property value. Title of the feature or change. Supports $filter (eq, ne, in, startswith) and $orderby.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}

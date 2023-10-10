package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EstimateStatisticsOperation extends CaseOperation implements Parsable {
    /**
     * The estimated count of items for the sourceCollection that matched the content query.
     */
    private Long indexedItemCount;
    /**
     * The estimated size of items for the sourceCollection that matched the content query.
     */
    private Long indexedItemsSize;
    /**
     * The number of mailboxes that had search hits.
     */
    private Integer mailboxCount;
    /**
     * The number of mailboxes that had search hits.
     */
    private Integer siteCount;
    /**
     * eDiscovery collection, commonly known as a search.
     */
    private SourceCollection sourceCollection;
    /**
     * The estimated count of unindexed items for the collection.
     */
    private Long unindexedItemCount;
    /**
     * The estimated size of unindexed items for the collection.
     */
    private Long unindexedItemsSize;
    /**
     * Instantiates a new EstimateStatisticsOperation and sets the default values.
     */
    public EstimateStatisticsOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EstimateStatisticsOperation
     */
    @jakarta.annotation.Nonnull
    public static EstimateStatisticsOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EstimateStatisticsOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("indexedItemCount", (n) -> { this.setIndexedItemCount(n.getLongValue()); });
        deserializerMap.put("indexedItemsSize", (n) -> { this.setIndexedItemsSize(n.getLongValue()); });
        deserializerMap.put("mailboxCount", (n) -> { this.setMailboxCount(n.getIntegerValue()); });
        deserializerMap.put("siteCount", (n) -> { this.setSiteCount(n.getIntegerValue()); });
        deserializerMap.put("sourceCollection", (n) -> { this.setSourceCollection(n.getObjectValue(SourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("unindexedItemCount", (n) -> { this.setUnindexedItemCount(n.getLongValue()); });
        deserializerMap.put("unindexedItemsSize", (n) -> { this.setUnindexedItemsSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the indexedItemCount property value. The estimated count of items for the sourceCollection that matched the content query.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getIndexedItemCount() {
        return this.indexedItemCount;
    }
    /**
     * Gets the indexedItemsSize property value. The estimated size of items for the sourceCollection that matched the content query.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getIndexedItemsSize() {
        return this.indexedItemsSize;
    }
    /**
     * Gets the mailboxCount property value. The number of mailboxes that had search hits.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMailboxCount() {
        return this.mailboxCount;
    }
    /**
     * Gets the siteCount property value. The number of mailboxes that had search hits.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSiteCount() {
        return this.siteCount;
    }
    /**
     * Gets the sourceCollection property value. eDiscovery collection, commonly known as a search.
     * @return a SourceCollection
     */
    @jakarta.annotation.Nullable
    public SourceCollection getSourceCollection() {
        return this.sourceCollection;
    }
    /**
     * Gets the unindexedItemCount property value. The estimated count of unindexed items for the collection.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUnindexedItemCount() {
        return this.unindexedItemCount;
    }
    /**
     * Gets the unindexedItemsSize property value. The estimated size of unindexed items for the collection.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUnindexedItemsSize() {
        return this.unindexedItemsSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("indexedItemCount", this.getIndexedItemCount());
        writer.writeLongValue("indexedItemsSize", this.getIndexedItemsSize());
        writer.writeIntegerValue("mailboxCount", this.getMailboxCount());
        writer.writeIntegerValue("siteCount", this.getSiteCount());
        writer.writeObjectValue("sourceCollection", this.getSourceCollection());
        writer.writeLongValue("unindexedItemCount", this.getUnindexedItemCount());
        writer.writeLongValue("unindexedItemsSize", this.getUnindexedItemsSize());
    }
    /**
     * Sets the indexedItemCount property value. The estimated count of items for the sourceCollection that matched the content query.
     * @param value Value to set for the indexedItemCount property.
     */
    public void setIndexedItemCount(@jakarta.annotation.Nullable final Long value) {
        this.indexedItemCount = value;
    }
    /**
     * Sets the indexedItemsSize property value. The estimated size of items for the sourceCollection that matched the content query.
     * @param value Value to set for the indexedItemsSize property.
     */
    public void setIndexedItemsSize(@jakarta.annotation.Nullable final Long value) {
        this.indexedItemsSize = value;
    }
    /**
     * Sets the mailboxCount property value. The number of mailboxes that had search hits.
     * @param value Value to set for the mailboxCount property.
     */
    public void setMailboxCount(@jakarta.annotation.Nullable final Integer value) {
        this.mailboxCount = value;
    }
    /**
     * Sets the siteCount property value. The number of mailboxes that had search hits.
     * @param value Value to set for the siteCount property.
     */
    public void setSiteCount(@jakarta.annotation.Nullable final Integer value) {
        this.siteCount = value;
    }
    /**
     * Sets the sourceCollection property value. eDiscovery collection, commonly known as a search.
     * @param value Value to set for the sourceCollection property.
     */
    public void setSourceCollection(@jakarta.annotation.Nullable final SourceCollection value) {
        this.sourceCollection = value;
    }
    /**
     * Sets the unindexedItemCount property value. The estimated count of unindexed items for the collection.
     * @param value Value to set for the unindexedItemCount property.
     */
    public void setUnindexedItemCount(@jakarta.annotation.Nullable final Long value) {
        this.unindexedItemCount = value;
    }
    /**
     * Sets the unindexedItemsSize property value. The estimated size of unindexed items for the collection.
     * @param value Value to set for the unindexedItemsSize property.
     */
    public void setUnindexedItemsSize(@jakarta.annotation.Nullable final Long value) {
        this.unindexedItemsSize = value;
    }
}

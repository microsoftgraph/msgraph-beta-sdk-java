package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EstimateStatisticsOperation extends CaseOperation implements Parsable {
    /** The estimated count of items for the sourceCollection that matched the content query. */
    private Long _indexedItemCount;
    /** The estimated size of items for the sourceCollection that matched the content query. */
    private Long _indexedItemsSize;
    /** The number of mailboxes that had search hits. */
    private Integer _mailboxCount;
    /** The number of mailboxes that had search hits. */
    private Integer _siteCount;
    /** eDiscovery collection, commonly known as a search. */
    private SourceCollection _sourceCollection;
    /** The estimated count of unindexed items for the collection. */
    private Long _unindexedItemCount;
    /** The estimated size of unindexed items for the collection. */
    private Long _unindexedItemsSize;
    /**
     * Instantiates a new estimateStatisticsOperation and sets the default values.
     * @return a void
     */
    public EstimateStatisticsOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a estimateStatisticsOperation
     */
    @javax.annotation.Nonnull
    public static EstimateStatisticsOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EstimateStatisticsOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EstimateStatisticsOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("indexedItemCount", (n) -> { currentObject.setIndexedItemCount(n.getLongValue()); });
            this.put("indexedItemsSize", (n) -> { currentObject.setIndexedItemsSize(n.getLongValue()); });
            this.put("mailboxCount", (n) -> { currentObject.setMailboxCount(n.getIntegerValue()); });
            this.put("siteCount", (n) -> { currentObject.setSiteCount(n.getIntegerValue()); });
            this.put("sourceCollection", (n) -> { currentObject.setSourceCollection(n.getObjectValue(SourceCollection::createFromDiscriminatorValue)); });
            this.put("unindexedItemCount", (n) -> { currentObject.setUnindexedItemCount(n.getLongValue()); });
            this.put("unindexedItemsSize", (n) -> { currentObject.setUnindexedItemsSize(n.getLongValue()); });
        }};
    }
    /**
     * Gets the indexedItemCount property value. The estimated count of items for the sourceCollection that matched the content query.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIndexedItemCount() {
        return this._indexedItemCount;
    }
    /**
     * Gets the indexedItemsSize property value. The estimated size of items for the sourceCollection that matched the content query.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIndexedItemsSize() {
        return this._indexedItemsSize;
    }
    /**
     * Gets the mailboxCount property value. The number of mailboxes that had search hits.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMailboxCount() {
        return this._mailboxCount;
    }
    /**
     * Gets the siteCount property value. The number of mailboxes that had search hits.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSiteCount() {
        return this._siteCount;
    }
    /**
     * Gets the sourceCollection property value. eDiscovery collection, commonly known as a search.
     * @return a sourceCollection
     */
    @javax.annotation.Nullable
    public SourceCollection getSourceCollection() {
        return this._sourceCollection;
    }
    /**
     * Gets the unindexedItemCount property value. The estimated count of unindexed items for the collection.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnindexedItemCount() {
        return this._unindexedItemCount;
    }
    /**
     * Gets the unindexedItemsSize property value. The estimated size of unindexed items for the collection.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnindexedItemsSize() {
        return this._unindexedItemsSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setIndexedItemCount(@javax.annotation.Nullable final Long value) {
        this._indexedItemCount = value;
    }
    /**
     * Sets the indexedItemsSize property value. The estimated size of items for the sourceCollection that matched the content query.
     * @param value Value to set for the indexedItemsSize property.
     * @return a void
     */
    public void setIndexedItemsSize(@javax.annotation.Nullable final Long value) {
        this._indexedItemsSize = value;
    }
    /**
     * Sets the mailboxCount property value. The number of mailboxes that had search hits.
     * @param value Value to set for the mailboxCount property.
     * @return a void
     */
    public void setMailboxCount(@javax.annotation.Nullable final Integer value) {
        this._mailboxCount = value;
    }
    /**
     * Sets the siteCount property value. The number of mailboxes that had search hits.
     * @param value Value to set for the siteCount property.
     * @return a void
     */
    public void setSiteCount(@javax.annotation.Nullable final Integer value) {
        this._siteCount = value;
    }
    /**
     * Sets the sourceCollection property value. eDiscovery collection, commonly known as a search.
     * @param value Value to set for the sourceCollection property.
     * @return a void
     */
    public void setSourceCollection(@javax.annotation.Nullable final SourceCollection value) {
        this._sourceCollection = value;
    }
    /**
     * Sets the unindexedItemCount property value. The estimated count of unindexed items for the collection.
     * @param value Value to set for the unindexedItemCount property.
     * @return a void
     */
    public void setUnindexedItemCount(@javax.annotation.Nullable final Long value) {
        this._unindexedItemCount = value;
    }
    /**
     * Sets the unindexedItemsSize property value. The estimated size of unindexed items for the collection.
     * @param value Value to set for the unindexedItemsSize property.
     * @return a void
     */
    public void setUnindexedItemsSize(@javax.annotation.Nullable final Long value) {
        this._unindexedItemsSize = value;
    }
}

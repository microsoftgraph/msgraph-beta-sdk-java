package com.microsoft.graph.beta.models.ediscovery;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.graph.beta.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceCollection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SourceCollection} and sets the default values.
     */
    public SourceCollection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SourceCollection}
     */
    @jakarta.annotation.Nonnull
    public static SourceCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceCollection();
    }
    /**
     * Gets the additionalSources property value. Adds an additional source to the sourceCollection.
     * @return a {@link java.util.List<DataSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DataSource> getAdditionalSources() {
        return this.backingStore.get("additionalSources");
    }
    /**
     * Gets the addToReviewSetOperation property value. Adds the results of the sourceCollection to the specified reviewSet.
     * @return a {@link AddToReviewSetOperation}
     */
    @jakarta.annotation.Nullable
    public AddToReviewSetOperation getAddToReviewSetOperation() {
        return this.backingStore.get("addToReviewSetOperation");
    }
    /**
     * Gets the contentQuery property value. The query string in KQL (Keyword Query Language) query. For details, see Keyword queries and search conditions for Content Search and eDiscovery. You can refine searches by using fields paired with values; for example, subject:'Quarterly Financials' AND Date>=06/01/2016 AND Date<=07/01/2016.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentQuery() {
        return this.backingStore.get("contentQuery");
    }
    /**
     * Gets the createdBy property value. The user who created the sourceCollection.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time the sourceCollection was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the custodianSources property value. Custodian sources that are included in the sourceCollection.
     * @return a {@link java.util.List<DataSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DataSource> getCustodianSources() {
        return this.backingStore.get("custodianSources");
    }
    /**
     * Gets the dataSourceScopes property value. When specified, the collection spans across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @return a {@link EnumSet<DataSourceScopes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DataSourceScopes> getDataSourceScopes() {
        return this.backingStore.get("dataSourceScopes");
    }
    /**
     * Gets the description property value. The description of the sourceCollection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the sourceCollection.
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
        deserializerMap.put("additionalSources", (n) -> { this.setAdditionalSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("addToReviewSetOperation", (n) -> { this.setAddToReviewSetOperation(n.getObjectValue(AddToReviewSetOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("contentQuery", (n) -> { this.setContentQuery(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("custodianSources", (n) -> { this.setCustodianSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSourceScopes", (n) -> { this.setDataSourceScopes(n.getEnumSetValue(DataSourceScopes::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastEstimateStatisticsOperation", (n) -> { this.setLastEstimateStatisticsOperation(n.getObjectValue(EstimateStatisticsOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("noncustodialSources", (n) -> { this.setNoncustodialSources(n.getCollectionOfObjectValues(NoncustodialDataSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the sourceCollection.
     * @return a {@link EstimateStatisticsOperation}
     */
    @jakarta.annotation.Nullable
    public EstimateStatisticsOperation getLastEstimateStatisticsOperation() {
        return this.backingStore.get("lastEstimateStatisticsOperation");
    }
    /**
     * Gets the lastModifiedBy property value. The last user who modified the sourceCollection.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The last date and time the sourceCollection was modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the noncustodialSources property value. noncustodialDataSource sources that are included in the sourceCollection
     * @return a {@link java.util.List<NoncustodialDataSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NoncustodialDataSource> getNoncustodialSources() {
        return this.backingStore.get("noncustodialSources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalSources", this.getAdditionalSources());
        writer.writeObjectValue("addToReviewSetOperation", this.getAddToReviewSetOperation());
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("custodianSources", this.getCustodianSources());
        writer.writeEnumSetValue("dataSourceScopes", this.getDataSourceScopes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastEstimateStatisticsOperation", this.getLastEstimateStatisticsOperation());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("noncustodialSources", this.getNoncustodialSources());
    }
    /**
     * Sets the additionalSources property value. Adds an additional source to the sourceCollection.
     * @param value Value to set for the additionalSources property.
     */
    public void setAdditionalSources(@jakarta.annotation.Nullable final java.util.List<DataSource> value) {
        this.backingStore.set("additionalSources", value);
    }
    /**
     * Sets the addToReviewSetOperation property value. Adds the results of the sourceCollection to the specified reviewSet.
     * @param value Value to set for the addToReviewSetOperation property.
     */
    public void setAddToReviewSetOperation(@jakarta.annotation.Nullable final AddToReviewSetOperation value) {
        this.backingStore.set("addToReviewSetOperation", value);
    }
    /**
     * Sets the contentQuery property value. The query string in KQL (Keyword Query Language) query. For details, see Keyword queries and search conditions for Content Search and eDiscovery. You can refine searches by using fields paired with values; for example, subject:'Quarterly Financials' AND Date>=06/01/2016 AND Date<=07/01/2016.
     * @param value Value to set for the contentQuery property.
     */
    public void setContentQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentQuery", value);
    }
    /**
     * Sets the createdBy property value. The user who created the sourceCollection.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the sourceCollection was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the custodianSources property value. Custodian sources that are included in the sourceCollection.
     * @param value Value to set for the custodianSources property.
     */
    public void setCustodianSources(@jakarta.annotation.Nullable final java.util.List<DataSource> value) {
        this.backingStore.set("custodianSources", value);
    }
    /**
     * Sets the dataSourceScopes property value. When specified, the collection spans across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @param value Value to set for the dataSourceScopes property.
     */
    public void setDataSourceScopes(@jakarta.annotation.Nullable final EnumSet<DataSourceScopes> value) {
        this.backingStore.set("dataSourceScopes", value);
    }
    /**
     * Sets the description property value. The description of the sourceCollection.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the sourceCollection.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the sourceCollection.
     * @param value Value to set for the lastEstimateStatisticsOperation property.
     */
    public void setLastEstimateStatisticsOperation(@jakarta.annotation.Nullable final EstimateStatisticsOperation value) {
        this.backingStore.set("lastEstimateStatisticsOperation", value);
    }
    /**
     * Sets the lastModifiedBy property value. The last user who modified the sourceCollection.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last date and time the sourceCollection was modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the noncustodialSources property value. noncustodialDataSource sources that are included in the sourceCollection
     * @param value Value to set for the noncustodialSources property.
     */
    public void setNoncustodialSources(@jakarta.annotation.Nullable final java.util.List<NoncustodialDataSource> value) {
        this.backingStore.set("noncustodialSources", value);
    }
}

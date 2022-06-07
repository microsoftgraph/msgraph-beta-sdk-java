package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.IdentitySet;
/** Provides operations to manage the compliance singleton. */
public class SourceCollection extends Entity implements Parsable {
    /** Adds an additional source to the sourceCollection. */
    private java.util.List<DataSource> _additionalSources;
    /** Adds the results of the sourceCollection to the specified reviewSet. */
    private AddToReviewSetOperation _addToReviewSetOperation;
    /** The query string in KQL (Keyword Query Language) query. For details, see Keyword queries and search conditions for Content Search and eDiscovery. You can refine searches by using fields paired with values; for example, subject:'Quarterly Financials' AND Date>=06/01/2016 AND Date<=07/01/2016. */
    private String _contentQuery;
    /** The user who created the sourceCollection. */
    private IdentitySet _createdBy;
    /** The date and time the sourceCollection was created. */
    private OffsetDateTime _createdDateTime;
    /** Custodian sources that are included in the sourceCollection. */
    private java.util.List<DataSource> _custodianSources;
    /** When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources. */
    private DataSourceScopes _dataSourceScopes;
    /** The description of the sourceCollection. */
    private String _description;
    /** The display name of the sourceCollection. */
    private String _displayName;
    /** The last estimate operation associated with the sourceCollection. */
    private EstimateStatisticsOperation _lastEstimateStatisticsOperation;
    /** The last user who modified the sourceCollection. */
    private IdentitySet _lastModifiedBy;
    /** The last date and time the sourceCollection was modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** noncustodialDataSource sources that are included in the sourceCollection */
    private java.util.List<NoncustodialDataSource> _noncustodialSources;
    /**
     * Instantiates a new sourceCollection and sets the default values.
     * @return a void
     */
    public SourceCollection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sourceCollection
     */
    @javax.annotation.Nonnull
    public static SourceCollection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceCollection();
    }
    /**
     * Gets the additionalSources property value. Adds an additional source to the sourceCollection.
     * @return a dataSource
     */
    @javax.annotation.Nullable
    public java.util.List<DataSource> getAdditionalSources() {
        return this._additionalSources;
    }
    /**
     * Gets the addToReviewSetOperation property value. Adds the results of the sourceCollection to the specified reviewSet.
     * @return a addToReviewSetOperation
     */
    @javax.annotation.Nullable
    public AddToReviewSetOperation getAddToReviewSetOperation() {
        return this._addToReviewSetOperation;
    }
    /**
     * Gets the contentQuery property value. The query string in KQL (Keyword Query Language) query. For details, see Keyword queries and search conditions for Content Search and eDiscovery. You can refine searches by using fields paired with values; for example, subject:'Quarterly Financials' AND Date>=06/01/2016 AND Date<=07/01/2016.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentQuery() {
        return this._contentQuery;
    }
    /**
     * Gets the createdBy property value. The user who created the sourceCollection.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time the sourceCollection was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the custodianSources property value. Custodian sources that are included in the sourceCollection.
     * @return a dataSource
     */
    @javax.annotation.Nullable
    public java.util.List<DataSource> getCustodianSources() {
        return this._custodianSources;
    }
    /**
     * Gets the dataSourceScopes property value. When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @return a dataSourceScopes
     */
    @javax.annotation.Nullable
    public DataSourceScopes getDataSourceScopes() {
        return this._dataSourceScopes;
    }
    /**
     * Gets the description property value. The description of the sourceCollection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the sourceCollection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SourceCollection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("additionalSources", (n) -> { currentObject.setAdditionalSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
            this.put("addToReviewSetOperation", (n) -> { currentObject.setAddToReviewSetOperation(n.getObjectValue(AddToReviewSetOperation::createFromDiscriminatorValue)); });
            this.put("contentQuery", (n) -> { currentObject.setContentQuery(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("custodianSources", (n) -> { currentObject.setCustodianSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
            this.put("dataSourceScopes", (n) -> { currentObject.setDataSourceScopes(n.getEnumValue(DataSourceScopes.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastEstimateStatisticsOperation", (n) -> { currentObject.setLastEstimateStatisticsOperation(n.getObjectValue(EstimateStatisticsOperation::createFromDiscriminatorValue)); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("noncustodialSources", (n) -> { currentObject.setNoncustodialSources(n.getCollectionOfObjectValues(NoncustodialDataSource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the sourceCollection.
     * @return a estimateStatisticsOperation
     */
    @javax.annotation.Nullable
    public EstimateStatisticsOperation getLastEstimateStatisticsOperation() {
        return this._lastEstimateStatisticsOperation;
    }
    /**
     * Gets the lastModifiedBy property value. The last user who modified the sourceCollection.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last date and time the sourceCollection was modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the noncustodialSources property value. noncustodialDataSource sources that are included in the sourceCollection
     * @return a noncustodialDataSource
     */
    @javax.annotation.Nullable
    public java.util.List<NoncustodialDataSource> getNoncustodialSources() {
        return this._noncustodialSources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalSources", this.getAdditionalSources());
        writer.writeObjectValue("addToReviewSetOperation", this.getAddToReviewSetOperation());
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("custodianSources", this.getCustodianSources());
        writer.writeEnumValue("dataSourceScopes", this.getDataSourceScopes());
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
     * @return a void
     */
    public void setAdditionalSources(@javax.annotation.Nullable final java.util.List<DataSource> value) {
        this._additionalSources = value;
    }
    /**
     * Sets the addToReviewSetOperation property value. Adds the results of the sourceCollection to the specified reviewSet.
     * @param value Value to set for the addToReviewSetOperation property.
     * @return a void
     */
    public void setAddToReviewSetOperation(@javax.annotation.Nullable final AddToReviewSetOperation value) {
        this._addToReviewSetOperation = value;
    }
    /**
     * Sets the contentQuery property value. The query string in KQL (Keyword Query Language) query. For details, see Keyword queries and search conditions for Content Search and eDiscovery. You can refine searches by using fields paired with values; for example, subject:'Quarterly Financials' AND Date>=06/01/2016 AND Date<=07/01/2016.
     * @param value Value to set for the contentQuery property.
     * @return a void
     */
    public void setContentQuery(@javax.annotation.Nullable final String value) {
        this._contentQuery = value;
    }
    /**
     * Sets the createdBy property value. The user who created the sourceCollection.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the sourceCollection was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the custodianSources property value. Custodian sources that are included in the sourceCollection.
     * @param value Value to set for the custodianSources property.
     * @return a void
     */
    public void setCustodianSources(@javax.annotation.Nullable final java.util.List<DataSource> value) {
        this._custodianSources = value;
    }
    /**
     * Sets the dataSourceScopes property value. When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @param value Value to set for the dataSourceScopes property.
     * @return a void
     */
    public void setDataSourceScopes(@javax.annotation.Nullable final DataSourceScopes value) {
        this._dataSourceScopes = value;
    }
    /**
     * Sets the description property value. The description of the sourceCollection.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the sourceCollection.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the sourceCollection.
     * @param value Value to set for the lastEstimateStatisticsOperation property.
     * @return a void
     */
    public void setLastEstimateStatisticsOperation(@javax.annotation.Nullable final EstimateStatisticsOperation value) {
        this._lastEstimateStatisticsOperation = value;
    }
    /**
     * Sets the lastModifiedBy property value. The last user who modified the sourceCollection.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last date and time the sourceCollection was modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the noncustodialSources property value. noncustodialDataSource sources that are included in the sourceCollection
     * @param value Value to set for the noncustodialSources property.
     * @return a void
     */
    public void setNoncustodialSources(@javax.annotation.Nullable final java.util.List<NoncustodialDataSource> value) {
        this._noncustodialSources = value;
    }
}

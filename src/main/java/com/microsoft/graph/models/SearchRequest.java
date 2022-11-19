package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Contains one or more filters to obtain search results aggregated and filtered to a specific value of a field. Optional.Build this filter based on a prior search that aggregates by the same field. From the response of the prior search, identify the searchBucket that filters results to the specific value of the field, use the string in its aggregationFilterToken property, and build an aggregation filter string in the format '{field}:/'{aggregationFilterToken}/''. If multiple values for the same field need to be provided, use the strings in its aggregationFilterToken property and build an aggregation filter string in the format '{field}:or(/'{aggregationFilterToken1}/',/'{aggregationFilterToken2}/')'. For example, searching and aggregating drive items by file type returns a searchBucket for the file type docx in the response. You can conveniently use the aggregationFilterToken returned for this searchBucket in a subsequent search query and filter matches down to drive items of the docx file type. Example 1 and example 2 show the actual requests and responses. */
    private java.util.List<String> _aggregationFilters;
    /** Specifies aggregations (also known as refiners) to be returned alongside search results. Optional. */
    private java.util.List<AggregationOption> _aggregations;
    /** Contains the ordered collection of fields and limit to collapse results. Optional. */
    private java.util.List<CollapseProperty> _collapseProperties;
    /** Contains the connection to be targeted. Respects the following format : /external/connections/connectionid where connectionid is the ConnectionId defined in the Connectors Administration.  Note: contentSource is only applicable when entityType=externalItem. Optional. */
    private java.util.List<String> _contentSources;
    /** This triggers hybrid sort for messages: the first 3 messages are the most relevant. This property is only applicable to entityType=message. Optional. */
    private Boolean _enableTopResults;
    /** One or more types of resources expected in the response. Possible values are: list, site, listItem, message, event, drive, driveItem, person, externalItem, acronym, bookmark, chatMessage. For details about combinations of two or more entity types that are supported in the same search request, see known limitations. Required. */
    private java.util.List<EntityType> _entityTypes;
    /** Contains the fields to be returned for each resource object specified in entityTypes, allowing customization of the fields returned by default otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in externalItem from content that Microsoft Graph connectors bring in. The fields property can be using the semantic labels applied to properties. For example, if a property is label as title, you can retrieve it using the following syntax : label_title.Optional. */
    private java.util.List<String> _fields;
    /** Specifies the offset for the search results. Offset 0 returns the very first result. Optional. */
    private Integer _from;
    /** The OdataType property */
    private String _odataType;
    /** The query property */
    private SearchQuery _query;
    /** Provides query alteration options formatted as a JSON blob that contains two optional flags related to spelling correction. Optional. */
    private SearchAlterationOptions _queryAlterationOptions;
    /** Required for searches that use application permissions. Represents the geographic location for the search. For details, see Get the region value. */
    private String _region;
    /** Provides the search result templates options for rendering connectors search results. */
    private ResultTemplateOption _resultTemplateOptions;
    /** Indicates the kind of contents to be searched when a search is performed using application permissions. Optional. */
    private SharePointOneDriveOptions _sharePointOneDriveOptions;
    /** The size of the page to be retrieved. Optional. */
    private Integer _size;
    /** Contains the ordered collection of fields and direction to sort results. There can be at most 5 sort properties in the collection. Optional. */
    private java.util.List<SortProperty> _sortProperties;
    /** The stored_fields property */
    private java.util.List<String> _stored_fields;
    /** Indicates whether to trim away the duplicate SharePoint files from search results. Default value is false. Optional. */
    private Boolean _trimDuplicates;
    /**
     * Instantiates a new searchRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SearchRequest() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchRequest
     */
    @javax.annotation.Nonnull
    public static SearchRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchRequest();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the aggregationFilters property value. Contains one or more filters to obtain search results aggregated and filtered to a specific value of a field. Optional.Build this filter based on a prior search that aggregates by the same field. From the response of the prior search, identify the searchBucket that filters results to the specific value of the field, use the string in its aggregationFilterToken property, and build an aggregation filter string in the format '{field}:/'{aggregationFilterToken}/''. If multiple values for the same field need to be provided, use the strings in its aggregationFilterToken property and build an aggregation filter string in the format '{field}:or(/'{aggregationFilterToken1}/',/'{aggregationFilterToken2}/')'. For example, searching and aggregating drive items by file type returns a searchBucket for the file type docx in the response. You can conveniently use the aggregationFilterToken returned for this searchBucket in a subsequent search query and filter matches down to drive items of the docx file type. Example 1 and example 2 show the actual requests and responses.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAggregationFilters() {
        return this._aggregationFilters;
    }
    /**
     * Gets the aggregations property value. Specifies aggregations (also known as refiners) to be returned alongside search results. Optional.
     * @return a aggregationOption
     */
    @javax.annotation.Nullable
    public java.util.List<AggregationOption> getAggregations() {
        return this._aggregations;
    }
    /**
     * Gets the collapseProperties property value. Contains the ordered collection of fields and limit to collapse results. Optional.
     * @return a collapseProperty
     */
    @javax.annotation.Nullable
    public java.util.List<CollapseProperty> getCollapseProperties() {
        return this._collapseProperties;
    }
    /**
     * Gets the contentSources property value. Contains the connection to be targeted. Respects the following format : /external/connections/connectionid where connectionid is the ConnectionId defined in the Connectors Administration.  Note: contentSource is only applicable when entityType=externalItem. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentSources() {
        return this._contentSources;
    }
    /**
     * Gets the enableTopResults property value. This triggers hybrid sort for messages: the first 3 messages are the most relevant. This property is only applicable to entityType=message. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTopResults() {
        return this._enableTopResults;
    }
    /**
     * Gets the entityTypes property value. One or more types of resources expected in the response. Possible values are: list, site, listItem, message, event, drive, driveItem, person, externalItem, acronym, bookmark, chatMessage. For details about combinations of two or more entity types that are supported in the same search request, see known limitations. Required.
     * @return a entityType
     */
    @javax.annotation.Nullable
    public java.util.List<EntityType> getEntityTypes() {
        return this._entityTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchRequest currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(18);
        deserializerMap.put("aggregationFilters", (n) -> { currentObject.setAggregationFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("aggregations", (n) -> { currentObject.setAggregations(n.getCollectionOfObjectValues(AggregationOption::createFromDiscriminatorValue)); });
        deserializerMap.put("collapseProperties", (n) -> { currentObject.setCollapseProperties(n.getCollectionOfObjectValues(CollapseProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSources", (n) -> { currentObject.setContentSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enableTopResults", (n) -> { currentObject.setEnableTopResults(n.getBooleanValue()); });
        deserializerMap.put("entityTypes", (n) -> { currentObject.setEntityTypes(n.getCollectionOfEnumValues(EntityType.class)); });
        deserializerMap.put("fields", (n) -> { currentObject.setFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("from", (n) -> { currentObject.setFrom(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("query", (n) -> { currentObject.setQuery(n.getObjectValue(SearchQuery::createFromDiscriminatorValue)); });
        deserializerMap.put("queryAlterationOptions", (n) -> { currentObject.setQueryAlterationOptions(n.getObjectValue(SearchAlterationOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("region", (n) -> { currentObject.setRegion(n.getStringValue()); });
        deserializerMap.put("resultTemplateOptions", (n) -> { currentObject.setResultTemplateOptions(n.getObjectValue(ResultTemplateOption::createFromDiscriminatorValue)); });
        deserializerMap.put("sharePointOneDriveOptions", (n) -> { currentObject.setSharePointOneDriveOptions(n.getObjectValue(SharePointOneDriveOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { currentObject.setSize(n.getIntegerValue()); });
        deserializerMap.put("sortProperties", (n) -> { currentObject.setSortProperties(n.getCollectionOfObjectValues(SortProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("stored_fields", (n) -> { currentObject.setStored_fields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("trimDuplicates", (n) -> { currentObject.setTrimDuplicates(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the fields property value. Contains the fields to be returned for each resource object specified in entityTypes, allowing customization of the fields returned by default otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in externalItem from content that Microsoft Graph connectors bring in. The fields property can be using the semantic labels applied to properties. For example, if a property is label as title, you can retrieve it using the following syntax : label_title.Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFields() {
        return this._fields;
    }
    /**
     * Gets the from property value. Specifies the offset for the search results. Offset 0 returns the very first result. Optional.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFrom() {
        return this._from;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the query property value. The query property
     * @return a searchQuery
     */
    @javax.annotation.Nullable
    public SearchQuery getQuery() {
        return this._query;
    }
    /**
     * Gets the queryAlterationOptions property value. Provides query alteration options formatted as a JSON blob that contains two optional flags related to spelling correction. Optional.
     * @return a searchAlterationOptions
     */
    @javax.annotation.Nullable
    public SearchAlterationOptions getQueryAlterationOptions() {
        return this._queryAlterationOptions;
    }
    /**
     * Gets the region property value. Required for searches that use application permissions. Represents the geographic location for the search. For details, see Get the region value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this._region;
    }
    /**
     * Gets the resultTemplateOptions property value. Provides the search result templates options for rendering connectors search results.
     * @return a resultTemplateOption
     */
    @javax.annotation.Nullable
    public ResultTemplateOption getResultTemplateOptions() {
        return this._resultTemplateOptions;
    }
    /**
     * Gets the sharePointOneDriveOptions property value. Indicates the kind of contents to be searched when a search is performed using application permissions. Optional.
     * @return a sharePointOneDriveOptions
     */
    @javax.annotation.Nullable
    public SharePointOneDriveOptions getSharePointOneDriveOptions() {
        return this._sharePointOneDriveOptions;
    }
    /**
     * Gets the size property value. The size of the page to be retrieved. Optional.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this._size;
    }
    /**
     * Gets the sortProperties property value. Contains the ordered collection of fields and direction to sort results. There can be at most 5 sort properties in the collection. Optional.
     * @return a sortProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SortProperty> getSortProperties() {
        return this._sortProperties;
    }
    /**
     * Gets the stored_fields property value. The stored_fields property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getStored_fields() {
        return this._stored_fields;
    }
    /**
     * Gets the trimDuplicates property value. Indicates whether to trim away the duplicate SharePoint files from search results. Default value is false. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTrimDuplicates() {
        return this._trimDuplicates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aggregationFilters", this.getAggregationFilters());
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeCollectionOfObjectValues("collapseProperties", this.getCollapseProperties());
        writer.writeCollectionOfPrimitiveValues("contentSources", this.getContentSources());
        writer.writeBooleanValue("enableTopResults", this.getEnableTopResults());
        writer.writeCollectionOfEnumValues("entityTypes", this.getEntityTypes());
        writer.writeCollectionOfPrimitiveValues("fields", this.getFields());
        writer.writeIntegerValue("from", this.getFrom());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("query", this.getQuery());
        writer.writeObjectValue("queryAlterationOptions", this.getQueryAlterationOptions());
        writer.writeStringValue("region", this.getRegion());
        writer.writeObjectValue("resultTemplateOptions", this.getResultTemplateOptions());
        writer.writeObjectValue("sharePointOneDriveOptions", this.getSharePointOneDriveOptions());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeCollectionOfObjectValues("sortProperties", this.getSortProperties());
        writer.writeCollectionOfPrimitiveValues("stored_fields", this.getStored_fields());
        writer.writeBooleanValue("trimDuplicates", this.getTrimDuplicates());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the aggregationFilters property value. Contains one or more filters to obtain search results aggregated and filtered to a specific value of a field. Optional.Build this filter based on a prior search that aggregates by the same field. From the response of the prior search, identify the searchBucket that filters results to the specific value of the field, use the string in its aggregationFilterToken property, and build an aggregation filter string in the format '{field}:/'{aggregationFilterToken}/''. If multiple values for the same field need to be provided, use the strings in its aggregationFilterToken property and build an aggregation filter string in the format '{field}:or(/'{aggregationFilterToken1}/',/'{aggregationFilterToken2}/')'. For example, searching and aggregating drive items by file type returns a searchBucket for the file type docx in the response. You can conveniently use the aggregationFilterToken returned for this searchBucket in a subsequent search query and filter matches down to drive items of the docx file type. Example 1 and example 2 show the actual requests and responses.
     * @param value Value to set for the aggregationFilters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregationFilters(@javax.annotation.Nullable final java.util.List<String> value) {
        this._aggregationFilters = value;
    }
    /**
     * Sets the aggregations property value. Specifies aggregations (also known as refiners) to be returned alongside search results. Optional.
     * @param value Value to set for the aggregations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregations(@javax.annotation.Nullable final java.util.List<AggregationOption> value) {
        this._aggregations = value;
    }
    /**
     * Sets the collapseProperties property value. Contains the ordered collection of fields and limit to collapse results. Optional.
     * @param value Value to set for the collapseProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollapseProperties(@javax.annotation.Nullable final java.util.List<CollapseProperty> value) {
        this._collapseProperties = value;
    }
    /**
     * Sets the contentSources property value. Contains the connection to be targeted. Respects the following format : /external/connections/connectionid where connectionid is the ConnectionId defined in the Connectors Administration.  Note: contentSource is only applicable when entityType=externalItem. Optional.
     * @param value Value to set for the contentSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentSources(@javax.annotation.Nullable final java.util.List<String> value) {
        this._contentSources = value;
    }
    /**
     * Sets the enableTopResults property value. This triggers hybrid sort for messages: the first 3 messages are the most relevant. This property is only applicable to entityType=message. Optional.
     * @param value Value to set for the enableTopResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableTopResults(@javax.annotation.Nullable final Boolean value) {
        this._enableTopResults = value;
    }
    /**
     * Sets the entityTypes property value. One or more types of resources expected in the response. Possible values are: list, site, listItem, message, event, drive, driveItem, person, externalItem, acronym, bookmark, chatMessage. For details about combinations of two or more entity types that are supported in the same search request, see known limitations. Required.
     * @param value Value to set for the entityTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntityTypes(@javax.annotation.Nullable final java.util.List<EntityType> value) {
        this._entityTypes = value;
    }
    /**
     * Sets the fields property value. Contains the fields to be returned for each resource object specified in entityTypes, allowing customization of the fields returned by default otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in externalItem from content that Microsoft Graph connectors bring in. The fields property can be using the semantic labels applied to properties. For example, if a property is label as title, you can retrieve it using the following syntax : label_title.Optional.
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final java.util.List<String> value) {
        this._fields = value;
    }
    /**
     * Sets the from property value. Specifies the offset for the search results. Offset 0 returns the very first result. Optional.
     * @param value Value to set for the from property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrom(@javax.annotation.Nullable final Integer value) {
        this._from = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the query property value. The query property
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final SearchQuery value) {
        this._query = value;
    }
    /**
     * Sets the queryAlterationOptions property value. Provides query alteration options formatted as a JSON blob that contains two optional flags related to spelling correction. Optional.
     * @param value Value to set for the queryAlterationOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryAlterationOptions(@javax.annotation.Nullable final SearchAlterationOptions value) {
        this._queryAlterationOptions = value;
    }
    /**
     * Sets the region property value. Required for searches that use application permissions. Represents the geographic location for the search. For details, see Get the region value.
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this._region = value;
    }
    /**
     * Sets the resultTemplateOptions property value. Provides the search result templates options for rendering connectors search results.
     * @param value Value to set for the resultTemplateOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultTemplateOptions(@javax.annotation.Nullable final ResultTemplateOption value) {
        this._resultTemplateOptions = value;
    }
    /**
     * Sets the sharePointOneDriveOptions property value. Indicates the kind of contents to be searched when a search is performed using application permissions. Optional.
     * @param value Value to set for the sharePointOneDriveOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointOneDriveOptions(@javax.annotation.Nullable final SharePointOneDriveOptions value) {
        this._sharePointOneDriveOptions = value;
    }
    /**
     * Sets the size property value. The size of the page to be retrieved. Optional.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this._size = value;
    }
    /**
     * Sets the sortProperties property value. Contains the ordered collection of fields and direction to sort results. There can be at most 5 sort properties in the collection. Optional.
     * @param value Value to set for the sortProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSortProperties(@javax.annotation.Nullable final java.util.List<SortProperty> value) {
        this._sortProperties = value;
    }
    /**
     * Sets the stored_fields property value. The stored_fields property
     * @param value Value to set for the stored_fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStored_fields(@javax.annotation.Nullable final java.util.List<String> value) {
        this._stored_fields = value;
    }
    /**
     * Sets the trimDuplicates property value. Indicates whether to trim away the duplicate SharePoint files from search results. Default value is false. Optional.
     * @param value Value to set for the trimDuplicates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrimDuplicates(@javax.annotation.Nullable final Boolean value) {
        this._trimDuplicates = value;
    }
}

package com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item;

import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.additionalsources.AdditionalSourcesRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.addtoreviewsetoperation.AddToReviewSetOperationRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.custodiansources.CustodianSourcesRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.lastestimatestatisticsoperation.LastEstimateStatisticsOperationRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.microsoftgraphediscoveryestimatestatistics.MicrosoftGraphEdiscoveryEstimateStatisticsRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.microsoftgraphediscoverypurgedata.MicrosoftGraphEdiscoveryPurgeDataRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.noncustodialsources.NoncustodialSourcesRequestBuilder;
import com.microsoft.graph.beta.models.ediscovery.SourceCollection;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the sourceCollections property of the microsoft.graph.ediscovery.case entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceCollectionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the additionalSources property of the microsoft.graph.ediscovery.sourceCollection entity.
     * @return a {@link AdditionalSourcesRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AdditionalSourcesRequestBuilder additionalSources() {
        return new AdditionalSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the addToReviewSetOperation property of the microsoft.graph.ediscovery.sourceCollection entity.
     * @return a {@link AddToReviewSetOperationRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AddToReviewSetOperationRequestBuilder addToReviewSetOperation() {
        return new AddToReviewSetOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the custodianSources property of the microsoft.graph.ediscovery.sourceCollection entity.
     * @return a {@link CustodianSourcesRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CustodianSourcesRequestBuilder custodianSources() {
        return new CustodianSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastEstimateStatisticsOperation property of the microsoft.graph.ediscovery.sourceCollection entity.
     * @return a {@link LastEstimateStatisticsOperationRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public LastEstimateStatisticsOperationRequestBuilder lastEstimateStatisticsOperation() {
        return new LastEstimateStatisticsOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the estimateStatistics method.
     * @return a {@link MicrosoftGraphEdiscoveryEstimateStatisticsRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryEstimateStatisticsRequestBuilder microsoftGraphEdiscoveryEstimateStatistics() {
        return new MicrosoftGraphEdiscoveryEstimateStatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the purgeData method.
     * @return a {@link MicrosoftGraphEdiscoveryPurgeDataRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryPurgeDataRequestBuilder microsoftGraphEdiscoveryPurgeData() {
        return new MicrosoftGraphEdiscoveryPurgeDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the noncustodialSources property of the microsoft.graph.ediscovery.sourceCollection entity.
     * @return a {@link NoncustodialSourcesRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public NoncustodialSourcesRequestBuilder noncustodialSources() {
        return new NoncustodialSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SourceCollectionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SourceCollectionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/sourceCollections/{sourceCollection%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SourceCollectionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SourceCollectionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/sourceCollections/{sourceCollection%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a sourceCollection object.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-sourcecollection-delete?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete a sourceCollection object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-sourcecollection-delete?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @return a {@link SourceCollection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SourceCollection get() {
        return get(null);
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SourceCollection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SourceCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SourceCollection::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a sourceCollection object.
     * @param body The request body
     * @return a {@link SourceCollection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-sourcecollection-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SourceCollection patch(@jakarta.annotation.Nonnull final SourceCollection body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a sourceCollection object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SourceCollection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-sourcecollection-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SourceCollection patch(@jakarta.annotation.Nonnull final SourceCollection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SourceCollection::createFromDiscriminatorValue);
    }
    /**
     * Delete a sourceCollection object.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a sourceCollection object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a sourceCollection object.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SourceCollection body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a sourceCollection object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SourceCollection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SourceCollectionItemRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public SourceCollectionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SourceCollectionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

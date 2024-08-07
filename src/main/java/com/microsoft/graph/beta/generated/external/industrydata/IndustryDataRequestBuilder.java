package com.microsoft.graph.beta.external.industrydata;

import com.microsoft.graph.beta.external.industrydata.dataconnectors.DataConnectorsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.inboundflows.InboundFlowsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.operations.OperationsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.outboundprovisioningflowsets.OutboundProvisioningFlowSetsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.referencedefinitions.ReferenceDefinitionsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.rolegroups.RoleGroupsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.runs.RunsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.sourcesystems.SourceSystemsRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.years.YearsRequestBuilder;
import com.microsoft.graph.beta.models.industrydata.IndustryDataRoot;
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
 * Provides operations to manage the industryData property of the microsoft.graph.externalConnectors.external entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the dataConnectors property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link DataConnectorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataConnectorsRequestBuilder dataConnectors() {
        return new DataConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inboundFlows property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link InboundFlowsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InboundFlowsRequestBuilder inboundFlows() {
        return new InboundFlowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the outboundProvisioningFlowSets property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link OutboundProvisioningFlowSetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutboundProvisioningFlowSetsRequestBuilder outboundProvisioningFlowSets() {
        return new OutboundProvisioningFlowSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the referenceDefinitions property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link ReferenceDefinitionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReferenceDefinitionsRequestBuilder referenceDefinitions() {
        return new ReferenceDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleGroups property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link RoleGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleGroupsRequestBuilder roleGroups() {
        return new RoleGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the runs property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link RunsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RunsRequestBuilder runs() {
        return new RunsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sourceSystems property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link SourceSystemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SourceSystemsRequestBuilder sourceSystems() {
        return new SourceSystemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the years property of the microsoft.graph.industryData.industryDataRoot entity.
     * @return a {@link YearsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public YearsRequestBuilder years() {
        return new YearsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link IndustryDataRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IndustryDataRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link IndustryDataRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IndustryDataRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get industryData from external
     * @return a {@link IndustryDataRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IndustryDataRoot get() {
        return get(null);
    }
    /**
     * Get industryData from external
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IndustryDataRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IndustryDataRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IndustryDataRoot::createFromDiscriminatorValue);
    }
    /**
     * Get industryData from external
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get industryData from external
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link IndustryDataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IndustryDataRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IndustryDataRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get industryData from external
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
}

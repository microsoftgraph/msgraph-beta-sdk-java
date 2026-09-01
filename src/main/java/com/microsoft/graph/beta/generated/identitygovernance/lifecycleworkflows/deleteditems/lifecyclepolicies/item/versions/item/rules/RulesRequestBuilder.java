package com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.versions.item.rules;

import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.versions.item.rules.count.CountRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.versions.item.rules.item.LifecyclePolicyRuleItemRequestBuilder;
import com.microsoft.graph.beta.models.identitygovernance.LifecyclePolicyRuleCollectionResponse;
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
 * Provides operations to manage the rules property of the microsoft.graph.identityGovernance.lifecyclePolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RulesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rules property of the microsoft.graph.identityGovernance.lifecyclePolicy entity.
     * @param lifecyclePolicyRuleId The unique identifier of lifecyclePolicyRule
     * @return a {@link LifecyclePolicyRuleItemRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public LifecyclePolicyRuleItemRequestBuilder byLifecyclePolicyRuleId(@jakarta.annotation.Nonnull final String lifecyclePolicyRuleId) {
        Objects.requireNonNull(lifecyclePolicyRuleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("lifecyclePolicyRule%2Did", lifecyclePolicyRuleId);
        return new LifecyclePolicyRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link RulesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/lifecyclePolicies/{lifecyclePolicy%2Did}/versions/{lifecyclePolicy%2Did1}/rules{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link RulesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/lifecyclePolicies/{lifecyclePolicy%2Did}/versions/{lifecyclePolicy%2Did1}/rules{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get rules from identityGovernance
     * @return a {@link LifecyclePolicyRuleCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicyRuleCollectionResponse get() {
        return get(null);
    }
    /**
     * Get rules from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LifecyclePolicyRuleCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicyRuleCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LifecyclePolicyRuleCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Get rules from identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get rules from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link RulesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RulesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RulesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get rules from identityGovernance
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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

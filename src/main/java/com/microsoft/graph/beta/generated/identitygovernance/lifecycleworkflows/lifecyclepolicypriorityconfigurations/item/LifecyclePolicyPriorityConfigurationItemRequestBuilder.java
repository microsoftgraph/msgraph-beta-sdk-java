package com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.lifecyclepolicypriorityconfigurations.item;

import com.microsoft.graph.beta.models.identitygovernance.LifecyclePolicyPriorityConfiguration;
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
 * Provides operations to manage the lifecyclePolicyPriorityConfigurations property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicyPriorityConfigurationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LifecyclePolicyPriorityConfigurationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LifecyclePolicyPriorityConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/lifecyclePolicyPriorityConfigurations/{lifecyclePolicyPriorityConfiguration%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link LifecyclePolicyPriorityConfigurationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LifecyclePolicyPriorityConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/lifecyclePolicyPriorityConfigurations/{lifecyclePolicyPriorityConfiguration%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get lifecyclePolicyPriorityConfigurations from identityGovernance
     * @return a {@link LifecyclePolicyPriorityConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicyPriorityConfiguration get() {
        return get(null);
    }
    /**
     * Get lifecyclePolicyPriorityConfigurations from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LifecyclePolicyPriorityConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicyPriorityConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LifecyclePolicyPriorityConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property lifecyclePolicyPriorityConfigurations in identityGovernance
     * @param body The request body
     * @return a {@link LifecyclePolicyPriorityConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicyPriorityConfiguration patch(@jakarta.annotation.Nonnull final LifecyclePolicyPriorityConfiguration body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property lifecyclePolicyPriorityConfigurations in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LifecyclePolicyPriorityConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicyPriorityConfiguration patch(@jakarta.annotation.Nonnull final LifecyclePolicyPriorityConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LifecyclePolicyPriorityConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Get lifecyclePolicyPriorityConfigurations from identityGovernance
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
     * Get lifecyclePolicyPriorityConfigurations from identityGovernance
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
     * Update the navigation property lifecyclePolicyPriorityConfigurations in identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final LifecyclePolicyPriorityConfiguration body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property lifecyclePolicyPriorityConfigurations in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final LifecyclePolicyPriorityConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link LifecyclePolicyPriorityConfigurationItemRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public LifecyclePolicyPriorityConfigurationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LifecyclePolicyPriorityConfigurationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get lifecyclePolicyPriorityConfigurations from identityGovernance
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

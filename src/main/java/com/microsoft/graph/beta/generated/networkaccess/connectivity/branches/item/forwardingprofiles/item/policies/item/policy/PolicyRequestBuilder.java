package com.microsoft.graph.beta.networkaccess.connectivity.branches.item.forwardingprofiles.item.policies.item.policy;

import com.microsoft.graph.beta.models.networkaccess.Policy;
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
 * Provides operations to manage the policy property of the microsoft.graph.networkaccess.policyLink entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new PolicyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/connectivity/branches/{branchSite%2Did}/forwardingProfiles/{forwardingProfile%2Did}/policies/{policyLink%2Did}/policy{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PolicyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/connectivity/branches/{branchSite%2Did}/forwardingProfiles/{forwardingProfile%2Did}/policies/{policyLink%2Did}/policy{?%24select,%24expand}", rawUrl);
    }
    /**
     * Policy.
     * @return a Policy
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Policy get() {
        return get(null);
    }
    /**
     * Policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Policy
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Policy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Policy::createFromDiscriminatorValue);
    }
    /**
     * Policy.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
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
     * @return a PolicyRequestBuilder
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public PolicyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PolicyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Policy.
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
         * @return a Map<String, Object>
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

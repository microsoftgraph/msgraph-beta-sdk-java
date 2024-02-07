package com.microsoft.graph.beta.identity.userflows.item;

import com.microsoft.graph.beta.models.IdentityUserFlow;
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
 * Provides operations to manage the userFlows property of the microsoft.graph.identityContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityUserFlowItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new IdentityUserFlowItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityUserFlowItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/userFlows/{identityUserFlow%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new IdentityUserFlowItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityUserFlowItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/userFlows/{identityUserFlow%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete an existing userFlow object.
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete an existing userFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and associations for an userFlow object.
     * @return a IdentityUserFlow
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow get() {
        return get(null);
    }
    /**
     * Retrieve the properties and associations for an userFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IdentityUserFlow
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property userFlows in identity
     * @param body The request body
     * @return a IdentityUserFlow
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow patch(@jakarta.annotation.Nonnull final IdentityUserFlow body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property userFlows in identity
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IdentityUserFlow
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow patch(@jakarta.annotation.Nonnull final IdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Delete an existing userFlow object.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an existing userFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and associations for an userFlow object.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and associations for an userFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
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
     * Update the navigation property userFlows in identity
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlow body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property userFlows in identity
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a IdentityUserFlowItemRequestBuilder
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public IdentityUserFlowItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IdentityUserFlowItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and associations for an userFlow object.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

package com.microsoft.graph.identity.b2cuserflows.item;

import com.microsoft.graph.identity.b2cuserflows.item.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.identity.b2cuserflows.item.languages.LanguagesRequestBuilder;
import com.microsoft.graph.identity.b2cuserflows.item.userattributeassignments.UserAttributeAssignmentsRequestBuilder;
import com.microsoft.graph.identity.b2cuserflows.item.userflowidentityproviders.UserFlowIdentityProvidersRequestBuilder;
import com.microsoft.graph.models.B2cIdentityUserFlow;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the b2cUserFlows property of the microsoft.graph.identityContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2cIdentityUserFlowItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the identityProviders property of the microsoft.graph.b2cIdentityUserFlow entity.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the languages property of the microsoft.graph.b2cIdentityUserFlow entity.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public LanguagesRequestBuilder languages() {
        return new LanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userAttributeAssignments property of the microsoft.graph.b2cIdentityUserFlow entity.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public UserAttributeAssignmentsRequestBuilder userAttributeAssignments() {
        return new UserAttributeAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userFlowIdentityProviders property of the microsoft.graph.b2cIdentityUserFlow entity.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public UserFlowIdentityProvidersRequestBuilder userFlowIdentityProviders() {
        return new UserFlowIdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new B2cIdentityUserFlowItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public B2cIdentityUserFlowItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2cUserFlows/{b2cIdentityUserFlow%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new B2cIdentityUserFlowItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public B2cIdentityUserFlowItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2cUserFlows/{b2cIdentityUserFlow%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a b2cIdentityUserFlow object.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/b2cidentityuserflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete a b2cIdentityUserFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/b2cidentityuserflow-delete?view=graph-rest-1.0">Find more info here</a>
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
     * Retrieve the properties and relationships of a b2cUserFlow object.
     * @return a B2cIdentityUserFlow
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/b2cidentityuserflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlow get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a b2cUserFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a B2cIdentityUserFlow
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/b2cidentityuserflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlow get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, B2cIdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a b2cIdentityUserFlow object.
     * @param body The request body
     * @return a B2cIdentityUserFlow
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/b2cidentityuserflow-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlow patch(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a b2cIdentityUserFlow object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a B2cIdentityUserFlow
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/b2cidentityuserflow-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlow patch(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, B2cIdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Delete a b2cIdentityUserFlow object.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a b2cIdentityUserFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
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
     * Retrieve the properties and relationships of a b2cUserFlow object.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a b2cUserFlow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
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
     * Update the properties of a b2cIdentityUserFlow object.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a b2cIdentityUserFlow object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a B2cIdentityUserFlowItemRequestBuilder
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public B2cIdentityUserFlowItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new B2cIdentityUserFlowItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a b2cUserFlow object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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

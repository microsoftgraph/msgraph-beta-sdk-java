package microsoft.graph.print.reports.authenticationmethods;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AuthenticationMethodsRoot;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.print.reports.authenticationmethods.userregistrationdetails.item.UserRegistrationDetailsItemRequestBuilder;
import microsoft.graph.print.reports.authenticationmethods.userregistrationdetails.UserRegistrationDetailsRequestBuilder;
import microsoft.graph.print.reports.authenticationmethods.usersregisteredbyfeature.UsersRegisteredByFeatureRequestBuilder;
import microsoft.graph.print.reports.authenticationmethods.usersregisteredbyfeaturewithincludedusertypeswithincludeduserroles.UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder;
import microsoft.graph.print.reports.authenticationmethods.usersregisteredbymethod.UsersRegisteredByMethodRequestBuilder;
import microsoft.graph.print.reports.authenticationmethods.usersregisteredbymethodwithincludedusertypeswithincludeduserroles.UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder;
/** Provides operations to manage the authenticationMethods property of the microsoft.graph.reportRoot entity.  */
public class AuthenticationMethodsRequestBuilder {
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /** The userRegistrationDetails property  */
    @javax.annotation.Nonnull
    public UserRegistrationDetailsRequestBuilder userRegistrationDetails() {
        return new UserRegistrationDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationMethodsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AuthenticationMethodsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/print/reports/authenticationMethods{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AuthenticationMethodsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AuthenticationMethodsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/print/reports/authenticationMethods{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property authenticationMethods for print
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property authenticationMethods for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AuthenticationMethodsRequestBuilderDeleteRequestConfiguration requestConfig = new AuthenticationMethodsRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AuthenticationMethodsRequestBuilderGetRequestConfiguration requestConfig = new AuthenticationMethodsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property authenticationMethods in print
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AuthenticationMethodsRoot body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property authenticationMethods in print
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AuthenticationMethodsRoot body, @javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final AuthenticationMethodsRequestBuilderPatchRequestConfiguration requestConfig = new AuthenticationMethodsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property authenticationMethods for print
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property authenticationMethods for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property authenticationMethods for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsRoot::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsRoot::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsRoot::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property authenticationMethods in print
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AuthenticationMethodsRoot body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property authenticationMethods in print
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AuthenticationMethodsRoot body, @javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property authenticationMethods in print
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AuthenticationMethodsRoot body, @javax.annotation.Nullable final java.util.function.Consumer<AuthenticationMethodsRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.authenticationMethods.userRegistrationDetails.item collection
     * @param id Unique identifier of the item
     * @return a userRegistrationDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserRegistrationDetailsItemRequestBuilder userRegistrationDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userRegistrationDetails%2Did", id);
        return new UserRegistrationDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByFeature method.
     * @return a usersRegisteredByFeatureRequestBuilder
     */
    @javax.annotation.Nonnull
    public UsersRegisteredByFeatureRequestBuilder usersRegisteredByFeature() {
        return new UsersRegisteredByFeatureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByFeature method.
     * @param includedUserRoles Usage: includedUserRoles='{includedUserRoles}'
     * @param includedUserTypes Usage: includedUserTypes='{includedUserTypes}'
     * @return a usersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder
     */
    @javax.annotation.Nonnull
    public UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder usersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRoles(@javax.annotation.Nonnull final String includedUserRoles, @javax.annotation.Nonnull final String includedUserTypes) {
        Objects.requireNonNull(includedUserRoles);
        Objects.requireNonNull(includedUserTypes);
        return new UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(pathParameters, requestAdapter, includedUserRoles, includedUserTypes);
    }
    /**
     * Provides operations to call the usersRegisteredByMethod method.
     * @return a usersRegisteredByMethodRequestBuilder
     */
    @javax.annotation.Nonnull
    public UsersRegisteredByMethodRequestBuilder usersRegisteredByMethod() {
        return new UsersRegisteredByMethodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByMethod method.
     * @param includedUserRoles Usage: includedUserRoles='{includedUserRoles}'
     * @param includedUserTypes Usage: includedUserTypes='{includedUserTypes}'
     * @return a usersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder
     */
    @javax.annotation.Nonnull
    public UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder usersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRoles(@javax.annotation.Nonnull final String includedUserRoles, @javax.annotation.Nonnull final String includedUserTypes) {
        Objects.requireNonNull(includedUserRoles);
        Objects.requireNonNull(includedUserTypes);
        return new UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(pathParameters, requestAdapter, includedUserRoles, includedUserTypes);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AuthenticationMethodsRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new authenticationMethodsRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public AuthenticationMethodsRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Container for navigation properties for Azure AD authentication methods resources.  */
    public class AuthenticationMethodsRequestBuilderGetQueryParameters {
        /** Expand related entities  */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned  */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AuthenticationMethodsRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public AuthenticationMethodsRequestBuilderGetQueryParameters queryParameters = new AuthenticationMethodsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new authenticationMethodsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public AuthenticationMethodsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AuthenticationMethodsRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new authenticationMethodsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public AuthenticationMethodsRequestBuilderPatchRequestConfiguration() {
        }
    }
}

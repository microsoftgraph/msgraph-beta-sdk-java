package microsoft.graph.rolemanagement.directory.rolescheduleswithdirectoryscopeidwithappscopeidwithprincipalidwithroledefinitionid;

import com.microsoft.kiota.HttpMethod;
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
/** Provides operations to call the roleSchedules method. */
public class RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/roleManagement/directory/microsoft.graph.roleSchedules(directoryScopeId='{directoryScopeId}',appScopeId='{appScopeId}',principalId='{principalId}',roleDefinitionId='{roleDefinitionId}'){?directoryScopeId,appScopeId,principalId,roleDefinitionId}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/roleManagement/directory/microsoft.graph.roleSchedules(directoryScopeId='{directoryScopeId}',appScopeId='{appScopeId}',principalId='{principalId}',roleDefinitionId='{roleDefinitionId}'){?directoryScopeId,appScopeId,principalId,roleDefinitionId}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function roleSchedules
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function roleSchedules
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration requestConfig = new RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function roleSchedules
     * @return a CompletableFuture of roleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse
     */
    public java.util.concurrent.CompletableFuture<RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function roleSchedules
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of roleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse
     */
    public java.util.concurrent.CompletableFuture<RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function roleSchedules
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of roleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse
     */
    public java.util.concurrent.CompletableFuture<RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdResponse::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Invoke function roleSchedules */
    public class RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetQueryParameters {
        /** Usage: appScopeId='{appScopeId}' */
        @javax.annotation.Nullable
        public String appScopeId;
        /** Usage: directoryScopeId='{directoryScopeId}' */
        @javax.annotation.Nullable
        public String directoryScopeId;
        /** Usage: principalId='{principalId}' */
        @javax.annotation.Nullable
        public String principalId;
        /** Usage: roleDefinitionId='{roleDefinitionId}' */
        @javax.annotation.Nullable
        public String roleDefinitionId;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetQueryParameters queryParameters = new RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new roleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilderGetRequestConfiguration() {
        }
    }
}

package com.microsoft.graph.privilegedroleassignments.item.makeeligible;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedRoleAssignment;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the makeEligible method.
 */
public class MakeEligibleRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MakeEligibleRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MakeEligibleRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedRoleAssignments/{privilegedRoleAssignment%2Did}/makeEligible", pathParameters);
    }
    /**
     * Instantiates a new MakeEligibleRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MakeEligibleRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedRoleAssignments/{privilegedRoleAssignment%2Did}/makeEligible", rawUrl);
    }
    /**
     * Make the role assignment eligible. If the role assignment is already eligible before the call, it does nothing. If the role assignment is permanent and the requestor is different from the target user, the role assignment will become eligible and the role will be deactivated for the target user. If the requestor is the target user and the role is Security Administrator or Privileged Role Administrator, the role will be activated with the default expiration.
     * @return a CompletableFuture of privilegedRoleAssignment
     * @see <a href="https://docs.microsoft.com/graph/api/privilegedroleassignment-makeeligible?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignment> post() {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedRoleAssignment::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedRoleAssignment> executionException = new java.util.concurrent.CompletableFuture<PrivilegedRoleAssignment>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Make the role assignment eligible. If the role assignment is already eligible before the call, it does nothing. If the role assignment is permanent and the requestor is different from the target user, the role assignment will become eligible and the role will be deactivated for the target user. If the requestor is the target user and the role is Security Administrator or Privileged Role Administrator, the role will be activated with the default expiration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of privilegedRoleAssignment
     * @see <a href="https://docs.microsoft.com/graph/api/privilegedroleassignment-makeeligible?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignment> post(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedRoleAssignment::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedRoleAssignment> executionException = new java.util.concurrent.CompletableFuture<PrivilegedRoleAssignment>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Make the role assignment eligible. If the role assignment is already eligible before the call, it does nothing. If the role assignment is permanent and the requestor is different from the target user, the role assignment will become eligible and the role will be deactivated for the target user. If the requestor is the target user and the role is Security Administrator or Privileged Role Administrator, the role will be activated with the default expiration.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation() throws URISyntaxException {
        return toPostRequestInformation(null);
    }
    /**
     * Make the role assignment eligible. If the role assignment is already eligible before the call, it does nothing. If the role assignment is permanent and the requestor is different from the target user, the role assignment will become eligible and the role will be deactivated for the target user. If the requestor is the target user and the role is Security Administrator or Privileged Role Administrator, the role will be activated with the default expiration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

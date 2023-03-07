package com.microsoft.graph.identitygovernance.privilegedaccess.group;

import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.AssignmentScheduleInstancesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.item.PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.AssignmentScheduleRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.item.PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedules.AssignmentSchedulesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedules.item.PrivilegedAccessGroupAssignmentScheduleItemRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityscheduleinstances.EligibilityScheduleInstancesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityscheduleinstances.item.PrivilegedAccessGroupEligibilityScheduleInstanceItemRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityschedulerequests.EligibilityScheduleRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityschedulerequests.item.PrivilegedAccessGroupEligibilityScheduleRequestItemRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityschedules.EligibilitySchedulesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityschedules.item.PrivilegedAccessGroupEligibilityScheduleItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedAccessGroup;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the group property of the microsoft.graph.privilegedAccessRoot entity.
 */
public class GroupRequestBuilder {
    /** Provides operations to manage the assignmentScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity. */
    @javax.annotation.Nonnull
    public AssignmentScheduleInstancesRequestBuilder assignmentScheduleInstances() {
        return new AssignmentScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity. */
    @javax.annotation.Nonnull
    public AssignmentScheduleRequestsRequestBuilder assignmentScheduleRequests() {
        return new AssignmentScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentSchedules property of the microsoft.graph.privilegedAccessGroup entity. */
    @javax.annotation.Nonnull
    public AssignmentSchedulesRequestBuilder assignmentSchedules() {
        return new AssignmentSchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the eligibilityScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity. */
    @javax.annotation.Nonnull
    public EligibilityScheduleInstancesRequestBuilder eligibilityScheduleInstances() {
        return new EligibilityScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the eligibilityScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity. */
    @javax.annotation.Nonnull
    public EligibilityScheduleRequestsRequestBuilder eligibilityScheduleRequests() {
        return new EligibilityScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the eligibilitySchedules property of the microsoft.graph.privilegedAccessGroup entity. */
    @javax.annotation.Nonnull
    public EligibilitySchedulesRequestBuilder eligibilitySchedules() {
        return new EligibilitySchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the assignmentScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder assignmentScheduleInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupAssignmentScheduleInstance%2Did", id);
        return new PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder assignmentScheduleRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupAssignmentScheduleRequest%2Did", id);
        return new PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentSchedules property of the microsoft.graph.privilegedAccessGroup entity.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessGroupAssignmentScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessGroupAssignmentScheduleItemRequestBuilder assignmentSchedules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupAssignmentSchedule%2Did", id);
        return new PrivilegedAccessGroupAssignmentScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new GroupRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identityGovernance/privilegedAccess/group{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new GroupRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identityGovernance/privilegedAccess/group{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property group for identityGovernance
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property group for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the eligibilityScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessGroupEligibilityScheduleInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessGroupEligibilityScheduleInstanceItemRequestBuilder eligibilityScheduleInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupEligibilityScheduleInstance%2Did", id);
        return new PrivilegedAccessGroupEligibilityScheduleInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the eligibilityScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessGroupEligibilityScheduleRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessGroupEligibilityScheduleRequestItemRequestBuilder eligibilityScheduleRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupEligibilityScheduleRequest%2Did", id);
        return new PrivilegedAccessGroupEligibilityScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the eligibilitySchedules property of the microsoft.graph.privilegedAccessGroup entity.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessGroupEligibilityScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessGroupEligibilityScheduleItemRequestBuilder eligibilitySchedules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupEligibilitySchedule%2Did", id);
        return new PrivilegedAccessGroupEligibilityScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get group from identityGovernance
     * @return a CompletableFuture of privilegedAccessGroup
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccessGroup::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccessGroup>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get group from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of privilegedAccessGroup
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccessGroup::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccessGroup>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of privilegedAccessGroup
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> patch(@javax.annotation.Nonnull final PrivilegedAccessGroup body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccessGroup::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccessGroup>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of privilegedAccessGroup
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> patch(@javax.annotation.Nonnull final PrivilegedAccessGroup body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccessGroup::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccessGroup> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccessGroup>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property group for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property group for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get group from identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get group from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final PrivilegedAccessGroup body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final PrivilegedAccessGroup body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /**
     * Get group from identityGovernance
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}

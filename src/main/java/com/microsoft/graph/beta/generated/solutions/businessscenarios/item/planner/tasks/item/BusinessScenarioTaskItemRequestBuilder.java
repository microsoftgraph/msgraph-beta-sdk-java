package com.microsoft.graph.beta.solutions.businessscenarios.item.planner.tasks.item;

import com.microsoft.graph.beta.models.BusinessScenarioTask;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.solutions.businessscenarios.item.planner.tasks.item.assignedtotaskboardformat.AssignedToTaskBoardFormatRequestBuilder;
import com.microsoft.graph.beta.solutions.businessscenarios.item.planner.tasks.item.buckettaskboardformat.BucketTaskBoardFormatRequestBuilder;
import com.microsoft.graph.beta.solutions.businessscenarios.item.planner.tasks.item.details.DetailsRequestBuilder;
import com.microsoft.graph.beta.solutions.businessscenarios.item.planner.tasks.item.progresstaskboardformat.ProgressTaskBoardFormatRequestBuilder;
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
 * Provides operations to manage the tasks property of the microsoft.graph.businessScenarioPlanner entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessScenarioTaskItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the assignedToTaskBoardFormat property of the microsoft.graph.plannerTask entity.
     * @return a {@link AssignedToTaskBoardFormatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignedToTaskBoardFormatRequestBuilder assignedToTaskBoardFormat() {
        return new AssignedToTaskBoardFormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bucketTaskBoardFormat property of the microsoft.graph.plannerTask entity.
     * @return a {@link BucketTaskBoardFormatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BucketTaskBoardFormatRequestBuilder bucketTaskBoardFormat() {
        return new BucketTaskBoardFormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the details property of the microsoft.graph.plannerTask entity.
     * @return a {@link DetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DetailsRequestBuilder details() {
        return new DetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the progressTaskBoardFormat property of the microsoft.graph.plannerTask entity.
     * @return a {@link ProgressTaskBoardFormatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProgressTaskBoardFormatRequestBuilder progressTaskBoardFormat() {
        return new ProgressTaskBoardFormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BusinessScenarioTaskItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BusinessScenarioTaskItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/businessScenarios/{businessScenario%2Did}/planner/tasks/{businessScenarioTask%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link BusinessScenarioTaskItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BusinessScenarioTaskItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/businessScenarios/{businessScenario%2Did}/planner/tasks/{businessScenarioTask%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a businessScenarioTask object.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/businessscenarioplanner-delete-tasks?view=graph-rest-beta">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a businessScenarioTask object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/businessscenarioplanner-delete-tasks?view=graph-rest-beta">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a businessScenarioTask object.
     * @return a {@link BusinessScenarioTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/businessscenariotask-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioTask get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a businessScenarioTask object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BusinessScenarioTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/businessscenariotask-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioTask get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BusinessScenarioTask::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a businessScenarioTask object.
     * @param body The request body
     * @return a {@link BusinessScenarioTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/businessscenariotask-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioTask patch(@jakarta.annotation.Nonnull final BusinessScenarioTask body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a businessScenarioTask object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BusinessScenarioTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/businessscenariotask-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioTask patch(@jakarta.annotation.Nonnull final BusinessScenarioTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BusinessScenarioTask::createFromDiscriminatorValue);
    }
    /**
     * Delete a businessScenarioTask object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a businessScenarioTask object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a businessScenarioTask object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a businessScenarioTask object.
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
     * Update the properties of a businessScenarioTask object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BusinessScenarioTask body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a businessScenarioTask object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BusinessScenarioTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BusinessScenarioTaskItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BusinessScenarioTaskItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BusinessScenarioTaskItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a businessScenarioTask object.
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

package com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.OutlookTask;
import com.microsoft.graph.beta.models.OutlookTaskCollectionResponse;
import com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks.count.CountRequestBuilder;
import com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks.item.OutlookTaskItemRequestBuilder;
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
 * Provides operations to manage the tasks property of the microsoft.graph.outlookTaskFolder entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TasksRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tasks property of the microsoft.graph.outlookTaskFolder entity.
     * @param outlookTaskId The unique identifier of outlookTask
     * @return a OutlookTaskItemRequestBuilder
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public OutlookTaskItemRequestBuilder byOutlookTaskId(@jakarta.annotation.Nonnull final String outlookTaskId) {
        Objects.requireNonNull(outlookTaskId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("outlookTask%2Did", outlookTaskId);
        return new OutlookTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TasksRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TasksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/taskGroups/{outlookTaskGroup%2Did}/taskFolders/{outlookTaskFolder%2Did}/tasks{?%24top,%24skip,%24filter,%24count,%24orderby,%24select}", pathParameters);
    }
    /**
     * Instantiates a new TasksRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TasksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/taskGroups/{outlookTaskGroup%2Did}/taskFolders/{outlookTaskFolder%2Did}/tasks{?%24top,%24skip,%24filter,%24count,%24orderby,%24select}", rawUrl);
    }
    /**
     * Get all the Outlook tasks in the specified folder. By default, this operation (and the POST, PATCH, and complete task operations) returnsdate-related properties in UTC.  You can use a Prefer: outlook.timezone request header to have all the date-related properties in the response represented in a time zonedifferent than UTC. See an example for getting a single task. You can apply the header similarly to get multiple tasks. If there is more than one task group, and you want to get all the tasks in a specific task group, firstget all the task folders in that task group,and then get the tasks in each of these task folders.
     * @return a OutlookTaskCollectionResponse
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     * @see <a href="https://learn.microsoft.com/graph/api/outlooktaskfolder-list-tasks?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTaskCollectionResponse get() {
        return get(null);
    }
    /**
     * Get all the Outlook tasks in the specified folder. By default, this operation (and the POST, PATCH, and complete task operations) returnsdate-related properties in UTC.  You can use a Prefer: outlook.timezone request header to have all the date-related properties in the response represented in a time zonedifferent than UTC. See an example for getting a single task. You can apply the header similarly to get multiple tasks. If there is more than one task group, and you want to get all the tasks in a specific task group, firstget all the task folders in that task group,and then get the tasks in each of these task folders.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OutlookTaskCollectionResponse
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     * @see <a href="https://learn.microsoft.com/graph/api/outlooktaskfolder-list-tasks?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTaskCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutlookTaskCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create an Outlook task in the specified task folder. The POST method always ignores the time portion of startDateTime and dueDateTime in the request body, and assumes the time to be always midnight in the specified time zone.
     * @param body The request body
     * @return a OutlookTask
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     * @see <a href="https://learn.microsoft.com/graph/api/outlooktaskfolder-post-tasks?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTask post(@jakarta.annotation.Nonnull final OutlookTask body) {
        return post(body, null);
    }
    /**
     * Create an Outlook task in the specified task folder. The POST method always ignores the time portion of startDateTime and dueDateTime in the request body, and assumes the time to be always midnight in the specified time zone.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OutlookTask
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     * @see <a href="https://learn.microsoft.com/graph/api/outlooktaskfolder-post-tasks?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTask post(@jakarta.annotation.Nonnull final OutlookTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutlookTask::createFromDiscriminatorValue);
    }
    /**
     * Get all the Outlook tasks in the specified folder. By default, this operation (and the POST, PATCH, and complete task operations) returnsdate-related properties in UTC.  You can use a Prefer: outlook.timezone request header to have all the date-related properties in the response represented in a time zonedifferent than UTC. See an example for getting a single task. You can apply the header similarly to get multiple tasks. If there is more than one task group, and you want to get all the tasks in a specific task group, firstget all the task folders in that task group,and then get the tasks in each of these task folders.
     * @return a RequestInformation
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get all the Outlook tasks in the specified folder. By default, this operation (and the POST, PATCH, and complete task operations) returnsdate-related properties in UTC.  You can use a Prefer: outlook.timezone request header to have all the date-related properties in the response represented in a time zonedifferent than UTC. See an example for getting a single task. You can apply the header similarly to get multiple tasks. If there is more than one task group, and you want to get all the tasks in a specific task group, firstget all the task folders in that task group,and then get the tasks in each of these task folders.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
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
     * Create an Outlook task in the specified task folder. The POST method always ignores the time portion of startDateTime and dueDateTime in the request body, and assumes the time to be always midnight in the specified time zone.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OutlookTask body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an Outlook task in the specified task folder. The POST method always ignores the time portion of startDateTime and dueDateTime in the request body, and assumes the time to be always midnight in the specified time zone.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OutlookTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TasksRequestBuilder
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public TasksRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TasksRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get all the Outlook tasks in the specified folder. By default, this operation (and the POST, PATCH, and complete task operations) returnsdate-related properties in UTC.  You can use a Prefer: outlook.timezone request header to have all the date-related properties in the response represented in a time zonedifferent than UTC. See an example for getting a single task. You can apply the header similarly to get multiple tasks. If there is more than one task group, and you want to get all the tasks in a specific task group, firstget all the task folders in that task group,and then get the tasks in each of these task folders.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
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
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

package com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.OutlookTask;
import com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks.item.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks.item.complete.CompleteRequestBuilder;
import com.microsoft.graph.beta.users.item.outlook.taskgroups.item.taskfolders.item.tasks.item.permanentdelete.PermanentDeleteRequestBuilder;
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
public class OutlookTaskItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.outlookTask entity.
     * @return a {@link AttachmentsRequestBuilder}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the complete method.
     * @return a {@link CompleteRequestBuilder}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CompleteRequestBuilder complete() {
        return new CompleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permanentDelete method.
     * @return a {@link PermanentDeleteRequestBuilder}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public PermanentDeleteRequestBuilder permanentDelete() {
        return new PermanentDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OutlookTaskItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutlookTaskItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/taskGroups/{outlookTaskGroup%2Did}/taskFolders/{outlookTaskFolder%2Did}/tasks/{outlookTask%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link OutlookTaskItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutlookTaskItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/taskGroups/{outlookTaskGroup%2Did}/taskFolders/{outlookTaskFolder%2Did}/tasks/{outlookTask%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property tasks for users
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property tasks for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The tasks in this task folder. Read-only. Nullable.
     * @return a {@link OutlookTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTask get() {
        return get(null);
    }
    /**
     * The tasks in this task folder. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OutlookTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTask get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutlookTask::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property tasks in users
     * @param body The request body
     * @return a {@link OutlookTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTask patch(@jakarta.annotation.Nonnull final OutlookTask body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property tasks in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OutlookTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OutlookTask patch(@jakarta.annotation.Nonnull final OutlookTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutlookTask::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property tasks for users
     * @return a {@link RequestInformation}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property tasks for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * The tasks in this task folder. Read-only. Nullable.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The tasks in this task folder. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * Update the navigation property tasks in users
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OutlookTask body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property tasks in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OutlookTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link OutlookTaskItemRequestBuilder}
     * @deprecated
     * The Outlook tasks API is deprecated and will stop returning data on February 20, 2023. Please use the new To Do API. For more details, please visit https://developer.microsoft.com/en-us/office/blogs/announcing-the-general-availability-of-microsoft-to-do-apis-on-graph/ as of 2020-08/Outlook_Tasks on 2021-02-20 and will be removed 2023-02-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public OutlookTaskItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OutlookTaskItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The tasks in this task folder. Read-only. Nullable.
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

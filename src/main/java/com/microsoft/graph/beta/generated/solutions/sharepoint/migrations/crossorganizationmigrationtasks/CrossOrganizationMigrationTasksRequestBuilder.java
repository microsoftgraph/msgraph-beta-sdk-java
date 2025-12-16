package com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.SharePointMigrationTask;
import com.microsoft.graph.beta.models.SharePointMigrationTaskCollectionResponse;
import com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks.count.CountRequestBuilder;
import com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks.getbysourcegroupmailnicknamewithsourcegroupmailnickname.GetBySourceGroupMailNicknameWithSourceGroupMailNicknameRequestBuilder;
import com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks.getbysourcesiteurlwithsourcesiteurl.GetBySourceSiteUrlWithSourceSiteUrlRequestBuilder;
import com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks.getbysourceuserprincipalnamewithsourceprincipalname.GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder;
import com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks.item.SharePointMigrationTaskItemRequestBuilder;
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
 * Provides operations to manage the crossOrganizationMigrationTasks property of the microsoft.graph.sharePointMigrationsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossOrganizationMigrationTasksRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the crossOrganizationMigrationTasks property of the microsoft.graph.sharePointMigrationsRoot entity.
     * @param sharePointMigrationTaskId The unique identifier of sharePointMigrationTask
     * @return a {@link SharePointMigrationTaskItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharePointMigrationTaskItemRequestBuilder bySharePointMigrationTaskId(@jakarta.annotation.Nonnull final String sharePointMigrationTaskId) {
        Objects.requireNonNull(sharePointMigrationTaskId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharePointMigrationTask%2Did", sharePointMigrationTaskId);
        return new SharePointMigrationTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CrossOrganizationMigrationTasksRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CrossOrganizationMigrationTasksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/sharePoint/migrations/crossOrganizationMigrationTasks{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link CrossOrganizationMigrationTasksRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CrossOrganizationMigrationTasksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/sharePoint/migrations/crossOrganizationMigrationTasks{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a sharePointMigrationTask that was previously created, using the task ID. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     * @return a {@link SharePointMigrationTaskCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTaskCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a sharePointMigrationTask that was previously created, using the task ID. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SharePointMigrationTaskCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTaskCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SharePointMigrationTaskCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getBySourceGroupMailNickname method.
     * @param sourceGroupMailNickname Usage: sourceGroupMailNickname=&apos;{sourceGroupMailNickname}&apos;
     * @return a {@link GetBySourceGroupMailNicknameWithSourceGroupMailNicknameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBySourceGroupMailNicknameWithSourceGroupMailNicknameRequestBuilder getBySourceGroupMailNicknameWithSourceGroupMailNickname(@jakarta.annotation.Nonnull final String sourceGroupMailNickname) {
        Objects.requireNonNull(sourceGroupMailNickname);
        return new GetBySourceGroupMailNicknameWithSourceGroupMailNicknameRequestBuilder(pathParameters, requestAdapter, sourceGroupMailNickname);
    }
    /**
     * Provides operations to call the getBySourceSiteUrl method.
     * @param sourceSiteUrl Usage: sourceSiteUrl=&apos;{sourceSiteUrl}&apos;
     * @return a {@link GetBySourceSiteUrlWithSourceSiteUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBySourceSiteUrlWithSourceSiteUrlRequestBuilder getBySourceSiteUrlWithSourceSiteUrl(@jakarta.annotation.Nonnull final String sourceSiteUrl) {
        Objects.requireNonNull(sourceSiteUrl);
        return new GetBySourceSiteUrlWithSourceSiteUrlRequestBuilder(pathParameters, requestAdapter, sourceSiteUrl);
    }
    /**
     * Provides operations to call the getBySourceUserPrincipalName method.
     * @param sourcePrincipalName Usage: sourcePrincipalName=&apos;{sourcePrincipalName}&apos;
     * @return a {@link GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder getBySourceUserPrincipalNameWithSourcePrincipalName(@jakarta.annotation.Nonnull final String sourcePrincipalName) {
        Objects.requireNonNull(sourcePrincipalName);
        return new GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder(pathParameters, requestAdapter, sourcePrincipalName);
    }
    /**
     * Create or update a sharePointMigrationTask to migrate a resource from the source organization to the target organization, using the sharePointMigrationTaskParameters. The resource can be a user, a group, or a site. When an existing sharePointMigrationTask is retrieved, it might contain not only the specifics of the source and target organizations and resources, but also the status of the migration and errors encountered during the migration operation. The API calls occur on the source site and only add list items to the my site root web, for example, contoso-my.sharepoint.com. Then, it triggers a multi-geo site move job in the backend to enqueue and orchestrate several tenant workflow jobs, such as backup, restore, and cleanup, supported by TJ infrastructure. The OData type of sharePointResourceMigrationParameters differentiates user migration from site migration, rather than using different subpaths. For a user&apos;s OneDrive migration, specify sharePointUserMigrationParameters. If this migration task is a regular SharePoint site migration, specify sharePointSiteMigrationParameters. If this migration task is a group-connected site migration, specify sharePointGroupMigrationParameters.
     * @param body The request body
     * @return a {@link SharePointMigrationTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sharepointmigrationtask-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTask post(@jakarta.annotation.Nonnull final SharePointMigrationTask body) {
        return post(body, null);
    }
    /**
     * Create or update a sharePointMigrationTask to migrate a resource from the source organization to the target organization, using the sharePointMigrationTaskParameters. The resource can be a user, a group, or a site. When an existing sharePointMigrationTask is retrieved, it might contain not only the specifics of the source and target organizations and resources, but also the status of the migration and errors encountered during the migration operation. The API calls occur on the source site and only add list items to the my site root web, for example, contoso-my.sharepoint.com. Then, it triggers a multi-geo site move job in the backend to enqueue and orchestrate several tenant workflow jobs, such as backup, restore, and cleanup, supported by TJ infrastructure. The OData type of sharePointResourceMigrationParameters differentiates user migration from site migration, rather than using different subpaths. For a user&apos;s OneDrive migration, specify sharePointUserMigrationParameters. If this migration task is a regular SharePoint site migration, specify sharePointSiteMigrationParameters. If this migration task is a group-connected site migration, specify sharePointGroupMigrationParameters.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SharePointMigrationTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sharepointmigrationtask-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTask post(@jakarta.annotation.Nonnull final SharePointMigrationTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SharePointMigrationTask::createFromDiscriminatorValue);
    }
    /**
     * Get a sharePointMigrationTask that was previously created, using the task ID. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a sharePointMigrationTask that was previously created, using the task ID. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
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
     * Create or update a sharePointMigrationTask to migrate a resource from the source organization to the target organization, using the sharePointMigrationTaskParameters. The resource can be a user, a group, or a site. When an existing sharePointMigrationTask is retrieved, it might contain not only the specifics of the source and target organizations and resources, but also the status of the migration and errors encountered during the migration operation. The API calls occur on the source site and only add list items to the my site root web, for example, contoso-my.sharepoint.com. Then, it triggers a multi-geo site move job in the backend to enqueue and orchestrate several tenant workflow jobs, such as backup, restore, and cleanup, supported by TJ infrastructure. The OData type of sharePointResourceMigrationParameters differentiates user migration from site migration, rather than using different subpaths. For a user&apos;s OneDrive migration, specify sharePointUserMigrationParameters. If this migration task is a regular SharePoint site migration, specify sharePointSiteMigrationParameters. If this migration task is a group-connected site migration, specify sharePointGroupMigrationParameters.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SharePointMigrationTask body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create or update a sharePointMigrationTask to migrate a resource from the source organization to the target organization, using the sharePointMigrationTaskParameters. The resource can be a user, a group, or a site. When an existing sharePointMigrationTask is retrieved, it might contain not only the specifics of the source and target organizations and resources, but also the status of the migration and errors encountered during the migration operation. The API calls occur on the source site and only add list items to the my site root web, for example, contoso-my.sharepoint.com. Then, it triggers a multi-geo site move job in the backend to enqueue and orchestrate several tenant workflow jobs, such as backup, restore, and cleanup, supported by TJ infrastructure. The OData type of sharePointResourceMigrationParameters differentiates user migration from site migration, rather than using different subpaths. For a user&apos;s OneDrive migration, specify sharePointUserMigrationParameters. If this migration task is a regular SharePoint site migration, specify sharePointSiteMigrationParameters. If this migration task is a group-connected site migration, specify sharePointGroupMigrationParameters.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SharePointMigrationTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CrossOrganizationMigrationTasksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CrossOrganizationMigrationTasksRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CrossOrganizationMigrationTasksRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a sharePointMigrationTask that was previously created, using the task ID. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
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
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
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
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
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

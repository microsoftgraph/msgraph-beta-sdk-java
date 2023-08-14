package com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.allchannels.AllChannelsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.archive.ArchiveRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.channels.ChannelsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.clone.CloneRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.completemigration.CompleteMigrationRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.group.GroupRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.incomingchannels.IncomingChannelsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.installedapps.InstalledAppsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.members.MembersRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.operations.OperationsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.owners.OwnersRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.photo.PhotoRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.primarychannel.PrimaryChannelRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.schedule.ScheduleRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.sendactivitynotification.SendActivityNotificationRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.tags.TagsRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.template.TemplateRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.templatedefinition.TemplateDefinitionRequestBuilder;
import com.microsoft.graph.teamwork.teamtemplates.item.definitions.item.teamdefinition.unarchive.UnarchiveRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the teamDefinition property of the microsoft.graph.teamTemplateDefinition entity.
 */
public class TeamDefinitionRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the allChannels property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public AllChannelsRequestBuilder allChannels() {
        return new AllChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the archive method.
     */
    @javax.annotation.Nonnull
    public ArchiveRequestBuilder archive() {
        return new ArchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the channels property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public ChannelsRequestBuilder channels() {
        return new ChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clone method.
     */
    @javax.annotation.Nonnull
    public CloneRequestBuilder clone() {
        return new CloneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the completeMigration method.
     */
    @javax.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the group property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the incomingChannels property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public IncomingChannelsRequestBuilder incomingChannels() {
        return new IncomingChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the installedApps property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public InstalledAppsRequestBuilder installedApps() {
        return new InstalledAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the primaryChannel property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public PrimaryChannelRequestBuilder primaryChannel() {
        return new PrimaryChannelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the schedule property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendActivityNotification method.
     */
    @javax.annotation.Nonnull
    public SendActivityNotificationRequestBuilder sendActivityNotification() {
        return new SendActivityNotificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tags property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the template property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public TemplateRequestBuilder template() {
        return new TemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templateDefinition property of the microsoft.graph.team entity.
     */
    @javax.annotation.Nonnull
    public TemplateDefinitionRequestBuilder templateDefinition() {
        return new TemplateDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unarchive method.
     */
    @javax.annotation.Nonnull
    public UnarchiveRequestBuilder unarchive() {
        return new UnarchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TeamDefinitionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamDefinitionRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/teamTemplates/{teamTemplate%2Did}/definitions/{teamTemplateDefinition%2Did}/teamDefinition{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TeamDefinitionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamDefinitionRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/teamTemplates/{teamTemplate%2Did}/definitions/{teamTemplateDefinition%2Did}/teamDefinition{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property teamDefinition for teamwork
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
     * Delete navigation property teamDefinition for teamwork
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
     * Get the properties of the team associated with a teamTemplateDefinition object.
     * @return a CompletableFuture of team
     * @see <a href="https://learn.microsoft.com/graph/api/teamtemplatedefinition-get-teamdefinition?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the properties of the team associated with a teamTemplateDefinition object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of team
     * @see <a href="https://learn.microsoft.com/graph/api/teamtemplatedefinition-get-teamdefinition?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property teamDefinition in teamwork
     * @param body The request body
     * @return a CompletableFuture of team
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> patch(@javax.annotation.Nonnull final Team body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property teamDefinition in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of team
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> patch(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property teamDefinition for teamwork
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property teamDefinition for teamwork
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
     * Get the properties of the team associated with a teamTemplateDefinition object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties of the team associated with a teamTemplateDefinition object.
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
     * Update the navigation property teamDefinition in teamwork
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Team body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property teamDefinition in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties of the team associated with a teamTemplateDefinition object.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

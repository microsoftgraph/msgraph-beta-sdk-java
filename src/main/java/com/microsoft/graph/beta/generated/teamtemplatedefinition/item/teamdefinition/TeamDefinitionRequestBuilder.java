package com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Team;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.allchannels.AllChannelsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.archive.ArchiveRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.channels.ChannelsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.clone.CloneRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.completemigration.CompleteMigrationRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.group.GroupRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.incomingchannels.IncomingChannelsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.installedapps.InstalledAppsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.members.MembersRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.operations.OperationsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.owners.OwnersRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.ownerswithuserprincipalname.OwnersWithUserPrincipalNameRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.photo.PhotoRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.primarychannel.PrimaryChannelRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.schedule.ScheduleRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.sendactivitynotification.SendActivityNotificationRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.tags.TagsRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.template.TemplateRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.templatedefinition.TemplateDefinitionRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.item.teamdefinition.unarchive.UnarchiveRequestBuilder;
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
 * Provides operations to manage the teamDefinition property of the microsoft.graph.teamTemplateDefinition entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamDefinitionRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the allChannels property of the microsoft.graph.team entity.
     * @return a {@link AllChannelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllChannelsRequestBuilder allChannels() {
        return new AllChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the archive method.
     * @return a {@link ArchiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ArchiveRequestBuilder archive() {
        return new ArchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the channels property of the microsoft.graph.team entity.
     * @return a {@link ChannelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChannelsRequestBuilder channels() {
        return new ChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clone method.
     * @return a {@link CloneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloneRequestBuilder clone() {
        return new CloneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the completeMigration method.
     * @return a {@link CompleteMigrationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the group property of the microsoft.graph.team entity.
     * @return a {@link GroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the incomingChannels property of the microsoft.graph.team entity.
     * @return a {@link IncomingChannelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IncomingChannelsRequestBuilder incomingChannels() {
        return new IncomingChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the installedApps property of the microsoft.graph.team entity.
     * @return a {@link InstalledAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InstalledAppsRequestBuilder installedApps() {
        return new InstalledAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.team entity.
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.team entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.team entity.
     * @return a {@link OwnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.team entity.
     * @return a {@link PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.team entity.
     * @return a {@link PhotoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the primaryChannel property of the microsoft.graph.team entity.
     * @return a {@link PrimaryChannelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrimaryChannelRequestBuilder primaryChannel() {
        return new PrimaryChannelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the schedule property of the microsoft.graph.team entity.
     * @return a {@link ScheduleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendActivityNotification method.
     * @return a {@link SendActivityNotificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendActivityNotificationRequestBuilder sendActivityNotification() {
        return new SendActivityNotificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tags property of the microsoft.graph.team entity.
     * @return a {@link TagsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the template property of the microsoft.graph.team entity.
     * @return a {@link TemplateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemplateRequestBuilder template() {
        return new TemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templateDefinition property of the microsoft.graph.team entity.
     * @return a {@link TemplateDefinitionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemplateDefinitionRequestBuilder templateDefinition() {
        return new TemplateDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unarchive method.
     * @return a {@link UnarchiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnarchiveRequestBuilder unarchive() {
        return new UnarchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TeamDefinitionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamDefinitionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamTemplateDefinition/{teamTemplateDefinition%2Did}/teamDefinition{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link TeamDefinitionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamDefinitionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamTemplateDefinition/{teamTemplateDefinition%2Did}/teamDefinition{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property teamDefinition for teamTemplateDefinition
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property teamDefinition for teamTemplateDefinition
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
     * @return a {@link Team}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Team get() {
        return get(null);
    }
    /**
     * Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Team}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Team get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Team::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.team entity.
     * @param userPrincipalName Alternate key of user
     * @return a {@link OwnersWithUserPrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersWithUserPrincipalNameRequestBuilder ownersWithUserPrincipalName(@jakarta.annotation.Nonnull final String userPrincipalName) {
        Objects.requireNonNull(userPrincipalName);
        return new OwnersWithUserPrincipalNameRequestBuilder(pathParameters, requestAdapter, userPrincipalName);
    }
    /**
     * Update the navigation property teamDefinition in teamTemplateDefinition
     * @param body The request body
     * @return a {@link Team}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Team patch(@jakarta.annotation.Nonnull final Team body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property teamDefinition in teamTemplateDefinition
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Team}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Team patch(@jakarta.annotation.Nonnull final Team body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Team::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property teamDefinition for teamTemplateDefinition
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property teamDefinition for teamTemplateDefinition
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
     * Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
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
     * Update the navigation property teamDefinition in teamTemplateDefinition
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Team body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property teamDefinition in teamTemplateDefinition
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Team body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link TeamDefinitionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamDefinitionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TeamDefinitionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Collection of channel objects. A channel represents a topic, and therefore a logical isolation of discussion, within a team.
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

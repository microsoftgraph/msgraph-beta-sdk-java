package com.microsoft.graph.beta.teams;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Team;
import com.microsoft.graph.beta.models.TeamCollectionResponse;
import com.microsoft.graph.beta.teams.allmessages.AllMessagesRequestBuilder;
import com.microsoft.graph.beta.teams.count.CountRequestBuilder;
import com.microsoft.graph.beta.teams.getallmessages.GetAllMessagesRequestBuilder;
import com.microsoft.graph.beta.teams.getopenshifts.GetOpenShiftsRequestBuilder;
import com.microsoft.graph.beta.teams.getshifts.GetShiftsRequestBuilder;
import com.microsoft.graph.beta.teams.gettimesoff.GetTimesOffRequestBuilder;
import com.microsoft.graph.beta.teams.item.TeamItemRequestBuilder;
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
 * Provides operations to manage the collection of team entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the allMessages method.
     * @return a {@link AllMessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllMessagesRequestBuilder allMessages() {
        return new AllMessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllMessages method.
     * @return a {@link GetAllMessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAllMessagesRequestBuilder getAllMessages() {
        return new GetAllMessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOpenShifts method.
     * @return a {@link GetOpenShiftsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOpenShiftsRequestBuilder getOpenShifts() {
        return new GetOpenShiftsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getShifts method.
     * @return a {@link GetShiftsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShiftsRequestBuilder getShifts() {
        return new GetShiftsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getTimesOff method.
     * @return a {@link GetTimesOffRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTimesOffRequestBuilder getTimesOff() {
        return new GetTimesOffRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of team entities.
     * @param teamId The unique identifier of team
     * @return a {@link TeamItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamItemRequestBuilder byTeamId(@jakarta.annotation.Nonnull final String teamId) {
        Objects.requireNonNull(teamId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", teamId);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link TeamsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link TeamsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * List all teams in an organization.
     * @return a {@link TeamCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/teams-list?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TeamCollectionResponse get() {
        return get(null);
    }
    /**
     * List all teams in an organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TeamCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/teams-list?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TeamCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TeamCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new team.
     * @param body The request body
     * @return a {@link Team}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-post?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Team post(@jakarta.annotation.Nonnull final Team body) {
        return post(body, null);
    }
    /**
     * Create a new team.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Team}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-post?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Team post(@jakarta.annotation.Nonnull final Team body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Team::createFromDiscriminatorValue);
    }
    /**
     * List all teams in an organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List all teams in an organization.
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
     * Create a new team.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Team body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new team.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Team body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link TeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TeamsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List all teams in an organization.
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

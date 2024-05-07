package com.microsoft.graph.beta.places.item.graphroom;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Room;
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
 * Casts the previous resource to room.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphRoomRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GraphRoomRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphRoomRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places/{place%2Did}/graph.room{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GraphRoomRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphRoomRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places/{place%2Did}/graph.room{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get a collection of the specified type of place objects defined in the tenant.  You can do the following for a given tenant:- List all the rooms.- List all the workspaces.- List all the room lists.- List rooms in a specific room list.- List workspaces in a specific room list. A place object can be one of the following types: The room, workspace and roomList resources are derived from the place object. By default, this operation returns up to 100 places per page.  Compared with the findRooms and findRoomLists functions, this operation returns a richer payload for rooms and room lists. For details about how they compare, see Using the places API.
     * @return a {@link Room}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/place-list?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Room get() {
        return get(null);
    }
    /**
     * Get a collection of the specified type of place objects defined in the tenant.  You can do the following for a given tenant:- List all the rooms.- List all the workspaces.- List all the room lists.- List rooms in a specific room list.- List workspaces in a specific room list. A place object can be one of the following types: The room, workspace and roomList resources are derived from the place object. By default, this operation returns up to 100 places per page.  Compared with the findRooms and findRoomLists functions, this operation returns a richer payload for rooms and room lists. For details about how they compare, see Using the places API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Room}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/place-list?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Room get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Room::createFromDiscriminatorValue);
    }
    /**
     * Get a collection of the specified type of place objects defined in the tenant.  You can do the following for a given tenant:- List all the rooms.- List all the workspaces.- List all the room lists.- List rooms in a specific room list.- List workspaces in a specific room list. A place object can be one of the following types: The room, workspace and roomList resources are derived from the place object. By default, this operation returns up to 100 places per page.  Compared with the findRooms and findRoomLists functions, this operation returns a richer payload for rooms and room lists. For details about how they compare, see Using the places API.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a collection of the specified type of place objects defined in the tenant.  You can do the following for a given tenant:- List all the rooms.- List all the workspaces.- List all the room lists.- List rooms in a specific room list.- List workspaces in a specific room list. A place object can be one of the following types: The room, workspace and roomList resources are derived from the place object. By default, this operation returns up to 100 places per page.  Compared with the findRooms and findRoomLists functions, this operation returns a richer payload for rooms and room lists. For details about how they compare, see Using the places API.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GraphRoomRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphRoomRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphRoomRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a collection of the specified type of place objects defined in the tenant.  You can do the following for a given tenant:- List all the rooms.- List all the workspaces.- List all the room lists.- List rooms in a specific room list.- List workspaces in a specific room list. A place object can be one of the following types: The room, workspace and roomList resources are derived from the place object. By default, this operation returns up to 100 places per page.  Compared with the findRooms and findRoomLists functions, this operation returns a richer payload for rooms and room lists. For details about how they compare, see Using the places API.
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
}

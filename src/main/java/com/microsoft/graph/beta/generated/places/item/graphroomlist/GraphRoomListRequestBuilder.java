package com.microsoft.graph.beta.places.item.graphroomlist;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.RoomList;
import com.microsoft.graph.beta.places.item.graphroomlist.rooms.RoomsRequestBuilder;
import com.microsoft.graph.beta.places.item.graphroomlist.roomswithplaceid.RoomsWithPlaceIdRequestBuilder;
import com.microsoft.graph.beta.places.item.graphroomlist.workspaces.WorkspacesRequestBuilder;
import com.microsoft.graph.beta.places.item.graphroomlist.workspaceswithplaceid.WorkspacesWithPlaceIdRequestBuilder;
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
 * Casts the previous resource to roomList.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphRoomListRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the rooms property of the microsoft.graph.roomList entity.
     * @return a {@link RoomsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoomsRequestBuilder rooms() {
        return new RoomsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workspaces property of the microsoft.graph.roomList entity.
     * @return a {@link WorkspacesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkspacesRequestBuilder workspaces() {
        return new WorkspacesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GraphRoomListRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphRoomListRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places/{place%2Did}/graph.roomList{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GraphRoomListRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphRoomListRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places/{place%2Did}/graph.roomList{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get the item of type microsoft.graph.place as microsoft.graph.roomList
     * @return a {@link RoomList}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RoomList get() {
        return get(null);
    }
    /**
     * Get the item of type microsoft.graph.place as microsoft.graph.roomList
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RoomList}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RoomList get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RoomList::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the rooms property of the microsoft.graph.roomList entity.
     * @param placeId Alternate key of room
     * @return a {@link RoomsWithPlaceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoomsWithPlaceIdRequestBuilder roomsWithPlaceId(@jakarta.annotation.Nonnull final String placeId) {
        Objects.requireNonNull(placeId);
        return new RoomsWithPlaceIdRequestBuilder(pathParameters, requestAdapter, placeId);
    }
    /**
     * Get the item of type microsoft.graph.place as microsoft.graph.roomList
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.place as microsoft.graph.roomList
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
     * @return a {@link GraphRoomListRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphRoomListRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphRoomListRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Provides operations to manage the workspaces property of the microsoft.graph.roomList entity.
     * @param placeId Alternate key of workspace
     * @return a {@link WorkspacesWithPlaceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkspacesWithPlaceIdRequestBuilder workspacesWithPlaceId(@jakarta.annotation.Nonnull final String placeId) {
        Objects.requireNonNull(placeId);
        return new WorkspacesWithPlaceIdRequestBuilder(pathParameters, requestAdapter, placeId);
    }
    /**
     * Get the item of type microsoft.graph.place as microsoft.graph.roomList
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

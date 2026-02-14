package com.microsoft.graph.beta.admin.cloudlicensing.allotments.item.waitingmembers;

import com.microsoft.graph.beta.admin.cloudlicensing.allotments.item.waitingmembers.count.CountRequestBuilder;
import com.microsoft.graph.beta.admin.cloudlicensing.allotments.item.waitingmembers.item.WaitingMemberItemRequestBuilder;
import com.microsoft.graph.beta.models.cloudlicensing.WaitingMemberCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the waitingMembers property of the microsoft.graph.cloudLicensing.allotment entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WaitingMembersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the waitingMembers property of the microsoft.graph.cloudLicensing.allotment entity.
     * @param waitingMemberId The unique identifier of waitingMember
     * @return a {@link WaitingMemberItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WaitingMemberItemRequestBuilder byWaitingMemberId(@jakarta.annotation.Nonnull final String waitingMemberId) {
        Objects.requireNonNull(waitingMemberId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("waitingMember%2Did", waitingMemberId);
        return new WaitingMemberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WaitingMembersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WaitingMembersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/cloudLicensing/allotments/{allotment%2Did}/waitingMembers{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link WaitingMembersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WaitingMembersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/cloudLicensing/allotments/{allotment%2Did}/waitingMembers{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a list of over-assigned users who are in the waiting room due to license capacity limits. Use /admin/cloudLicensing/allotments/{allotmentId}/waitingMembers to retrieve all waitingMember objects for a specific allotment. Use /users/{userId}/cloudLicensing/waitingMembers to retrieve all allotments that a specific user is waiting for.
     * @return a {@link WaitingMemberCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudlicensing-allotment-list-waitingmembers?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WaitingMemberCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of over-assigned users who are in the waiting room due to license capacity limits. Use /admin/cloudLicensing/allotments/{allotmentId}/waitingMembers to retrieve all waitingMember objects for a specific allotment. Use /users/{userId}/cloudLicensing/waitingMembers to retrieve all allotments that a specific user is waiting for.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WaitingMemberCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudlicensing-allotment-list-waitingmembers?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WaitingMemberCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WaitingMemberCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Get a list of over-assigned users who are in the waiting room due to license capacity limits. Use /admin/cloudLicensing/allotments/{allotmentId}/waitingMembers to retrieve all waitingMember objects for a specific allotment. Use /users/{userId}/cloudLicensing/waitingMembers to retrieve all allotments that a specific user is waiting for.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of over-assigned users who are in the waiting room due to license capacity limits. Use /admin/cloudLicensing/allotments/{allotmentId}/waitingMembers to retrieve all waitingMember objects for a specific allotment. Use /users/{userId}/cloudLicensing/waitingMembers to retrieve all allotments that a specific user is waiting for.
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
     * @return a {@link WaitingMembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WaitingMembersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WaitingMembersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of over-assigned users who are in the waiting room due to license capacity limits. Use /admin/cloudLicensing/allotments/{allotmentId}/waitingMembers to retrieve all waitingMember objects for a specific allotment. Use /users/{userId}/cloudLicensing/waitingMembers to retrieve all allotments that a specific user is waiting for.
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
}

package com.microsoft.graph.beta.admin.windows.updates.products.item.microsoftgraphwindowsupdatesgetknownissuesbytimerangewithdaysinpastwithincludeallactive;

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
 * Provides operations to call the getKnownIssuesByTimeRange method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder} and sets the default values.
     * @param daysInPast Usage: daysInPast={daysInPast}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final Integer daysInPast) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/products/{product%2Did}/microsoft.graph.windowsUpdates.getKnownIssuesByTimeRange(daysInPast={daysInPast},includeAllActive=@includeAllActive){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top,includeAllActive*}", pathParameters);
        this.pathParameters.put("daysInPast", daysInPast);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/products/{product%2Did}/microsoft.graph.windowsUpdates.getKnownIssuesByTimeRange(daysInPast={daysInPast},includeAllActive=@includeAllActive){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top,includeAllActive*}", rawUrl);
    }
    /**
     * Get known issues related to a particular product based on a specified timeframe in the past.
     * @return a {@link GetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-product-getknownissuesbytimerange?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveGetResponse get() {
        return get(null);
    }
    /**
     * Get known issues related to a particular product based on a specified timeframe in the past.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-product-getknownissuesbytimerange?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get known issues related to a particular product based on a specified timeframe in the past.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get known issues related to a particular product based on a specified timeframe in the past.
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
     * @return a {@link MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphWindowsUpdatesGetKnownIssuesByTimeRangeWithDaysInPastWithIncludeAllActiveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get known issues related to a particular product based on a specified timeframe in the past.
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
         * Usage: includeAllActive=@includeAllActive
         */
        @jakarta.annotation.Nullable
        public Boolean includeAllActive;
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
            allQueryParams.put("includeAllActive", includeAllActive);
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

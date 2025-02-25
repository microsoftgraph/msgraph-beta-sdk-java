package com.microsoft.graph.beta.devicemanagement.comanageddevices.item.getcloudpcremoteactionresults;

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
 * Provides operations to call the getCloudPcRemoteActionResults method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCloudPcRemoteActionResultsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCloudPcRemoteActionResultsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCloudPcRemoteActionResultsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/{managedDevice%2Did}/getCloudPcRemoteActionResults(){?%24count,%24filter,%24search,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCloudPcRemoteActionResultsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCloudPcRemoteActionResultsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/{managedDevice%2Did}/getCloudPcRemoteActionResults(){?%24count,%24filter,%24search,%24skip,%24top}", rawUrl);
    }
    /**
     * Check the Cloud PC-specified remote action results for a Cloud PC device. Cloud PC supports reprovision and resize remote actions.
     * @return a {@link GetCloudPcRemoteActionResultsGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting September 30, 2024, getCloudPcRemoteActionResults API bound to managedDevice entity will be deprecated and no longer supported. Please use retrieveCloudPcRemoteActionResults API bound to cloudpc entity instead. as of 2024-05/getCloudPcRemoteActionResults on 2024-05-08 and will be removed 2024-09-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-getcloudpcremoteactionresults?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetCloudPcRemoteActionResultsGetResponse get() {
        return get(null);
    }
    /**
     * Check the Cloud PC-specified remote action results for a Cloud PC device. Cloud PC supports reprovision and resize remote actions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetCloudPcRemoteActionResultsGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting September 30, 2024, getCloudPcRemoteActionResults API bound to managedDevice entity will be deprecated and no longer supported. Please use retrieveCloudPcRemoteActionResults API bound to cloudpc entity instead. as of 2024-05/getCloudPcRemoteActionResults on 2024-05-08 and will be removed 2024-09-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-getcloudpcremoteactionresults?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetCloudPcRemoteActionResultsGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetCloudPcRemoteActionResultsGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Check the Cloud PC-specified remote action results for a Cloud PC device. Cloud PC supports reprovision and resize remote actions.
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting September 30, 2024, getCloudPcRemoteActionResults API bound to managedDevice entity will be deprecated and no longer supported. Please use retrieveCloudPcRemoteActionResults API bound to cloudpc entity instead. as of 2024-05/getCloudPcRemoteActionResults on 2024-05-08 and will be removed 2024-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Check the Cloud PC-specified remote action results for a Cloud PC device. Cloud PC supports reprovision and resize remote actions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting September 30, 2024, getCloudPcRemoteActionResults API bound to managedDevice entity will be deprecated and no longer supported. Please use retrieveCloudPcRemoteActionResults API bound to cloudpc entity instead. as of 2024-05/getCloudPcRemoteActionResults on 2024-05-08 and will be removed 2024-09-30
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetCloudPcRemoteActionResultsRequestBuilder}
     * @deprecated
     * Starting September 30, 2024, getCloudPcRemoteActionResults API bound to managedDevice entity will be deprecated and no longer supported. Please use retrieveCloudPcRemoteActionResults API bound to cloudpc entity instead. as of 2024-05/getCloudPcRemoteActionResults on 2024-05-08 and will be removed 2024-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public GetCloudPcRemoteActionResultsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCloudPcRemoteActionResultsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Check the Cloud PC-specified remote action results for a Cloud PC device. Cloud PC supports reprovision and resize remote actions.
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
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
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

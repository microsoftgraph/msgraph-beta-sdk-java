package com.microsoft.graph.beta.devicemanagement.comanageddevices;

import com.microsoft.graph.beta.devicemanagement.comanageddevices.appdiagnosticswithupn.AppDiagnosticsWithUpnRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.bulkreprovisioncloudpc.BulkReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.bulkrestorecloudpc.BulkRestoreCloudPcRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.bulksetcloudpcreviewstatus.BulkSetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.downloadappdiagnostics.DownloadAppDiagnosticsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.downloadpowerliftappdiagnostic.DownloadPowerliftAppDiagnosticRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.executeaction.ExecuteActionRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.ManagedDeviceItemRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.movedevicestoou.MoveDevicesToOURequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.retrievepowerliftappdiagnosticsdetailswithuserprincipalname.RetrievePowerliftAppDiagnosticsDetailsWithUserPrincipalNameRequestBuilder;
import com.microsoft.graph.beta.models.ManagedDevice;
import com.microsoft.graph.beta.models.ManagedDeviceCollectionResponse;
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
 * Provides operations to manage the comanagedDevices property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComanagedDevicesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the bulkReprovisionCloudPc method.
     * @return a {@link BulkReprovisionCloudPcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkReprovisionCloudPcRequestBuilder bulkReprovisionCloudPc() {
        return new BulkReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bulkRestoreCloudPc method.
     * @return a {@link BulkRestoreCloudPcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkRestoreCloudPcRequestBuilder bulkRestoreCloudPc() {
        return new BulkRestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bulkSetCloudPcReviewStatus method.
     * @return a {@link BulkSetCloudPcReviewStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkSetCloudPcReviewStatusRequestBuilder bulkSetCloudPcReviewStatus() {
        return new BulkSetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to call the downloadAppDiagnostics method.
     * @return a {@link DownloadAppDiagnosticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadAppDiagnosticsRequestBuilder downloadAppDiagnostics() {
        return new DownloadAppDiagnosticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the downloadPowerliftAppDiagnostic method.
     * @return a {@link DownloadPowerliftAppDiagnosticRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadPowerliftAppDiagnosticRequestBuilder downloadPowerliftAppDiagnostic() {
        return new DownloadPowerliftAppDiagnosticRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the executeAction method.
     * @return a {@link ExecuteActionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExecuteActionRequestBuilder executeAction() {
        return new ExecuteActionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the moveDevicesToOU method.
     * @return a {@link MoveDevicesToOURequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MoveDevicesToOURequestBuilder moveDevicesToOU() {
        return new MoveDevicesToOURequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the appDiagnostics method.
     * @param upn Usage: upn=&apos;{upn}&apos;
     * @return a {@link AppDiagnosticsWithUpnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppDiagnosticsWithUpnRequestBuilder appDiagnosticsWithUpn(@jakarta.annotation.Nonnull final String upn) {
        Objects.requireNonNull(upn);
        return new AppDiagnosticsWithUpnRequestBuilder(pathParameters, requestAdapter, upn);
    }
    /**
     * Provides operations to manage the comanagedDevices property of the microsoft.graph.deviceManagement entity.
     * @param managedDeviceId The unique identifier of managedDevice
     * @return a {@link ManagedDeviceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder byManagedDeviceId(@jakarta.annotation.Nonnull final String managedDeviceId) {
        Objects.requireNonNull(managedDeviceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDevice%2Did", managedDeviceId);
        return new ManagedDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ComanagedDevicesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComanagedDevicesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link ComanagedDevicesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComanagedDevicesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * The list of co-managed devices report
     * @return a {@link ManagedDeviceCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceCollectionResponse get() {
        return get(null);
    }
    /**
     * The list of co-managed devices report
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagedDeviceCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDeviceCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice post(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice post(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the retrievePowerliftAppDiagnosticsDetails method.
     * @param userPrincipalName Usage: userPrincipalName=&apos;{userPrincipalName}&apos;
     * @return a {@link RetrievePowerliftAppDiagnosticsDetailsWithUserPrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrievePowerliftAppDiagnosticsDetailsWithUserPrincipalNameRequestBuilder retrievePowerliftAppDiagnosticsDetailsWithUserPrincipalName(@jakarta.annotation.Nonnull final String userPrincipalName) {
        Objects.requireNonNull(userPrincipalName);
        return new RetrievePowerliftAppDiagnosticsDetailsWithUserPrincipalNameRequestBuilder(pathParameters, requestAdapter, userPrincipalName);
    }
    /**
     * The list of co-managed devices report
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The list of co-managed devices report
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
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ComanagedDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComanagedDevicesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ComanagedDevicesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The list of co-managed devices report
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

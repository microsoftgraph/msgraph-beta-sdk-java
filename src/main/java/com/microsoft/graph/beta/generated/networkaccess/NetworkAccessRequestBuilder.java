package com.microsoft.graph.beta.networkaccess;

import com.microsoft.graph.beta.models.networkaccess.NetworkAccessRoot;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.networkaccess.alerts.AlertsRequestBuilder;
import com.microsoft.graph.beta.networkaccess.connectivity.ConnectivityRequestBuilder;
import com.microsoft.graph.beta.networkaccess.filteringpolicies.FilteringPoliciesRequestBuilder;
import com.microsoft.graph.beta.networkaccess.filteringprofiles.FilteringProfilesRequestBuilder;
import com.microsoft.graph.beta.networkaccess.forwardingpolicies.ForwardingPoliciesRequestBuilder;
import com.microsoft.graph.beta.networkaccess.forwardingprofiles.ForwardingProfilesRequestBuilder;
import com.microsoft.graph.beta.networkaccess.logs.LogsRequestBuilder;
import com.microsoft.graph.beta.networkaccess.microsoftgraphnetworkaccessonboard.MicrosoftGraphNetworkaccessOnboardRequestBuilder;
import com.microsoft.graph.beta.networkaccess.reports.ReportsRequestBuilder;
import com.microsoft.graph.beta.networkaccess.settings.SettingsRequestBuilder;
import com.microsoft.graph.beta.networkaccess.tenantstatus.TenantStatusRequestBuilder;
import com.microsoft.graph.beta.networkaccess.threatintelligencepolicies.ThreatIntelligencePoliciesRequestBuilder;
import com.microsoft.graph.beta.networkaccess.tls.TlsRequestBuilder;
import com.microsoft.graph.beta.networkaccess.tlsinspectionpolicies.TlsInspectionPoliciesRequestBuilder;
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
 * Provides operations to manage the networkAccessRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NetworkAccessRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the alerts property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link AlertsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the connectivity property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link ConnectivityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConnectivityRequestBuilder connectivity() {
        return new ConnectivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the filteringPolicies property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link FilteringPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilteringPoliciesRequestBuilder filteringPolicies() {
        return new FilteringPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the filteringProfiles property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link FilteringProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilteringProfilesRequestBuilder filteringProfiles() {
        return new FilteringProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the forwardingPolicies property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link ForwardingPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForwardingPoliciesRequestBuilder forwardingPolicies() {
        return new ForwardingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the forwardingProfiles property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link ForwardingProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForwardingProfilesRequestBuilder forwardingProfiles() {
        return new ForwardingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the logs property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link LogsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogsRequestBuilder logs() {
        return new LogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the onboard method.
     * @return a {@link MicrosoftGraphNetworkaccessOnboardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessOnboardRequestBuilder microsoftGraphNetworkaccessOnboard() {
        return new MicrosoftGraphNetworkaccessOnboardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reports property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link SettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantStatus property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link TenantStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TenantStatusRequestBuilder tenantStatus() {
        return new TenantStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatIntelligencePolicies property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link ThreatIntelligencePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThreatIntelligencePoliciesRequestBuilder threatIntelligencePolicies() {
        return new ThreatIntelligencePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tls property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link TlsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TlsRequestBuilder tls() {
        return new TlsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tlsInspectionPolicies property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     * @return a {@link TlsInspectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TlsInspectionPoliciesRequestBuilder tlsInspectionPolicies() {
        return new TlsInspectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link NetworkAccessRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NetworkAccessRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link NetworkAccessRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NetworkAccessRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get networkAccess
     * @return a {@link NetworkAccessRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public NetworkAccessRoot get() {
        return get(null);
    }
    /**
     * Get networkAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NetworkAccessRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public NetworkAccessRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NetworkAccessRoot::createFromDiscriminatorValue);
    }
    /**
     * Update networkAccess
     * @param body The request body
     * @return a {@link NetworkAccessRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public NetworkAccessRoot patch(@jakarta.annotation.Nonnull final NetworkAccessRoot body) {
        return patch(body, null);
    }
    /**
     * Update networkAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NetworkAccessRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public NetworkAccessRoot patch(@jakarta.annotation.Nonnull final NetworkAccessRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NetworkAccessRoot::createFromDiscriminatorValue);
    }
    /**
     * Get networkAccess
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get networkAccess
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
     * Update networkAccess
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final NetworkAccessRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update networkAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final NetworkAccessRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link NetworkAccessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NetworkAccessRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NetworkAccessRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get networkAccess
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

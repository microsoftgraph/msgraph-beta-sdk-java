package com.microsoft.graph.beta.auditlogs;

import com.microsoft.graph.beta.auditlogs.auditactivitytypes.AuditActivityTypesRequestBuilder;
import com.microsoft.graph.beta.auditlogs.customsecurityattributeaudits.CustomSecurityAttributeAuditsRequestBuilder;
import com.microsoft.graph.beta.auditlogs.directoryaudits.DirectoryAuditsRequestBuilder;
import com.microsoft.graph.beta.auditlogs.directoryprovisioning.DirectoryProvisioningRequestBuilder;
import com.microsoft.graph.beta.auditlogs.getsummarizedmsisigninswithaggregationwindow.GetSummarizedMSISignInsWithAggregationWindowRequestBuilder;
import com.microsoft.graph.beta.auditlogs.getsummarizednoninteractivesigninswithaggregationwindow.GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder;
import com.microsoft.graph.beta.auditlogs.getsummarizedserviceprincipalsigninswithaggregationwindow.GetSummarizedServicePrincipalSignInsWithAggregationWindowRequestBuilder;
import com.microsoft.graph.beta.auditlogs.provisioning.ProvisioningRequestBuilder;
import com.microsoft.graph.beta.auditlogs.signineventsappsummary.SignInEventsAppSummaryRequestBuilder;
import com.microsoft.graph.beta.auditlogs.signineventssummary.SignInEventsSummaryRequestBuilder;
import com.microsoft.graph.beta.auditlogs.signins.SignInsRequestBuilder;
import com.microsoft.graph.beta.auditlogs.signups.SignUpsRequestBuilder;
import com.microsoft.graph.beta.models.AuditLogRoot;
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
 * Provides operations to manage the auditLogRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditLogsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the auditActivityTypes property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link AuditActivityTypesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditActivityTypesRequestBuilder auditActivityTypes() {
        return new AuditActivityTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customSecurityAttributeAudits property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link CustomSecurityAttributeAuditsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomSecurityAttributeAuditsRequestBuilder customSecurityAttributeAudits() {
        return new CustomSecurityAttributeAuditsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directoryAudits property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link DirectoryAuditsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryAuditsRequestBuilder directoryAudits() {
        return new DirectoryAuditsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directoryProvisioning property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link DirectoryProvisioningRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryProvisioningRequestBuilder directoryProvisioning() {
        return new DirectoryProvisioningRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the provisioning property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link ProvisioningRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvisioningRequestBuilder provisioning() {
        return new ProvisioningRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the signInEventsAppSummary property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link SignInEventsAppSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignInEventsAppSummaryRequestBuilder signInEventsAppSummary() {
        return new SignInEventsAppSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the signInEventsSummary property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link SignInEventsSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignInEventsSummaryRequestBuilder signInEventsSummary() {
        return new SignInEventsSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the signIns property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link SignInsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignInsRequestBuilder signIns() {
        return new SignInsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the signUps property of the microsoft.graph.auditLogRoot entity.
     * @return a {@link SignUpsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignUpsRequestBuilder signUps() {
        return new SignUpsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AuditLogsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuditLogsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AuditLogsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuditLogsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get auditLogs
     * @return a {@link AuditLogRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuditLogRoot get() {
        return get(null);
    }
    /**
     * Get auditLogs
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuditLogRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuditLogRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuditLogRoot::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getSummarizedMSISignIns method.
     * @param aggregationWindow Usage: aggregationWindow=&apos;{aggregationWindow}&apos;
     * @return a {@link GetSummarizedMSISignInsWithAggregationWindowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSummarizedMSISignInsWithAggregationWindowRequestBuilder getSummarizedMSISignInsWithAggregationWindow(@jakarta.annotation.Nonnull final String aggregationWindow) {
        Objects.requireNonNull(aggregationWindow);
        return new GetSummarizedMSISignInsWithAggregationWindowRequestBuilder(pathParameters, requestAdapter, aggregationWindow);
    }
    /**
     * Provides operations to call the getSummarizedNonInteractiveSignIns method.
     * @param aggregationWindow Usage: aggregationWindow=&apos;{aggregationWindow}&apos;
     * @return a {@link GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder getSummarizedNonInteractiveSignInsWithAggregationWindow(@jakarta.annotation.Nonnull final String aggregationWindow) {
        Objects.requireNonNull(aggregationWindow);
        return new GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder(pathParameters, requestAdapter, aggregationWindow);
    }
    /**
     * Provides operations to call the getSummarizedServicePrincipalSignIns method.
     * @param aggregationWindow Usage: aggregationWindow=&apos;{aggregationWindow}&apos;
     * @return a {@link GetSummarizedServicePrincipalSignInsWithAggregationWindowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSummarizedServicePrincipalSignInsWithAggregationWindowRequestBuilder getSummarizedServicePrincipalSignInsWithAggregationWindow(@jakarta.annotation.Nonnull final String aggregationWindow) {
        Objects.requireNonNull(aggregationWindow);
        return new GetSummarizedServicePrincipalSignInsWithAggregationWindowRequestBuilder(pathParameters, requestAdapter, aggregationWindow);
    }
    /**
     * Update auditLogs
     * @param body The request body
     * @return a {@link AuditLogRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuditLogRoot patch(@jakarta.annotation.Nonnull final AuditLogRoot body) {
        return patch(body, null);
    }
    /**
     * Update auditLogs
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuditLogRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuditLogRoot patch(@jakarta.annotation.Nonnull final AuditLogRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuditLogRoot::createFromDiscriminatorValue);
    }
    /**
     * Get auditLogs
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get auditLogs
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
     * Update auditLogs
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuditLogRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update auditLogs
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuditLogRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AuditLogsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditLogsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuditLogsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get auditLogs
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

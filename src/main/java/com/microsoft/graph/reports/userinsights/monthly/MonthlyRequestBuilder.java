package com.microsoft.graph.reports.userinsights.monthly;

import com.microsoft.graph.models.MonthlyUserInsightMetricsRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.reports.userinsights.monthly.activeusers.ActiveUsersRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.activeusersbreakdown.ActiveUsersBreakdownRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.authentications.AuthenticationsRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.inactiveusers.InactiveUsersRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.inactiveusersbyapplication.InactiveUsersByApplicationRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.mfacompletions.MfaCompletionsRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.requests.RequestsRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.signups.SignUpsRequestBuilder;
import com.microsoft.graph.reports.userinsights.monthly.summary.SummaryRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the monthly property of the microsoft.graph.userInsightsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MonthlyRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activeUsers property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ActiveUsersRequestBuilder activeUsers() {
        return new ActiveUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the activeUsersBreakdown property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ActiveUsersBreakdownRequestBuilder activeUsersBreakdown() {
        return new ActiveUsersBreakdownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authentications property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationsRequestBuilder authentications() {
        return new AuthenticationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inactiveUsers property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public InactiveUsersRequestBuilder inactiveUsers() {
        return new InactiveUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inactiveUsersByApplication property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public InactiveUsersByApplicationRequestBuilder inactiveUsersByApplication() {
        return new InactiveUsersByApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mfaCompletions property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public MfaCompletionsRequestBuilder mfaCompletions() {
        return new MfaCompletionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the requests property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public RequestsRequestBuilder requests() {
        return new RequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the signUps property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SignUpsRequestBuilder signUps() {
        return new SignUpsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the summary property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SummaryRequestBuilder summary() {
        return new SummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MonthlyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MonthlyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/userInsights/monthly{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MonthlyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MonthlyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/userInsights/monthly{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property monthly for reports
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property monthly for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get monthly from reports
     * @return a CompletableFuture of MonthlyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MonthlyUserInsightMetricsRoot> get() {
        return get(null);
    }
    /**
     * Get monthly from reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of MonthlyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MonthlyUserInsightMetricsRoot> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, MonthlyUserInsightMetricsRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property monthly in reports
     * @param body The request body
     * @return a CompletableFuture of MonthlyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MonthlyUserInsightMetricsRoot> patch(@jakarta.annotation.Nonnull final MonthlyUserInsightMetricsRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property monthly in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of MonthlyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MonthlyUserInsightMetricsRoot> patch(@jakarta.annotation.Nonnull final MonthlyUserInsightMetricsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, MonthlyUserInsightMetricsRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property monthly for reports
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property monthly for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json, application/json");
        return requestInfo;
    }
    /**
     * Get monthly from reports
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get monthly from reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Update the navigation property monthly in reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MonthlyUserInsightMetricsRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property monthly in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MonthlyUserInsightMetricsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MonthlyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MonthlyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MonthlyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get monthly from reports
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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

package com.microsoft.graph.reports.userinsights.daily;

import com.microsoft.graph.models.DailyUserInsightMetricsRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.reports.userinsights.daily.activeusers.ActiveUsersRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.activeusersbreakdown.ActiveUsersBreakdownRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.authentications.AuthenticationsRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.inactiveusers.InactiveUsersRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.inactiveusersbyapplication.InactiveUsersByApplicationRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.mfacompletions.MfaCompletionsRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.signups.SignUpsRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.summary.SummaryRequestBuilder;
import com.microsoft.graph.reports.userinsights.daily.usercount.UserCountRequestBuilder;
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
 * Provides operations to manage the daily property of the microsoft.graph.userInsightsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DailyRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activeUsers property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ActiveUsersRequestBuilder activeUsers() {
        return new ActiveUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the activeUsersBreakdown property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ActiveUsersBreakdownRequestBuilder activeUsersBreakdown() {
        return new ActiveUsersBreakdownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authentications property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationsRequestBuilder authentications() {
        return new AuthenticationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inactiveUsers property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public InactiveUsersRequestBuilder inactiveUsers() {
        return new InactiveUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inactiveUsersByApplication property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public InactiveUsersByApplicationRequestBuilder inactiveUsersByApplication() {
        return new InactiveUsersByApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mfaCompletions property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public MfaCompletionsRequestBuilder mfaCompletions() {
        return new MfaCompletionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the signUps property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SignUpsRequestBuilder signUps() {
        return new SignUpsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the summary property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SummaryRequestBuilder summary() {
        return new SummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userCount property of the microsoft.graph.dailyUserInsightMetricsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public UserCountRequestBuilder userCount() {
        return new UserCountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DailyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DailyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/userInsights/daily{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DailyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DailyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/userInsights/daily{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property daily for reports
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property daily for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Summaries of daily user activities on apps registered in your tenant that is configured for Microsoft Entra External ID for customers.
     * @return a DailyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nullable
    public DailyUserInsightMetricsRoot get() {
        return get(null);
    }
    /**
     * Summaries of daily user activities on apps registered in your tenant that is configured for Microsoft Entra External ID for customers.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DailyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nullable
    public DailyUserInsightMetricsRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DailyUserInsightMetricsRoot::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property daily in reports
     * @param body The request body
     * @return a DailyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nullable
    public DailyUserInsightMetricsRoot patch(@jakarta.annotation.Nonnull final DailyUserInsightMetricsRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property daily in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DailyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nullable
    public DailyUserInsightMetricsRoot patch(@jakarta.annotation.Nonnull final DailyUserInsightMetricsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DailyUserInsightMetricsRoot::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property daily for reports
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property daily for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Summaries of daily user activities on apps registered in your tenant that is configured for Microsoft Entra External ID for customers.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Summaries of daily user activities on apps registered in your tenant that is configured for Microsoft Entra External ID for customers.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property daily in reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DailyUserInsightMetricsRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property daily in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DailyUserInsightMetricsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a DailyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DailyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DailyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Summaries of daily user activities on apps registered in your tenant that is configured for Microsoft Entra External ID for customers.
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

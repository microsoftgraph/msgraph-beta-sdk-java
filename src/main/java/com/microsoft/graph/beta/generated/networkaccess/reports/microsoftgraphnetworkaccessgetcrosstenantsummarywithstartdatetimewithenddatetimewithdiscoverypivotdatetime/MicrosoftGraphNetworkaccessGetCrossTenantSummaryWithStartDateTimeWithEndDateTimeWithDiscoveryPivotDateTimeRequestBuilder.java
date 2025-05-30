package com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetcrosstenantsummarywithstartdatetimewithenddatetimewithdiscoverypivotdatetime;

import com.microsoft.graph.beta.models.networkaccess.CrossTenantSummary;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getCrossTenantSummary method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder} and sets the default values.
     * @param discoveryPivotDateTime Usage: discoveryPivotDateTime={discoveryPivotDateTime}
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param startDateTime Usage: startDateTime={startDateTime}
     */
    public MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final OffsetDateTime discoveryPivotDateTime, @jakarta.annotation.Nullable final OffsetDateTime endDateTime, @jakarta.annotation.Nullable final OffsetDateTime startDateTime) {
        super(requestAdapter, "{+baseurl}/networkAccess/reports/microsoft.graph.networkaccess.getCrossTenantSummary(startDateTime={startDateTime},endDateTime={endDateTime},discoveryPivotDateTime={discoveryPivotDateTime})", pathParameters);
        this.pathParameters.put("discoveryPivotDateTime", discoveryPivotDateTime);
        this.pathParameters.put("endDateTime", endDateTime);
        this.pathParameters.put("startDateTime", startDateTime);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/reports/microsoft.graph.networkaccess.getCrossTenantSummary(startDateTime={startDateTime},endDateTime={endDateTime},discoveryPivotDateTime={discoveryPivotDateTime})", rawUrl);
    }
    /**
     * Get a summary of the cross-tenant access patterns.
     * @return a {@link CrossTenantSummary}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CrossTenantSummary get() {
        return get(null);
    }
    /**
     * Get a summary of the cross-tenant access patterns.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantSummary}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CrossTenantSummary get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantSummary::createFromDiscriminatorValue);
    }
    /**
     * Get a summary of the cross-tenant access patterns.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a summary of the cross-tenant access patterns.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTimeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

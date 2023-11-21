package com.microsoft.graph.reports.serviceactivity;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ServiceActivity;
import com.microsoft.graph.reports.serviceactivity.getmetricsforconditionalaccesscompliantdevicessigninsuccesswithinclusiveintervalstartdatetimewithexclusiveintervalenddatetimewithaggregationintervalinminutes.GetMetricsForConditionalAccessCompliantDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder;
import com.microsoft.graph.reports.serviceactivity.getmetricsforconditionalaccessmanageddevicessigninsuccesswithinclusiveintervalstartdatetimewithexclusiveintervalenddatetimewithaggregationintervalinminutes.GetMetricsForConditionalAccessManagedDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder;
import com.microsoft.graph.reports.serviceactivity.getmetricsformfasigninfailurewithinclusiveintervalstartdatetimewithexclusiveintervalenddatetimewithaggregationintervalinminutes.GetMetricsForMfaSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder;
import com.microsoft.graph.reports.serviceactivity.getmetricsformfasigninsuccesswithinclusiveintervalstartdatetimewithexclusiveintervalenddatetimewithaggregationintervalinminutes.GetMetricsForMfaSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder;
import com.microsoft.graph.reports.serviceactivity.getmetricsforsamlsigninsuccesswithinclusiveintervalstartdatetimewithexclusiveintervalenddatetimewithaggregationintervalinminutes.GetMetricsForSamlSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the serviceActivity property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceActivityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ServiceActivityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServiceActivityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/serviceActivity{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ServiceActivityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServiceActivityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/serviceActivity{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property serviceActivity for reports
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property serviceActivity for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * A placeholder to the Microsoft Entra service activity.
     * @return a ServiceActivity
     */
    @jakarta.annotation.Nullable
    public ServiceActivity get() {
        return get(null);
    }
    /**
     * A placeholder to the Microsoft Entra service activity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceActivity
     */
    @jakarta.annotation.Nullable
    public ServiceActivity get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, ServiceActivity::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the getMetricsForConditionalAccessCompliantDevicesSignInSuccess method.
     * @param exclusiveIntervalEndDateTime Usage: exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime}
     * @param inclusiveIntervalStartDateTime Usage: inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime}
     * @return a GetMetricsForConditionalAccessCompliantDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMetricsForConditionalAccessCompliantDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder getMetricsForConditionalAccessCompliantDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutes(@jakarta.annotation.Nonnull final OffsetDateTime exclusiveIntervalEndDateTime, @jakarta.annotation.Nonnull final OffsetDateTime inclusiveIntervalStartDateTime) {
        Objects.requireNonNull(exclusiveIntervalEndDateTime);
        Objects.requireNonNull(inclusiveIntervalStartDateTime);
        return new GetMetricsForConditionalAccessCompliantDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(pathParameters, requestAdapter, exclusiveIntervalEndDateTime, inclusiveIntervalStartDateTime);
    }
    /**
     * Provides operations to call the getMetricsForConditionalAccessManagedDevicesSignInSuccess method.
     * @param exclusiveIntervalEndDateTime Usage: exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime}
     * @param inclusiveIntervalStartDateTime Usage: inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime}
     * @return a GetMetricsForConditionalAccessManagedDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMetricsForConditionalAccessManagedDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder getMetricsForConditionalAccessManagedDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutes(@jakarta.annotation.Nonnull final OffsetDateTime exclusiveIntervalEndDateTime, @jakarta.annotation.Nonnull final OffsetDateTime inclusiveIntervalStartDateTime) {
        Objects.requireNonNull(exclusiveIntervalEndDateTime);
        Objects.requireNonNull(inclusiveIntervalStartDateTime);
        return new GetMetricsForConditionalAccessManagedDevicesSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(pathParameters, requestAdapter, exclusiveIntervalEndDateTime, inclusiveIntervalStartDateTime);
    }
    /**
     * Provides operations to call the getMetricsForMfaSignInFailure method.
     * @param exclusiveIntervalEndDateTime Usage: exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime}
     * @param inclusiveIntervalStartDateTime Usage: inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime}
     * @return a GetMetricsForMfaSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMetricsForMfaSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder getMetricsForMfaSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutes(@jakarta.annotation.Nonnull final OffsetDateTime exclusiveIntervalEndDateTime, @jakarta.annotation.Nonnull final OffsetDateTime inclusiveIntervalStartDateTime) {
        Objects.requireNonNull(exclusiveIntervalEndDateTime);
        Objects.requireNonNull(inclusiveIntervalStartDateTime);
        return new GetMetricsForMfaSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(pathParameters, requestAdapter, exclusiveIntervalEndDateTime, inclusiveIntervalStartDateTime);
    }
    /**
     * Provides operations to call the getMetricsForMfaSignInSuccess method.
     * @param exclusiveIntervalEndDateTime Usage: exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime}
     * @param inclusiveIntervalStartDateTime Usage: inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime}
     * @return a GetMetricsForMfaSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMetricsForMfaSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder getMetricsForMfaSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutes(@jakarta.annotation.Nonnull final OffsetDateTime exclusiveIntervalEndDateTime, @jakarta.annotation.Nonnull final OffsetDateTime inclusiveIntervalStartDateTime) {
        Objects.requireNonNull(exclusiveIntervalEndDateTime);
        Objects.requireNonNull(inclusiveIntervalStartDateTime);
        return new GetMetricsForMfaSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(pathParameters, requestAdapter, exclusiveIntervalEndDateTime, inclusiveIntervalStartDateTime);
    }
    /**
     * Provides operations to call the getMetricsForSamlSignInSuccess method.
     * @param exclusiveIntervalEndDateTime Usage: exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime}
     * @param inclusiveIntervalStartDateTime Usage: inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime}
     * @return a GetMetricsForSamlSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMetricsForSamlSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder getMetricsForSamlSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutes(@jakarta.annotation.Nonnull final OffsetDateTime exclusiveIntervalEndDateTime, @jakarta.annotation.Nonnull final OffsetDateTime inclusiveIntervalStartDateTime) {
        Objects.requireNonNull(exclusiveIntervalEndDateTime);
        Objects.requireNonNull(inclusiveIntervalStartDateTime);
        return new GetMetricsForSamlSignInSuccessWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(pathParameters, requestAdapter, exclusiveIntervalEndDateTime, inclusiveIntervalStartDateTime);
    }
    /**
     * Update the navigation property serviceActivity in reports
     * @param body The request body
     * @return a ServiceActivity
     */
    @jakarta.annotation.Nullable
    public ServiceActivity patch(@jakarta.annotation.Nonnull final ServiceActivity body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property serviceActivity in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceActivity
     */
    @jakarta.annotation.Nullable
    public ServiceActivity patch(@jakarta.annotation.Nonnull final ServiceActivity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, ServiceActivity::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property serviceActivity for reports
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property serviceActivity for reports
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
     * A placeholder to the Microsoft Entra service activity.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * A placeholder to the Microsoft Entra service activity.
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
     * Update the navigation property serviceActivity in reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ServiceActivity body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property serviceActivity in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ServiceActivity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ServiceActivityRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServiceActivityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ServiceActivityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * A placeholder to the Microsoft Entra service activity.
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

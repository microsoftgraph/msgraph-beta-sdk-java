package com.microsoft.graph.reports.manageddeviceenrollmentabandonmentdetailswithskipwithtopwithfilterwithskiptoken;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Report;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the managedDeviceEnrollmentAbandonmentDetails method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder and sets the default values.
     * @param filter Usage: filter='{filter}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param skip Usage: skip={skip}
     * @param skipToken Usage: skipToken='{skipToken}'
     * @param top Usage: top={top}
     */
    public ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String filter, @jakarta.annotation.Nullable final Integer skip, @jakarta.annotation.Nullable final String skipToken, @jakarta.annotation.Nullable final Integer top) {
        super(requestAdapter, "{+baseurl}/reports/managedDeviceEnrollmentAbandonmentDetails(skip={skip},top={top},filter='{filter}',skipToken='{skipToken}')", pathParameters);
        this.pathParameters.put("filter", filter);
        this.pathParameters.put("skip", skip);
        this.pathParameters.put("skipToken", skipToken);
        this.pathParameters.put("top", top);
    }
    /**
     * Instantiates a new ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/managedDeviceEnrollmentAbandonmentDetails(skip={skip},top={top},filter='{filter}',skipToken='{skipToken}')", rawUrl);
    }
    /**
     * Metadata for Enrollment abandonment details report
     * @return a Report
     */
    @jakarta.annotation.Nullable
    public Report get() {
        return get(null);
    }
    /**
     * Metadata for Enrollment abandonment details report
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Report
     */
    @jakarta.annotation.Nullable
    public Report get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Report::createFromDiscriminatorValue);
    }
    /**
     * Metadata for Enrollment abandonment details report
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Metadata for Enrollment abandonment details report
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
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
     * @return a ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

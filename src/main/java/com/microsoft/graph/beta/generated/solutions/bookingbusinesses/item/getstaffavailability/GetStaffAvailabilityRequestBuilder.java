package com.microsoft.graph.beta.solutions.bookingbusinesses.item.getstaffavailability;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to call the getStaffAvailability method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetStaffAvailabilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetStaffAvailabilityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetStaffAvailabilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/bookingBusinesses/{bookingBusiness%2Did}/getStaffAvailability", pathParameters);
    }
    /**
     * Instantiates a new {@link GetStaffAvailabilityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetStaffAvailabilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/bookingBusinesses/{bookingBusiness%2Did}/getStaffAvailability", rawUrl);
    }
    /**
     * Get the availability information of staff members of a Microsoft Bookings calendar.
     * @param body The request body
     * @return a {@link GetStaffAvailabilityPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2023-03/PrivatePreview:responderForm on 2025-06-17 and will be removed 2025-12-17
     * @see <a href="https://learn.microsoft.com/graph/api/bookingbusiness-getstaffavailability?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetStaffAvailabilityPostResponse post(@jakarta.annotation.Nonnull final GetStaffAvailabilityPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Get the availability information of staff members of a Microsoft Bookings calendar.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetStaffAvailabilityPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2023-03/PrivatePreview:responderForm on 2025-06-17 and will be removed 2025-12-17
     * @see <a href="https://learn.microsoft.com/graph/api/bookingbusiness-getstaffavailability?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetStaffAvailabilityPostResponse post(@jakarta.annotation.Nonnull final GetStaffAvailabilityPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetStaffAvailabilityPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Get the availability information of staff members of a Microsoft Bookings calendar.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2023-03/PrivatePreview:responderForm on 2025-06-17 and will be removed 2025-12-17
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetStaffAvailabilityPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get the availability information of staff members of a Microsoft Bookings calendar.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2023-03/PrivatePreview:responderForm on 2025-06-17 and will be removed 2025-12-17
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetStaffAvailabilityPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GetStaffAvailabilityRequestBuilder}
     * @deprecated
     *  as of 2023-03/PrivatePreview:responderForm on 2025-06-17 and will be removed 2025-12-17
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public GetStaffAvailabilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetStaffAvailabilityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

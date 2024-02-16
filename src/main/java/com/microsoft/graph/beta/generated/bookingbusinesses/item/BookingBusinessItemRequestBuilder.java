package com.microsoft.graph.beta.bookingbusinesses.item;

import com.microsoft.graph.beta.bookingbusinesses.item.appointments.AppointmentsRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.customers.CustomersRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.customquestions.CustomQuestionsRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.getstaffavailability.GetStaffAvailabilityRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.publish.PublishRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.services.ServicesRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.staffmembers.StaffMembersRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.item.unpublish.UnpublishRequestBuilder;
import com.microsoft.graph.beta.models.BookingBusiness;
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
 * Provides operations to manage the collection of bookingBusiness entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingBusinessItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appointments property of the microsoft.graph.bookingBusiness entity.
     * @return a {@link AppointmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppointmentsRequestBuilder appointments() {
        return new AppointmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.bookingBusiness entity.
     * @return a {@link CalendarViewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customers property of the microsoft.graph.bookingBusiness entity.
     * @return a {@link CustomersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomersRequestBuilder customers() {
        return new CustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customQuestions property of the microsoft.graph.bookingBusiness entity.
     * @return a {@link CustomQuestionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomQuestionsRequestBuilder customQuestions() {
        return new CustomQuestionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getStaffAvailability method.
     * @return a {@link GetStaffAvailabilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetStaffAvailabilityRequestBuilder getStaffAvailability() {
        return new GetStaffAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the publish method.
     * @return a {@link PublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the services property of the microsoft.graph.bookingBusiness entity.
     * @return a {@link ServicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicesRequestBuilder services() {
        return new ServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the staffMembers property of the microsoft.graph.bookingBusiness entity.
     * @return a {@link StaffMembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StaffMembersRequestBuilder staffMembers() {
        return new StaffMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unpublish method.
     * @return a {@link UnpublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnpublishRequestBuilder unpublish() {
        return new UnpublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BookingBusinessItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BookingBusinessItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bookingBusinesses/{bookingBusiness%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link BookingBusinessItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BookingBusinessItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bookingBusinesses/{bookingBusiness%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete entity from bookingBusinesses
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete entity from bookingBusinesses
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Represents a Microsoft Bookings Business.
     * @return a {@link BookingBusiness}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public BookingBusiness get() {
        return get(null);
    }
    /**
     * Represents a Microsoft Bookings Business.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BookingBusiness}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public BookingBusiness get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BookingBusiness::createFromDiscriminatorValue);
    }
    /**
     * Update entity in bookingBusinesses
     * @param body The request body
     * @return a {@link BookingBusiness}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public BookingBusiness patch(@jakarta.annotation.Nonnull final BookingBusiness body) {
        return patch(body, null);
    }
    /**
     * Update entity in bookingBusinesses
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BookingBusiness}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public BookingBusiness patch(@jakarta.annotation.Nonnull final BookingBusiness body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BookingBusiness::createFromDiscriminatorValue);
    }
    /**
     * Delete entity from bookingBusinesses
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from bookingBusinesses
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/bookingBusinesses/{bookingBusiness%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Represents a Microsoft Bookings Business.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents a Microsoft Bookings Business.
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
     * Update entity in bookingBusinesses
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BookingBusiness body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in bookingBusinesses
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BookingBusiness body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/bookingBusinesses/{bookingBusiness%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BookingBusinessItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BookingBusinessItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BookingBusinessItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Represents a Microsoft Bookings Business.
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

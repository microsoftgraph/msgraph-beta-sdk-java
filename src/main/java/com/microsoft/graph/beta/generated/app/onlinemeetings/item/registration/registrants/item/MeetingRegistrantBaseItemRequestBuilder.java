package com.microsoft.graph.beta.app.onlinemeetings.item.registration.registrants.item;

import com.microsoft.graph.beta.models.MeetingRegistrantBase;
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
 * Provides operations to manage the registrants property of the microsoft.graph.meetingRegistrationBase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingRegistrantBaseItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MeetingRegistrantBaseItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MeetingRegistrantBaseItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/onlineMeetings/{onlineMeeting%2Did}/registration/registrants/{meetingRegistrantBase%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link MeetingRegistrantBaseItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MeetingRegistrantBaseItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/onlineMeetings/{onlineMeeting%2Did}/registration/registrants/{meetingRegistrantBase%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property registrants for app
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property registrants for app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Registrants of the online meeting.
     * @return a {@link MeetingRegistrantBase}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public MeetingRegistrantBase get() {
        return get(null);
    }
    /**
     * Registrants of the online meeting.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MeetingRegistrantBase}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public MeetingRegistrantBase get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MeetingRegistrantBase::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property registrants in app
     * @param body The request body
     * @return a {@link MeetingRegistrantBase}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public MeetingRegistrantBase patch(@jakarta.annotation.Nonnull final MeetingRegistrantBase body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property registrants in app
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MeetingRegistrantBase}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public MeetingRegistrantBase patch(@jakarta.annotation.Nonnull final MeetingRegistrantBase body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MeetingRegistrantBase::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property registrants for app
     * @return a {@link RequestInformation}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property registrants for app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Registrants of the online meeting.
     * @return a {@link RequestInformation}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Registrants of the online meeting.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property registrants in app
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MeetingRegistrantBase body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property registrants in app
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MeetingRegistrantBase body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MeetingRegistrantBaseItemRequestBuilder}
     * @deprecated
     * The meetingRegistrationBase Entity is deprecated and will stop returning data on Dec 12th, 2024. Please use the new webinar APIs. as of 2024-04/meetingRegistrationDeprecation on 2024-04-01 and will be removed 2024-12-12
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MeetingRegistrantBaseItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MeetingRegistrantBaseItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Registrants of the online meeting.
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

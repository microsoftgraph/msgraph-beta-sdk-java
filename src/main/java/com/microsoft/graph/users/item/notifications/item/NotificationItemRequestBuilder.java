package com.microsoft.graph.users.item.notifications.item;

import com.microsoft.graph.models.Notification;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the notifications property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new NotificationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/notifications/{notification%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new NotificationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/notifications/{notification%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property notifications for users
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property notifications for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get notifications from users
     * @return a Notification
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Notification get() {
        return get(null);
    }
    /**
     * Get notifications from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Notification
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Notification get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Notification::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property notifications in users
     * @param body The request body
     * @return a Notification
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Notification patch(@jakarta.annotation.Nonnull final Notification body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property notifications in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Notification
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Notification patch(@jakarta.annotation.Nonnull final Notification body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Notification::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property notifications for users
     * @return a RequestInformation
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property notifications for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get notifications from users
     * @return a RequestInformation
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get notifications from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property notifications in users
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Notification body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property notifications in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Notification body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a NotificationItemRequestBuilder
     * @deprecated
     * The Graph Notification API is deprecated and will stop returning data on March 20, 2023. as of 2023-03/Notification_Deprecation on 2023-03-09 and will be removed 2023-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public NotificationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NotificationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get notifications from users
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

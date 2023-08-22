package com.microsoft.graph.monitoring.alertrecords.item.microsoftgraphdevicemanagementsetportalnotificationassent;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the setPortalNotificationAsSent method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphDeviceManagementSetPortalNotificationAsSentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MicrosoftGraphDeviceManagementSetPortalNotificationAsSentRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphDeviceManagementSetPortalNotificationAsSentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/monitoring/alertRecords/{alertRecord%2Did}/microsoft.graph.deviceManagement.setPortalNotificationAsSent", pathParameters);
    }
    /**
     * Instantiates a new MicrosoftGraphDeviceManagementSetPortalNotificationAsSentRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphDeviceManagementSetPortalNotificationAsSentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/monitoring/alertRecords/{alertRecord%2Did}/microsoft.graph.deviceManagement.setPortalNotificationAsSent", rawUrl);
    }
    /**
     * Set the status of the notification associated with the specified alertRecord on the Microsoft EndPoint Manager admin center as sent, by setting the isPortalNotificationSent property of the portal notification to true.
     * @see <a href="https://learn.microsoft.com/graph/api/devicemanagement-alertrecord-setportalnotificationassent?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post() {
        return post(null);
    }
    /**
     * Set the status of the notification associated with the specified alertRecord on the Microsoft EndPoint Manager admin center as sent, by setting the isPortalNotificationSent property of the portal notification to true.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/devicemanagement-alertrecord-setportalnotificationassent?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Set the status of the notification associated with the specified alertRecord on the Microsoft EndPoint Manager admin center as sent, by setting the isPortalNotificationSent property of the portal notification to true.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Set the status of the notification associated with the specified alertRecord on the Microsoft EndPoint Manager admin center as sent, by setting the isPortalNotificationSent property of the portal notification to true.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

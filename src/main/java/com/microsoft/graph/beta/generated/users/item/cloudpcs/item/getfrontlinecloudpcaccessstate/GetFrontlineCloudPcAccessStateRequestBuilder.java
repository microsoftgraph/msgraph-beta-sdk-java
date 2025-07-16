package com.microsoft.graph.beta.users.item.cloudpcs.item.getfrontlinecloudpcaccessstate;

import com.microsoft.graph.beta.models.FrontlineCloudPcAccessState;
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
 * Provides operations to call the getFrontlineCloudPcAccessState method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetFrontlineCloudPcAccessStateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetFrontlineCloudPcAccessStateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetFrontlineCloudPcAccessStateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/getFrontlineCloudPcAccessState()", pathParameters);
    }
    /**
     * Instantiates a new {@link GetFrontlineCloudPcAccessStateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetFrontlineCloudPcAccessStateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/getFrontlineCloudPcAccessState()", rawUrl);
    }
    /**
     * Get the frontlineCloudPcAccessState of a frontline Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest frontline Cloud PC accessState and determine whether the frontline Cloud PC is accessible to a user.  If a web client needs to connect to a frontline Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState isn&apos;t active/activating/standbyMode, the web client shows a bad bookmark.
     * @return a {@link FrontlineCloudPcAccessState}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-getfrontlinecloudpcaccessstate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public FrontlineCloudPcAccessState get() {
        return get(null);
    }
    /**
     * Get the frontlineCloudPcAccessState of a frontline Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest frontline Cloud PC accessState and determine whether the frontline Cloud PC is accessible to a user.  If a web client needs to connect to a frontline Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState isn&apos;t active/activating/standbyMode, the web client shows a bad bookmark.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FrontlineCloudPcAccessState}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-getfrontlinecloudpcaccessstate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public FrontlineCloudPcAccessState get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendEnum(requestInfo, errorMapping, FrontlineCloudPcAccessState::forValue);
    }
    /**
     * Get the frontlineCloudPcAccessState of a frontline Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest frontline Cloud PC accessState and determine whether the frontline Cloud PC is accessible to a user.  If a web client needs to connect to a frontline Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState isn&apos;t active/activating/standbyMode, the web client shows a bad bookmark.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the frontlineCloudPcAccessState of a frontline Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest frontline Cloud PC accessState and determine whether the frontline Cloud PC is accessible to a user.  If a web client needs to connect to a frontline Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState isn&apos;t active/activating/standbyMode, the web client shows a bad bookmark.
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
     * @return a {@link GetFrontlineCloudPcAccessStateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFrontlineCloudPcAccessStateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetFrontlineCloudPcAccessStateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

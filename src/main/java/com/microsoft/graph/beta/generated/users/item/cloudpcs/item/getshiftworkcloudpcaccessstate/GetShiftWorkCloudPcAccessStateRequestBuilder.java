package com.microsoft.graph.beta.users.item.cloudpcs.item.getshiftworkcloudpcaccessstate;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.ShiftWorkCloudPcAccessState;
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
 * Provides operations to call the getShiftWorkCloudPcAccessState method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetShiftWorkCloudPcAccessStateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetShiftWorkCloudPcAccessStateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShiftWorkCloudPcAccessStateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/getShiftWorkCloudPcAccessState()", pathParameters);
    }
    /**
     * Instantiates a new {@link GetShiftWorkCloudPcAccessStateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShiftWorkCloudPcAccessStateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/getShiftWorkCloudPcAccessState()", rawUrl);
    }
    /**
     * Get the shiftWorkCloudPcAccessState of a shift work Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest shift work Cloud PC accessState and determine whether the shift work Cloud PC is accessible to the user.  If a web client needs to connect to a shift work Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState is not active/activating/standbyMode, the web client shows a 'bad bookmark'.
     * @return a {@link ShiftWorkCloudPcAccessState}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The getShiftWorkCloudPcAccessState API is deprecated and will stop returning data on Dec 31, 2023. Please use the new getFrontlineCloudPcAccessState API as of 2023-08/getShiftWorkCloudPcAccessState
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-getshiftworkcloudpcaccessstate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ShiftWorkCloudPcAccessState get() {
        return get(null);
    }
    /**
     * Get the shiftWorkCloudPcAccessState of a shift work Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest shift work Cloud PC accessState and determine whether the shift work Cloud PC is accessible to the user.  If a web client needs to connect to a shift work Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState is not active/activating/standbyMode, the web client shows a 'bad bookmark'.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShiftWorkCloudPcAccessState}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The getShiftWorkCloudPcAccessState API is deprecated and will stop returning data on Dec 31, 2023. Please use the new getFrontlineCloudPcAccessState API as of 2023-08/getShiftWorkCloudPcAccessState
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-getshiftworkcloudpcaccessstate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ShiftWorkCloudPcAccessState get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendEnum(requestInfo, errorMapping, ShiftWorkCloudPcAccessState::forValue);
    }
    /**
     * Get the shiftWorkCloudPcAccessState of a shift work Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest shift work Cloud PC accessState and determine whether the shift work Cloud PC is accessible to the user.  If a web client needs to connect to a shift work Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState is not active/activating/standbyMode, the web client shows a 'bad bookmark'.
     * @return a {@link RequestInformation}
     * @deprecated
     * The getShiftWorkCloudPcAccessState API is deprecated and will stop returning data on Dec 31, 2023. Please use the new getFrontlineCloudPcAccessState API as of 2023-08/getShiftWorkCloudPcAccessState
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the shiftWorkCloudPcAccessState of a shift work Cloud PC.  This API only supports shared-use licenses. For more information, see cloudPcProvisioningPolicy. Shared-use licenses allow three users per license, with one user signed in at a time. Callers can get the latest shift work Cloud PC accessState and determine whether the shift work Cloud PC is accessible to the user.  If a web client needs to connect to a shift work Cloud PC, the sharedCloudPcAccessState validates the bookmark scenario. If sharedCloudPcAccessState is not active/activating/standbyMode, the web client shows a 'bad bookmark'.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The getShiftWorkCloudPcAccessState API is deprecated and will stop returning data on Dec 31, 2023. Please use the new getFrontlineCloudPcAccessState API as of 2023-08/getShiftWorkCloudPcAccessState
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetShiftWorkCloudPcAccessStateRequestBuilder}
     * @deprecated
     * The getShiftWorkCloudPcAccessState API is deprecated and will stop returning data on Dec 31, 2023. Please use the new getFrontlineCloudPcAccessState API as of 2023-08/getShiftWorkCloudPcAccessState
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public GetShiftWorkCloudPcAccessStateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetShiftWorkCloudPcAccessStateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

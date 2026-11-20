package com.microsoft.graph.beta.users.item.cloudpcs.item.retrieveflexcloudpcconfigurationdetail;

import com.microsoft.graph.beta.models.CloudPcFlexConfigurationDetail;
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
 * Provides operations to call the retrieveFlexCloudPcConfigurationDetail method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveFlexCloudPcConfigurationDetailRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveFlexCloudPcConfigurationDetailRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveFlexCloudPcConfigurationDetailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/retrieveFlexCloudPcConfigurationDetail()", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveFlexCloudPcConfigurationDetailRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveFlexCloudPcConfigurationDetailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/retrieveFlexCloudPcConfigurationDetail()", rawUrl);
    }
    /**
     * Get Windows 365 Flex (formerly Windows 365 Frontline) configuration details for a Cloud PC, including license availability. The cloudPcFlexConfigurationDetail response indicates whether a Flex license is available, based on the service plan and concurrent-access group for the Cloud PC. This function retrieves license availability, not the power state of the Cloud PC. To retrieve its live access state, use retrieveFlexCloudPcAccessConfiguration.
     * @return a {@link CloudPcFlexConfigurationDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-retrieveflexcloudpcconfigurationdetail?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcFlexConfigurationDetail get() {
        return get(null);
    }
    /**
     * Get Windows 365 Flex (formerly Windows 365 Frontline) configuration details for a Cloud PC, including license availability. The cloudPcFlexConfigurationDetail response indicates whether a Flex license is available, based on the service plan and concurrent-access group for the Cloud PC. This function retrieves license availability, not the power state of the Cloud PC. To retrieve its live access state, use retrieveFlexCloudPcAccessConfiguration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcFlexConfigurationDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-retrieveflexcloudpcconfigurationdetail?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcFlexConfigurationDetail get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcFlexConfigurationDetail::createFromDiscriminatorValue);
    }
    /**
     * Get Windows 365 Flex (formerly Windows 365 Frontline) configuration details for a Cloud PC, including license availability. The cloudPcFlexConfigurationDetail response indicates whether a Flex license is available, based on the service plan and concurrent-access group for the Cloud PC. This function retrieves license availability, not the power state of the Cloud PC. To retrieve its live access state, use retrieveFlexCloudPcAccessConfiguration.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get Windows 365 Flex (formerly Windows 365 Frontline) configuration details for a Cloud PC, including license availability. The cloudPcFlexConfigurationDetail response indicates whether a Flex license is available, based on the service plan and concurrent-access group for the Cloud PC. This function retrieves license availability, not the power state of the Cloud PC. To retrieve its live access state, use retrieveFlexCloudPcAccessConfiguration.
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
     * @return a {@link RetrieveFlexCloudPcConfigurationDetailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveFlexCloudPcConfigurationDetailRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveFlexCloudPcConfigurationDetailRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

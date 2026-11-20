package com.microsoft.graph.beta.users.item.cloudpcs.item.retrieveflexcloudpcaccessconfiguration;

import com.microsoft.graph.beta.models.CloudPcFlexAccessConfiguration;
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
 * Provides operations to call the retrieveFlexCloudPcAccessConfiguration method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveFlexCloudPcAccessConfigurationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveFlexCloudPcAccessConfigurationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveFlexCloudPcAccessConfigurationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/retrieveFlexCloudPcAccessConfiguration()", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveFlexCloudPcAccessConfigurationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveFlexCloudPcAccessConfigurationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}/retrieveFlexCloudPcAccessConfiguration()", rawUrl);
    }
    /**
     * Get the current access configuration of a Windows 365 Flex (formerly Windows 365 Frontline) Cloud PC. The cloudPcFlexAccessConfiguration response contains the live accessState of the Cloud PC. Use the /me endpoint to retrieve the access configuration of a Cloud PC that belongs to the signed-in user. An administrator or application can use the /deviceManagement/virtualEndpoint endpoint to retrieve the access configuration of a targeted Cloud PC.
     * @return a {@link CloudPcFlexAccessConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-retrieveflexcloudpcaccessconfiguration?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcFlexAccessConfiguration get() {
        return get(null);
    }
    /**
     * Get the current access configuration of a Windows 365 Flex (formerly Windows 365 Frontline) Cloud PC. The cloudPcFlexAccessConfiguration response contains the live accessState of the Cloud PC. Use the /me endpoint to retrieve the access configuration of a Cloud PC that belongs to the signed-in user. An administrator or application can use the /deviceManagement/virtualEndpoint endpoint to retrieve the access configuration of a targeted Cloud PC.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcFlexAccessConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-retrieveflexcloudpcaccessconfiguration?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcFlexAccessConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcFlexAccessConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Get the current access configuration of a Windows 365 Flex (formerly Windows 365 Frontline) Cloud PC. The cloudPcFlexAccessConfiguration response contains the live accessState of the Cloud PC. Use the /me endpoint to retrieve the access configuration of a Cloud PC that belongs to the signed-in user. An administrator or application can use the /deviceManagement/virtualEndpoint endpoint to retrieve the access configuration of a targeted Cloud PC.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the current access configuration of a Windows 365 Flex (formerly Windows 365 Frontline) Cloud PC. The cloudPcFlexAccessConfiguration response contains the live accessState of the Cloud PC. Use the /me endpoint to retrieve the access configuration of a Cloud PC that belongs to the signed-in user. An administrator or application can use the /deviceManagement/virtualEndpoint endpoint to retrieve the access configuration of a targeted Cloud PC.
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
     * @return a {@link RetrieveFlexCloudPcAccessConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveFlexCloudPcAccessConfigurationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveFlexCloudPcAccessConfigurationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

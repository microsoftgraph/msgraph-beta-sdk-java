package com.microsoft.graph.beta.devicemanagement.virtualendpoint.externalpartners.item.configureagent;

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
 * Provides operations to call the configureAgent method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigureAgentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ConfigureAgentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigureAgentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/externalPartners/{cloudPcExternalPartner%2Did}/configureAgent", pathParameters);
    }
    /**
     * Instantiates a new {@link ConfigureAgentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigureAgentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/externalPartners/{cloudPcExternalPartner%2Did}/configureAgent", rawUrl);
    }
    /**
     * Configure the cloudPcExternalPartnerAgentSetting of the cloudPcExternalPartner object. This setting is used for RMM partner agent installation. RMM partners must contact the Microsoft team to complete onboarding and add the agent URL prefix to the allow list before using this API. If autoDeploymentEnabled is enabled, the new provisioned Cloud PC is triggered agent deployment automatically. Currently supports only Windows 365 Business Cloud PC.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcexternalpartner-configureagent?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ConfigureAgentPostRequestBody body) {
        post(body, null);
    }
    /**
     * Configure the cloudPcExternalPartnerAgentSetting of the cloudPcExternalPartner object. This setting is used for RMM partner agent installation. RMM partners must contact the Microsoft team to complete onboarding and add the agent URL prefix to the allow list before using this API. If autoDeploymentEnabled is enabled, the new provisioned Cloud PC is triggered agent deployment automatically. Currently supports only Windows 365 Business Cloud PC.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcexternalpartner-configureagent?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ConfigureAgentPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Configure the cloudPcExternalPartnerAgentSetting of the cloudPcExternalPartner object. This setting is used for RMM partner agent installation. RMM partners must contact the Microsoft team to complete onboarding and add the agent URL prefix to the allow list before using this API. If autoDeploymentEnabled is enabled, the new provisioned Cloud PC is triggered agent deployment automatically. Currently supports only Windows 365 Business Cloud PC.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfigureAgentPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Configure the cloudPcExternalPartnerAgentSetting of the cloudPcExternalPartner object. This setting is used for RMM partner agent installation. RMM partners must contact the Microsoft team to complete onboarding and add the agent URL prefix to the allow list before using this API. If autoDeploymentEnabled is enabled, the new provisioned Cloud PC is triggered agent deployment automatically. Currently supports only Windows 365 Business Cloud PC.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfigureAgentPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ConfigureAgentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigureAgentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConfigureAgentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

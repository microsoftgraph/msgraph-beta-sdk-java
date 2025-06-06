package com.microsoft.graph.beta.admin.windows.updates.deployments.item.audience.microsoftgraphwindowsupdatesupdateaudience;

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
 * Provides operations to call the updateAudience method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/deployments/{deployment%2Did}/audience/microsoft.graph.windowsUpdates.updateAudience", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/deployments/{deployment%2Did}/audience/microsoft.graph.windowsUpdates.updateAudience", rawUrl);
    }
    /**
     * Update the members and exclusions relationships of a deploymentAudience. Adding an azureADDevice to the members or exclusions collections of a deployment audience automatically creates a Microsoft Entra device object, if it doesn&apos;t already exist. If the same updatableAsset gets included in the exclusions and members collections of a deploymentAudience, the deployment doesn&apos;t apply to that asset. If all updatableAsset objects are the same type, you can also use the method updateAudienceById to update the deploymentAudience.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-deploymentaudience-updateaudience?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final UpdateAudiencePostRequestBody body) {
        post(body, null);
    }
    /**
     * Update the members and exclusions relationships of a deploymentAudience. Adding an azureADDevice to the members or exclusions collections of a deployment audience automatically creates a Microsoft Entra device object, if it doesn&apos;t already exist. If the same updatableAsset gets included in the exclusions and members collections of a deploymentAudience, the deployment doesn&apos;t apply to that asset. If all updatableAsset objects are the same type, you can also use the method updateAudienceById to update the deploymentAudience.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-deploymentaudience-updateaudience?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final UpdateAudiencePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Update the members and exclusions relationships of a deploymentAudience. Adding an azureADDevice to the members or exclusions collections of a deployment audience automatically creates a Microsoft Entra device object, if it doesn&apos;t already exist. If the same updatableAsset gets included in the exclusions and members collections of a deploymentAudience, the deployment doesn&apos;t apply to that asset. If all updatableAsset objects are the same type, you can also use the method updateAudienceById to update the deploymentAudience.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateAudiencePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Update the members and exclusions relationships of a deploymentAudience. Adding an azureADDevice to the members or exclusions collections of a deployment audience automatically creates a Microsoft Entra device object, if it doesn&apos;t already exist. If the same updatableAsset gets included in the exclusions and members collections of a deploymentAudience, the deployment doesn&apos;t apply to that asset. If all updatableAsset objects are the same type, you can also use the method updateAudienceById to update the deploymentAudience.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateAudiencePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

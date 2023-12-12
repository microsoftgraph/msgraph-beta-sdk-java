package com.microsoft.graph.onpremisespublishingprofiles.item.publishedresources.item.agentgroups.item;

import com.microsoft.graph.onpremisespublishingprofiles.item.publishedresources.item.agentgroups.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /onPremisesPublishingProfiles/{onPremisesPublishingProfile-id}/publishedResources/{publishedResource-id}/agentGroups/{onPremisesAgentGroup-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesAgentGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of onPremisesPublishingProfile entities.
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OnPremisesAgentGroupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnPremisesAgentGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/publishedResources/{publishedResource%2Did}/agentGroups/{onPremisesAgentGroup%2Did}", pathParameters);
    }
    /**
     * Instantiates a new OnPremisesAgentGroupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnPremisesAgentGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/publishedResources/{publishedResource%2Did}/agentGroups/{onPremisesAgentGroup%2Did}", rawUrl);
    }
}

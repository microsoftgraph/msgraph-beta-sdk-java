package microsoft.graph.onpremisespublishingprofiles.item.publishedresources.item.agentgroups.item;

import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import microsoft.graph.onpremisespublishingprofiles.item.publishedresources.item.agentgroups.item.ref.RefRequestBuilder;
/** Builds and executes requests for operations under /onPremisesPublishingProfiles/{onPremisesPublishingProfile-id}/publishedResources/{publishedResource-id}/agentGroups/{onPremisesAgentGroup-id} */
public class OnPremisesAgentGroupItemRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The Ref property */
    @javax.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new OnPremisesAgentGroupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public OnPremisesAgentGroupItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/publishedResources/{publishedResource%2Did}/agentGroups/{onPremisesAgentGroup%2Did}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new OnPremisesAgentGroupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public OnPremisesAgentGroupItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/publishedResources/{publishedResource%2Did}/agentGroups/{onPremisesAgentGroup%2Did}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}

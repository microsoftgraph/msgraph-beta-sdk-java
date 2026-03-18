package com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.microsoftgraphidentitygovernancepreviewtaskfailures;

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
 * Provides operations to call the previewTaskFailures method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.previewTaskFailures", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.previewTaskFailures", rawUrl);
    }
    /**
     * Invoke action previewTaskFailures
     * @return a {@link PreviewTaskFailuresPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2025-01/PrivatePreview:organizationalUnit on 2025-08-12 and will be removed 2026-02-28
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PreviewTaskFailuresPostResponse post() {
        return post(null);
    }
    /**
     * Invoke action previewTaskFailures
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PreviewTaskFailuresPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2025-01/PrivatePreview:organizationalUnit on 2025-08-12 and will be removed 2026-02-28
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PreviewTaskFailuresPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PreviewTaskFailuresPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke action previewTaskFailures
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2025-01/PrivatePreview:organizationalUnit on 2025-08-12 and will be removed 2026-02-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Invoke action previewTaskFailures
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2025-01/PrivatePreview:organizationalUnit on 2025-08-12 and will be removed 2026-02-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder}
     * @deprecated
     *  as of 2025-01/PrivatePreview:organizationalUnit on 2025-08-12 and will be removed 2026-02-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

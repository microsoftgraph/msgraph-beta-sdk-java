package com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.item.retrievepolicyupdatestatusresult;

import com.microsoft.graph.beta.models.CloudPcPolicyPendingApplyStatusResult;
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
 * Provides operations to call the retrievePolicyUpdateStatusResult method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrievePolicyUpdateStatusResultRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrievePolicyUpdateStatusResultRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrievePolicyUpdateStatusResultRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies/{cloudPcProvisioningPolicy%2Did}/retrievePolicyUpdateStatusResult()", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrievePolicyUpdateStatusResultRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrievePolicyUpdateStatusResultRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies/{cloudPcProvisioningPolicy%2Did}/retrievePolicyUpdateStatusResult()", rawUrl);
    }
    /**
     * Retrieve the pending apply status of a provisioning policy to determine whether unapplied changes exist for Cloud PCs.
     * @return a {@link CloudPcPolicyPendingApplyStatusResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-retrievepolicyupdatestatusresult?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcPolicyPendingApplyStatusResult get() {
        return get(null);
    }
    /**
     * Retrieve the pending apply status of a provisioning policy to determine whether unapplied changes exist for Cloud PCs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcPolicyPendingApplyStatusResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-retrievepolicyupdatestatusresult?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcPolicyPendingApplyStatusResult get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcPolicyPendingApplyStatusResult::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the pending apply status of a provisioning policy to determine whether unapplied changes exist for Cloud PCs.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the pending apply status of a provisioning policy to determine whether unapplied changes exist for Cloud PCs.
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
     * @return a {@link RetrievePolicyUpdateStatusResultRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrievePolicyUpdateStatusResultRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrievePolicyUpdateStatusResultRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

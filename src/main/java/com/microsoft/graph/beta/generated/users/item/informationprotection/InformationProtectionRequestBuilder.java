package com.microsoft.graph.beta.users.item.informationprotection;

import com.microsoft.graph.beta.models.InformationProtection;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.users.item.informationprotection.bitlocker.BitlockerRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.datalosspreventionpolicies.DataLossPreventionPoliciesRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.decryptbuffer.DecryptBufferRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.encryptbuffer.EncryptBufferRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.policy.PolicyRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.sensitivitylabels.SensitivityLabelsRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.sensitivitypolicysettings.SensitivityPolicySettingsRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.signdigest.SignDigestRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.threatassessmentrequests.ThreatAssessmentRequestsRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.verifysignature.VerifySignatureRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the informationProtection property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationProtectionRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the bitlocker property of the microsoft.graph.informationProtection entity.
     * @return a {@link BitlockerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BitlockerRequestBuilder bitlocker() {
        return new BitlockerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dataLossPreventionPolicies property of the microsoft.graph.informationProtection entity.
     * @return a {@link DataLossPreventionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataLossPreventionPoliciesRequestBuilder dataLossPreventionPolicies() {
        return new DataLossPreventionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the decryptBuffer method.
     * @return a {@link DecryptBufferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DecryptBufferRequestBuilder decryptBuffer() {
        return new DecryptBufferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the encryptBuffer method.
     * @return a {@link EncryptBufferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EncryptBufferRequestBuilder encryptBuffer() {
        return new EncryptBufferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the policy property of the microsoft.graph.informationProtection entity.
     * @return a {@link PolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PolicyRequestBuilder policy() {
        return new PolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sensitivityLabels property of the microsoft.graph.informationProtection entity.
     * @return a {@link SensitivityLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SensitivityLabelsRequestBuilder sensitivityLabels() {
        return new SensitivityLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sensitivityPolicySettings property of the microsoft.graph.informationProtection entity.
     * @return a {@link SensitivityPolicySettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SensitivityPolicySettingsRequestBuilder sensitivityPolicySettings() {
        return new SensitivityPolicySettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the signDigest method.
     * @return a {@link SignDigestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignDigestRequestBuilder signDigest() {
        return new SignDigestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatAssessmentRequests property of the microsoft.graph.informationProtection entity.
     * @return a {@link ThreatAssessmentRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThreatAssessmentRequestsRequestBuilder threatAssessmentRequests() {
        return new ThreatAssessmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the verifySignature method.
     * @return a {@link VerifySignatureRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifySignatureRequestBuilder verifySignature() {
        return new VerifySignatureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link InformationProtectionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InformationProtectionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/informationProtection{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link InformationProtectionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InformationProtectionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/informationProtection{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property informationProtection for users
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property informationProtection for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get informationProtection from users
     * @return a {@link InformationProtection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InformationProtection get() {
        return get(null);
    }
    /**
     * Get informationProtection from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InformationProtection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InformationProtection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InformationProtection::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property informationProtection in users
     * @param body The request body
     * @return a {@link InformationProtection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InformationProtection patch(@jakarta.annotation.Nonnull final InformationProtection body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property informationProtection in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InformationProtection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InformationProtection patch(@jakarta.annotation.Nonnull final InformationProtection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InformationProtection::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property informationProtection for users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property informationProtection for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Get informationProtection from users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get informationProtection from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property informationProtection in users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InformationProtection body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property informationProtection in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InformationProtection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link InformationProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InformationProtectionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InformationProtectionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get informationProtection from users
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

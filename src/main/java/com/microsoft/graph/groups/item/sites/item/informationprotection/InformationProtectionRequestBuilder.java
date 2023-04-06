package com.microsoft.graph.groups.item.sites.item.informationprotection;

import com.microsoft.graph.groups.item.sites.item.informationprotection.bitlocker.BitlockerRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.datalosspreventionpolicies.DataLossPreventionPoliciesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.datalosspreventionpolicies.item.DataLossPreventionPolicyItemRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.decryptbuffer.DecryptBufferRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.encryptbuffer.EncryptBufferRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.policy.PolicyRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.sensitivitylabels.item.SensitivityLabelItemRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.sensitivitylabels.SensitivityLabelsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.sensitivitypolicysettings.SensitivityPolicySettingsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.signdigest.SignDigestRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.threatassessmentrequests.item.ThreatAssessmentRequestItemRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.threatassessmentrequests.ThreatAssessmentRequestsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.informationprotection.verifysignature.VerifySignatureRequestBuilder;
import com.microsoft.graph.models.InformationProtection;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the informationProtection property of the microsoft.graph.site entity.
 */
public class InformationProtectionRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the bitlocker property of the microsoft.graph.informationProtection entity. */
    @javax.annotation.Nonnull
    public BitlockerRequestBuilder bitlocker() {
        return new BitlockerRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the dataLossPreventionPolicies property of the microsoft.graph.informationProtection entity. */
    @javax.annotation.Nonnull
    public DataLossPreventionPoliciesRequestBuilder dataLossPreventionPolicies() {
        return new DataLossPreventionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the decryptBuffer method. */
    @javax.annotation.Nonnull
    public DecryptBufferRequestBuilder decryptBuffer() {
        return new DecryptBufferRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the encryptBuffer method. */
    @javax.annotation.Nonnull
    public EncryptBufferRequestBuilder encryptBuffer() {
        return new EncryptBufferRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the policy property of the microsoft.graph.informationProtection entity. */
    @javax.annotation.Nonnull
    public PolicyRequestBuilder policy() {
        return new PolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sensitivityLabels property of the microsoft.graph.informationProtection entity. */
    @javax.annotation.Nonnull
    public SensitivityLabelsRequestBuilder sensitivityLabels() {
        return new SensitivityLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sensitivityPolicySettings property of the microsoft.graph.informationProtection entity. */
    @javax.annotation.Nonnull
    public SensitivityPolicySettingsRequestBuilder sensitivityPolicySettings() {
        return new SensitivityPolicySettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the signDigest method. */
    @javax.annotation.Nonnull
    public SignDigestRequestBuilder signDigest() {
        return new SignDigestRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the threatAssessmentRequests property of the microsoft.graph.informationProtection entity. */
    @javax.annotation.Nonnull
    public ThreatAssessmentRequestsRequestBuilder threatAssessmentRequests() {
        return new ThreatAssessmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the verifySignature method. */
    @javax.annotation.Nonnull
    public VerifySignatureRequestBuilder verifySignature() {
        return new VerifySignatureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new InformationProtectionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtectionRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/informationProtection{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new InformationProtectionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtectionRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/informationProtection{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the dataLossPreventionPolicies property of the microsoft.graph.informationProtection entity.
     * @param id Unique identifier of the item
     * @return a DataLossPreventionPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DataLossPreventionPolicyItemRequestBuilder dataLossPreventionPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataLossPreventionPolicy%2Did", id);
        return new DataLossPreventionPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property informationProtection for groups
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property informationProtection for groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get informationProtection from groups
     * @return a CompletableFuture of informationProtection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InformationProtection> executionException = new java.util.concurrent.CompletableFuture<InformationProtection>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get informationProtection from groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of informationProtection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InformationProtection> executionException = new java.util.concurrent.CompletableFuture<InformationProtection>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property informationProtection in groups
     * @param body The request body
     * @return a CompletableFuture of informationProtection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> patch(@javax.annotation.Nonnull final InformationProtection body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InformationProtection> executionException = new java.util.concurrent.CompletableFuture<InformationProtection>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property informationProtection in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of informationProtection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> patch(@javax.annotation.Nonnull final InformationProtection body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InformationProtection> executionException = new java.util.concurrent.CompletableFuture<InformationProtection>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the sensitivityLabels property of the microsoft.graph.informationProtection entity.
     * @param id Unique identifier of the item
     * @return a SensitivityLabelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SensitivityLabelItemRequestBuilder sensitivityLabels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sensitivityLabel%2Did", id);
        return new SensitivityLabelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the threatAssessmentRequests property of the microsoft.graph.informationProtection entity.
     * @param id Unique identifier of the item
     * @return a ThreatAssessmentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ThreatAssessmentRequestItemRequestBuilder threatAssessmentRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("threatAssessmentRequest%2Did", id);
        return new ThreatAssessmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property informationProtection for groups
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property informationProtection for groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get informationProtection from groups
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get informationProtection from groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property informationProtection in groups
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final InformationProtection body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property informationProtection in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final InformationProtection body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get informationProtection from groups
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

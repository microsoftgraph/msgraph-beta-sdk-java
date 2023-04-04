package com.microsoft.graph.security.threatsubmission;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.ThreatSubmissionRoot;
import com.microsoft.graph.security.threatsubmission.emailthreats.EmailThreatsRequestBuilder;
import com.microsoft.graph.security.threatsubmission.emailthreats.item.EmailThreatSubmissionItemRequestBuilder;
import com.microsoft.graph.security.threatsubmission.emailthreatsubmissionpolicies.EmailThreatSubmissionPoliciesRequestBuilder;
import com.microsoft.graph.security.threatsubmission.emailthreatsubmissionpolicies.item.EmailThreatSubmissionPolicyItemRequestBuilder;
import com.microsoft.graph.security.threatsubmission.filethreats.FileThreatsRequestBuilder;
import com.microsoft.graph.security.threatsubmission.filethreats.item.FileThreatSubmissionItemRequestBuilder;
import com.microsoft.graph.security.threatsubmission.urlthreats.item.UrlThreatSubmissionItemRequestBuilder;
import com.microsoft.graph.security.threatsubmission.urlthreats.UrlThreatsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the threatSubmission property of the microsoft.graph.security entity.
 */
public class ThreatSubmissionRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the emailThreats property of the microsoft.graph.security.threatSubmissionRoot entity. */
    @javax.annotation.Nonnull
    public EmailThreatsRequestBuilder emailThreats() {
        return new EmailThreatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the emailThreatSubmissionPolicies property of the microsoft.graph.security.threatSubmissionRoot entity. */
    @javax.annotation.Nonnull
    public EmailThreatSubmissionPoliciesRequestBuilder emailThreatSubmissionPolicies() {
        return new EmailThreatSubmissionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the fileThreats property of the microsoft.graph.security.threatSubmissionRoot entity. */
    @javax.annotation.Nonnull
    public FileThreatsRequestBuilder fileThreats() {
        return new FileThreatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the urlThreats property of the microsoft.graph.security.threatSubmissionRoot entity. */
    @javax.annotation.Nonnull
    public UrlThreatsRequestBuilder urlThreats() {
        return new UrlThreatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ThreatSubmissionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThreatSubmissionRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatSubmission{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ThreatSubmissionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThreatSubmissionRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatSubmission{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property threatSubmission for security
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property threatSubmission for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the emailThreats property of the microsoft.graph.security.threatSubmissionRoot entity.
     * @param id Unique identifier of the item
     * @return a EmailThreatSubmissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EmailThreatSubmissionItemRequestBuilder emailThreats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("emailThreatSubmission%2Did", id);
        return new EmailThreatSubmissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the emailThreatSubmissionPolicies property of the microsoft.graph.security.threatSubmissionRoot entity.
     * @param id Unique identifier of the item
     * @return a EmailThreatSubmissionPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EmailThreatSubmissionPolicyItemRequestBuilder emailThreatSubmissionPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("emailThreatSubmissionPolicy%2Did", id);
        return new EmailThreatSubmissionPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the fileThreats property of the microsoft.graph.security.threatSubmissionRoot entity.
     * @param id Unique identifier of the item
     * @return a FileThreatSubmissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FileThreatSubmissionItemRequestBuilder fileThreats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fileThreatSubmission%2Did", id);
        return new FileThreatSubmissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @return a CompletableFuture of threatSubmissionRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ThreatSubmissionRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> executionException = new java.util.concurrent.CompletableFuture<ThreatSubmissionRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of threatSubmissionRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ThreatSubmissionRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> executionException = new java.util.concurrent.CompletableFuture<ThreatSubmissionRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property threatSubmission in security
     * @param body The request body
     * @return a CompletableFuture of threatSubmissionRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> patch(@javax.annotation.Nonnull final ThreatSubmissionRoot body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ThreatSubmissionRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> executionException = new java.util.concurrent.CompletableFuture<ThreatSubmissionRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property threatSubmission in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of threatSubmissionRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> patch(@javax.annotation.Nonnull final ThreatSubmissionRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ThreatSubmissionRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ThreatSubmissionRoot> executionException = new java.util.concurrent.CompletableFuture<ThreatSubmissionRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property threatSubmission for security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property threatSubmission for security
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
     * A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
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
     * Update the navigation property threatSubmission in security
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ThreatSubmissionRoot body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property threatSubmission in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ThreatSubmissionRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to manage the urlThreats property of the microsoft.graph.security.threatSubmissionRoot entity.
     * @param id Unique identifier of the item
     * @return a UrlThreatSubmissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UrlThreatSubmissionItemRequestBuilder urlThreats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("urlThreatSubmission%2Did", id);
        return new UrlThreatSubmissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
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

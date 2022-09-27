package com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary;

import com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.manufacturerregression.ManufacturerRegressionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.modelregression.item.UserExperienceAnalyticsMetricItemRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.modelregression.ModelRegressionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.operatingsystemregression.OperatingSystemRegressionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.summarizedeviceregressionperformancewithsummarizeby.SummarizeDeviceRegressionPerformanceWithSummarizeByRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the userExperienceAnalyticsRegressionSummary property of the microsoft.graph.deviceManagement entity. */
public class UserExperienceAnalyticsRegressionSummaryRequestBuilder {
    /** The manufacturerRegression property */
    @javax.annotation.Nonnull
    public ManufacturerRegressionRequestBuilder manufacturerRegression() {
        return new ManufacturerRegressionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The modelRegression property */
    @javax.annotation.Nonnull
    public ModelRegressionRequestBuilder modelRegression() {
        return new ModelRegressionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The operatingSystemRegression property */
    @javax.annotation.Nonnull
    public OperatingSystemRegressionRequestBuilder operatingSystemRegression() {
        return new OperatingSystemRegressionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new UserExperienceAnalyticsRegressionSummaryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public UserExperienceAnalyticsRegressionSummaryRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/userExperienceAnalyticsRegressionSummary{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new UserExperienceAnalyticsRegressionSummaryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public UserExperienceAnalyticsRegressionSummaryRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/userExperienceAnalyticsRegressionSummary{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property userExperienceAnalyticsRegressionSummary for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property userExperienceAnalyticsRegressionSummary for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration requestConfig = new UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * User experience analytics regression summary
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * User experience analytics regression summary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration requestConfig = new UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property userExperienceAnalyticsRegressionSummary in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final UserExperienceAnalyticsRegressionSummary body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property userExperienceAnalyticsRegressionSummary in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final UserExperienceAnalyticsRegressionSummary body, @javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration requestConfig = new UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property userExperienceAnalyticsRegressionSummary for deviceManagement
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property userExperienceAnalyticsRegressionSummary for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property userExperienceAnalyticsRegressionSummary for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * User experience analytics regression summary
     * @return a CompletableFuture of userExperienceAnalyticsRegressionSummary
     */
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * User experience analytics regression summary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userExperienceAnalyticsRegressionSummary
     */
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> get(@javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * User experience analytics regression summary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of userExperienceAnalyticsRegressionSummary
     */
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> get(@javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.userExperienceAnalyticsRegressionSummary.manufacturerRegression.item collection
     * @param id Unique identifier of the item
     * @return a UserExperienceAnalyticsMetricItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.manufacturerregression.item.UserExperienceAnalyticsMetricItemRequestBuilder manufacturerRegression(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userExperienceAnalyticsMetric%2Did", id);
        return new com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.manufacturerregression.item.UserExperienceAnalyticsMetricItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.userExperienceAnalyticsRegressionSummary.modelRegression.item collection
     * @param id Unique identifier of the item
     * @return a UserExperienceAnalyticsMetricItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.modelregression.item.UserExperienceAnalyticsMetricItemRequestBuilder modelRegression(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userExperienceAnalyticsMetric%2Did", id);
        return new com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.modelregression.item.UserExperienceAnalyticsMetricItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.userExperienceAnalyticsRegressionSummary.operatingSystemRegression.item collection
     * @param id Unique identifier of the item
     * @return a UserExperienceAnalyticsMetricItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.operatingsystemregression.item.UserExperienceAnalyticsMetricItemRequestBuilder operatingSystemRegression(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userExperienceAnalyticsMetric%2Did", id);
        return new com.microsoft.graph.devicemanagement.userexperienceanalyticsregressionsummary.operatingsystemregression.item.UserExperienceAnalyticsMetricItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property userExperienceAnalyticsRegressionSummary in deviceManagement
     * @param body 
     * @return a CompletableFuture of userExperienceAnalyticsRegressionSummary
     */
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> patch(@javax.annotation.Nonnull final UserExperienceAnalyticsRegressionSummary body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property userExperienceAnalyticsRegressionSummary in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userExperienceAnalyticsRegressionSummary
     */
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> patch(@javax.annotation.Nonnull final UserExperienceAnalyticsRegressionSummary body, @javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property userExperienceAnalyticsRegressionSummary in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of userExperienceAnalyticsRegressionSummary
     */
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> patch(@javax.annotation.Nonnull final UserExperienceAnalyticsRegressionSummary body, @javax.annotation.Nullable final java.util.function.Consumer<UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Provides operations to call the summarizeDeviceRegressionPerformance method.
     * @param summarizeBy Usage: summarizeBy='{summarizeBy}'
     * @return a summarizeDeviceRegressionPerformanceWithSummarizeByRequestBuilder
     */
    @javax.annotation.Nonnull
    public SummarizeDeviceRegressionPerformanceWithSummarizeByRequestBuilder summarizeDeviceRegressionPerformanceWithSummarizeBy(@javax.annotation.Nonnull final String summarizeBy) {
        Objects.requireNonNull(summarizeBy);
        return new SummarizeDeviceRegressionPerformanceWithSummarizeByRequestBuilder(pathParameters, requestAdapter, summarizeBy);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new userExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserExperienceAnalyticsRegressionSummaryRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** User experience analytics regression summary */
    public class UserExperienceAnalyticsRegressionSummaryRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public UserExperienceAnalyticsRegressionSummaryRequestBuilderGetQueryParameters queryParameters = new UserExperienceAnalyticsRegressionSummaryRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new userExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserExperienceAnalyticsRegressionSummaryRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new userExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserExperienceAnalyticsRegressionSummaryRequestBuilderPatchRequestConfiguration() {
        }
    }
}

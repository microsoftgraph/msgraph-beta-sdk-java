package com.microsoft.graph.beta.users.item.informationprotection.policy.labels;

import com.microsoft.graph.beta.models.InformationProtectionLabel;
import com.microsoft.graph.beta.models.InformationProtectionLabelCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.users.item.informationprotection.policy.labels.count.CountRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.policy.labels.evaluateapplication.EvaluateApplicationRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.policy.labels.evaluateclassificationresults.EvaluateClassificationResultsRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.policy.labels.evaluateremoval.EvaluateRemovalRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.policy.labels.extractlabel.ExtractLabelRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.policy.labels.item.InformationProtectionLabelItemRequestBuilder;
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
 * Provides operations to manage the labels property of the microsoft.graph.informationProtectionPolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LabelsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the evaluateApplication method.
     * @return a {@link EvaluateApplicationRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public EvaluateApplicationRequestBuilder evaluateApplication() {
        return new EvaluateApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the evaluateClassificationResults method.
     * @return a {@link EvaluateClassificationResultsRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public EvaluateClassificationResultsRequestBuilder evaluateClassificationResults() {
        return new EvaluateClassificationResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the evaluateRemoval method.
     * @return a {@link EvaluateRemovalRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public EvaluateRemovalRequestBuilder evaluateRemoval() {
        return new EvaluateRemovalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the extractLabel method.
     * @return a {@link ExtractLabelRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ExtractLabelRequestBuilder extractLabel() {
        return new ExtractLabelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the labels property of the microsoft.graph.informationProtectionPolicy entity.
     * @param informationProtectionLabelId The unique identifier of informationProtectionLabel
     * @return a {@link InformationProtectionLabelItemRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public InformationProtectionLabelItemRequestBuilder byInformationProtectionLabelId(@jakarta.annotation.Nonnull final String informationProtectionLabelId) {
        Objects.requireNonNull(informationProtectionLabelId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("informationProtectionLabel%2Did", informationProtectionLabelId);
        return new InformationProtectionLabelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LabelsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LabelsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/informationProtection/policy/labels{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link LabelsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LabelsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/informationProtection/policy/labels{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a collection of information protection labels available to the user or to the organization.
     * @return a {@link InformationProtectionLabelCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     * @see <a href="https://learn.microsoft.com/graph/api/informationprotectionpolicy-list-labels?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InformationProtectionLabelCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a collection of information protection labels available to the user or to the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InformationProtectionLabelCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     * @see <a href="https://learn.microsoft.com/graph/api/informationprotectionpolicy-list-labels?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InformationProtectionLabelCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InformationProtectionLabelCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to labels for users
     * @param body The request body
     * @return a {@link InformationProtectionLabel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InformationProtectionLabel post(@jakarta.annotation.Nonnull final InformationProtectionLabel body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to labels for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InformationProtectionLabel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InformationProtectionLabel post(@jakarta.annotation.Nonnull final InformationProtectionLabel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InformationProtectionLabel::createFromDiscriminatorValue);
    }
    /**
     * Get a collection of information protection labels available to the user or to the organization.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a collection of information protection labels available to the user or to the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create new navigation property to labels for users
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InformationProtectionLabel body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to labels for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InformationProtectionLabel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link LabelsRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public LabelsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LabelsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a collection of information protection labels available to the user or to the organization.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

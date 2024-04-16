package com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item;

import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.lastindexoperation.LastIndexOperationRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.microsoftgraphediscoveryactivate.MicrosoftGraphEdiscoveryActivateRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.microsoftgraphediscoveryapplyhold.MicrosoftGraphEdiscoveryApplyHoldRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.microsoftgraphediscoveryrelease.MicrosoftGraphEdiscoveryReleaseRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.microsoftgraphediscoveryremovehold.MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.microsoftgraphediscoveryupdateindex.MicrosoftGraphEdiscoveryUpdateIndexRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.sitesources.SiteSourcesRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.unifiedgroupsources.UnifiedGroupSourcesRequestBuilder;
import com.microsoft.graph.beta.compliance.ediscovery.cases.item.custodians.item.usersources.UserSourcesRequestBuilder;
import com.microsoft.graph.beta.models.ediscovery.Custodian;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the custodians property of the microsoft.graph.ediscovery.case entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustodianItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the lastIndexOperation property of the microsoft.graph.ediscovery.dataSourceContainer entity.
     * @return a {@link LastIndexOperationRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public LastIndexOperationRequestBuilder lastIndexOperation() {
        return new LastIndexOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the activate method.
     * @return a {@link MicrosoftGraphEdiscoveryActivateRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryActivateRequestBuilder microsoftGraphEdiscoveryActivate() {
        return new MicrosoftGraphEdiscoveryActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyHold method.
     * @return a {@link MicrosoftGraphEdiscoveryApplyHoldRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryApplyHoldRequestBuilder microsoftGraphEdiscoveryApplyHold() {
        return new MicrosoftGraphEdiscoveryApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the release method.
     * @return a {@link MicrosoftGraphEdiscoveryReleaseRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryReleaseRequestBuilder microsoftGraphEdiscoveryRelease() {
        return new MicrosoftGraphEdiscoveryReleaseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeHold method.
     * @return a {@link MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder microsoftGraphEdiscoveryRemoveHold() {
        return new MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateIndex method.
     * @return a {@link MicrosoftGraphEdiscoveryUpdateIndexRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryUpdateIndexRequestBuilder microsoftGraphEdiscoveryUpdateIndex() {
        return new MicrosoftGraphEdiscoveryUpdateIndexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the siteSources property of the microsoft.graph.ediscovery.custodian entity.
     * @return a {@link SiteSourcesRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public SiteSourcesRequestBuilder siteSources() {
        return new SiteSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the unifiedGroupSources property of the microsoft.graph.ediscovery.custodian entity.
     * @return a {@link UnifiedGroupSourcesRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public UnifiedGroupSourcesRequestBuilder unifiedGroupSources() {
        return new UnifiedGroupSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userSources property of the microsoft.graph.ediscovery.custodian entity.
     * @return a {@link UserSourcesRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public UserSourcesRequestBuilder userSources() {
        return new UserSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CustodianItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustodianItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/custodians/{custodian%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CustodianItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustodianItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/custodians/{custodian%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property custodians for compliance
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property custodians for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a custodian object.
     * @return a {@link Custodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-custodian-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Custodian get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a custodian object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Custodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-custodian-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Custodian get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Custodian::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a custodian object.
     * @param body The request body
     * @return a {@link Custodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-custodian-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Custodian patch(@jakarta.annotation.Nonnull final Custodian body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a custodian object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Custodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-custodian-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Custodian patch(@jakarta.annotation.Nonnull final Custodian body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Custodian::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property custodians for compliance
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property custodians for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a custodian object.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a custodian object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
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
     * Update the properties of a custodian object.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Custodian body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a custodian object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Custodian body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CustodianItemRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CustodianItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustodianItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a custodian object.
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

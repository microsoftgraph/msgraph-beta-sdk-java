package com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item;

import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.createdby.CreatedByRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.lastmodifiedby.LastModifiedByRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.microsoftgraphidentitygovernancerestore.MicrosoftGraphIdentityGovernanceRestoreRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.rules.RulesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.lifecycleworkflows.deleteditems.lifecyclepolicies.item.versions.VersionsRequestBuilder;
import com.microsoft.graph.beta.models.identitygovernance.LifecyclePolicy;
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
 * Provides operations to manage the lifecyclePolicies property of the microsoft.graph.deletedItemContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the createdBy property of the microsoft.graph.identityGovernance.lifecyclePolicy entity.
     * @return a {@link CreatedByRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CreatedByRequestBuilder createdBy() {
        return new CreatedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedBy property of the microsoft.graph.identityGovernance.lifecyclePolicy entity.
     * @return a {@link LastModifiedByRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public LastModifiedByRequestBuilder lastModifiedBy() {
        return new LastModifiedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link MicrosoftGraphIdentityGovernanceRestoreRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceRestoreRequestBuilder microsoftGraphIdentityGovernanceRestore() {
        return new MicrosoftGraphIdentityGovernanceRestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rules property of the microsoft.graph.identityGovernance.lifecyclePolicy entity.
     * @return a {@link RulesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public RulesRequestBuilder rules() {
        return new RulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.identityGovernance.lifecyclePolicy entity.
     * @return a {@link VersionsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link LifecyclePolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LifecyclePolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/lifecyclePolicies/{lifecyclePolicy%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link LifecyclePolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LifecyclePolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/lifecyclePolicies/{lifecyclePolicy%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property lifecyclePolicies for identityGovernance
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property lifecyclePolicies for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get lifecyclePolicies from identityGovernance
     * @return a {@link LifecyclePolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicy get() {
        return get(null);
    }
    /**
     * Get lifecyclePolicies from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LifecyclePolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public LifecyclePolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LifecyclePolicy::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property lifecyclePolicies for identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property lifecyclePolicies for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
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
     * Get lifecyclePolicies from identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get lifecyclePolicies from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link LifecyclePolicyItemRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public LifecyclePolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LifecyclePolicyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get lifecyclePolicies from identityGovernance
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
}

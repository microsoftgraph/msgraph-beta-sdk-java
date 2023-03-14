package com.microsoft.graph.directory;

import com.microsoft.graph.directory.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.AdministrativeUnitItemRequestBuilder;
import com.microsoft.graph.directory.attributesets.AttributeSetsRequestBuilder;
import com.microsoft.graph.directory.attributesets.item.AttributeSetItemRequestBuilder;
import com.microsoft.graph.directory.customsecurityattributedefinitions.CustomSecurityAttributeDefinitionsRequestBuilder;
import com.microsoft.graph.directory.customsecurityattributedefinitions.item.CustomSecurityAttributeDefinitionItemRequestBuilder;
import com.microsoft.graph.directory.deleteditems.DeletedItemsRequestBuilder;
import com.microsoft.graph.directory.deleteditems.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.directory.featurerolloutpolicies.FeatureRolloutPoliciesRequestBuilder;
import com.microsoft.graph.directory.featurerolloutpolicies.item.FeatureRolloutPolicyItemRequestBuilder;
import com.microsoft.graph.directory.federationconfigurations.FederationConfigurationsRequestBuilder;
import com.microsoft.graph.directory.federationconfigurations.item.IdentityProviderBaseItemRequestBuilder;
import com.microsoft.graph.directory.impactedresources.ImpactedResourcesRequestBuilder;
import com.microsoft.graph.directory.impactedresources.item.ImpactedResourceItemRequestBuilder;
import com.microsoft.graph.directory.inboundshareduserprofiles.InboundSharedUserProfilesRequestBuilder;
import com.microsoft.graph.directory.inboundshareduserprofiles.item.InboundSharedUserProfileUserItemRequestBuilder;
import com.microsoft.graph.directory.onpremisessynchronization.item.OnPremisesDirectorySynchronizationItemRequestBuilder;
import com.microsoft.graph.directory.onpremisessynchronization.OnPremisesSynchronizationRequestBuilder;
import com.microsoft.graph.directory.outboundshareduserprofiles.item.OutboundSharedUserProfileUserItemRequestBuilder;
import com.microsoft.graph.directory.outboundshareduserprofiles.OutboundSharedUserProfilesRequestBuilder;
import com.microsoft.graph.directory.recommendations.item.RecommendationItemRequestBuilder;
import com.microsoft.graph.directory.recommendations.RecommendationsRequestBuilder;
import com.microsoft.graph.directory.sharedemaildomains.item.SharedEmailDomainItemRequestBuilder;
import com.microsoft.graph.directory.sharedemaildomains.SharedEmailDomainsRequestBuilder;
import com.microsoft.graph.models.Directory;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the directory singleton.
 */
public class DirectoryRequestBuilder {
    /** Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the attributeSets property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public AttributeSetsRequestBuilder attributeSets() {
        return new AttributeSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the customSecurityAttributeDefinitions property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public CustomSecurityAttributeDefinitionsRequestBuilder customSecurityAttributeDefinitions() {
        return new CustomSecurityAttributeDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deletedItems property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public FeatureRolloutPoliciesRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the federationConfigurations property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public FederationConfigurationsRequestBuilder federationConfigurations() {
        return new FederationConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the impactedResources property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public ImpactedResourcesRequestBuilder impactedResources() {
        return new ImpactedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the inboundSharedUserProfiles property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public InboundSharedUserProfilesRequestBuilder inboundSharedUserProfiles() {
        return new InboundSharedUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the onPremisesSynchronization property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public OnPremisesSynchronizationRequestBuilder onPremisesSynchronization() {
        return new OnPremisesSynchronizationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the outboundSharedUserProfiles property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public OutboundSharedUserProfilesRequestBuilder outboundSharedUserProfiles() {
        return new OutboundSharedUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the recommendations property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public RecommendationsRequestBuilder recommendations() {
        return new RecommendationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the sharedEmailDomains property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public SharedEmailDomainsRequestBuilder sharedEmailDomains() {
        return new SharedEmailDomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a AdministrativeUnitItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AdministrativeUnitItemRequestBuilder administrativeUnits(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("administrativeUnit%2Did", id);
        return new AdministrativeUnitItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the attributeSets property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a AttributeSetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AttributeSetItemRequestBuilder attributeSets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attributeSet%2Did", id);
        return new AttributeSetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/directory{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/directory{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Provides operations to manage the customSecurityAttributeDefinitions property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a CustomSecurityAttributeDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomSecurityAttributeDefinitionItemRequestBuilder customSecurityAttributeDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customSecurityAttributeDefinition%2Did", id);
        return new CustomSecurityAttributeDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the deletedItems property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder deletedItems(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a FeatureRolloutPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FeatureRolloutPolicyItemRequestBuilder featureRolloutPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("featureRolloutPolicy%2Did", id);
        return new FeatureRolloutPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the federationConfigurations property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a IdentityProviderBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderBaseItemRequestBuilder federationConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProviderBase%2Did", id);
        return new IdentityProviderBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get directory
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Directory> executionException = new java.util.concurrent.CompletableFuture<Directory>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Directory> executionException = new java.util.concurrent.CompletableFuture<Directory>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the impactedResources property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a ImpactedResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ImpactedResourceItemRequestBuilder impactedResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("impactedResource%2Did", id);
        return new ImpactedResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the inboundSharedUserProfiles property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a InboundSharedUserProfileUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public InboundSharedUserProfileUserItemRequestBuilder inboundSharedUserProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("inboundSharedUserProfile%2DuserId", id);
        return new InboundSharedUserProfileUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the onPremisesSynchronization property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a OnPremisesDirectorySynchronizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnPremisesDirectorySynchronizationItemRequestBuilder onPremisesSynchronization(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onPremisesDirectorySynchronization%2Did", id);
        return new OnPremisesDirectorySynchronizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the outboundSharedUserProfiles property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a OutboundSharedUserProfileUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OutboundSharedUserProfileUserItemRequestBuilder outboundSharedUserProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("outboundSharedUserProfile%2DuserId", id);
        return new OutboundSharedUserProfileUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update directory
     * @param body The request body
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patch(@javax.annotation.Nonnull final Directory body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Directory> executionException = new java.util.concurrent.CompletableFuture<Directory>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patch(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Directory> executionException = new java.util.concurrent.CompletableFuture<Directory>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the recommendations property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a RecommendationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RecommendationItemRequestBuilder recommendations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("recommendation%2Did", id);
        return new RecommendationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the sharedEmailDomains property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a SharedEmailDomainItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SharedEmailDomainItemRequestBuilder sharedEmailDomains(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharedEmailDomain%2Did", id);
        return new SharedEmailDomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get directory
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get directory
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
     * Update directory
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Directory body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get directory
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}

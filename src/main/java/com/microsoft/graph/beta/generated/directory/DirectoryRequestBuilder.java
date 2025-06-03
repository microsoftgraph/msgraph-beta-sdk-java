package com.microsoft.graph.beta.directory;

import com.microsoft.graph.beta.directory.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.beta.directory.attributesets.AttributeSetsRequestBuilder;
import com.microsoft.graph.beta.directory.authenticationmethoddevices.AuthenticationMethodDevicesRequestBuilder;
import com.microsoft.graph.beta.directory.certificateauthorities.CertificateAuthoritiesRequestBuilder;
import com.microsoft.graph.beta.directory.customsecurityattributedefinitions.CustomSecurityAttributeDefinitionsRequestBuilder;
import com.microsoft.graph.beta.directory.deleteditems.DeletedItemsRequestBuilder;
import com.microsoft.graph.beta.directory.devicelocalcredentials.DeviceLocalCredentialsRequestBuilder;
import com.microsoft.graph.beta.directory.externaluserprofiles.ExternalUserProfilesRequestBuilder;
import com.microsoft.graph.beta.directory.featurerolloutpolicies.FeatureRolloutPoliciesRequestBuilder;
import com.microsoft.graph.beta.directory.federationconfigurations.FederationConfigurationsRequestBuilder;
import com.microsoft.graph.beta.directory.impactedresources.ImpactedResourcesRequestBuilder;
import com.microsoft.graph.beta.directory.inboundshareduserprofiles.InboundSharedUserProfilesRequestBuilder;
import com.microsoft.graph.beta.directory.onpremisessynchronization.OnPremisesSynchronizationRequestBuilder;
import com.microsoft.graph.beta.directory.outboundshareduserprofiles.OutboundSharedUserProfilesRequestBuilder;
import com.microsoft.graph.beta.directory.pendingexternaluserprofiles.PendingExternalUserProfilesRequestBuilder;
import com.microsoft.graph.beta.directory.publickeyinfrastructure.PublicKeyInfrastructureRequestBuilder;
import com.microsoft.graph.beta.directory.recommendationconfiguration.RecommendationConfigurationRequestBuilder;
import com.microsoft.graph.beta.directory.recommendations.RecommendationsRequestBuilder;
import com.microsoft.graph.beta.directory.sharedemaildomains.SharedEmailDomainsRequestBuilder;
import com.microsoft.graph.beta.directory.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.beta.directory.subscriptionswithcommercesubscriptionid.SubscriptionsWithCommerceSubscriptionIdRequestBuilder;
import com.microsoft.graph.beta.directory.subscriptionswithocpsubscriptionid.SubscriptionsWithOcpSubscriptionIdRequestBuilder;
import com.microsoft.graph.beta.directory.templates.TemplatesRequestBuilder;
import com.microsoft.graph.beta.models.Directory;
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
 * Provides operations to manage the directory singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity.
     * @return a {@link AdministrativeUnitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attributeSets property of the microsoft.graph.directory entity.
     * @return a {@link AttributeSetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttributeSetsRequestBuilder attributeSets() {
        return new AttributeSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethodDevices property of the microsoft.graph.directory entity.
     * @return a {@link AuthenticationMethodDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodDevicesRequestBuilder authenticationMethodDevices() {
        return new AuthenticationMethodDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the certificateAuthorities property of the microsoft.graph.directory entity.
     * @return a {@link CertificateAuthoritiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CertificateAuthoritiesRequestBuilder certificateAuthorities() {
        return new CertificateAuthoritiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customSecurityAttributeDefinitions property of the microsoft.graph.directory entity.
     * @return a {@link CustomSecurityAttributeDefinitionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomSecurityAttributeDefinitionsRequestBuilder customSecurityAttributeDefinitions() {
        return new CustomSecurityAttributeDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deletedItems property of the microsoft.graph.directory entity.
     * @return a {@link DeletedItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceLocalCredentials property of the microsoft.graph.directory entity.
     * @return a {@link DeviceLocalCredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceLocalCredentialsRequestBuilder deviceLocalCredentials() {
        return new DeviceLocalCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the externalUserProfiles property of the microsoft.graph.directory entity.
     * @return a {@link ExternalUserProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExternalUserProfilesRequestBuilder externalUserProfiles() {
        return new ExternalUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.directory entity.
     * @return a {@link FeatureRolloutPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeatureRolloutPoliciesRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the federationConfigurations property of the microsoft.graph.directory entity.
     * @return a {@link FederationConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FederationConfigurationsRequestBuilder federationConfigurations() {
        return new FederationConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the impactedResources property of the microsoft.graph.directory entity.
     * @return a {@link ImpactedResourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImpactedResourcesRequestBuilder impactedResources() {
        return new ImpactedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inboundSharedUserProfiles property of the microsoft.graph.directory entity.
     * @return a {@link InboundSharedUserProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InboundSharedUserProfilesRequestBuilder inboundSharedUserProfiles() {
        return new InboundSharedUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onPremisesSynchronization property of the microsoft.graph.directory entity.
     * @return a {@link OnPremisesSynchronizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnPremisesSynchronizationRequestBuilder onPremisesSynchronization() {
        return new OnPremisesSynchronizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the outboundSharedUserProfiles property of the microsoft.graph.directory entity.
     * @return a {@link OutboundSharedUserProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutboundSharedUserProfilesRequestBuilder outboundSharedUserProfiles() {
        return new OutboundSharedUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pendingExternalUserProfiles property of the microsoft.graph.directory entity.
     * @return a {@link PendingExternalUserProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PendingExternalUserProfilesRequestBuilder pendingExternalUserProfiles() {
        return new PendingExternalUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the publicKeyInfrastructure property of the microsoft.graph.directory entity.
     * @return a {@link PublicKeyInfrastructureRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublicKeyInfrastructureRequestBuilder publicKeyInfrastructure() {
        return new PublicKeyInfrastructureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the recommendationConfiguration property of the microsoft.graph.directory entity.
     * @return a {@link RecommendationConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecommendationConfigurationRequestBuilder recommendationConfiguration() {
        return new RecommendationConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the recommendations property of the microsoft.graph.directory entity.
     * @return a {@link RecommendationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecommendationsRequestBuilder recommendations() {
        return new RecommendationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharedEmailDomains property of the microsoft.graph.directory entity.
     * @return a {@link SharedEmailDomainsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharedEmailDomainsRequestBuilder sharedEmailDomains() {
        return new SharedEmailDomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subscriptions property of the microsoft.graph.directory entity.
     * @return a {@link SubscriptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templates property of the microsoft.graph.directory entity.
     * @return a {@link TemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemplatesRequestBuilder templates() {
        return new TemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DirectoryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DirectoryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get directory
     * @return a {@link Directory}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Directory get() {
        return get(null);
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Directory}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Directory get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Directory::createFromDiscriminatorValue);
    }
    /**
     * Update directory
     * @param body The request body
     * @return a {@link Directory}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Directory patch(@jakarta.annotation.Nonnull final Directory body) {
        return patch(body, null);
    }
    /**
     * Update directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Directory}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Directory patch(@jakarta.annotation.Nonnull final Directory body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Directory::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the subscriptions property of the microsoft.graph.directory entity.
     * @param commerceSubscriptionId Alternate key of companySubscription
     * @return a {@link SubscriptionsWithCommerceSubscriptionIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsWithCommerceSubscriptionIdRequestBuilder subscriptionsWithCommerceSubscriptionId(@jakarta.annotation.Nonnull final String commerceSubscriptionId) {
        Objects.requireNonNull(commerceSubscriptionId);
        return new SubscriptionsWithCommerceSubscriptionIdRequestBuilder(pathParameters, requestAdapter, commerceSubscriptionId);
    }
    /**
     * Provides operations to manage the subscriptions property of the microsoft.graph.directory entity.
     * @param ocpSubscriptionId Alternate key of companySubscription
     * @return a {@link SubscriptionsWithOcpSubscriptionIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsWithOcpSubscriptionIdRequestBuilder subscriptionsWithOcpSubscriptionId(@jakarta.annotation.Nonnull final String ocpSubscriptionId) {
        Objects.requireNonNull(ocpSubscriptionId);
        return new SubscriptionsWithOcpSubscriptionIdRequestBuilder(pathParameters, requestAdapter, ocpSubscriptionId);
    }
    /**
     * Get directory
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get directory
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
     * Update directory
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Directory body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Directory body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DirectoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DirectoryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get directory
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

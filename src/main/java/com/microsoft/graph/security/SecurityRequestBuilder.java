package microsoft.graph.security;

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
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.security.Security;
import microsoft.graph.security.alerts.AlertsRequestBuilder;
import microsoft.graph.security.alerts.item.AlertItemRequestBuilder;
import microsoft.graph.security.attacksimulation.AttackSimulationRequestBuilder;
import microsoft.graph.security.cases.CasesRequestBuilder;
import microsoft.graph.security.cloudappsecurityprofiles.CloudAppSecurityProfilesRequestBuilder;
import microsoft.graph.security.cloudappsecurityprofiles.item.CloudAppSecurityProfileItemRequestBuilder;
import microsoft.graph.security.domainsecurityprofiles.DomainSecurityProfilesRequestBuilder;
import microsoft.graph.security.domainsecurityprofiles.item.DomainSecurityProfileItemRequestBuilder;
import microsoft.graph.security.filesecurityprofiles.FileSecurityProfilesRequestBuilder;
import microsoft.graph.security.filesecurityprofiles.item.FileSecurityProfileItemRequestBuilder;
import microsoft.graph.security.hostsecurityprofiles.HostSecurityProfilesRequestBuilder;
import microsoft.graph.security.hostsecurityprofiles.item.HostSecurityProfileItemRequestBuilder;
import microsoft.graph.security.informationprotection.InformationProtectionRequestBuilder;
import microsoft.graph.security.ipsecurityprofiles.IpSecurityProfilesRequestBuilder;
import microsoft.graph.security.ipsecurityprofiles.item.IpSecurityProfileItemRequestBuilder;
import microsoft.graph.security.providertenantsettings.item.ProviderTenantSettingItemRequestBuilder;
import microsoft.graph.security.providertenantsettings.ProviderTenantSettingsRequestBuilder;
import microsoft.graph.security.securescorecontrolprofiles.item.SecureScoreControlProfileItemRequestBuilder;
import microsoft.graph.security.securescorecontrolprofiles.SecureScoreControlProfilesRequestBuilder;
import microsoft.graph.security.securescores.item.SecureScoreItemRequestBuilder;
import microsoft.graph.security.securescores.SecureScoresRequestBuilder;
import microsoft.graph.security.securityactions.item.SecurityActionItemRequestBuilder;
import microsoft.graph.security.securityactions.SecurityActionsRequestBuilder;
import microsoft.graph.security.subjectrightsrequests.item.SubjectRightsRequestItemRequestBuilder;
import microsoft.graph.security.subjectrightsrequests.SubjectRightsRequestsRequestBuilder;
import microsoft.graph.security.tiindicators.item.TiIndicatorItemRequestBuilder;
import microsoft.graph.security.tiindicators.TiIndicatorsRequestBuilder;
import microsoft.graph.security.usersecurityprofiles.item.UserSecurityProfileItemRequestBuilder;
import microsoft.graph.security.usersecurityprofiles.UserSecurityProfilesRequestBuilder;
/** Provides operations to manage the security singleton. */
public class SecurityRequestBuilder {
    /** The alerts property */
    @javax.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The attackSimulation property */
    @javax.annotation.Nonnull
    public AttackSimulationRequestBuilder attackSimulation() {
        return new AttackSimulationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cases property */
    @javax.annotation.Nonnull
    public CasesRequestBuilder cases() {
        return new CasesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloudAppSecurityProfiles property */
    @javax.annotation.Nonnull
    public CloudAppSecurityProfilesRequestBuilder cloudAppSecurityProfiles() {
        return new CloudAppSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The domainSecurityProfiles property */
    @javax.annotation.Nonnull
    public DomainSecurityProfilesRequestBuilder domainSecurityProfiles() {
        return new DomainSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The fileSecurityProfiles property */
    @javax.annotation.Nonnull
    public FileSecurityProfilesRequestBuilder fileSecurityProfiles() {
        return new FileSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The hostSecurityProfiles property */
    @javax.annotation.Nonnull
    public HostSecurityProfilesRequestBuilder hostSecurityProfiles() {
        return new HostSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The informationProtection property */
    @javax.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ipSecurityProfiles property */
    @javax.annotation.Nonnull
    public IpSecurityProfilesRequestBuilder ipSecurityProfiles() {
        return new IpSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The providerTenantSettings property */
    @javax.annotation.Nonnull
    public ProviderTenantSettingsRequestBuilder providerTenantSettings() {
        return new ProviderTenantSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The secureScoreControlProfiles property */
    @javax.annotation.Nonnull
    public SecureScoreControlProfilesRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The secureScores property */
    @javax.annotation.Nonnull
    public SecureScoresRequestBuilder secureScores() {
        return new SecureScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** The securityActions property */
    @javax.annotation.Nonnull
    public SecurityActionsRequestBuilder securityActions() {
        return new SecurityActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The subjectRightsRequests property */
    @javax.annotation.Nonnull
    public SubjectRightsRequestsRequestBuilder subjectRightsRequests() {
        return new SubjectRightsRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tiIndicators property */
    @javax.annotation.Nonnull
    public TiIndicatorsRequestBuilder tiIndicators() {
        return new TiIndicatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The userSecurityProfiles property */
    @javax.annotation.Nonnull
    public UserSecurityProfilesRequestBuilder userSecurityProfiles() {
        return new UserSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.alerts.item collection
     * @param id Unique identifier of the item
     * @return a alertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AlertItemRequestBuilder alerts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("alert%2Did", id);
        return new AlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.cloudAppSecurityProfiles.item collection
     * @param id Unique identifier of the item
     * @return a cloudAppSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudAppSecurityProfileItemRequestBuilder cloudAppSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudAppSecurityProfile%2Did", id);
        return new CloudAppSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SecurityRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/security{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SecurityRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/security{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * security resource type
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * security resource type
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<SecurityRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final SecurityRequestBuilderGetRequestConfiguration requestConfig = new SecurityRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update security
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Security body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<SecurityRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final SecurityRequestBuilderPatchRequestConfiguration requestConfig = new SecurityRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.security.domainSecurityProfiles.item collection
     * @param id Unique identifier of the item
     * @return a domainSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainSecurityProfileItemRequestBuilder domainSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domainSecurityProfile%2Did", id);
        return new DomainSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.fileSecurityProfiles.item collection
     * @param id Unique identifier of the item
     * @return a fileSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FileSecurityProfileItemRequestBuilder fileSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fileSecurityProfile%2Did", id);
        return new FileSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * security resource type
     * @return a CompletableFuture of security
     */
    public java.util.concurrent.CompletableFuture<Security> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * security resource type
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of security
     */
    public java.util.concurrent.CompletableFuture<Security> get(@javax.annotation.Nullable final java.util.function.Consumer<SecurityRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * security resource type
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of security
     */
    public java.util.concurrent.CompletableFuture<Security> get(@javax.annotation.Nullable final java.util.function.Consumer<SecurityRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.security.hostSecurityProfiles.item collection
     * @param id Unique identifier of the item
     * @return a hostSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public HostSecurityProfileItemRequestBuilder hostSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("hostSecurityProfile%2Did", id);
        return new HostSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.ipSecurityProfiles.item collection
     * @param id Unique identifier of the item
     * @return a ipSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IpSecurityProfileItemRequestBuilder ipSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ipSecurityProfile%2Did", id);
        return new IpSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update security
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Security body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<SecurityRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<SecurityRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.security.providerTenantSettings.item collection
     * @param id Unique identifier of the item
     * @return a providerTenantSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProviderTenantSettingItemRequestBuilder providerTenantSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("providerTenantSetting%2Did", id);
        return new ProviderTenantSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.secureScoreControlProfiles.item collection
     * @param id Unique identifier of the item
     * @return a secureScoreControlProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecureScoreControlProfileItemRequestBuilder secureScoreControlProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secureScoreControlProfile%2Did", id);
        return new SecureScoreControlProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.secureScores.item collection
     * @param id Unique identifier of the item
     * @return a secureScoreItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecureScoreItemRequestBuilder secureScores(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secureScore%2Did", id);
        return new SecureScoreItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.securityActions.item collection
     * @param id Unique identifier of the item
     * @return a securityActionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecurityActionItemRequestBuilder securityActions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("securityAction%2Did", id);
        return new SecurityActionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.subjectRightsRequests.item collection
     * @param id Unique identifier of the item
     * @return a subjectRightsRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubjectRightsRequestItemRequestBuilder subjectRightsRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subjectRightsRequest%2Did", id);
        return new SubjectRightsRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.tiIndicators.item collection
     * @param id Unique identifier of the item
     * @return a tiIndicatorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TiIndicatorItemRequestBuilder tiIndicators(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tiIndicator%2Did", id);
        return new TiIndicatorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.security.userSecurityProfiles.item collection
     * @param id Unique identifier of the item
     * @return a userSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserSecurityProfileItemRequestBuilder userSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userSecurityProfile%2Did", id);
        return new UserSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** security resource type */
    public class SecurityRequestBuilderGetQueryParameters {
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
    public class SecurityRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public SecurityRequestBuilderGetQueryParameters queryParameters = new SecurityRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new securityRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public SecurityRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SecurityRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new securityRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public SecurityRequestBuilderPatchRequestConfiguration() {
        }
    }
}

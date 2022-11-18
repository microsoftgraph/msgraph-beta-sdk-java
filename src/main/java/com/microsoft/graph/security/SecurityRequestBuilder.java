package com.microsoft.graph.security;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Security;
import com.microsoft.graph.security.alerts_v2.Alerts_v2RequestBuilder;
import com.microsoft.graph.security.alerts.AlertsRequestBuilder;
import com.microsoft.graph.security.alerts.item.AlertItemRequestBuilder;
import com.microsoft.graph.security.attacksimulation.AttackSimulationRequestBuilder;
import com.microsoft.graph.security.cases.CasesRequestBuilder;
import com.microsoft.graph.security.cloudappsecurityprofiles.CloudAppSecurityProfilesRequestBuilder;
import com.microsoft.graph.security.cloudappsecurityprofiles.item.CloudAppSecurityProfileItemRequestBuilder;
import com.microsoft.graph.security.domainsecurityprofiles.DomainSecurityProfilesRequestBuilder;
import com.microsoft.graph.security.domainsecurityprofiles.item.DomainSecurityProfileItemRequestBuilder;
import com.microsoft.graph.security.filesecurityprofiles.FileSecurityProfilesRequestBuilder;
import com.microsoft.graph.security.filesecurityprofiles.item.FileSecurityProfileItemRequestBuilder;
import com.microsoft.graph.security.hostsecurityprofiles.HostSecurityProfilesRequestBuilder;
import com.microsoft.graph.security.hostsecurityprofiles.item.HostSecurityProfileItemRequestBuilder;
import com.microsoft.graph.security.incidents.IncidentsRequestBuilder;
import com.microsoft.graph.security.incidents.item.IncidentItemRequestBuilder;
import com.microsoft.graph.security.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.security.ipsecurityprofiles.IpSecurityProfilesRequestBuilder;
import com.microsoft.graph.security.ipsecurityprofiles.item.IpSecurityProfileItemRequestBuilder;
import com.microsoft.graph.security.labels.LabelsRequestBuilder;
import com.microsoft.graph.security.providertenantsettings.item.ProviderTenantSettingItemRequestBuilder;
import com.microsoft.graph.security.providertenantsettings.ProviderTenantSettingsRequestBuilder;
import com.microsoft.graph.security.runhuntingquery.RunHuntingQueryRequestBuilder;
import com.microsoft.graph.security.securescorecontrolprofiles.item.SecureScoreControlProfileItemRequestBuilder;
import com.microsoft.graph.security.securescorecontrolprofiles.SecureScoreControlProfilesRequestBuilder;
import com.microsoft.graph.security.securescores.item.SecureScoreItemRequestBuilder;
import com.microsoft.graph.security.securescores.SecureScoresRequestBuilder;
import com.microsoft.graph.security.securityactions.item.SecurityActionItemRequestBuilder;
import com.microsoft.graph.security.securityactions.SecurityActionsRequestBuilder;
import com.microsoft.graph.security.subjectrightsrequests.item.SubjectRightsRequestItemRequestBuilder;
import com.microsoft.graph.security.subjectrightsrequests.SubjectRightsRequestsRequestBuilder;
import com.microsoft.graph.security.threatsubmission.ThreatSubmissionRequestBuilder;
import com.microsoft.graph.security.tiindicators.item.TiIndicatorItemRequestBuilder;
import com.microsoft.graph.security.tiindicators.TiIndicatorsRequestBuilder;
import com.microsoft.graph.security.triggers.TriggersRequestBuilder;
import com.microsoft.graph.security.triggertypes.TriggerTypesRequestBuilder;
import com.microsoft.graph.security.usersecurityprofiles.item.UserSecurityProfileItemRequestBuilder;
import com.microsoft.graph.security.usersecurityprofiles.UserSecurityProfilesRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
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
/** Provides operations to manage the security singleton. */
public class SecurityRequestBuilder {
    /** Provides operations to manage the alerts property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the alerts_v2 property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public Alerts_v2RequestBuilder alerts_v2() {
        return new Alerts_v2RequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the attackSimulation property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public AttackSimulationRequestBuilder attackSimulation() {
        return new AttackSimulationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cases property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public CasesRequestBuilder cases() {
        return new CasesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudAppSecurityProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public CloudAppSecurityProfilesRequestBuilder cloudAppSecurityProfiles() {
        return new CloudAppSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the domainSecurityProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public DomainSecurityProfilesRequestBuilder domainSecurityProfiles() {
        return new DomainSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the fileSecurityProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public FileSecurityProfilesRequestBuilder fileSecurityProfiles() {
        return new FileSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the hostSecurityProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public HostSecurityProfilesRequestBuilder hostSecurityProfiles() {
        return new HostSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the incidents property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public IncidentsRequestBuilder incidents() {
        return new IncidentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the informationProtection property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the ipSecurityProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public IpSecurityProfilesRequestBuilder ipSecurityProfiles() {
        return new IpSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the labels property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public LabelsRequestBuilder labels() {
        return new LabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the providerTenantSettings property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public ProviderTenantSettingsRequestBuilder providerTenantSettings() {
        return new ProviderTenantSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the runHuntingQuery method. */
    @javax.annotation.Nonnull
    public RunHuntingQueryRequestBuilder runHuntingQuery() {
        return new RunHuntingQueryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the secureScoreControlProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public SecureScoreControlProfilesRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the secureScores property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public SecureScoresRequestBuilder secureScores() {
        return new SecureScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the securityActions property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public SecurityActionsRequestBuilder securityActions() {
        return new SecurityActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the subjectRightsRequests property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public SubjectRightsRequestsRequestBuilder subjectRightsRequests() {
        return new SubjectRightsRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the threatSubmission property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public ThreatSubmissionRequestBuilder threatSubmission() {
        return new ThreatSubmissionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tiIndicators property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public TiIndicatorsRequestBuilder tiIndicators() {
        return new TiIndicatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the triggers property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public TriggersRequestBuilder triggers() {
        return new TriggersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the triggerTypes property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public TriggerTypesRequestBuilder triggerTypes() {
        return new TriggerTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userSecurityProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public UserSecurityProfilesRequestBuilder userSecurityProfiles() {
        return new UserSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a AlertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.security.alerts.item.AlertItemRequestBuilder alerts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("alert%2Did", id);
        return new com.microsoft.graph.security.alerts.item.AlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts_v2 property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a AlertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.security.alerts_v2.item.AlertItemRequestBuilder alerts_v2(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("alert%2Did", id);
        return new com.microsoft.graph.security.alerts_v2.item.AlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudAppSecurityProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a CloudAppSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudAppSecurityProfileItemRequestBuilder cloudAppSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudAppSecurityProfile%2Did", id);
        return new CloudAppSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/security{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/security{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
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
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the domainSecurityProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a DomainSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainSecurityProfileItemRequestBuilder domainSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domainSecurityProfile%2Did", id);
        return new DomainSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the fileSecurityProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a FileSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FileSecurityProfileItemRequestBuilder fileSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fileSecurityProfile%2Did", id);
        return new FileSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get security
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Security>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Security>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the hostSecurityProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a HostSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public HostSecurityProfileItemRequestBuilder hostSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("hostSecurityProfile%2Did", id);
        return new HostSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the incidents property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a IncidentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IncidentItemRequestBuilder incidents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("incident%2Did", id);
        return new IncidentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the ipSecurityProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a IpSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IpSecurityProfileItemRequestBuilder ipSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ipSecurityProfile%2Did", id);
        return new IpSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update security
     * @param body 
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> patch(@javax.annotation.Nonnull final Security body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Security>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> patch(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Security>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the providerTenantSettings property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a ProviderTenantSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProviderTenantSettingItemRequestBuilder providerTenantSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("providerTenantSetting%2Did", id);
        return new ProviderTenantSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScoreControlProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a SecureScoreControlProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecureScoreControlProfileItemRequestBuilder secureScoreControlProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secureScoreControlProfile%2Did", id);
        return new SecureScoreControlProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScores property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a SecureScoreItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecureScoreItemRequestBuilder secureScores(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secureScore%2Did", id);
        return new SecureScoreItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the securityActions property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a SecurityActionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecurityActionItemRequestBuilder securityActions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("securityAction%2Did", id);
        return new SecurityActionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the subjectRightsRequests property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a SubjectRightsRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubjectRightsRequestItemRequestBuilder subjectRightsRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subjectRightsRequest%2Did", id);
        return new SubjectRightsRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tiIndicators property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a TiIndicatorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TiIndicatorItemRequestBuilder tiIndicators(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tiIndicator%2Did", id);
        return new TiIndicatorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the userSecurityProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a UserSecurityProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserSecurityProfileItemRequestBuilder userSecurityProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userSecurityProfile%2Did", id);
        return new UserSecurityProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get security */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
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

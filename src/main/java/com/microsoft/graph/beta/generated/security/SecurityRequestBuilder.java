package com.microsoft.graph.beta.security;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Security;
import com.microsoft.graph.beta.security.alerts_v2.AlertsV2RequestBuilder;
import com.microsoft.graph.beta.security.alerts.AlertsRequestBuilder;
import com.microsoft.graph.beta.security.attacksimulation.AttackSimulationRequestBuilder;
import com.microsoft.graph.beta.security.auditlog.AuditLogRequestBuilder;
import com.microsoft.graph.beta.security.cases.CasesRequestBuilder;
import com.microsoft.graph.beta.security.cloudappsecurityprofiles.CloudAppSecurityProfilesRequestBuilder;
import com.microsoft.graph.beta.security.collaboration.CollaborationRequestBuilder;
import com.microsoft.graph.beta.security.domainsecurityprofiles.DomainSecurityProfilesRequestBuilder;
import com.microsoft.graph.beta.security.filesecurityprofiles.FileSecurityProfilesRequestBuilder;
import com.microsoft.graph.beta.security.hostsecurityprofiles.HostSecurityProfilesRequestBuilder;
import com.microsoft.graph.beta.security.identities.IdentitiesRequestBuilder;
import com.microsoft.graph.beta.security.incidents.IncidentsRequestBuilder;
import com.microsoft.graph.beta.security.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.beta.security.ipsecurityprofiles.IpSecurityProfilesRequestBuilder;
import com.microsoft.graph.beta.security.labels.LabelsRequestBuilder;
import com.microsoft.graph.beta.security.microsoftgraphsecurityrunhuntingquery.MicrosoftGraphSecurityRunHuntingQueryRequestBuilder;
import com.microsoft.graph.beta.security.partner.PartnerRequestBuilder;
import com.microsoft.graph.beta.security.providertenantsettings.ProviderTenantSettingsRequestBuilder;
import com.microsoft.graph.beta.security.rules.RulesRequestBuilder;
import com.microsoft.graph.beta.security.securescorecontrolprofiles.SecureScoreControlProfilesRequestBuilder;
import com.microsoft.graph.beta.security.securescores.SecureScoresRequestBuilder;
import com.microsoft.graph.beta.security.securityactions.SecurityActionsRequestBuilder;
import com.microsoft.graph.beta.security.subjectrightsrequests.SubjectRightsRequestsRequestBuilder;
import com.microsoft.graph.beta.security.threatintelligence.ThreatIntelligenceRequestBuilder;
import com.microsoft.graph.beta.security.threatsubmission.ThreatSubmissionRequestBuilder;
import com.microsoft.graph.beta.security.tiindicators.TiIndicatorsRequestBuilder;
import com.microsoft.graph.beta.security.triggers.TriggersRequestBuilder;
import com.microsoft.graph.beta.security.triggertypes.TriggerTypesRequestBuilder;
import com.microsoft.graph.beta.security.usersecurityprofiles.UserSecurityProfilesRequestBuilder;
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
 * Provides operations to manage the security singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the alerts property of the microsoft.graph.security entity.
     * @return a {@link AlertsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts_v2 property of the microsoft.graph.security entity.
     * @return a {@link AlertsV2RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AlertsV2RequestBuilder alertsV2() {
        return new AlertsV2RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attackSimulation property of the microsoft.graph.security entity.
     * @return a {@link AttackSimulationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttackSimulationRequestBuilder attackSimulation() {
        return new AttackSimulationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditLog property of the microsoft.graph.security entity.
     * @return a {@link AuditLogRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditLogRequestBuilder auditLog() {
        return new AuditLogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cases property of the microsoft.graph.security entity.
     * @return a {@link CasesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CasesRequestBuilder cases() {
        return new CasesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudAppSecurityProfiles property of the microsoft.graph.security entity.
     * @return a {@link CloudAppSecurityProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudAppSecurityProfilesRequestBuilder cloudAppSecurityProfiles() {
        return new CloudAppSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collaboration property of the microsoft.graph.security entity.
     * @return a {@link CollaborationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CollaborationRequestBuilder collaboration() {
        return new CollaborationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the domainSecurityProfiles property of the microsoft.graph.security entity.
     * @return a {@link DomainSecurityProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainSecurityProfilesRequestBuilder domainSecurityProfiles() {
        return new DomainSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the fileSecurityProfiles property of the microsoft.graph.security entity.
     * @return a {@link FileSecurityProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FileSecurityProfilesRequestBuilder fileSecurityProfiles() {
        return new FileSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the hostSecurityProfiles property of the microsoft.graph.security entity.
     * @return a {@link HostSecurityProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HostSecurityProfilesRequestBuilder hostSecurityProfiles() {
        return new HostSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identities property of the microsoft.graph.security entity.
     * @return a {@link IdentitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentitiesRequestBuilder identities() {
        return new IdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the incidents property of the microsoft.graph.security entity.
     * @return a {@link IncidentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IncidentsRequestBuilder incidents() {
        return new IncidentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the informationProtection property of the microsoft.graph.security entity.
     * @return a {@link InformationProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ipSecurityProfiles property of the microsoft.graph.security entity.
     * @return a {@link IpSecurityProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IpSecurityProfilesRequestBuilder ipSecurityProfiles() {
        return new IpSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the labels property of the microsoft.graph.security entity.
     * @return a {@link LabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LabelsRequestBuilder labels() {
        return new LabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the runHuntingQuery method.
     * @return a {@link MicrosoftGraphSecurityRunHuntingQueryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityRunHuntingQueryRequestBuilder microsoftGraphSecurityRunHuntingQuery() {
        return new MicrosoftGraphSecurityRunHuntingQueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the partner property of the microsoft.graph.security entity.
     * @return a {@link PartnerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PartnerRequestBuilder partner() {
        return new PartnerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the providerTenantSettings property of the microsoft.graph.security entity.
     * @return a {@link ProviderTenantSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProviderTenantSettingsRequestBuilder providerTenantSettings() {
        return new ProviderTenantSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rules property of the microsoft.graph.security entity.
     * @return a {@link RulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RulesRequestBuilder rules() {
        return new RulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScoreControlProfiles property of the microsoft.graph.security entity.
     * @return a {@link SecureScoreControlProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecureScoreControlProfilesRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScores property of the microsoft.graph.security entity.
     * @return a {@link SecureScoresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecureScoresRequestBuilder secureScores() {
        return new SecureScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the securityActions property of the microsoft.graph.security entity.
     * @return a {@link SecurityActionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityActionsRequestBuilder securityActions() {
        return new SecurityActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subjectRightsRequests property of the microsoft.graph.security entity.
     * @return a {@link SubjectRightsRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubjectRightsRequestsRequestBuilder subjectRightsRequests() {
        return new SubjectRightsRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatIntelligence property of the microsoft.graph.security entity.
     * @return a {@link ThreatIntelligenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThreatIntelligenceRequestBuilder threatIntelligence() {
        return new ThreatIntelligenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatSubmission property of the microsoft.graph.security entity.
     * @return a {@link ThreatSubmissionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThreatSubmissionRequestBuilder threatSubmission() {
        return new ThreatSubmissionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tiIndicators property of the microsoft.graph.security entity.
     * @return a {@link TiIndicatorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TiIndicatorsRequestBuilder tiIndicators() {
        return new TiIndicatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the triggers property of the microsoft.graph.security entity.
     * @return a {@link TriggersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TriggersRequestBuilder triggers() {
        return new TriggersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the triggerTypes property of the microsoft.graph.security entity.
     * @return a {@link TriggerTypesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TriggerTypesRequestBuilder triggerTypes() {
        return new TriggerTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userSecurityProfiles property of the microsoft.graph.security entity.
     * @return a {@link UserSecurityProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserSecurityProfilesRequestBuilder userSecurityProfiles() {
        return new UserSecurityProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SecurityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SecurityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get security
     * @return a {@link Security}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Security get() {
        return get(null);
    }
    /**
     * Get security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Security}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Security get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Security::createFromDiscriminatorValue);
    }
    /**
     * Update security
     * @param body The request body
     * @return a {@link Security}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Security patch(@jakarta.annotation.Nonnull final Security body) {
        return patch(body, null);
    }
    /**
     * Update security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Security}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Security patch(@jakarta.annotation.Nonnull final Security body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Security::createFromDiscriminatorValue);
    }
    /**
     * Get security
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get security
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
     * Update security
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Security body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Security body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SecurityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SecurityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get security
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

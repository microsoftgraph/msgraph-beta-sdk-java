package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.partner.security.PartnerSecurity;
import com.microsoft.graph.beta.models.security.Alert;
import com.microsoft.graph.beta.models.security.AuditCoreRoot;
import com.microsoft.graph.beta.models.security.CasesRoot;
import com.microsoft.graph.beta.models.security.CollaborationRoot;
import com.microsoft.graph.beta.models.security.DataDiscoveryRoot;
import com.microsoft.graph.beta.models.security.IdentityContainer;
import com.microsoft.graph.beta.models.security.Incident;
import com.microsoft.graph.beta.models.security.InformationProtection;
import com.microsoft.graph.beta.models.security.LabelsRoot;
import com.microsoft.graph.beta.models.security.RulesRoot;
import com.microsoft.graph.beta.models.security.ThreatIntelligence;
import com.microsoft.graph.beta.models.security.ThreatSubmissionRoot;
import com.microsoft.graph.beta.models.security.TriggersRoot;
import com.microsoft.graph.beta.models.security.TriggerTypesRoot;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Security implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Security} and sets the default values.
     */
    public Security() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Security}
     */
    @jakarta.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the alerts property value. Notifications for suspicious or potential security issues in a customers tenant.
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.backingStore.get("alerts");
    }
    /**
     * Gets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlertsV2() {
        return this.backingStore.get("alertsV2");
    }
    /**
     * Gets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @return a {@link AttackSimulationRoot}
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this.backingStore.get("attackSimulation");
    }
    /**
     * Gets the auditLog property value. The auditLog property
     * @return a {@link AuditCoreRoot}
     */
    @jakarta.annotation.Nullable
    public AuditCoreRoot getAuditLog() {
        return this.backingStore.get("auditLog");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cases property value. The cases property
     * @return a {@link CasesRoot}
     */
    @jakarta.annotation.Nullable
    public CasesRoot getCases() {
        return this.backingStore.get("cases");
    }
    /**
     * Gets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @return a {@link java.util.List<CloudAppSecurityProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudAppSecurityProfile> getCloudAppSecurityProfiles() {
        return this.backingStore.get("cloudAppSecurityProfiles");
    }
    /**
     * Gets the collaboration property value. Enables read and other actions on collaborative entities in Microsoft Defender.
     * @return a {@link CollaborationRoot}
     */
    @jakarta.annotation.Nullable
    public CollaborationRoot getCollaboration() {
        return this.backingStore.get("collaboration");
    }
    /**
     * Gets the dataDiscovery property value. The dataDiscovery property
     * @return a {@link DataDiscoveryRoot}
     */
    @jakarta.annotation.Nullable
    public DataDiscoveryRoot getDataDiscovery() {
        return this.backingStore.get("dataDiscovery");
    }
    /**
     * Gets the dataSecurityAndGovernance property value. The dataSecurityAndGovernance property
     * @return a {@link TenantDataSecurityAndGovernance}
     */
    @jakarta.annotation.Nullable
    public TenantDataSecurityAndGovernance getDataSecurityAndGovernance() {
        return this.backingStore.get("dataSecurityAndGovernance");
    }
    /**
     * Gets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @return a {@link java.util.List<DomainSecurityProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DomainSecurityProfile> getDomainSecurityProfiles() {
        return this.backingStore.get("domainSecurityProfiles");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("alerts_v2", (n) -> { this.setAlertsV2(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("attackSimulation", (n) -> { this.setAttackSimulation(n.getObjectValue(AttackSimulationRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("auditLog", (n) -> { this.setAuditLog(n.getObjectValue(AuditCoreRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cases", (n) -> { this.setCases(n.getObjectValue(CasesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudAppSecurityProfiles", (n) -> { this.setCloudAppSecurityProfiles(n.getCollectionOfObjectValues(CloudAppSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("collaboration", (n) -> { this.setCollaboration(n.getObjectValue(CollaborationRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("dataDiscovery", (n) -> { this.setDataDiscovery(n.getObjectValue(DataDiscoveryRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSecurityAndGovernance", (n) -> { this.setDataSecurityAndGovernance(n.getObjectValue(TenantDataSecurityAndGovernance::createFromDiscriminatorValue)); });
        deserializerMap.put("domainSecurityProfiles", (n) -> { this.setDomainSecurityProfiles(n.getCollectionOfObjectValues(DomainSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("fileSecurityProfiles", (n) -> { this.setFileSecurityProfiles(n.getCollectionOfObjectValues(FileSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("hostSecurityProfiles", (n) -> { this.setHostSecurityProfiles(n.getCollectionOfObjectValues(HostSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("identities", (n) -> { this.setIdentities(n.getObjectValue(IdentityContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("incidents", (n) -> { this.setIncidents(n.getCollectionOfObjectValues(Incident::createFromDiscriminatorValue)); });
        deserializerMap.put("informationProtection", (n) -> { this.setInformationProtection(n.getObjectValue(InformationProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("ipSecurityProfiles", (n) -> { this.setIpSecurityProfiles(n.getCollectionOfObjectValues(IpSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(LabelsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("partner", (n) -> { this.setPartner(n.getObjectValue(PartnerSecurity::createFromDiscriminatorValue)); });
        deserializerMap.put("providerTenantSettings", (n) -> { this.setProviderTenantSettings(n.getCollectionOfObjectValues(ProviderTenantSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getObjectValue(RulesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScoreControlProfiles", (n) -> { this.setSecureScoreControlProfiles(n.getCollectionOfObjectValues(SecureScoreControlProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScores", (n) -> { this.setSecureScores(n.getCollectionOfObjectValues(SecureScore::createFromDiscriminatorValue)); });
        deserializerMap.put("securityActions", (n) -> { this.setSecurityActions(n.getCollectionOfObjectValues(SecurityAction::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectRightsRequests", (n) -> { this.setSubjectRightsRequests(n.getCollectionOfObjectValues(SubjectRightsRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("threatIntelligence", (n) -> { this.setThreatIntelligence(n.getObjectValue(ThreatIntelligence::createFromDiscriminatorValue)); });
        deserializerMap.put("threatSubmission", (n) -> { this.setThreatSubmission(n.getObjectValue(ThreatSubmissionRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("tiIndicators", (n) -> { this.setTiIndicators(n.getCollectionOfObjectValues(TiIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("triggers", (n) -> { this.setTriggers(n.getObjectValue(TriggersRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("triggerTypes", (n) -> { this.setTriggerTypes(n.getObjectValue(TriggerTypesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("userSecurityProfiles", (n) -> { this.setUserSecurityProfiles(n.getCollectionOfObjectValues(UserSecurityProfile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileSecurityProfiles property value. The fileSecurityProfiles property
     * @return a {@link java.util.List<FileSecurityProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileSecurityProfile> getFileSecurityProfiles() {
        return this.backingStore.get("fileSecurityProfiles");
    }
    /**
     * Gets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @return a {@link java.util.List<HostSecurityProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostSecurityProfile> getHostSecurityProfiles() {
        return this.backingStore.get("hostSecurityProfiles");
    }
    /**
     * Gets the identities property value. A container for security identities APIs.
     * @return a {@link IdentityContainer}
     */
    @jakarta.annotation.Nullable
    public IdentityContainer getIdentities() {
        return this.backingStore.get("identities");
    }
    /**
     * Gets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @return a {@link java.util.List<Incident>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Incident> getIncidents() {
        return this.backingStore.get("incidents");
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a {@link InformationProtection}
     */
    @jakarta.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this.backingStore.get("informationProtection");
    }
    /**
     * Gets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @return a {@link java.util.List<IpSecurityProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpSecurityProfile> getIpSecurityProfiles() {
        return this.backingStore.get("ipSecurityProfiles");
    }
    /**
     * Gets the labels property value. The labels property
     * @return a {@link LabelsRoot}
     */
    @jakarta.annotation.Nullable
    public LabelsRoot getLabels() {
        return this.backingStore.get("labels");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the partner property value. A container that safeguards the Microsoft Azure resources of Microsoft Cloud Solution Provider (CSP) partners customers, including alerts, scores, and all aspects of security.
     * @return a {@link PartnerSecurity}
     */
    @jakarta.annotation.Nullable
    public PartnerSecurity getPartner() {
        return this.backingStore.get("partner");
    }
    /**
     * Gets the providerTenantSettings property value. The providerTenantSettings property
     * @return a {@link java.util.List<ProviderTenantSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProviderTenantSetting> getProviderTenantSettings() {
        return this.backingStore.get("providerTenantSettings");
    }
    /**
     * Gets the rules property value. The rules property
     * @return a {@link RulesRoot}
     */
    @jakarta.annotation.Nullable
    public RulesRoot getRules() {
        return this.backingStore.get("rules");
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a {@link java.util.List<SecureScoreControlProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this.backingStore.get("secureScoreControlProfiles");
    }
    /**
     * Gets the secureScores property value. Measurements of tenants security posture to help protect them from threats.
     * @return a {@link java.util.List<SecureScore>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this.backingStore.get("secureScores");
    }
    /**
     * Gets the securityActions property value. The securityActions property
     * @return a {@link java.util.List<SecurityAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityAction> getSecurityActions() {
        return this.backingStore.get("securityActions");
    }
    /**
     * Gets the subjectRightsRequests property value. The subjectRightsRequests property
     * @return a {@link java.util.List<SubjectRightsRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequest> getSubjectRightsRequests() {
        return this.backingStore.get("subjectRightsRequests");
    }
    /**
     * Gets the threatIntelligence property value. The threatIntelligence property
     * @return a {@link ThreatIntelligence}
     */
    @jakarta.annotation.Nullable
    public ThreatIntelligence getThreatIntelligence() {
        return this.backingStore.get("threatIntelligence");
    }
    /**
     * Gets the threatSubmission property value. A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @return a {@link ThreatSubmissionRoot}
     */
    @jakarta.annotation.Nullable
    public ThreatSubmissionRoot getThreatSubmission() {
        return this.backingStore.get("threatSubmission");
    }
    /**
     * Gets the tiIndicators property value. The tiIndicators property
     * @return a {@link java.util.List<TiIndicator>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TiIndicator> getTiIndicators() {
        return this.backingStore.get("tiIndicators");
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a {@link TriggersRoot}
     */
    @jakarta.annotation.Nullable
    public TriggersRoot getTriggers() {
        return this.backingStore.get("triggers");
    }
    /**
     * Gets the triggerTypes property value. The triggerTypes property
     * @return a {@link TriggerTypesRoot}
     */
    @jakarta.annotation.Nullable
    public TriggerTypesRoot getTriggerTypes() {
        return this.backingStore.get("triggerTypes");
    }
    /**
     * Gets the userSecurityProfiles property value. The userSecurityProfiles property
     * @return a {@link java.util.List<UserSecurityProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSecurityProfile> getUserSecurityProfiles() {
        return this.backingStore.get("userSecurityProfiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeCollectionOfObjectValues("alerts_v2", this.getAlertsV2());
        writer.writeObjectValue("attackSimulation", this.getAttackSimulation());
        writer.writeObjectValue("auditLog", this.getAuditLog());
        writer.writeObjectValue("cases", this.getCases());
        writer.writeCollectionOfObjectValues("cloudAppSecurityProfiles", this.getCloudAppSecurityProfiles());
        writer.writeObjectValue("collaboration", this.getCollaboration());
        writer.writeObjectValue("dataDiscovery", this.getDataDiscovery());
        writer.writeObjectValue("dataSecurityAndGovernance", this.getDataSecurityAndGovernance());
        writer.writeCollectionOfObjectValues("domainSecurityProfiles", this.getDomainSecurityProfiles());
        writer.writeCollectionOfObjectValues("fileSecurityProfiles", this.getFileSecurityProfiles());
        writer.writeCollectionOfObjectValues("hostSecurityProfiles", this.getHostSecurityProfiles());
        writer.writeObjectValue("identities", this.getIdentities());
        writer.writeCollectionOfObjectValues("incidents", this.getIncidents());
        writer.writeObjectValue("informationProtection", this.getInformationProtection());
        writer.writeCollectionOfObjectValues("ipSecurityProfiles", this.getIpSecurityProfiles());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("partner", this.getPartner());
        writer.writeCollectionOfObjectValues("providerTenantSettings", this.getProviderTenantSettings());
        writer.writeObjectValue("rules", this.getRules());
        writer.writeCollectionOfObjectValues("secureScoreControlProfiles", this.getSecureScoreControlProfiles());
        writer.writeCollectionOfObjectValues("secureScores", this.getSecureScores());
        writer.writeCollectionOfObjectValues("securityActions", this.getSecurityActions());
        writer.writeCollectionOfObjectValues("subjectRightsRequests", this.getSubjectRightsRequests());
        writer.writeObjectValue("threatIntelligence", this.getThreatIntelligence());
        writer.writeObjectValue("threatSubmission", this.getThreatSubmission());
        writer.writeCollectionOfObjectValues("tiIndicators", this.getTiIndicators());
        writer.writeObjectValue("triggers", this.getTriggers());
        writer.writeObjectValue("triggerTypes", this.getTriggerTypes());
        writer.writeCollectionOfObjectValues("userSecurityProfiles", this.getUserSecurityProfiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the alerts property value. Notifications for suspicious or potential security issues in a customers tenant.
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.backingStore.set("alerts", value);
    }
    /**
     * Sets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @param value Value to set for the alerts_v2 property.
     */
    public void setAlertsV2(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.backingStore.set("alertsV2", value);
    }
    /**
     * Sets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @param value Value to set for the attackSimulation property.
     */
    public void setAttackSimulation(@jakarta.annotation.Nullable final AttackSimulationRoot value) {
        this.backingStore.set("attackSimulation", value);
    }
    /**
     * Sets the auditLog property value. The auditLog property
     * @param value Value to set for the auditLog property.
     */
    public void setAuditLog(@jakarta.annotation.Nullable final AuditCoreRoot value) {
        this.backingStore.set("auditLog", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     */
    public void setCases(@jakarta.annotation.Nullable final CasesRoot value) {
        this.backingStore.set("cases", value);
    }
    /**
     * Sets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @param value Value to set for the cloudAppSecurityProfiles property.
     */
    public void setCloudAppSecurityProfiles(@jakarta.annotation.Nullable final java.util.List<CloudAppSecurityProfile> value) {
        this.backingStore.set("cloudAppSecurityProfiles", value);
    }
    /**
     * Sets the collaboration property value. Enables read and other actions on collaborative entities in Microsoft Defender.
     * @param value Value to set for the collaboration property.
     */
    public void setCollaboration(@jakarta.annotation.Nullable final CollaborationRoot value) {
        this.backingStore.set("collaboration", value);
    }
    /**
     * Sets the dataDiscovery property value. The dataDiscovery property
     * @param value Value to set for the dataDiscovery property.
     */
    public void setDataDiscovery(@jakarta.annotation.Nullable final DataDiscoveryRoot value) {
        this.backingStore.set("dataDiscovery", value);
    }
    /**
     * Sets the dataSecurityAndGovernance property value. The dataSecurityAndGovernance property
     * @param value Value to set for the dataSecurityAndGovernance property.
     */
    public void setDataSecurityAndGovernance(@jakarta.annotation.Nullable final TenantDataSecurityAndGovernance value) {
        this.backingStore.set("dataSecurityAndGovernance", value);
    }
    /**
     * Sets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @param value Value to set for the domainSecurityProfiles property.
     */
    public void setDomainSecurityProfiles(@jakarta.annotation.Nullable final java.util.List<DomainSecurityProfile> value) {
        this.backingStore.set("domainSecurityProfiles", value);
    }
    /**
     * Sets the fileSecurityProfiles property value. The fileSecurityProfiles property
     * @param value Value to set for the fileSecurityProfiles property.
     */
    public void setFileSecurityProfiles(@jakarta.annotation.Nullable final java.util.List<FileSecurityProfile> value) {
        this.backingStore.set("fileSecurityProfiles", value);
    }
    /**
     * Sets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @param value Value to set for the hostSecurityProfiles property.
     */
    public void setHostSecurityProfiles(@jakarta.annotation.Nullable final java.util.List<HostSecurityProfile> value) {
        this.backingStore.set("hostSecurityProfiles", value);
    }
    /**
     * Sets the identities property value. A container for security identities APIs.
     * @param value Value to set for the identities property.
     */
    public void setIdentities(@jakarta.annotation.Nullable final IdentityContainer value) {
        this.backingStore.set("identities", value);
    }
    /**
     * Sets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @param value Value to set for the incidents property.
     */
    public void setIncidents(@jakarta.annotation.Nullable final java.util.List<Incident> value) {
        this.backingStore.set("incidents", value);
    }
    /**
     * Sets the informationProtection property value. The informationProtection property
     * @param value Value to set for the informationProtection property.
     */
    public void setInformationProtection(@jakarta.annotation.Nullable final InformationProtection value) {
        this.backingStore.set("informationProtection", value);
    }
    /**
     * Sets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @param value Value to set for the ipSecurityProfiles property.
     */
    public void setIpSecurityProfiles(@jakarta.annotation.Nullable final java.util.List<IpSecurityProfile> value) {
        this.backingStore.set("ipSecurityProfiles", value);
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final LabelsRoot value) {
        this.backingStore.set("labels", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the partner property value. A container that safeguards the Microsoft Azure resources of Microsoft Cloud Solution Provider (CSP) partners customers, including alerts, scores, and all aspects of security.
     * @param value Value to set for the partner property.
     */
    public void setPartner(@jakarta.annotation.Nullable final PartnerSecurity value) {
        this.backingStore.set("partner", value);
    }
    /**
     * Sets the providerTenantSettings property value. The providerTenantSettings property
     * @param value Value to set for the providerTenantSettings property.
     */
    public void setProviderTenantSettings(@jakarta.annotation.Nullable final java.util.List<ProviderTenantSetting> value) {
        this.backingStore.set("providerTenantSettings", value);
    }
    /**
     * Sets the rules property value. The rules property
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final RulesRoot value) {
        this.backingStore.set("rules", value);
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     */
    public void setSecureScoreControlProfiles(@jakarta.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this.backingStore.set("secureScoreControlProfiles", value);
    }
    /**
     * Sets the secureScores property value. Measurements of tenants security posture to help protect them from threats.
     * @param value Value to set for the secureScores property.
     */
    public void setSecureScores(@jakarta.annotation.Nullable final java.util.List<SecureScore> value) {
        this.backingStore.set("secureScores", value);
    }
    /**
     * Sets the securityActions property value. The securityActions property
     * @param value Value to set for the securityActions property.
     */
    public void setSecurityActions(@jakarta.annotation.Nullable final java.util.List<SecurityAction> value) {
        this.backingStore.set("securityActions", value);
    }
    /**
     * Sets the subjectRightsRequests property value. The subjectRightsRequests property
     * @param value Value to set for the subjectRightsRequests property.
     */
    public void setSubjectRightsRequests(@jakarta.annotation.Nullable final java.util.List<SubjectRightsRequest> value) {
        this.backingStore.set("subjectRightsRequests", value);
    }
    /**
     * Sets the threatIntelligence property value. The threatIntelligence property
     * @param value Value to set for the threatIntelligence property.
     */
    public void setThreatIntelligence(@jakarta.annotation.Nullable final ThreatIntelligence value) {
        this.backingStore.set("threatIntelligence", value);
    }
    /**
     * Sets the threatSubmission property value. A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @param value Value to set for the threatSubmission property.
     */
    public void setThreatSubmission(@jakarta.annotation.Nullable final ThreatSubmissionRoot value) {
        this.backingStore.set("threatSubmission", value);
    }
    /**
     * Sets the tiIndicators property value. The tiIndicators property
     * @param value Value to set for the tiIndicators property.
     */
    public void setTiIndicators(@jakarta.annotation.Nullable final java.util.List<TiIndicator> value) {
        this.backingStore.set("tiIndicators", value);
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     */
    public void setTriggers(@jakarta.annotation.Nullable final TriggersRoot value) {
        this.backingStore.set("triggers", value);
    }
    /**
     * Sets the triggerTypes property value. The triggerTypes property
     * @param value Value to set for the triggerTypes property.
     */
    public void setTriggerTypes(@jakarta.annotation.Nullable final TriggerTypesRoot value) {
        this.backingStore.set("triggerTypes", value);
    }
    /**
     * Sets the userSecurityProfiles property value. The userSecurityProfiles property
     * @param value Value to set for the userSecurityProfiles property.
     */
    public void setUserSecurityProfiles(@jakarta.annotation.Nullable final java.util.List<UserSecurityProfile> value) {
        this.backingStore.set("userSecurityProfiles", value);
    }
}

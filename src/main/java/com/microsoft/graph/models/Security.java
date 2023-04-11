package com.microsoft.graph.models;

import com.microsoft.graph.models.security.Alert;
import com.microsoft.graph.models.security.CasesRoot;
import com.microsoft.graph.models.security.Incident;
import com.microsoft.graph.models.security.InformationProtection;
import com.microsoft.graph.models.security.LabelsRoot;
import com.microsoft.graph.models.security.ThreatIntelligence;
import com.microsoft.graph.models.security.ThreatSubmissionRoot;
import com.microsoft.graph.models.security.TriggersRoot;
import com.microsoft.graph.models.security.TriggerTypesRoot;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Security extends Entity implements Parsable {
    /** Notifications for suspicious or potential security issues in a customers tenant. */
    private java.util.List<Alert> alerts;
    /** A collection of alerts in Microsoft 365 Defender. */
    private java.util.List<Alert> alertsV2;
    /** Provides tenants capability to launch a simulated and realistic phishing attack and learn from it. */
    private AttackSimulationRoot attackSimulation;
    /** The cases property */
    private CasesRoot cases;
    /** The cloudAppSecurityProfiles property */
    private java.util.List<CloudAppSecurityProfile> cloudAppSecurityProfiles;
    /** The domainSecurityProfiles property */
    private java.util.List<DomainSecurityProfile> domainSecurityProfiles;
    /** The fileSecurityProfiles property */
    private java.util.List<FileSecurityProfile> fileSecurityProfiles;
    /** The hostSecurityProfiles property */
    private java.util.List<HostSecurityProfile> hostSecurityProfiles;
    /** A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack. */
    private java.util.List<Incident> incidents;
    /** The informationProtection property */
    private InformationProtection informationProtection;
    /** The ipSecurityProfiles property */
    private java.util.List<IpSecurityProfile> ipSecurityProfiles;
    /** The labels property */
    private LabelsRoot labels;
    /** The providerStatus property */
    private java.util.List<SecurityProviderStatus> providerStatus;
    /** The providerTenantSettings property */
    private java.util.List<ProviderTenantSetting> providerTenantSettings;
    /** The secureScoreControlProfiles property */
    private java.util.List<SecureScoreControlProfile> secureScoreControlProfiles;
    /** Measurements of tenants security posture to help protect them from threats. */
    private java.util.List<SecureScore> secureScores;
    /** The securityActions property */
    private java.util.List<SecurityAction> securityActions;
    /** The subjectRightsRequests property */
    private java.util.List<SubjectRightsRequest> subjectRightsRequests;
    /** The threatIntelligence property */
    private ThreatIntelligence threatIntelligence;
    /** A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat. */
    private ThreatSubmissionRoot threatSubmission;
    /** The tiIndicators property */
    private java.util.List<TiIndicator> tiIndicators;
    /** The triggers property */
    private TriggersRoot triggers;
    /** The triggerTypes property */
    private TriggerTypesRoot triggerTypes;
    /** The userSecurityProfiles property */
    private java.util.List<UserSecurityProfile> userSecurityProfiles;
    /**
     * Instantiates a new Security and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Security() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Security
     */
    @javax.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * Gets the alerts property value. Notifications for suspicious or potential security issues in a customers tenant.
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlertsV2() {
        return this.alertsV2;
    }
    /**
     * Gets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @return a attackSimulationRoot
     */
    @javax.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this.attackSimulation;
    }
    /**
     * Gets the cases property value. The cases property
     * @return a casesRoot
     */
    @javax.annotation.Nullable
    public CasesRoot getCases() {
        return this.cases;
    }
    /**
     * Gets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @return a cloudAppSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<CloudAppSecurityProfile> getCloudAppSecurityProfiles() {
        return this.cloudAppSecurityProfiles;
    }
    /**
     * Gets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @return a domainSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<DomainSecurityProfile> getDomainSecurityProfiles() {
        return this.domainSecurityProfiles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("alerts_v2", (n) -> { this.setAlertsV2(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("attackSimulation", (n) -> { this.setAttackSimulation(n.getObjectValue(AttackSimulationRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cases", (n) -> { this.setCases(n.getObjectValue(CasesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudAppSecurityProfiles", (n) -> { this.setCloudAppSecurityProfiles(n.getCollectionOfObjectValues(CloudAppSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("domainSecurityProfiles", (n) -> { this.setDomainSecurityProfiles(n.getCollectionOfObjectValues(DomainSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("fileSecurityProfiles", (n) -> { this.setFileSecurityProfiles(n.getCollectionOfObjectValues(FileSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("hostSecurityProfiles", (n) -> { this.setHostSecurityProfiles(n.getCollectionOfObjectValues(HostSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("incidents", (n) -> { this.setIncidents(n.getCollectionOfObjectValues(Incident::createFromDiscriminatorValue)); });
        deserializerMap.put("informationProtection", (n) -> { this.setInformationProtection(n.getObjectValue(InformationProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("ipSecurityProfiles", (n) -> { this.setIpSecurityProfiles(n.getCollectionOfObjectValues(IpSecurityProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(LabelsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("providerStatus", (n) -> { this.setProviderStatus(n.getCollectionOfObjectValues(SecurityProviderStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("providerTenantSettings", (n) -> { this.setProviderTenantSettings(n.getCollectionOfObjectValues(ProviderTenantSetting::createFromDiscriminatorValue)); });
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
     * @return a fileSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<FileSecurityProfile> getFileSecurityProfiles() {
        return this.fileSecurityProfiles;
    }
    /**
     * Gets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @return a hostSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<HostSecurityProfile> getHostSecurityProfiles() {
        return this.hostSecurityProfiles;
    }
    /**
     * Gets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @return a incident
     */
    @javax.annotation.Nullable
    public java.util.List<Incident> getIncidents() {
        return this.incidents;
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a informationProtection
     */
    @javax.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this.informationProtection;
    }
    /**
     * Gets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @return a ipSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<IpSecurityProfile> getIpSecurityProfiles() {
        return this.ipSecurityProfiles;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a labelsRoot
     */
    @javax.annotation.Nullable
    public LabelsRoot getLabels() {
        return this.labels;
    }
    /**
     * Gets the providerStatus property value. The providerStatus property
     * @return a securityProviderStatus
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityProviderStatus> getProviderStatus() {
        return this.providerStatus;
    }
    /**
     * Gets the providerTenantSettings property value. The providerTenantSettings property
     * @return a providerTenantSetting
     */
    @javax.annotation.Nullable
    public java.util.List<ProviderTenantSetting> getProviderTenantSettings() {
        return this.providerTenantSettings;
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a secureScoreControlProfile
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this.secureScoreControlProfiles;
    }
    /**
     * Gets the secureScores property value. Measurements of tenants security posture to help protect them from threats.
     * @return a secureScore
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this.secureScores;
    }
    /**
     * Gets the securityActions property value. The securityActions property
     * @return a securityAction
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityAction> getSecurityActions() {
        return this.securityActions;
    }
    /**
     * Gets the subjectRightsRequests property value. The subjectRightsRequests property
     * @return a subjectRightsRequest
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectRightsRequest> getSubjectRightsRequests() {
        return this.subjectRightsRequests;
    }
    /**
     * Gets the threatIntelligence property value. The threatIntelligence property
     * @return a threatIntelligence
     */
    @javax.annotation.Nullable
    public ThreatIntelligence getThreatIntelligence() {
        return this.threatIntelligence;
    }
    /**
     * Gets the threatSubmission property value. A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @return a threatSubmissionRoot
     */
    @javax.annotation.Nullable
    public ThreatSubmissionRoot getThreatSubmission() {
        return this.threatSubmission;
    }
    /**
     * Gets the tiIndicators property value. The tiIndicators property
     * @return a tiIndicator
     */
    @javax.annotation.Nullable
    public java.util.List<TiIndicator> getTiIndicators() {
        return this.tiIndicators;
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a triggersRoot
     */
    @javax.annotation.Nullable
    public TriggersRoot getTriggers() {
        return this.triggers;
    }
    /**
     * Gets the triggerTypes property value. The triggerTypes property
     * @return a triggerTypesRoot
     */
    @javax.annotation.Nullable
    public TriggerTypesRoot getTriggerTypes() {
        return this.triggerTypes;
    }
    /**
     * Gets the userSecurityProfiles property value. The userSecurityProfiles property
     * @return a userSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<UserSecurityProfile> getUserSecurityProfiles() {
        return this.userSecurityProfiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeCollectionOfObjectValues("alerts_v2", this.getAlertsV2());
        writer.writeObjectValue("attackSimulation", this.getAttackSimulation());
        writer.writeObjectValue("cases", this.getCases());
        writer.writeCollectionOfObjectValues("cloudAppSecurityProfiles", this.getCloudAppSecurityProfiles());
        writer.writeCollectionOfObjectValues("domainSecurityProfiles", this.getDomainSecurityProfiles());
        writer.writeCollectionOfObjectValues("fileSecurityProfiles", this.getFileSecurityProfiles());
        writer.writeCollectionOfObjectValues("hostSecurityProfiles", this.getHostSecurityProfiles());
        writer.writeCollectionOfObjectValues("incidents", this.getIncidents());
        writer.writeObjectValue("informationProtection", this.getInformationProtection());
        writer.writeCollectionOfObjectValues("ipSecurityProfiles", this.getIpSecurityProfiles());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeCollectionOfObjectValues("providerStatus", this.getProviderStatus());
        writer.writeCollectionOfObjectValues("providerTenantSettings", this.getProviderTenantSettings());
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
    }
    /**
     * Sets the alerts property value. Notifications for suspicious or potential security issues in a customers tenant.
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this.alerts = value;
    }
    /**
     * Sets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @param value Value to set for the alertsV2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertsV2(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this.alertsV2 = value;
    }
    /**
     * Sets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @param value Value to set for the attackSimulation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimulation(@javax.annotation.Nullable final AttackSimulationRoot value) {
        this.attackSimulation = value;
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCases(@javax.annotation.Nullable final CasesRoot value) {
        this.cases = value;
    }
    /**
     * Sets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @param value Value to set for the cloudAppSecurityProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAppSecurityProfiles(@javax.annotation.Nullable final java.util.List<CloudAppSecurityProfile> value) {
        this.cloudAppSecurityProfiles = value;
    }
    /**
     * Sets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @param value Value to set for the domainSecurityProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainSecurityProfiles(@javax.annotation.Nullable final java.util.List<DomainSecurityProfile> value) {
        this.domainSecurityProfiles = value;
    }
    /**
     * Sets the fileSecurityProfiles property value. The fileSecurityProfiles property
     * @param value Value to set for the fileSecurityProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileSecurityProfiles(@javax.annotation.Nullable final java.util.List<FileSecurityProfile> value) {
        this.fileSecurityProfiles = value;
    }
    /**
     * Sets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @param value Value to set for the hostSecurityProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostSecurityProfiles(@javax.annotation.Nullable final java.util.List<HostSecurityProfile> value) {
        this.hostSecurityProfiles = value;
    }
    /**
     * Sets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @param value Value to set for the incidents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidents(@javax.annotation.Nullable final java.util.List<Incident> value) {
        this.incidents = value;
    }
    /**
     * Sets the informationProtection property value. The informationProtection property
     * @param value Value to set for the informationProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationProtection(@javax.annotation.Nullable final InformationProtection value) {
        this.informationProtection = value;
    }
    /**
     * Sets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @param value Value to set for the ipSecurityProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpSecurityProfiles(@javax.annotation.Nullable final java.util.List<IpSecurityProfile> value) {
        this.ipSecurityProfiles = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final LabelsRoot value) {
        this.labels = value;
    }
    /**
     * Sets the providerStatus property value. The providerStatus property
     * @param value Value to set for the providerStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderStatus(@javax.annotation.Nullable final java.util.List<SecurityProviderStatus> value) {
        this.providerStatus = value;
    }
    /**
     * Sets the providerTenantSettings property value. The providerTenantSettings property
     * @param value Value to set for the providerTenantSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderTenantSettings(@javax.annotation.Nullable final java.util.List<ProviderTenantSetting> value) {
        this.providerTenantSettings = value;
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureScoreControlProfiles(@javax.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this.secureScoreControlProfiles = value;
    }
    /**
     * Sets the secureScores property value. Measurements of tenants security posture to help protect them from threats.
     * @param value Value to set for the secureScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureScores(@javax.annotation.Nullable final java.util.List<SecureScore> value) {
        this.secureScores = value;
    }
    /**
     * Sets the securityActions property value. The securityActions property
     * @param value Value to set for the securityActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityActions(@javax.annotation.Nullable final java.util.List<SecurityAction> value) {
        this.securityActions = value;
    }
    /**
     * Sets the subjectRightsRequests property value. The subjectRightsRequests property
     * @param value Value to set for the subjectRightsRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectRightsRequests(@javax.annotation.Nullable final java.util.List<SubjectRightsRequest> value) {
        this.subjectRightsRequests = value;
    }
    /**
     * Sets the threatIntelligence property value. The threatIntelligence property
     * @param value Value to set for the threatIntelligence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatIntelligence(@javax.annotation.Nullable final ThreatIntelligence value) {
        this.threatIntelligence = value;
    }
    /**
     * Sets the threatSubmission property value. A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @param value Value to set for the threatSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatSubmission(@javax.annotation.Nullable final ThreatSubmissionRoot value) {
        this.threatSubmission = value;
    }
    /**
     * Sets the tiIndicators property value. The tiIndicators property
     * @param value Value to set for the tiIndicators property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTiIndicators(@javax.annotation.Nullable final java.util.List<TiIndicator> value) {
        this.tiIndicators = value;
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTriggers(@javax.annotation.Nullable final TriggersRoot value) {
        this.triggers = value;
    }
    /**
     * Sets the triggerTypes property value. The triggerTypes property
     * @param value Value to set for the triggerTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTriggerTypes(@javax.annotation.Nullable final TriggerTypesRoot value) {
        this.triggerTypes = value;
    }
    /**
     * Sets the userSecurityProfiles property value. The userSecurityProfiles property
     * @param value Value to set for the userSecurityProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserSecurityProfiles(@javax.annotation.Nullable final java.util.List<UserSecurityProfile> value) {
        this.userSecurityProfiles = value;
    }
}

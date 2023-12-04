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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Security extends Entity implements Parsable {
    /**
     * Instantiates a new Security and sets the default values.
     */
    public Security() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Security
     */
    @jakarta.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * Gets the alerts property value. Notifications for suspicious or potential security issues in a customers tenant.
     * @return a java.util.List<Alert>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.backingStore.get("alerts");
    }
    /**
     * Gets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @return a java.util.List<Alert>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlertsV2() {
        return this.backingStore.get("alertsV2");
    }
    /**
     * Gets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @return a AttackSimulationRoot
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this.backingStore.get("attackSimulation");
    }
    /**
     * Gets the cases property value. The cases property
     * @return a CasesRoot
     */
    @jakarta.annotation.Nullable
    public CasesRoot getCases() {
        return this.backingStore.get("cases");
    }
    /**
     * Gets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @return a java.util.List<CloudAppSecurityProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudAppSecurityProfile> getCloudAppSecurityProfiles() {
        return this.backingStore.get("cloudAppSecurityProfiles");
    }
    /**
     * Gets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @return a java.util.List<DomainSecurityProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DomainSecurityProfile> getDomainSecurityProfiles() {
        return this.backingStore.get("domainSecurityProfiles");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<FileSecurityProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileSecurityProfile> getFileSecurityProfiles() {
        return this.backingStore.get("fileSecurityProfiles");
    }
    /**
     * Gets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @return a java.util.List<HostSecurityProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostSecurityProfile> getHostSecurityProfiles() {
        return this.backingStore.get("hostSecurityProfiles");
    }
    /**
     * Gets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @return a java.util.List<Incident>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Incident> getIncidents() {
        return this.backingStore.get("incidents");
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a InformationProtection
     */
    @jakarta.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this.backingStore.get("informationProtection");
    }
    /**
     * Gets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @return a java.util.List<IpSecurityProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpSecurityProfile> getIpSecurityProfiles() {
        return this.backingStore.get("ipSecurityProfiles");
    }
    /**
     * Gets the labels property value. The labels property
     * @return a LabelsRoot
     */
    @jakarta.annotation.Nullable
    public LabelsRoot getLabels() {
        return this.backingStore.get("labels");
    }
    /**
     * Gets the providerStatus property value. The providerStatus property
     * @return a java.util.List<SecurityProviderStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityProviderStatus> getProviderStatus() {
        return this.backingStore.get("providerStatus");
    }
    /**
     * Gets the providerTenantSettings property value. The providerTenantSettings property
     * @return a java.util.List<ProviderTenantSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProviderTenantSetting> getProviderTenantSettings() {
        return this.backingStore.get("providerTenantSettings");
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a java.util.List<SecureScoreControlProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this.backingStore.get("secureScoreControlProfiles");
    }
    /**
     * Gets the secureScores property value. Measurements of tenants security posture to help protect them from threats.
     * @return a java.util.List<SecureScore>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this.backingStore.get("secureScores");
    }
    /**
     * Gets the securityActions property value. The securityActions property
     * @return a java.util.List<SecurityAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityAction> getSecurityActions() {
        return this.backingStore.get("securityActions");
    }
    /**
     * Gets the subjectRightsRequests property value. The subjectRightsRequests property
     * @return a java.util.List<SubjectRightsRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequest> getSubjectRightsRequests() {
        return this.backingStore.get("subjectRightsRequests");
    }
    /**
     * Gets the threatIntelligence property value. The threatIntelligence property
     * @return a ThreatIntelligence
     */
    @jakarta.annotation.Nullable
    public ThreatIntelligence getThreatIntelligence() {
        return this.backingStore.get("threatIntelligence");
    }
    /**
     * Gets the threatSubmission property value. A threat submission sent to Microsoft; for example, a suspicious email threat, URL threat, or file threat.
     * @return a ThreatSubmissionRoot
     */
    @jakarta.annotation.Nullable
    public ThreatSubmissionRoot getThreatSubmission() {
        return this.backingStore.get("threatSubmission");
    }
    /**
     * Gets the tiIndicators property value. The tiIndicators property
     * @return a java.util.List<TiIndicator>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TiIndicator> getTiIndicators() {
        return this.backingStore.get("tiIndicators");
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a TriggersRoot
     */
    @jakarta.annotation.Nullable
    public TriggersRoot getTriggers() {
        return this.backingStore.get("triggers");
    }
    /**
     * Gets the triggerTypes property value. The triggerTypes property
     * @return a TriggerTypesRoot
     */
    @jakarta.annotation.Nullable
    public TriggerTypesRoot getTriggerTypes() {
        return this.backingStore.get("triggerTypes");
    }
    /**
     * Gets the userSecurityProfiles property value. The userSecurityProfiles property
     * @return a java.util.List<UserSecurityProfile>
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
     * Sets the providerStatus property value. The providerStatus property
     * @param value Value to set for the providerStatus property.
     */
    public void setProviderStatus(@jakarta.annotation.Nullable final java.util.List<SecurityProviderStatus> value) {
        this.backingStore.set("providerStatus", value);
    }
    /**
     * Sets the providerTenantSettings property value. The providerTenantSettings property
     * @param value Value to set for the providerTenantSettings property.
     */
    public void setProviderTenantSettings(@jakarta.annotation.Nullable final java.util.List<ProviderTenantSetting> value) {
        this.backingStore.set("providerTenantSettings", value);
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

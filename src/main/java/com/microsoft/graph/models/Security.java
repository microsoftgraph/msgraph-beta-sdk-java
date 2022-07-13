package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.security.Alert;
import microsoft.graph.models.security.CasesRoot;
import microsoft.graph.models.security.Incident;
import microsoft.graph.models.security.InformationProtection;
import microsoft.graph.models.security.LabelsRoot;
import microsoft.graph.models.security.TriggersRoot;
import microsoft.graph.models.security.TriggerTypesRoot;
public class Security extends Entity implements Parsable {
    /** Notifications for suspicious or potential security issues in a customer’s tenant. */
    private java.util.List<Alert> _alerts;
    /** The alerts_v2 property */
    private java.util.List<Alert> _alerts_v2;
    /** Provides tenants capability to launch a simulated and realistic phishing attack and learn from it. */
    private AttackSimulationRoot _attackSimulation;
    /** The cases property */
    private CasesRoot _cases;
    /** The cloudAppSecurityProfiles property */
    private java.util.List<CloudAppSecurityProfile> _cloudAppSecurityProfiles;
    /** The domainSecurityProfiles property */
    private java.util.List<DomainSecurityProfile> _domainSecurityProfiles;
    /** The fileSecurityProfiles property */
    private java.util.List<FileSecurityProfile> _fileSecurityProfiles;
    /** The hostSecurityProfiles property */
    private java.util.List<HostSecurityProfile> _hostSecurityProfiles;
    /** The incidents property */
    private java.util.List<Incident> _incidents;
    /** The informationProtection property */
    private InformationProtection _informationProtection;
    /** The ipSecurityProfiles property */
    private java.util.List<IpSecurityProfile> _ipSecurityProfiles;
    /** The labels property */
    private LabelsRoot _labels;
    /** The providerStatus property */
    private java.util.List<SecurityProviderStatus> _providerStatus;
    /** The providerTenantSettings property */
    private java.util.List<ProviderTenantSetting> _providerTenantSettings;
    /** The secureScoreControlProfiles property */
    private java.util.List<SecureScoreControlProfile> _secureScoreControlProfiles;
    /** The secureScores property */
    private java.util.List<SecureScore> _secureScores;
    /** The securityActions property */
    private java.util.List<SecurityAction> _securityActions;
    /** The subjectRightsRequests property */
    private java.util.List<SubjectRightsRequest> _subjectRightsRequests;
    /** The tiIndicators property */
    private java.util.List<TiIndicator> _tiIndicators;
    /** The triggers property */
    private TriggersRoot _triggers;
    /** The triggerTypes property */
    private TriggerTypesRoot _triggerTypes;
    /** The userSecurityProfiles property */
    private java.util.List<UserSecurityProfile> _userSecurityProfiles;
    /**
     * Instantiates a new Security and sets the default values.
     * @return a void
     */
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
     * Gets the alerts property value. Notifications for suspicious or potential security issues in a customer’s tenant.
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this._alerts;
    }
    /**
     * Gets the alerts_v2 property value. The alerts_v2 property
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts_v2() {
        return this._alerts_v2;
    }
    /**
     * Gets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @return a attackSimulationRoot
     */
    @javax.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this._attackSimulation;
    }
    /**
     * Gets the cases property value. The cases property
     * @return a casesRoot
     */
    @javax.annotation.Nullable
    public CasesRoot getCases() {
        return this._cases;
    }
    /**
     * Gets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @return a cloudAppSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<CloudAppSecurityProfile> getCloudAppSecurityProfiles() {
        return this._cloudAppSecurityProfiles;
    }
    /**
     * Gets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @return a domainSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<DomainSecurityProfile> getDomainSecurityProfiles() {
        return this._domainSecurityProfiles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Security currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alerts", (n) -> { currentObject.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
            this.put("alerts_v2", (n) -> { currentObject.setAlerts_v2(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
            this.put("attackSimulation", (n) -> { currentObject.setAttackSimulation(n.getObjectValue(AttackSimulationRoot::createFromDiscriminatorValue)); });
            this.put("cases", (n) -> { currentObject.setCases(n.getObjectValue(CasesRoot::createFromDiscriminatorValue)); });
            this.put("cloudAppSecurityProfiles", (n) -> { currentObject.setCloudAppSecurityProfiles(n.getCollectionOfObjectValues(CloudAppSecurityProfile::createFromDiscriminatorValue)); });
            this.put("domainSecurityProfiles", (n) -> { currentObject.setDomainSecurityProfiles(n.getCollectionOfObjectValues(DomainSecurityProfile::createFromDiscriminatorValue)); });
            this.put("fileSecurityProfiles", (n) -> { currentObject.setFileSecurityProfiles(n.getCollectionOfObjectValues(FileSecurityProfile::createFromDiscriminatorValue)); });
            this.put("hostSecurityProfiles", (n) -> { currentObject.setHostSecurityProfiles(n.getCollectionOfObjectValues(HostSecurityProfile::createFromDiscriminatorValue)); });
            this.put("incidents", (n) -> { currentObject.setIncidents(n.getCollectionOfObjectValues(Incident::createFromDiscriminatorValue)); });
            this.put("informationProtection", (n) -> { currentObject.setInformationProtection(n.getObjectValue(InformationProtection::createFromDiscriminatorValue)); });
            this.put("ipSecurityProfiles", (n) -> { currentObject.setIpSecurityProfiles(n.getCollectionOfObjectValues(IpSecurityProfile::createFromDiscriminatorValue)); });
            this.put("labels", (n) -> { currentObject.setLabels(n.getObjectValue(LabelsRoot::createFromDiscriminatorValue)); });
            this.put("providerStatus", (n) -> { currentObject.setProviderStatus(n.getCollectionOfObjectValues(SecurityProviderStatus::createFromDiscriminatorValue)); });
            this.put("providerTenantSettings", (n) -> { currentObject.setProviderTenantSettings(n.getCollectionOfObjectValues(ProviderTenantSetting::createFromDiscriminatorValue)); });
            this.put("secureScoreControlProfiles", (n) -> { currentObject.setSecureScoreControlProfiles(n.getCollectionOfObjectValues(SecureScoreControlProfile::createFromDiscriminatorValue)); });
            this.put("secureScores", (n) -> { currentObject.setSecureScores(n.getCollectionOfObjectValues(SecureScore::createFromDiscriminatorValue)); });
            this.put("securityActions", (n) -> { currentObject.setSecurityActions(n.getCollectionOfObjectValues(SecurityAction::createFromDiscriminatorValue)); });
            this.put("subjectRightsRequests", (n) -> { currentObject.setSubjectRightsRequests(n.getCollectionOfObjectValues(SubjectRightsRequest::createFromDiscriminatorValue)); });
            this.put("tiIndicators", (n) -> { currentObject.setTiIndicators(n.getCollectionOfObjectValues(TiIndicator::createFromDiscriminatorValue)); });
            this.put("triggers", (n) -> { currentObject.setTriggers(n.getObjectValue(TriggersRoot::createFromDiscriminatorValue)); });
            this.put("triggerTypes", (n) -> { currentObject.setTriggerTypes(n.getObjectValue(TriggerTypesRoot::createFromDiscriminatorValue)); });
            this.put("userSecurityProfiles", (n) -> { currentObject.setUserSecurityProfiles(n.getCollectionOfObjectValues(UserSecurityProfile::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fileSecurityProfiles property value. The fileSecurityProfiles property
     * @return a fileSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<FileSecurityProfile> getFileSecurityProfiles() {
        return this._fileSecurityProfiles;
    }
    /**
     * Gets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @return a hostSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<HostSecurityProfile> getHostSecurityProfiles() {
        return this._hostSecurityProfiles;
    }
    /**
     * Gets the incidents property value. The incidents property
     * @return a incident
     */
    @javax.annotation.Nullable
    public java.util.List<Incident> getIncidents() {
        return this._incidents;
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a informationProtection
     */
    @javax.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this._informationProtection;
    }
    /**
     * Gets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @return a ipSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<IpSecurityProfile> getIpSecurityProfiles() {
        return this._ipSecurityProfiles;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a labelsRoot
     */
    @javax.annotation.Nullable
    public LabelsRoot getLabels() {
        return this._labels;
    }
    /**
     * Gets the providerStatus property value. The providerStatus property
     * @return a securityProviderStatus
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityProviderStatus> getProviderStatus() {
        return this._providerStatus;
    }
    /**
     * Gets the providerTenantSettings property value. The providerTenantSettings property
     * @return a providerTenantSetting
     */
    @javax.annotation.Nullable
    public java.util.List<ProviderTenantSetting> getProviderTenantSettings() {
        return this._providerTenantSettings;
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a secureScoreControlProfile
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this._secureScoreControlProfiles;
    }
    /**
     * Gets the secureScores property value. The secureScores property
     * @return a secureScore
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this._secureScores;
    }
    /**
     * Gets the securityActions property value. The securityActions property
     * @return a securityAction
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityAction> getSecurityActions() {
        return this._securityActions;
    }
    /**
     * Gets the subjectRightsRequests property value. The subjectRightsRequests property
     * @return a subjectRightsRequest
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectRightsRequest> getSubjectRightsRequests() {
        return this._subjectRightsRequests;
    }
    /**
     * Gets the tiIndicators property value. The tiIndicators property
     * @return a tiIndicator
     */
    @javax.annotation.Nullable
    public java.util.List<TiIndicator> getTiIndicators() {
        return this._tiIndicators;
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a triggersRoot
     */
    @javax.annotation.Nullable
    public TriggersRoot getTriggers() {
        return this._triggers;
    }
    /**
     * Gets the triggerTypes property value. The triggerTypes property
     * @return a triggerTypesRoot
     */
    @javax.annotation.Nullable
    public TriggerTypesRoot getTriggerTypes() {
        return this._triggerTypes;
    }
    /**
     * Gets the userSecurityProfiles property value. The userSecurityProfiles property
     * @return a userSecurityProfile
     */
    @javax.annotation.Nullable
    public java.util.List<UserSecurityProfile> getUserSecurityProfiles() {
        return this._userSecurityProfiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeCollectionOfObjectValues("alerts_v2", this.getAlerts_v2());
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
        writer.writeCollectionOfObjectValues("tiIndicators", this.getTiIndicators());
        writer.writeObjectValue("triggers", this.getTriggers());
        writer.writeObjectValue("triggerTypes", this.getTriggerTypes());
        writer.writeCollectionOfObjectValues("userSecurityProfiles", this.getUserSecurityProfiles());
    }
    /**
     * Sets the alerts property value. Notifications for suspicious or potential security issues in a customer’s tenant.
     * @param value Value to set for the alerts property.
     * @return a void
     */
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this._alerts = value;
    }
    /**
     * Sets the alerts_v2 property value. The alerts_v2 property
     * @param value Value to set for the alerts_v2 property.
     * @return a void
     */
    public void setAlerts_v2(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this._alerts_v2 = value;
    }
    /**
     * Sets the attackSimulation property value. Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     * @param value Value to set for the attackSimulation property.
     * @return a void
     */
    public void setAttackSimulation(@javax.annotation.Nullable final AttackSimulationRoot value) {
        this._attackSimulation = value;
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     * @return a void
     */
    public void setCases(@javax.annotation.Nullable final CasesRoot value) {
        this._cases = value;
    }
    /**
     * Sets the cloudAppSecurityProfiles property value. The cloudAppSecurityProfiles property
     * @param value Value to set for the cloudAppSecurityProfiles property.
     * @return a void
     */
    public void setCloudAppSecurityProfiles(@javax.annotation.Nullable final java.util.List<CloudAppSecurityProfile> value) {
        this._cloudAppSecurityProfiles = value;
    }
    /**
     * Sets the domainSecurityProfiles property value. The domainSecurityProfiles property
     * @param value Value to set for the domainSecurityProfiles property.
     * @return a void
     */
    public void setDomainSecurityProfiles(@javax.annotation.Nullable final java.util.List<DomainSecurityProfile> value) {
        this._domainSecurityProfiles = value;
    }
    /**
     * Sets the fileSecurityProfiles property value. The fileSecurityProfiles property
     * @param value Value to set for the fileSecurityProfiles property.
     * @return a void
     */
    public void setFileSecurityProfiles(@javax.annotation.Nullable final java.util.List<FileSecurityProfile> value) {
        this._fileSecurityProfiles = value;
    }
    /**
     * Sets the hostSecurityProfiles property value. The hostSecurityProfiles property
     * @param value Value to set for the hostSecurityProfiles property.
     * @return a void
     */
    public void setHostSecurityProfiles(@javax.annotation.Nullable final java.util.List<HostSecurityProfile> value) {
        this._hostSecurityProfiles = value;
    }
    /**
     * Sets the incidents property value. The incidents property
     * @param value Value to set for the incidents property.
     * @return a void
     */
    public void setIncidents(@javax.annotation.Nullable final java.util.List<Incident> value) {
        this._incidents = value;
    }
    /**
     * Sets the informationProtection property value. The informationProtection property
     * @param value Value to set for the informationProtection property.
     * @return a void
     */
    public void setInformationProtection(@javax.annotation.Nullable final InformationProtection value) {
        this._informationProtection = value;
    }
    /**
     * Sets the ipSecurityProfiles property value. The ipSecurityProfiles property
     * @param value Value to set for the ipSecurityProfiles property.
     * @return a void
     */
    public void setIpSecurityProfiles(@javax.annotation.Nullable final java.util.List<IpSecurityProfile> value) {
        this._ipSecurityProfiles = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    public void setLabels(@javax.annotation.Nullable final LabelsRoot value) {
        this._labels = value;
    }
    /**
     * Sets the providerStatus property value. The providerStatus property
     * @param value Value to set for the providerStatus property.
     * @return a void
     */
    public void setProviderStatus(@javax.annotation.Nullable final java.util.List<SecurityProviderStatus> value) {
        this._providerStatus = value;
    }
    /**
     * Sets the providerTenantSettings property value. The providerTenantSettings property
     * @param value Value to set for the providerTenantSettings property.
     * @return a void
     */
    public void setProviderTenantSettings(@javax.annotation.Nullable final java.util.List<ProviderTenantSetting> value) {
        this._providerTenantSettings = value;
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     * @return a void
     */
    public void setSecureScoreControlProfiles(@javax.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this._secureScoreControlProfiles = value;
    }
    /**
     * Sets the secureScores property value. The secureScores property
     * @param value Value to set for the secureScores property.
     * @return a void
     */
    public void setSecureScores(@javax.annotation.Nullable final java.util.List<SecureScore> value) {
        this._secureScores = value;
    }
    /**
     * Sets the securityActions property value. The securityActions property
     * @param value Value to set for the securityActions property.
     * @return a void
     */
    public void setSecurityActions(@javax.annotation.Nullable final java.util.List<SecurityAction> value) {
        this._securityActions = value;
    }
    /**
     * Sets the subjectRightsRequests property value. The subjectRightsRequests property
     * @param value Value to set for the subjectRightsRequests property.
     * @return a void
     */
    public void setSubjectRightsRequests(@javax.annotation.Nullable final java.util.List<SubjectRightsRequest> value) {
        this._subjectRightsRequests = value;
    }
    /**
     * Sets the tiIndicators property value. The tiIndicators property
     * @param value Value to set for the tiIndicators property.
     * @return a void
     */
    public void setTiIndicators(@javax.annotation.Nullable final java.util.List<TiIndicator> value) {
        this._tiIndicators = value;
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     * @return a void
     */
    public void setTriggers(@javax.annotation.Nullable final TriggersRoot value) {
        this._triggers = value;
    }
    /**
     * Sets the triggerTypes property value. The triggerTypes property
     * @param value Value to set for the triggerTypes property.
     * @return a void
     */
    public void setTriggerTypes(@javax.annotation.Nullable final TriggerTypesRoot value) {
        this._triggerTypes = value;
    }
    /**
     * Sets the userSecurityProfiles property value. The userSecurityProfiles property
     * @param value Value to set for the userSecurityProfiles property.
     * @return a void
     */
    public void setUserSecurityProfiles(@javax.annotation.Nullable final java.util.List<UserSecurityProfile> value) {
        this._userSecurityProfiles = value;
    }
}

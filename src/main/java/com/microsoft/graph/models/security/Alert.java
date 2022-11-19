package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class Alert extends Entity implements Parsable {
    /** The adversary or activity group that is associated with this alert. */
    private String _actorDisplayName;
    /** URL for the alert page in the Microsoft 365 Defender portal. */
    private String _alertWebUrl;
    /** Owner of the alert, or null if no owner is assigned. */
    private String _assignedTo;
    /** The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&CK framework. */
    private String _category;
    /** Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, benignPositive, unknownFutureValue. */
    private AlertClassification _classification;
    /** Array of comments created by the Security Operations (SecOps) team during the alert management process. */
    private java.util.List<AlertComment> _comments;
    /** Time when Microsoft 365 Defender created the alert. */
    private OffsetDateTime _createdDateTime;
    /** String value describing each alert. */
    private String _description;
    /** Detection technology or sensor that identified the notable component or activity. */
    private DetectionSource _detectionSource;
    /** The ID of the detector that triggered the alert. */
    private String _detectorId;
    /** Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue. */
    private AlertDetermination _determination;
    /** Collection of evidence related to the alert. */
    private java.util.List<AlertEvidence> _evidence;
    /** The earliest activity associated with the alert. */
    private OffsetDateTime _firstActivityDateTime;
    /** Unique identifier to represent the incident this alert resource is associated with. */
    private String _incidentId;
    /** URL for the incident page in the Microsoft 365 Defender portal. */
    private String _incidentWebUrl;
    /** The oldest activity associated with the alert. */
    private OffsetDateTime _lastActivityDateTime;
    /** Time when the alert was last updated at Microsoft 365 Defender. */
    private OffsetDateTime _lastUpdateDateTime;
    /** The attack techniques, as aligned with the MITRE ATT&CK framework. */
    private java.util.List<String> _mitreTechniques;
    /** The ID of the alert as it appears in the security provider product that generated the alert. */
    private String _providerAlertId;
    /** Recommended response and remediation actions to take in the event this alert was generated. */
    private String _recommendedActions;
    /** Time when the alert was resolved. */
    private OffsetDateTime _resolvedDateTime;
    /** The serviceSource property */
    private ServiceSource _serviceSource;
    /** The severity property */
    private AlertSeverity _severity;
    /** The status property */
    private AlertStatus _status;
    /** The Azure Active Directory tenant the alert was created in. */
    private String _tenantId;
    /** The threat associated with this alert. */
    private String _threatDisplayName;
    /** Threat family associated with this alert. */
    private String _threatFamilyName;
    /** Brief identifying string value describing the alert. */
    private String _title;
    /**
     * Instantiates a new alert and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Alert() {
        super();
        this.setOdataType("#microsoft.graph.security.alert");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alert
     */
    @javax.annotation.Nonnull
    public static Alert createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Alert();
    }
    /**
     * Gets the actorDisplayName property value. The adversary or activity group that is associated with this alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActorDisplayName() {
        return this._actorDisplayName;
    }
    /**
     * Gets the alertWebUrl property value. URL for the alert page in the Microsoft 365 Defender portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertWebUrl() {
        return this._alertWebUrl;
    }
    /**
     * Gets the assignedTo property value. Owner of the alert, or null if no owner is assigned.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the category property value. The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&CK framework.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this._category;
    }
    /**
     * Gets the classification property value. Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, benignPositive, unknownFutureValue.
     * @return a alertClassification
     */
    @javax.annotation.Nullable
    public AlertClassification getClassification() {
        return this._classification;
    }
    /**
     * Gets the comments property value. Array of comments created by the Security Operations (SecOps) team during the alert management process.
     * @return a alertComment
     */
    @javax.annotation.Nullable
    public java.util.List<AlertComment> getComments() {
        return this._comments;
    }
    /**
     * Gets the createdDateTime property value. Time when Microsoft 365 Defender created the alert.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. String value describing each alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the detectionSource property value. Detection technology or sensor that identified the notable component or activity.
     * @return a detectionSource
     */
    @javax.annotation.Nullable
    public DetectionSource getDetectionSource() {
        return this._detectionSource;
    }
    /**
     * Gets the detectorId property value. The ID of the detector that triggered the alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectorId() {
        return this._detectorId;
    }
    /**
     * Gets the determination property value. Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @return a alertDetermination
     */
    @javax.annotation.Nullable
    public AlertDetermination getDetermination() {
        return this._determination;
    }
    /**
     * Gets the evidence property value. Collection of evidence related to the alert.
     * @return a alertEvidence
     */
    @javax.annotation.Nullable
    public java.util.List<AlertEvidence> getEvidence() {
        return this._evidence;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Alert currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actorDisplayName", (n) -> { currentObject.setActorDisplayName(n.getStringValue()); });
        deserializerMap.put("alertWebUrl", (n) -> { currentObject.setAlertWebUrl(n.getStringValue()); });
        deserializerMap.put("assignedTo", (n) -> { currentObject.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { currentObject.setCategory(n.getStringValue()); });
        deserializerMap.put("classification", (n) -> { currentObject.setClassification(n.getEnumValue(AlertClassification.class)); });
        deserializerMap.put("comments", (n) -> { currentObject.setComments(n.getCollectionOfObjectValues(AlertComment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionSource", (n) -> { currentObject.setDetectionSource(n.getEnumValue(DetectionSource.class)); });
        deserializerMap.put("detectorId", (n) -> { currentObject.setDetectorId(n.getStringValue()); });
        deserializerMap.put("determination", (n) -> { currentObject.setDetermination(n.getEnumValue(AlertDetermination.class)); });
        deserializerMap.put("evidence", (n) -> { currentObject.setEvidence(n.getCollectionOfObjectValues(AlertEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("firstActivityDateTime", (n) -> { currentObject.setFirstActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("incidentId", (n) -> { currentObject.setIncidentId(n.getStringValue()); });
        deserializerMap.put("incidentWebUrl", (n) -> { currentObject.setIncidentWebUrl(n.getStringValue()); });
        deserializerMap.put("lastActivityDateTime", (n) -> { currentObject.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { currentObject.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mitreTechniques", (n) -> { currentObject.setMitreTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("providerAlertId", (n) -> { currentObject.setProviderAlertId(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { currentObject.setRecommendedActions(n.getStringValue()); });
        deserializerMap.put("resolvedDateTime", (n) -> { currentObject.setResolvedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serviceSource", (n) -> { currentObject.setServiceSource(n.getEnumValue(ServiceSource.class)); });
        deserializerMap.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AlertStatus.class)); });
        deserializerMap.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        deserializerMap.put("threatDisplayName", (n) -> { currentObject.setThreatDisplayName(n.getStringValue()); });
        deserializerMap.put("threatFamilyName", (n) -> { currentObject.setThreatFamilyName(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the firstActivityDateTime property value. The earliest activity associated with the alert.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFirstActivityDateTime() {
        return this._firstActivityDateTime;
    }
    /**
     * Gets the incidentId property value. Unique identifier to represent the incident this alert resource is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIncidentId() {
        return this._incidentId;
    }
    /**
     * Gets the incidentWebUrl property value. URL for the incident page in the Microsoft 365 Defender portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIncidentWebUrl() {
        return this._incidentWebUrl;
    }
    /**
     * Gets the lastActivityDateTime property value. The oldest activity associated with the alert.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this._lastActivityDateTime;
    }
    /**
     * Gets the lastUpdateDateTime property value. Time when the alert was last updated at Microsoft 365 Defender.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this._lastUpdateDateTime;
    }
    /**
     * Gets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&CK framework.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMitreTechniques() {
        return this._mitreTechniques;
    }
    /**
     * Gets the providerAlertId property value. The ID of the alert as it appears in the security provider product that generated the alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderAlertId() {
        return this._providerAlertId;
    }
    /**
     * Gets the recommendedActions property value. Recommended response and remediation actions to take in the event this alert was generated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendedActions() {
        return this._recommendedActions;
    }
    /**
     * Gets the resolvedDateTime property value. Time when the alert was resolved.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this._resolvedDateTime;
    }
    /**
     * Gets the serviceSource property value. The serviceSource property
     * @return a serviceSource
     */
    @javax.annotation.Nullable
    public ServiceSource getServiceSource() {
        return this._serviceSource;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a alertSeverity
     */
    @javax.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this._severity;
    }
    /**
     * Gets the status property value. The status property
     * @return a alertStatus
     */
    @javax.annotation.Nullable
    public AlertStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant the alert was created in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the threatDisplayName property value. The threat associated with this alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThreatDisplayName() {
        return this._threatDisplayName;
    }
    /**
     * Gets the threatFamilyName property value. Threat family associated with this alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThreatFamilyName() {
        return this._threatFamilyName;
    }
    /**
     * Gets the title property value. Brief identifying string value describing the alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
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
        writer.writeStringValue("actorDisplayName", this.getActorDisplayName());
        writer.writeStringValue("alertWebUrl", this.getAlertWebUrl());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeStringValue("category", this.getCategory());
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("comments", this.getComments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("detectionSource", this.getDetectionSource());
        writer.writeStringValue("detectorId", this.getDetectorId());
        writer.writeEnumValue("determination", this.getDetermination());
        writer.writeCollectionOfObjectValues("evidence", this.getEvidence());
        writer.writeOffsetDateTimeValue("firstActivityDateTime", this.getFirstActivityDateTime());
        writer.writeStringValue("incidentId", this.getIncidentId());
        writer.writeStringValue("incidentWebUrl", this.getIncidentWebUrl());
        writer.writeOffsetDateTimeValue("lastActivityDateTime", this.getLastActivityDateTime());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeCollectionOfPrimitiveValues("mitreTechniques", this.getMitreTechniques());
        writer.writeStringValue("providerAlertId", this.getProviderAlertId());
        writer.writeStringValue("recommendedActions", this.getRecommendedActions());
        writer.writeOffsetDateTimeValue("resolvedDateTime", this.getResolvedDateTime());
        writer.writeEnumValue("serviceSource", this.getServiceSource());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("threatDisplayName", this.getThreatDisplayName());
        writer.writeStringValue("threatFamilyName", this.getThreatFamilyName());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the actorDisplayName property value. The adversary or activity group that is associated with this alert.
     * @param value Value to set for the actorDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActorDisplayName(@javax.annotation.Nullable final String value) {
        this._actorDisplayName = value;
    }
    /**
     * Sets the alertWebUrl property value. URL for the alert page in the Microsoft 365 Defender portal.
     * @param value Value to set for the alertWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertWebUrl(@javax.annotation.Nullable final String value) {
        this._alertWebUrl = value;
    }
    /**
     * Sets the assignedTo property value. Owner of the alert, or null if no owner is assigned.
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the category property value. The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&CK framework.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final String value) {
        this._category = value;
    }
    /**
     * Sets the classification property value. Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, benignPositive, unknownFutureValue.
     * @param value Value to set for the classification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassification(@javax.annotation.Nullable final AlertClassification value) {
        this._classification = value;
    }
    /**
     * Sets the comments property value. Array of comments created by the Security Operations (SecOps) team during the alert management process.
     * @param value Value to set for the comments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComments(@javax.annotation.Nullable final java.util.List<AlertComment> value) {
        this._comments = value;
    }
    /**
     * Sets the createdDateTime property value. Time when Microsoft 365 Defender created the alert.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. String value describing each alert.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the detectionSource property value. Detection technology or sensor that identified the notable component or activity.
     * @param value Value to set for the detectionSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionSource(@javax.annotation.Nullable final DetectionSource value) {
        this._detectionSource = value;
    }
    /**
     * Sets the detectorId property value. The ID of the detector that triggered the alert.
     * @param value Value to set for the detectorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectorId(@javax.annotation.Nullable final String value) {
        this._detectorId = value;
    }
    /**
     * Sets the determination property value. Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @param value Value to set for the determination property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetermination(@javax.annotation.Nullable final AlertDetermination value) {
        this._determination = value;
    }
    /**
     * Sets the evidence property value. Collection of evidence related to the alert.
     * @param value Value to set for the evidence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvidence(@javax.annotation.Nullable final java.util.List<AlertEvidence> value) {
        this._evidence = value;
    }
    /**
     * Sets the firstActivityDateTime property value. The earliest activity associated with the alert.
     * @param value Value to set for the firstActivityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._firstActivityDateTime = value;
    }
    /**
     * Sets the incidentId property value. Unique identifier to represent the incident this alert resource is associated with.
     * @param value Value to set for the incidentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidentId(@javax.annotation.Nullable final String value) {
        this._incidentId = value;
    }
    /**
     * Sets the incidentWebUrl property value. URL for the incident page in the Microsoft 365 Defender portal.
     * @param value Value to set for the incidentWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidentWebUrl(@javax.annotation.Nullable final String value) {
        this._incidentWebUrl = value;
    }
    /**
     * Sets the lastActivityDateTime property value. The oldest activity associated with the alert.
     * @param value Value to set for the lastActivityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActivityDateTime = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. Time when the alert was last updated at Microsoft 365 Defender.
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdateDateTime = value;
    }
    /**
     * Sets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&CK framework.
     * @param value Value to set for the mitreTechniques property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMitreTechniques(@javax.annotation.Nullable final java.util.List<String> value) {
        this._mitreTechniques = value;
    }
    /**
     * Sets the providerAlertId property value. The ID of the alert as it appears in the security provider product that generated the alert.
     * @param value Value to set for the providerAlertId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderAlertId(@javax.annotation.Nullable final String value) {
        this._providerAlertId = value;
    }
    /**
     * Sets the recommendedActions property value. Recommended response and remediation actions to take in the event this alert was generated.
     * @param value Value to set for the recommendedActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendedActions(@javax.annotation.Nullable final String value) {
        this._recommendedActions = value;
    }
    /**
     * Sets the resolvedDateTime property value. Time when the alert was resolved.
     * @param value Value to set for the resolvedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResolvedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._resolvedDateTime = value;
    }
    /**
     * Sets the serviceSource property value. The serviceSource property
     * @param value Value to set for the serviceSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceSource(@javax.annotation.Nullable final ServiceSource value) {
        this._serviceSource = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final AlertSeverity value) {
        this._severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AlertStatus value) {
        this._status = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant the alert was created in.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the threatDisplayName property value. The threat associated with this alert.
     * @param value Value to set for the threatDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatDisplayName(@javax.annotation.Nullable final String value) {
        this._threatDisplayName = value;
    }
    /**
     * Sets the threatFamilyName property value. Threat family associated with this alert.
     * @param value Value to set for the threatFamilyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatFamilyName(@javax.annotation.Nullable final String value) {
        this._threatFamilyName = value;
    }
    /**
     * Sets the title property value. Brief identifying string value describing the alert.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}

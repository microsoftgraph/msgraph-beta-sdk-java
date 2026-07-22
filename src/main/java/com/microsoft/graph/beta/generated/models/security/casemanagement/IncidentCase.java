package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IncidentCase extends CaseEscaped implements Parsable {
    /**
     * Instantiates a new {@link IncidentCase} and sets the default values.
     */
    public IncidentCase() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.incidentCase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IncidentCase}
     */
    @jakarta.annotation.Nonnull
    public static IncidentCase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncidentCase();
    }
    /**
     * Gets the aiAgentIds property value. The list of AI agent identifiers associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAiAgentIds() {
        return this.backingStore.get("aiAgentIds");
    }
    /**
     * Gets the alertCounts property value. A summary of alert counts grouped by severity and status.
     * @return a {@link AlertCounts}
     */
    @jakarta.annotation.Nullable
    public AlertCounts getAlertCounts() {
        return this.backingStore.get("alertCounts");
    }
    /**
     * Gets the alertPolicyIds property value. The list of alert policy identifiers associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlertPolicyIds() {
        return this.backingStore.get("alertPolicyIds");
    }
    /**
     * Gets the assignedTo property value. The user assigned to investigate the incident case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the associatedThreatIds property value. The list of threat identifiers associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssociatedThreatIds() {
        return this.backingStore.get("associatedThreatIds");
    }
    /**
     * Gets the categories property value. The incident categories.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the classification property value. The classification property
     * @return a {@link IncidentClassification}
     */
    @jakarta.annotation.Nullable
    public IncidentClassification getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * Gets the cloudScopes property value. The cloud scopes associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCloudScopes() {
        return this.backingStore.get("cloudScopes");
    }
    /**
     * Gets the dataSensitivityLabels property value. The data sensitivity labels associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDataSensitivityLabels() {
        return this.backingStore.get("dataSensitivityLabels");
    }
    /**
     * Gets the dataStreams property value. The data streams associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDataStreams() {
        return this.backingStore.get("dataStreams");
    }
    /**
     * Gets the detectionSources property value. The detection sources that identified the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDetectionSources() {
        return this.backingStore.get("detectionSources");
    }
    /**
     * Gets the determination property value. The determination property
     * @return a {@link IncidentDetermination}
     */
    @jakarta.annotation.Nullable
    public IncidentDetermination getDetermination() {
        return this.backingStore.get("determination");
    }
    /**
     * Gets the dueDateTime property value. The target completion date and time for the incident case.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * Gets the emailNotificationRecipients property value. The email notification recipients for the incident case.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailNotificationRecipients() {
        return this.backingStore.get("emailNotificationRecipients");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aiAgentIds", (n) -> { this.setAiAgentIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("alertCounts", (n) -> { this.setAlertCounts(n.getObjectValue(AlertCounts::createFromDiscriminatorValue)); });
        deserializerMap.put("alertPolicyIds", (n) -> { this.setAlertPolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("associatedThreatIds", (n) -> { this.setAssociatedThreatIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(IncidentClassification::forValue)); });
        deserializerMap.put("cloudScopes", (n) -> { this.setCloudScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dataSensitivityLabels", (n) -> { this.setDataSensitivityLabels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dataStreams", (n) -> { this.setDataStreams(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detectionSources", (n) -> { this.setDetectionSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("determination", (n) -> { this.setDetermination(n.getEnumValue(IncidentDetermination::forValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("emailNotificationRecipients", (n) -> { this.setEmailNotificationRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("firstEventTime", (n) -> { this.setFirstEventTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("impactedAssets", (n) -> { this.setImpactedAssets(n.getObjectValue(ImpactedAssetsCounts::createFromDiscriminatorValue)); });
        deserializerMap.put("incidentId", (n) -> { this.setIncidentId(n.getLongValue()); });
        deserializerMap.put("incidentWebUrl", (n) -> { this.setIncidentWebUrl(n.getStringValue()); });
        deserializerMap.put("investigation", (n) -> { this.setInvestigation(n.getObjectValue(Investigation::createFromDiscriminatorValue)); });
        deserializerMap.put("investigationIds", (n) -> { this.setInvestigationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("investigationStates", (n) -> { this.setInvestigationStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("lastEventTime", (n) -> { this.setLastEventTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("machineGroupIds", (n) -> { this.setMachineGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("osPlatforms", (n) -> { this.setOsPlatforms(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("policyNames", (n) -> { this.setPolicyNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("priorityScore", (n) -> { this.setPriorityScore(n.getIntegerValue()); });
        deserializerMap.put("productNames", (n) -> { this.setProductNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("redirectCaseId", (n) -> { this.setRedirectCaseId(n.getLongValue()); });
        deserializerMap.put("redirectIncidentId", (n) -> { this.setRedirectIncidentId(n.getLongValue()); });
        deserializerMap.put("serviceSources", (n) -> { this.setServiceSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(IncidentSeverity::forValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("systemTags", (n) -> { this.setSystemTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("topRiskScore", (n) -> { this.setTopRiskScore(n.getIntegerValue()); });
        deserializerMap.put("workspaceIds", (n) -> { this.setWorkspaceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the firstEventTime property value. The date and time of the first event in the incident.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstEventTime() {
        return this.backingStore.get("firstEventTime");
    }
    /**
     * Gets the impactedAssets property value. A summary of impacted asset counts for the incident.
     * @return a {@link ImpactedAssetsCounts}
     */
    @jakarta.annotation.Nullable
    public ImpactedAssetsCounts getImpactedAssets() {
        return this.backingStore.get("impactedAssets");
    }
    /**
     * Gets the incidentId property value. The Microsoft Security incident identifier.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIncidentId() {
        return this.backingStore.get("incidentId");
    }
    /**
     * Gets the incidentWebUrl property value. The URL for the incident in the Microsoft Defender portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncidentWebUrl() {
        return this.backingStore.get("incidentWebUrl");
    }
    /**
     * Gets the investigation property value. A summary of investigation details associated with the incident.
     * @return a {@link Investigation}
     */
    @jakarta.annotation.Nullable
    public Investigation getInvestigation() {
        return this.backingStore.get("investigation");
    }
    /**
     * Gets the investigationIds property value. The list of investigation identifiers associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInvestigationIds() {
        return this.backingStore.get("investigationIds");
    }
    /**
     * Gets the investigationStates property value. The list of investigation states associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInvestigationStates() {
        return this.backingStore.get("investigationStates");
    }
    /**
     * Gets the lastEventTime property value. The date and time of the most recent event in the incident.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastEventTime() {
        return this.backingStore.get("lastEventTime");
    }
    /**
     * Gets the machineGroupIds property value. The list of machine group identifiers associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMachineGroupIds() {
        return this.backingStore.get("machineGroupIds");
    }
    /**
     * Gets the osPlatforms property value. The operating system platforms associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOsPlatforms() {
        return this.backingStore.get("osPlatforms");
    }
    /**
     * Gets the policyNames property value. The policy names associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPolicyNames() {
        return this.backingStore.get("policyNames");
    }
    /**
     * Gets the priorityScore property value. The priority score assigned to the incident.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriorityScore() {
        return this.backingStore.get("priorityScore");
    }
    /**
     * Gets the productNames property value. The product names associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProductNames() {
        return this.backingStore.get("productNames");
    }
    /**
     * Gets the redirectCaseId property value. The case identifier to which this case redirects when merged.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRedirectCaseId() {
        return this.backingStore.get("redirectCaseId");
    }
    /**
     * Gets the redirectIncidentId property value. The incident identifier to which this incident redirects when merged.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRedirectIncidentId() {
        return this.backingStore.get("redirectIncidentId");
    }
    /**
     * Gets the serviceSources property value. The service sources associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getServiceSources() {
        return this.backingStore.get("serviceSources");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link IncidentSeverity}
     */
    @jakarta.annotation.Nullable
    public IncidentSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the summary property value. A summary of the incident.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.backingStore.get("summary");
    }
    /**
     * Gets the systemTags property value. The system tags associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSystemTags() {
        return this.backingStore.get("systemTags");
    }
    /**
     * Gets the topRiskScore property value. The top risk score associated with the incident.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTopRiskScore() {
        return this.backingStore.get("topRiskScore");
    }
    /**
     * Gets the workspaceIds property value. The list of workspace identifiers associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWorkspaceIds() {
        return this.backingStore.get("workspaceIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("aiAgentIds", this.getAiAgentIds());
        writer.writeObjectValue("alertCounts", this.getAlertCounts());
        writer.writeCollectionOfPrimitiveValues("alertPolicyIds", this.getAlertPolicyIds());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeCollectionOfPrimitiveValues("associatedThreatIds", this.getAssociatedThreatIds());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeCollectionOfPrimitiveValues("cloudScopes", this.getCloudScopes());
        writer.writeCollectionOfPrimitiveValues("dataSensitivityLabels", this.getDataSensitivityLabels());
        writer.writeCollectionOfPrimitiveValues("dataStreams", this.getDataStreams());
        writer.writeCollectionOfPrimitiveValues("detectionSources", this.getDetectionSources());
        writer.writeEnumValue("determination", this.getDetermination());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeCollectionOfPrimitiveValues("emailNotificationRecipients", this.getEmailNotificationRecipients());
        writer.writeOffsetDateTimeValue("firstEventTime", this.getFirstEventTime());
        writer.writeObjectValue("impactedAssets", this.getImpactedAssets());
        writer.writeLongValue("incidentId", this.getIncidentId());
        writer.writeStringValue("incidentWebUrl", this.getIncidentWebUrl());
        writer.writeObjectValue("investigation", this.getInvestigation());
        writer.writeCollectionOfPrimitiveValues("investigationIds", this.getInvestigationIds());
        writer.writeCollectionOfPrimitiveValues("investigationStates", this.getInvestigationStates());
        writer.writeOffsetDateTimeValue("lastEventTime", this.getLastEventTime());
        writer.writeCollectionOfPrimitiveValues("machineGroupIds", this.getMachineGroupIds());
        writer.writeCollectionOfPrimitiveValues("osPlatforms", this.getOsPlatforms());
        writer.writeCollectionOfPrimitiveValues("policyNames", this.getPolicyNames());
        writer.writeIntegerValue("priorityScore", this.getPriorityScore());
        writer.writeCollectionOfPrimitiveValues("productNames", this.getProductNames());
        writer.writeLongValue("redirectCaseId", this.getRedirectCaseId());
        writer.writeLongValue("redirectIncidentId", this.getRedirectIncidentId());
        writer.writeCollectionOfPrimitiveValues("serviceSources", this.getServiceSources());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeCollectionOfPrimitiveValues("systemTags", this.getSystemTags());
        writer.writeIntegerValue("topRiskScore", this.getTopRiskScore());
        writer.writeCollectionOfPrimitiveValues("workspaceIds", this.getWorkspaceIds());
    }
    /**
     * Sets the aiAgentIds property value. The list of AI agent identifiers associated with the incident.
     * @param value Value to set for the aiAgentIds property.
     */
    public void setAiAgentIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("aiAgentIds", value);
    }
    /**
     * Sets the alertCounts property value. A summary of alert counts grouped by severity and status.
     * @param value Value to set for the alertCounts property.
     */
    public void setAlertCounts(@jakarta.annotation.Nullable final AlertCounts value) {
        this.backingStore.set("alertCounts", value);
    }
    /**
     * Sets the alertPolicyIds property value. The list of alert policy identifiers associated with the incident.
     * @param value Value to set for the alertPolicyIds property.
     */
    public void setAlertPolicyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("alertPolicyIds", value);
    }
    /**
     * Sets the assignedTo property value. The user assigned to investigate the incident case.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the associatedThreatIds property value. The list of threat identifiers associated with the incident.
     * @param value Value to set for the associatedThreatIds property.
     */
    public void setAssociatedThreatIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("associatedThreatIds", value);
    }
    /**
     * Sets the categories property value. The incident categories.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final IncidentClassification value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the cloudScopes property value. The cloud scopes associated with the incident.
     * @param value Value to set for the cloudScopes property.
     */
    public void setCloudScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("cloudScopes", value);
    }
    /**
     * Sets the dataSensitivityLabels property value. The data sensitivity labels associated with the incident.
     * @param value Value to set for the dataSensitivityLabels property.
     */
    public void setDataSensitivityLabels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dataSensitivityLabels", value);
    }
    /**
     * Sets the dataStreams property value. The data streams associated with the incident.
     * @param value Value to set for the dataStreams property.
     */
    public void setDataStreams(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dataStreams", value);
    }
    /**
     * Sets the detectionSources property value. The detection sources that identified the incident.
     * @param value Value to set for the detectionSources property.
     */
    public void setDetectionSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("detectionSources", value);
    }
    /**
     * Sets the determination property value. The determination property
     * @param value Value to set for the determination property.
     */
    public void setDetermination(@jakarta.annotation.Nullable final IncidentDetermination value) {
        this.backingStore.set("determination", value);
    }
    /**
     * Sets the dueDateTime property value. The target completion date and time for the incident case.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the emailNotificationRecipients property value. The email notification recipients for the incident case.
     * @param value Value to set for the emailNotificationRecipients property.
     */
    public void setEmailNotificationRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("emailNotificationRecipients", value);
    }
    /**
     * Sets the firstEventTime property value. The date and time of the first event in the incident.
     * @param value Value to set for the firstEventTime property.
     */
    public void setFirstEventTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstEventTime", value);
    }
    /**
     * Sets the impactedAssets property value. A summary of impacted asset counts for the incident.
     * @param value Value to set for the impactedAssets property.
     */
    public void setImpactedAssets(@jakarta.annotation.Nullable final ImpactedAssetsCounts value) {
        this.backingStore.set("impactedAssets", value);
    }
    /**
     * Sets the incidentId property value. The Microsoft Security incident identifier.
     * @param value Value to set for the incidentId property.
     */
    public void setIncidentId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("incidentId", value);
    }
    /**
     * Sets the incidentWebUrl property value. The URL for the incident in the Microsoft Defender portal.
     * @param value Value to set for the incidentWebUrl property.
     */
    public void setIncidentWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentWebUrl", value);
    }
    /**
     * Sets the investigation property value. A summary of investigation details associated with the incident.
     * @param value Value to set for the investigation property.
     */
    public void setInvestigation(@jakarta.annotation.Nullable final Investigation value) {
        this.backingStore.set("investigation", value);
    }
    /**
     * Sets the investigationIds property value. The list of investigation identifiers associated with the incident.
     * @param value Value to set for the investigationIds property.
     */
    public void setInvestigationIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("investigationIds", value);
    }
    /**
     * Sets the investigationStates property value. The list of investigation states associated with the incident.
     * @param value Value to set for the investigationStates property.
     */
    public void setInvestigationStates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("investigationStates", value);
    }
    /**
     * Sets the lastEventTime property value. The date and time of the most recent event in the incident.
     * @param value Value to set for the lastEventTime property.
     */
    public void setLastEventTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastEventTime", value);
    }
    /**
     * Sets the machineGroupIds property value. The list of machine group identifiers associated with the incident.
     * @param value Value to set for the machineGroupIds property.
     */
    public void setMachineGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("machineGroupIds", value);
    }
    /**
     * Sets the osPlatforms property value. The operating system platforms associated with the incident.
     * @param value Value to set for the osPlatforms property.
     */
    public void setOsPlatforms(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("osPlatforms", value);
    }
    /**
     * Sets the policyNames property value. The policy names associated with the incident.
     * @param value Value to set for the policyNames property.
     */
    public void setPolicyNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("policyNames", value);
    }
    /**
     * Sets the priorityScore property value. The priority score assigned to the incident.
     * @param value Value to set for the priorityScore property.
     */
    public void setPriorityScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priorityScore", value);
    }
    /**
     * Sets the productNames property value. The product names associated with the incident.
     * @param value Value to set for the productNames property.
     */
    public void setProductNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("productNames", value);
    }
    /**
     * Sets the redirectCaseId property value. The case identifier to which this case redirects when merged.
     * @param value Value to set for the redirectCaseId property.
     */
    public void setRedirectCaseId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("redirectCaseId", value);
    }
    /**
     * Sets the redirectIncidentId property value. The incident identifier to which this incident redirects when merged.
     * @param value Value to set for the redirectIncidentId property.
     */
    public void setRedirectIncidentId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("redirectIncidentId", value);
    }
    /**
     * Sets the serviceSources property value. The service sources associated with the incident.
     * @param value Value to set for the serviceSources property.
     */
    public void setServiceSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("serviceSources", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final IncidentSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the summary property value. A summary of the incident.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("summary", value);
    }
    /**
     * Sets the systemTags property value. The system tags associated with the incident.
     * @param value Value to set for the systemTags property.
     */
    public void setSystemTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("systemTags", value);
    }
    /**
     * Sets the topRiskScore property value. The top risk score associated with the incident.
     * @param value Value to set for the topRiskScore property.
     */
    public void setTopRiskScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("topRiskScore", value);
    }
    /**
     * Sets the workspaceIds property value. The list of workspace identifiers associated with the incident.
     * @param value Value to set for the workspaceIds property.
     */
    public void setWorkspaceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("workspaceIds", value);
    }
}

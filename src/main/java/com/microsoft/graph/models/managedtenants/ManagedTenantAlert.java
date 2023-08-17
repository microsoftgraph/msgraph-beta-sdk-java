package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedTenantAlert extends Entity implements Parsable {
    /**
     * The alertData property
     */
    private AlertData alertData;
    /**
     * The alertDataReferenceStrings property
     */
    private java.util.List<AlertDataReferenceString> alertDataReferenceStrings;
    /**
     * The alertLogs property
     */
    private java.util.List<ManagedTenantAlertLog> alertLogs;
    /**
     * The alertRule property
     */
    private ManagedTenantAlertRule alertRule;
    /**
     * The alertRuleDisplayName property
     */
    private String alertRuleDisplayName;
    /**
     * The apiNotifications property
     */
    private java.util.List<ManagedTenantApiNotification> apiNotifications;
    /**
     * The assignedToUserId property
     */
    private String assignedToUserId;
    /**
     * The correlationCount property
     */
    private Integer correlationCount;
    /**
     * The correlationId property
     */
    private String correlationId;
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The emailNotifications property
     */
    private java.util.List<ManagedTenantEmailNotification> emailNotifications;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The message property
     */
    private String message;
    /**
     * The severity property
     */
    private AlertSeverity severity;
    /**
     * The status property
     */
    private AlertStatus status;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new managedTenantAlert and sets the default values.
     */
    public ManagedTenantAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenantAlert
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenantAlert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlert();
    }
    /**
     * Gets the alertData property value. The alertData property
     * @return a alertData
     */
    @jakarta.annotation.Nullable
    public AlertData getAlertData() {
        return this.alertData;
    }
    /**
     * Gets the alertDataReferenceStrings property value. The alertDataReferenceStrings property
     * @return a alertDataReferenceString
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertDataReferenceString> getAlertDataReferenceStrings() {
        return this.alertDataReferenceStrings;
    }
    /**
     * Gets the alertLogs property value. The alertLogs property
     * @return a managedTenantAlertLog
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertLog> getAlertLogs() {
        return this.alertLogs;
    }
    /**
     * Gets the alertRule property value. The alertRule property
     * @return a managedTenantAlertRule
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlertRule getAlertRule() {
        return this.alertRule;
    }
    /**
     * Gets the alertRuleDisplayName property value. The alertRuleDisplayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleDisplayName() {
        return this.alertRuleDisplayName;
    }
    /**
     * Gets the apiNotifications property value. The apiNotifications property
     * @return a managedTenantApiNotification
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantApiNotification> getApiNotifications() {
        return this.apiNotifications;
    }
    /**
     * Gets the assignedToUserId property value. The assignedToUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignedToUserId() {
        return this.assignedToUserId;
    }
    /**
     * Gets the correlationCount property value. The correlationCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCorrelationCount() {
        return this.correlationCount;
    }
    /**
     * Gets the correlationId property value. The correlationId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the emailNotifications property value. The emailNotifications property
     * @return a managedTenantEmailNotification
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantEmailNotification> getEmailNotifications() {
        return this.emailNotifications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertData", (n) -> { this.setAlertData(n.getObjectValue(AlertData::createFromDiscriminatorValue)); });
        deserializerMap.put("alertDataReferenceStrings", (n) -> { this.setAlertDataReferenceStrings(n.getCollectionOfObjectValues(AlertDataReferenceString::createFromDiscriminatorValue)); });
        deserializerMap.put("alertLogs", (n) -> { this.setAlertLogs(n.getCollectionOfObjectValues(ManagedTenantAlertLog::createFromDiscriminatorValue)); });
        deserializerMap.put("alertRule", (n) -> { this.setAlertRule(n.getObjectValue(ManagedTenantAlertRule::createFromDiscriminatorValue)); });
        deserializerMap.put("alertRuleDisplayName", (n) -> { this.setAlertRuleDisplayName(n.getStringValue()); });
        deserializerMap.put("apiNotifications", (n) -> { this.setApiNotifications(n.getCollectionOfObjectValues(ManagedTenantApiNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedToUserId", (n) -> { this.setAssignedToUserId(n.getStringValue()); });
        deserializerMap.put("correlationCount", (n) -> { this.setCorrelationCount(n.getIntegerValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("emailNotifications", (n) -> { this.setEmailNotifications(n.getCollectionOfObjectValues(ManagedTenantEmailNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AlertStatus.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a alertSeverity
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the status property value. The status property
     * @return a alertStatus
     */
    @jakarta.annotation.Nullable
    public AlertStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("alertData", this.getAlertData());
        writer.writeCollectionOfObjectValues("alertDataReferenceStrings", this.getAlertDataReferenceStrings());
        writer.writeCollectionOfObjectValues("alertLogs", this.getAlertLogs());
        writer.writeObjectValue("alertRule", this.getAlertRule());
        writer.writeStringValue("alertRuleDisplayName", this.getAlertRuleDisplayName());
        writer.writeCollectionOfObjectValues("apiNotifications", this.getApiNotifications());
        writer.writeStringValue("assignedToUserId", this.getAssignedToUserId());
        writer.writeIntegerValue("correlationCount", this.getCorrelationCount());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("emailNotifications", this.getEmailNotifications());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the alertData property value. The alertData property
     * @param value Value to set for the alertData property.
     */
    public void setAlertData(@jakarta.annotation.Nullable final AlertData value) {
        this.alertData = value;
    }
    /**
     * Sets the alertDataReferenceStrings property value. The alertDataReferenceStrings property
     * @param value Value to set for the alertDataReferenceStrings property.
     */
    public void setAlertDataReferenceStrings(@jakarta.annotation.Nullable final java.util.List<AlertDataReferenceString> value) {
        this.alertDataReferenceStrings = value;
    }
    /**
     * Sets the alertLogs property value. The alertLogs property
     * @param value Value to set for the alertLogs property.
     */
    public void setAlertLogs(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertLog> value) {
        this.alertLogs = value;
    }
    /**
     * Sets the alertRule property value. The alertRule property
     * @param value Value to set for the alertRule property.
     */
    public void setAlertRule(@jakarta.annotation.Nullable final ManagedTenantAlertRule value) {
        this.alertRule = value;
    }
    /**
     * Sets the alertRuleDisplayName property value. The alertRuleDisplayName property
     * @param value Value to set for the alertRuleDisplayName property.
     */
    public void setAlertRuleDisplayName(@jakarta.annotation.Nullable final String value) {
        this.alertRuleDisplayName = value;
    }
    /**
     * Sets the apiNotifications property value. The apiNotifications property
     * @param value Value to set for the apiNotifications property.
     */
    public void setApiNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantApiNotification> value) {
        this.apiNotifications = value;
    }
    /**
     * Sets the assignedToUserId property value. The assignedToUserId property
     * @param value Value to set for the assignedToUserId property.
     */
    public void setAssignedToUserId(@jakarta.annotation.Nullable final String value) {
        this.assignedToUserId = value;
    }
    /**
     * Sets the correlationCount property value. The correlationCount property
     * @param value Value to set for the correlationCount property.
     */
    public void setCorrelationCount(@jakarta.annotation.Nullable final Integer value) {
        this.correlationCount = value;
    }
    /**
     * Sets the correlationId property value. The correlationId property
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the emailNotifications property value. The emailNotifications property
     * @param value Value to set for the emailNotifications property.
     */
    public void setEmailNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantEmailNotification> value) {
        this.emailNotifications = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AlertStatus value) {
        this.status = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}

package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedTenantAlert extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedTenantAlert and sets the default values.
     */
    public ManagedTenantAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedTenantAlert
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenantAlert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlert();
    }
    /**
     * Gets the alertData property value. The alertData property
     * @return a AlertData
     */
    @jakarta.annotation.Nullable
    public AlertData getAlertData() {
        return this.BackingStore.get("alertData");
    }
    /**
     * Gets the alertDataReferenceStrings property value. The alertDataReferenceStrings property
     * @return a java.util.List<AlertDataReferenceString>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertDataReferenceString> getAlertDataReferenceStrings() {
        return this.BackingStore.get("alertDataReferenceStrings");
    }
    /**
     * Gets the alertLogs property value. The alertLogs property
     * @return a java.util.List<ManagedTenantAlertLog>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertLog> getAlertLogs() {
        return this.BackingStore.get("alertLogs");
    }
    /**
     * Gets the alertRule property value. The alertRule property
     * @return a ManagedTenantAlertRule
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlertRule getAlertRule() {
        return this.BackingStore.get("alertRule");
    }
    /**
     * Gets the alertRuleDisplayName property value. The alertRuleDisplayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleDisplayName() {
        return this.BackingStore.get("alertRuleDisplayName");
    }
    /**
     * Gets the apiNotifications property value. The apiNotifications property
     * @return a java.util.List<ManagedTenantApiNotification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantApiNotification> getApiNotifications() {
        return this.BackingStore.get("apiNotifications");
    }
    /**
     * Gets the assignedToUserId property value. The assignedToUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignedToUserId() {
        return this.BackingStore.get("assignedToUserId");
    }
    /**
     * Gets the correlationCount property value. The correlationCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCorrelationCount() {
        return this.BackingStore.get("correlationCount");
    }
    /**
     * Gets the correlationId property value. The correlationId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.BackingStore.get("correlationId");
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.BackingStore.get("createdByUserId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the emailNotifications property value. The emailNotifications property
     * @return a java.util.List<ManagedTenantEmailNotification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantEmailNotification> getEmailNotifications() {
        return this.BackingStore.get("emailNotifications");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.BackingStore.get("lastActionByUserId");
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.BackingStore.get("lastActionDateTime");
    }
    /**
     * Gets the message property value. The message property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.BackingStore.get("message");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a AlertSeverity
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.BackingStore.get("severity");
    }
    /**
     * Gets the status property value. The status property
     * @return a AlertStatus
     */
    @jakarta.annotation.Nullable
    public AlertStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.BackingStore.get("tenantId");
    }
    /**
     * Gets the title property value. The title property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.BackingStore.get("title");
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
        this.BackingStore.set("alertData", value);
    }
    /**
     * Sets the alertDataReferenceStrings property value. The alertDataReferenceStrings property
     * @param value Value to set for the alertDataReferenceStrings property.
     */
    public void setAlertDataReferenceStrings(@jakarta.annotation.Nullable final java.util.List<AlertDataReferenceString> value) {
        this.BackingStore.set("alertDataReferenceStrings", value);
    }
    /**
     * Sets the alertLogs property value. The alertLogs property
     * @param value Value to set for the alertLogs property.
     */
    public void setAlertLogs(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertLog> value) {
        this.BackingStore.set("alertLogs", value);
    }
    /**
     * Sets the alertRule property value. The alertRule property
     * @param value Value to set for the alertRule property.
     */
    public void setAlertRule(@jakarta.annotation.Nullable final ManagedTenantAlertRule value) {
        this.BackingStore.set("alertRule", value);
    }
    /**
     * Sets the alertRuleDisplayName property value. The alertRuleDisplayName property
     * @param value Value to set for the alertRuleDisplayName property.
     */
    public void setAlertRuleDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("alertRuleDisplayName", value);
    }
    /**
     * Sets the apiNotifications property value. The apiNotifications property
     * @param value Value to set for the apiNotifications property.
     */
    public void setApiNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantApiNotification> value) {
        this.BackingStore.set("apiNotifications", value);
    }
    /**
     * Sets the assignedToUserId property value. The assignedToUserId property
     * @param value Value to set for the assignedToUserId property.
     */
    public void setAssignedToUserId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("assignedToUserId", value);
    }
    /**
     * Sets the correlationCount property value. The correlationCount property
     * @param value Value to set for the correlationCount property.
     */
    public void setCorrelationCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("correlationCount", value);
    }
    /**
     * Sets the correlationId property value. The correlationId property
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("correlationId", value);
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("createdByUserId", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the emailNotifications property value. The emailNotifications property
     * @param value Value to set for the emailNotifications property.
     */
    public void setEmailNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantEmailNotification> value) {
        this.BackingStore.set("emailNotifications", value);
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("lastActionByUserId", value);
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("message", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.BackingStore.set("severity", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AlertStatus value) {
        this.BackingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tenantId", value);
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("title", value);
    }
}

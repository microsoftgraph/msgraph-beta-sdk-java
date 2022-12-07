package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedTenantAlert extends Entity implements Parsable {
    /** The alertData property */
    private AlertData _alertData;
    /** The alertDataReferenceStrings property */
    private java.util.List<AlertDataReferenceString> _alertDataReferenceStrings;
    /** The alertLogs property */
    private java.util.List<ManagedTenantAlertLog> _alertLogs;
    /** The alertRule property */
    private ManagedTenantAlertRule _alertRule;
    /** The alertRuleDisplayName property */
    private String _alertRuleDisplayName;
    /** The apiNotifications property */
    private java.util.List<ManagedTenantApiNotification> _apiNotifications;
    /** The assignedToUserId property */
    private String _assignedToUserId;
    /** The correlationCount property */
    private Integer _correlationCount;
    /** The correlationId property */
    private String _correlationId;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The emailNotifications property */
    private java.util.List<ManagedTenantEmailNotification> _emailNotifications;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The message property */
    private String _message;
    /** The severity property */
    private AlertSeverity _severity;
    /** The status property */
    private AlertStatus _status;
    /** The tenantId property */
    private String _tenantId;
    /** The title property */
    private String _title;
    /**
     * Instantiates a new managedTenantAlert and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenantAlert
     */
    @javax.annotation.Nonnull
    public static ManagedTenantAlert createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlert();
    }
    /**
     * Gets the alertData property value. The alertData property
     * @return a alertData
     */
    @javax.annotation.Nullable
    public AlertData getAlertData() {
        return this._alertData;
    }
    /**
     * Gets the alertDataReferenceStrings property value. The alertDataReferenceStrings property
     * @return a alertDataReferenceString
     */
    @javax.annotation.Nullable
    public java.util.List<AlertDataReferenceString> getAlertDataReferenceStrings() {
        return this._alertDataReferenceStrings;
    }
    /**
     * Gets the alertLogs property value. The alertLogs property
     * @return a managedTenantAlertLog
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedTenantAlertLog> getAlertLogs() {
        return this._alertLogs;
    }
    /**
     * Gets the alertRule property value. The alertRule property
     * @return a managedTenantAlertRule
     */
    @javax.annotation.Nullable
    public ManagedTenantAlertRule getAlertRule() {
        return this._alertRule;
    }
    /**
     * Gets the alertRuleDisplayName property value. The alertRuleDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertRuleDisplayName() {
        return this._alertRuleDisplayName;
    }
    /**
     * Gets the apiNotifications property value. The apiNotifications property
     * @return a managedTenantApiNotification
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedTenantApiNotification> getApiNotifications() {
        return this._apiNotifications;
    }
    /**
     * Gets the assignedToUserId property value. The assignedToUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedToUserId() {
        return this._assignedToUserId;
    }
    /**
     * Gets the correlationCount property value. The correlationCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCorrelationCount() {
        return this._correlationCount;
    }
    /**
     * Gets the correlationId property value. The correlationId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the emailNotifications property value. The emailNotifications property
     * @return a managedTenantEmailNotification
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedTenantEmailNotification> getEmailNotifications() {
        return this._emailNotifications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
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
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the title property value. The title property
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertData(@javax.annotation.Nullable final AlertData value) {
        this._alertData = value;
    }
    /**
     * Sets the alertDataReferenceStrings property value. The alertDataReferenceStrings property
     * @param value Value to set for the alertDataReferenceStrings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertDataReferenceStrings(@javax.annotation.Nullable final java.util.List<AlertDataReferenceString> value) {
        this._alertDataReferenceStrings = value;
    }
    /**
     * Sets the alertLogs property value. The alertLogs property
     * @param value Value to set for the alertLogs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertLogs(@javax.annotation.Nullable final java.util.List<ManagedTenantAlertLog> value) {
        this._alertLogs = value;
    }
    /**
     * Sets the alertRule property value. The alertRule property
     * @param value Value to set for the alertRule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRule(@javax.annotation.Nullable final ManagedTenantAlertRule value) {
        this._alertRule = value;
    }
    /**
     * Sets the alertRuleDisplayName property value. The alertRuleDisplayName property
     * @param value Value to set for the alertRuleDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRuleDisplayName(@javax.annotation.Nullable final String value) {
        this._alertRuleDisplayName = value;
    }
    /**
     * Sets the apiNotifications property value. The apiNotifications property
     * @param value Value to set for the apiNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApiNotifications(@javax.annotation.Nullable final java.util.List<ManagedTenantApiNotification> value) {
        this._apiNotifications = value;
    }
    /**
     * Sets the assignedToUserId property value. The assignedToUserId property
     * @param value Value to set for the assignedToUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedToUserId(@javax.annotation.Nullable final String value) {
        this._assignedToUserId = value;
    }
    /**
     * Sets the correlationCount property value. The correlationCount property
     * @param value Value to set for the correlationCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationCount(@javax.annotation.Nullable final Integer value) {
        this._correlationCount = value;
    }
    /**
     * Sets the correlationId property value. The correlationId property
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the emailNotifications property value. The emailNotifications property
     * @param value Value to set for the emailNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailNotifications(@javax.annotation.Nullable final java.util.List<ManagedTenantEmailNotification> value) {
        this._emailNotifications = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
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
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}

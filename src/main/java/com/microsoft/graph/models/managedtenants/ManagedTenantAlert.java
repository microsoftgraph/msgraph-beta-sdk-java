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
     * Instantiates a new ManagedTenantAlert and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantAlert() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managedTenantAlert");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedTenantAlert
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
        final ManagedTenantAlert currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("alertData", (n) -> { currentObject.setAlertData(n.getObjectValue(AlertData::createFromDiscriminatorValue)); });
            this.put("alertDataReferenceStrings", (n) -> { currentObject.setAlertDataReferenceStrings(n.getCollectionOfObjectValues(AlertDataReferenceString::createFromDiscriminatorValue)); });
            this.put("alertLogs", (n) -> { currentObject.setAlertLogs(n.getCollectionOfObjectValues(ManagedTenantAlertLog::createFromDiscriminatorValue)); });
            this.put("alertRule", (n) -> { currentObject.setAlertRule(n.getObjectValue(ManagedTenantAlertRule::createFromDiscriminatorValue)); });
            this.put("alertRuleDisplayName", (n) -> { currentObject.setAlertRuleDisplayName(n.getStringValue()); });
            this.put("apiNotifications", (n) -> { currentObject.setApiNotifications(n.getCollectionOfObjectValues(ManagedTenantApiNotification::createFromDiscriminatorValue)); });
            this.put("assignedToUserId", (n) -> { currentObject.setAssignedToUserId(n.getStringValue()); });
            this.put("correlationCount", (n) -> { currentObject.setCorrelationCount(n.getIntegerValue()); });
            this.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
            this.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("emailNotifications", (n) -> { currentObject.setEmailNotifications(n.getCollectionOfObjectValues(ManagedTenantEmailNotification::createFromDiscriminatorValue)); });
            this.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(AlertSeverity.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AlertStatus.class)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
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

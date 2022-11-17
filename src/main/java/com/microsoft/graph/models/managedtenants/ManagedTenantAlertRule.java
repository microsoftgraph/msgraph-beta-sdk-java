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
/** Provides operations to manage the collection of accessReview entities. */
public class ManagedTenantAlertRule extends Entity implements Parsable {
    /** The alertDisplayName property */
    private String _alertDisplayName;
    /** The alerts property */
    private java.util.List<ManagedTenantAlert> _alerts;
    /** The alertTTL property */
    private Integer _alertTTL;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The lastRunDateTime property */
    private OffsetDateTime _lastRunDateTime;
    /** The notificationFinalDestinations property */
    private NotificationDestination _notificationFinalDestinations;
    /** The ruleDefinition property */
    private ManagedTenantAlertRuleDefinition _ruleDefinition;
    /** The severity property */
    private AlertSeverity _severity;
    /** The targets property */
    private java.util.List<NotificationTarget> _targets;
    /** The tenantIds property */
    private java.util.List<TenantInfo> _tenantIds;
    /**
     * Instantiates a new managedTenantAlertRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantAlertRule() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managedTenantAlertRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenantAlertRule
     */
    @javax.annotation.Nonnull
    public static ManagedTenantAlertRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlertRule();
    }
    /**
     * Gets the alertDisplayName property value. The alertDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertDisplayName() {
        return this._alertDisplayName;
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a managedTenantAlert
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedTenantAlert> getAlerts() {
        return this._alerts;
    }
    /**
     * Gets the alertTTL property value. The alertTTL property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAlertTTL() {
        return this._alertTTL;
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedTenantAlertRule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("alertDisplayName", (n) -> { currentObject.setAlertDisplayName(n.getStringValue()); });
            this.put("alerts", (n) -> { currentObject.setAlerts(n.getCollectionOfObjectValues(ManagedTenantAlert::createFromDiscriminatorValue)); });
            this.put("alertTTL", (n) -> { currentObject.setAlertTTL(n.getIntegerValue()); });
            this.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastRunDateTime", (n) -> { currentObject.setLastRunDateTime(n.getOffsetDateTimeValue()); });
            this.put("notificationFinalDestinations", (n) -> { currentObject.setNotificationFinalDestinations(n.getEnumValue(NotificationDestination.class)); });
            this.put("ruleDefinition", (n) -> { currentObject.setRuleDefinition(n.getObjectValue(ManagedTenantAlertRuleDefinition::createFromDiscriminatorValue)); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(AlertSeverity.class)); });
            this.put("targets", (n) -> { currentObject.setTargets(n.getCollectionOfObjectValues(NotificationTarget::createFromDiscriminatorValue)); });
            this.put("tenantIds", (n) -> { currentObject.setTenantIds(n.getCollectionOfObjectValues(TenantInfo::createFromDiscriminatorValue)); });
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
     * Gets the lastRunDateTime property value. The lastRunDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this._lastRunDateTime;
    }
    /**
     * Gets the notificationFinalDestinations property value. The notificationFinalDestinations property
     * @return a notificationDestination
     */
    @javax.annotation.Nullable
    public NotificationDestination getNotificationFinalDestinations() {
        return this._notificationFinalDestinations;
    }
    /**
     * Gets the ruleDefinition property value. The ruleDefinition property
     * @return a managedTenantAlertRuleDefinition
     */
    @javax.annotation.Nullable
    public ManagedTenantAlertRuleDefinition getRuleDefinition() {
        return this._ruleDefinition;
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
     * Gets the targets property value. The targets property
     * @return a notificationTarget
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationTarget> getTargets() {
        return this._targets;
    }
    /**
     * Gets the tenantIds property value. The tenantIds property
     * @return a tenantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<TenantInfo> getTenantIds() {
        return this._tenantIds;
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
        writer.writeStringValue("alertDisplayName", this.getAlertDisplayName());
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeIntegerValue("alertTTL", this.getAlertTTL());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
        writer.writeEnumValue("notificationFinalDestinations", this.getNotificationFinalDestinations());
        writer.writeObjectValue("ruleDefinition", this.getRuleDefinition());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeCollectionOfObjectValues("tenantIds", this.getTenantIds());
    }
    /**
     * Sets the alertDisplayName property value. The alertDisplayName property
     * @param value Value to set for the alertDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertDisplayName(@javax.annotation.Nullable final String value) {
        this._alertDisplayName = value;
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlerts(@javax.annotation.Nullable final java.util.List<ManagedTenantAlert> value) {
        this._alerts = value;
    }
    /**
     * Sets the alertTTL property value. The alertTTL property
     * @param value Value to set for the alertTTL property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertTTL(@javax.annotation.Nullable final Integer value) {
        this._alertTTL = value;
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
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
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRunDateTime = value;
    }
    /**
     * Sets the notificationFinalDestinations property value. The notificationFinalDestinations property
     * @param value Value to set for the notificationFinalDestinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationFinalDestinations(@javax.annotation.Nullable final NotificationDestination value) {
        this._notificationFinalDestinations = value;
    }
    /**
     * Sets the ruleDefinition property value. The ruleDefinition property
     * @param value Value to set for the ruleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleDefinition(@javax.annotation.Nullable final ManagedTenantAlertRuleDefinition value) {
        this._ruleDefinition = value;
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
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargets(@javax.annotation.Nullable final java.util.List<NotificationTarget> value) {
        this._targets = value;
    }
    /**
     * Sets the tenantIds property value. The tenantIds property
     * @param value Value to set for the tenantIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantIds(@javax.annotation.Nullable final java.util.List<TenantInfo> value) {
        this._tenantIds = value;
    }
}

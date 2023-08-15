package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedTenantAlertRule extends Entity implements Parsable {
    /**
     * The alertDisplayName property
     */
    private String alertDisplayName;
    /**
     * The alerts property
     */
    private java.util.List<ManagedTenantAlert> alerts;
    /**
     * The alertTTL property
     */
    private Integer alertTTL;
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The lastRunDateTime property
     */
    private OffsetDateTime lastRunDateTime;
    /**
     * The notificationFinalDestinations property
     */
    private NotificationDestination notificationFinalDestinations;
    /**
     * The ruleDefinition property
     */
    private ManagedTenantAlertRuleDefinition ruleDefinition;
    /**
     * The severity property
     */
    private AlertSeverity severity;
    /**
     * The targets property
     */
    private java.util.List<NotificationTarget> targets;
    /**
     * The tenantIds property
     */
    private java.util.List<TenantInfo> tenantIds;
    /**
     * Instantiates a new managedTenantAlertRule and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlertRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenantAlertRule
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenantAlertRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlertRule();
    }
    /**
     * Gets the alertDisplayName property value. The alertDisplayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertDisplayName() {
        return this.alertDisplayName;
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a managedTenantAlert
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the alertTTL property value. The alertTTL property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAlertTTL() {
        return this.alertTTL;
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
     * Gets the description property value. The description property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertDisplayName", (n) -> { this.setAlertDisplayName(n.getStringValue()); });
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(ManagedTenantAlert::createFromDiscriminatorValue)); });
        deserializerMap.put("alertTTL", (n) -> { this.setAlertTTL(n.getIntegerValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRunDateTime", (n) -> { this.setLastRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notificationFinalDestinations", (n) -> { this.setNotificationFinalDestinations(n.getEnumValue(NotificationDestination.class)); });
        deserializerMap.put("ruleDefinition", (n) -> { this.setRuleDefinition(n.getObjectValue(ManagedTenantAlertRuleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(NotificationTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantIds", (n) -> { this.setTenantIds(n.getCollectionOfObjectValues(TenantInfo::createFromDiscriminatorValue)); });
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
     * Gets the lastRunDateTime property value. The lastRunDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.lastRunDateTime;
    }
    /**
     * Gets the notificationFinalDestinations property value. The notificationFinalDestinations property
     * @return a notificationDestination
     */
    @jakarta.annotation.Nullable
    public NotificationDestination getNotificationFinalDestinations() {
        return this.notificationFinalDestinations;
    }
    /**
     * Gets the ruleDefinition property value. The ruleDefinition property
     * @return a managedTenantAlertRuleDefinition
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlertRuleDefinition getRuleDefinition() {
        return this.ruleDefinition;
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
     * Gets the targets property value. The targets property
     * @return a notificationTarget
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationTarget> getTargets() {
        return this.targets;
    }
    /**
     * Gets the tenantIds property value. The tenantIds property
     * @return a tenantInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantInfo> getTenantIds() {
        return this.tenantIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAlertDisplayName(@jakarta.annotation.Nullable final String value) {
        this.alertDisplayName = value;
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlert> value) {
        this.alerts = value;
    }
    /**
     * Sets the alertTTL property value. The alertTTL property
     * @param value Value to set for the alertTTL property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlertTTL(@jakarta.annotation.Nullable final Integer value) {
        this.alertTTL = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRunDateTime = value;
    }
    /**
     * Sets the notificationFinalDestinations property value. The notificationFinalDestinations property
     * @param value Value to set for the notificationFinalDestinations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotificationFinalDestinations(@jakarta.annotation.Nullable final NotificationDestination value) {
        this.notificationFinalDestinations = value;
    }
    /**
     * Sets the ruleDefinition property value. The ruleDefinition property
     * @param value Value to set for the ruleDefinition property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRuleDefinition(@jakarta.annotation.Nullable final ManagedTenantAlertRuleDefinition value) {
        this.ruleDefinition = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<NotificationTarget> value) {
        this.targets = value;
    }
    /**
     * Sets the tenantIds property value. The tenantIds property
     * @param value Value to set for the tenantIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantIds(@jakarta.annotation.Nullable final java.util.List<TenantInfo> value) {
        this.tenantIds = value;
    }
}

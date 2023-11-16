package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedTenantAlertRule extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedTenantAlertRule and sets the default values.
     */
    public ManagedTenantAlertRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedTenantAlertRule
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenantAlertRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlertRule();
    }
    /**
     * Gets the alertDisplayName property value. The alertDisplayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlertDisplayName() {
        return this.BackingStore.get("alertDisplayName");
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a java.util.List<ManagedTenantAlert>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlert> getAlerts() {
        return this.BackingStore.get("alerts");
    }
    /**
     * Gets the alertTTL property value. The alertTTL property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAlertTTL() {
        return this.BackingStore.get("alertTTL");
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
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
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
        deserializerMap.put("notificationFinalDestinations", (n) -> { this.setNotificationFinalDestinations(n.getEnumSetValue(NotificationDestination.class)); });
        deserializerMap.put("ruleDefinition", (n) -> { this.setRuleDefinition(n.getObjectValue(ManagedTenantAlertRuleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(NotificationTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantIds", (n) -> { this.setTenantIds(n.getCollectionOfObjectValues(TenantInfo::createFromDiscriminatorValue)); });
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
     * Gets the lastRunDateTime property value. The lastRunDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.BackingStore.get("lastRunDateTime");
    }
    /**
     * Gets the notificationFinalDestinations property value. The notificationFinalDestinations property
     * @return a EnumSet<NotificationDestination>
     */
    @jakarta.annotation.Nullable
    public EnumSet<NotificationDestination> getNotificationFinalDestinations() {
        return this.BackingStore.get("notificationFinalDestinations");
    }
    /**
     * Gets the ruleDefinition property value. The ruleDefinition property
     * @return a ManagedTenantAlertRuleDefinition
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlertRuleDefinition getRuleDefinition() {
        return this.BackingStore.get("ruleDefinition");
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
     * Gets the targets property value. The targets property
     * @return a java.util.List<NotificationTarget>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationTarget> getTargets() {
        return this.BackingStore.get("targets");
    }
    /**
     * Gets the tenantIds property value. The tenantIds property
     * @return a java.util.List<TenantInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantInfo> getTenantIds() {
        return this.BackingStore.get("tenantIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
        writer.writeEnumSetValue("notificationFinalDestinations", this.getNotificationFinalDestinations());
        writer.writeObjectValue("ruleDefinition", this.getRuleDefinition());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeCollectionOfObjectValues("tenantIds", this.getTenantIds());
    }
    /**
     * Sets the alertDisplayName property value. The alertDisplayName property
     * @param value Value to set for the alertDisplayName property.
     */
    public void setAlertDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("alertDisplayName", value);
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlert> value) {
        this.BackingStore.set("alerts", value);
    }
    /**
     * Sets the alertTTL property value. The alertTTL property
     * @param value Value to set for the alertTTL property.
     */
    public void setAlertTTL(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("alertTTL", value);
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
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
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     */
    public void setLastRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastRunDateTime", value);
    }
    /**
     * Sets the notificationFinalDestinations property value. The notificationFinalDestinations property
     * @param value Value to set for the notificationFinalDestinations property.
     */
    public void setNotificationFinalDestinations(@jakarta.annotation.Nullable final EnumSet<NotificationDestination> value) {
        this.BackingStore.set("notificationFinalDestinations", value);
    }
    /**
     * Sets the ruleDefinition property value. The ruleDefinition property
     * @param value Value to set for the ruleDefinition property.
     */
    public void setRuleDefinition(@jakarta.annotation.Nullable final ManagedTenantAlertRuleDefinition value) {
        this.BackingStore.set("ruleDefinition", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.BackingStore.set("severity", value);
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     */
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<NotificationTarget> value) {
        this.BackingStore.set("targets", value);
    }
    /**
     * Sets the tenantIds property value. The tenantIds property
     * @param value Value to set for the tenantIds property.
     */
    public void setTenantIds(@jakarta.annotation.Nullable final java.util.List<TenantInfo> value) {
        this.BackingStore.set("tenantIds", value);
    }
}

package com.microsoft.graph.beta.models.devicemanagement;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertRule extends Entity implements Parsable {
    /**
     * Instantiates a new AlertRule and sets the default values.
     */
    public AlertRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AlertRule
     */
    @jakarta.annotation.Nonnull
    public static AlertRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertRule();
    }
    /**
     * Gets the alertRuleTemplate property value. The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, cloudPcInGracePeriodScenario, cloudPcFrontlineInsufficientLicensesScenario, cloudPcInaccessibleScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @return a AlertRuleTemplate
     */
    @jakarta.annotation.Nullable
    public AlertRuleTemplate getAlertRuleTemplate() {
        return this.backingStore.get("alertRuleTemplate");
    }
    /**
     * Gets the description property value. The rule description.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the rule.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enabled property value. The status of the rule that indicates whether the rule is enabled or disabled. If true, the rule is enabled; otherwise, the rule is disabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.backingStore.get("enabled");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertRuleTemplate", (n) -> { this.setAlertRuleTemplate(n.getEnumValue(AlertRuleTemplate::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSystemRule", (n) -> { this.setIsSystemRule(n.getBooleanValue()); });
        deserializerMap.put("notificationChannels", (n) -> { this.setNotificationChannels(n.getCollectionOfObjectValues(NotificationChannel::createFromDiscriminatorValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(RuleSeverityType::forValue)); });
        deserializerMap.put("threshold", (n) -> { this.setThreshold(n.getObjectValue(RuleThreshold::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isSystemRule property value. Indicates whether the rule is a system rule. If true, the rule is a system rule; otherwise, the rule is a custom-defined rule and can be edited. System rules are built in and only a few properties can be edited.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemRule() {
        return this.backingStore.get("isSystemRule");
    }
    /**
     * Gets the notificationChannels property value. The notification channels of the rule selected by the user.
     * @return a java.util.List<NotificationChannel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationChannel> getNotificationChannels() {
        return this.backingStore.get("notificationChannels");
    }
    /**
     * Gets the severity property value. The severity of the rule. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @return a RuleSeverityType
     */
    @jakarta.annotation.Nullable
    public RuleSeverityType getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the threshold property value. The conditions that determine when to send alerts. For example, you can configure a condition to send an alert when provisioning fails for six or more Cloud PCs. This property is deprecated. Use conditions instead.
     * @return a RuleThreshold
     */
    @jakarta.annotation.Nullable
    public RuleThreshold getThreshold() {
        return this.backingStore.get("threshold");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("alertRuleTemplate", this.getAlertRuleTemplate());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeBooleanValue("isSystemRule", this.getIsSystemRule());
        writer.writeCollectionOfObjectValues("notificationChannels", this.getNotificationChannels());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeObjectValue("threshold", this.getThreshold());
    }
    /**
     * Sets the alertRuleTemplate property value. The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, cloudPcInGracePeriodScenario, cloudPcFrontlineInsufficientLicensesScenario, cloudPcInaccessibleScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @param value Value to set for the alertRuleTemplate property.
     */
    public void setAlertRuleTemplate(@jakarta.annotation.Nullable final AlertRuleTemplate value) {
        this.backingStore.set("alertRuleTemplate", value);
    }
    /**
     * Sets the description property value. The rule description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the rule.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enabled property value. The status of the rule that indicates whether the rule is enabled or disabled. If true, the rule is enabled; otherwise, the rule is disabled.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enabled", value);
    }
    /**
     * Sets the isSystemRule property value. Indicates whether the rule is a system rule. If true, the rule is a system rule; otherwise, the rule is a custom-defined rule and can be edited. System rules are built in and only a few properties can be edited.
     * @param value Value to set for the isSystemRule property.
     */
    public void setIsSystemRule(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSystemRule", value);
    }
    /**
     * Sets the notificationChannels property value. The notification channels of the rule selected by the user.
     * @param value Value to set for the notificationChannels property.
     */
    public void setNotificationChannels(@jakarta.annotation.Nullable final java.util.List<NotificationChannel> value) {
        this.backingStore.set("notificationChannels", value);
    }
    /**
     * Sets the severity property value. The severity of the rule. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final RuleSeverityType value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the threshold property value. The conditions that determine when to send alerts. For example, you can configure a condition to send an alert when provisioning fails for six or more Cloud PCs. This property is deprecated. Use conditions instead.
     * @param value Value to set for the threshold property.
     */
    public void setThreshold(@jakarta.annotation.Nullable final RuleThreshold value) {
        this.backingStore.set("threshold", value);
    }
}

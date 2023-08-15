package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PortalNotification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The associated alert impact.
     */
    private AlertImpact alertImpact;
    /**
     * The associated alert record ID.
     */
    private String alertRecordId;
    /**
     * The associated alert rule ID.
     */
    private String alertRuleId;
    /**
     * The associated alert rule name.
     */
    private String alertRuleName;
    /**
     * The associated alert rule template. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     */
    private AlertRuleTemplate alertRuleTemplate;
    /**
     * The unique identifier for the portal notification.
     */
    private String id;
    /**
     * true if the portal notification has already been sent to the user; false otherwise.
     */
    private Boolean isPortalNotificationSent;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The associated alert rule severity. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     */
    private RuleSeverityType severity;
    /**
     * Instantiates a new portalNotification and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PortalNotification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a portalNotification
     */
    @jakarta.annotation.Nonnull
    public static PortalNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PortalNotification();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the alertImpact property value. The associated alert impact.
     * @return a alertImpact
     */
    @jakarta.annotation.Nullable
    public AlertImpact getAlertImpact() {
        return this.alertImpact;
    }
    /**
     * Gets the alertRecordId property value. The associated alert record ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertRecordId() {
        return this.alertRecordId;
    }
    /**
     * Gets the alertRuleId property value. The associated alert rule ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleId() {
        return this.alertRuleId;
    }
    /**
     * Gets the alertRuleName property value. The associated alert rule name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleName() {
        return this.alertRuleName;
    }
    /**
     * Gets the alertRuleTemplate property value. The associated alert rule template. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @return a alertRuleTemplate
     */
    @jakarta.annotation.Nullable
    public AlertRuleTemplate getAlertRuleTemplate() {
        return this.alertRuleTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("alertImpact", (n) -> { this.setAlertImpact(n.getObjectValue(AlertImpact::createFromDiscriminatorValue)); });
        deserializerMap.put("alertRecordId", (n) -> { this.setAlertRecordId(n.getStringValue()); });
        deserializerMap.put("alertRuleId", (n) -> { this.setAlertRuleId(n.getStringValue()); });
        deserializerMap.put("alertRuleName", (n) -> { this.setAlertRuleName(n.getStringValue()); });
        deserializerMap.put("alertRuleTemplate", (n) -> { this.setAlertRuleTemplate(n.getEnumValue(AlertRuleTemplate.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isPortalNotificationSent", (n) -> { this.setIsPortalNotificationSent(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(RuleSeverityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the portal notification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isPortalNotificationSent property value. true if the portal notification has already been sent to the user; false otherwise.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPortalNotificationSent() {
        return this.isPortalNotificationSent;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the severity property value. The associated alert rule severity. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @return a ruleSeverityType
     */
    @jakarta.annotation.Nullable
    public RuleSeverityType getSeverity() {
        return this.severity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("alertImpact", this.getAlertImpact());
        writer.writeStringValue("alertRecordId", this.getAlertRecordId());
        writer.writeStringValue("alertRuleId", this.getAlertRuleId());
        writer.writeStringValue("alertRuleName", this.getAlertRuleName());
        writer.writeEnumValue("alertRuleTemplate", this.getAlertRuleTemplate());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isPortalNotificationSent", this.getIsPortalNotificationSent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alertImpact property value. The associated alert impact.
     * @param value Value to set for the alertImpact property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlertImpact(@jakarta.annotation.Nullable final AlertImpact value) {
        this.alertImpact = value;
    }
    /**
     * Sets the alertRecordId property value. The associated alert record ID.
     * @param value Value to set for the alertRecordId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlertRecordId(@jakarta.annotation.Nullable final String value) {
        this.alertRecordId = value;
    }
    /**
     * Sets the alertRuleId property value. The associated alert rule ID.
     * @param value Value to set for the alertRuleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlertRuleId(@jakarta.annotation.Nullable final String value) {
        this.alertRuleId = value;
    }
    /**
     * Sets the alertRuleName property value. The associated alert rule name.
     * @param value Value to set for the alertRuleName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlertRuleName(@jakarta.annotation.Nullable final String value) {
        this.alertRuleName = value;
    }
    /**
     * Sets the alertRuleTemplate property value. The associated alert rule template. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @param value Value to set for the alertRuleTemplate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlertRuleTemplate(@jakarta.annotation.Nullable final AlertRuleTemplate value) {
        this.alertRuleTemplate = value;
    }
    /**
     * Sets the id property value. The unique identifier for the portal notification.
     * @param value Value to set for the id property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isPortalNotificationSent property value. true if the portal notification has already been sent to the user; false otherwise.
     * @param value Value to set for the isPortalNotificationSent property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsPortalNotificationSent(@jakarta.annotation.Nullable final Boolean value) {
        this.isPortalNotificationSent = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the severity property value. The associated alert rule severity. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSeverity(@jakarta.annotation.Nullable final RuleSeverityType value) {
        this.severity = value;
    }
}

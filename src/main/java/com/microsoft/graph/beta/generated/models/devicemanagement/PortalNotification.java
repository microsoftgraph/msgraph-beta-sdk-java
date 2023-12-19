package com.microsoft.graph.beta.models.devicemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PortalNotification implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PortalNotification and sets the default values.
     */
    public PortalNotification() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PortalNotification
     */
    @jakarta.annotation.Nonnull
    public static PortalNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PortalNotification();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the alertImpact property value. The associated alert impact.
     * @return a AlertImpact
     */
    @jakarta.annotation.Nullable
    public AlertImpact getAlertImpact() {
        return this.backingStore.get("alertImpact");
    }
    /**
     * Gets the alertRecordId property value. The associated alert record ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlertRecordId() {
        return this.backingStore.get("alertRecordId");
    }
    /**
     * Gets the alertRuleId property value. The associated alert rule ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleId() {
        return this.backingStore.get("alertRuleId");
    }
    /**
     * Gets the alertRuleName property value. The associated alert rule name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleName() {
        return this.backingStore.get("alertRuleName");
    }
    /**
     * Gets the alertRuleTemplate property value. The associated alert rule template. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @return a PortalNotificationAlertRuleTemplate
     */
    @jakarta.annotation.Nullable
    public PortalNotificationAlertRuleTemplate getAlertRuleTemplate() {
        return this.backingStore.get("alertRuleTemplate");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
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
        deserializerMap.put("alertRuleTemplate", (n) -> { this.setAlertRuleTemplate(n.getEnumValue(PortalNotificationAlertRuleTemplate::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isPortalNotificationSent", (n) -> { this.setIsPortalNotificationSent(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(PortalNotificationSeverity::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the portal notification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the isPortalNotificationSent property value. true if the portal notification has already been sent to the user; false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPortalNotificationSent() {
        return this.backingStore.get("isPortalNotificationSent");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the severity property value. The associated alert rule severity. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @return a PortalNotificationSeverity
     */
    @jakarta.annotation.Nullable
    public PortalNotificationSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the alertImpact property value. The associated alert impact.
     * @param value Value to set for the alertImpact property.
     */
    public void setAlertImpact(@jakarta.annotation.Nullable final AlertImpact value) {
        this.backingStore.set("alertImpact", value);
    }
    /**
     * Sets the alertRecordId property value. The associated alert record ID.
     * @param value Value to set for the alertRecordId property.
     */
    public void setAlertRecordId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertRecordId", value);
    }
    /**
     * Sets the alertRuleId property value. The associated alert rule ID.
     * @param value Value to set for the alertRuleId property.
     */
    public void setAlertRuleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertRuleId", value);
    }
    /**
     * Sets the alertRuleName property value. The associated alert rule name.
     * @param value Value to set for the alertRuleName property.
     */
    public void setAlertRuleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertRuleName", value);
    }
    /**
     * Sets the alertRuleTemplate property value. The associated alert rule template. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @param value Value to set for the alertRuleTemplate property.
     */
    public void setAlertRuleTemplate(@jakarta.annotation.Nullable final PortalNotificationAlertRuleTemplate value) {
        this.backingStore.set("alertRuleTemplate", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the id property value. The unique identifier for the portal notification.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the isPortalNotificationSent property value. true if the portal notification has already been sent to the user; false otherwise.
     * @param value Value to set for the isPortalNotificationSent property.
     */
    public void setIsPortalNotificationSent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPortalNotificationSent", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the severity property value. The associated alert rule severity. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final PortalNotificationSeverity value) {
        this.backingStore.set("severity", value);
    }
}

package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicySubjectEnforcement implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LifecyclePolicySubjectEnforcement} and sets the default values.
     */
    public LifecyclePolicySubjectEnforcement() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicySubjectEnforcement}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicySubjectEnforcement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecyclePolicySubjectEnforcement();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("isLocked", (n) -> { this.setIsLocked(n.getBooleanValue()); });
        deserializerMap.put("isTerminal", (n) -> { this.setIsTerminal(n.getBooleanValue()); });
        deserializerMap.put("lastAction", (n) -> { this.setLastAction(n.getEnumValue(LifecyclePolicyEnforcementActionState::forValue)); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextAction", (n) -> { this.setNextAction(n.getEnumValue(LifecyclePolicyNextEnforcementAction::forValue)); });
        deserializerMap.put("nextActionDateTime", (n) -> { this.setNextActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LifecyclePolicyEnforcementStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isLocked property value. Indicates whether enforcement is locked.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLocked() {
        return this.backingStore.get("isLocked");
    }
    /**
     * Gets the isTerminal property value. Indicates whether enforcement reached a terminal state.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTerminal() {
        return this.backingStore.get("isTerminal");
    }
    /**
     * Gets the lastAction property value. The lastAction property
     * @return a {@link LifecyclePolicyEnforcementActionState}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyEnforcementActionState getLastAction() {
        return this.backingStore.get("lastAction");
    }
    /**
     * Gets the lastActionDateTime property value. The date and time when the last enforcement action completed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the nextAction property value. The next enforcement action. The possible values are: nonComplianceNotification, firstNotification, secondNotification, finalNotification, disable, disableNotification, delete, unknownFutureValue.
     * @return a {@link LifecyclePolicyNextEnforcementAction}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyNextEnforcementAction getNextAction() {
        return this.backingStore.get("nextAction");
    }
    /**
     * Gets the nextActionDateTime property value. The date and time when the next enforcement action is scheduled.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextActionDateTime() {
        return this.backingStore.get("nextActionDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link LifecyclePolicyEnforcementStatus}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyEnforcementStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isLocked", this.getIsLocked());
        writer.writeBooleanValue("isTerminal", this.getIsTerminal());
        writer.writeEnumValue("lastAction", this.getLastAction());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeEnumValue("nextAction", this.getNextAction());
        writer.writeOffsetDateTimeValue("nextActionDateTime", this.getNextActionDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the isLocked property value. Indicates whether enforcement is locked.
     * @param value Value to set for the isLocked property.
     */
    public void setIsLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLocked", value);
    }
    /**
     * Sets the isTerminal property value. Indicates whether enforcement reached a terminal state.
     * @param value Value to set for the isTerminal property.
     */
    public void setIsTerminal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTerminal", value);
    }
    /**
     * Sets the lastAction property value. The lastAction property
     * @param value Value to set for the lastAction property.
     */
    public void setLastAction(@jakarta.annotation.Nullable final LifecyclePolicyEnforcementActionState value) {
        this.backingStore.set("lastAction", value);
    }
    /**
     * Sets the lastActionDateTime property value. The date and time when the last enforcement action completed.
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the nextAction property value. The next enforcement action. The possible values are: nonComplianceNotification, firstNotification, secondNotification, finalNotification, disable, disableNotification, delete, unknownFutureValue.
     * @param value Value to set for the nextAction property.
     */
    public void setNextAction(@jakarta.annotation.Nullable final LifecyclePolicyNextEnforcementAction value) {
        this.backingStore.set("nextAction", value);
    }
    /**
     * Sets the nextActionDateTime property value. The date and time when the next enforcement action is scheduled.
     * @param value Value to set for the nextActionDateTime property.
     */
    public void setNextActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("nextActionDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LifecyclePolicyEnforcementStatus value) {
        this.backingStore.set("status", value);
    }
}

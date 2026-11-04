package com.microsoft.graph.beta.models.security.casemanagement;

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
public class SlaPolicyTimer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SlaPolicyTimer} and sets the default values.
     */
    public SlaPolicyTimer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SlaPolicyTimer}
     */
    @jakarta.annotation.Nonnull
    public static SlaPolicyTimer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SlaPolicyTimer();
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
     * Gets the breachThresholdInMinutes property value. The elapsed time in minutes after which the timer is considered breached. Required when supplying a timer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBreachThresholdInMinutes() {
        return this.backingStore.get("breachThresholdInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("breachThresholdInMinutes", (n) -> { this.setBreachThresholdInMinutes(n.getIntegerValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getObjectValue(SlaPolicyCriteriaBlock::createFromDiscriminatorValue)); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        deserializerMap.put("policyTimerId", (n) -> { this.setPolicyTimerId(n.getStringValue()); });
        deserializerMap.put("warningThresholdInMinutes", (n) -> { this.setWarningThresholdInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The condition that a case must match for this timer to apply. Required when isDefault is false. Omit this property for the default timer.
     * @return a {@link SlaPolicyCriteriaBlock}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyCriteriaBlock getFilters() {
        return this.backingStore.get("filters");
    }
    /**
     * Gets the isDefault property value. Whether this timer is the fallback when no other timer&apos;s filters match. Required when supplying a timer. Exactly one timer per policy must have a value of true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
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
     * Gets the order property value. The evaluation order among the policy&apos;s timers, lowest first. Required when supplying a timer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOrder() {
        return this.backingStore.get("order");
    }
    /**
     * Gets the policyTimerId property value. The server-generated identifier for the timer. Computed on creation and immutable thereafter. Read-only. Omit this property from request bodies.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyTimerId() {
        return this.backingStore.get("policyTimerId");
    }
    /**
     * Gets the warningThresholdInMinutes property value. The elapsed time in minutes after which an early warning is raised.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWarningThresholdInMinutes() {
        return this.backingStore.get("warningThresholdInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("breachThresholdInMinutes", this.getBreachThresholdInMinutes());
        writer.writeObjectValue("filters", this.getFilters());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeIntegerValue("warningThresholdInMinutes", this.getWarningThresholdInMinutes());
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
     * Sets the breachThresholdInMinutes property value. The elapsed time in minutes after which the timer is considered breached. Required when supplying a timer.
     * @param value Value to set for the breachThresholdInMinutes property.
     */
    public void setBreachThresholdInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("breachThresholdInMinutes", value);
    }
    /**
     * Sets the filters property value. The condition that a case must match for this timer to apply. Required when isDefault is false. Omit this property for the default timer.
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final SlaPolicyCriteriaBlock value) {
        this.backingStore.set("filters", value);
    }
    /**
     * Sets the isDefault property value. Whether this timer is the fallback when no other timer&apos;s filters match. Required when supplying a timer. Exactly one timer per policy must have a value of true.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the order property value. The evaluation order among the policy&apos;s timers, lowest first. Required when supplying a timer.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("order", value);
    }
    /**
     * Sets the policyTimerId property value. The server-generated identifier for the timer. Computed on creation and immutable thereafter. Read-only. Omit this property from request bodies.
     * @param value Value to set for the policyTimerId property.
     */
    public void setPolicyTimerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyTimerId", value);
    }
    /**
     * Sets the warningThresholdInMinutes property value. The elapsed time in minutes after which an early warning is raised.
     * @param value Value to set for the warningThresholdInMinutes property.
     */
    public void setWarningThresholdInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("warningThresholdInMinutes", value);
    }
}

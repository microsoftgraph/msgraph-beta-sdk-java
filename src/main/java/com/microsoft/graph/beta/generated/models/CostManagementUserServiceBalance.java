package com.microsoft.graph.beta.models;

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
/**
 * Per-service balance and enforcement-selection diagnosis for a user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementUserServiceBalance implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CostManagementUserServiceBalance} and sets the default values.
     */
    public CostManagementUserServiceBalance() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementUserServiceBalance}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementUserServiceBalance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementUserServiceBalance();
    }
    /**
     * Gets the accessDecisionReason property value. The reason for a user&apos;s access decision for a service.
     * @return a {@link AccessDecisionReason}
     */
    @jakarta.annotation.Nullable
    public AccessDecisionReason getAccessDecisionReason() {
        return this.backingStore.get("accessDecisionReason");
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
     * Gets the configuredPeriodLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @return a {@link CostManagementQuantity}
     */
    @jakarta.annotation.Nullable
    public CostManagementQuantity getConfiguredPeriodLimit() {
        return this.backingStore.get("configuredPeriodLimit");
    }
    /**
     * Gets the configuredPerUserLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @return a {@link CostManagementQuantity}
     */
    @jakarta.annotation.Nullable
    public CostManagementQuantity getConfiguredPerUserLimit() {
        return this.backingStore.get("configuredPerUserLimit");
    }
    /**
     * Gets the consumedQuantity property value. Measured consumption for the selected service context, counted from the start of thecurrent period: month-to-date in UTC.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConsumedQuantity() {
        return this.backingStore.get("consumedQuantity");
    }
    /**
     * Gets the dataStatus property value. Last modification time for the source data represented by a result.
     * @return a {@link CostManagementDataStatus}
     */
    @jakarta.annotation.Nullable
    public CostManagementDataStatus getDataStatus() {
        return this.backingStore.get("dataStatus");
    }
    /**
     * Gets the effectiveCapacityQuantity property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @return a {@link CostManagementQuantity}
     */
    @jakarta.annotation.Nullable
    public CostManagementQuantity getEffectiveCapacityQuantity() {
        return this.backingStore.get("effectiveCapacityQuantity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("accessDecisionReason", (n) -> { this.setAccessDecisionReason(n.getEnumValue(AccessDecisionReason::forValue)); });
        deserializerMap.put("configuredPeriodLimit", (n) -> { this.setConfiguredPeriodLimit(n.getObjectValue(CostManagementQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("configuredPerUserLimit", (n) -> { this.setConfiguredPerUserLimit(n.getObjectValue(CostManagementQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("consumedQuantity", (n) -> { this.setConsumedQuantity(n.getDoubleValue()); });
        deserializerMap.put("dataStatus", (n) -> { this.setDataStatus(n.getObjectValue(CostManagementDataStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("effectiveCapacityQuantity", (n) -> { this.setEffectiveCapacityQuantity(n.getObjectValue(CostManagementQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("isConsumptionAllowed", (n) -> { this.setIsConsumptionAllowed(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remainingQuantity", (n) -> { this.setRemainingQuantity(n.getObjectValue(CostManagementQuantity::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("spendingPolicyId", (n) -> { this.setSpendingPolicyId(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(CostManagementUnit::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isConsumptionAllowed property value. Whether the user can currently consume the service. False covers both an entitlement gateand an exhausted limit; accessDecisionReason states which one applies.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsConsumptionAllowed() {
        return this.backingStore.get("isConsumptionAllowed");
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
     * Gets the remainingQuantity property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @return a {@link CostManagementQuantity}
     */
    @jakarta.annotation.Nullable
    public CostManagementQuantity getRemainingQuantity() {
        return this.backingStore.get("remainingQuantity");
    }
    /**
     * Gets the serviceId property value. The service identifier. A user holds at most one balance per service. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.backingStore.get("serviceId");
    }
    /**
     * Gets the spendingPolicyId property value. The identifier of the spending policy selected for this service. Always present: aservice with no selected policy is reported incostManagementUserBalance.unevaluatedServices instead of as a balance row. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpendingPolicyId() {
        return this.backingStore.get("spendingPolicyId");
    }
    /**
     * Gets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @return a {@link CostManagementUnit}
     */
    @jakarta.annotation.Nullable
    public CostManagementUnit getUnit() {
        return this.backingStore.get("unit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessDecisionReason", this.getAccessDecisionReason());
        writer.writeObjectValue("configuredPeriodLimit", this.getConfiguredPeriodLimit());
        writer.writeObjectValue("configuredPerUserLimit", this.getConfiguredPerUserLimit());
        writer.writeDoubleValue("consumedQuantity", this.getConsumedQuantity());
        writer.writeObjectValue("dataStatus", this.getDataStatus());
        writer.writeObjectValue("effectiveCapacityQuantity", this.getEffectiveCapacityQuantity());
        writer.writeBooleanValue("isConsumptionAllowed", this.getIsConsumptionAllowed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("remainingQuantity", this.getRemainingQuantity());
        writer.writeEnumValue("unit", this.getUnit());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessDecisionReason property value. The reason for a user&apos;s access decision for a service.
     * @param value Value to set for the accessDecisionReason property.
     */
    public void setAccessDecisionReason(@jakarta.annotation.Nullable final AccessDecisionReason value) {
        this.backingStore.set("accessDecisionReason", value);
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
     * Sets the configuredPeriodLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @param value Value to set for the configuredPeriodLimit property.
     */
    public void setConfiguredPeriodLimit(@jakarta.annotation.Nullable final CostManagementQuantity value) {
        this.backingStore.set("configuredPeriodLimit", value);
    }
    /**
     * Sets the configuredPerUserLimit property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @param value Value to set for the configuredPerUserLimit property.
     */
    public void setConfiguredPerUserLimit(@jakarta.annotation.Nullable final CostManagementQuantity value) {
        this.backingStore.set("configuredPerUserLimit", value);
    }
    /**
     * Sets the consumedQuantity property value. Measured consumption for the selected service context, counted from the start of thecurrent period: month-to-date in UTC.
     * @param value Value to set for the consumedQuantity property.
     */
    public void setConsumedQuantity(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("consumedQuantity", value);
    }
    /**
     * Sets the dataStatus property value. Last modification time for the source data represented by a result.
     * @param value Value to set for the dataStatus property.
     */
    public void setDataStatus(@jakarta.annotation.Nullable final CostManagementDataStatus value) {
        this.backingStore.set("dataStatus", value);
    }
    /**
     * Sets the effectiveCapacityQuantity property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @param value Value to set for the effectiveCapacityQuantity property.
     */
    public void setEffectiveCapacityQuantity(@jakarta.annotation.Nullable final CostManagementQuantity value) {
        this.backingStore.set("effectiveCapacityQuantity", value);
    }
    /**
     * Sets the isConsumptionAllowed property value. Whether the user can currently consume the service. False covers both an entitlement gateand an exhausted limit; accessDecisionReason states which one applies.
     * @param value Value to set for the isConsumptionAllowed property.
     */
    public void setIsConsumptionAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isConsumptionAllowed", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remainingQuantity property value. A unit-bearing quantity that is either limited to a value or unlimited. Every quantity isone of its derived types, identified by @odata.type on create.
     * @param value Value to set for the remainingQuantity property.
     */
    public void setRemainingQuantity(@jakarta.annotation.Nullable final CostManagementQuantity value) {
        this.backingStore.set("remainingQuantity", value);
    }
    /**
     * Sets the serviceId property value. The service identifier. A user holds at most one balance per service. Read-only.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceId", value);
    }
    /**
     * Sets the spendingPolicyId property value. The identifier of the spending policy selected for this service. Always present: aservice with no selected policy is reported incostManagementUserBalance.unevaluatedServices instead of as a balance row. Read-only.
     * @param value Value to set for the spendingPolicyId property.
     */
    public void setSpendingPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("spendingPolicyId", value);
    }
    /**
     * Sets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final CostManagementUnit value) {
        this.backingStore.set("unit", value);
    }
}

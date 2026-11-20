package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * One funding class&apos;s share of reported consumption for a calendar month.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementFundingUsageRecord extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementFundingUsageRecord} and sets the default values.
     */
    public CostManagementFundingUsageRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementFundingUsageRecord}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementFundingUsageRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementFundingUsageRecord();
    }
    /**
     * Gets the consumedQuantity property value. Consumption attributed to this funding class during the requested month, includingunbilled consumption where applicable. Read-only.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConsumedQuantity() {
        return this.backingStore.get("consumedQuantity");
    }
    /**
     * Gets the dataStatus property value. Freshness of the source data behind a Phase 2 usage report result that can report it.
     * @return a {@link CostManagementUsageDataStatus}
     */
    @jakarta.annotation.Nullable
    public CostManagementUsageDataStatus getDataStatus() {
        return this.backingStore.get("dataStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("consumedQuantity", (n) -> { this.setConsumedQuantity(n.getDoubleValue()); });
        deserializerMap.put("dataStatus", (n) -> { this.setDataStatus(n.getObjectValue(CostManagementUsageDataStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("fundingClass", (n) -> { this.setFundingClass(n.getEnumValue(CostManagementFundingClass::forValue)); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(CostManagementUnit::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fundingClass property value. The funding classification of reported consumption, including unbilled consumption.
     * @return a {@link CostManagementFundingClass}
     */
    @jakarta.annotation.Nullable
    public CostManagementFundingClass getFundingClass() {
        return this.backingStore.get("fundingClass");
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
        super.serialize(writer);
        writer.writeObjectValue("dataStatus", this.getDataStatus());
        writer.writeEnumValue("fundingClass", this.getFundingClass());
        writer.writeEnumValue("unit", this.getUnit());
    }
    /**
     * Sets the consumedQuantity property value. Consumption attributed to this funding class during the requested month, includingunbilled consumption where applicable. Read-only.
     * @param value Value to set for the consumedQuantity property.
     */
    public void setConsumedQuantity(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("consumedQuantity", value);
    }
    /**
     * Sets the dataStatus property value. Freshness of the source data behind a Phase 2 usage report result that can report it.
     * @param value Value to set for the dataStatus property.
     */
    public void setDataStatus(@jakarta.annotation.Nullable final CostManagementUsageDataStatus value) {
        this.backingStore.set("dataStatus", value);
    }
    /**
     * Sets the fundingClass property value. The funding classification of reported consumption, including unbilled consumption.
     * @param value Value to set for the fundingClass property.
     */
    public void setFundingClass(@jakarta.annotation.Nullable final CostManagementFundingClass value) {
        this.backingStore.set("fundingClass", value);
    }
    /**
     * Sets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final CostManagementUnit value) {
        this.backingStore.set("unit", value);
    }
}

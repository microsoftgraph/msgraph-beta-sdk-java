package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * One governed service&apos;s share of a user&apos;s raw usage detail.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementUserUsageServiceDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementUserUsageServiceDetail} and sets the default values.
     */
    public CostManagementUserUsageServiceDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementUserUsageServiceDetail}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementUserUsageServiceDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementUserUsageServiceDetail();
    }
    /**
     * Gets the consumedQuantity property value. Raw, billable-flagged consumption attributed to this service within the containing user&apos;sdetail window. Independently rounded; child rows are not guaranteed to sum exactly to thecontaining detail&apos;s consumedQuantity. Read-only.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConsumedQuantity() {
        return this.backingStore.get("consumedQuantity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("consumedQuantity", (n) -> { this.setConsumedQuantity(n.getDoubleValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(CostManagementUnit::forValue)); });
        return deserializerMap;
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
        writer.writeEnumValue("unit", this.getUnit());
    }
    /**
     * Sets the consumedQuantity property value. Raw, billable-flagged consumption attributed to this service within the containing user&apos;sdetail window. Independently rounded; child rows are not guaranteed to sum exactly to thecontaining detail&apos;s consumedQuantity. Read-only.
     * @param value Value to set for the consumedQuantity property.
     */
    public void setConsumedQuantity(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("consumedQuantity", value);
    }
    /**
     * Sets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final CostManagementUnit value) {
        this.backingStore.set("unit", value);
    }
}

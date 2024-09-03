package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomersSpendingBudgetSecurityRequirement extends SecurityRequirement implements Parsable {
    /**
     * Instantiates a new {@link CustomersSpendingBudgetSecurityRequirement} and sets the default values.
     */
    public CustomersSpendingBudgetSecurityRequirement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomersSpendingBudgetSecurityRequirement}
     */
    @jakarta.annotation.Nonnull
    public static CustomersSpendingBudgetSecurityRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomersSpendingBudgetSecurityRequirement();
    }
    /**
     * Gets the customersWithSpendBudgetCount property value. The number of customers with a spending budget set.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCustomersWithSpendBudgetCount() {
        return this.backingStore.get("customersWithSpendBudgetCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customersWithSpendBudgetCount", (n) -> { this.setCustomersWithSpendBudgetCount(n.getLongValue()); });
        deserializerMap.put("totalCustomersCount", (n) -> { this.setTotalCustomersCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalCustomersCount property value. The total number of customers associated with the partner.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalCustomersCount() {
        return this.backingStore.get("totalCustomersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("customersWithSpendBudgetCount", this.getCustomersWithSpendBudgetCount());
        writer.writeLongValue("totalCustomersCount", this.getTotalCustomersCount());
    }
    /**
     * Sets the customersWithSpendBudgetCount property value. The number of customers with a spending budget set.
     * @param value Value to set for the customersWithSpendBudgetCount property.
     */
    public void setCustomersWithSpendBudgetCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("customersWithSpendBudgetCount", value);
    }
    /**
     * Sets the totalCustomersCount property value. The total number of customers associated with the partner.
     * @param value Value to set for the totalCustomersCount property.
     */
    public void setTotalCustomersCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalCustomersCount", value);
    }
}

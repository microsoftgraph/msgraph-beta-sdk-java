package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Copilot Cost Management administration root.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementRoot} and sets the default values.
     */
    public CostManagementRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementRoot}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("spendingPolicies", (n) -> { this.setSpendingPolicies(n.getCollectionOfObjectValues(SpendingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("userBalances", (n) -> { this.setUserBalances(n.getCollectionOfObjectValues(CostManagementUserBalance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the spendingPolicies property value. The spending policies that govern Copilot Credits consumption.
     * @return a {@link java.util.List<SpendingPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SpendingPolicy> getSpendingPolicies() {
        return this.backingStore.get("spendingPolicies");
    }
    /**
     * Gets the userBalances property value. Per-user consumption balances, addressed by the user&apos;s identifier.
     * @return a {@link java.util.List<CostManagementUserBalance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUserBalance> getUserBalances() {
        return this.backingStore.get("userBalances");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("spendingPolicies", this.getSpendingPolicies());
        writer.writeCollectionOfObjectValues("userBalances", this.getUserBalances());
    }
    /**
     * Sets the spendingPolicies property value. The spending policies that govern Copilot Credits consumption.
     * @param value Value to set for the spendingPolicies property.
     */
    public void setSpendingPolicies(@jakarta.annotation.Nullable final java.util.List<SpendingPolicy> value) {
        this.backingStore.set("spendingPolicies", value);
    }
    /**
     * Sets the userBalances property value. Per-user consumption balances, addressed by the user&apos;s identifier.
     * @param value Value to set for the userBalances property.
     */
    public void setUserBalances(@jakarta.annotation.Nullable final java.util.List<CostManagementUserBalance> value) {
        this.backingStore.set("userBalances", value);
    }
}

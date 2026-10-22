package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A user&apos;s computed per-service consumption balance. Addressed by the user&apos;s identifier; onebalance resource exists per user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementUserBalance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementUserBalance} and sets the default values.
     */
    public CostManagementUserBalance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementUserBalance}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementUserBalance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementUserBalance();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("selectionDataStatus", (n) -> { this.setSelectionDataStatus(n.getObjectValue(SelectionDataStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceBalances", (n) -> { this.setServiceBalances(n.getCollectionOfObjectValues(CostManagementUserServiceBalance::createFromDiscriminatorValue)); });
        deserializerMap.put("unevaluatedServices", (n) -> { this.setUnevaluatedServices(n.getCollectionOfObjectValues(CostManagementUnevaluatedService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the selectionDataStatus property value. Freshness of each source that contributed to a computed balance or selection.
     * @return a {@link SelectionDataStatus}
     */
    @jakarta.annotation.Nullable
    public SelectionDataStatus getSelectionDataStatus() {
        return this.backingStore.get("selectionDataStatus");
    }
    /**
     * Gets the serviceBalances property value. Per-service balance rows for the user. Services listed in unevaluatedServices areomitted. Expand to inline them.
     * @return a {@link java.util.List<CostManagementUserServiceBalance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUserServiceBalance> getServiceBalances() {
        return this.backingStore.get("serviceBalances");
    }
    /**
     * Gets the unevaluatedServices property value. Services whose balance could not be evaluated. Empty on a fully successful read; anon-empty collection means the result is partial. When no service could be evaluated, therequest fails with 503 sourceUnavailable. Read-only.
     * @return a {@link java.util.List<CostManagementUnevaluatedService>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUnevaluatedService> getUnevaluatedServices() {
        return this.backingStore.get("unevaluatedServices");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("selectionDataStatus", this.getSelectionDataStatus());
        writer.writeCollectionOfObjectValues("serviceBalances", this.getServiceBalances());
    }
    /**
     * Sets the selectionDataStatus property value. Freshness of each source that contributed to a computed balance or selection.
     * @param value Value to set for the selectionDataStatus property.
     */
    public void setSelectionDataStatus(@jakarta.annotation.Nullable final SelectionDataStatus value) {
        this.backingStore.set("selectionDataStatus", value);
    }
    /**
     * Sets the serviceBalances property value. Per-service balance rows for the user. Services listed in unevaluatedServices areomitted. Expand to inline them.
     * @param value Value to set for the serviceBalances property.
     */
    public void setServiceBalances(@jakarta.annotation.Nullable final java.util.List<CostManagementUserServiceBalance> value) {
        this.backingStore.set("serviceBalances", value);
    }
    /**
     * Sets the unevaluatedServices property value. Services whose balance could not be evaluated. Empty on a fully successful read; anon-empty collection means the result is partial. When no service could be evaluated, therequest fails with 503 sourceUnavailable. Read-only.
     * @param value Value to set for the unevaluatedServices property.
     */
    public void setUnevaluatedServices(@jakarta.annotation.Nullable final java.util.List<CostManagementUnevaluatedService> value) {
        this.backingStore.set("unevaluatedServices", value);
    }
}

package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Allotment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Allotment} and sets the default values.
     */
    public Allotment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Allotment}
     */
    @jakarta.annotation.Nonnull
    public static Allotment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Allotment();
    }
    /**
     * Gets the allottedUnits property value. The number of licenses contained within the allotment. Not nullable. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAllottedUnits() {
        return this.backingStore.get("allottedUnits");
    }
    /**
     * Gets the assignableTo property value. The assignableTo property
     * @return a {@link EnumSet<AssigneeTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AssigneeTypes> getAssignableTo() {
        return this.backingStore.get("assignableTo");
    }
    /**
     * Gets the assignments property value. The list of license assignments that consume licenses from this allotment. Not nullable.
     * @return a {@link java.util.List<Assignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Assignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the consumedUnits property value. The number of licenses that are currently consumed by assignments from this allotment. Not nullable. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConsumedUnits() {
        return this.backingStore.get("consumedUnits");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allottedUnits", (n) -> { this.setAllottedUnits(n.getIntegerValue()); });
        deserializerMap.put("assignableTo", (n) -> { this.setAssignableTo(n.getEnumSetValue(AssigneeTypes::forValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(Assignment::createFromDiscriminatorValue)); });
        deserializerMap.put("consumedUnits", (n) -> { this.setConsumedUnits(n.getIntegerValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(Service::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getCollectionOfObjectValues(Subscription::createFromDiscriminatorValue)); });
        deserializerMap.put("waitingMembers", (n) -> { this.setWaitingMembers(n.getCollectionOfObjectValues(WaitingMember::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the services property value. The list of services that might be enabled or disabled for assignments from this allotment. Not nullable. Read-only.
     * @return a {@link java.util.List<Service>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Service> getServices() {
        return this.backingStore.get("services");
    }
    /**
     * Gets the skuId property value. Unique identifier (GUID) for the service SKU that is equal to the skuId property on the related subscribedSku object. Read-only. Supports $filter.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getSkuId() {
        return this.backingStore.get("skuId");
    }
    /**
     * Gets the skuPartNumber property value. Unique SKU display name that is equal to the skuPartNumber on the related subscribedSku object; for example, AAD_Premium. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuPartNumber() {
        return this.backingStore.get("skuPartNumber");
    }
    /**
     * Gets the subscriptions property value. Basic information about the subscriptions that supports this allotment.
     * @return a {@link java.util.List<Subscription>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this.backingStore.get("subscriptions");
    }
    /**
     * Gets the waitingMembers property value. List of over-assigned users who are in the waiting room for an allotment due to license capacity limits.
     * @return a {@link java.util.List<WaitingMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WaitingMember> getWaitingMembers() {
        return this.backingStore.get("waitingMembers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("allottedUnits", this.getAllottedUnits());
        writer.writeEnumSetValue("assignableTo", this.getAssignableTo());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeIntegerValue("consumedUnits", this.getConsumedUnits());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
        writer.writeCollectionOfObjectValues("subscriptions", this.getSubscriptions());
        writer.writeCollectionOfObjectValues("waitingMembers", this.getWaitingMembers());
    }
    /**
     * Sets the allottedUnits property value. The number of licenses contained within the allotment. Not nullable. Read-only.
     * @param value Value to set for the allottedUnits property.
     */
    public void setAllottedUnits(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("allottedUnits", value);
    }
    /**
     * Sets the assignableTo property value. The assignableTo property
     * @param value Value to set for the assignableTo property.
     */
    public void setAssignableTo(@jakarta.annotation.Nullable final EnumSet<AssigneeTypes> value) {
        this.backingStore.set("assignableTo", value);
    }
    /**
     * Sets the assignments property value. The list of license assignments that consume licenses from this allotment. Not nullable.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<Assignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the consumedUnits property value. The number of licenses that are currently consumed by assignments from this allotment. Not nullable. Read-only.
     * @param value Value to set for the consumedUnits property.
     */
    public void setConsumedUnits(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("consumedUnits", value);
    }
    /**
     * Sets the services property value. The list of services that might be enabled or disabled for assignments from this allotment. Not nullable. Read-only.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<Service> value) {
        this.backingStore.set("services", value);
    }
    /**
     * Sets the skuId property value. Unique identifier (GUID) for the service SKU that is equal to the skuId property on the related subscribedSku object. Read-only. Supports $filter.
     * @param value Value to set for the skuId property.
     */
    public void setSkuId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("skuId", value);
    }
    /**
     * Sets the skuPartNumber property value. Unique SKU display name that is equal to the skuPartNumber on the related subscribedSku object; for example, AAD_Premium. Read-only.
     * @param value Value to set for the skuPartNumber property.
     */
    public void setSkuPartNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuPartNumber", value);
    }
    /**
     * Sets the subscriptions property value. Basic information about the subscriptions that supports this allotment.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<Subscription> value) {
        this.backingStore.set("subscriptions", value);
    }
    /**
     * Sets the waitingMembers property value. List of over-assigned users who are in the waiting room for an allotment due to license capacity limits.
     * @param value Value to set for the waitingMembers property.
     */
    public void setWaitingMembers(@jakarta.annotation.Nullable final java.util.List<WaitingMember> value) {
        this.backingStore.set("waitingMembers", value);
    }
}

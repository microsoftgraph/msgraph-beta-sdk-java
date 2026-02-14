package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageRight extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UsageRight} and sets the default values.
     */
    public UsageRight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageRight}
     */
    @jakarta.annotation.Nonnull
    public static UsageRight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageRight();
    }
    /**
     * Gets the allotments property value. The set of allotments associated with the assignments that combine to form this usageRight.
     * @return a {@link java.util.List<Allotment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Allotment> getAllotments() {
        return this.backingStore.get("allotments");
    }
    /**
     * Gets the assignments property value. The set of assignments that combine to form this usageRight, including both direct assignments and assignments inherited through group membership.
     * @return a {@link java.util.List<Assignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Assignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allotments", (n) -> { this.setAllotments(n.getCollectionOfObjectValues(Allotment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(Assignment::createFromDiscriminatorValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(Service::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the services property value. Information about the services associated with the usageRight. Not nullable. Read-only. Supports $filter on the planId property.
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("allotments", this.getAllotments());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
    }
    /**
     * Sets the allotments property value. The set of allotments associated with the assignments that combine to form this usageRight.
     * @param value Value to set for the allotments property.
     */
    public void setAllotments(@jakarta.annotation.Nullable final java.util.List<Allotment> value) {
        this.backingStore.set("allotments", value);
    }
    /**
     * Sets the assignments property value. The set of assignments that combine to form this usageRight, including both direct assignments and assignments inherited through group membership.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<Assignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the services property value. Information about the services associated with the usageRight. Not nullable. Read-only. Supports $filter on the planId property.
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
}

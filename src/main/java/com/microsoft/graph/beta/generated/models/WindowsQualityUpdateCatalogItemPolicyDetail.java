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
import java.util.UUID;
/**
 * Class to describe quality update policy&apos;s approval detail for specific catalog item
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateCatalogItemPolicyDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsQualityUpdateCatalogItemPolicyDetail} and sets the default values.
     */
    public WindowsQualityUpdateCatalogItemPolicyDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateCatalogItemPolicyDetail}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateCatalogItemPolicyDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateCatalogItemPolicyDetail();
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
     * Gets the approvalStatus property value. Enum to describe policy&apos;s approval status for catalogitems 
     * @return a {@link WindowsQualityUpdateApprovalStatus}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateApprovalStatus getApprovalStatus() {
        return this.backingStore.get("approvalStatus");
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
     * Gets the catalogItemId property value. Catalog item id for this approval intend
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getCatalogItemId() {
        return this.backingStore.get("catalogItemId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("approvalStatus", (n) -> { this.setApprovalStatus(n.getEnumValue(WindowsQualityUpdateApprovalStatus::forValue)); });
        deserializerMap.put("catalogItemId", (n) -> { this.setCatalogItemId(n.getUUIDValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getUUIDValue()); });
        return deserializerMap;
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
     * Gets the policyId property value. Policy Id for this approval intend
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("approvalStatus", this.getApprovalStatus());
        writer.writeUUIDValue("catalogItemId", this.getCatalogItemId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("policyId", this.getPolicyId());
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
     * Sets the approvalStatus property value. Enum to describe policy&apos;s approval status for catalogitems 
     * @param value Value to set for the approvalStatus property.
     */
    public void setApprovalStatus(@jakarta.annotation.Nullable final WindowsQualityUpdateApprovalStatus value) {
        this.backingStore.set("approvalStatus", value);
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
     * Sets the catalogItemId property value. Catalog item id for this approval intend
     * @param value Value to set for the catalogItemId property.
     */
    public void setCatalogItemId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("catalogItemId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyId property value. Policy Id for this approval intend
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("policyId", value);
    }
}

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlanUsageRight implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlanUsageRight} and sets the default values.
     */
    public PlanUsageRight() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlanUsageRight}
     */
    @jakarta.annotation.Nonnull
    public static PlanUsageRight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlanUsageRight();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("hasSensitivityLabel", (n) -> { this.setHasSensitivityLabel(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("usageRights", (n) -> { this.setUsageRights(n.getObjectValue(UsageRightsInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasSensitivityLabel property value. Indicates whether the plan has a sensitivity label applied. If true, the plan has a sensitivity label assignment; if false, no sensitivity label is applied.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasSensitivityLabel() {
        return this.backingStore.get("hasSensitivityLabel");
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
     * Gets the planId property value. The unique identifier of the plan for which usage rights are under evaluation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the usageRights property value. The detailed usage rights information for the requesting user on the plan. This property is null when no sensitivity label is applied to the plan. Optional.
     * @return a {@link UsageRightsInfo}
     */
    @jakarta.annotation.Nullable
    public UsageRightsInfo getUsageRights() {
        return this.backingStore.get("usageRights");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hasSensitivityLabel", this.getHasSensitivityLabel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeObjectValue("usageRights", this.getUsageRights());
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
     * Sets the hasSensitivityLabel property value. Indicates whether the plan has a sensitivity label applied. If true, the plan has a sensitivity label assignment; if false, no sensitivity label is applied.
     * @param value Value to set for the hasSensitivityLabel property.
     */
    public void setHasSensitivityLabel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasSensitivityLabel", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the planId property value. The unique identifier of the plan for which usage rights are under evaluation.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the usageRights property value. The detailed usage rights information for the requesting user on the plan. This property is null when no sensitivity label is applied to the plan. Optional.
     * @param value Value to set for the usageRights property.
     */
    public void setUsageRights(@jakarta.annotation.Nullable final UsageRightsInfo value) {
        this.backingStore.set("usageRights", value);
    }
}

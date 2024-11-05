package com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.item.apply;

import com.microsoft.graph.beta.models.CloudPcPolicySettingType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplyPostRequestBody} and sets the default values.
     */
    public ApplyPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplyPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ApplyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("policySettings", (n) -> { this.setPolicySettings(n.getEnumSetValue(CloudPcPolicySettingType::forValue)); });
        deserializerMap.put("reservePercentage", (n) -> { this.setReservePercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policySettings property value. The policySettings property
     * @return a {@link EnumSet<CloudPcPolicySettingType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcPolicySettingType> getPolicySettings() {
        return this.backingStore.get("policySettings");
    }
    /**
     * Gets the reservePercentage property value. The reservePercentage property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReservePercentage() {
        return this.backingStore.get("reservePercentage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("policySettings", this.getPolicySettings());
        writer.writeIntegerValue("reservePercentage", this.getReservePercentage());
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
     * Sets the policySettings property value. The policySettings property
     * @param value Value to set for the policySettings property.
     */
    public void setPolicySettings(@jakarta.annotation.Nullable final EnumSet<CloudPcPolicySettingType> value) {
        this.backingStore.set("policySettings", value);
    }
    /**
     * Sets the reservePercentage property value. The reservePercentage property
     * @param value Value to set for the reservePercentage property.
     */
    public void setReservePercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("reservePercentage", value);
    }
}

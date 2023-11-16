package com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.applyconfig;

import com.microsoft.graph.models.CloudPcPolicySettingType;
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
public class ApplyConfigPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new ApplyConfigPostRequestBody and sets the default values.
     */
    public ApplyConfigPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplyConfigPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ApplyConfigPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyConfigPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the cloudPcIds property value. The cloudPcIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCloudPcIds() {
        return this.backingStore.get("cloudPcIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cloudPcIds", (n) -> { this.setCloudPcIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("policySettings", (n) -> { this.setPolicySettings(n.getEnumSetValue(CloudPcPolicySettingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the policySettings property value. The policySettings property
     * @return a EnumSet<CloudPcPolicySettingType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcPolicySettingType> getPolicySettings() {
        return this.backingStore.get("policySettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("cloudPcIds", this.getCloudPcIds());
        writer.writeEnumSetValue("policySettings", this.getPolicySettings());
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
     * Sets the cloudPcIds property value. The cloudPcIds property
     * @param value Value to set for the cloudPcIds property.
     */
    public void setCloudPcIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("cloudPcIds", value);
    }
    /**
     * Sets the policySettings property value. The policySettings property
     * @param value Value to set for the policySettings property.
     */
    public void setPolicySettings(@jakarta.annotation.Nullable final EnumSet<CloudPcPolicySettingType> value) {
        this.backingStore.set("policySettings", value);
    }
}

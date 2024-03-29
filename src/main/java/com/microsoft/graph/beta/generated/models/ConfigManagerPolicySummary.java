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
/**
 * A ConfigManager policy summary.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigManagerPolicySummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConfigManagerPolicySummary} and sets the default values.
     */
    public ConfigManagerPolicySummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigManagerPolicySummary}
     */
    @jakarta.annotation.Nonnull
    public static ConfigManagerPolicySummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigManagerPolicySummary();
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
     * Gets the compliantDeviceCount property value. The number of devices evaluated to be compliant by the policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.backingStore.get("compliantDeviceCount");
    }
    /**
     * Gets the enforcedDeviceCount property value. The number of devices that have have been remediated by the policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEnforcedDeviceCount() {
        return this.backingStore.get("enforcedDeviceCount");
    }
    /**
     * Gets the failedDeviceCount property value. The number of devices that failed to be evaluated by the policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.backingStore.get("failedDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("compliantDeviceCount", (n) -> { this.setCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("enforcedDeviceCount", (n) -> { this.setEnforcedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pendingDeviceCount", (n) -> { this.setPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("targetedDeviceCount", (n) -> { this.setTargetedDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonCompliantDeviceCount property value. The number of devices evaluated to be noncompliant by the policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.backingStore.get("nonCompliantDeviceCount");
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
     * Gets the pendingDeviceCount property value. The number of devices that have acknowledged the policy but are pending evaluation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this.backingStore.get("pendingDeviceCount");
    }
    /**
     * Gets the targetedDeviceCount property value. The number of devices targeted by the policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTargetedDeviceCount() {
        return this.backingStore.get("targetedDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("enforcedDeviceCount", this.getEnforcedDeviceCount());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingDeviceCount", this.getPendingDeviceCount());
        writer.writeIntegerValue("targetedDeviceCount", this.getTargetedDeviceCount());
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
     * Sets the compliantDeviceCount property value. The number of devices evaluated to be compliant by the policy.
     * @param value Value to set for the compliantDeviceCount property.
     */
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("compliantDeviceCount", value);
    }
    /**
     * Sets the enforcedDeviceCount property value. The number of devices that have have been remediated by the policy.
     * @param value Value to set for the enforcedDeviceCount property.
     */
    public void setEnforcedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("enforcedDeviceCount", value);
    }
    /**
     * Sets the failedDeviceCount property value. The number of devices that failed to be evaluated by the policy.
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedDeviceCount", value);
    }
    /**
     * Sets the nonCompliantDeviceCount property value. The number of devices evaluated to be noncompliant by the policy.
     * @param value Value to set for the nonCompliantDeviceCount property.
     */
    public void setNonCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("nonCompliantDeviceCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pendingDeviceCount property value. The number of devices that have acknowledged the policy but are pending evaluation.
     * @param value Value to set for the pendingDeviceCount property.
     */
    public void setPendingDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingDeviceCount", value);
    }
    /**
     * Sets the targetedDeviceCount property value. The number of devices targeted by the policy.
     * @param value Value to set for the targetedDeviceCount property.
     */
    public void setTargetedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("targetedDeviceCount", value);
    }
}

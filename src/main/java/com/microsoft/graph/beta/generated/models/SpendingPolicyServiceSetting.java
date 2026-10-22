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
 * Desired governance state for a single service within a spending policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpendingPolicyServiceSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SpendingPolicyServiceSetting} and sets the default values.
     */
    public SpendingPolicyServiceSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpendingPolicyServiceSetting}
     */
    @jakarta.annotation.Nonnull
    public static SpendingPolicyServiceSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpendingPolicyServiceSetting();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentEtag", (n) -> { this.setParentEtag(n.getStringValue()); });
        deserializerMap.put("parentStatus", (n) -> { this.setParentStatus(n.getEnumValue(SpendingPolicyStatus::forValue)); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceSettingState::forValue)); });
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
     * Gets the parentEtag property value. The containing policy&apos;s ETag. Use this value in If-Match for concurrency control onservice-setting changes. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentEtag() {
        return this.backingStore.get("parentEtag");
    }
    /**
     * Gets the parentStatus property value. Lifecycle status of a spending policy.
     * @return a {@link SpendingPolicyStatus}
     */
    @jakarta.annotation.Nullable
    public SpendingPolicyStatus getParentStatus() {
        return this.backingStore.get("parentStatus");
    }
    /**
     * Gets the serviceId property value. The identifier of the AI service this setting governs, such as cowork or workIQ. Severalbillable services can share one identifier and are governed together. Discover validvalues from the service catalog using a category identifier, not the catalog entry&apos;sown id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.backingStore.get("serviceId");
    }
    /**
     * Gets the state property value. Desired state of a governed service within a spending policy.
     * @return a {@link ServiceSettingState}
     */
    @jakarta.annotation.Nullable
    public ServiceSettingState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("parentStatus", this.getParentStatus());
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the parentEtag property value. The containing policy&apos;s ETag. Use this value in If-Match for concurrency control onservice-setting changes. Read-only.
     * @param value Value to set for the parentEtag property.
     */
    public void setParentEtag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentEtag", value);
    }
    /**
     * Sets the parentStatus property value. Lifecycle status of a spending policy.
     * @param value Value to set for the parentStatus property.
     */
    public void setParentStatus(@jakarta.annotation.Nullable final SpendingPolicyStatus value) {
        this.backingStore.set("parentStatus", value);
    }
    /**
     * Sets the serviceId property value. The identifier of the AI service this setting governs, such as cowork or workIQ. Severalbillable services can share one identifier and are governed together. Discover validvalues from the service catalog using a category identifier, not the catalog entry&apos;sown id.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceId", value);
    }
    /**
     * Sets the state property value. Desired state of a governed service within a spending policy.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServiceSettingState value) {
        this.backingStore.set("state", value);
    }
}

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
public class CloudPcSupportedRegionRestrictionDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcSupportedRegionRestrictionDetail} and sets the default values.
     */
    public CloudPcSupportedRegionRestrictionDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcSupportedRegionRestrictionDetail}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSupportedRegionRestrictionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSupportedRegionRestrictionDetail();
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
     * Gets the cPURestricted property value. Indicates that the region is restricted for Cloud PC CPU provisioning. True indicates that Cloud PC provisioning with CPU isn&apos;t available in this region. false indicates that it&apos;s available. The default value is false. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCPURestricted() {
        return this.backingStore.get("cPURestricted");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cPURestricted", (n) -> { this.setCPURestricted(n.getBooleanValue()); });
        deserializerMap.put("gPURestricted", (n) -> { this.setGPURestricted(n.getBooleanValue()); });
        deserializerMap.put("nestedVirtualizationRestricted", (n) -> { this.setNestedVirtualizationRestricted(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gPURestricted property value. Indicates that the region is restricted for Cloud PC GPU provisioning. True indicates that Cloud PC provisioning with GPU isn&apos;t available in this region. false indicates that it&apos;s available. The default value is false. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGPURestricted() {
        return this.backingStore.get("gPURestricted");
    }
    /**
     * Gets the nestedVirtualizationRestricted property value. Indicates that the region is restricted for Cloud PC nested virtualization provisioning. True indicates that Cloud PC provisioning with nested virtualization isn&apos;t available in this region; false indicates that it&apos;s available. The default value is false. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNestedVirtualizationRestricted() {
        return this.backingStore.get("nestedVirtualizationRestricted");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cPURestricted", this.getCPURestricted());
        writer.writeBooleanValue("gPURestricted", this.getGPURestricted());
        writer.writeBooleanValue("nestedVirtualizationRestricted", this.getNestedVirtualizationRestricted());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the cPURestricted property value. Indicates that the region is restricted for Cloud PC CPU provisioning. True indicates that Cloud PC provisioning with CPU isn&apos;t available in this region. false indicates that it&apos;s available. The default value is false. Read-only.
     * @param value Value to set for the cPURestricted property.
     */
    public void setCPURestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cPURestricted", value);
    }
    /**
     * Sets the gPURestricted property value. Indicates that the region is restricted for Cloud PC GPU provisioning. True indicates that Cloud PC provisioning with GPU isn&apos;t available in this region. false indicates that it&apos;s available. The default value is false. Read-only.
     * @param value Value to set for the gPURestricted property.
     */
    public void setGPURestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("gPURestricted", value);
    }
    /**
     * Sets the nestedVirtualizationRestricted property value. Indicates that the region is restricted for Cloud PC nested virtualization provisioning. True indicates that Cloud PC provisioning with nested virtualization isn&apos;t available in this region; false indicates that it&apos;s available. The default value is false. Read-only.
     * @param value Value to set for the nestedVirtualizationRestricted property.
     */
    public void setNestedVirtualizationRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("nestedVirtualizationRestricted", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

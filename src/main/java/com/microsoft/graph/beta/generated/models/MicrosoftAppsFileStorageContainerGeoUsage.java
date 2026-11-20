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
public class MicrosoftAppsFileStorageContainerGeoUsage implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MicrosoftAppsFileStorageContainerGeoUsage} and sets the default values.
     */
    public MicrosoftAppsFileStorageContainerGeoUsage() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftAppsFileStorageContainerGeoUsage}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAppsFileStorageContainerGeoUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAppsFileStorageContainerGeoUsage();
    }
    /**
     * Gets the activeContainerCount property value. The number of active file storage containers in this geographic location.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getActiveContainerCount() {
        return this.backingStore.get("activeContainerCount");
    }
    /**
     * Gets the activeStorageUsedInBytes property value. The storage used in bytes for active file storage containers in this geographic location.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getActiveStorageUsedInBytes() {
        return this.backingStore.get("activeStorageUsedInBytes");
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
     * Gets the dataLocationCode property value. The geographic location code (for example, NAM for North America, EUR for Europe).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataLocationCode() {
        return this.backingStore.get("dataLocationCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activeContainerCount", (n) -> { this.setActiveContainerCount(n.getLongValue()); });
        deserializerMap.put("activeStorageUsedInBytes", (n) -> { this.setActiveStorageUsedInBytes(n.getLongValue()); });
        deserializerMap.put("dataLocationCode", (n) -> { this.setDataLocationCode(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("usageByApp", (n) -> { this.setUsageByApp(n.getCollectionOfObjectValues(MicrosoftAppsFileStorageContainerAppUsage::createFromDiscriminatorValue)); });
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
     * Gets the usageByApp property value. Storage usage data broken down by application within this geographic location. Expandable using $expand=usageByApp.
     * @return a {@link java.util.List<MicrosoftAppsFileStorageContainerAppUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftAppsFileStorageContainerAppUsage> getUsageByApp() {
        return this.backingStore.get("usageByApp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("usageByApp", this.getUsageByApp());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activeContainerCount property value. The number of active file storage containers in this geographic location.
     * @param value Value to set for the activeContainerCount property.
     */
    public void setActiveContainerCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("activeContainerCount", value);
    }
    /**
     * Sets the activeStorageUsedInBytes property value. The storage used in bytes for active file storage containers in this geographic location.
     * @param value Value to set for the activeStorageUsedInBytes property.
     */
    public void setActiveStorageUsedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("activeStorageUsedInBytes", value);
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
     * Sets the dataLocationCode property value. The geographic location code (for example, NAM for North America, EUR for Europe).
     * @param value Value to set for the dataLocationCode property.
     */
    public void setDataLocationCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataLocationCode", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the usageByApp property value. Storage usage data broken down by application within this geographic location. Expandable using $expand=usageByApp.
     * @param value Value to set for the usageByApp property.
     */
    public void setUsageByApp(@jakarta.annotation.Nullable final java.util.List<MicrosoftAppsFileStorageContainerAppUsage> value) {
        this.backingStore.set("usageByApp", value);
    }
}

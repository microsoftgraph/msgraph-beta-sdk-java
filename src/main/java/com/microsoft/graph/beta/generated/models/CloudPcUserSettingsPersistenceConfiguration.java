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
public class CloudPcUserSettingsPersistenceConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcUserSettingsPersistenceConfiguration} and sets the default values.
     */
    public CloudPcUserSettingsPersistenceConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserSettingsPersistenceConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserSettingsPersistenceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSettingsPersistenceConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userSettingsPersistenceEnabled", (n) -> { this.setUserSettingsPersistenceEnabled(n.getBooleanValue()); });
        deserializerMap.put("userSettingsPersistenceStorageSizeCategory", (n) -> { this.setUserSettingsPersistenceStorageSizeCategory(n.getEnumValue(CloudPcUserSettingsPersistenceStorageSizeCategory::forValue)); });
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
     * Gets the userSettingsPersistenceEnabled property value. Indicates whether user application settings are persisted between Cloud PC sessions. The default value is false. When true, user settings persistence is enabled, and Windows 365 automatically saves any user-specific application data in a central cloud storage location. Anytime the user connects to a Cloud PC within this provisioning policy, Windows 365 reconnects the user to that persisted storage. When false, this feature isn&apos;t used. The persistent storage can only be accessed by Cloud PC; IT admins can&apos;t access it.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUserSettingsPersistenceEnabled() {
        return this.backingStore.get("userSettingsPersistenceEnabled");
    }
    /**
     * Gets the userSettingsPersistenceStorageSizeCategory property value. Indicates the storage size for persisting user application settings. The possible values are: fourGB, eightGB, sixteenGB, thirtyTwoGB, sixtyFourGB, unknownFutureValue. The default value is fourGB.
     * @return a {@link CloudPcUserSettingsPersistenceStorageSizeCategory}
     */
    @jakarta.annotation.Nullable
    public CloudPcUserSettingsPersistenceStorageSizeCategory getUserSettingsPersistenceStorageSizeCategory() {
        return this.backingStore.get("userSettingsPersistenceStorageSizeCategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("userSettingsPersistenceEnabled", this.getUserSettingsPersistenceEnabled());
        writer.writeEnumValue("userSettingsPersistenceStorageSizeCategory", this.getUserSettingsPersistenceStorageSizeCategory());
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
     * Sets the userSettingsPersistenceEnabled property value. Indicates whether user application settings are persisted between Cloud PC sessions. The default value is false. When true, user settings persistence is enabled, and Windows 365 automatically saves any user-specific application data in a central cloud storage location. Anytime the user connects to a Cloud PC within this provisioning policy, Windows 365 reconnects the user to that persisted storage. When false, this feature isn&apos;t used. The persistent storage can only be accessed by Cloud PC; IT admins can&apos;t access it.
     * @param value Value to set for the userSettingsPersistenceEnabled property.
     */
    public void setUserSettingsPersistenceEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("userSettingsPersistenceEnabled", value);
    }
    /**
     * Sets the userSettingsPersistenceStorageSizeCategory property value. Indicates the storage size for persisting user application settings. The possible values are: fourGB, eightGB, sixteenGB, thirtyTwoGB, sixtyFourGB, unknownFutureValue. The default value is fourGB.
     * @param value Value to set for the userSettingsPersistenceStorageSizeCategory property.
     */
    public void setUserSettingsPersistenceStorageSizeCategory(@jakarta.annotation.Nullable final CloudPcUserSettingsPersistenceStorageSizeCategory value) {
        this.backingStore.set("userSettingsPersistenceStorageSizeCategory", value);
    }
}

package com.microsoft.graph.beta.models;

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
public class DeviceManagementConfigurationSettingApplicability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSettingApplicability} and sets the default values.
     */
    public DeviceManagementConfigurationSettingApplicability() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSettingApplicability}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingApplicability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationApplicationSettingApplicability": return new DeviceManagementConfigurationApplicationSettingApplicability();
                case "#microsoft.graph.deviceManagementConfigurationExchangeOnlineSettingApplicability": return new DeviceManagementConfigurationExchangeOnlineSettingApplicability();
                case "#microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability": return new DeviceManagementConfigurationWindowsSettingApplicability();
            }
        }
        return new DeviceManagementConfigurationSettingApplicability();
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
     * Gets the description property value. description of the setting
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceMode property value. Describes applicability for the mode the device is in
     * @return a {@link DeviceManagementConfigurationDeviceMode}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationDeviceMode getDeviceMode() {
        return this.backingStore.get("deviceMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceMode", (n) -> { this.setDeviceMode(n.getEnumValue(DeviceManagementConfigurationDeviceMode::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumSetValue(DeviceManagementConfigurationPlatforms::forValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumSetValue(DeviceManagementConfigurationTechnologies::forValue)); });
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
     * Gets the platform property value. Supported platform types.
     * @return a {@link EnumSet<DeviceManagementConfigurationPlatforms>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationPlatforms> getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a {@link EnumSet<DeviceManagementConfigurationTechnologies>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationTechnologies> getTechnologies() {
        return this.backingStore.get("technologies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("deviceMode", this.getDeviceMode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumSetValue("platform", this.getPlatform());
        writer.writeEnumSetValue("technologies", this.getTechnologies());
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
     * Sets the description property value. description of the setting
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceMode property value. Describes applicability for the mode the device is in
     * @param value Value to set for the deviceMode property.
     */
    public void setDeviceMode(@jakarta.annotation.Nullable final DeviceManagementConfigurationDeviceMode value) {
        this.backingStore.set("deviceMode", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationPlatforms> value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     */
    public void setTechnologies(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationTechnologies> value) {
        this.backingStore.set("technologies", value);
    }
}

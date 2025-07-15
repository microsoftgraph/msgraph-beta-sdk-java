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
 * Indicates the version range for an apple setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationAppleOSSupportedVersions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceManagementConfigurationAppleOSSupportedVersions} and sets the default values.
     */
    public DeviceManagementConfigurationAppleOSSupportedVersions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationAppleOSSupportedVersions}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationAppleOSSupportedVersions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationAppleOSSupportedVersions();
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
        deserializerMap.put("includesMaxVersion", (n) -> { this.setIncludesMaxVersion(n.getBooleanValue()); });
        deserializerMap.put("includesMinVersion", (n) -> { this.setIncludesMinVersion(n.getBooleanValue()); });
        deserializerMap.put("maxVersion", (n) -> { this.setMaxVersion(n.getStringValue()); });
        deserializerMap.put("minVersion", (n) -> { this.setMinVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includesMaxVersion property value. Indicates whether the maximum version is included in the supported version range.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludesMaxVersion() {
        return this.backingStore.get("includesMaxVersion");
    }
    /**
     * Gets the includesMinVersion property value. Indicates whether the minimum version is included in the supported version range.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludesMinVersion() {
        return this.backingStore.get("includesMinVersion");
    }
    /**
     * Gets the maxVersion property value. Gets the maximum supported version for an Apple setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxVersion() {
        return this.backingStore.get("maxVersion");
    }
    /**
     * Gets the minVersion property value. Gets the minimum supported version for an Apple setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinVersion() {
        return this.backingStore.get("minVersion");
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
        writer.writeBooleanValue("includesMaxVersion", this.getIncludesMaxVersion());
        writer.writeBooleanValue("includesMinVersion", this.getIncludesMinVersion());
        writer.writeStringValue("maxVersion", this.getMaxVersion());
        writer.writeStringValue("minVersion", this.getMinVersion());
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
     * Sets the includesMaxVersion property value. Indicates whether the maximum version is included in the supported version range.
     * @param value Value to set for the includesMaxVersion property.
     */
    public void setIncludesMaxVersion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includesMaxVersion", value);
    }
    /**
     * Sets the includesMinVersion property value. Indicates whether the minimum version is included in the supported version range.
     * @param value Value to set for the includesMinVersion property.
     */
    public void setIncludesMinVersion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includesMinVersion", value);
    }
    /**
     * Sets the maxVersion property value. Gets the maximum supported version for an Apple setting.
     * @param value Value to set for the maxVersion property.
     */
    public void setMaxVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("maxVersion", value);
    }
    /**
     * Sets the minVersion property value. Gets the minimum supported version for an Apple setting.
     * @param value Value to set for the minVersion property.
     */
    public void setMinVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

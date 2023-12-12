package com.microsoft.graph.models;

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
 * Device properties
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppSupportedDeviceType implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MobileAppSupportedDeviceType and sets the default values.
     */
    public MobileAppSupportedDeviceType() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppSupportedDeviceType
     */
    @jakarta.annotation.Nonnull
    public static MobileAppSupportedDeviceType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppSupportedDeviceType();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("maximumOperatingSystemVersion", (n) -> { this.setMaximumOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("minimumOperatingSystemVersion", (n) -> { this.setMinimumOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(DeviceType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maximumOperatingSystemVersion property value. Maximum OS version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMaximumOperatingSystemVersion() {
        return this.backingStore.get("maximumOperatingSystemVersion");
    }
    /**
     * Gets the minimumOperatingSystemVersion property value. Minimum OS version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumOperatingSystemVersion() {
        return this.backingStore.get("minimumOperatingSystemVersion");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the type property value. Device type.
     * @return a DeviceType
     */
    @jakarta.annotation.Nullable
    public DeviceType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("maximumOperatingSystemVersion", this.getMaximumOperatingSystemVersion());
        writer.writeStringValue("minimumOperatingSystemVersion", this.getMinimumOperatingSystemVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the maximumOperatingSystemVersion property value. Maximum OS version
     * @param value Value to set for the maximumOperatingSystemVersion property.
     */
    public void setMaximumOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("maximumOperatingSystemVersion", value);
    }
    /**
     * Sets the minimumOperatingSystemVersion property value. Minimum OS version
     * @param value Value to set for the minimumOperatingSystemVersion property.
     */
    public void setMinimumOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumOperatingSystemVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the type property value. Device type.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final DeviceType value) {
        this.backingStore.set("type", value);
    }
}

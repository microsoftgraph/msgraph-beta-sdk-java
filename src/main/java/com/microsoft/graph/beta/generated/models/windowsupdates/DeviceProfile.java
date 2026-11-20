package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceProfile} and sets the default values.
     */
    public DeviceProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceProfile}
     */
    @jakarta.annotation.Nonnull
    public static DeviceProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceProfile();
    }
    /**
     * Gets the azureAdDeviceId property value. The Microsoft Entra device identifier. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.backingStore.get("azureAdDeviceId");
    }
    /**
     * Gets the deviceModel property value. The hardware model of the device. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
    }
    /**
     * Gets the deviceName property value. The device name. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("hotpatchReadiness", (n) -> { this.setHotpatchReadiness(n.getEnumValue(HotpatchReadiness::forValue)); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getStringValue()); });
        deserializerMap.put("osStatus", (n) -> { this.setOsStatus(n.getEnumValue(OsStatus::forValue)); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hotpatchReadiness property value. The hotpatchReadiness property
     * @return a {@link HotpatchReadiness}
     */
    @jakarta.annotation.Nullable
    public HotpatchReadiness getHotpatchReadiness() {
        return this.backingStore.get("hotpatchReadiness");
    }
    /**
     * Gets the osBuild property value. The Windows build installed on the device. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsBuild() {
        return this.backingStore.get("osBuild");
    }
    /**
     * Gets the osStatus property value. The osStatus property
     * @return a {@link OsStatus}
     */
    @jakarta.annotation.Nullable
    public OsStatus getOsStatus() {
        return this.backingStore.get("osStatus");
    }
    /**
     * Gets the osVersion property value. The Windows version installed on the device. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the serialNumber property value. The device serial number. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("hotpatchReadiness", this.getHotpatchReadiness());
        writer.writeEnumValue("osStatus", this.getOsStatus());
    }
    /**
     * Sets the azureAdDeviceId property value. The Microsoft Entra device identifier. Read-only.
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureAdDeviceId", value);
    }
    /**
     * Sets the deviceModel property value. The hardware model of the device. Read-only.
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the deviceName property value. The device name. Read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the hotpatchReadiness property value. The hotpatchReadiness property
     * @param value Value to set for the hotpatchReadiness property.
     */
    public void setHotpatchReadiness(@jakarta.annotation.Nullable final HotpatchReadiness value) {
        this.backingStore.set("hotpatchReadiness", value);
    }
    /**
     * Sets the osBuild property value. The Windows build installed on the device. Read-only.
     * @param value Value to set for the osBuild property.
     */
    public void setOsBuild(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osBuild", value);
    }
    /**
     * Sets the osStatus property value. The osStatus property
     * @param value Value to set for the osStatus property.
     */
    public void setOsStatus(@jakarta.annotation.Nullable final OsStatus value) {
        this.backingStore.set("osStatus", value);
    }
    /**
     * Sets the osVersion property value. The Windows version installed on the device. Read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the serialNumber property value. The device serial number. Read-only.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
}

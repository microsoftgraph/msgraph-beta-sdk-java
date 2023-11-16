package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Graph properties for Device Firmware Configuration Interface 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10DeviceFirmwareConfigurationInterface extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10DeviceFirmwareConfigurationInterface and sets the default values.
     */
    public Windows10DeviceFirmwareConfigurationInterface() {
        super();
        this.setOdataType("#microsoft.graph.windows10DeviceFirmwareConfigurationInterface");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10DeviceFirmwareConfigurationInterface
     */
    @jakarta.annotation.Nonnull
    public static Windows10DeviceFirmwareConfigurationInterface createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10DeviceFirmwareConfigurationInterface();
    }
    /**
     * Gets the bluetooth property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getBluetooth() {
        return this.backingStore.get("bluetooth");
    }
    /**
     * Gets the bootFromBuiltInNetworkAdapters property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getBootFromBuiltInNetworkAdapters() {
        return this.backingStore.get("bootFromBuiltInNetworkAdapters");
    }
    /**
     * Gets the bootFromExternalMedia property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getBootFromExternalMedia() {
        return this.backingStore.get("bootFromExternalMedia");
    }
    /**
     * Gets the cameras property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getCameras() {
        return this.backingStore.get("cameras");
    }
    /**
     * Gets the changeUefiSettingsPermission property value. Defines the permission level granted to users to enable them change Uefi settings
     * @return a ChangeUefiSettingsPermission
     */
    @jakarta.annotation.Nullable
    public ChangeUefiSettingsPermission getChangeUefiSettingsPermission() {
        return this.backingStore.get("changeUefiSettingsPermission");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bluetooth", (n) -> { this.setBluetooth(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("bootFromBuiltInNetworkAdapters", (n) -> { this.setBootFromBuiltInNetworkAdapters(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("bootFromExternalMedia", (n) -> { this.setBootFromExternalMedia(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("cameras", (n) -> { this.setCameras(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("changeUefiSettingsPermission", (n) -> { this.setChangeUefiSettingsPermission(n.getEnumValue(ChangeUefiSettingsPermission.class)); });
        deserializerMap.put("frontCamera", (n) -> { this.setFrontCamera(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("infraredCamera", (n) -> { this.setInfraredCamera(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("microphone", (n) -> { this.setMicrophone(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("microphonesAndSpeakers", (n) -> { this.setMicrophonesAndSpeakers(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("nearFieldCommunication", (n) -> { this.setNearFieldCommunication(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("radios", (n) -> { this.setRadios(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("rearCamera", (n) -> { this.setRearCamera(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("sdCard", (n) -> { this.setSdCard(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("simultaneousMultiThreading", (n) -> { this.setSimultaneousMultiThreading(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("usbTypeAPort", (n) -> { this.setUsbTypeAPort(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("virtualizationOfCpuAndIO", (n) -> { this.setVirtualizationOfCpuAndIO(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("wakeOnLAN", (n) -> { this.setWakeOnLAN(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("wakeOnPower", (n) -> { this.setWakeOnPower(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("wiFi", (n) -> { this.setWiFi(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("windowsPlatformBinaryTable", (n) -> { this.setWindowsPlatformBinaryTable(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("wirelessWideAreaNetwork", (n) -> { this.setWirelessWideAreaNetwork(n.getEnumValue(Enablement.class)); });
        return deserializerMap;
    }
    /**
     * Gets the frontCamera property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getFrontCamera() {
        return this.backingStore.get("frontCamera");
    }
    /**
     * Gets the infraredCamera property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getInfraredCamera() {
        return this.backingStore.get("infraredCamera");
    }
    /**
     * Gets the microphone property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getMicrophone() {
        return this.backingStore.get("microphone");
    }
    /**
     * Gets the microphonesAndSpeakers property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getMicrophonesAndSpeakers() {
        return this.backingStore.get("microphonesAndSpeakers");
    }
    /**
     * Gets the nearFieldCommunication property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getNearFieldCommunication() {
        return this.backingStore.get("nearFieldCommunication");
    }
    /**
     * Gets the radios property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getRadios() {
        return this.backingStore.get("radios");
    }
    /**
     * Gets the rearCamera property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getRearCamera() {
        return this.backingStore.get("rearCamera");
    }
    /**
     * Gets the sdCard property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSdCard() {
        return this.backingStore.get("sdCard");
    }
    /**
     * Gets the simultaneousMultiThreading property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSimultaneousMultiThreading() {
        return this.backingStore.get("simultaneousMultiThreading");
    }
    /**
     * Gets the usbTypeAPort property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getUsbTypeAPort() {
        return this.backingStore.get("usbTypeAPort");
    }
    /**
     * Gets the virtualizationOfCpuAndIO property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getVirtualizationOfCpuAndIO() {
        return this.backingStore.get("virtualizationOfCpuAndIO");
    }
    /**
     * Gets the wakeOnLAN property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getWakeOnLAN() {
        return this.backingStore.get("wakeOnLAN");
    }
    /**
     * Gets the wakeOnPower property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getWakeOnPower() {
        return this.backingStore.get("wakeOnPower");
    }
    /**
     * Gets the wiFi property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getWiFi() {
        return this.backingStore.get("wiFi");
    }
    /**
     * Gets the windowsPlatformBinaryTable property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getWindowsPlatformBinaryTable() {
        return this.backingStore.get("windowsPlatformBinaryTable");
    }
    /**
     * Gets the wirelessWideAreaNetwork property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getWirelessWideAreaNetwork() {
        return this.backingStore.get("wirelessWideAreaNetwork");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("bluetooth", this.getBluetooth());
        writer.writeEnumValue("bootFromBuiltInNetworkAdapters", this.getBootFromBuiltInNetworkAdapters());
        writer.writeEnumValue("bootFromExternalMedia", this.getBootFromExternalMedia());
        writer.writeEnumValue("cameras", this.getCameras());
        writer.writeEnumValue("changeUefiSettingsPermission", this.getChangeUefiSettingsPermission());
        writer.writeEnumValue("frontCamera", this.getFrontCamera());
        writer.writeEnumValue("infraredCamera", this.getInfraredCamera());
        writer.writeEnumValue("microphone", this.getMicrophone());
        writer.writeEnumValue("microphonesAndSpeakers", this.getMicrophonesAndSpeakers());
        writer.writeEnumValue("nearFieldCommunication", this.getNearFieldCommunication());
        writer.writeEnumValue("radios", this.getRadios());
        writer.writeEnumValue("rearCamera", this.getRearCamera());
        writer.writeEnumValue("sdCard", this.getSdCard());
        writer.writeEnumValue("simultaneousMultiThreading", this.getSimultaneousMultiThreading());
        writer.writeEnumValue("usbTypeAPort", this.getUsbTypeAPort());
        writer.writeEnumValue("virtualizationOfCpuAndIO", this.getVirtualizationOfCpuAndIO());
        writer.writeEnumValue("wakeOnLAN", this.getWakeOnLAN());
        writer.writeEnumValue("wakeOnPower", this.getWakeOnPower());
        writer.writeEnumValue("wiFi", this.getWiFi());
        writer.writeEnumValue("windowsPlatformBinaryTable", this.getWindowsPlatformBinaryTable());
        writer.writeEnumValue("wirelessWideAreaNetwork", this.getWirelessWideAreaNetwork());
    }
    /**
     * Sets the bluetooth property value. Possible values of a property
     * @param value Value to set for the bluetooth property.
     */
    public void setBluetooth(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("bluetooth", value);
    }
    /**
     * Sets the bootFromBuiltInNetworkAdapters property value. Possible values of a property
     * @param value Value to set for the bootFromBuiltInNetworkAdapters property.
     */
    public void setBootFromBuiltInNetworkAdapters(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("bootFromBuiltInNetworkAdapters", value);
    }
    /**
     * Sets the bootFromExternalMedia property value. Possible values of a property
     * @param value Value to set for the bootFromExternalMedia property.
     */
    public void setBootFromExternalMedia(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("bootFromExternalMedia", value);
    }
    /**
     * Sets the cameras property value. Possible values of a property
     * @param value Value to set for the cameras property.
     */
    public void setCameras(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("cameras", value);
    }
    /**
     * Sets the changeUefiSettingsPermission property value. Defines the permission level granted to users to enable them change Uefi settings
     * @param value Value to set for the changeUefiSettingsPermission property.
     */
    public void setChangeUefiSettingsPermission(@jakarta.annotation.Nullable final ChangeUefiSettingsPermission value) {
        this.backingStore.set("changeUefiSettingsPermission", value);
    }
    /**
     * Sets the frontCamera property value. Possible values of a property
     * @param value Value to set for the frontCamera property.
     */
    public void setFrontCamera(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("frontCamera", value);
    }
    /**
     * Sets the infraredCamera property value. Possible values of a property
     * @param value Value to set for the infraredCamera property.
     */
    public void setInfraredCamera(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("infraredCamera", value);
    }
    /**
     * Sets the microphone property value. Possible values of a property
     * @param value Value to set for the microphone property.
     */
    public void setMicrophone(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("microphone", value);
    }
    /**
     * Sets the microphonesAndSpeakers property value. Possible values of a property
     * @param value Value to set for the microphonesAndSpeakers property.
     */
    public void setMicrophonesAndSpeakers(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("microphonesAndSpeakers", value);
    }
    /**
     * Sets the nearFieldCommunication property value. Possible values of a property
     * @param value Value to set for the nearFieldCommunication property.
     */
    public void setNearFieldCommunication(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("nearFieldCommunication", value);
    }
    /**
     * Sets the radios property value. Possible values of a property
     * @param value Value to set for the radios property.
     */
    public void setRadios(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("radios", value);
    }
    /**
     * Sets the rearCamera property value. Possible values of a property
     * @param value Value to set for the rearCamera property.
     */
    public void setRearCamera(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("rearCamera", value);
    }
    /**
     * Sets the sdCard property value. Possible values of a property
     * @param value Value to set for the sdCard property.
     */
    public void setSdCard(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("sdCard", value);
    }
    /**
     * Sets the simultaneousMultiThreading property value. Possible values of a property
     * @param value Value to set for the simultaneousMultiThreading property.
     */
    public void setSimultaneousMultiThreading(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("simultaneousMultiThreading", value);
    }
    /**
     * Sets the usbTypeAPort property value. Possible values of a property
     * @param value Value to set for the usbTypeAPort property.
     */
    public void setUsbTypeAPort(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("usbTypeAPort", value);
    }
    /**
     * Sets the virtualizationOfCpuAndIO property value. Possible values of a property
     * @param value Value to set for the virtualizationOfCpuAndIO property.
     */
    public void setVirtualizationOfCpuAndIO(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("virtualizationOfCpuAndIO", value);
    }
    /**
     * Sets the wakeOnLAN property value. Possible values of a property
     * @param value Value to set for the wakeOnLAN property.
     */
    public void setWakeOnLAN(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("wakeOnLAN", value);
    }
    /**
     * Sets the wakeOnPower property value. Possible values of a property
     * @param value Value to set for the wakeOnPower property.
     */
    public void setWakeOnPower(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("wakeOnPower", value);
    }
    /**
     * Sets the wiFi property value. Possible values of a property
     * @param value Value to set for the wiFi property.
     */
    public void setWiFi(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("wiFi", value);
    }
    /**
     * Sets the windowsPlatformBinaryTable property value. Possible values of a property
     * @param value Value to set for the windowsPlatformBinaryTable property.
     */
    public void setWindowsPlatformBinaryTable(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("windowsPlatformBinaryTable", value);
    }
    /**
     * Sets the wirelessWideAreaNetwork property value. Possible values of a property
     * @param value Value to set for the wirelessWideAreaNetwork property.
     */
    public void setWirelessWideAreaNetwork(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("wirelessWideAreaNetwork", value);
    }
}

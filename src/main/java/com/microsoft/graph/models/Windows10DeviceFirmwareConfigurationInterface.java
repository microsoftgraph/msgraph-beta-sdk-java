package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10DeviceFirmwareConfigurationInterface extends DeviceConfiguration implements Parsable {
    /** Possible values of a property */
    private Enablement _bluetooth;
    /** Possible values of a property */
    private Enablement _bootFromBuiltInNetworkAdapters;
    /** Possible values of a property */
    private Enablement _bootFromExternalMedia;
    /** Possible values of a property */
    private Enablement _cameras;
    /** Defines the permission level granted to users to enable them change Uefi settings */
    private ChangeUefiSettingsPermission _changeUefiSettingsPermission;
    /** Possible values of a property */
    private Enablement _frontCamera;
    /** Possible values of a property */
    private Enablement _infraredCamera;
    /** Possible values of a property */
    private Enablement _microphone;
    /** Possible values of a property */
    private Enablement _microphonesAndSpeakers;
    /** Possible values of a property */
    private Enablement _nearFieldCommunication;
    /** Possible values of a property */
    private Enablement _radios;
    /** Possible values of a property */
    private Enablement _rearCamera;
    /** Possible values of a property */
    private Enablement _sdCard;
    /** Possible values of a property */
    private Enablement _simultaneousMultiThreading;
    /** Possible values of a property */
    private Enablement _usbTypeAPort;
    /** Possible values of a property */
    private Enablement _virtualizationOfCpuAndIO;
    /** Possible values of a property */
    private Enablement _wakeOnLAN;
    /** Possible values of a property */
    private Enablement _wakeOnPower;
    /** Possible values of a property */
    private Enablement _wiFi;
    /** Possible values of a property */
    private Enablement _windowsPlatformBinaryTable;
    /** Possible values of a property */
    private Enablement _wirelessWideAreaNetwork;
    /**
     * Instantiates a new Windows10DeviceFirmwareConfigurationInterface and sets the default values.
     * @return a void
     */
    public Windows10DeviceFirmwareConfigurationInterface() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10DeviceFirmwareConfigurationInterface
     */
    @javax.annotation.Nonnull
    public static Windows10DeviceFirmwareConfigurationInterface createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10DeviceFirmwareConfigurationInterface();
    }
    /**
     * Gets the bluetooth property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getBluetooth() {
        return this._bluetooth;
    }
    /**
     * Gets the bootFromBuiltInNetworkAdapters property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getBootFromBuiltInNetworkAdapters() {
        return this._bootFromBuiltInNetworkAdapters;
    }
    /**
     * Gets the bootFromExternalMedia property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getBootFromExternalMedia() {
        return this._bootFromExternalMedia;
    }
    /**
     * Gets the cameras property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getCameras() {
        return this._cameras;
    }
    /**
     * Gets the changeUefiSettingsPermission property value. Defines the permission level granted to users to enable them change Uefi settings
     * @return a changeUefiSettingsPermission
     */
    @javax.annotation.Nullable
    public ChangeUefiSettingsPermission getChangeUefiSettingsPermission() {
        return this._changeUefiSettingsPermission;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10DeviceFirmwareConfigurationInterface currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("bluetooth", (n) -> { currentObject.setBluetooth(n.getEnumValue(Enablement.class)); });
            this.put("bootFromBuiltInNetworkAdapters", (n) -> { currentObject.setBootFromBuiltInNetworkAdapters(n.getEnumValue(Enablement.class)); });
            this.put("bootFromExternalMedia", (n) -> { currentObject.setBootFromExternalMedia(n.getEnumValue(Enablement.class)); });
            this.put("cameras", (n) -> { currentObject.setCameras(n.getEnumValue(Enablement.class)); });
            this.put("changeUefiSettingsPermission", (n) -> { currentObject.setChangeUefiSettingsPermission(n.getEnumValue(ChangeUefiSettingsPermission.class)); });
            this.put("frontCamera", (n) -> { currentObject.setFrontCamera(n.getEnumValue(Enablement.class)); });
            this.put("infraredCamera", (n) -> { currentObject.setInfraredCamera(n.getEnumValue(Enablement.class)); });
            this.put("microphone", (n) -> { currentObject.setMicrophone(n.getEnumValue(Enablement.class)); });
            this.put("microphonesAndSpeakers", (n) -> { currentObject.setMicrophonesAndSpeakers(n.getEnumValue(Enablement.class)); });
            this.put("nearFieldCommunication", (n) -> { currentObject.setNearFieldCommunication(n.getEnumValue(Enablement.class)); });
            this.put("radios", (n) -> { currentObject.setRadios(n.getEnumValue(Enablement.class)); });
            this.put("rearCamera", (n) -> { currentObject.setRearCamera(n.getEnumValue(Enablement.class)); });
            this.put("sdCard", (n) -> { currentObject.setSdCard(n.getEnumValue(Enablement.class)); });
            this.put("simultaneousMultiThreading", (n) -> { currentObject.setSimultaneousMultiThreading(n.getEnumValue(Enablement.class)); });
            this.put("usbTypeAPort", (n) -> { currentObject.setUsbTypeAPort(n.getEnumValue(Enablement.class)); });
            this.put("virtualizationOfCpuAndIO", (n) -> { currentObject.setVirtualizationOfCpuAndIO(n.getEnumValue(Enablement.class)); });
            this.put("wakeOnLAN", (n) -> { currentObject.setWakeOnLAN(n.getEnumValue(Enablement.class)); });
            this.put("wakeOnPower", (n) -> { currentObject.setWakeOnPower(n.getEnumValue(Enablement.class)); });
            this.put("wiFi", (n) -> { currentObject.setWiFi(n.getEnumValue(Enablement.class)); });
            this.put("windowsPlatformBinaryTable", (n) -> { currentObject.setWindowsPlatformBinaryTable(n.getEnumValue(Enablement.class)); });
            this.put("wirelessWideAreaNetwork", (n) -> { currentObject.setWirelessWideAreaNetwork(n.getEnumValue(Enablement.class)); });
        }};
    }
    /**
     * Gets the frontCamera property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getFrontCamera() {
        return this._frontCamera;
    }
    /**
     * Gets the infraredCamera property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getInfraredCamera() {
        return this._infraredCamera;
    }
    /**
     * Gets the microphone property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getMicrophone() {
        return this._microphone;
    }
    /**
     * Gets the microphonesAndSpeakers property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getMicrophonesAndSpeakers() {
        return this._microphonesAndSpeakers;
    }
    /**
     * Gets the nearFieldCommunication property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getNearFieldCommunication() {
        return this._nearFieldCommunication;
    }
    /**
     * Gets the radios property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getRadios() {
        return this._radios;
    }
    /**
     * Gets the rearCamera property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getRearCamera() {
        return this._rearCamera;
    }
    /**
     * Gets the sdCard property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSdCard() {
        return this._sdCard;
    }
    /**
     * Gets the simultaneousMultiThreading property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSimultaneousMultiThreading() {
        return this._simultaneousMultiThreading;
    }
    /**
     * Gets the usbTypeAPort property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getUsbTypeAPort() {
        return this._usbTypeAPort;
    }
    /**
     * Gets the virtualizationOfCpuAndIO property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getVirtualizationOfCpuAndIO() {
        return this._virtualizationOfCpuAndIO;
    }
    /**
     * Gets the wakeOnLAN property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getWakeOnLAN() {
        return this._wakeOnLAN;
    }
    /**
     * Gets the wakeOnPower property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getWakeOnPower() {
        return this._wakeOnPower;
    }
    /**
     * Gets the wiFi property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getWiFi() {
        return this._wiFi;
    }
    /**
     * Gets the windowsPlatformBinaryTable property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getWindowsPlatformBinaryTable() {
        return this._windowsPlatformBinaryTable;
    }
    /**
     * Gets the wirelessWideAreaNetwork property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getWirelessWideAreaNetwork() {
        return this._wirelessWideAreaNetwork;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setBluetooth(@javax.annotation.Nullable final Enablement value) {
        this._bluetooth = value;
    }
    /**
     * Sets the bootFromBuiltInNetworkAdapters property value. Possible values of a property
     * @param value Value to set for the bootFromBuiltInNetworkAdapters property.
     * @return a void
     */
    public void setBootFromBuiltInNetworkAdapters(@javax.annotation.Nullable final Enablement value) {
        this._bootFromBuiltInNetworkAdapters = value;
    }
    /**
     * Sets the bootFromExternalMedia property value. Possible values of a property
     * @param value Value to set for the bootFromExternalMedia property.
     * @return a void
     */
    public void setBootFromExternalMedia(@javax.annotation.Nullable final Enablement value) {
        this._bootFromExternalMedia = value;
    }
    /**
     * Sets the cameras property value. Possible values of a property
     * @param value Value to set for the cameras property.
     * @return a void
     */
    public void setCameras(@javax.annotation.Nullable final Enablement value) {
        this._cameras = value;
    }
    /**
     * Sets the changeUefiSettingsPermission property value. Defines the permission level granted to users to enable them change Uefi settings
     * @param value Value to set for the changeUefiSettingsPermission property.
     * @return a void
     */
    public void setChangeUefiSettingsPermission(@javax.annotation.Nullable final ChangeUefiSettingsPermission value) {
        this._changeUefiSettingsPermission = value;
    }
    /**
     * Sets the frontCamera property value. Possible values of a property
     * @param value Value to set for the frontCamera property.
     * @return a void
     */
    public void setFrontCamera(@javax.annotation.Nullable final Enablement value) {
        this._frontCamera = value;
    }
    /**
     * Sets the infraredCamera property value. Possible values of a property
     * @param value Value to set for the infraredCamera property.
     * @return a void
     */
    public void setInfraredCamera(@javax.annotation.Nullable final Enablement value) {
        this._infraredCamera = value;
    }
    /**
     * Sets the microphone property value. Possible values of a property
     * @param value Value to set for the microphone property.
     * @return a void
     */
    public void setMicrophone(@javax.annotation.Nullable final Enablement value) {
        this._microphone = value;
    }
    /**
     * Sets the microphonesAndSpeakers property value. Possible values of a property
     * @param value Value to set for the microphonesAndSpeakers property.
     * @return a void
     */
    public void setMicrophonesAndSpeakers(@javax.annotation.Nullable final Enablement value) {
        this._microphonesAndSpeakers = value;
    }
    /**
     * Sets the nearFieldCommunication property value. Possible values of a property
     * @param value Value to set for the nearFieldCommunication property.
     * @return a void
     */
    public void setNearFieldCommunication(@javax.annotation.Nullable final Enablement value) {
        this._nearFieldCommunication = value;
    }
    /**
     * Sets the radios property value. Possible values of a property
     * @param value Value to set for the radios property.
     * @return a void
     */
    public void setRadios(@javax.annotation.Nullable final Enablement value) {
        this._radios = value;
    }
    /**
     * Sets the rearCamera property value. Possible values of a property
     * @param value Value to set for the rearCamera property.
     * @return a void
     */
    public void setRearCamera(@javax.annotation.Nullable final Enablement value) {
        this._rearCamera = value;
    }
    /**
     * Sets the sdCard property value. Possible values of a property
     * @param value Value to set for the sdCard property.
     * @return a void
     */
    public void setSdCard(@javax.annotation.Nullable final Enablement value) {
        this._sdCard = value;
    }
    /**
     * Sets the simultaneousMultiThreading property value. Possible values of a property
     * @param value Value to set for the simultaneousMultiThreading property.
     * @return a void
     */
    public void setSimultaneousMultiThreading(@javax.annotation.Nullable final Enablement value) {
        this._simultaneousMultiThreading = value;
    }
    /**
     * Sets the usbTypeAPort property value. Possible values of a property
     * @param value Value to set for the usbTypeAPort property.
     * @return a void
     */
    public void setUsbTypeAPort(@javax.annotation.Nullable final Enablement value) {
        this._usbTypeAPort = value;
    }
    /**
     * Sets the virtualizationOfCpuAndIO property value. Possible values of a property
     * @param value Value to set for the virtualizationOfCpuAndIO property.
     * @return a void
     */
    public void setVirtualizationOfCpuAndIO(@javax.annotation.Nullable final Enablement value) {
        this._virtualizationOfCpuAndIO = value;
    }
    /**
     * Sets the wakeOnLAN property value. Possible values of a property
     * @param value Value to set for the wakeOnLAN property.
     * @return a void
     */
    public void setWakeOnLAN(@javax.annotation.Nullable final Enablement value) {
        this._wakeOnLAN = value;
    }
    /**
     * Sets the wakeOnPower property value. Possible values of a property
     * @param value Value to set for the wakeOnPower property.
     * @return a void
     */
    public void setWakeOnPower(@javax.annotation.Nullable final Enablement value) {
        this._wakeOnPower = value;
    }
    /**
     * Sets the wiFi property value. Possible values of a property
     * @param value Value to set for the wiFi property.
     * @return a void
     */
    public void setWiFi(@javax.annotation.Nullable final Enablement value) {
        this._wiFi = value;
    }
    /**
     * Sets the windowsPlatformBinaryTable property value. Possible values of a property
     * @param value Value to set for the windowsPlatformBinaryTable property.
     * @return a void
     */
    public void setWindowsPlatformBinaryTable(@javax.annotation.Nullable final Enablement value) {
        this._windowsPlatformBinaryTable = value;
    }
    /**
     * Sets the wirelessWideAreaNetwork property value. Possible values of a property
     * @param value Value to set for the wirelessWideAreaNetwork property.
     * @return a void
     */
    public void setWirelessWideAreaNetwork(@javax.annotation.Nullable final Enablement value) {
        this._wirelessWideAreaNetwork = value;
    }
}

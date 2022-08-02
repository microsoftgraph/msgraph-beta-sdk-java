package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOsVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /** Whether or not to uninstall the app when device is removed from Intune. */
    private Boolean _uninstallOnDeviceRemoval;
    /** Whether or not to use device licensing. */
    private Boolean _useDeviceLicensing;
    /**
     * Instantiates a new MacOsVppAppAssignmentSettings and sets the default values.
     * @return a void
     */
    public MacOsVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.macOsVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOsVppAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static MacOsVppAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOsVppAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOsVppAppAssignmentSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("uninstallOnDeviceRemoval", (n) -> { currentObject.setUninstallOnDeviceRemoval(n.getBooleanValue()); });
            this.put("useDeviceLicensing", (n) -> { currentObject.setUseDeviceLicensing(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUninstallOnDeviceRemoval() {
        return this._uninstallOnDeviceRemoval;
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this._useDeviceLicensing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("uninstallOnDeviceRemoval", this.getUninstallOnDeviceRemoval());
        writer.writeBooleanValue("useDeviceLicensing", this.getUseDeviceLicensing());
    }
    /**
     * Sets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @param value Value to set for the uninstallOnDeviceRemoval property.
     * @return a void
     */
    public void setUninstallOnDeviceRemoval(@javax.annotation.Nullable final Boolean value) {
        this._uninstallOnDeviceRemoval = value;
    }
    /**
     * Sets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @param value Value to set for the useDeviceLicensing property.
     * @return a void
     */
    public void setUseDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this._useDeviceLicensing = value;
    }
}

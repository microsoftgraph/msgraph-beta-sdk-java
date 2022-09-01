package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosVppAppAssignedDeviceLicense extends IosVppAppAssignedLicense implements Parsable {
    /** The device name. */
    private String _deviceName;
    /** The managed device ID. */
    private String _managedDeviceId;
    /**
     * Instantiates a new IosVppAppAssignedDeviceLicense and sets the default values.
     * @return a void
     */
    public IosVppAppAssignedDeviceLicense() {
        super();
        this.setOdataType("#microsoft.graph.iosVppAppAssignedDeviceLicense");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVppAppAssignedDeviceLicense
     */
    @javax.annotation.Nonnull
    public static IosVppAppAssignedDeviceLicense createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppAssignedDeviceLicense();
    }
    /**
     * Gets the deviceName property value. The device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosVppAppAssignedDeviceLicense currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceId property value. The managed device ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
    }
    /**
     * Sets the deviceName property value. The device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the managedDeviceId property value. The managed device ID.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
}

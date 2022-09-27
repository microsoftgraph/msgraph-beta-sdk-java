package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnmanagedDeviceDiscoveryTask extends DeviceAppManagementTask implements Parsable {
    /** Unmanaged devices discovered in the network. */
    private java.util.List<UnmanagedDevice> _unmanagedDevices;
    /**
     * Instantiates a new UnmanagedDeviceDiscoveryTask and sets the default values.
     * @return a void
     */
    public UnmanagedDeviceDiscoveryTask() {
        super();
        this.setOdataType("#microsoft.graph.unmanagedDeviceDiscoveryTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnmanagedDeviceDiscoveryTask
     */
    @javax.annotation.Nonnull
    public static UnmanagedDeviceDiscoveryTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnmanagedDeviceDiscoveryTask();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnmanagedDeviceDiscoveryTask currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("unmanagedDevices", (n) -> { currentObject.setUnmanagedDevices(n.getCollectionOfObjectValues(UnmanagedDevice::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the unmanagedDevices property value. Unmanaged devices discovered in the network.
     * @return a unmanagedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<UnmanagedDevice> getUnmanagedDevices() {
        return this._unmanagedDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("unmanagedDevices", this.getUnmanagedDevices());
    }
    /**
     * Sets the unmanagedDevices property value. Unmanaged devices discovered in the network.
     * @param value Value to set for the unmanagedDevices property.
     * @return a void
     */
    public void setUnmanagedDevices(@javax.annotation.Nullable final java.util.List<UnmanagedDevice> value) {
        this._unmanagedDevices = value;
    }
}

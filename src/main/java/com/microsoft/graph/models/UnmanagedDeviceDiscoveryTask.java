package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This task derived type represents a list of unmanaged devices discovered in the network.
 */
public class UnmanagedDeviceDiscoveryTask extends DeviceAppManagementTask implements Parsable {
    /**
     * Unmanaged devices discovered in the network.
     */
    private java.util.List<UnmanagedDevice> unmanagedDevices;
    /**
     * Instantiates a new unmanagedDeviceDiscoveryTask and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UnmanagedDeviceDiscoveryTask() {
        super();
        this.setOdataType("#microsoft.graph.unmanagedDeviceDiscoveryTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unmanagedDeviceDiscoveryTask
     */
    @jakarta.annotation.Nonnull
    public static UnmanagedDeviceDiscoveryTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnmanagedDeviceDiscoveryTask();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("unmanagedDevices", (n) -> { this.setUnmanagedDevices(n.getCollectionOfObjectValues(UnmanagedDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the unmanagedDevices property value. Unmanaged devices discovered in the network.
     * @return a unmanagedDevice
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnmanagedDevice> getUnmanagedDevices() {
        return this.unmanagedDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("unmanagedDevices", this.getUnmanagedDevices());
    }
    /**
     * Sets the unmanagedDevices property value. Unmanaged devices discovered in the network.
     * @param value Value to set for the unmanagedDevices property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUnmanagedDevices(@jakarta.annotation.Nullable final java.util.List<UnmanagedDevice> value) {
        this.unmanagedDevices = value;
    }
}

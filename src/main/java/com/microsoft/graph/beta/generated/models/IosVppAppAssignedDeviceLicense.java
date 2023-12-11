package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Volume Purchase Program device license assignment. This class does not support Create, Delete, or Update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVppAppAssignedDeviceLicense extends IosVppAppAssignedLicense implements Parsable {
    /**
     * Instantiates a new IosVppAppAssignedDeviceLicense and sets the default values.
     */
    public IosVppAppAssignedDeviceLicense() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVppAppAssignedDeviceLicense
     */
    @jakarta.annotation.Nonnull
    public static IosVppAppAssignedDeviceLicense createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppAssignedDeviceLicense();
    }
    /**
     * Gets the deviceName property value. The device name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceId property value. The managed device ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
    }
    /**
     * Sets the deviceName property value. The device name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the managedDeviceId property value. The managed device ID.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
}

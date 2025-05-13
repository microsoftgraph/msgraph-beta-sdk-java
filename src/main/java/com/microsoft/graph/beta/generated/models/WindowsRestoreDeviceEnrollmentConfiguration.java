package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Indicates the configuration is of type Windows Restore which refers to the tenant level Windows Backup and Restore settings a user receives during OOBE Windows enrollment
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsRestoreDeviceEnrollmentConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new {@link WindowsRestoreDeviceEnrollmentConfiguration} and sets the default values.
     */
    public WindowsRestoreDeviceEnrollmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsRestoreDeviceEnrollmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsRestoreDeviceEnrollmentConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static WindowsRestoreDeviceEnrollmentConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsRestoreDeviceEnrollmentConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(Enablement::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the state property value. Possible values of a property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("state", value);
    }
}

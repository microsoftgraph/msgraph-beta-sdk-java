package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareOathAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link HardwareOathAuthenticationMethod} and sets the default values.
     */
    public HardwareOathAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.hardwareOathAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwareOathAuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static HardwareOathAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareOathAuthenticationMethod();
    }
    /**
     * Gets the device property value. The device property
     * @return a {@link HardwareOathTokenAuthenticationMethodDevice}
     */
    @jakarta.annotation.Nullable
    public HardwareOathTokenAuthenticationMethodDevice getDevice() {
        return this.backingStore.get("device");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(HardwareOathTokenAuthenticationMethodDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("device", this.getDevice());
    }
    /**
     * Sets the device property value. The device property
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final HardwareOathTokenAuthenticationMethodDevice value) {
        this.backingStore.set("device", value);
    }
}

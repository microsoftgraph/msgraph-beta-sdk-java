package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodDevice extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthenticationMethodDevice} and sets the default values.
     */
    public AuthenticationMethodDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationMethodDevice}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.hardwareOathTokenAuthenticationMethodDevice": return new HardwareOathTokenAuthenticationMethodDevice();
            }
        }
        return new AuthenticationMethodDevice();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hardwareOathDevices", (n) -> { this.setHardwareOathDevices(n.getCollectionOfObjectValues(HardwareOathTokenAuthenticationMethodDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hardwareOathDevices property value. The hardwareOathDevices property
     * @return a {@link java.util.List<HardwareOathTokenAuthenticationMethodDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwareOathTokenAuthenticationMethodDevice> getHardwareOathDevices() {
        return this.backingStore.get("hardwareOathDevices");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("hardwareOathDevices", this.getHardwareOathDevices());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the hardwareOathDevices property value. The hardwareOathDevices property
     * @param value Value to set for the hardwareOathDevices property.
     */
    public void setHardwareOathDevices(@jakarta.annotation.Nullable final java.util.List<HardwareOathTokenAuthenticationMethodDevice> value) {
        this.backingStore.set("hardwareOathDevices", value);
    }
}

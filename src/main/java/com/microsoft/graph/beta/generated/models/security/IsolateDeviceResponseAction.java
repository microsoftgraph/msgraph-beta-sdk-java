package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IsolateDeviceResponseAction extends ResponseAction implements Parsable {
    /**
     * Instantiates a new {@link IsolateDeviceResponseAction} and sets the default values.
     */
    public IsolateDeviceResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.isolateDeviceResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IsolateDeviceResponseAction}
     */
    @jakarta.annotation.Nonnull
    public static IsolateDeviceResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IsolateDeviceResponseAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getEnumSetValue(DeviceIdEntityIdentifier::forValue)); });
        deserializerMap.put("isolationType", (n) -> { this.setIsolationType(n.getEnumValue(IsolationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a {@link EnumSet<DeviceIdEntityIdentifier>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceIdEntityIdentifier> getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the isolationType property value. The isolationType property
     * @return a {@link IsolationType}
     */
    @jakarta.annotation.Nullable
    public IsolationType getIsolationType() {
        return this.backingStore.get("isolationType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("identifier", this.getIdentifier());
        writer.writeEnumValue("isolationType", this.getIsolationType());
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final EnumSet<DeviceIdEntityIdentifier> value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the isolationType property value. The isolationType property
     * @param value Value to set for the isolationType property.
     */
    public void setIsolationType(@jakarta.annotation.Nullable final IsolationType value) {
        this.backingStore.set("isolationType", value);
    }
}

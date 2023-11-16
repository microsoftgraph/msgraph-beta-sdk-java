package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows10 Network Boundary Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10NetworkBoundaryConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10NetworkBoundaryConfiguration and sets the default values.
     */
    public Windows10NetworkBoundaryConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10NetworkBoundaryConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10NetworkBoundaryConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10NetworkBoundaryConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10NetworkBoundaryConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("windowsNetworkIsolationPolicy", (n) -> { this.setWindowsNetworkIsolationPolicy(n.getObjectValue(WindowsNetworkIsolationPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the windowsNetworkIsolationPolicy property value. Windows Network Isolation Policy
     * @return a WindowsNetworkIsolationPolicy
     */
    @jakarta.annotation.Nullable
    public WindowsNetworkIsolationPolicy getWindowsNetworkIsolationPolicy() {
        return this.BackingStore.get("windowsNetworkIsolationPolicy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("windowsNetworkIsolationPolicy", this.getWindowsNetworkIsolationPolicy());
    }
    /**
     * Sets the windowsNetworkIsolationPolicy property value. Windows Network Isolation Policy
     * @param value Value to set for the windowsNetworkIsolationPolicy property.
     */
    public void setWindowsNetworkIsolationPolicy(@jakarta.annotation.Nullable final WindowsNetworkIsolationPolicy value) {
        this.BackingStore.set("windowsNetworkIsolationPolicy", value);
    }
}

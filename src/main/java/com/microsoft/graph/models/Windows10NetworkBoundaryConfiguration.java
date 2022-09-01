package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10NetworkBoundaryConfiguration extends DeviceConfiguration implements Parsable {
    /** Windows Network Isolation Policy */
    private WindowsNetworkIsolationPolicy _windowsNetworkIsolationPolicy;
    /**
     * Instantiates a new Windows10NetworkBoundaryConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Windows10NetworkBoundaryConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10NetworkBoundaryConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10NetworkBoundaryConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("windowsNetworkIsolationPolicy", (n) -> { currentObject.setWindowsNetworkIsolationPolicy(n.getObjectValue(WindowsNetworkIsolationPolicy::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the windowsNetworkIsolationPolicy property value. Windows Network Isolation Policy
     * @return a windowsNetworkIsolationPolicy
     */
    @javax.annotation.Nullable
    public WindowsNetworkIsolationPolicy getWindowsNetworkIsolationPolicy() {
        return this._windowsNetworkIsolationPolicy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("windowsNetworkIsolationPolicy", this.getWindowsNetworkIsolationPolicy());
    }
    /**
     * Sets the windowsNetworkIsolationPolicy property value. Windows Network Isolation Policy
     * @param value Value to set for the windowsNetworkIsolationPolicy property.
     * @return a void
     */
    public void setWindowsNetworkIsolationPolicy(@javax.annotation.Nullable final WindowsNetworkIsolationPolicy value) {
        this._windowsNetworkIsolationPolicy = value;
    }
}

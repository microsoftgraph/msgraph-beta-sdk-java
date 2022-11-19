package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerGlobalProxyAutoConfig extends AndroidDeviceOwnerGlobalProxy implements Parsable {
    /** The proxy auto-config URL */
    private String _proxyAutoConfigURL;
    /**
     * Instantiates a new AndroidDeviceOwnerGlobalProxyAutoConfig and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerGlobalProxyAutoConfig() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerGlobalProxyAutoConfig");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerGlobalProxyAutoConfig
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerGlobalProxyAutoConfig createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGlobalProxyAutoConfig();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerGlobalProxyAutoConfig currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("proxyAutoConfigURL", (n) -> { currentObject.setProxyAutoConfigURL(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the proxyAutoConfigURL property value. The proxy auto-config URL
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyAutoConfigURL() {
        return this._proxyAutoConfigURL;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("proxyAutoConfigURL", this.getProxyAutoConfigURL());
    }
    /**
     * Sets the proxyAutoConfigURL property value. The proxy auto-config URL
     * @param value Value to set for the proxyAutoConfigURL property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyAutoConfigURL(@javax.annotation.Nullable final String value) {
        this._proxyAutoConfigURL = value;
    }
}

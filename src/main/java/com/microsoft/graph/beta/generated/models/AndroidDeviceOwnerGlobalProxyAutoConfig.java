package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Device Owner Global Proxy Auto Config.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerGlobalProxyAutoConfig extends AndroidDeviceOwnerGlobalProxy implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerGlobalProxyAutoConfig and sets the default values.
     */
    public AndroidDeviceOwnerGlobalProxyAutoConfig() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerGlobalProxyAutoConfig");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerGlobalProxyAutoConfig
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerGlobalProxyAutoConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGlobalProxyAutoConfig();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("proxyAutoConfigURL", (n) -> { this.setProxyAutoConfigURL(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the proxyAutoConfigURL property value. The proxy auto-config URL
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyAutoConfigURL() {
        return this.backingStore.get("proxyAutoConfigURL");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("proxyAutoConfigURL", this.getProxyAutoConfigURL());
    }
    /**
     * Sets the proxyAutoConfigURL property value. The proxy auto-config URL
     * @param value Value to set for the proxyAutoConfigURL property.
     */
    public void setProxyAutoConfigURL(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proxyAutoConfigURL", value);
    }
}

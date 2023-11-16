package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Device Owner Global Proxy Direct.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerGlobalProxyDirect extends AndroidDeviceOwnerGlobalProxy implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerGlobalProxyDirect and sets the default values.
     */
    public AndroidDeviceOwnerGlobalProxyDirect() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerGlobalProxyDirect");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerGlobalProxyDirect
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerGlobalProxyDirect createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGlobalProxyDirect();
    }
    /**
     * Gets the excludedHosts property value. The excluded hosts
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedHosts() {
        return this.BackingStore.get("excludedHosts");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludedHosts", (n) -> { this.setExcludedHosts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. The host name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHost() {
        return this.BackingStore.get("host");
    }
    /**
     * Gets the port property value. The port
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.BackingStore.get("port");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("excludedHosts", this.getExcludedHosts());
        writer.writeStringValue("host", this.getHost());
        writer.writeIntegerValue("port", this.getPort());
    }
    /**
     * Sets the excludedHosts property value. The excluded hosts
     * @param value Value to set for the excludedHosts property.
     */
    public void setExcludedHosts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("excludedHosts", value);
    }
    /**
     * Sets the host property value. The host name
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("host", value);
    }
    /**
     * Sets the port property value. The port
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("port", value);
    }
}

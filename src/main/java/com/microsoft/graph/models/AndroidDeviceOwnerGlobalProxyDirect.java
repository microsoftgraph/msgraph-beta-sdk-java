package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerGlobalProxyDirect extends AndroidDeviceOwnerGlobalProxy implements Parsable {
    /** The excluded hosts */
    private java.util.List<String> excludedHosts;
    /** The host name */
    private String host;
    /** The port */
    private Integer port;
    /**
     * Instantiates a new AndroidDeviceOwnerGlobalProxyDirect and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerGlobalProxyDirect() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerGlobalProxyDirect");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerGlobalProxyDirect
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerGlobalProxyDirect createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGlobalProxyDirect();
    }
    /**
     * Gets the excludedHosts property value. The excluded hosts
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedHosts() {
        return this.excludedHosts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludedHosts", (n) -> { this.setExcludedHosts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. The host name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHost() {
        return this.host;
    }
    /**
     * Gets the port property value. The port
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this.port;
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
        writer.writeCollectionOfPrimitiveValues("excludedHosts", this.getExcludedHosts());
        writer.writeStringValue("host", this.getHost());
        writer.writeIntegerValue("port", this.getPort());
    }
    /**
     * Sets the excludedHosts property value. The excluded hosts
     * @param value Value to set for the excludedHosts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedHosts(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludedHosts = value;
    }
    /**
     * Sets the host property value. The host name
     * @param value Value to set for the host property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHost(@javax.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the port property value. The port
     * @param value Value to set for the port property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this.port = value;
    }
}

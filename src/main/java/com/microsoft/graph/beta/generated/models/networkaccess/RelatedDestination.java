package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedDestination extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedDestination} and sets the default values.
     */
    public RelatedDestination() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedDestination");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedDestination}
     */
    @jakarta.annotation.Nonnull
    public static RelatedDestination createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedDestination();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fqdn", (n) -> { this.setFqdn(n.getStringValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        deserializerMap.put("networkingProtocol", (n) -> { this.setNetworkingProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fqdn property value. Fully qualified domain name of the destination. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFqdn() {
        return this.backingStore.get("fqdn");
    }
    /**
     * Gets the ip property value. IP address of the destination. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIp() {
        return this.backingStore.get("ip");
    }
    /**
     * Gets the networkingProtocol property value. The networkingProtocol property
     * @return a {@link NetworkingProtocol}
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getNetworkingProtocol() {
        return this.backingStore.get("networkingProtocol");
    }
    /**
     * Gets the port property value. Port number used to access the destination. Required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.backingStore.get("port");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fqdn", this.getFqdn());
        writer.writeStringValue("ip", this.getIp());
        writer.writeEnumValue("networkingProtocol", this.getNetworkingProtocol());
        writer.writeIntegerValue("port", this.getPort());
    }
    /**
     * Sets the fqdn property value. Fully qualified domain name of the destination. Required.
     * @param value Value to set for the fqdn property.
     */
    public void setFqdn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fqdn", value);
    }
    /**
     * Sets the ip property value. IP address of the destination. Required.
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ip", value);
    }
    /**
     * Sets the networkingProtocol property value. The networkingProtocol property
     * @param value Value to set for the networkingProtocol property.
     */
    public void setNetworkingProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.backingStore.set("networkingProtocol", value);
    }
    /**
     * Sets the port property value. Port number used to access the destination. Required.
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("port", value);
    }
}

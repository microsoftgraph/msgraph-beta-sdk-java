package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IpApplicationSegment extends ApplicationSegment implements Parsable {
    /**
     * Instantiates a new {@link IpApplicationSegment} and sets the default values.
     */
    public IpApplicationSegment() {
        super();
        this.setOdataType("#microsoft.graph.ipApplicationSegment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IpApplicationSegment}
     */
    @jakarta.annotation.Nonnull
    public static IpApplicationSegment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpApplicationSegment();
    }
    /**
     * Gets the application property value. The on-premises nonweb application published through Microsoft Entra application proxy. Expanded by default and supports $expand.
     * @return a {@link Application}
     */
    @jakarta.annotation.Nullable
    public Application getApplication() {
        return this.backingStore.get("application");
    }
    /**
     * Gets the destinationHost property value. Either the IP address, IP range, or FQDN of the applicationSegment, with or without wildcards.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationHost() {
        return this.backingStore.get("destinationHost");
    }
    /**
     * Gets the destinationType property value. The possible values are: ipAddress, ipRange, ipRangeCidr, fqdn, dnsSuffix, unknownFutureValue.
     * @return a {@link PrivateNetworkDestinationType}
     */
    @jakarta.annotation.Nullable
    public PrivateNetworkDestinationType getDestinationType() {
        return this.backingStore.get("destinationType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("application", (n) -> { this.setApplication(n.getObjectValue(Application::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationHost", (n) -> { this.setDestinationHost(n.getStringValue()); });
        deserializerMap.put("destinationType", (n) -> { this.setDestinationType(n.getEnumValue(PrivateNetworkDestinationType::forValue)); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumSetValue(PrivateNetworkProtocol::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the port property value. Port supported for the application segment. DO NOT USE.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.backingStore.get("port");
    }
    /**
     * Gets the ports property value. List of ports supported for the application segment.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.backingStore.get("ports");
    }
    /**
     * Gets the protocol property value. Indicates the protocol of the network traffic acquired for the application segment. The possible values are: tcp, udp, unknownFutureValue.
     * @return a {@link EnumSet<PrivateNetworkProtocol>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<PrivateNetworkProtocol> getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeStringValue("destinationHost", this.getDestinationHost());
        writer.writeEnumValue("destinationType", this.getDestinationType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
        writer.writeEnumSetValue("protocol", this.getProtocol());
    }
    /**
     * Sets the application property value. The on-premises nonweb application published through Microsoft Entra application proxy. Expanded by default and supports $expand.
     * @param value Value to set for the application property.
     */
    public void setApplication(@jakarta.annotation.Nullable final Application value) {
        this.backingStore.set("application", value);
    }
    /**
     * Sets the destinationHost property value. Either the IP address, IP range, or FQDN of the applicationSegment, with or without wildcards.
     * @param value Value to set for the destinationHost property.
     */
    public void setDestinationHost(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationHost", value);
    }
    /**
     * Sets the destinationType property value. The possible values are: ipAddress, ipRange, ipRangeCidr, fqdn, dnsSuffix, unknownFutureValue.
     * @param value Value to set for the destinationType property.
     */
    public void setDestinationType(@jakarta.annotation.Nullable final PrivateNetworkDestinationType value) {
        this.backingStore.set("destinationType", value);
    }
    /**
     * Sets the port property value. Port supported for the application segment. DO NOT USE.
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("port", value);
    }
    /**
     * Sets the ports property value. List of ports supported for the application segment.
     * @param value Value to set for the ports property.
     */
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ports", value);
    }
    /**
     * Sets the protocol property value. Indicates the protocol of the network traffic acquired for the application segment. The possible values are: tcp, udp, unknownFutureValue.
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final EnumSet<PrivateNetworkProtocol> value) {
        this.backingStore.set("protocol", value);
    }
}

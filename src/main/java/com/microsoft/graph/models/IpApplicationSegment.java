package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpApplicationSegment extends ApplicationSegment implements Parsable {
    /**
     * The destinationHost property
     */
    private String destinationHost;
    /**
     * The port property
     */
    private Integer port;
    /**
     * The ports property
     */
    private java.util.List<String> ports;
    /**
     * Instantiates a new ipApplicationSegment and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IpApplicationSegment() {
        super();
        this.setOdataType("#microsoft.graph.ipApplicationSegment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipApplicationSegment
     */
    @jakarta.annotation.Nonnull
    public static IpApplicationSegment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpApplicationSegment();
    }
    /**
     * Gets the destinationHost property value. The destinationHost property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationHost() {
        return this.destinationHost;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinationHost", (n) -> { this.setDestinationHost(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the port property value. The port property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the ports property value. The ports property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.ports;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("destinationHost", this.getDestinationHost());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
    }
    /**
     * Sets the destinationHost property value. The destinationHost property
     * @param value Value to set for the destinationHost property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDestinationHost(@jakarta.annotation.Nullable final String value) {
        this.destinationHost = value;
    }
    /**
     * Sets the port property value. The port property
     * @param value Value to set for the port property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the ports property value. The ports property
     * @param value Value to set for the ports property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ports = value;
    }
}

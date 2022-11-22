package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpApplicationSegment extends ApplicationSegment implements Parsable {
    /** The destinationHost property */
    private String _destinationHost;
    /** The port property */
    private Integer _port;
    /**
     * Instantiates a new IpApplicationSegment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IpApplicationSegment() {
        super();
        this.setOdataType("#microsoft.graph.ipApplicationSegment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IpApplicationSegment
     */
    @javax.annotation.Nonnull
    public static IpApplicationSegment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpApplicationSegment();
    }
    /**
     * Gets the destinationHost property value. The destinationHost property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationHost() {
        return this._destinationHost;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinationHost", (n) -> { this.setDestinationHost(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the port property value. The port property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this._port;
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
        writer.writeStringValue("destinationHost", this.getDestinationHost());
        writer.writeIntegerValue("port", this.getPort());
    }
    /**
     * Sets the destinationHost property value. The destinationHost property
     * @param value Value to set for the destinationHost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationHost(@javax.annotation.Nullable final String value) {
        this._destinationHost = value;
    }
    /**
     * Sets the port property value. The port property
     * @param value Value to set for the port property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this._port = value;
    }
}

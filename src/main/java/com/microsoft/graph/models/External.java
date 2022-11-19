package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class External extends Entity implements Parsable {
    /** The connections property */
    private java.util.List<ExternalConnection> _connections;
    /**
     * Instantiates a new External and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public External() {
        super();
        this.setOdataType("#microsoft.graph.external");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a External
     */
    @javax.annotation.Nonnull
    public static External createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new External();
    }
    /**
     * Gets the connections property value. The connections property
     * @return a externalConnection
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalConnection> getConnections() {
        return this._connections;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final External currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connections", (n) -> { currentObject.setConnections(n.getCollectionOfObjectValues(ExternalConnection::createFromDiscriminatorValue)); });
        return deserializerMap
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
        writer.writeCollectionOfObjectValues("connections", this.getConnections());
    }
    /**
     * Sets the connections property value. The connections property
     * @param value Value to set for the connections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnections(@javax.annotation.Nullable final java.util.List<ExternalConnection> value) {
        this._connections = value;
    }
}

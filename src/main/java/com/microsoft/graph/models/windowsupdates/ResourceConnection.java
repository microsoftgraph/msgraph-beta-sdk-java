package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceConnection extends Entity implements Parsable {
    /** The state of the connection. The possible values are: connected, notAuthorized, notFound, unknownFutureValue. */
    private ResourceConnectionState state;
    /**
     * Instantiates a new resourceConnection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceConnection
     */
    @javax.annotation.Nonnull
    public static ResourceConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.operationalInsightsConnection": return new OperationalInsightsConnection();
            }
        }
        return new ResourceConnection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ResourceConnectionState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. The state of the connection. The possible values are: connected, notAuthorized, notFound, unknownFutureValue.
     * @return a resourceConnectionState
     */
    @javax.annotation.Nullable
    public ResourceConnectionState getState() {
        return this.state;
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
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the state property value. The state of the connection. The possible values are: connected, notAuthorized, notFound, unknownFutureValue.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ResourceConnectionState value) {
        this.state = value;
    }
}

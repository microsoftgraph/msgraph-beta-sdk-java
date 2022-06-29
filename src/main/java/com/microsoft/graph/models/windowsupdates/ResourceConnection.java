package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the admin singleton. */
public class ResourceConnection extends Entity implements Parsable {
    /** The state property */
    private ResourceConnectionState _state;
    /**
     * Instantiates a new resourceConnection and sets the default values.
     * @return a void
     */
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResourceConnection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ResourceConnectionState.class)); });
        }};
    }
    /**
     * Gets the state property value. The state property
     * @return a resourceConnectionState
     */
    @javax.annotation.Nullable
    public ResourceConnectionState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ResourceConnectionState value) {
        this._state = value;
    }
}

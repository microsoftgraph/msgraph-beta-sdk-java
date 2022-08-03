package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NdesConnector extends Entity implements Parsable {
    /** The friendly name of the Ndes Connector. */
    private String _displayName;
    /** Last connection time for the Ndes Connector */
    private OffsetDateTime _lastConnectionDateTime;
    /** The current status of the Ndes Connector. */
    private NdesConnectorState _state;
    /**
     * Instantiates a new NdesConnector and sets the default values.
     * @return a void
     */
    public NdesConnector() {
        super();
        this.setOdataType("#microsoft.graph.ndesConnector");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NdesConnector
     */
    @javax.annotation.Nonnull
    public static NdesConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NdesConnector();
    }
    /**
     * Gets the displayName property value. The friendly name of the Ndes Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NdesConnector currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastConnectionDateTime", (n) -> { currentObject.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(NdesConnectorState.class)); });
        }};
    }
    /**
     * Gets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this._lastConnectionDateTime;
    }
    /**
     * Gets the state property value. The current status of the Ndes Connector.
     * @return a ndesConnectorState
     */
    @javax.annotation.Nullable
    public NdesConnectorState getState() {
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastConnectionDateTime", this.getLastConnectionDateTime());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the displayName property value. The friendly name of the Ndes Connector.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConnectionDateTime = value;
    }
    /**
     * Sets the state property value. The current status of the Ndes Connector.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final NdesConnectorState value) {
        this._state = value;
    }
}

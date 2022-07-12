package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectionOperation extends Entity implements Parsable {
    /** The error property */
    private PublicError _error;
    /** The status property */
    private ConnectionOperationStatus _status;
    /**
     * Instantiates a new ConnectionOperation and sets the default values.
     * @return a void
     */
    public ConnectionOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectionOperation
     */
    @javax.annotation.Nonnull
    public static ConnectionOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectionOperation();
    }
    /**
     * Gets the error property value. The error property
     * @return a publicError
     */
    @javax.annotation.Nullable
    public PublicError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConnectionOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ConnectionOperationStatus.class)); });
        }};
    }
    /**
     * Gets the status property value. The status property
     * @return a connectionOperationStatus
     */
    @javax.annotation.Nullable
    public ConnectionOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final PublicError value) {
        this._error = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ConnectionOperationStatus value) {
        this._status = value;
    }
}

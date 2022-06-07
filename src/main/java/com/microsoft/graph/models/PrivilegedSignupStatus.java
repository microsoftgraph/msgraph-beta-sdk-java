package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of privilegedSignupStatus entities. */
public class PrivilegedSignupStatus extends Entity implements Parsable {
    /** The isRegistered property */
    private Boolean _isRegistered;
    /** The status property */
    private SetupStatus _status;
    /**
     * Instantiates a new privilegedSignupStatus and sets the default values.
     * @return a void
     */
    public PrivilegedSignupStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedSignupStatus
     */
    @javax.annotation.Nonnull
    public static PrivilegedSignupStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedSignupStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedSignupStatus currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isRegistered", (n) -> { currentObject.setIsRegistered(n.getBooleanValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(SetupStatus.class)); });
        }};
    }
    /**
     * Gets the isRegistered property value. The isRegistered property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRegistered() {
        return this._isRegistered;
    }
    /**
     * Gets the status property value. The status property
     * @return a setupStatus
     */
    @javax.annotation.Nullable
    public SetupStatus getStatus() {
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
        writer.writeBooleanValue("isRegistered", this.getIsRegistered());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the isRegistered property value. The isRegistered property
     * @param value Value to set for the isRegistered property.
     * @return a void
     */
    public void setIsRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isRegistered = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final SetupStatus value) {
        this._status = value;
    }
}

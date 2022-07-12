package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceRestrictionAction extends DlpActionInfo implements Parsable {
    /** The message property */
    private String _message;
    /** The restrictionAction property */
    private RestrictionAction _restrictionAction;
    /** The triggers property */
    private java.util.List<String> _triggers;
    /**
     * Instantiates a new DeviceRestrictionAction and sets the default values.
     * @return a void
     */
    public DeviceRestrictionAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceRestrictionAction
     */
    @javax.annotation.Nonnull
    public static DeviceRestrictionAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceRestrictionAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceRestrictionAction currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("restrictionAction", (n) -> { currentObject.setRestrictionAction(n.getEnumValue(RestrictionAction.class)); });
            this.put("triggers", (n) -> { currentObject.setTriggers(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the restrictionAction property value. The restrictionAction property
     * @return a restrictionAction
     */
    @javax.annotation.Nullable
    public RestrictionAction getRestrictionAction() {
        return this._restrictionAction;
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTriggers() {
        return this._triggers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("restrictionAction", this.getRestrictionAction());
        writer.writeCollectionOfPrimitiveValues("triggers", this.getTriggers());
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the restrictionAction property value. The restrictionAction property
     * @param value Value to set for the restrictionAction property.
     * @return a void
     */
    public void setRestrictionAction(@javax.annotation.Nullable final RestrictionAction value) {
        this._restrictionAction = value;
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     * @return a void
     */
    public void setTriggers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._triggers = value;
    }
}

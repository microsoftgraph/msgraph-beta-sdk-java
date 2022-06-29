package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WellKnownTaskList extends BaseTaskList implements Parsable {
    /** Property indicating the list name if the given list is a well-known list.. The possible values are: none, defaultList, flaggedEmails, unknownFutureValue. */
    private WellKnownListName_v2 _wellKnownListName;
    /**
     * Instantiates a new WellKnownTaskList and sets the default values.
     * @return a void
     */
    public WellKnownTaskList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WellKnownTaskList
     */
    @javax.annotation.Nonnull
    public static WellKnownTaskList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WellKnownTaskList();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WellKnownTaskList currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("wellKnownListName", (n) -> { currentObject.setWellKnownListName(n.getEnumValue(WellKnownListName_v2.class)); });
        }};
    }
    /**
     * Gets the wellKnownListName property value. Property indicating the list name if the given list is a well-known list.. The possible values are: none, defaultList, flaggedEmails, unknownFutureValue.
     * @return a wellKnownListName_v2
     */
    @javax.annotation.Nullable
    public WellKnownListName_v2 getWellKnownListName() {
        return this._wellKnownListName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("wellKnownListName", this.getWellKnownListName());
    }
    /**
     * Sets the wellKnownListName property value. Property indicating the list name if the given list is a well-known list.. The possible values are: none, defaultList, flaggedEmails, unknownFutureValue.
     * @param value Value to set for the wellKnownListName property.
     * @return a void
     */
    public void setWellKnownListName(@javax.annotation.Nullable final WellKnownListName_v2 value) {
        this._wellKnownListName = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationValueList extends GroupPolicyPresentationValue implements Parsable {
    /** A list of pairs for the associated presentation. */
    private java.util.List<KeyValuePair> _values;
    /**
     * Instantiates a new GroupPolicyPresentationValueList and sets the default values.
     * @return a void
     */
    public GroupPolicyPresentationValueList() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationValueList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationValueList
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationValueList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationValueList();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationValueList currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("values", (n) -> { currentObject.setValues(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the values property value. A list of pairs for the associated presentation.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("values", this.getValues());
    }
    /**
     * Sets the values property value. A list of pairs for the associated presentation.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._values = value;
    }
}

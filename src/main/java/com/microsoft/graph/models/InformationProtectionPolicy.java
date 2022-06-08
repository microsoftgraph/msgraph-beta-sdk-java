package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to group. */
public class InformationProtectionPolicy extends Entity implements Parsable {
    /** The labels property */
    private java.util.List<InformationProtectionLabel> _labels;
    /**
     * Instantiates a new informationProtectionPolicy and sets the default values.
     * @return a void
     */
    public InformationProtectionPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionPolicy
     */
    @javax.annotation.Nonnull
    public static InformationProtectionPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtectionPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("labels", (n) -> { currentObject.setLabels(n.getCollectionOfObjectValues(InformationProtectionLabel::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the labels property value. The labels property
     * @return a informationProtectionLabel
     */
    @javax.annotation.Nullable
    public java.util.List<InformationProtectionLabel> getLabels() {
        return this._labels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    public void setLabels(@javax.annotation.Nullable final java.util.List<InformationProtectionLabel> value) {
        this._labels = value;
    }
}

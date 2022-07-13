package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AddHeader extends MarkContent implements Parsable {
    /** The alignment property */
    private Alignment _alignment;
    /** The margin property */
    private Integer _margin;
    /**
     * Instantiates a new AddHeader and sets the default values.
     * @return a void
     */
    public AddHeader() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddHeader
     */
    @javax.annotation.Nonnull
    public static AddHeader createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddHeader();
    }
    /**
     * Gets the alignment property value. The alignment property
     * @return a alignment
     */
    @javax.annotation.Nullable
    public Alignment getAlignment() {
        return this._alignment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddHeader currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alignment", (n) -> { currentObject.setAlignment(n.getEnumValue(Alignment.class)); });
            this.put("margin", (n) -> { currentObject.setMargin(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the margin property value. The margin property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMargin() {
        return this._margin;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("alignment", this.getAlignment());
        writer.writeIntegerValue("margin", this.getMargin());
    }
    /**
     * Sets the alignment property value. The alignment property
     * @param value Value to set for the alignment property.
     * @return a void
     */
    public void setAlignment(@javax.annotation.Nullable final Alignment value) {
        this._alignment = value;
    }
    /**
     * Sets the margin property value. The margin property
     * @param value Value to set for the margin property.
     * @return a void
     */
    public void setMargin(@javax.annotation.Nullable final Integer value) {
        this._margin = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Presentation extends Entity implements Parsable {
    /** The comments property */
    private java.util.List<DocumentComment> _comments;
    /**
     * Instantiates a new Presentation and sets the default values.
     * @return a void
     */
    public Presentation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Presentation
     */
    @javax.annotation.Nonnull
    public static Presentation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Presentation();
    }
    /**
     * Gets the comments property value. The comments property
     * @return a documentComment
     */
    @javax.annotation.Nullable
    public java.util.List<DocumentComment> getComments() {
        return this._comments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Presentation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("comments", (n) -> { currentObject.setComments(n.getCollectionOfObjectValues(DocumentComment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("comments", this.getComments());
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     * @return a void
     */
    public void setComments(@javax.annotation.Nullable final java.util.List<DocumentComment> value) {
        this._comments = value;
    }
}

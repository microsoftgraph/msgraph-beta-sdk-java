package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AddToReviewSetOperation extends CaseOperation implements Parsable {
    /** The review set to which items matching the source collection query are added to. */
    private ReviewSet _reviewSet;
    /** The sourceCollection that items are being added from. */
    private SourceCollection _sourceCollection;
    /**
     * Instantiates a new addToReviewSetOperation and sets the default values.
     * @return a void
     */
    public AddToReviewSetOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addToReviewSetOperation
     */
    @javax.annotation.Nonnull
    public static AddToReviewSetOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddToReviewSetOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddToReviewSetOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("reviewSet", (n) -> { currentObject.setReviewSet(n.getObjectValue(ReviewSet::createFromDiscriminatorValue)); });
            this.put("sourceCollection", (n) -> { currentObject.setSourceCollection(n.getObjectValue(SourceCollection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the reviewSet property value. The review set to which items matching the source collection query are added to.
     * @return a reviewSet
     */
    @javax.annotation.Nullable
    public ReviewSet getReviewSet() {
        return this._reviewSet;
    }
    /**
     * Gets the sourceCollection property value. The sourceCollection that items are being added from.
     * @return a sourceCollection
     */
    @javax.annotation.Nullable
    public SourceCollection getSourceCollection() {
        return this._sourceCollection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("sourceCollection", this.getSourceCollection());
    }
    /**
     * Sets the reviewSet property value. The review set to which items matching the source collection query are added to.
     * @param value Value to set for the reviewSet property.
     * @return a void
     */
    public void setReviewSet(@javax.annotation.Nullable final ReviewSet value) {
        this._reviewSet = value;
    }
    /**
     * Sets the sourceCollection property value. The sourceCollection that items are being added from.
     * @param value Value to set for the sourceCollection property.
     * @return a void
     */
    public void setSourceCollection(@javax.annotation.Nullable final SourceCollection value) {
        this._sourceCollection = value;
    }
}

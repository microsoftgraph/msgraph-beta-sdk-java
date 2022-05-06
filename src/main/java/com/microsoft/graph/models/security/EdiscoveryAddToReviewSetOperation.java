package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryAddToReviewSetOperation extends CaseOperation implements Parsable {
    /** The reviewSet property  */
    private EdiscoveryReviewSet _reviewSet;
    /** The search property  */
    private EdiscoverySearch _search;
    /**
     * Instantiates a new ediscoveryAddToReviewSetOperation and sets the default values.
     * @return a void
     */
    public EdiscoveryAddToReviewSetOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryAddToReviewSetOperation
     */
    @javax.annotation.Nonnull
    public static EdiscoveryAddToReviewSetOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryAddToReviewSetOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryAddToReviewSetOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("reviewSet", (n) -> { currentObject.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
            this.put("search", (n) -> { currentObject.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the reviewSet property value. The reviewSet property
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this._reviewSet;
    }
    /**
     * Gets the search property value. The search property
     * @return a ediscoverySearch
     */
    @javax.annotation.Nullable
    public EdiscoverySearch getSearch() {
        return this._search;
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
        writer.writeObjectValue("search", this.getSearch());
    }
    /**
     * Sets the reviewSet property value. The reviewSet property
     * @param value Value to set for the reviewSet property.
     * @return a void
     */
    public void setReviewSet(@javax.annotation.Nullable final EdiscoveryReviewSet value) {
        this._reviewSet = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     * @return a void
     */
    public void setSearch(@javax.annotation.Nullable final EdiscoverySearch value) {
        this._search = value;
    }
}

package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class DispositionReviewStage extends Entity implements Parsable {
    /** Name representing each stage within a collection. */
    private String _name;
    /** A collection of reviewers at each stage. */
    private java.util.List<String> _reviewersEmailAddresses;
    /** The sequence number for each stage of the disposition review. */
    private Integer _stageNumber;
    /**
     * Instantiates a new dispositionReviewStage and sets the default values.
     * @return a void
     */
    public DispositionReviewStage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dispositionReviewStage
     */
    @javax.annotation.Nonnull
    public static DispositionReviewStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispositionReviewStage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DispositionReviewStage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("reviewersEmailAddresses", (n) -> { currentObject.setReviewersEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("stageNumber", (n) -> { currentObject.setStageNumber(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the name property value. Name representing each stage within a collection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the reviewersEmailAddresses property value. A collection of reviewers at each stage.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReviewersEmailAddresses() {
        return this._reviewersEmailAddresses;
    }
    /**
     * Gets the stageNumber property value. The sequence number for each stage of the disposition review.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStageNumber() {
        return this._stageNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("reviewersEmailAddresses", this.getReviewersEmailAddresses());
        writer.writeIntegerValue("stageNumber", this.getStageNumber());
    }
    /**
     * Sets the name property value. Name representing each stage within a collection.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the reviewersEmailAddresses property value. A collection of reviewers at each stage.
     * @param value Value to set for the reviewersEmailAddresses property.
     * @return a void
     */
    public void setReviewersEmailAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._reviewersEmailAddresses = value;
    }
    /**
     * Sets the stageNumber property value. The sequence number for each stage of the disposition review.
     * @param value Value to set for the stageNumber property.
     * @return a void
     */
    public void setStageNumber(@javax.annotation.Nullable final Integer value) {
        this._stageNumber = value;
    }
}

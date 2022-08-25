package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class Approval extends Entity implements Parsable {
    /** The steps property */
    private java.util.List<ApprovalStep> _steps;
    /**
     * Instantiates a new approval and sets the default values.
     * @return a void
     */
    public Approval() {
        super();
        this.setOdataType("#microsoft.graph.approval");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approval
     */
    @javax.annotation.Nonnull
    public static Approval createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Approval();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Approval currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("steps", (n) -> { currentObject.setSteps(n.getCollectionOfObjectValues(ApprovalStep::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the steps property value. The steps property
     * @return a approvalStep
     */
    @javax.annotation.Nullable
    public java.util.List<ApprovalStep> getSteps() {
        return this._steps;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("steps", this.getSteps());
    }
    /**
     * Sets the steps property value. The steps property
     * @param value Value to set for the steps property.
     * @return a void
     */
    public void setSteps(@javax.annotation.Nullable final java.util.List<ApprovalStep> value) {
        this._steps = value;
    }
}

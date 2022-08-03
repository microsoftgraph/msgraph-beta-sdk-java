package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class PlannerDelta extends Entity implements Parsable {
    /**
     * Instantiates a new plannerDelta and sets the default values.
     * @return a void
     */
    public PlannerDelta() {
        super();
        this.setOdataType("#microsoft.graph.plannerDelta");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerDelta
     */
    @javax.annotation.Nonnull
    public static PlannerDelta createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.plannerAssignedToTaskBoardTaskFormat": return new PlannerAssignedToTaskBoardTaskFormat();
                case "#microsoft.graph.plannerBucket": return new PlannerBucket();
                case "#microsoft.graph.plannerBucketTaskBoardTaskFormat": return new PlannerBucketTaskBoardTaskFormat();
                case "#microsoft.graph.plannerPlan": return new PlannerPlan();
                case "#microsoft.graph.plannerPlanDetails": return new PlannerPlanDetails();
                case "#microsoft.graph.plannerProgressTaskBoardTaskFormat": return new PlannerProgressTaskBoardTaskFormat();
                case "#microsoft.graph.plannerTask": return new PlannerTask();
                case "#microsoft.graph.plannerTaskDetails": return new PlannerTaskDetails();
                case "#microsoft.graph.plannerUser": return new PlannerUser();
            }
        }
        return new PlannerDelta();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerDelta currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
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
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerDelta extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlannerDelta} and sets the default values.
     */
    public PlannerDelta() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerDelta}
     */
    @jakarta.annotation.Nonnull
    public static PlannerDelta createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.businessScenarioTask": return new BusinessScenarioTask();
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
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}

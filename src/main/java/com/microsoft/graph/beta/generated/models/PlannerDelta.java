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
                case "#microsoft.graph.bucket": return new Bucket();
                case "#microsoft.graph.businessScenarioTask": return new BusinessScenarioTask();
                case "#microsoft.graph.categoryDefinition": return new CategoryDefinition();
                case "#microsoft.graph.checklistItemV4": return new ChecklistItemV4();
                case "#microsoft.graph.contentLink": return new ContentLink();
                case "#microsoft.graph.customChoiceOption": return new CustomChoiceOption();
                case "#microsoft.graph.customFieldDefinition": return new CustomFieldDefinition();
                case "#microsoft.graph.customFieldValue": return new CustomFieldValue();
                case "#microsoft.graph.dependency": return new Dependency();
                case "#microsoft.graph.goal": return new Goal();
                case "#microsoft.graph.historyItem": return new HistoryItem();
                case "#microsoft.graph.plan": return new Plan();
                case "#microsoft.graph.planContextLink": return new PlanContextLink();
                case "#microsoft.graph.plannerAssignedToTaskBoardTaskFormat": return new PlannerAssignedToTaskBoardTaskFormat();
                case "#microsoft.graph.plannerBucket": return new PlannerBucket();
                case "#microsoft.graph.plannerBucketTaskBoardTaskFormat": return new PlannerBucketTaskBoardTaskFormat();
                case "#microsoft.graph.plannerChatMessage": return new PlannerChatMessage();
                case "#microsoft.graph.plannerGoal": return new PlannerGoal();
                case "#microsoft.graph.plannerHistoryItem": return new PlannerHistoryItem();
                case "#microsoft.graph.plannerPlan": return new PlannerPlan();
                case "#microsoft.graph.plannerPlanDetails": return new PlannerPlanDetails();
                case "#microsoft.graph.plannerProgressTaskBoardTaskFormat": return new PlannerProgressTaskBoardTaskFormat();
                case "#microsoft.graph.plannerTask": return new PlannerTask();
                case "#microsoft.graph.plannerTaskDetails": return new PlannerTaskDetails();
                case "#microsoft.graph.plannerUser": return new PlannerUser();
                case "#microsoft.graph.task": return new Task();
                case "#microsoft.graph.taskHistoryItem": return new TaskHistoryItem();
                case "#microsoft.graph.userAssignment": return new UserAssignment();
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

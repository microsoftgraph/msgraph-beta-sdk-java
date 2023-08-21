package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetectionRule extends ProtectionRule implements Parsable {
    /**
     * The detectionAction property
     */
    private DetectionAction detectionAction;
    /**
     * The lastRunDetails property
     */
    private RunDetails lastRunDetails;
    /**
     * The queryCondition property
     */
    private QueryCondition queryCondition;
    /**
     * The schedule property
     */
    private RuleSchedule schedule;
    /**
     * Instantiates a new detectionRule and sets the default values.
     */
    public DetectionRule() {
        super();
        this.setOdataType("#microsoft.graph.security.detectionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a detectionRule
     */
    @jakarta.annotation.Nonnull
    public static DetectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetectionRule();
    }
    /**
     * Gets the detectionAction property value. The detectionAction property
     * @return a detectionAction
     */
    @jakarta.annotation.Nullable
    public DetectionAction getDetectionAction() {
        return this.detectionAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionAction", (n) -> { this.setDetectionAction(n.getObjectValue(DetectionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("lastRunDetails", (n) -> { this.setLastRunDetails(n.getObjectValue(RunDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("queryCondition", (n) -> { this.setQueryCondition(n.getObjectValue(QueryCondition::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(RuleSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastRunDetails property value. The lastRunDetails property
     * @return a runDetails
     */
    @jakarta.annotation.Nullable
    public RunDetails getLastRunDetails() {
        return this.lastRunDetails;
    }
    /**
     * Gets the queryCondition property value. The queryCondition property
     * @return a queryCondition
     */
    @jakarta.annotation.Nullable
    public QueryCondition getQueryCondition() {
        return this.queryCondition;
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a ruleSchedule
     */
    @jakarta.annotation.Nullable
    public RuleSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("detectionAction", this.getDetectionAction());
        writer.writeObjectValue("lastRunDetails", this.getLastRunDetails());
        writer.writeObjectValue("queryCondition", this.getQueryCondition());
        writer.writeObjectValue("schedule", this.getSchedule());
    }
    /**
     * Sets the detectionAction property value. The detectionAction property
     * @param value Value to set for the detectionAction property.
     */
    public void setDetectionAction(@jakarta.annotation.Nullable final DetectionAction value) {
        this.detectionAction = value;
    }
    /**
     * Sets the lastRunDetails property value. The lastRunDetails property
     * @param value Value to set for the lastRunDetails property.
     */
    public void setLastRunDetails(@jakarta.annotation.Nullable final RunDetails value) {
        this.lastRunDetails = value;
    }
    /**
     * Sets the queryCondition property value. The queryCondition property
     * @param value Value to set for the queryCondition property.
     */
    public void setQueryCondition(@jakarta.annotation.Nullable final QueryCondition value) {
        this.queryCondition = value;
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final RuleSchedule value) {
        this.schedule = value;
    }
}

package com.microsoft.graph.governanceroleassignmentrequests.item.updaterequest;

import com.microsoft.graph.models.GovernanceSchedule;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateRequestPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignmentState property
     */
    private String assignmentState;
    /**
     * The decision property
     */
    private String decision;
    /**
     * The reason property
     */
    private String reason;
    /**
     * The schedule property
     */
    private GovernanceSchedule schedule;
    /**
     * Instantiates a new updateRequestPostRequestBody and sets the default values.
     */
    public UpdateRequestPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateRequestPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateRequestPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRequestPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the assignmentState property value. The assignmentState property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentState() {
        return this.assignmentState;
    }
    /**
     * Gets the decision property value. The decision property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDecision() {
        return this.decision;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assignmentState", (n) -> { this.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("decision", (n) -> { this.setDecision(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a governanceSchedule
     */
    @jakarta.annotation.Nullable
    public GovernanceSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeStringValue("decision", this.getDecision());
        writer.writeStringValue("reason", this.getReason());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentState property value. The assignmentState property
     * @param value Value to set for the assignmentState property.
     */
    public void setAssignmentState(@jakarta.annotation.Nullable final String value) {
        this.assignmentState = value;
    }
    /**
     * Sets the decision property value. The decision property
     * @param value Value to set for the decision property.
     */
    public void setDecision(@jakarta.annotation.Nullable final String value) {
        this.decision = value;
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final GovernanceSchedule value) {
        this.schedule = value;
    }
}

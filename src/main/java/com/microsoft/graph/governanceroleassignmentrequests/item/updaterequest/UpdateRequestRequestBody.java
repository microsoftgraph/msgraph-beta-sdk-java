package microsoft.graph.governanceroleassignmentrequests.item.updaterequest;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.GovernanceSchedule;
/** Provides operations to call the updateRequest method. */
public class UpdateRequestRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignmentState property */
    private String _assignmentState;
    /** The decision property */
    private String _decision;
    /** The reason property */
    private String _reason;
    /** The schedule property */
    private GovernanceSchedule _schedule;
    /**
     * Instantiates a new updateRequestRequestBody and sets the default values.
     * @return a void
     */
    public UpdateRequestRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateRequestRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateRequestRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRequestRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the assignmentState property value. The assignmentState property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentState() {
        return this._assignmentState;
    }
    /**
     * Gets the decision property value. The decision property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecision() {
        return this._decision;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateRequestRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("assignmentState", (n) -> { currentObject.setAssignmentState(n.getStringValue()); });
            this.put("decision", (n) -> { currentObject.setDecision(n.getStringValue()); });
            this.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the reason property value. The reason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a governanceSchedule
     */
    @javax.annotation.Nullable
    public GovernanceSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeStringValue("decision", this.getDecision());
        writer.writeStringValue("reason", this.getReason());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignmentState property value. The assignmentState property
     * @param value Value to set for the assignmentState property.
     * @return a void
     */
    public void setAssignmentState(@javax.annotation.Nullable final String value) {
        this._assignmentState = value;
    }
    /**
     * Sets the decision property value. The decision property
     * @param value Value to set for the decision property.
     * @return a void
     */
    public void setDecision(@javax.annotation.Nullable final String value) {
        this._decision = value;
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final GovernanceSchedule value) {
        this._schedule = value;
    }
}

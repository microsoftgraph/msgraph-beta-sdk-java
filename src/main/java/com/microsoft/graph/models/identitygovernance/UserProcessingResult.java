package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class UserProcessingResult extends Entity implements Parsable {
    /** The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed. Supports $filter(lt, gt) and $orderby. */
    private OffsetDateTime _completedDateTime;
    /** The number of tasks that failed in the workflow execution. */
    private Integer _failedTasksCount;
    /** The processingStatus property */
    private LifecycleWorkflowProcessingStatus _processingStatus;
    /** The date time that the workflow is scheduled to be executed for a user. */
    private OffsetDateTime _scheduledDateTime;
    /** The date time that the workflow execution started. Value is null if the workflow execution has not started. Supports $filter(lt, gt) and $orderby. */
    private OffsetDateTime _startedDateTime;
    /** The subject property */
    private User _subject;
    /** The associated individual task execution. */
    private java.util.List<TaskProcessingResult> _taskProcessingResults;
    /** The total number of tasks that in the workflow execution. */
    private Integer _totalTasksCount;
    /** The total number of unprocessed tasks for the workflow. */
    private Integer _totalUnprocessedTasksCount;
    /** The workflowExecutionType property */
    private WorkflowExecutionType _workflowExecutionType;
    /** The version of the workflow that was executed. */
    private Integer _workflowVersion;
    /**
     * Instantiates a new userProcessingResult and sets the default values.
     * @return a void
     */
    public UserProcessingResult() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.userProcessingResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userProcessingResult
     */
    @javax.annotation.Nonnull
    public static UserProcessingResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserProcessingResult();
    }
    /**
     * Gets the completedDateTime property value. The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed. Supports $filter(lt, gt) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the failedTasksCount property value. The number of tasks that failed in the workflow execution.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedTasksCount() {
        return this._failedTasksCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserProcessingResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("failedTasksCount", (n) -> { currentObject.setFailedTasksCount(n.getIntegerValue()); });
            this.put("processingStatus", (n) -> { currentObject.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
            this.put("scheduledDateTime", (n) -> { currentObject.setScheduledDateTime(n.getOffsetDateTimeValue()); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("taskProcessingResults", (n) -> { currentObject.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
            this.put("totalTasksCount", (n) -> { currentObject.setTotalTasksCount(n.getIntegerValue()); });
            this.put("totalUnprocessedTasksCount", (n) -> { currentObject.setTotalUnprocessedTasksCount(n.getIntegerValue()); });
            this.put("workflowExecutionType", (n) -> { currentObject.setWorkflowExecutionType(n.getEnumValue(WorkflowExecutionType.class)); });
            this.put("workflowVersion", (n) -> { currentObject.setWorkflowVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a lifecycleWorkflowProcessingStatus
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this._processingStatus;
    }
    /**
     * Gets the scheduledDateTime property value. The date time that the workflow is scheduled to be executed for a user.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getScheduledDateTime() {
        return this._scheduledDateTime;
    }
    /**
     * Gets the startedDateTime property value. The date time that the workflow execution started. Value is null if the workflow execution has not started. Supports $filter(lt, gt) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a user
     */
    @javax.annotation.Nullable
    public User getSubject() {
        return this._subject;
    }
    /**
     * Gets the taskProcessingResults property value. The associated individual task execution.
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this._taskProcessingResults;
    }
    /**
     * Gets the totalTasksCount property value. The total number of tasks that in the workflow execution.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalTasksCount() {
        return this._totalTasksCount;
    }
    /**
     * Gets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks for the workflow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUnprocessedTasksCount() {
        return this._totalUnprocessedTasksCount;
    }
    /**
     * Gets the workflowExecutionType property value. The workflowExecutionType property
     * @return a workflowExecutionType
     */
    @javax.annotation.Nullable
    public WorkflowExecutionType getWorkflowExecutionType() {
        return this._workflowExecutionType;
    }
    /**
     * Gets the workflowVersion property value. The version of the workflow that was executed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkflowVersion() {
        return this._workflowVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeIntegerValue("failedTasksCount", this.getFailedTasksCount());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("scheduledDateTime", this.getScheduledDateTime());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
        writer.writeIntegerValue("totalTasksCount", this.getTotalTasksCount());
        writer.writeIntegerValue("totalUnprocessedTasksCount", this.getTotalUnprocessedTasksCount());
        writer.writeEnumValue("workflowExecutionType", this.getWorkflowExecutionType());
        writer.writeIntegerValue("workflowVersion", this.getWorkflowVersion());
    }
    /**
     * Sets the completedDateTime property value. The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed. Supports $filter(lt, gt) and $orderby.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the failedTasksCount property value. The number of tasks that failed in the workflow execution.
     * @param value Value to set for the failedTasksCount property.
     * @return a void
     */
    public void setFailedTasksCount(@javax.annotation.Nullable final Integer value) {
        this._failedTasksCount = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     * @return a void
     */
    public void setProcessingStatus(@javax.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this._processingStatus = value;
    }
    /**
     * Sets the scheduledDateTime property value. The date time that the workflow is scheduled to be executed for a user.
     * @param value Value to set for the scheduledDateTime property.
     * @return a void
     */
    public void setScheduledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._scheduledDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. The date time that the workflow execution started. Value is null if the workflow execution has not started. Supports $filter(lt, gt) and $orderby.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final User value) {
        this._subject = value;
    }
    /**
     * Sets the taskProcessingResults property value. The associated individual task execution.
     * @param value Value to set for the taskProcessingResults property.
     * @return a void
     */
    public void setTaskProcessingResults(@javax.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this._taskProcessingResults = value;
    }
    /**
     * Sets the totalTasksCount property value. The total number of tasks that in the workflow execution.
     * @param value Value to set for the totalTasksCount property.
     * @return a void
     */
    public void setTotalTasksCount(@javax.annotation.Nullable final Integer value) {
        this._totalTasksCount = value;
    }
    /**
     * Sets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks for the workflow.
     * @param value Value to set for the totalUnprocessedTasksCount property.
     * @return a void
     */
    public void setTotalUnprocessedTasksCount(@javax.annotation.Nullable final Integer value) {
        this._totalUnprocessedTasksCount = value;
    }
    /**
     * Sets the workflowExecutionType property value. The workflowExecutionType property
     * @param value Value to set for the workflowExecutionType property.
     * @return a void
     */
    public void setWorkflowExecutionType(@javax.annotation.Nullable final WorkflowExecutionType value) {
        this._workflowExecutionType = value;
    }
    /**
     * Sets the workflowVersion property value. The version of the workflow that was executed.
     * @param value Value to set for the workflowVersion property.
     * @return a void
     */
    public void setWorkflowVersion(@javax.annotation.Nullable final Integer value) {
        this._workflowVersion = value;
    }
}

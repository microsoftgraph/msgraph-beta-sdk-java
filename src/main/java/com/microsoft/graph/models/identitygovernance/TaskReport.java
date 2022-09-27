package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class TaskReport extends Entity implements Parsable {
    /** The date time that the associated run completed. Value is null if the run has not completed. */
    private OffsetDateTime _completedDateTime;
    /** The number of users in the run execution for which the associated task failed. */
    private Integer _failedUsersCount;
    /** The date and time that the task report was last updated. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The processingStatus property */
    private LifecycleWorkflowProcessingStatus _processingStatus;
    /** The unique identifier of the associated run. */
    private String _runId;
    /** The date time that the associated run started. Value is null if the run has not started. */
    private OffsetDateTime _startedDateTime;
    /** The number of users in the run execution for which the associated task succeeded. */
    private Integer _successfulUsersCount;
    /** The task property */
    private Task _task;
    /** The taskDefinition property */
    private TaskDefinition _taskDefinition;
    /** The related lifecycle workflow taskProcessingResults. */
    private java.util.List<TaskProcessingResult> _taskProcessingResults;
    /** The total number of users in the run execution for which the associated task was scheduled to execute. */
    private Integer _totalUsersCount;
    /** The number of users in the run execution for which the associated task is queued, in progress, or canceled. */
    private Integer _unprocessedUsersCount;
    /**
     * Instantiates a new taskReport and sets the default values.
     * @return a void
     */
    public TaskReport() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.taskReport");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskReport
     */
    @javax.annotation.Nonnull
    public static TaskReport createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskReport();
    }
    /**
     * Gets the completedDateTime property value. The date time that the associated run completed. Value is null if the run has not completed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the failedUsersCount property value. The number of users in the run execution for which the associated task failed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUsersCount() {
        return this._failedUsersCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TaskReport currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("failedUsersCount", (n) -> { currentObject.setFailedUsersCount(n.getIntegerValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("processingStatus", (n) -> { currentObject.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
            this.put("runId", (n) -> { currentObject.setRunId(n.getStringValue()); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("successfulUsersCount", (n) -> { currentObject.setSuccessfulUsersCount(n.getIntegerValue()); });
            this.put("task", (n) -> { currentObject.setTask(n.getObjectValue(Task::createFromDiscriminatorValue)); });
            this.put("taskDefinition", (n) -> { currentObject.setTaskDefinition(n.getObjectValue(TaskDefinition::createFromDiscriminatorValue)); });
            this.put("taskProcessingResults", (n) -> { currentObject.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
            this.put("totalUsersCount", (n) -> { currentObject.setTotalUsersCount(n.getIntegerValue()); });
            this.put("unprocessedUsersCount", (n) -> { currentObject.setUnprocessedUsersCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time that the task report was last updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
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
     * Gets the runId property value. The unique identifier of the associated run.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRunId() {
        return this._runId;
    }
    /**
     * Gets the startedDateTime property value. The date time that the associated run started. Value is null if the run has not started.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the successfulUsersCount property value. The number of users in the run execution for which the associated task succeeded.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUsersCount() {
        return this._successfulUsersCount;
    }
    /**
     * Gets the task property value. The task property
     * @return a task
     */
    @javax.annotation.Nullable
    public Task getTask() {
        return this._task;
    }
    /**
     * Gets the taskDefinition property value. The taskDefinition property
     * @return a taskDefinition
     */
    @javax.annotation.Nullable
    public TaskDefinition getTaskDefinition() {
        return this._taskDefinition;
    }
    /**
     * Gets the taskProcessingResults property value. The related lifecycle workflow taskProcessingResults.
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this._taskProcessingResults;
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the run execution for which the associated task was scheduled to execute.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsersCount() {
        return this._totalUsersCount;
    }
    /**
     * Gets the unprocessedUsersCount property value. The number of users in the run execution for which the associated task is queued, in progress, or canceled.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnprocessedUsersCount() {
        return this._unprocessedUsersCount;
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
        writer.writeIntegerValue("failedUsersCount", this.getFailedUsersCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeStringValue("runId", this.getRunId());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeIntegerValue("successfulUsersCount", this.getSuccessfulUsersCount());
        writer.writeObjectValue("task", this.getTask());
        writer.writeObjectValue("taskDefinition", this.getTaskDefinition());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
        writer.writeIntegerValue("totalUsersCount", this.getTotalUsersCount());
        writer.writeIntegerValue("unprocessedUsersCount", this.getUnprocessedUsersCount());
    }
    /**
     * Sets the completedDateTime property value. The date time that the associated run completed. Value is null if the run has not completed.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the failedUsersCount property value. The number of users in the run execution for which the associated task failed.
     * @param value Value to set for the failedUsersCount property.
     * @return a void
     */
    public void setFailedUsersCount(@javax.annotation.Nullable final Integer value) {
        this._failedUsersCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time that the task report was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
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
     * Sets the runId property value. The unique identifier of the associated run.
     * @param value Value to set for the runId property.
     * @return a void
     */
    public void setRunId(@javax.annotation.Nullable final String value) {
        this._runId = value;
    }
    /**
     * Sets the startedDateTime property value. The date time that the associated run started. Value is null if the run has not started.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the successfulUsersCount property value. The number of users in the run execution for which the associated task succeeded.
     * @param value Value to set for the successfulUsersCount property.
     * @return a void
     */
    public void setSuccessfulUsersCount(@javax.annotation.Nullable final Integer value) {
        this._successfulUsersCount = value;
    }
    /**
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     * @return a void
     */
    public void setTask(@javax.annotation.Nullable final Task value) {
        this._task = value;
    }
    /**
     * Sets the taskDefinition property value. The taskDefinition property
     * @param value Value to set for the taskDefinition property.
     * @return a void
     */
    public void setTaskDefinition(@javax.annotation.Nullable final TaskDefinition value) {
        this._taskDefinition = value;
    }
    /**
     * Sets the taskProcessingResults property value. The related lifecycle workflow taskProcessingResults.
     * @param value Value to set for the taskProcessingResults property.
     * @return a void
     */
    public void setTaskProcessingResults(@javax.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this._taskProcessingResults = value;
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the run execution for which the associated task was scheduled to execute.
     * @param value Value to set for the totalUsersCount property.
     * @return a void
     */
    public void setTotalUsersCount(@javax.annotation.Nullable final Integer value) {
        this._totalUsersCount = value;
    }
    /**
     * Sets the unprocessedUsersCount property value. The number of users in the run execution for which the associated task is queued, in progress, or canceled.
     * @param value Value to set for the unprocessedUsersCount property.
     * @return a void
     */
    public void setUnprocessedUsersCount(@javax.annotation.Nullable final Integer value) {
        this._unprocessedUsersCount = value;
    }
}

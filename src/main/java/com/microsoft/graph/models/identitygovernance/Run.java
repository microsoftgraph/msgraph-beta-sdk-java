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
public class Run extends Entity implements Parsable {
    /** The completedDateTime property */
    private OffsetDateTime _completedDateTime;
    /** The failedTasksCount property */
    private Integer _failedTasksCount;
    /** The failedUsersCount property */
    private Integer _failedUsersCount;
    /** The lastUpdatedDateTime property */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The processingStatus property */
    private LifecycleWorkflowProcessingStatus _processingStatus;
    /** The scheduledDateTime property */
    private OffsetDateTime _scheduledDateTime;
    /** The startedDateTime property */
    private OffsetDateTime _startedDateTime;
    /** The successfulUsersCount property */
    private Integer _successfulUsersCount;
    /** The taskProcessingResults property */
    private java.util.List<TaskProcessingResult> _taskProcessingResults;
    /** The totalTasksCount property */
    private Integer _totalTasksCount;
    /** The totalUnprocessedTasksCount property */
    private Integer _totalUnprocessedTasksCount;
    /** The totalUsersCount property */
    private Integer _totalUsersCount;
    /** The userProcessingResults property */
    private java.util.List<UserProcessingResult> _userProcessingResults;
    /** The workflowExecutionType property */
    private WorkflowExecutionType _workflowExecutionType;
    /**
     * Instantiates a new Run and sets the default values.
     * @return a void
     */
    public Run() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.run");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Run
     */
    @javax.annotation.Nonnull
    public static Run createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Run();
    }
    /**
     * Gets the completedDateTime property value. The completedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the failedTasksCount property value. The failedTasksCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedTasksCount() {
        return this._failedTasksCount;
    }
    /**
     * Gets the failedUsersCount property value. The failedUsersCount property
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
        final Run currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("failedTasksCount", (n) -> { currentObject.setFailedTasksCount(n.getIntegerValue()); });
            this.put("failedUsersCount", (n) -> { currentObject.setFailedUsersCount(n.getIntegerValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("processingStatus", (n) -> { currentObject.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
            this.put("scheduledDateTime", (n) -> { currentObject.setScheduledDateTime(n.getOffsetDateTimeValue()); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("successfulUsersCount", (n) -> { currentObject.setSuccessfulUsersCount(n.getIntegerValue()); });
            this.put("taskProcessingResults", (n) -> { currentObject.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
            this.put("totalTasksCount", (n) -> { currentObject.setTotalTasksCount(n.getIntegerValue()); });
            this.put("totalUnprocessedTasksCount", (n) -> { currentObject.setTotalUnprocessedTasksCount(n.getIntegerValue()); });
            this.put("totalUsersCount", (n) -> { currentObject.setTotalUsersCount(n.getIntegerValue()); });
            this.put("userProcessingResults", (n) -> { currentObject.setUserProcessingResults(n.getCollectionOfObjectValues(UserProcessingResult::createFromDiscriminatorValue)); });
            this.put("workflowExecutionType", (n) -> { currentObject.setWorkflowExecutionType(n.getEnumValue(WorkflowExecutionType.class)); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
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
     * Gets the scheduledDateTime property value. The scheduledDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getScheduledDateTime() {
        return this._scheduledDateTime;
    }
    /**
     * Gets the startedDateTime property value. The startedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the successfulUsersCount property value. The successfulUsersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUsersCount() {
        return this._successfulUsersCount;
    }
    /**
     * Gets the taskProcessingResults property value. The taskProcessingResults property
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this._taskProcessingResults;
    }
    /**
     * Gets the totalTasksCount property value. The totalTasksCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalTasksCount() {
        return this._totalTasksCount;
    }
    /**
     * Gets the totalUnprocessedTasksCount property value. The totalUnprocessedTasksCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUnprocessedTasksCount() {
        return this._totalUnprocessedTasksCount;
    }
    /**
     * Gets the totalUsersCount property value. The totalUsersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsersCount() {
        return this._totalUsersCount;
    }
    /**
     * Gets the userProcessingResults property value. The userProcessingResults property
     * @return a userProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<UserProcessingResult> getUserProcessingResults() {
        return this._userProcessingResults;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeIntegerValue("failedTasksCount", this.getFailedTasksCount());
        writer.writeIntegerValue("failedUsersCount", this.getFailedUsersCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("scheduledDateTime", this.getScheduledDateTime());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeIntegerValue("successfulUsersCount", this.getSuccessfulUsersCount());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
        writer.writeIntegerValue("totalTasksCount", this.getTotalTasksCount());
        writer.writeIntegerValue("totalUnprocessedTasksCount", this.getTotalUnprocessedTasksCount());
        writer.writeIntegerValue("totalUsersCount", this.getTotalUsersCount());
        writer.writeCollectionOfObjectValues("userProcessingResults", this.getUserProcessingResults());
        writer.writeEnumValue("workflowExecutionType", this.getWorkflowExecutionType());
    }
    /**
     * Sets the completedDateTime property value. The completedDateTime property
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the failedTasksCount property value. The failedTasksCount property
     * @param value Value to set for the failedTasksCount property.
     * @return a void
     */
    public void setFailedTasksCount(@javax.annotation.Nullable final Integer value) {
        this._failedTasksCount = value;
    }
    /**
     * Sets the failedUsersCount property value. The failedUsersCount property
     * @param value Value to set for the failedUsersCount property.
     * @return a void
     */
    public void setFailedUsersCount(@javax.annotation.Nullable final Integer value) {
        this._failedUsersCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
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
     * Sets the scheduledDateTime property value. The scheduledDateTime property
     * @param value Value to set for the scheduledDateTime property.
     * @return a void
     */
    public void setScheduledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._scheduledDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. The startedDateTime property
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the successfulUsersCount property value. The successfulUsersCount property
     * @param value Value to set for the successfulUsersCount property.
     * @return a void
     */
    public void setSuccessfulUsersCount(@javax.annotation.Nullable final Integer value) {
        this._successfulUsersCount = value;
    }
    /**
     * Sets the taskProcessingResults property value. The taskProcessingResults property
     * @param value Value to set for the taskProcessingResults property.
     * @return a void
     */
    public void setTaskProcessingResults(@javax.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this._taskProcessingResults = value;
    }
    /**
     * Sets the totalTasksCount property value. The totalTasksCount property
     * @param value Value to set for the totalTasksCount property.
     * @return a void
     */
    public void setTotalTasksCount(@javax.annotation.Nullable final Integer value) {
        this._totalTasksCount = value;
    }
    /**
     * Sets the totalUnprocessedTasksCount property value. The totalUnprocessedTasksCount property
     * @param value Value to set for the totalUnprocessedTasksCount property.
     * @return a void
     */
    public void setTotalUnprocessedTasksCount(@javax.annotation.Nullable final Integer value) {
        this._totalUnprocessedTasksCount = value;
    }
    /**
     * Sets the totalUsersCount property value. The totalUsersCount property
     * @param value Value to set for the totalUsersCount property.
     * @return a void
     */
    public void setTotalUsersCount(@javax.annotation.Nullable final Integer value) {
        this._totalUsersCount = value;
    }
    /**
     * Sets the userProcessingResults property value. The userProcessingResults property
     * @param value Value to set for the userProcessingResults property.
     * @return a void
     */
    public void setUserProcessingResults(@javax.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this._userProcessingResults = value;
    }
    /**
     * Sets the workflowExecutionType property value. The workflowExecutionType property
     * @param value Value to set for the workflowExecutionType property.
     * @return a void
     */
    public void setWorkflowExecutionType(@javax.annotation.Nullable final WorkflowExecutionType value) {
        this._workflowExecutionType = value;
    }
}

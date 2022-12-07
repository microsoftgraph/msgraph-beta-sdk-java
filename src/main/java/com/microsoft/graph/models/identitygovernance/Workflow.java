package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Workflow extends WorkflowBase implements Parsable {
    /** When the workflow was deleted.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby. */
    private OffsetDateTime _deletedDateTime;
    /** The unique identifier of the Azure AD identity that last modified the workflow object. */
    private java.util.List<User> _executionScope;
    /** Identifier used for individually addressing a specific workflow.Supports $filter(eq, ne) and $orderby. */
    private String _id;
    /** The date time when the workflow is expected to run next based on the schedule interval, if there are any users matching the execution conditions. Supports $filter(lt,gt) and $orderBy. */
    private OffsetDateTime _nextScheduleRunDateTime;
    /** The runs property */
    private java.util.List<Run> _runs;
    /** Represents the aggregation of task execution data for tasks within a workflow object. */
    private java.util.List<TaskReport> _taskReports;
    /** The userProcessingResults property */
    private java.util.List<UserProcessingResult> _userProcessingResults;
    /** The current version number of the workflow. Value is 1 when the workflow is first created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby. */
    private Integer _version;
    /** The workflow versions that are available. */
    private java.util.List<WorkflowVersion> _versions;
    /**
     * Instantiates a new Workflow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Workflow() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.workflow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Workflow
     */
    @javax.annotation.Nonnull
    public static Workflow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workflow();
    }
    /**
     * Gets the deletedDateTime property value. When the workflow was deleted.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this._deletedDateTime;
    }
    /**
     * Gets the executionScope property value. The unique identifier of the Azure AD identity that last modified the workflow object.
     * @return a user
     */
    @javax.annotation.Nullable
    public java.util.List<User> getExecutionScope() {
        return this._executionScope;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("executionScope", (n) -> { this.setExecutionScope(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("nextScheduleRunDateTime", (n) -> { this.setNextScheduleRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("runs", (n) -> { this.setRuns(n.getCollectionOfObjectValues(Run::createFromDiscriminatorValue)); });
        deserializerMap.put("taskReports", (n) -> { this.setTaskReports(n.getCollectionOfObjectValues(TaskReport::createFromDiscriminatorValue)); });
        deserializerMap.put("userProcessingResults", (n) -> { this.setUserProcessingResults(n.getCollectionOfObjectValues(UserProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(WorkflowVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Identifier used for individually addressing a specific workflow.Supports $filter(eq, ne) and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the nextScheduleRunDateTime property value. The date time when the workflow is expected to run next based on the schedule interval, if there are any users matching the execution conditions. Supports $filter(lt,gt) and $orderBy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getNextScheduleRunDateTime() {
        return this._nextScheduleRunDateTime;
    }
    /**
     * Gets the runs property value. The runs property
     * @return a run
     */
    @javax.annotation.Nullable
    public java.util.List<Run> getRuns() {
        return this._runs;
    }
    /**
     * Gets the taskReports property value. Represents the aggregation of task execution data for tasks within a workflow object.
     * @return a taskReport
     */
    @javax.annotation.Nullable
    public java.util.List<TaskReport> getTaskReports() {
        return this._taskReports;
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
     * Gets the version property value. The current version number of the workflow. Value is 1 when the workflow is first created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Gets the versions property value. The workflow versions that are available.
     * @return a workflowVersion
     */
    @javax.annotation.Nullable
    public java.util.List<WorkflowVersion> getVersions() {
        return this._versions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeCollectionOfObjectValues("executionScope", this.getExecutionScope());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("nextScheduleRunDateTime", this.getNextScheduleRunDateTime());
        writer.writeCollectionOfObjectValues("runs", this.getRuns());
        writer.writeCollectionOfObjectValues("taskReports", this.getTaskReports());
        writer.writeCollectionOfObjectValues("userProcessingResults", this.getUserProcessingResults());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the deletedDateTime property value. When the workflow was deleted.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deletedDateTime = value;
    }
    /**
     * Sets the executionScope property value. The unique identifier of the Azure AD identity that last modified the workflow object.
     * @param value Value to set for the executionScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExecutionScope(@javax.annotation.Nullable final java.util.List<User> value) {
        this._executionScope = value;
    }
    /**
     * Sets the id property value. Identifier used for individually addressing a specific workflow.Supports $filter(eq, ne) and $orderby.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the nextScheduleRunDateTime property value. The date time when the workflow is expected to run next based on the schedule interval, if there are any users matching the execution conditions. Supports $filter(lt,gt) and $orderBy.
     * @param value Value to set for the nextScheduleRunDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextScheduleRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._nextScheduleRunDateTime = value;
    }
    /**
     * Sets the runs property value. The runs property
     * @param value Value to set for the runs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuns(@javax.annotation.Nullable final java.util.List<Run> value) {
        this._runs = value;
    }
    /**
     * Sets the taskReports property value. Represents the aggregation of task execution data for tasks within a workflow object.
     * @param value Value to set for the taskReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskReports(@javax.annotation.Nullable final java.util.List<TaskReport> value) {
        this._taskReports = value;
    }
    /**
     * Sets the userProcessingResults property value. The userProcessingResults property
     * @param value Value to set for the userProcessingResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserProcessingResults(@javax.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this._userProcessingResults = value;
    }
    /**
     * Sets the version property value. The current version number of the workflow. Value is 1 when the workflow is first created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
    /**
     * Sets the versions property value. The workflow versions that are available.
     * @param value Value to set for the versions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersions(@javax.annotation.Nullable final java.util.List<WorkflowVersion> value) {
        this._versions = value;
    }
}

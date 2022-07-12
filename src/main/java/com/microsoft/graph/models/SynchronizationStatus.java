package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The code property */
    private SynchronizationStatusCode _code;
    /** Number of consecutive times this job failed. */
    private Long _countSuccessiveCompleteFailures;
    /** true if the job's escrows (object-level errors) were pruned during initial synchronization. Escrows can be pruned if during the initial synchronization, you reach the threshold of errors that would normally put the job in quarantine. Instead of going into quarantine, the synchronization process clears the job's errors and continues until the initial synchronization is completed. When the initial synchronization is completed, the job will pause and wait for the customer to clean up the errors. */
    private Boolean _escrowsPruned;
    /** Details of the last execution of the job. */
    private SynchronizationTaskExecution _lastExecution;
    /** Details of the last execution of this job, which didn't have any errors. */
    private SynchronizationTaskExecution _lastSuccessfulExecution;
    /** Details of the last execution of the job, which exported objects into the target directory. */
    private SynchronizationTaskExecution _lastSuccessfulExecutionWithExports;
    /** Details of the progress of a job toward completion. */
    private java.util.List<SynchronizationProgress> _progress;
    /** If job is in quarantine, quarantine details. */
    private SynchronizationQuarantine _quarantine;
    /** The time when steady state (no more changes to the process) was first achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _steadyStateFirstAchievedTime;
    /** The time when steady state (no more changes to the process) was last achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _steadyStateLastAchievedTime;
    /** Count of synchronized objects, listed by object type. */
    private java.util.List<StringKeyLongValuePair> _synchronizedEntryCountByType;
    /** In the event of an error, the URL with the troubleshooting steps for the issue. */
    private String _troubleshootingUrl;
    /**
     * Instantiates a new synchronizationStatus and sets the default values.
     * @return a void
     */
    public SynchronizationStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationStatus
     */
    @javax.annotation.Nonnull
    public static SynchronizationStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationStatus();
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
     * Gets the code property value. The code property
     * @return a synchronizationStatusCode
     */
    @javax.annotation.Nullable
    public SynchronizationStatusCode getCode() {
        return this._code;
    }
    /**
     * Gets the countSuccessiveCompleteFailures property value. Number of consecutive times this job failed.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountSuccessiveCompleteFailures() {
        return this._countSuccessiveCompleteFailures;
    }
    /**
     * Gets the escrowsPruned property value. true if the job's escrows (object-level errors) were pruned during initial synchronization. Escrows can be pruned if during the initial synchronization, you reach the threshold of errors that would normally put the job in quarantine. Instead of going into quarantine, the synchronization process clears the job's errors and continues until the initial synchronization is completed. When the initial synchronization is completed, the job will pause and wait for the customer to clean up the errors.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEscrowsPruned() {
        return this._escrowsPruned;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationStatus currentObject = this;
        return new HashMap<>(12) {{
            this.put("code", (n) -> { currentObject.setCode(n.getEnumValue(SynchronizationStatusCode.class)); });
            this.put("countSuccessiveCompleteFailures", (n) -> { currentObject.setCountSuccessiveCompleteFailures(n.getLongValue()); });
            this.put("escrowsPruned", (n) -> { currentObject.setEscrowsPruned(n.getBooleanValue()); });
            this.put("lastExecution", (n) -> { currentObject.setLastExecution(n.getObjectValue(SynchronizationTaskExecution::createFromDiscriminatorValue)); });
            this.put("lastSuccessfulExecution", (n) -> { currentObject.setLastSuccessfulExecution(n.getObjectValue(SynchronizationTaskExecution::createFromDiscriminatorValue)); });
            this.put("lastSuccessfulExecutionWithExports", (n) -> { currentObject.setLastSuccessfulExecutionWithExports(n.getObjectValue(SynchronizationTaskExecution::createFromDiscriminatorValue)); });
            this.put("progress", (n) -> { currentObject.setProgress(n.getCollectionOfObjectValues(SynchronizationProgress::createFromDiscriminatorValue)); });
            this.put("quarantine", (n) -> { currentObject.setQuarantine(n.getObjectValue(SynchronizationQuarantine::createFromDiscriminatorValue)); });
            this.put("steadyStateFirstAchievedTime", (n) -> { currentObject.setSteadyStateFirstAchievedTime(n.getOffsetDateTimeValue()); });
            this.put("steadyStateLastAchievedTime", (n) -> { currentObject.setSteadyStateLastAchievedTime(n.getOffsetDateTimeValue()); });
            this.put("synchronizedEntryCountByType", (n) -> { currentObject.setSynchronizedEntryCountByType(n.getCollectionOfObjectValues(StringKeyLongValuePair::createFromDiscriminatorValue)); });
            this.put("troubleshootingUrl", (n) -> { currentObject.setTroubleshootingUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastExecution property value. Details of the last execution of the job.
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution getLastExecution() {
        return this._lastExecution;
    }
    /**
     * Gets the lastSuccessfulExecution property value. Details of the last execution of this job, which didn't have any errors.
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution getLastSuccessfulExecution() {
        return this._lastSuccessfulExecution;
    }
    /**
     * Gets the lastSuccessfulExecutionWithExports property value. Details of the last execution of the job, which exported objects into the target directory.
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution getLastSuccessfulExecutionWithExports() {
        return this._lastSuccessfulExecutionWithExports;
    }
    /**
     * Gets the progress property value. Details of the progress of a job toward completion.
     * @return a synchronizationProgress
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationProgress> getProgress() {
        return this._progress;
    }
    /**
     * Gets the quarantine property value. If job is in quarantine, quarantine details.
     * @return a synchronizationQuarantine
     */
    @javax.annotation.Nullable
    public SynchronizationQuarantine getQuarantine() {
        return this._quarantine;
    }
    /**
     * Gets the steadyStateFirstAchievedTime property value. The time when steady state (no more changes to the process) was first achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSteadyStateFirstAchievedTime() {
        return this._steadyStateFirstAchievedTime;
    }
    /**
     * Gets the steadyStateLastAchievedTime property value. The time when steady state (no more changes to the process) was last achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSteadyStateLastAchievedTime() {
        return this._steadyStateLastAchievedTime;
    }
    /**
     * Gets the synchronizedEntryCountByType property value. Count of synchronized objects, listed by object type.
     * @return a stringKeyLongValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyLongValuePair> getSynchronizedEntryCountByType() {
        return this._synchronizedEntryCountByType;
    }
    /**
     * Gets the troubleshootingUrl property value. In the event of an error, the URL with the troubleshooting steps for the issue.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTroubleshootingUrl() {
        return this._troubleshootingUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("code", this.getCode());
        writer.writeLongValue("countSuccessiveCompleteFailures", this.getCountSuccessiveCompleteFailures());
        writer.writeBooleanValue("escrowsPruned", this.getEscrowsPruned());
        writer.writeObjectValue("lastExecution", this.getLastExecution());
        writer.writeObjectValue("lastSuccessfulExecution", this.getLastSuccessfulExecution());
        writer.writeObjectValue("lastSuccessfulExecutionWithExports", this.getLastSuccessfulExecutionWithExports());
        writer.writeCollectionOfObjectValues("progress", this.getProgress());
        writer.writeObjectValue("quarantine", this.getQuarantine());
        writer.writeOffsetDateTimeValue("steadyStateFirstAchievedTime", this.getSteadyStateFirstAchievedTime());
        writer.writeOffsetDateTimeValue("steadyStateLastAchievedTime", this.getSteadyStateLastAchievedTime());
        writer.writeCollectionOfObjectValues("synchronizedEntryCountByType", this.getSynchronizedEntryCountByType());
        writer.writeStringValue("troubleshootingUrl", this.getTroubleshootingUrl());
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
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final SynchronizationStatusCode value) {
        this._code = value;
    }
    /**
     * Sets the countSuccessiveCompleteFailures property value. Number of consecutive times this job failed.
     * @param value Value to set for the countSuccessiveCompleteFailures property.
     * @return a void
     */
    public void setCountSuccessiveCompleteFailures(@javax.annotation.Nullable final Long value) {
        this._countSuccessiveCompleteFailures = value;
    }
    /**
     * Sets the escrowsPruned property value. true if the job's escrows (object-level errors) were pruned during initial synchronization. Escrows can be pruned if during the initial synchronization, you reach the threshold of errors that would normally put the job in quarantine. Instead of going into quarantine, the synchronization process clears the job's errors and continues until the initial synchronization is completed. When the initial synchronization is completed, the job will pause and wait for the customer to clean up the errors.
     * @param value Value to set for the escrowsPruned property.
     * @return a void
     */
    public void setEscrowsPruned(@javax.annotation.Nullable final Boolean value) {
        this._escrowsPruned = value;
    }
    /**
     * Sets the lastExecution property value. Details of the last execution of the job.
     * @param value Value to set for the lastExecution property.
     * @return a void
     */
    public void setLastExecution(@javax.annotation.Nullable final SynchronizationTaskExecution value) {
        this._lastExecution = value;
    }
    /**
     * Sets the lastSuccessfulExecution property value. Details of the last execution of this job, which didn't have any errors.
     * @param value Value to set for the lastSuccessfulExecution property.
     * @return a void
     */
    public void setLastSuccessfulExecution(@javax.annotation.Nullable final SynchronizationTaskExecution value) {
        this._lastSuccessfulExecution = value;
    }
    /**
     * Sets the lastSuccessfulExecutionWithExports property value. Details of the last execution of the job, which exported objects into the target directory.
     * @param value Value to set for the lastSuccessfulExecutionWithExports property.
     * @return a void
     */
    public void setLastSuccessfulExecutionWithExports(@javax.annotation.Nullable final SynchronizationTaskExecution value) {
        this._lastSuccessfulExecutionWithExports = value;
    }
    /**
     * Sets the progress property value. Details of the progress of a job toward completion.
     * @param value Value to set for the progress property.
     * @return a void
     */
    public void setProgress(@javax.annotation.Nullable final java.util.List<SynchronizationProgress> value) {
        this._progress = value;
    }
    /**
     * Sets the quarantine property value. If job is in quarantine, quarantine details.
     * @param value Value to set for the quarantine property.
     * @return a void
     */
    public void setQuarantine(@javax.annotation.Nullable final SynchronizationQuarantine value) {
        this._quarantine = value;
    }
    /**
     * Sets the steadyStateFirstAchievedTime property value. The time when steady state (no more changes to the process) was first achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the steadyStateFirstAchievedTime property.
     * @return a void
     */
    public void setSteadyStateFirstAchievedTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._steadyStateFirstAchievedTime = value;
    }
    /**
     * Sets the steadyStateLastAchievedTime property value. The time when steady state (no more changes to the process) was last achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the steadyStateLastAchievedTime property.
     * @return a void
     */
    public void setSteadyStateLastAchievedTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._steadyStateLastAchievedTime = value;
    }
    /**
     * Sets the synchronizedEntryCountByType property value. Count of synchronized objects, listed by object type.
     * @param value Value to set for the synchronizedEntryCountByType property.
     * @return a void
     */
    public void setSynchronizedEntryCountByType(@javax.annotation.Nullable final java.util.List<StringKeyLongValuePair> value) {
        this._synchronizedEntryCountByType = value;
    }
    /**
     * Sets the troubleshootingUrl property value. In the event of an error, the URL with the troubleshooting steps for the issue.
     * @param value Value to set for the troubleshootingUrl property.
     * @return a void
     */
    public void setTroubleshootingUrl(@javax.annotation.Nullable final String value) {
        this._troubleshootingUrl = value;
    }
}

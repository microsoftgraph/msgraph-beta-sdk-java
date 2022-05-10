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
public class SynchronizationTaskExecution implements AdditionalDataHolder, Parsable {
    /** Identifier of the job run. */
    private String _activityIdentifier;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Count of processed entries that were assigned for this application. */
    private Long _countEntitled;
    /** Count of processed entries that were assigned for provisioning. */
    private Long _countEntitledForProvisioning;
    /** Count of entries that were escrowed (errors). */
    private Long _countEscrowed;
    /** Count of entries that were escrowed, including system-generated escrows. */
    private Long _countEscrowedRaw;
    /** Count of exported entries. */
    private Long _countExported;
    /** Count of entries that were expected to be exported. */
    private Long _countExports;
    /** Count of imported entries. */
    private Long _countImported;
    /** Count of imported delta-changes. */
    private Long _countImportedDeltas;
    /** Count of imported delta-changes pertaining to reference changes. */
    private Long _countImportedReferenceDeltas;
    /** If an error was encountered, contains a synchronizationError object with details. */
    private SynchronizationError _error;
    /** Code summarizing the result of this run. Possible values are: Succeeded, Failed, EntryLevelErrors. */
    private SynchronizationTaskExecutionResult _state;
    /** Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _timeBegan;
    /** Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _timeEnded;
    /**
     * Instantiates a new synchronizationTaskExecution and sets the default values.
     * @return a void
     */
    public SynchronizationTaskExecution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nonnull
    public static SynchronizationTaskExecution createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationTaskExecution();
    }
    /**
     * Gets the activityIdentifier property value. Identifier of the job run.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityIdentifier() {
        return this._activityIdentifier;
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
     * Gets the countEntitled property value. Count of processed entries that were assigned for this application.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEntitled() {
        return this._countEntitled;
    }
    /**
     * Gets the countEntitledForProvisioning property value. Count of processed entries that were assigned for provisioning.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEntitledForProvisioning() {
        return this._countEntitledForProvisioning;
    }
    /**
     * Gets the countEscrowed property value. Count of entries that were escrowed (errors).
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEscrowed() {
        return this._countEscrowed;
    }
    /**
     * Gets the countEscrowedRaw property value. Count of entries that were escrowed, including system-generated escrows.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEscrowedRaw() {
        return this._countEscrowedRaw;
    }
    /**
     * Gets the countExported property value. Count of exported entries.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountExported() {
        return this._countExported;
    }
    /**
     * Gets the countExports property value. Count of entries that were expected to be exported.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountExports() {
        return this._countExports;
    }
    /**
     * Gets the countImported property value. Count of imported entries.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountImported() {
        return this._countImported;
    }
    /**
     * Gets the countImportedDeltas property value. Count of imported delta-changes.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountImportedDeltas() {
        return this._countImportedDeltas;
    }
    /**
     * Gets the countImportedReferenceDeltas property value. Count of imported delta-changes pertaining to reference changes.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountImportedReferenceDeltas() {
        return this._countImportedReferenceDeltas;
    }
    /**
     * Gets the error property value. If an error was encountered, contains a synchronizationError object with details.
     * @return a synchronizationError
     */
    @javax.annotation.Nullable
    public SynchronizationError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationTaskExecution currentObject = this;
        return new HashMap<>(14) {{
            this.put("activityIdentifier", (n) -> { currentObject.setActivityIdentifier(n.getStringValue()); });
            this.put("countEntitled", (n) -> { currentObject.setCountEntitled(n.getLongValue()); });
            this.put("countEntitledForProvisioning", (n) -> { currentObject.setCountEntitledForProvisioning(n.getLongValue()); });
            this.put("countEscrowed", (n) -> { currentObject.setCountEscrowed(n.getLongValue()); });
            this.put("countEscrowedRaw", (n) -> { currentObject.setCountEscrowedRaw(n.getLongValue()); });
            this.put("countExported", (n) -> { currentObject.setCountExported(n.getLongValue()); });
            this.put("countExports", (n) -> { currentObject.setCountExports(n.getLongValue()); });
            this.put("countImported", (n) -> { currentObject.setCountImported(n.getLongValue()); });
            this.put("countImportedDeltas", (n) -> { currentObject.setCountImportedDeltas(n.getLongValue()); });
            this.put("countImportedReferenceDeltas", (n) -> { currentObject.setCountImportedReferenceDeltas(n.getLongValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(SynchronizationError::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(SynchronizationTaskExecutionResult.class)); });
            this.put("timeBegan", (n) -> { currentObject.setTimeBegan(n.getOffsetDateTimeValue()); });
            this.put("timeEnded", (n) -> { currentObject.setTimeEnded(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the state property value. Code summarizing the result of this run. Possible values are: Succeeded, Failed, EntryLevelErrors.
     * @return a synchronizationTaskExecutionResult
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecutionResult getState() {
        return this._state;
    }
    /**
     * Gets the timeBegan property value. Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTimeBegan() {
        return this._timeBegan;
    }
    /**
     * Gets the timeEnded property value. Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTimeEnded() {
        return this._timeEnded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityIdentifier", this.getActivityIdentifier());
        writer.writeLongValue("countEntitled", this.getCountEntitled());
        writer.writeLongValue("countEntitledForProvisioning", this.getCountEntitledForProvisioning());
        writer.writeLongValue("countEscrowed", this.getCountEscrowed());
        writer.writeLongValue("countEscrowedRaw", this.getCountEscrowedRaw());
        writer.writeLongValue("countExported", this.getCountExported());
        writer.writeLongValue("countExports", this.getCountExports());
        writer.writeLongValue("countImported", this.getCountImported());
        writer.writeLongValue("countImportedDeltas", this.getCountImportedDeltas());
        writer.writeLongValue("countImportedReferenceDeltas", this.getCountImportedReferenceDeltas());
        writer.writeObjectValue("error", this.getError());
        writer.writeEnumValue("state", this.getState());
        writer.writeOffsetDateTimeValue("timeBegan", this.getTimeBegan());
        writer.writeOffsetDateTimeValue("timeEnded", this.getTimeEnded());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityIdentifier property value. Identifier of the job run.
     * @param value Value to set for the activityIdentifier property.
     * @return a void
     */
    public void setActivityIdentifier(@javax.annotation.Nullable final String value) {
        this._activityIdentifier = value;
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
     * Sets the countEntitled property value. Count of processed entries that were assigned for this application.
     * @param value Value to set for the countEntitled property.
     * @return a void
     */
    public void setCountEntitled(@javax.annotation.Nullable final Long value) {
        this._countEntitled = value;
    }
    /**
     * Sets the countEntitledForProvisioning property value. Count of processed entries that were assigned for provisioning.
     * @param value Value to set for the countEntitledForProvisioning property.
     * @return a void
     */
    public void setCountEntitledForProvisioning(@javax.annotation.Nullable final Long value) {
        this._countEntitledForProvisioning = value;
    }
    /**
     * Sets the countEscrowed property value. Count of entries that were escrowed (errors).
     * @param value Value to set for the countEscrowed property.
     * @return a void
     */
    public void setCountEscrowed(@javax.annotation.Nullable final Long value) {
        this._countEscrowed = value;
    }
    /**
     * Sets the countEscrowedRaw property value. Count of entries that were escrowed, including system-generated escrows.
     * @param value Value to set for the countEscrowedRaw property.
     * @return a void
     */
    public void setCountEscrowedRaw(@javax.annotation.Nullable final Long value) {
        this._countEscrowedRaw = value;
    }
    /**
     * Sets the countExported property value. Count of exported entries.
     * @param value Value to set for the countExported property.
     * @return a void
     */
    public void setCountExported(@javax.annotation.Nullable final Long value) {
        this._countExported = value;
    }
    /**
     * Sets the countExports property value. Count of entries that were expected to be exported.
     * @param value Value to set for the countExports property.
     * @return a void
     */
    public void setCountExports(@javax.annotation.Nullable final Long value) {
        this._countExports = value;
    }
    /**
     * Sets the countImported property value. Count of imported entries.
     * @param value Value to set for the countImported property.
     * @return a void
     */
    public void setCountImported(@javax.annotation.Nullable final Long value) {
        this._countImported = value;
    }
    /**
     * Sets the countImportedDeltas property value. Count of imported delta-changes.
     * @param value Value to set for the countImportedDeltas property.
     * @return a void
     */
    public void setCountImportedDeltas(@javax.annotation.Nullable final Long value) {
        this._countImportedDeltas = value;
    }
    /**
     * Sets the countImportedReferenceDeltas property value. Count of imported delta-changes pertaining to reference changes.
     * @param value Value to set for the countImportedReferenceDeltas property.
     * @return a void
     */
    public void setCountImportedReferenceDeltas(@javax.annotation.Nullable final Long value) {
        this._countImportedReferenceDeltas = value;
    }
    /**
     * Sets the error property value. If an error was encountered, contains a synchronizationError object with details.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final SynchronizationError value) {
        this._error = value;
    }
    /**
     * Sets the state property value. Code summarizing the result of this run. Possible values are: Succeeded, Failed, EntryLevelErrors.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final SynchronizationTaskExecutionResult value) {
        this._state = value;
    }
    /**
     * Sets the timeBegan property value. Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the timeBegan property.
     * @return a void
     */
    public void setTimeBegan(@javax.annotation.Nullable final OffsetDateTime value) {
        this._timeBegan = value;
    }
    /**
     * Sets the timeEnded property value. Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the timeEnded property.
     * @return a void
     */
    public void setTimeEnded(@javax.annotation.Nullable final OffsetDateTime value) {
        this._timeEnded = value;
    }
}

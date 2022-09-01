package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class SynchronizationJob extends Entity implements Parsable {
    /** Schedule used to run the job. Read-only. */
    private SynchronizationSchedule _schedule;
    /** The synchronization schema configured for the job. */
    private SynchronizationSchema _schema;
    /** Status of the job, which includes when the job was last run, current job state, and errors. */
    private SynchronizationStatus _status;
    /** Settings associated with the job. Some settings are inherited from the template. */
    private java.util.List<KeyValuePair> _synchronizationJobSettings;
    /** Identifier of the synchronization template this job is based on. */
    private String _templateId;
    /**
     * Instantiates a new synchronizationJob and sets the default values.
     * @return a void
     */
    public SynchronizationJob() {
        super();
        this.setOdataType("#microsoft.graph.synchronizationJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJob
     */
    @javax.annotation.Nonnull
    public static SynchronizationJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJob();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationJob currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(SynchronizationSchedule::createFromDiscriminatorValue)); });
            this.put("schema", (n) -> { currentObject.setSchema(n.getObjectValue(SynchronizationSchema::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(SynchronizationStatus::createFromDiscriminatorValue)); });
            this.put("synchronizationJobSettings", (n) -> { currentObject.setSynchronizationJobSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the schedule property value. Schedule used to run the job. Read-only.
     * @return a synchronizationSchedule
     */
    @javax.annotation.Nullable
    public SynchronizationSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Gets the schema property value. The synchronization schema configured for the job.
     * @return a synchronizationSchema
     */
    @javax.annotation.Nullable
    public SynchronizationSchema getSchema() {
        return this._schema;
    }
    /**
     * Gets the status property value. Status of the job, which includes when the job was last run, current job state, and errors.
     * @return a synchronizationStatus
     */
    @javax.annotation.Nullable
    public SynchronizationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the synchronizationJobSettings property value. Settings associated with the job. Some settings are inherited from the template.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getSynchronizationJobSettings() {
        return this._synchronizationJobSettings;
    }
    /**
     * Gets the templateId property value. Identifier of the synchronization template this job is based on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("synchronizationJobSettings", this.getSynchronizationJobSettings());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the schedule property value. Schedule used to run the job. Read-only.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final SynchronizationSchedule value) {
        this._schedule = value;
    }
    /**
     * Sets the schema property value. The synchronization schema configured for the job.
     * @param value Value to set for the schema property.
     * @return a void
     */
    public void setSchema(@javax.annotation.Nullable final SynchronizationSchema value) {
        this._schema = value;
    }
    /**
     * Sets the status property value. Status of the job, which includes when the job was last run, current job state, and errors.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final SynchronizationStatus value) {
        this._status = value;
    }
    /**
     * Sets the synchronizationJobSettings property value. Settings associated with the job. Some settings are inherited from the template.
     * @param value Value to set for the synchronizationJobSettings property.
     * @return a void
     */
    public void setSynchronizationJobSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._synchronizationJobSettings = value;
    }
    /**
     * Sets the templateId property value. Identifier of the synchronization template this job is based on.
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class PrintJob extends Entity implements Parsable {
    /** The acknowledgedDateTime property */
    private OffsetDateTime _acknowledgedDateTime;
    /** The completedDateTime property */
    private OffsetDateTime _completedDateTime;
    /** A group of settings that a printer should use to print a job. */
    private PrintJobConfiguration _configuration;
    /** The createdBy property */
    private UserIdentity _createdBy;
    /** The DateTimeOffset when the job was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The displayName property */
    private String _displayName;
    /** The documents property */
    private java.util.List<PrintDocument> _documents;
    /** The errorCode property */
    private Integer _errorCode;
    /** If true, document can be fetched by printer. */
    private Boolean _isFetchable;
    /** Contains the source job URL, if the job has been redirected from another printer. */
    private String _redirectedFrom;
    /** Contains the destination job URL, if the job has been redirected to another printer. */
    private String _redirectedTo;
    /** The status of the print job. Read-only. */
    private PrintJobStatus _status;
    /** A list of printTasks that were triggered by this print job. */
    private java.util.List<PrintTask> _tasks;
    /**
     * Instantiates a new printJob and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printJob
     */
    @javax.annotation.Nonnull
    public static PrintJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJob();
    }
    /**
     * Gets the acknowledgedDateTime property value. The acknowledgedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAcknowledgedDateTime() {
        return this._acknowledgedDateTime;
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
     * Gets the configuration property value. A group of settings that a printer should use to print a job.
     * @return a printJobConfiguration
     */
    @javax.annotation.Nullable
    public PrintJobConfiguration getConfiguration() {
        return this._configuration;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the documents property value. The documents property
     * @return a printDocument
     */
    @javax.annotation.Nullable
    public java.util.List<PrintDocument> getDocuments() {
        return this._documents;
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acknowledgedDateTime", (n) -> { this.setAcknowledgedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(PrintJobConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documents", (n) -> { this.setDocuments(n.getCollectionOfObjectValues(PrintDocument::createFromDiscriminatorValue)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("isFetchable", (n) -> { this.setIsFetchable(n.getBooleanValue()); });
        deserializerMap.put("redirectedFrom", (n) -> { this.setRedirectedFrom(n.getStringValue()); });
        deserializerMap.put("redirectedTo", (n) -> { this.setRedirectedTo(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(PrintJobStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PrintTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isFetchable property value. If true, document can be fetched by printer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFetchable() {
        return this._isFetchable;
    }
    /**
     * Gets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectedFrom() {
        return this._redirectedFrom;
    }
    /**
     * Gets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectedTo() {
        return this._redirectedTo;
    }
    /**
     * Gets the status property value. The status of the print job. Read-only.
     * @return a printJobStatus
     */
    @javax.annotation.Nullable
    public PrintJobStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tasks property value. A list of printTasks that were triggered by this print job.
     * @return a printTask
     */
    @javax.annotation.Nullable
    public java.util.List<PrintTask> getTasks() {
        return this._tasks;
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
        writer.writeOffsetDateTimeValue("acknowledgedDateTime", this.getAcknowledgedDateTime());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("documents", this.getDocuments());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeBooleanValue("isFetchable", this.getIsFetchable());
        writer.writeStringValue("redirectedFrom", this.getRedirectedFrom());
        writer.writeStringValue("redirectedTo", this.getRedirectedTo());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the acknowledgedDateTime property value. The acknowledgedDateTime property
     * @param value Value to set for the acknowledgedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcknowledgedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._acknowledgedDateTime = value;
    }
    /**
     * Sets the completedDateTime property value. The completedDateTime property
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the configuration property value. A group of settings that a printer should use to print a job.
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final PrintJobConfiguration value) {
        this._configuration = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the documents property value. The documents property
     * @param value Value to set for the documents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocuments(@javax.annotation.Nullable final java.util.List<PrintDocument> value) {
        this._documents = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the isFetchable property value. If true, document can be fetched by printer.
     * @param value Value to set for the isFetchable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFetchable(@javax.annotation.Nullable final Boolean value) {
        this._isFetchable = value;
    }
    /**
     * Sets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @param value Value to set for the redirectedFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectedFrom(@javax.annotation.Nullable final String value) {
        this._redirectedFrom = value;
    }
    /**
     * Sets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @param value Value to set for the redirectedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectedTo(@javax.annotation.Nullable final String value) {
        this._redirectedTo = value;
    }
    /**
     * Sets the status property value. The status of the print job. Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final PrintJobStatus value) {
        this._status = value;
    }
    /**
     * Sets the tasks property value. A list of printTasks that were triggered by this print job.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<PrintTask> value) {
        this._tasks = value;
    }
}

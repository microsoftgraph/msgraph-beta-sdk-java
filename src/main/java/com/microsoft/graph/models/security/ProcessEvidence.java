package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProcessEvidence extends AlertEvidence implements Parsable {
    /** The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue. */
    private DetectionStatus _detectionStatus;
    /** Image file details. */
    private FileDetails _imageFile;
    /** A unique identifier assigned to a device by Microsoft Defender for Endpoint. */
    private String _mdeDeviceId;
    /** Date and time when the parent of the process was created. */
    private OffsetDateTime _parentProcessCreationDateTime;
    /** Process ID (PID) of the parent process that spawned the process. */
    private Long _parentProcessId;
    /** Parent process image file details. */
    private FileDetails _parentProcessImageFile;
    /** Command line used to create the new process. */
    private String _processCommandLine;
    /** Date and time the process was created. */
    private OffsetDateTime _processCreationDateTime;
    /** Process ID (PID) of the newly created process. */
    private Long _processId;
    /** User details of the user that ran the process. */
    private UserAccount _userAccount;
    /**
     * Instantiates a new ProcessEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProcessEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.processEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProcessEvidence
     */
    @javax.annotation.Nonnull
    public static ProcessEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessEvidence();
    }
    /**
     * Gets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @return a detectionStatus
     */
    @javax.annotation.Nullable
    public DetectionStatus getDetectionStatus() {
        return this._detectionStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProcessEvidence currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionStatus", (n) -> { currentObject.setDetectionStatus(n.getEnumValue(DetectionStatus.class)); });
        deserializerMap.put("imageFile", (n) -> { currentObject.setImageFile(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { currentObject.setMdeDeviceId(n.getStringValue()); });
        deserializerMap.put("parentProcessCreationDateTime", (n) -> { currentObject.setParentProcessCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parentProcessId", (n) -> { currentObject.setParentProcessId(n.getLongValue()); });
        deserializerMap.put("parentProcessImageFile", (n) -> { currentObject.setParentProcessImageFile(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("processCommandLine", (n) -> { currentObject.setProcessCommandLine(n.getStringValue()); });
        deserializerMap.put("processCreationDateTime", (n) -> { currentObject.setProcessCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processId", (n) -> { currentObject.setProcessId(n.getLongValue()); });
        deserializerMap.put("userAccount", (n) -> { currentObject.setUserAccount(n.getObjectValue(UserAccount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageFile property value. Image file details.
     * @return a fileDetails
     */
    @javax.annotation.Nullable
    public FileDetails getImageFile() {
        return this._imageFile;
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdeDeviceId() {
        return this._mdeDeviceId;
    }
    /**
     * Gets the parentProcessCreationDateTime property value. Date and time when the parent of the process was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getParentProcessCreationDateTime() {
        return this._parentProcessCreationDateTime;
    }
    /**
     * Gets the parentProcessId property value. Process ID (PID) of the parent process that spawned the process.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getParentProcessId() {
        return this._parentProcessId;
    }
    /**
     * Gets the parentProcessImageFile property value. Parent process image file details.
     * @return a fileDetails
     */
    @javax.annotation.Nullable
    public FileDetails getParentProcessImageFile() {
        return this._parentProcessImageFile;
    }
    /**
     * Gets the processCommandLine property value. Command line used to create the new process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProcessCommandLine() {
        return this._processCommandLine;
    }
    /**
     * Gets the processCreationDateTime property value. Date and time the process was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProcessCreationDateTime() {
        return this._processCreationDateTime;
    }
    /**
     * Gets the processId property value. Process ID (PID) of the newly created process.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getProcessId() {
        return this._processId;
    }
    /**
     * Gets the userAccount property value. User details of the user that ran the process.
     * @return a userAccount
     */
    @javax.annotation.Nullable
    public UserAccount getUserAccount() {
        return this._userAccount;
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
        writer.writeEnumValue("detectionStatus", this.getDetectionStatus());
        writer.writeObjectValue("imageFile", this.getImageFile());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
        writer.writeOffsetDateTimeValue("parentProcessCreationDateTime", this.getParentProcessCreationDateTime());
        writer.writeLongValue("parentProcessId", this.getParentProcessId());
        writer.writeObjectValue("parentProcessImageFile", this.getParentProcessImageFile());
        writer.writeStringValue("processCommandLine", this.getProcessCommandLine());
        writer.writeOffsetDateTimeValue("processCreationDateTime", this.getProcessCreationDateTime());
        writer.writeLongValue("processId", this.getProcessId());
        writer.writeObjectValue("userAccount", this.getUserAccount());
    }
    /**
     * Sets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @param value Value to set for the detectionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionStatus(@javax.annotation.Nullable final DetectionStatus value) {
        this._detectionStatus = value;
    }
    /**
     * Sets the imageFile property value. Image file details.
     * @param value Value to set for the imageFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageFile(@javax.annotation.Nullable final FileDetails value) {
        this._imageFile = value;
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdeDeviceId(@javax.annotation.Nullable final String value) {
        this._mdeDeviceId = value;
    }
    /**
     * Sets the parentProcessCreationDateTime property value. Date and time when the parent of the process was created.
     * @param value Value to set for the parentProcessCreationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._parentProcessCreationDateTime = value;
    }
    /**
     * Sets the parentProcessId property value. Process ID (PID) of the parent process that spawned the process.
     * @param value Value to set for the parentProcessId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessId(@javax.annotation.Nullable final Long value) {
        this._parentProcessId = value;
    }
    /**
     * Sets the parentProcessImageFile property value. Parent process image file details.
     * @param value Value to set for the parentProcessImageFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessImageFile(@javax.annotation.Nullable final FileDetails value) {
        this._parentProcessImageFile = value;
    }
    /**
     * Sets the processCommandLine property value. Command line used to create the new process.
     * @param value Value to set for the processCommandLine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessCommandLine(@javax.annotation.Nullable final String value) {
        this._processCommandLine = value;
    }
    /**
     * Sets the processCreationDateTime property value. Date and time the process was created.
     * @param value Value to set for the processCreationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._processCreationDateTime = value;
    }
    /**
     * Sets the processId property value. Process ID (PID) of the newly created process.
     * @param value Value to set for the processId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessId(@javax.annotation.Nullable final Long value) {
        this._processId = value;
    }
    /**
     * Sets the userAccount property value. User details of the user that ran the process.
     * @param value Value to set for the userAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccount(@javax.annotation.Nullable final UserAccount value) {
        this._userAccount = value;
    }
}

package com.microsoft.graph.deviceappmanagement.deviceappmanagementtasks.item.updatestatus;

import com.microsoft.graph.models.DeviceAppManagementTaskStatus;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateStatus method. */
public class UpdateStatusPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The note property */
    private String _note;
    /** Device app management task status. */
    private DeviceAppManagementTaskStatus _status;
    /**
     * Instantiates a new updateStatusPostRequestBody and sets the default values.
     * @return a void
     */
    public UpdateStatusPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateStatusPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateStatusPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateStatusPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateStatusPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("note", (n) -> { currentObject.setNote(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DeviceAppManagementTaskStatus.class)); });
        }};
    }
    /**
     * Gets the note property value. The note property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNote() {
        return this._note;
    }
    /**
     * Gets the status property value. Device app management task status.
     * @return a deviceAppManagementTaskStatus
     */
    @javax.annotation.Nullable
    public DeviceAppManagementTaskStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("note", this.getNote());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the note property value. The note property
     * @param value Value to set for the note property.
     * @return a void
     */
    public void setNote(@javax.annotation.Nullable final String value) {
        this._note = value;
    }
    /**
     * Sets the status property value. Device app management task status.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DeviceAppManagementTaskStatus value) {
        this._status = value;
    }
}

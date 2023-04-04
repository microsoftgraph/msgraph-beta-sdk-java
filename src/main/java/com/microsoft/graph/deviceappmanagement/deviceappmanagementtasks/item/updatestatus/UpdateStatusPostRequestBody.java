package com.microsoft.graph.deviceappmanagement.deviceappmanagementtasks.item.updatestatus;

import com.microsoft.graph.models.DeviceAppManagementTaskStatus;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateStatusPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The note property */
    private String note;
    /** Device app management task status. */
    private DeviceAppManagementTaskStatus status;
    /**
     * Instantiates a new updateStatusPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceAppManagementTaskStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the note property value. The note property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNote() {
        return this.note;
    }
    /**
     * Gets the status property value. Device app management task status.
     * @return a deviceAppManagementTaskStatus
     */
    @javax.annotation.Nullable
    public DeviceAppManagementTaskStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the note property value. The note property
     * @param value Value to set for the note property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNote(@javax.annotation.Nullable final String value) {
        this.note = value;
    }
    /**
     * Sets the status property value. Device app management task status.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DeviceAppManagementTaskStatus value) {
        this.status = value;
    }
}

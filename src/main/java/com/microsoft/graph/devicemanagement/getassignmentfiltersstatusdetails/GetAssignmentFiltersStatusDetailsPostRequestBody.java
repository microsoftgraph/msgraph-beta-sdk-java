package com.microsoft.graph.devicemanagement.getassignmentfiltersstatusdetails;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getAssignmentFiltersStatusDetails method. */
public class GetAssignmentFiltersStatusDetailsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignmentFilterIds property */
    private java.util.List<String> _assignmentFilterIds;
    /** The managedDeviceId property */
    private String _managedDeviceId;
    /** The payloadId property */
    private String _payloadId;
    /** The skip property */
    private Integer _skip;
    /** The top property */
    private Integer _top;
    /** The userId property */
    private String _userId;
    /**
     * Instantiates a new getAssignmentFiltersStatusDetailsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetAssignmentFiltersStatusDetailsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getAssignmentFiltersStatusDetailsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetAssignmentFiltersStatusDetailsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAssignmentFiltersStatusDetailsPostRequestBody();
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
     * Gets the assignmentFilterIds property value. The assignmentFilterIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this._assignmentFilterIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetAssignmentFiltersStatusDetailsPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("assignmentFilterIds", (n) -> { currentObject.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("payloadId", (n) -> { currentObject.setPayloadId(n.getStringValue()); });
            this.put("skip", (n) -> { currentObject.setSkip(n.getIntegerValue()); });
            this.put("top", (n) -> { currentObject.setTop(n.getIntegerValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceId property value. The managedDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the payloadId property value. The payloadId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadId() {
        return this._payloadId;
    }
    /**
     * Gets the skip property value. The skip property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkip() {
        return this._skip;
    }
    /**
     * Gets the top property value. The top property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTop() {
        return this._top;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("assignmentFilterIds", this.getAssignmentFilterIds());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeIntegerValue("skip", this.getSkip());
        writer.writeIntegerValue("top", this.getTop());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignmentFilterIds property value. The assignmentFilterIds property
     * @param value Value to set for the assignmentFilterIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._assignmentFilterIds = value;
    }
    /**
     * Sets the managedDeviceId property value. The managedDeviceId property
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the payloadId property value. The payloadId property
     * @param value Value to set for the payloadId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadId(@javax.annotation.Nullable final String value) {
        this._payloadId = value;
    }
    /**
     * Sets the skip property value. The skip property
     * @param value Value to set for the skip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkip(@javax.annotation.Nullable final Integer value) {
        this._skip = value;
    }
    /**
     * Sets the top property value. The top property
     * @param value Value to set for the top property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTop(@javax.annotation.Nullable final Integer value) {
        this._top = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}

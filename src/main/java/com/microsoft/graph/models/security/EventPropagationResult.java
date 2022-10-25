package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventPropagationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The name of the specific location in the workload associated with the event. */
    private String _location;
    /** The OdataType property */
    private String _odataType;
    /** The name of the workload associated with the event. */
    private String _serviceName;
    /** Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success. */
    private EventPropagationStatus _status;
    /** Additional information about the status of the event creation request. */
    private String _statusInformation;
    /**
     * Instantiates a new eventPropagationResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EventPropagationResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.eventPropagationResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventPropagationResult
     */
    @javax.annotation.Nonnull
    public static EventPropagationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventPropagationResult();
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
        final EventPropagationResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("location", (n) -> { currentObject.setLocation(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("serviceName", (n) -> { currentObject.setServiceName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(EventPropagationStatus.class)); });
            this.put("statusInformation", (n) -> { currentObject.setStatusInformation(n.getStringValue()); });
        }};
    }
    /**
     * Gets the location property value. The name of the specific location in the workload associated with the event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return this._location;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the serviceName property value. The name of the workload associated with the event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this._serviceName;
    }
    /**
     * Gets the status property value. Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success.
     * @return a eventPropagationStatus
     */
    @javax.annotation.Nullable
    public EventPropagationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusInformation property value. Additional information about the status of the event creation request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusInformation() {
        return this._statusInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("serviceName", this.getServiceName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusInformation", this.getStatusInformation());
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
     * Sets the location property value. The name of the specific location in the workload associated with the event.
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final String value) {
        this._location = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the serviceName property value. The name of the workload associated with the event.
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this._serviceName = value;
    }
    /**
     * Sets the status property value. Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final EventPropagationStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusInformation property value. Additional information about the status of the event creation request.
     * @param value Value to set for the statusInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusInformation(@javax.annotation.Nullable final String value) {
        this._statusInformation = value;
    }
}

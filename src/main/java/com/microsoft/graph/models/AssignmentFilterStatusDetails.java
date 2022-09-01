package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represent status details for device and payload and all associated applied filters. */
public class AssignmentFilterStatusDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device properties used for filter evaluation during device check-in time. */
    private java.util.List<KeyValuePair> _deviceProperties;
    /** Evaluation result summaries for each filter associated to device and payload */
    private java.util.List<AssignmentFilterEvaluationSummary> _evalutionSummaries;
    /** Unique identifier for the device object. */
    private String _managedDeviceId;
    /** The OdataType property */
    private String _odataType;
    /** Unique identifier for payload object. */
    private String _payloadId;
    /** Unique identifier for UserId object. Can be null */
    private String _userId;
    /**
     * Instantiates a new assignmentFilterStatusDetails and sets the default values.
     * @return a void
     */
    public AssignmentFilterStatusDetails() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.assignmentFilterStatusDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterStatusDetails
     */
    @javax.annotation.Nonnull
    public static AssignmentFilterStatusDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterStatusDetails();
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
     * Gets the deviceProperties property value. Device properties used for filter evaluation during device check-in time.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getDeviceProperties() {
        return this._deviceProperties;
    }
    /**
     * Gets the evalutionSummaries property value. Evaluation result summaries for each filter associated to device and payload
     * @return a assignmentFilterEvaluationSummary
     */
    @javax.annotation.Nullable
    public java.util.List<AssignmentFilterEvaluationSummary> getEvalutionSummaries() {
        return this._evalutionSummaries;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignmentFilterStatusDetails currentObject = this;
        return new HashMap<>(6) {{
            this.put("deviceProperties", (n) -> { currentObject.setDeviceProperties(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("evalutionSummaries", (n) -> { currentObject.setEvalutionSummaries(n.getCollectionOfObjectValues(AssignmentFilterEvaluationSummary::createFromDiscriminatorValue)); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("payloadId", (n) -> { currentObject.setPayloadId(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceId property value. Unique identifier for the device object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
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
     * Gets the payloadId property value. Unique identifier for payload object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadId() {
        return this._payloadId;
    }
    /**
     * Gets the userId property value. Unique identifier for UserId object. Can be null
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceProperties", this.getDeviceProperties());
        writer.writeCollectionOfObjectValues("evalutionSummaries", this.getEvalutionSummaries());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeStringValue("userId", this.getUserId());
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
     * Sets the deviceProperties property value. Device properties used for filter evaluation during device check-in time.
     * @param value Value to set for the deviceProperties property.
     * @return a void
     */
    public void setDeviceProperties(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._deviceProperties = value;
    }
    /**
     * Sets the evalutionSummaries property value. Evaluation result summaries for each filter associated to device and payload
     * @param value Value to set for the evalutionSummaries property.
     * @return a void
     */
    public void setEvalutionSummaries(@javax.annotation.Nullable final java.util.List<AssignmentFilterEvaluationSummary> value) {
        this._evalutionSummaries = value;
    }
    /**
     * Sets the managedDeviceId property value. Unique identifier for the device object.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the payloadId property value. Unique identifier for payload object.
     * @param value Value to set for the payloadId property.
     * @return a void
     */
    public void setPayloadId(@javax.annotation.Nullable final String value) {
        this._payloadId = value;
    }
    /**
     * Sets the userId property value. Unique identifier for UserId object. Can be null
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}

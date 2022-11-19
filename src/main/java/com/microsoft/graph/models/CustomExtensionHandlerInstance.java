package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomExtensionHandlerInstance implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Identifier of the customAccessPackageWorkflowExtension triggered at this instance. */
    private String _customExtensionId;
    /** The unique run ID for the logic app. */
    private String _externalCorrelationId;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the stage of the request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue. */
    private AccessPackageCustomExtensionStage _stage;
    /** Status of the request to run the access package custom extension workflow that is associated with the logic app. The possible values are: requestSent, requestReceived, unknownFutureValue. */
    private AccessPackageCustomExtensionHandlerStatus _status;
    /**
     * Instantiates a new customExtensionHandlerInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomExtensionHandlerInstance() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.customExtensionHandlerInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customExtensionHandlerInstance
     */
    @javax.annotation.Nonnull
    public static CustomExtensionHandlerInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionHandlerInstance();
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
     * Gets the customExtensionId property value. Identifier of the customAccessPackageWorkflowExtension triggered at this instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomExtensionId() {
        return this._customExtensionId;
    }
    /**
     * Gets the externalCorrelationId property value. The unique run ID for the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalCorrelationId() {
        return this._externalCorrelationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomExtensionHandlerInstance currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("customExtensionId", (n) -> { currentObject.setCustomExtensionId(n.getStringValue()); });
        deserializerMap.put("externalCorrelationId", (n) -> { currentObject.setExternalCorrelationId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("stage", (n) -> { currentObject.setStage(n.getEnumValue(AccessPackageCustomExtensionStage.class)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AccessPackageCustomExtensionHandlerStatus.class)); });
        return deserializerMap;
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
     * Gets the stage property value. Indicates the stage of the request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @return a accessPackageCustomExtensionStage
     */
    @javax.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this._stage;
    }
    /**
     * Gets the status property value. Status of the request to run the access package custom extension workflow that is associated with the logic app. The possible values are: requestSent, requestReceived, unknownFutureValue.
     * @return a accessPackageCustomExtensionHandlerStatus
     */
    @javax.annotation.Nullable
    public AccessPackageCustomExtensionHandlerStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customExtensionId", this.getCustomExtensionId());
        writer.writeStringValue("externalCorrelationId", this.getExternalCorrelationId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("stage", this.getStage());
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
        this._additionalData = value;
    }
    /**
     * Sets the customExtensionId property value. Identifier of the customAccessPackageWorkflowExtension triggered at this instance.
     * @param value Value to set for the customExtensionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtensionId(@javax.annotation.Nullable final String value) {
        this._customExtensionId = value;
    }
    /**
     * Sets the externalCorrelationId property value. The unique run ID for the logic app.
     * @param value Value to set for the externalCorrelationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalCorrelationId(@javax.annotation.Nullable final String value) {
        this._externalCorrelationId = value;
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
     * Sets the stage property value. Indicates the stage of the request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @param value Value to set for the stage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStage(@javax.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this._stage = value;
    }
    /**
     * Sets the status property value. Status of the request to run the access package custom extension workflow that is associated with the logic app. The possible values are: requestSent, requestReceived, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AccessPackageCustomExtensionHandlerStatus value) {
        this._status = value;
    }
}

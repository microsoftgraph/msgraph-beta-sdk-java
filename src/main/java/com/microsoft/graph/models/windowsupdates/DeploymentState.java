package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeploymentState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the reasons the deployment has its state value. Read-only. */
    private java.util.List<DeploymentStateReason> _reasons;
    /** The requestedValue property */
    private RequestedDeploymentStateValue _requestedValue;
    /** The value property */
    private DeploymentStateValue _value;
    /**
     * Instantiates a new deploymentState and sets the default values.
     * @return a void
     */
    public DeploymentState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsUpdates.deploymentState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deploymentState
     */
    @javax.annotation.Nonnull
    public static DeploymentState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentState();
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
        final DeploymentState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("reasons", (n) -> { currentObject.setReasons(n.getCollectionOfObjectValues(DeploymentStateReason::createFromDiscriminatorValue)); });
            this.put("requestedValue", (n) -> { currentObject.setRequestedValue(n.getEnumValue(RequestedDeploymentStateValue.class)); });
            this.put("value", (n) -> { currentObject.setValue(n.getEnumValue(DeploymentStateValue.class)); });
        }};
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
     * Gets the reasons property value. Specifies the reasons the deployment has its state value. Read-only.
     * @return a deploymentStateReason
     */
    @javax.annotation.Nullable
    public java.util.List<DeploymentStateReason> getReasons() {
        return this._reasons;
    }
    /**
     * Gets the requestedValue property value. The requestedValue property
     * @return a requestedDeploymentStateValue
     */
    @javax.annotation.Nullable
    public RequestedDeploymentStateValue getRequestedValue() {
        return this._requestedValue;
    }
    /**
     * Gets the value property value. The value property
     * @return a deploymentStateValue
     */
    @javax.annotation.Nullable
    public DeploymentStateValue getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("reasons", this.getReasons());
        writer.writeEnumValue("requestedValue", this.getRequestedValue());
        writer.writeEnumValue("value", this.getValue());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reasons property value. Specifies the reasons the deployment has its state value. Read-only.
     * @param value Value to set for the reasons property.
     * @return a void
     */
    public void setReasons(@javax.annotation.Nullable final java.util.List<DeploymentStateReason> value) {
        this._reasons = value;
    }
    /**
     * Sets the requestedValue property value. The requestedValue property
     * @param value Value to set for the requestedValue property.
     * @return a void
     */
    public void setRequestedValue(@javax.annotation.Nullable final RequestedDeploymentStateValue value) {
        this._requestedValue = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final DeploymentStateValue value) {
        this._value = value;
    }
}

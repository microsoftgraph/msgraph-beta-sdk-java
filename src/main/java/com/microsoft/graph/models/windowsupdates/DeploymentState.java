package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeploymentState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The effectiveValue property
     */
    private DeploymentStateValue effectiveValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the reasons the deployment has its state value. Read-only.
     */
    private java.util.List<DeploymentStateReason> reasons;
    /**
     * The requestedValue property
     */
    private RequestedDeploymentStateValue requestedValue;
    /**
     * Instantiates a new deploymentState and sets the default values.
     */
    public DeploymentState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deploymentState
     */
    @jakarta.annotation.Nonnull
    public static DeploymentState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the effectiveValue property value. The effectiveValue property
     * @return a deploymentStateValue
     */
    @jakarta.annotation.Nullable
    public DeploymentStateValue getEffectiveValue() {
        return this.effectiveValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("effectiveValue", (n) -> { this.setEffectiveValue(n.getEnumValue(DeploymentStateValue.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reasons", (n) -> { this.setReasons(n.getCollectionOfObjectValues(DeploymentStateReason::createFromDiscriminatorValue)); });
        deserializerMap.put("requestedValue", (n) -> { this.setRequestedValue(n.getEnumValue(RequestedDeploymentStateValue.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the reasons property value. Specifies the reasons the deployment has its state value. Read-only.
     * @return a deploymentStateReason
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeploymentStateReason> getReasons() {
        return this.reasons;
    }
    /**
     * Gets the requestedValue property value. The requestedValue property
     * @return a requestedDeploymentStateValue
     */
    @jakarta.annotation.Nullable
    public RequestedDeploymentStateValue getRequestedValue() {
        return this.requestedValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("effectiveValue", this.getEffectiveValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("reasons", this.getReasons());
        writer.writeEnumValue("requestedValue", this.getRequestedValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the effectiveValue property value. The effectiveValue property
     * @param value Value to set for the effectiveValue property.
     */
    public void setEffectiveValue(@jakarta.annotation.Nullable final DeploymentStateValue value) {
        this.effectiveValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reasons property value. Specifies the reasons the deployment has its state value. Read-only.
     * @param value Value to set for the reasons property.
     */
    public void setReasons(@jakarta.annotation.Nullable final java.util.List<DeploymentStateReason> value) {
        this.reasons = value;
    }
    /**
     * Sets the requestedValue property value. The requestedValue property
     * @param value Value to set for the requestedValue property.
     */
    public void setRequestedValue(@jakarta.annotation.Nullable final RequestedDeploymentStateValue value) {
        this.requestedValue = value;
    }
}

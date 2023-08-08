package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppliedAuthenticationEventListener implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of authentication event that triggered the custom authentication extension request. The possible values are: tokenIssuanceStart, pageRenderStart, unknownFutureValue.
     */
    private AuthenticationEventType eventType;
    /**
     * ID of the authentication event listener that was executed.
     */
    private String executedListenerId;
    /**
     * The result from the listening client, such as an Azure Logic App and Azure Functions, of this authentication event.
     */
    private AuthenticationEventHandlerResult handlerResult;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new appliedAuthenticationEventListener and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppliedAuthenticationEventListener() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appliedAuthenticationEventListener
     */
    @javax.annotation.Nonnull
    public static AppliedAuthenticationEventListener createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedAuthenticationEventListener();
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
     * Gets the eventType property value. The type of authentication event that triggered the custom authentication extension request. The possible values are: tokenIssuanceStart, pageRenderStart, unknownFutureValue.
     * @return a authenticationEventType
     */
    @javax.annotation.Nullable
    public AuthenticationEventType getEventType() {
        return this.eventType;
    }
    /**
     * Gets the executedListenerId property value. ID of the authentication event listener that was executed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExecutedListenerId() {
        return this.executedListenerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getEnumValue(AuthenticationEventType.class)); });
        deserializerMap.put("executedListenerId", (n) -> { this.setExecutedListenerId(n.getStringValue()); });
        deserializerMap.put("handlerResult", (n) -> { this.setHandlerResult(n.getObjectValue(AuthenticationEventHandlerResult::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the handlerResult property value. The result from the listening client, such as an Azure Logic App and Azure Functions, of this authentication event.
     * @return a authenticationEventHandlerResult
     */
    @javax.annotation.Nullable
    public AuthenticationEventHandlerResult getHandlerResult() {
        return this.handlerResult;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("eventType", this.getEventType());
        writer.writeStringValue("executedListenerId", this.getExecutedListenerId());
        writer.writeObjectValue("handlerResult", this.getHandlerResult());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the eventType property value. The type of authentication event that triggered the custom authentication extension request. The possible values are: tokenIssuanceStart, pageRenderStart, unknownFutureValue.
     * @param value Value to set for the eventType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventType(@javax.annotation.Nullable final AuthenticationEventType value) {
        this.eventType = value;
    }
    /**
     * Sets the executedListenerId property value. ID of the authentication event listener that was executed.
     * @param value Value to set for the executedListenerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExecutedListenerId(@javax.annotation.Nullable final String value) {
        this.executedListenerId = value;
    }
    /**
     * Sets the handlerResult property value. The result from the listening client, such as an Azure Logic App and Azure Functions, of this authentication event.
     * @param value Value to set for the handlerResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHandlerResult(@javax.annotation.Nullable final AuthenticationEventHandlerResult value) {
        this.handlerResult = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

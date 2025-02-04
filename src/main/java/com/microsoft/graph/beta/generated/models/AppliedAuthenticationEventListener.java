package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppliedAuthenticationEventListener implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppliedAuthenticationEventListener} and sets the default values.
     */
    public AppliedAuthenticationEventListener() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppliedAuthenticationEventListener}
     */
    @jakarta.annotation.Nonnull
    public static AppliedAuthenticationEventListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedAuthenticationEventListener();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the eventType property value. The type of authentication event that triggered the custom authentication extension request. The possible values are: tokenIssuanceStart, pageRenderStart, unknownFutureValue, attributeCollectionStart, attributeCollectionSubmit, emailOtpSend. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: attributeCollectionStart, attributeCollectionSubmit, emailOtpSend.
     * @return a {@link AuthenticationEventType}
     */
    @jakarta.annotation.Nullable
    public AuthenticationEventType getEventType() {
        return this.backingStore.get("eventType");
    }
    /**
     * Gets the executedListenerId property value. ID of the authentication event listener that was executed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExecutedListenerId() {
        return this.backingStore.get("executedListenerId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getEnumValue(AuthenticationEventType::forValue)); });
        deserializerMap.put("executedListenerId", (n) -> { this.setExecutedListenerId(n.getStringValue()); });
        deserializerMap.put("handlerResult", (n) -> { this.setHandlerResult(n.getObjectValue(AuthenticationEventHandlerResult::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the handlerResult property value. The result from the listening client, such as an Azure Logic App and Azure Functions, of this authentication event.
     * @return a {@link AuthenticationEventHandlerResult}
     */
    @jakarta.annotation.Nullable
    public AuthenticationEventHandlerResult getHandlerResult() {
        return this.backingStore.get("handlerResult");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("eventType", this.getEventType());
        writer.writeStringValue("executedListenerId", this.getExecutedListenerId());
        writer.writeObjectValue("handlerResult", this.getHandlerResult());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the eventType property value. The type of authentication event that triggered the custom authentication extension request. The possible values are: tokenIssuanceStart, pageRenderStart, unknownFutureValue, attributeCollectionStart, attributeCollectionSubmit, emailOtpSend. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: attributeCollectionStart, attributeCollectionSubmit, emailOtpSend.
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final AuthenticationEventType value) {
        this.backingStore.set("eventType", value);
    }
    /**
     * Sets the executedListenerId property value. ID of the authentication event listener that was executed.
     * @param value Value to set for the executedListenerId property.
     */
    public void setExecutedListenerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("executedListenerId", value);
    }
    /**
     * Sets the handlerResult property value. The result from the listening client, such as an Azure Logic App and Azure Functions, of this authentication event.
     * @param value Value to set for the handlerResult property.
     */
    public void setHandlerResult(@jakarta.annotation.Nullable final AuthenticationEventHandlerResult value) {
        this.backingStore.set("handlerResult", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

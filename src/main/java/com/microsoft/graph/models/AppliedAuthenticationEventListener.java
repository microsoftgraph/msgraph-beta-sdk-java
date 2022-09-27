package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppliedAuthenticationEventListener implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The eventType property */
    private AuthenticationEventType _eventType;
    /** The executedListenerId property */
    private String _executedListenerId;
    /** The handlerResult property */
    private AuthenticationEventHandlerResult _handlerResult;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new appliedAuthenticationEventListener and sets the default values.
     * @return a void
     */
    public AppliedAuthenticationEventListener() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.appliedAuthenticationEventListener");
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
        return this._additionalData;
    }
    /**
     * Gets the eventType property value. The eventType property
     * @return a authenticationEventType
     */
    @javax.annotation.Nullable
    public AuthenticationEventType getEventType() {
        return this._eventType;
    }
    /**
     * Gets the executedListenerId property value. The executedListenerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExecutedListenerId() {
        return this._executedListenerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppliedAuthenticationEventListener currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("eventType", (n) -> { currentObject.setEventType(n.getEnumValue(AuthenticationEventType.class)); });
            this.put("executedListenerId", (n) -> { currentObject.setExecutedListenerId(n.getStringValue()); });
            this.put("handlerResult", (n) -> { currentObject.setHandlerResult(n.getObjectValue(AuthenticationEventHandlerResult::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the handlerResult property value. The handlerResult property
     * @return a authenticationEventHandlerResult
     */
    @javax.annotation.Nullable
    public AuthenticationEventHandlerResult getHandlerResult() {
        return this._handlerResult;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     * @return a void
     */
    public void setEventType(@javax.annotation.Nullable final AuthenticationEventType value) {
        this._eventType = value;
    }
    /**
     * Sets the executedListenerId property value. The executedListenerId property
     * @param value Value to set for the executedListenerId property.
     * @return a void
     */
    public void setExecutedListenerId(@javax.annotation.Nullable final String value) {
        this._executedListenerId = value;
    }
    /**
     * Sets the handlerResult property value. The handlerResult property
     * @param value Value to set for the handlerResult property.
     * @return a void
     */
    public void setHandlerResult(@javax.annotation.Nullable final AuthenticationEventHandlerResult value) {
        this._handlerResult = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}

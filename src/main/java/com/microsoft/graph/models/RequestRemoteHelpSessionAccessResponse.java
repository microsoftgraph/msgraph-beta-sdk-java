package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Remote help - response we provide back to the helper after getting response from pubSub
 */
public class RequestRemoteHelpSessionAccessResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The OdataType property */
    private String odataType;
    /** AES encryption Initialization Vector for encrypting client messages sent to PubSub */
    private String pubSubEncryption;
    /** The unique identifier for encrypting client messages sent to PubSub */
    private String pubSubEncryptionKey;
    /** The unique identifier for a session */
    private String sessionKey;
    /**
     * Instantiates a new requestRemoteHelpSessionAccessResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RequestRemoteHelpSessionAccessResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requestRemoteHelpSessionAccessResponse
     */
    @javax.annotation.Nonnull
    public static RequestRemoteHelpSessionAccessResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestRemoteHelpSessionAccessResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pubSubEncryption", (n) -> { this.setPubSubEncryption(n.getStringValue()); });
        deserializerMap.put("pubSubEncryptionKey", (n) -> { this.setPubSubEncryptionKey(n.getStringValue()); });
        deserializerMap.put("sessionKey", (n) -> { this.setSessionKey(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the pubSubEncryption property value. AES encryption Initialization Vector for encrypting client messages sent to PubSub
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPubSubEncryption() {
        return this.pubSubEncryption;
    }
    /**
     * Gets the pubSubEncryptionKey property value. The unique identifier for encrypting client messages sent to PubSub
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPubSubEncryptionKey() {
        return this.pubSubEncryptionKey;
    }
    /**
     * Gets the sessionKey property value. The unique identifier for a session
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSessionKey() {
        return this.sessionKey;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("pubSubEncryption", this.getPubSubEncryption());
        writer.writeStringValue("pubSubEncryptionKey", this.getPubSubEncryptionKey());
        writer.writeStringValue("sessionKey", this.getSessionKey());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the pubSubEncryption property value. AES encryption Initialization Vector for encrypting client messages sent to PubSub
     * @param value Value to set for the pubSubEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPubSubEncryption(@javax.annotation.Nullable final String value) {
        this.pubSubEncryption = value;
    }
    /**
     * Sets the pubSubEncryptionKey property value. The unique identifier for encrypting client messages sent to PubSub
     * @param value Value to set for the pubSubEncryptionKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPubSubEncryptionKey(@javax.annotation.Nullable final String value) {
        this.pubSubEncryptionKey = value;
    }
    /**
     * Sets the sessionKey property value. The unique identifier for a session
     * @param value Value to set for the sessionKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionKey(@javax.annotation.Nullable final String value) {
        this.sessionKey = value;
    }
}

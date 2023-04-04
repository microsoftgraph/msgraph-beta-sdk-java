package com.microsoft.graph.users.item.manageddevices.item.requestremotehelpsessionaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequestRemoteHelpSessionAccessPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The pubSubConnectionId property */
    private String pubSubConnectionId;
    /** The sessionKey property */
    private String sessionKey;
    /**
     * Instantiates a new requestRemoteHelpSessionAccessPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RequestRemoteHelpSessionAccessPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requestRemoteHelpSessionAccessPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RequestRemoteHelpSessionAccessPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestRemoteHelpSessionAccessPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("pubSubConnectionId", (n) -> { this.setPubSubConnectionId(n.getStringValue()); });
        deserializerMap.put("sessionKey", (n) -> { this.setSessionKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pubSubConnectionId property value. The pubSubConnectionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPubSubConnectionId() {
        return this.pubSubConnectionId;
    }
    /**
     * Gets the sessionKey property value. The sessionKey property
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
        writer.writeStringValue("pubSubConnectionId", this.getPubSubConnectionId());
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
     * Sets the pubSubConnectionId property value. The pubSubConnectionId property
     * @param value Value to set for the pubSubConnectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPubSubConnectionId(@javax.annotation.Nullable final String value) {
        this.pubSubConnectionId = value;
    }
    /**
     * Sets the sessionKey property value. The sessionKey property
     * @param value Value to set for the sessionKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionKey(@javax.annotation.Nullable final String value) {
        this.sessionKey = value;
    }
}

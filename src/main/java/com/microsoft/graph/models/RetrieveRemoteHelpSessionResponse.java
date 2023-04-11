package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Remote help - response we provide back to the helper on retrieve session API call
 */
public class RetrieveRemoteHelpSessionResponse implements AdditionalDataHolder, Parsable {
    /** ACS Group Id */
    private String acsGroupId;
    /** Helper ACS User Id */
    private String acsHelperUserId;
    /** Helper ACS User Token */
    private String acsHelperUserToken;
    /** Sharer ACS User Id */
    private String acsSharerUserId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Android Device Name */
    private String deviceName;
    /** The OdataType property */
    private String odataType;
    /** Azure Pubsub Group Id */
    private String pubSubGroupId;
    /** Azure Pubsub Group Id */
    private String pubSubHelperAccessUri;
    /** Azure Pubsub Session Expiration Date Time. */
    private OffsetDateTime sessionExpirationDateTime;
    /** The unique identifier for a session */
    private String sessionKey;
    /**
     * Instantiates a new retrieveRemoteHelpSessionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RetrieveRemoteHelpSessionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a retrieveRemoteHelpSessionResponse
     */
    @javax.annotation.Nonnull
    public static RetrieveRemoteHelpSessionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetrieveRemoteHelpSessionResponse();
    }
    /**
     * Gets the acsGroupId property value. ACS Group Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAcsGroupId() {
        return this.acsGroupId;
    }
    /**
     * Gets the acsHelperUserId property value. Helper ACS User Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAcsHelperUserId() {
        return this.acsHelperUserId;
    }
    /**
     * Gets the acsHelperUserToken property value. Helper ACS User Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAcsHelperUserToken() {
        return this.acsHelperUserToken;
    }
    /**
     * Gets the acsSharerUserId property value. Sharer ACS User Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAcsSharerUserId() {
        return this.acsSharerUserId;
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
     * Gets the deviceName property value. Android Device Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("acsGroupId", (n) -> { this.setAcsGroupId(n.getStringValue()); });
        deserializerMap.put("acsHelperUserId", (n) -> { this.setAcsHelperUserId(n.getStringValue()); });
        deserializerMap.put("acsHelperUserToken", (n) -> { this.setAcsHelperUserToken(n.getStringValue()); });
        deserializerMap.put("acsSharerUserId", (n) -> { this.setAcsSharerUserId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pubSubGroupId", (n) -> { this.setPubSubGroupId(n.getStringValue()); });
        deserializerMap.put("pubSubHelperAccessUri", (n) -> { this.setPubSubHelperAccessUri(n.getStringValue()); });
        deserializerMap.put("sessionExpirationDateTime", (n) -> { this.setSessionExpirationDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the pubSubGroupId property value. Azure Pubsub Group Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPubSubGroupId() {
        return this.pubSubGroupId;
    }
    /**
     * Gets the pubSubHelperAccessUri property value. Azure Pubsub Group Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPubSubHelperAccessUri() {
        return this.pubSubHelperAccessUri;
    }
    /**
     * Gets the sessionExpirationDateTime property value. Azure Pubsub Session Expiration Date Time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSessionExpirationDateTime() {
        return this.sessionExpirationDateTime;
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
        writer.writeStringValue("acsGroupId", this.getAcsGroupId());
        writer.writeStringValue("acsHelperUserId", this.getAcsHelperUserId());
        writer.writeStringValue("acsHelperUserToken", this.getAcsHelperUserToken());
        writer.writeStringValue("acsSharerUserId", this.getAcsSharerUserId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("pubSubGroupId", this.getPubSubGroupId());
        writer.writeStringValue("pubSubHelperAccessUri", this.getPubSubHelperAccessUri());
        writer.writeOffsetDateTimeValue("sessionExpirationDateTime", this.getSessionExpirationDateTime());
        writer.writeStringValue("sessionKey", this.getSessionKey());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acsGroupId property value. ACS Group Id
     * @param value Value to set for the acsGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcsGroupId(@javax.annotation.Nullable final String value) {
        this.acsGroupId = value;
    }
    /**
     * Sets the acsHelperUserId property value. Helper ACS User Id
     * @param value Value to set for the acsHelperUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcsHelperUserId(@javax.annotation.Nullable final String value) {
        this.acsHelperUserId = value;
    }
    /**
     * Sets the acsHelperUserToken property value. Helper ACS User Token
     * @param value Value to set for the acsHelperUserToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcsHelperUserToken(@javax.annotation.Nullable final String value) {
        this.acsHelperUserToken = value;
    }
    /**
     * Sets the acsSharerUserId property value. Sharer ACS User Id
     * @param value Value to set for the acsSharerUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcsSharerUserId(@javax.annotation.Nullable final String value) {
        this.acsSharerUserId = value;
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
     * Sets the deviceName property value. Android Device Name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
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
     * Sets the pubSubGroupId property value. Azure Pubsub Group Id
     * @param value Value to set for the pubSubGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPubSubGroupId(@javax.annotation.Nullable final String value) {
        this.pubSubGroupId = value;
    }
    /**
     * Sets the pubSubHelperAccessUri property value. Azure Pubsub Group Id
     * @param value Value to set for the pubSubHelperAccessUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPubSubHelperAccessUri(@javax.annotation.Nullable final String value) {
        this.pubSubHelperAccessUri = value;
    }
    /**
     * Sets the sessionExpirationDateTime property value. Azure Pubsub Session Expiration Date Time.
     * @param value Value to set for the sessionExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.sessionExpirationDateTime = value;
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

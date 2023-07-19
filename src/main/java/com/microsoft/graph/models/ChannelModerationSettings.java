package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChannelModerationSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether bots are allowed to post messages.
     */
    private Boolean allowNewMessageFromBots;
    /**
     * Indicates whether connectors are allowed to post messages.
     */
    private Boolean allowNewMessageFromConnectors;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     */
    private ReplyRestriction replyRestriction;
    /**
     * Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     */
    private UserNewMessageRestriction userNewMessageRestriction;
    /**
     * Instantiates a new channelModerationSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChannelModerationSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a channelModerationSettings
     */
    @javax.annotation.Nonnull
    public static ChannelModerationSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelModerationSettings();
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
     * Gets the allowNewMessageFromBots property value. Indicates whether bots are allowed to post messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowNewMessageFromBots() {
        return this.allowNewMessageFromBots;
    }
    /**
     * Gets the allowNewMessageFromConnectors property value. Indicates whether connectors are allowed to post messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowNewMessageFromConnectors() {
        return this.allowNewMessageFromConnectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowNewMessageFromBots", (n) -> { this.setAllowNewMessageFromBots(n.getBooleanValue()); });
        deserializerMap.put("allowNewMessageFromConnectors", (n) -> { this.setAllowNewMessageFromConnectors(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("replyRestriction", (n) -> { this.setReplyRestriction(n.getEnumValue(ReplyRestriction.class)); });
        deserializerMap.put("userNewMessageRestriction", (n) -> { this.setUserNewMessageRestriction(n.getEnumValue(UserNewMessageRestriction.class)); });
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
     * Gets the replyRestriction property value. Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     * @return a replyRestriction
     */
    @javax.annotation.Nullable
    public ReplyRestriction getReplyRestriction() {
        return this.replyRestriction;
    }
    /**
     * Gets the userNewMessageRestriction property value. Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     * @return a userNewMessageRestriction
     */
    @javax.annotation.Nullable
    public UserNewMessageRestriction getUserNewMessageRestriction() {
        return this.userNewMessageRestriction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowNewMessageFromBots", this.getAllowNewMessageFromBots());
        writer.writeBooleanValue("allowNewMessageFromConnectors", this.getAllowNewMessageFromConnectors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("replyRestriction", this.getReplyRestriction());
        writer.writeEnumValue("userNewMessageRestriction", this.getUserNewMessageRestriction());
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
     * Sets the allowNewMessageFromBots property value. Indicates whether bots are allowed to post messages.
     * @param value Value to set for the allowNewMessageFromBots property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowNewMessageFromBots(@javax.annotation.Nullable final Boolean value) {
        this.allowNewMessageFromBots = value;
    }
    /**
     * Sets the allowNewMessageFromConnectors property value. Indicates whether connectors are allowed to post messages.
     * @param value Value to set for the allowNewMessageFromConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowNewMessageFromConnectors(@javax.annotation.Nullable final Boolean value) {
        this.allowNewMessageFromConnectors = value;
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
     * Sets the replyRestriction property value. Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     * @param value Value to set for the replyRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyRestriction(@javax.annotation.Nullable final ReplyRestriction value) {
        this.replyRestriction = value;
    }
    /**
     * Sets the userNewMessageRestriction property value. Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     * @param value Value to set for the userNewMessageRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserNewMessageRestriction(@javax.annotation.Nullable final UserNewMessageRestriction value) {
        this.userNewMessageRestriction = value;
    }
}

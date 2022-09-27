package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChannelModerationSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether bots are allowed to post messages. */
    private Boolean _allowNewMessageFromBots;
    /** Indicates whether connectors are allowed to post messages. */
    private Boolean _allowNewMessageFromConnectors;
    /** The OdataType property */
    private String _odataType;
    /** Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue. */
    private ReplyRestriction _replyRestriction;
    /** Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue. */
    private UserNewMessageRestriction _userNewMessageRestriction;
    /**
     * Instantiates a new channelModerationSettings and sets the default values.
     * @return a void
     */
    public ChannelModerationSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.channelModerationSettings");
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
        return this._additionalData;
    }
    /**
     * Gets the allowNewMessageFromBots property value. Indicates whether bots are allowed to post messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowNewMessageFromBots() {
        return this._allowNewMessageFromBots;
    }
    /**
     * Gets the allowNewMessageFromConnectors property value. Indicates whether connectors are allowed to post messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowNewMessageFromConnectors() {
        return this._allowNewMessageFromConnectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChannelModerationSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("allowNewMessageFromBots", (n) -> { currentObject.setAllowNewMessageFromBots(n.getBooleanValue()); });
            this.put("allowNewMessageFromConnectors", (n) -> { currentObject.setAllowNewMessageFromConnectors(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("replyRestriction", (n) -> { currentObject.setReplyRestriction(n.getEnumValue(ReplyRestriction.class)); });
            this.put("userNewMessageRestriction", (n) -> { currentObject.setUserNewMessageRestriction(n.getEnumValue(UserNewMessageRestriction.class)); });
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
     * Gets the replyRestriction property value. Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     * @return a replyRestriction
     */
    @javax.annotation.Nullable
    public ReplyRestriction getReplyRestriction() {
        return this._replyRestriction;
    }
    /**
     * Gets the userNewMessageRestriction property value. Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     * @return a userNewMessageRestriction
     */
    @javax.annotation.Nullable
    public UserNewMessageRestriction getUserNewMessageRestriction() {
        return this._userNewMessageRestriction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowNewMessageFromBots property value. Indicates whether bots are allowed to post messages.
     * @param value Value to set for the allowNewMessageFromBots property.
     * @return a void
     */
    public void setAllowNewMessageFromBots(@javax.annotation.Nullable final Boolean value) {
        this._allowNewMessageFromBots = value;
    }
    /**
     * Sets the allowNewMessageFromConnectors property value. Indicates whether connectors are allowed to post messages.
     * @param value Value to set for the allowNewMessageFromConnectors property.
     * @return a void
     */
    public void setAllowNewMessageFromConnectors(@javax.annotation.Nullable final Boolean value) {
        this._allowNewMessageFromConnectors = value;
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
     * Sets the replyRestriction property value. Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     * @param value Value to set for the replyRestriction property.
     * @return a void
     */
    public void setReplyRestriction(@javax.annotation.Nullable final ReplyRestriction value) {
        this._replyRestriction = value;
    }
    /**
     * Sets the userNewMessageRestriction property value. Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     * @param value Value to set for the userNewMessageRestriction property.
     * @return a void
     */
    public void setUserNewMessageRestriction(@javax.annotation.Nullable final UserNewMessageRestriction value) {
        this._userNewMessageRestriction = value;
    }
}

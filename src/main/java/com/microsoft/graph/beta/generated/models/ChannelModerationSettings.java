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
public class ChannelModerationSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ChannelModerationSettings and sets the default values.
     */
    public ChannelModerationSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelModerationSettings
     */
    @jakarta.annotation.Nonnull
    public static ChannelModerationSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelModerationSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the allowNewMessageFromBots property value. Indicates whether bots are allowed to post messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNewMessageFromBots() {
        return this.backingStore.get("allowNewMessageFromBots");
    }
    /**
     * Gets the allowNewMessageFromConnectors property value. Indicates whether connectors are allowed to post messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNewMessageFromConnectors() {
        return this.backingStore.get("allowNewMessageFromConnectors");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowNewMessageFromBots", (n) -> { this.setAllowNewMessageFromBots(n.getBooleanValue()); });
        deserializerMap.put("allowNewMessageFromConnectors", (n) -> { this.setAllowNewMessageFromConnectors(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("replyRestriction", (n) -> { this.setReplyRestriction(n.getEnumValue(ReplyRestriction::forValue)); });
        deserializerMap.put("userNewMessageRestriction", (n) -> { this.setUserNewMessageRestriction(n.getEnumValue(UserNewMessageRestriction::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the replyRestriction property value. Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     * @return a ReplyRestriction
     */
    @jakarta.annotation.Nullable
    public ReplyRestriction getReplyRestriction() {
        return this.backingStore.get("replyRestriction");
    }
    /**
     * Gets the userNewMessageRestriction property value. Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     * @return a UserNewMessageRestriction
     */
    @jakarta.annotation.Nullable
    public UserNewMessageRestriction getUserNewMessageRestriction() {
        return this.backingStore.get("userNewMessageRestriction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowNewMessageFromBots", this.getAllowNewMessageFromBots());
        writer.writeBooleanValue("allowNewMessageFromConnectors", this.getAllowNewMessageFromConnectors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("replyRestriction", this.getReplyRestriction());
        writer.writeEnumValue("userNewMessageRestriction", this.getUserNewMessageRestriction());
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
     * Sets the allowNewMessageFromBots property value. Indicates whether bots are allowed to post messages.
     * @param value Value to set for the allowNewMessageFromBots property.
     */
    public void setAllowNewMessageFromBots(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowNewMessageFromBots", value);
    }
    /**
     * Sets the allowNewMessageFromConnectors property value. Indicates whether connectors are allowed to post messages.
     * @param value Value to set for the allowNewMessageFromConnectors property.
     */
    public void setAllowNewMessageFromConnectors(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowNewMessageFromConnectors", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the replyRestriction property value. Indicates who is allowed to reply to the teams channel. Possible values are: everyone, authorAndModerators, unknownFutureValue.
     * @param value Value to set for the replyRestriction property.
     */
    public void setReplyRestriction(@jakarta.annotation.Nullable final ReplyRestriction value) {
        this.backingStore.set("replyRestriction", value);
    }
    /**
     * Sets the userNewMessageRestriction property value. Indicates who is allowed to post messages to teams channel. Possible values are: everyone, everyoneExceptGuests, moderators, unknownFutureValue.
     * @param value Value to set for the userNewMessageRestriction property.
     */
    public void setUserNewMessageRestriction(@jakarta.annotation.Nullable final UserNewMessageRestriction value) {
        this.backingStore.set("userNewMessageRestriction", value);
    }
}

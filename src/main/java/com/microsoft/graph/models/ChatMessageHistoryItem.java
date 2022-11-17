package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessageHistoryItem implements AdditionalDataHolder, Parsable {
    /** The actions property */
    private ChatMessageActions _actions;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The modifiedDateTime property */
    private OffsetDateTime _modifiedDateTime;
    /** The OdataType property */
    private String _odataType;
    /** The reaction property */
    private ChatMessageReaction _reaction;
    /**
     * Instantiates a new chatMessageHistoryItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessageHistoryItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.chatMessageHistoryItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessageHistoryItem
     */
    @javax.annotation.Nonnull
    public static ChatMessageHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessageHistoryItem();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a chatMessageActions
     */
    @javax.annotation.Nullable
    public ChatMessageActions getActions() {
        return this._actions;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatMessageHistoryItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("actions", (n) -> { currentObject.setActions(n.getEnumValue(ChatMessageActions.class)); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("reaction", (n) -> { currentObject.setReaction(n.getObjectValue(ChatMessageReaction::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the modifiedDateTime property value. The modifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
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
     * Gets the reaction property value. The reaction property
     * @return a chatMessageReaction
     */
    @javax.annotation.Nullable
    public ChatMessageReaction getReaction() {
        return this._reaction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actions", this.getActions());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("reaction", this.getReaction());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActions(@javax.annotation.Nullable final ChatMessageActions value) {
        this._actions = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the modifiedDateTime property value. The modifiedDateTime property
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reaction property value. The reaction property
     * @param value Value to set for the reaction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReaction(@javax.annotation.Nullable final ChatMessageReaction value) {
        this._reaction = value;
    }
}

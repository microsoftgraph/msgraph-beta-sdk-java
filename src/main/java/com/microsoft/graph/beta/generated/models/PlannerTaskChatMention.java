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
public class PlannerTaskChatMention implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlannerTaskChatMention} and sets the default values.
     */
    public PlannerTaskChatMention() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTaskChatMention}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskChatMention createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskChatMention();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("mentioned", (n) -> { this.setMentioned(n.getStringValue()); });
        deserializerMap.put("mentionType", (n) -> { this.setMentionType(n.getEnumValue(PlannerTaskChatMentionType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mentioned property value. The ID of the mentioned user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMentioned() {
        return this.backingStore.get("mentioned");
    }
    /**
     * Gets the mentionType property value. The mentionType property
     * @return a {@link PlannerTaskChatMentionType}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskChatMentionType getMentionType() {
        return this.backingStore.get("mentionType");
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
     * Gets the position property value. The zero-based position of the mention in the message content.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPosition() {
        return this.backingStore.get("position");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("mentioned", this.getMentioned());
        writer.writeEnumValue("mentionType", this.getMentionType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("position", this.getPosition());
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
     * Sets the mentioned property value. The ID of the mentioned user.
     * @param value Value to set for the mentioned property.
     */
    public void setMentioned(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mentioned", value);
    }
    /**
     * Sets the mentionType property value. The mentionType property
     * @param value Value to set for the mentionType property.
     */
    public void setMentionType(@jakarta.annotation.Nullable final PlannerTaskChatMentionType value) {
        this.backingStore.set("mentionType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the position property value. The zero-based position of the mention in the message content.
     * @param value Value to set for the position property.
     */
    public void setPosition(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("position", value);
    }
}

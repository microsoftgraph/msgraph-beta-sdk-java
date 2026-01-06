package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a response message in a chat.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotConversationResponseMessage extends CopilotConversationMessage implements Parsable {
    /**
     * Instantiates a new {@link CopilotConversationResponseMessage} and sets the default values.
     */
    public CopilotConversationResponseMessage() {
        super();
        this.setOdataType("#microsoft.graph.copilotConversationResponseMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotConversationResponseMessage}
     */
    @jakarta.annotation.Nonnull
    public static CopilotConversationResponseMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotConversationResponseMessage();
    }
    /**
     * Gets the adaptiveCards property value. The adaptiveCards property
     * @return a {@link java.util.List<Json>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Json> getAdaptiveCards() {
        return this.backingStore.get("adaptiveCards");
    }
    /**
     * Gets the attributions property value. The attributions property
     * @return a {@link java.util.List<CopilotConversationAttribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CopilotConversationAttribution> getAttributions() {
        return this.backingStore.get("attributions");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adaptiveCards", (n) -> { this.setAdaptiveCards(n.getCollectionOfObjectValues(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("attributions", (n) -> { this.setAttributions(n.getCollectionOfObjectValues(CopilotConversationAttribution::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sensitivityLabel", (n) -> { this.setSensitivityLabel(n.getObjectValue(SearchSensitivityLabelInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sensitivityLabel property value. The sensitivityLabel property
     * @return a {@link SearchSensitivityLabelInfo}
     */
    @jakarta.annotation.Nullable
    public SearchSensitivityLabelInfo getSensitivityLabel() {
        return this.backingStore.get("sensitivityLabel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the adaptiveCards property value. The adaptiveCards property
     * @param value Value to set for the adaptiveCards property.
     */
    public void setAdaptiveCards(@jakarta.annotation.Nullable final java.util.List<Json> value) {
        this.backingStore.set("adaptiveCards", value);
    }
    /**
     * Sets the attributions property value. The attributions property
     * @param value Value to set for the attributions property.
     */
    public void setAttributions(@jakarta.annotation.Nullable final java.util.List<CopilotConversationAttribution> value) {
        this.backingStore.set("attributions", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the sensitivityLabel property value. The sensitivityLabel property
     * @param value Value to set for the sensitivityLabel property.
     */
    public void setSensitivityLabel(@jakarta.annotation.Nullable final SearchSensitivityLabelInfo value) {
        this.backingStore.set("sensitivityLabel", value);
    }
}

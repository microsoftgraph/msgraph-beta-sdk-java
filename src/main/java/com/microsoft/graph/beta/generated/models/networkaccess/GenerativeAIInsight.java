package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GenerativeAIInsight implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link GenerativeAIInsight} and sets the default values.
     */
    public GenerativeAIInsight() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GenerativeAIInsight}
     */
    @jakarta.annotation.Nonnull
    public static GenerativeAIInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GenerativeAIInsight();
    }
    /**
     * Gets the activity property value. The activity property
     * @return a {@link ApplicationActivity}
     */
    @jakarta.annotation.Nullable
    public ApplicationActivity getActivity() {
        return this.backingStore.get("activity");
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
     * Gets the content property value. The prompt text or content captured for this insight. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the insight was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z. Supports $filter (eq) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the destinationUrl property value. The destination URL associated with this insight. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationUrl() {
        return this.backingStore.get("destinationUrl");
    }
    /**
     * Gets the eventId property value. The unique identifier for the event. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventId() {
        return this.backingStore.get("eventId");
    }
    /**
     * Gets the eventType property value. The event type that classifies the insight event. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.backingStore.get("eventType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getEnumValue(ApplicationActivity::forValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("destinationUrl", (n) -> { this.setDestinationUrl(n.getStringValue()); });
        deserializerMap.put("eventId", (n) -> { this.setEventId(n.getStringValue()); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("mcpClientName", (n) -> { this.setMcpClientName(n.getStringValue()); });
        deserializerMap.put("mcpServerName", (n) -> { this.setMcpServerName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("subactivity", (n) -> { this.setSubactivity(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mcpClientName property value. The MCP client name when the activity is related to MCP interactions. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMcpClientName() {
        return this.backingStore.get("mcpClientName");
    }
    /**
     * Gets the mcpServerName property value. The MCP server name when the activity is related to MCP interactions. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMcpServerName() {
        return this.backingStore.get("mcpServerName");
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
     * Gets the sessionId property value. The session identifier used to correlate related events. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.backingStore.get("sessionId");
    }
    /**
     * Gets the subactivity property value. A finer-grained classification of activity, such as chat-interaction, tools/call, or data-analysis. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubactivity() {
        return this.backingStore.get("subactivity");
    }
    /**
     * Gets the transactionId property value. A unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.backingStore.get("transactionId");
    }
    /**
     * Gets the userPrincipalName property value. The UPN of the user associated with this insight. Supports $filter (eq) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("activity", this.getActivity());
        writer.writeStringValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("destinationUrl", this.getDestinationUrl());
        writer.writeStringValue("eventId", this.getEventId());
        writer.writeStringValue("eventType", this.getEventType());
        writer.writeStringValue("mcpClientName", this.getMcpClientName());
        writer.writeStringValue("mcpServerName", this.getMcpServerName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeStringValue("subactivity", this.getSubactivity());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final ApplicationActivity value) {
        this.backingStore.set("activity", value);
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
     * Sets the content property value. The prompt text or content captured for this insight. Supports $filter (eq) and $orderby.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the insight was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z. Supports $filter (eq) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the destinationUrl property value. The destination URL associated with this insight. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationUrl property.
     */
    public void setDestinationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationUrl", value);
    }
    /**
     * Sets the eventId property value. The unique identifier for the event. Supports $filter (eq) and $orderby.
     * @param value Value to set for the eventId property.
     */
    public void setEventId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventId", value);
    }
    /**
     * Sets the eventType property value. The event type that classifies the insight event. Supports $filter (eq) and $orderby.
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventType", value);
    }
    /**
     * Sets the mcpClientName property value. The MCP client name when the activity is related to MCP interactions. Supports $filter (eq) and $orderby.
     * @param value Value to set for the mcpClientName property.
     */
    public void setMcpClientName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mcpClientName", value);
    }
    /**
     * Sets the mcpServerName property value. The MCP server name when the activity is related to MCP interactions. Supports $filter (eq) and $orderby.
     * @param value Value to set for the mcpServerName property.
     */
    public void setMcpServerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mcpServerName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sessionId property value. The session identifier used to correlate related events. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionId", value);
    }
    /**
     * Sets the subactivity property value. A finer-grained classification of activity, such as chat-interaction, tools/call, or data-analysis. Supports $filter (eq) and $orderby.
     * @param value Value to set for the subactivity property.
     */
    public void setSubactivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subactivity", value);
    }
    /**
     * Sets the transactionId property value. A unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("transactionId", value);
    }
    /**
     * Sets the userPrincipalName property value. The UPN of the user associated with this insight. Supports $filter (eq) and $orderby.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}

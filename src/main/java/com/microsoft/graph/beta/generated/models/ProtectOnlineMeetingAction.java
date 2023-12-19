package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectOnlineMeetingAction extends LabelActionBase implements Parsable {
    /**
     * Instantiates a new ProtectOnlineMeetingAction and sets the default values.
     */
    public ProtectOnlineMeetingAction() {
        super();
        this.setOdataType("#microsoft.graph.protectOnlineMeetingAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProtectOnlineMeetingAction
     */
    @jakarta.annotation.Nonnull
    public static ProtectOnlineMeetingAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectOnlineMeetingAction();
    }
    /**
     * Gets the allowedForwarders property value. The allowedForwarders property
     * @return a ProtectOnlineMeetingActionAllowedForwarders
     */
    @jakarta.annotation.Nullable
    public ProtectOnlineMeetingActionAllowedForwarders getAllowedForwarders() {
        return this.backingStore.get("allowedForwarders");
    }
    /**
     * Gets the allowedPresenters property value. The allowedPresenters property
     * @return a ProtectOnlineMeetingActionAllowedPresenters
     */
    @jakarta.annotation.Nullable
    public ProtectOnlineMeetingActionAllowedPresenters getAllowedPresenters() {
        return this.backingStore.get("allowedPresenters");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedForwarders", (n) -> { this.setAllowedForwarders(n.getEnumValue(ProtectOnlineMeetingActionAllowedForwarders::forValue)); });
        deserializerMap.put("allowedPresenters", (n) -> { this.setAllowedPresenters(n.getEnumValue(ProtectOnlineMeetingActionAllowedPresenters::forValue)); });
        deserializerMap.put("isCopyToClipboardEnabled", (n) -> { this.setIsCopyToClipboardEnabled(n.getBooleanValue()); });
        deserializerMap.put("isLobbyEnabled", (n) -> { this.setIsLobbyEnabled(n.getBooleanValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { this.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isCopyToClipboardEnabled property value. The isCopyToClipboardEnabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCopyToClipboardEnabled() {
        return this.backingStore.get("isCopyToClipboardEnabled");
    }
    /**
     * Gets the isLobbyEnabled property value. The isLobbyEnabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLobbyEnabled() {
        return this.backingStore.get("isLobbyEnabled");
    }
    /**
     * Gets the lobbyBypassSettings property value. The lobbyBypassSettings property
     * @return a LobbyBypassSettings
     */
    @jakarta.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this.backingStore.get("lobbyBypassSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowedForwarders", this.getAllowedForwarders());
        writer.writeEnumValue("allowedPresenters", this.getAllowedPresenters());
        writer.writeBooleanValue("isCopyToClipboardEnabled", this.getIsCopyToClipboardEnabled());
        writer.writeBooleanValue("isLobbyEnabled", this.getIsLobbyEnabled());
        writer.writeObjectValue("lobbyBypassSettings", this.getLobbyBypassSettings());
    }
    /**
     * Sets the allowedForwarders property value. The allowedForwarders property
     * @param value Value to set for the allowedForwarders property.
     */
    public void setAllowedForwarders(@jakarta.annotation.Nullable final ProtectOnlineMeetingActionAllowedForwarders value) {
        this.backingStore.set("allowedForwarders", value);
    }
    /**
     * Sets the allowedPresenters property value. The allowedPresenters property
     * @param value Value to set for the allowedPresenters property.
     */
    public void setAllowedPresenters(@jakarta.annotation.Nullable final ProtectOnlineMeetingActionAllowedPresenters value) {
        this.backingStore.set("allowedPresenters", value);
    }
    /**
     * Sets the isCopyToClipboardEnabled property value. The isCopyToClipboardEnabled property
     * @param value Value to set for the isCopyToClipboardEnabled property.
     */
    public void setIsCopyToClipboardEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCopyToClipboardEnabled", value);
    }
    /**
     * Sets the isLobbyEnabled property value. The isLobbyEnabled property
     * @param value Value to set for the isLobbyEnabled property.
     */
    public void setIsLobbyEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLobbyEnabled", value);
    }
    /**
     * Sets the lobbyBypassSettings property value. The lobbyBypassSettings property
     * @param value Value to set for the lobbyBypassSettings property.
     */
    public void setLobbyBypassSettings(@jakarta.annotation.Nullable final LobbyBypassSettings value) {
        this.backingStore.set("lobbyBypassSettings", value);
    }
}

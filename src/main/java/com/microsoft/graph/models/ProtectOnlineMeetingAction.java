package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProtectOnlineMeetingAction extends LabelActionBase implements Parsable {
    /**
     * The allowedForwarders property
     */
    private OnlineMeetingForwarders allowedForwarders;
    /**
     * The allowedPresenters property
     */
    private OnlineMeetingPresenters allowedPresenters;
    /**
     * The isCopyToClipboardEnabled property
     */
    private Boolean isCopyToClipboardEnabled;
    /**
     * The isLobbyEnabled property
     */
    private Boolean isLobbyEnabled;
    /**
     * The lobbyBypassSettings property
     */
    private LobbyBypassSettings lobbyBypassSettings;
    /**
     * Instantiates a new protectOnlineMeetingAction and sets the default values.
     */
    public ProtectOnlineMeetingAction() {
        super();
        this.setOdataType("#microsoft.graph.protectOnlineMeetingAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a protectOnlineMeetingAction
     */
    @jakarta.annotation.Nonnull
    public static ProtectOnlineMeetingAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectOnlineMeetingAction();
    }
    /**
     * Gets the allowedForwarders property value. The allowedForwarders property
     * @return a onlineMeetingForwarders
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingForwarders getAllowedForwarders() {
        return this.allowedForwarders;
    }
    /**
     * Gets the allowedPresenters property value. The allowedPresenters property
     * @return a onlineMeetingPresenters
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingPresenters getAllowedPresenters() {
        return this.allowedPresenters;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedForwarders", (n) -> { this.setAllowedForwarders(n.getEnumValue(OnlineMeetingForwarders.class)); });
        deserializerMap.put("allowedPresenters", (n) -> { this.setAllowedPresenters(n.getEnumValue(OnlineMeetingPresenters.class)); });
        deserializerMap.put("isCopyToClipboardEnabled", (n) -> { this.setIsCopyToClipboardEnabled(n.getBooleanValue()); });
        deserializerMap.put("isLobbyEnabled", (n) -> { this.setIsLobbyEnabled(n.getBooleanValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { this.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isCopyToClipboardEnabled property value. The isCopyToClipboardEnabled property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCopyToClipboardEnabled() {
        return this.isCopyToClipboardEnabled;
    }
    /**
     * Gets the isLobbyEnabled property value. The isLobbyEnabled property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLobbyEnabled() {
        return this.isLobbyEnabled;
    }
    /**
     * Gets the lobbyBypassSettings property value. The lobbyBypassSettings property
     * @return a lobbyBypassSettings
     */
    @jakarta.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this.lobbyBypassSettings;
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
    public void setAllowedForwarders(@jakarta.annotation.Nullable final OnlineMeetingForwarders value) {
        this.allowedForwarders = value;
    }
    /**
     * Sets the allowedPresenters property value. The allowedPresenters property
     * @param value Value to set for the allowedPresenters property.
     */
    public void setAllowedPresenters(@jakarta.annotation.Nullable final OnlineMeetingPresenters value) {
        this.allowedPresenters = value;
    }
    /**
     * Sets the isCopyToClipboardEnabled property value. The isCopyToClipboardEnabled property
     * @param value Value to set for the isCopyToClipboardEnabled property.
     */
    public void setIsCopyToClipboardEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCopyToClipboardEnabled = value;
    }
    /**
     * Sets the isLobbyEnabled property value. The isLobbyEnabled property
     * @param value Value to set for the isLobbyEnabled property.
     */
    public void setIsLobbyEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isLobbyEnabled = value;
    }
    /**
     * Sets the lobbyBypassSettings property value. The lobbyBypassSettings property
     * @param value Value to set for the lobbyBypassSettings property.
     */
    public void setLobbyBypassSettings(@jakarta.annotation.Nullable final LobbyBypassSettings value) {
        this.lobbyBypassSettings = value;
    }
}

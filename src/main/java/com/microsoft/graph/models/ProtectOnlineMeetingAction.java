package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProtectOnlineMeetingAction extends LabelActionBase implements Parsable {
    /** The allowedForwarders property */
    private OnlineMeetingForwarders _allowedForwarders;
    /** The allowedPresenters property */
    private OnlineMeetingPresenters _allowedPresenters;
    /** The isCopyToClipboardEnabled property */
    private Boolean _isCopyToClipboardEnabled;
    /** The isLobbyEnabled property */
    private Boolean _isLobbyEnabled;
    /** The lobbyBypassSettings property */
    private LobbyBypassSettings _lobbyBypassSettings;
    /**
     * Instantiates a new ProtectOnlineMeetingAction and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static ProtectOnlineMeetingAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectOnlineMeetingAction();
    }
    /**
     * Gets the allowedForwarders property value. The allowedForwarders property
     * @return a onlineMeetingForwarders
     */
    @javax.annotation.Nullable
    public OnlineMeetingForwarders getAllowedForwarders() {
        return this._allowedForwarders;
    }
    /**
     * Gets the allowedPresenters property value. The allowedPresenters property
     * @return a onlineMeetingPresenters
     */
    @javax.annotation.Nullable
    public OnlineMeetingPresenters getAllowedPresenters() {
        return this._allowedPresenters;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProtectOnlineMeetingAction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedForwarders", (n) -> { currentObject.setAllowedForwarders(n.getEnumValue(OnlineMeetingForwarders.class)); });
            this.put("allowedPresenters", (n) -> { currentObject.setAllowedPresenters(n.getEnumValue(OnlineMeetingPresenters.class)); });
            this.put("isCopyToClipboardEnabled", (n) -> { currentObject.setIsCopyToClipboardEnabled(n.getBooleanValue()); });
            this.put("isLobbyEnabled", (n) -> { currentObject.setIsLobbyEnabled(n.getBooleanValue()); });
            this.put("lobbyBypassSettings", (n) -> { currentObject.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isCopyToClipboardEnabled property value. The isCopyToClipboardEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCopyToClipboardEnabled() {
        return this._isCopyToClipboardEnabled;
    }
    /**
     * Gets the isLobbyEnabled property value. The isLobbyEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLobbyEnabled() {
        return this._isLobbyEnabled;
    }
    /**
     * Gets the lobbyBypassSettings property value. The lobbyBypassSettings property
     * @return a lobbyBypassSettings
     */
    @javax.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this._lobbyBypassSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAllowedForwarders(@javax.annotation.Nullable final OnlineMeetingForwarders value) {
        this._allowedForwarders = value;
    }
    /**
     * Sets the allowedPresenters property value. The allowedPresenters property
     * @param value Value to set for the allowedPresenters property.
     * @return a void
     */
    public void setAllowedPresenters(@javax.annotation.Nullable final OnlineMeetingPresenters value) {
        this._allowedPresenters = value;
    }
    /**
     * Sets the isCopyToClipboardEnabled property value. The isCopyToClipboardEnabled property
     * @param value Value to set for the isCopyToClipboardEnabled property.
     * @return a void
     */
    public void setIsCopyToClipboardEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isCopyToClipboardEnabled = value;
    }
    /**
     * Sets the isLobbyEnabled property value. The isLobbyEnabled property
     * @param value Value to set for the isLobbyEnabled property.
     * @return a void
     */
    public void setIsLobbyEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isLobbyEnabled = value;
    }
    /**
     * Sets the lobbyBypassSettings property value. The lobbyBypassSettings property
     * @param value Value to set for the lobbyBypassSettings property.
     * @return a void
     */
    public void setLobbyBypassSettings(@javax.annotation.Nullable final LobbyBypassSettings value) {
        this._lobbyBypassSettings = value;
    }
}

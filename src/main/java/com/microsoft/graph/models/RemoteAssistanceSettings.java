package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Remote assistance settings for the account
 */
public class RemoteAssistanceSettings extends Entity implements Parsable {
    /**
     * Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.
     */
    private Boolean allowSessionsToUnenrolledDevices;
    /**
     * Indicates if sessions to block chat function. This setting is configurable by the admin. Default value is false.
     */
    private Boolean blockChat;
    /**
     * State of remote assistance for the account
     */
    private RemoteAssistanceState remoteAssistanceState;
    /**
     * Instantiates a new remoteAssistanceSettings and sets the default values.
     */
    public RemoteAssistanceSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteAssistanceSettings
     */
    @jakarta.annotation.Nonnull
    public static RemoteAssistanceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteAssistanceSettings();
    }
    /**
     * Gets the allowSessionsToUnenrolledDevices property value. Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowSessionsToUnenrolledDevices() {
        return this.allowSessionsToUnenrolledDevices;
    }
    /**
     * Gets the blockChat property value. Indicates if sessions to block chat function. This setting is configurable by the admin. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockChat() {
        return this.blockChat;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowSessionsToUnenrolledDevices", (n) -> { this.setAllowSessionsToUnenrolledDevices(n.getBooleanValue()); });
        deserializerMap.put("blockChat", (n) -> { this.setBlockChat(n.getBooleanValue()); });
        deserializerMap.put("remoteAssistanceState", (n) -> { this.setRemoteAssistanceState(n.getEnumValue(RemoteAssistanceState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the remoteAssistanceState property value. State of remote assistance for the account
     * @return a remoteAssistanceState
     */
    @jakarta.annotation.Nullable
    public RemoteAssistanceState getRemoteAssistanceState() {
        return this.remoteAssistanceState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowSessionsToUnenrolledDevices", this.getAllowSessionsToUnenrolledDevices());
        writer.writeBooleanValue("blockChat", this.getBlockChat());
        writer.writeEnumValue("remoteAssistanceState", this.getRemoteAssistanceState());
    }
    /**
     * Sets the allowSessionsToUnenrolledDevices property value. Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.
     * @param value Value to set for the allowSessionsToUnenrolledDevices property.
     */
    public void setAllowSessionsToUnenrolledDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.allowSessionsToUnenrolledDevices = value;
    }
    /**
     * Sets the blockChat property value. Indicates if sessions to block chat function. This setting is configurable by the admin. Default value is false.
     * @param value Value to set for the blockChat property.
     */
    public void setBlockChat(@jakarta.annotation.Nullable final Boolean value) {
        this.blockChat = value;
    }
    /**
     * Sets the remoteAssistanceState property value. State of remote assistance for the account
     * @param value Value to set for the remoteAssistanceState property.
     */
    public void setRemoteAssistanceState(@jakarta.annotation.Nullable final RemoteAssistanceState value) {
        this.remoteAssistanceState = value;
    }
}

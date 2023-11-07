package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for user run state of the device management script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementScriptUserState extends Entity implements Parsable {
    /**
     * List of run states for this script across all devices of specific user.
     */
    private java.util.List<DeviceManagementScriptDeviceState> deviceRunStates;
    /**
     * Error device count for specific user.
     */
    private Integer errorDeviceCount;
    /**
     * Success device count for specific user.
     */
    private Integer successDeviceCount;
    /**
     * User principle name of specific user.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new DeviceManagementScriptUserState and sets the default values.
     */
    public DeviceManagementScriptUserState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementScriptUserState
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementScriptUserState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptUserState();
    }
    /**
     * Gets the deviceRunStates property value. List of run states for this script across all devices of specific user.
     * @return a java.util.List<DeviceManagementScriptDeviceState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptDeviceState> getDeviceRunStates() {
        return this.deviceRunStates;
    }
    /**
     * Gets the errorDeviceCount property value. Error device count for specific user.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceRunStates", (n) -> { this.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("successDeviceCount", (n) -> { this.setSuccessDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the successDeviceCount property value. Success device count for specific user.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessDeviceCount() {
        return this.successDeviceCount;
    }
    /**
     * Gets the userPrincipalName property value. User principle name of specific user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deviceRunStates", this.getDeviceRunStates());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("successDeviceCount", this.getSuccessDeviceCount());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deviceRunStates property value. List of run states for this script across all devices of specific user.
     * @param value Value to set for the deviceRunStates property.
     */
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptDeviceState> value) {
        this.deviceRunStates = value;
    }
    /**
     * Sets the errorDeviceCount property value. Error device count for specific user.
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the successDeviceCount property value. Success device count for specific user.
     * @param value Value to set for the successDeviceCount property.
     */
    public void setSuccessDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.successDeviceCount = value;
    }
    /**
     * Sets the userPrincipalName property value. User principle name of specific user.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for user run state of the device management script. */
public class DeviceManagementScriptUserState extends Entity implements Parsable {
    /** List of run states for this script across all devices of specific user. */
    private java.util.List<DeviceManagementScriptDeviceState> _deviceRunStates;
    /** Error device count for specific user. */
    private Integer _errorDeviceCount;
    /** Success device count for specific user. */
    private Integer _successDeviceCount;
    /** User principle name of specific user. */
    private String _userPrincipalName;
    /**
     * Instantiates a new deviceManagementScriptUserState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementScriptUserState() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementScriptUserState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementScriptUserState
     */
    @javax.annotation.Nonnull
    public static DeviceManagementScriptUserState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptUserState();
    }
    /**
     * Gets the deviceRunStates property value. List of run states for this script across all devices of specific user.
     * @return a deviceManagementScriptDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptDeviceState> getDeviceRunStates() {
        return this._deviceRunStates;
    }
    /**
     * Gets the errorDeviceCount property value. Error device count for specific user.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this._errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementScriptUserState currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceRunStates", (n) -> { currentObject.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("successDeviceCount", (n) -> { currentObject.setSuccessDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the successDeviceCount property value. Success device count for specific user.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessDeviceCount() {
        return this._successDeviceCount;
    }
    /**
     * Gets the userPrincipalName property value. User principle name of specific user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRunStates(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptDeviceState> value) {
        this._deviceRunStates = value;
    }
    /**
     * Sets the errorDeviceCount property value. Error device count for specific user.
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the successDeviceCount property value. Success device count for specific user.
     * @param value Value to set for the successDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._successDeviceCount = value;
    }
    /**
     * Sets the userPrincipalName property value. User principle name of specific user.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}

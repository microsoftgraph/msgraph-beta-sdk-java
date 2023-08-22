package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a user rights setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementUserRightsSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<DeviceManagementUserRightsLocalUserOrGroup> localUsersOrGroups;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * State Management Setting.
     */
    private StateManagementSetting state;
    /**
     * Instantiates a new deviceManagementUserRightsSetting and sets the default values.
     */
    public DeviceManagementUserRightsSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementUserRightsSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementUserRightsSetting();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("localUsersOrGroups", (n) -> { this.setLocalUsersOrGroups(n.getCollectionOfObjectValues(DeviceManagementUserRightsLocalUserOrGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(StateManagementSetting.class)); });
        return deserializerMap;
    }
    /**
     * Gets the localUsersOrGroups property value. Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements.
     * @return a deviceManagementUserRightsLocalUserOrGroup
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementUserRightsLocalUserOrGroup> getLocalUsersOrGroups() {
        return this.localUsersOrGroups;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the state property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("localUsersOrGroups", this.getLocalUsersOrGroups());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the localUsersOrGroups property value. Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localUsersOrGroups property.
     */
    public void setLocalUsersOrGroups(@jakarta.annotation.Nullable final java.util.List<DeviceManagementUserRightsLocalUserOrGroup> value) {
        this.localUsersOrGroups = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. State Management Setting.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.state = value;
    }
}

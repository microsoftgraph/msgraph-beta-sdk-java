package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a user rights setting. */
public class DeviceManagementUserRightsSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements. */
    private java.util.List<DeviceManagementUserRightsLocalUserOrGroup> _localUsersOrGroups;
    /** State Management Setting. */
    private StateManagementSetting _state;
    /**
     * Instantiates a new deviceManagementUserRightsSetting and sets the default values.
     * @return a void
     */
    public DeviceManagementUserRightsSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nonnull
    public static DeviceManagementUserRightsSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementUserRightsSetting();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementUserRightsSetting currentObject = this;
        return new HashMap<>(2) {{
            this.put("localUsersOrGroups", (n) -> { currentObject.setLocalUsersOrGroups(n.getCollectionOfObjectValues(DeviceManagementUserRightsLocalUserOrGroup::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(StateManagementSetting.class)); });
        }};
    }
    /**
     * Gets the localUsersOrGroups property value. Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements.
     * @return a deviceManagementUserRightsLocalUserOrGroup
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementUserRightsLocalUserOrGroup> getLocalUsersOrGroups() {
        return this._localUsersOrGroups;
    }
    /**
     * Gets the state property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("localUsersOrGroups", this.getLocalUsersOrGroups());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the localUsersOrGroups property value. Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localUsersOrGroups property.
     * @return a void
     */
    public void setLocalUsersOrGroups(@javax.annotation.Nullable final java.util.List<DeviceManagementUserRightsLocalUserOrGroup> value) {
        this._localUsersOrGroups = value;
    }
    /**
     * Sets the state property value. State Management Setting.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final StateManagementSetting value) {
        this._state = value;
    }
}

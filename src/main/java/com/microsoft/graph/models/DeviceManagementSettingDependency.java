package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Dependency information for a setting */
public class DeviceManagementSettingDependency implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Collection of constraints for the dependency setting value */
    private java.util.List<DeviceManagementConstraint> _constraints;
    /** The setting definition ID of the setting depended on */
    private String _definitionId;
    /**
     * Instantiates a new deviceManagementSettingDependency and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingDependency() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingDependency
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingDependency createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingDependency();
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
     * Gets the constraints property value. Collection of constraints for the dependency setting value
     * @return a deviceManagementConstraint
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConstraint> getConstraints() {
        return this._constraints;
    }
    /**
     * Gets the definitionId property value. The setting definition ID of the setting depended on
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefinitionId() {
        return this._definitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingDependency currentObject = this;
        return new HashMap<>(2) {{
            this.put("constraints", (n) -> { currentObject.setConstraints(n.getCollectionOfObjectValues(DeviceManagementConstraint::createFromDiscriminatorValue)); });
            this.put("definitionId", (n) -> { currentObject.setDefinitionId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("constraints", this.getConstraints());
        writer.writeStringValue("definitionId", this.getDefinitionId());
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
     * Sets the constraints property value. Collection of constraints for the dependency setting value
     * @param value Value to set for the constraints property.
     * @return a void
     */
    public void setConstraints(@javax.annotation.Nullable final java.util.List<DeviceManagementConstraint> value) {
        this._constraints = value;
    }
    /**
     * Sets the definitionId property value. The setting definition ID of the setting depended on
     * @param value Value to set for the definitionId property.
     * @return a void
     */
    public void setDefinitionId(@javax.annotation.Nullable final String value) {
        this._definitionId = value;
    }
}

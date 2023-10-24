package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Dependency information for a setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingDependency implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Collection of constraints for the dependency setting value
     */
    private java.util.List<DeviceManagementConstraint> constraints;
    /**
     * The setting definition ID of the setting depended on
     */
    private String definitionId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new DeviceManagementSettingDependency and sets the default values.
     */
    public DeviceManagementSettingDependency() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingDependency
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingDependency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingDependency();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the constraints property value. Collection of constraints for the dependency setting value
     * @return a java.util.List<DeviceManagementConstraint>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConstraint> getConstraints() {
        return this.constraints;
    }
    /**
     * Gets the definitionId property value. The setting definition ID of the setting depended on
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefinitionId() {
        return this.definitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("constraints", (n) -> { this.setConstraints(n.getCollectionOfObjectValues(DeviceManagementConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("definitionId", (n) -> { this.setDefinitionId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("constraints", this.getConstraints());
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the constraints property value. Collection of constraints for the dependency setting value
     * @param value Value to set for the constraints property.
     */
    public void setConstraints(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConstraint> value) {
        this.constraints = value;
    }
    /**
     * Sets the definitionId property value. The setting definition ID of the setting depended on
     * @param value Value to set for the definitionId property.
     */
    public void setDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.definitionId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

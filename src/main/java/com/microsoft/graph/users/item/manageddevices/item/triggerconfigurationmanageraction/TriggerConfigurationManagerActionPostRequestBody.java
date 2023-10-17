package com.microsoft.graph.users.item.manageddevices.item.triggerconfigurationmanageraction;

import com.microsoft.graph.models.ConfigurationManagerAction;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TriggerConfigurationManagerActionPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Parameter for action triggerConfigurationManagerAction
     */
    private ConfigurationManagerAction configurationManagerAction;
    /**
     * Instantiates a new TriggerConfigurationManagerActionPostRequestBody and sets the default values.
     */
    public TriggerConfigurationManagerActionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TriggerConfigurationManagerActionPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TriggerConfigurationManagerActionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerConfigurationManagerActionPostRequestBody();
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
     * Gets the configurationManagerAction property value. Parameter for action triggerConfigurationManagerAction
     * @return a ConfigurationManagerAction
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagerAction getConfigurationManagerAction() {
        return this.configurationManagerAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("configurationManagerAction", (n) -> { this.setConfigurationManagerAction(n.getObjectValue(ConfigurationManagerAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("configurationManagerAction", this.getConfigurationManagerAction());
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
     * Sets the configurationManagerAction property value. Parameter for action triggerConfigurationManagerAction
     * @param value Value to set for the configurationManagerAction property.
     */
    public void setConfigurationManagerAction(@jakarta.annotation.Nullable final ConfigurationManagerAction value) {
        this.configurationManagerAction = value;
    }
}

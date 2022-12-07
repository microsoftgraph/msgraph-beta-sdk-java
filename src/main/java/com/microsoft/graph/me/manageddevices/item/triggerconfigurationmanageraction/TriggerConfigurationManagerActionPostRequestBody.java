package com.microsoft.graph.me.manageddevices.item.triggerconfigurationmanageraction;

import com.microsoft.graph.models.ConfigurationManagerAction;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the triggerConfigurationManagerAction method. */
public class TriggerConfigurationManagerActionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Parameter for action triggerConfigurationManagerAction */
    private ConfigurationManagerAction _configurationManagerAction;
    /**
     * Instantiates a new triggerConfigurationManagerActionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TriggerConfigurationManagerActionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a triggerConfigurationManagerActionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TriggerConfigurationManagerActionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerConfigurationManagerActionPostRequestBody();
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
     * Gets the configurationManagerAction property value. Parameter for action triggerConfigurationManagerAction
     * @return a configurationManagerAction
     */
    @javax.annotation.Nullable
    public ConfigurationManagerAction getConfigurationManagerAction() {
        return this._configurationManagerAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("configurationManagerAction", (n) -> { this.setConfigurationManagerAction(n.getObjectValue(ConfigurationManagerAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("configurationManagerAction", this.getConfigurationManagerAction());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the configurationManagerAction property value. Parameter for action triggerConfigurationManagerAction
     * @param value Value to set for the configurationManagerAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerAction(@javax.annotation.Nullable final ConfigurationManagerAction value) {
        this._configurationManagerAction = value;
    }
}

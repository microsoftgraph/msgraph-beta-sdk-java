package com.microsoft.graph.groups.item.sites.item.informationprotection.sensitivitylabels.item.sublabels.evaluate;

import com.microsoft.graph.models.CurrentLabel;
import com.microsoft.graph.models.DiscoveredSensitiveType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The currentLabel property
     */
    private CurrentLabel currentLabel;
    /**
     * The discoveredSensitiveTypes property
     */
    private java.util.List<DiscoveredSensitiveType> discoveredSensitiveTypes;
    /**
     * Instantiates a new evaluatePostRequestBody and sets the default values.
     */
    public EvaluatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EvaluatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePostRequestBody();
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
     * Gets the currentLabel property value. The currentLabel property
     * @return a currentLabel
     */
    @jakarta.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this.currentLabel;
    }
    /**
     * Gets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @return a discoveredSensitiveType
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredSensitiveType> getDiscoveredSensitiveTypes() {
        return this.discoveredSensitiveTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currentLabel", (n) -> { this.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("discoveredSensitiveTypes", (n) -> { this.setDiscoveredSensitiveTypes(n.getCollectionOfObjectValues(DiscoveredSensitiveType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("currentLabel", this.getCurrentLabel());
        writer.writeCollectionOfObjectValues("discoveredSensitiveTypes", this.getDiscoveredSensitiveTypes());
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
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     */
    public void setCurrentLabel(@jakarta.annotation.Nullable final CurrentLabel value) {
        this.currentLabel = value;
    }
    /**
     * Sets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @param value Value to set for the discoveredSensitiveTypes property.
     */
    public void setDiscoveredSensitiveTypes(@jakarta.annotation.Nullable final java.util.List<DiscoveredSensitiveType> value) {
        this.discoveredSensitiveTypes = value;
    }
}

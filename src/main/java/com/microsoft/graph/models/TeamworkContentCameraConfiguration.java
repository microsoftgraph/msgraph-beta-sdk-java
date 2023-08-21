package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkContentCameraConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * True if the content camera is inverted.
     */
    private Boolean isContentCameraInverted;
    /**
     * True if the content camera is optional.
     */
    private Boolean isContentCameraOptional;
    /**
     * True if the content enhancement is enabled.
     */
    private Boolean isContentEnhancementEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new teamworkContentCameraConfiguration and sets the default values.
     */
    public TeamworkContentCameraConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkContentCameraConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkContentCameraConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkContentCameraConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isContentCameraInverted", (n) -> { this.setIsContentCameraInverted(n.getBooleanValue()); });
        deserializerMap.put("isContentCameraOptional", (n) -> { this.setIsContentCameraOptional(n.getBooleanValue()); });
        deserializerMap.put("isContentEnhancementEnabled", (n) -> { this.setIsContentEnhancementEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isContentCameraInverted property value. True if the content camera is inverted.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentCameraInverted() {
        return this.isContentCameraInverted;
    }
    /**
     * Gets the isContentCameraOptional property value. True if the content camera is optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentCameraOptional() {
        return this.isContentCameraOptional;
    }
    /**
     * Gets the isContentEnhancementEnabled property value. True if the content enhancement is enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentEnhancementEnabled() {
        return this.isContentEnhancementEnabled;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isContentCameraInverted", this.getIsContentCameraInverted());
        writer.writeBooleanValue("isContentCameraOptional", this.getIsContentCameraOptional());
        writer.writeBooleanValue("isContentEnhancementEnabled", this.getIsContentEnhancementEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isContentCameraInverted property value. True if the content camera is inverted.
     * @param value Value to set for the isContentCameraInverted property.
     */
    public void setIsContentCameraInverted(@jakarta.annotation.Nullable final Boolean value) {
        this.isContentCameraInverted = value;
    }
    /**
     * Sets the isContentCameraOptional property value. True if the content camera is optional.
     * @param value Value to set for the isContentCameraOptional property.
     */
    public void setIsContentCameraOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.isContentCameraOptional = value;
    }
    /**
     * Sets the isContentEnhancementEnabled property value. True if the content enhancement is enabled.
     * @param value Value to set for the isContentEnhancementEnabled property.
     */
    public void setIsContentEnhancementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isContentEnhancementEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

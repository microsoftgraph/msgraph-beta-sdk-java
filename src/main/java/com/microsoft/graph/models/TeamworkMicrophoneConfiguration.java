package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkMicrophoneConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The defaultMicrophone property */
    private TeamworkPeripheral defaultMicrophone;
    /** True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed. */
    private Boolean isMicrophoneOptional;
    /** The microphones property */
    private java.util.List<TeamworkPeripheral> microphones;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new teamworkMicrophoneConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkMicrophoneConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkMicrophoneConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkMicrophoneConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkMicrophoneConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the defaultMicrophone property value. The defaultMicrophone property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getDefaultMicrophone() {
        return this.defaultMicrophone;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultMicrophone", (n) -> { this.setDefaultMicrophone(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("isMicrophoneOptional", (n) -> { this.setIsMicrophoneOptional(n.getBooleanValue()); });
        deserializerMap.put("microphones", (n) -> { this.setMicrophones(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMicrophoneOptional property value. True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMicrophoneOptional() {
        return this.isMicrophoneOptional;
    }
    /**
     * Gets the microphones property value. The microphones property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getMicrophones() {
        return this.microphones;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultMicrophone", this.getDefaultMicrophone());
        writer.writeBooleanValue("isMicrophoneOptional", this.getIsMicrophoneOptional());
        writer.writeCollectionOfObjectValues("microphones", this.getMicrophones());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultMicrophone property value. The defaultMicrophone property
     * @param value Value to set for the defaultMicrophone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultMicrophone(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this.defaultMicrophone = value;
    }
    /**
     * Sets the isMicrophoneOptional property value. True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed.
     * @param value Value to set for the isMicrophoneOptional property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMicrophoneOptional(@javax.annotation.Nullable final Boolean value) {
        this.isMicrophoneOptional = value;
    }
    /**
     * Sets the microphones property value. The microphones property
     * @param value Value to set for the microphones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrophones(@javax.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this.microphones = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

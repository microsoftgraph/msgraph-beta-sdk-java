package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkCameraConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cameras property */
    private java.util.List<TeamworkPeripheral> cameras;
    /** The configuration for the content camera. */
    private TeamworkContentCameraConfiguration contentCameraConfiguration;
    /** The defaultContentCamera property */
    private TeamworkPeripheral defaultContentCamera;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new teamworkCameraConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkCameraConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkCameraConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkCameraConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkCameraConfiguration();
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
     * Gets the cameras property value. The cameras property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getCameras() {
        return this.cameras;
    }
    /**
     * Gets the contentCameraConfiguration property value. The configuration for the content camera.
     * @return a teamworkContentCameraConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkContentCameraConfiguration getContentCameraConfiguration() {
        return this.contentCameraConfiguration;
    }
    /**
     * Gets the defaultContentCamera property value. The defaultContentCamera property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getDefaultContentCamera() {
        return this.defaultContentCamera;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cameras", (n) -> { this.setCameras(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCameraConfiguration", (n) -> { this.setContentCameraConfiguration(n.getObjectValue(TeamworkContentCameraConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultContentCamera", (n) -> { this.setDefaultContentCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("cameras", this.getCameras());
        writer.writeObjectValue("contentCameraConfiguration", this.getContentCameraConfiguration());
        writer.writeObjectValue("defaultContentCamera", this.getDefaultContentCamera());
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
     * Sets the cameras property value. The cameras property
     * @param value Value to set for the cameras property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameras(@javax.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this.cameras = value;
    }
    /**
     * Sets the contentCameraConfiguration property value. The configuration for the content camera.
     * @param value Value to set for the contentCameraConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCameraConfiguration(@javax.annotation.Nullable final TeamworkContentCameraConfiguration value) {
        this.contentCameraConfiguration = value;
    }
    /**
     * Sets the defaultContentCamera property value. The defaultContentCamera property
     * @param value Value to set for the defaultContentCamera property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultContentCamera(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this.defaultContentCamera = value;
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

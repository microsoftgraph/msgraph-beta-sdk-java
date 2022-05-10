package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkCameraConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The cameras property */
    private java.util.List<TeamworkPeripheral> _cameras;
    /** The configuration for the content camera. */
    private TeamworkContentCameraConfiguration _contentCameraConfiguration;
    /** The defaultContentCamera property */
    private TeamworkPeripheral _defaultContentCamera;
    /**
     * Instantiates a new teamworkCameraConfiguration and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the cameras property value. The cameras property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getCameras() {
        return this._cameras;
    }
    /**
     * Gets the contentCameraConfiguration property value. The configuration for the content camera.
     * @return a teamworkContentCameraConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkContentCameraConfiguration getContentCameraConfiguration() {
        return this._contentCameraConfiguration;
    }
    /**
     * Gets the defaultContentCamera property value. The defaultContentCamera property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getDefaultContentCamera() {
        return this._defaultContentCamera;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkCameraConfiguration currentObject = this;
        return new HashMap<>(3) {{
            this.put("cameras", (n) -> { currentObject.setCameras(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
            this.put("contentCameraConfiguration", (n) -> { currentObject.setContentCameraConfiguration(n.getObjectValue(TeamworkContentCameraConfiguration::createFromDiscriminatorValue)); });
            this.put("defaultContentCamera", (n) -> { currentObject.setDefaultContentCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("cameras", this.getCameras());
        writer.writeObjectValue("contentCameraConfiguration", this.getContentCameraConfiguration());
        writer.writeObjectValue("defaultContentCamera", this.getDefaultContentCamera());
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
     * Sets the cameras property value. The cameras property
     * @param value Value to set for the cameras property.
     * @return a void
     */
    public void setCameras(@javax.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this._cameras = value;
    }
    /**
     * Sets the contentCameraConfiguration property value. The configuration for the content camera.
     * @param value Value to set for the contentCameraConfiguration property.
     * @return a void
     */
    public void setContentCameraConfiguration(@javax.annotation.Nullable final TeamworkContentCameraConfiguration value) {
        this._contentCameraConfiguration = value;
    }
    /**
     * Sets the defaultContentCamera property value. The defaultContentCamera property
     * @param value Value to set for the defaultContentCamera property.
     * @return a void
     */
    public void setDefaultContentCamera(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._defaultContentCamera = value;
    }
}

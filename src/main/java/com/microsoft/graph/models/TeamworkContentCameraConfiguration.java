package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkContentCameraConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** True if the content camera is inverted. */
    private Boolean _isContentCameraInverted;
    /** True if the content camera is optional. */
    private Boolean _isContentCameraOptional;
    /** True if the content enhancement is enabled. */
    private Boolean _isContentEnhancementEnabled;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new teamworkContentCameraConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkContentCameraConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkContentCameraConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkContentCameraConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkContentCameraConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkContentCameraConfiguration();
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
        final TeamworkContentCameraConfiguration currentObject = this;
        return new HashMap<>(4) {{
            this.put("isContentCameraInverted", (n) -> { currentObject.setIsContentCameraInverted(n.getBooleanValue()); });
            this.put("isContentCameraOptional", (n) -> { currentObject.setIsContentCameraOptional(n.getBooleanValue()); });
            this.put("isContentEnhancementEnabled", (n) -> { currentObject.setIsContentEnhancementEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isContentCameraInverted property value. True if the content camera is inverted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsContentCameraInverted() {
        return this._isContentCameraInverted;
    }
    /**
     * Gets the isContentCameraOptional property value. True if the content camera is optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsContentCameraOptional() {
        return this._isContentCameraOptional;
    }
    /**
     * Gets the isContentEnhancementEnabled property value. True if the content enhancement is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsContentEnhancementEnabled() {
        return this._isContentEnhancementEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isContentCameraInverted", this.getIsContentCameraInverted());
        writer.writeBooleanValue("isContentCameraOptional", this.getIsContentCameraOptional());
        writer.writeBooleanValue("isContentEnhancementEnabled", this.getIsContentEnhancementEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isContentCameraInverted property value. True if the content camera is inverted.
     * @param value Value to set for the isContentCameraInverted property.
     * @return a void
     */
    public void setIsContentCameraInverted(@javax.annotation.Nullable final Boolean value) {
        this._isContentCameraInverted = value;
    }
    /**
     * Sets the isContentCameraOptional property value. True if the content camera is optional.
     * @param value Value to set for the isContentCameraOptional property.
     * @return a void
     */
    public void setIsContentCameraOptional(@javax.annotation.Nullable final Boolean value) {
        this._isContentCameraOptional = value;
    }
    /**
     * Sets the isContentEnhancementEnabled property value. True if the content enhancement is enabled.
     * @param value Value to set for the isContentEnhancementEnabled property.
     * @return a void
     */
    public void setIsContentEnhancementEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isContentEnhancementEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains track information for Android Managed Store apps. */
public class AndroidManagedStoreAppTrack implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Friendly name for track. */
    private String _trackAlias;
    /** Unique track identifier. */
    private String _trackId;
    /**
     * Instantiates a new androidManagedStoreAppTrack and sets the default values.
     * @return a void
     */
    public AndroidManagedStoreAppTrack() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidManagedStoreAppTrack");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidManagedStoreAppTrack
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreAppTrack createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppTrack();
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
        final AndroidManagedStoreAppTrack currentObject = this;
        return new HashMap<>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("trackAlias", (n) -> { currentObject.setTrackAlias(n.getStringValue()); });
            this.put("trackId", (n) -> { currentObject.setTrackId(n.getStringValue()); });
        }};
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
     * Gets the trackAlias property value. Friendly name for track.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrackAlias() {
        return this._trackAlias;
    }
    /**
     * Gets the trackId property value. Unique track identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrackId() {
        return this._trackId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("trackAlias", this.getTrackAlias());
        writer.writeStringValue("trackId", this.getTrackId());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the trackAlias property value. Friendly name for track.
     * @param value Value to set for the trackAlias property.
     * @return a void
     */
    public void setTrackAlias(@javax.annotation.Nullable final String value) {
        this._trackAlias = value;
    }
    /**
     * Sets the trackId property value. Unique track identifier.
     * @param value Value to set for the trackId property.
     * @return a void
     */
    public void setTrackId(@javax.annotation.Nullable final String value) {
        this._trackId = value;
    }
}

package microsoft.graph.groups.item.drives.item.items.item.preview;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the preview method. */
public class PreviewPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The allowEdit property */
    private Boolean _allowEdit;
    /** The chromeless property */
    private Boolean _chromeless;
    /** The page property */
    private String _page;
    /** The viewer property */
    private String _viewer;
    /** The zoom property */
    private Double _zoom;
    /**
     * Instantiates a new previewPostRequestBody and sets the default values.
     * @return a void
     */
    public PreviewPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a previewPostRequestBody
     */
    @javax.annotation.Nonnull
    public static PreviewPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreviewPostRequestBody();
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
     * Gets the allowEdit property value. The allowEdit property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowEdit() {
        return this._allowEdit;
    }
    /**
     * Gets the chromeless property value. The chromeless property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getChromeless() {
        return this._chromeless;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PreviewPostRequestBody currentObject = this;
        return new HashMap<>(5) {{
            this.put("allowEdit", (n) -> { currentObject.setAllowEdit(n.getBooleanValue()); });
            this.put("chromeless", (n) -> { currentObject.setChromeless(n.getBooleanValue()); });
            this.put("page", (n) -> { currentObject.setPage(n.getStringValue()); });
            this.put("viewer", (n) -> { currentObject.setViewer(n.getStringValue()); });
            this.put("zoom", (n) -> { currentObject.setZoom(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the page property value. The page property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPage() {
        return this._page;
    }
    /**
     * Gets the viewer property value. The viewer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getViewer() {
        return this._viewer;
    }
    /**
     * Gets the zoom property value. The zoom property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getZoom() {
        return this._zoom;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowEdit", this.getAllowEdit());
        writer.writeBooleanValue("chromeless", this.getChromeless());
        writer.writeStringValue("page", this.getPage());
        writer.writeStringValue("viewer", this.getViewer());
        writer.writeDoubleValue("zoom", this.getZoom());
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
     * Sets the allowEdit property value. The allowEdit property
     * @param value Value to set for the allowEdit property.
     * @return a void
     */
    public void setAllowEdit(@javax.annotation.Nullable final Boolean value) {
        this._allowEdit = value;
    }
    /**
     * Sets the chromeless property value. The chromeless property
     * @param value Value to set for the chromeless property.
     * @return a void
     */
    public void setChromeless(@javax.annotation.Nullable final Boolean value) {
        this._chromeless = value;
    }
    /**
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     * @return a void
     */
    public void setPage(@javax.annotation.Nullable final String value) {
        this._page = value;
    }
    /**
     * Sets the viewer property value. The viewer property
     * @param value Value to set for the viewer property.
     * @return a void
     */
    public void setViewer(@javax.annotation.Nullable final String value) {
        this._viewer = value;
    }
    /**
     * Sets the zoom property value. The zoom property
     * @param value Value to set for the zoom property.
     * @return a void
     */
    public void setZoom(@javax.annotation.Nullable final Double value) {
        this._zoom = value;
    }
}

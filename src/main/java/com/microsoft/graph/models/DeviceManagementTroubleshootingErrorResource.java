package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Object representing a link to troubleshooting information, the link could be to the Azure Portal or a Microsoft doc. */
public class DeviceManagementTroubleshootingErrorResource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The link to the web resource. Can contain any of the following formatters: {{UPN}}, {{DeviceGUID}}, {{UserGUID}} */
    private String _link;
    /** Not yet documented */
    private String _text;
    /**
     * Instantiates a new deviceManagementTroubleshootingErrorResource and sets the default values.
     * @return a void
     */
    public DeviceManagementTroubleshootingErrorResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementTroubleshootingErrorResource
     */
    @javax.annotation.Nonnull
    public static DeviceManagementTroubleshootingErrorResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementTroubleshootingErrorResource();
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
        final DeviceManagementTroubleshootingErrorResource currentObject = this;
        return new HashMap<>(2) {{
            this.put("link", (n) -> { currentObject.setLink(n.getStringValue()); });
            this.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
        }};
    }
    /**
     * Gets the link property value. The link to the web resource. Can contain any of the following formatters: {{UPN}}, {{DeviceGUID}}, {{UserGUID}}
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLink() {
        return this._link;
    }
    /**
     * Gets the text property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("link", this.getLink());
        writer.writeStringValue("text", this.getText());
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
     * Sets the link property value. The link to the web resource. Can contain any of the following formatters: {{UPN}}, {{DeviceGUID}}, {{UserGUID}}
     * @param value Value to set for the link property.
     * @return a void
     */
    public void setLink(@javax.annotation.Nullable final String value) {
        this._link = value;
    }
    /**
     * Sets the text property value. Not yet documented
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
}

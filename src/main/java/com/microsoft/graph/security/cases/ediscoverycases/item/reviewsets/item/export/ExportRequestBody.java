package microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.export;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.security.ExportFileStructure;
import microsoft.graph.models.security.ExportOptions;
/** Provides operations to call the export method.  */
public class ExportRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The azureBlobContainer property  */
    private String _azureBlobContainer;
    /** The azureBlobToken property  */
    private String _azureBlobToken;
    /** The description property  */
    private String _description;
    /** The exportOptions property  */
    private ExportOptions _exportOptions;
    /** The exportStructure property  */
    private ExportFileStructure _exportStructure;
    /** The outputName property  */
    private String _outputName;
    /**
     * Instantiates a new exportRequestBody and sets the default values.
     * @return a void
     */
    public ExportRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exportRequestBody
     */
    @javax.annotation.Nonnull
    public static ExportRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportRequestBody();
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
     * Gets the azureBlobContainer property value. The azureBlobContainer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureBlobContainer() {
        return this._azureBlobContainer;
    }
    /**
     * Gets the azureBlobToken property value. The azureBlobToken property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureBlobToken() {
        return this._azureBlobToken;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the exportOptions property value. The exportOptions property
     * @return a exportOptions
     */
    @javax.annotation.Nullable
    public ExportOptions getExportOptions() {
        return this._exportOptions;
    }
    /**
     * Gets the exportStructure property value. The exportStructure property
     * @return a exportFileStructure
     */
    @javax.annotation.Nullable
    public ExportFileStructure getExportStructure() {
        return this._exportStructure;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExportRequestBody currentObject = this;
        return new HashMap<>(6) {{
            this.put("azureBlobContainer", (n) -> { currentObject.setAzureBlobContainer(n.getStringValue()); });
            this.put("azureBlobToken", (n) -> { currentObject.setAzureBlobToken(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("exportOptions", (n) -> { currentObject.setExportOptions(n.getEnumValue(ExportOptions.class)); });
            this.put("exportStructure", (n) -> { currentObject.setExportStructure(n.getEnumValue(ExportFileStructure.class)); });
            this.put("outputName", (n) -> { currentObject.setOutputName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the outputName property value. The outputName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputName() {
        return this._outputName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azureBlobContainer", this.getAzureBlobContainer());
        writer.writeStringValue("azureBlobToken", this.getAzureBlobToken());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputName", this.getOutputName());
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
     * Sets the azureBlobContainer property value. The azureBlobContainer property
     * @param value Value to set for the azureBlobContainer property.
     * @return a void
     */
    public void setAzureBlobContainer(@javax.annotation.Nullable final String value) {
        this._azureBlobContainer = value;
    }
    /**
     * Sets the azureBlobToken property value. The azureBlobToken property
     * @param value Value to set for the azureBlobToken property.
     * @return a void
     */
    public void setAzureBlobToken(@javax.annotation.Nullable final String value) {
        this._azureBlobToken = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the exportOptions property value. The exportOptions property
     * @param value Value to set for the exportOptions property.
     * @return a void
     */
    public void setExportOptions(@javax.annotation.Nullable final ExportOptions value) {
        this._exportOptions = value;
    }
    /**
     * Sets the exportStructure property value. The exportStructure property
     * @param value Value to set for the exportStructure property.
     * @return a void
     */
    public void setExportStructure(@javax.annotation.Nullable final ExportFileStructure value) {
        this._exportStructure = value;
    }
    /**
     * Sets the outputName property value. The outputName property
     * @param value Value to set for the outputName property.
     * @return a void
     */
    public void setOutputName(@javax.annotation.Nullable final String value) {
        this._outputName = value;
    }
}

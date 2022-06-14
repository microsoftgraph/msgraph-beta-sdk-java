package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryExportOperation extends CaseOperation implements Parsable {
    /** The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location. */
    private String _azureBlobContainer;
    /** The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location. */
    private String _azureBlobToken;
    /** The description provided for the export. */
    private String _description;
    /** The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags. */
    private ExportOptions _exportOptions;
    /** The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst. */
    private ExportFileStructure _exportStructure;
    /** The outputFolderId property */
    private String _outputFolderId;
    /** The name provided for the export. */
    private String _outputName;
    /** Review set from where documents are exported. */
    private EdiscoveryReviewSet _reviewSet;
    /** The review set query which is used to filter the documents for export. */
    private EdiscoveryReviewSetQuery _reviewSetQuery;
    /**
     * Instantiates a new EdiscoveryExportOperation and sets the default values.
     * @return a void
     */
    public EdiscoveryExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryExportOperation
     */
    @javax.annotation.Nonnull
    public static EdiscoveryExportOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryExportOperation();
    }
    /**
     * Gets the azureBlobContainer property value. The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureBlobContainer() {
        return this._azureBlobContainer;
    }
    /**
     * Gets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureBlobToken() {
        return this._azureBlobToken;
    }
    /**
     * Gets the description property value. The description provided for the export.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @return a exportOptions
     */
    @javax.annotation.Nullable
    public ExportOptions getExportOptions() {
        return this._exportOptions;
    }
    /**
     * Gets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
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
        final EdiscoveryExportOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("azureBlobContainer", (n) -> { currentObject.setAzureBlobContainer(n.getStringValue()); });
            this.put("azureBlobToken", (n) -> { currentObject.setAzureBlobToken(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("exportOptions", (n) -> { currentObject.setExportOptions(n.getEnumValue(ExportOptions.class)); });
            this.put("exportStructure", (n) -> { currentObject.setExportStructure(n.getEnumValue(ExportFileStructure.class)); });
            this.put("outputFolderId", (n) -> { currentObject.setOutputFolderId(n.getStringValue()); });
            this.put("outputName", (n) -> { currentObject.setOutputName(n.getStringValue()); });
            this.put("reviewSet", (n) -> { currentObject.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
            this.put("reviewSetQuery", (n) -> { currentObject.setReviewSetQuery(n.getObjectValue(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the outputFolderId property value. The outputFolderId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputFolderId() {
        return this._outputFolderId;
    }
    /**
     * Gets the outputName property value. The name provided for the export.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputName() {
        return this._outputName;
    }
    /**
     * Gets the reviewSet property value. Review set from where documents are exported.
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this._reviewSet;
    }
    /**
     * Gets the reviewSetQuery property value. The review set query which is used to filter the documents for export.
     * @return a ediscoveryReviewSetQuery
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSetQuery getReviewSetQuery() {
        return this._reviewSetQuery;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureBlobContainer", this.getAzureBlobContainer());
        writer.writeStringValue("azureBlobToken", this.getAzureBlobToken());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputFolderId", this.getOutputFolderId());
        writer.writeStringValue("outputName", this.getOutputName());
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("reviewSetQuery", this.getReviewSetQuery());
    }
    /**
     * Sets the azureBlobContainer property value. The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     * @param value Value to set for the azureBlobContainer property.
     * @return a void
     */
    public void setAzureBlobContainer(@javax.annotation.Nullable final String value) {
        this._azureBlobContainer = value;
    }
    /**
     * Sets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
     * @param value Value to set for the azureBlobToken property.
     * @return a void
     */
    public void setAzureBlobToken(@javax.annotation.Nullable final String value) {
        this._azureBlobToken = value;
    }
    /**
     * Sets the description property value. The description provided for the export.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @param value Value to set for the exportOptions property.
     * @return a void
     */
    public void setExportOptions(@javax.annotation.Nullable final ExportOptions value) {
        this._exportOptions = value;
    }
    /**
     * Sets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     * @param value Value to set for the exportStructure property.
     * @return a void
     */
    public void setExportStructure(@javax.annotation.Nullable final ExportFileStructure value) {
        this._exportStructure = value;
    }
    /**
     * Sets the outputFolderId property value. The outputFolderId property
     * @param value Value to set for the outputFolderId property.
     * @return a void
     */
    public void setOutputFolderId(@javax.annotation.Nullable final String value) {
        this._outputFolderId = value;
    }
    /**
     * Sets the outputName property value. The name provided for the export.
     * @param value Value to set for the outputName property.
     * @return a void
     */
    public void setOutputName(@javax.annotation.Nullable final String value) {
        this._outputName = value;
    }
    /**
     * Sets the reviewSet property value. Review set from where documents are exported.
     * @param value Value to set for the reviewSet property.
     * @return a void
     */
    public void setReviewSet(@javax.annotation.Nullable final EdiscoveryReviewSet value) {
        this._reviewSet = value;
    }
    /**
     * Sets the reviewSetQuery property value. The review set query which is used to filter the documents for export.
     * @param value Value to set for the reviewSetQuery property.
     * @return a void
     */
    public void setReviewSetQuery(@javax.annotation.Nullable final EdiscoveryReviewSetQuery value) {
        this._reviewSetQuery = value;
    }
}

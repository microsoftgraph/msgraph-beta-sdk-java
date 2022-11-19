package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CaseExportOperation extends CaseOperation implements Parsable {
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
    /** The review set the content is being exported from. */
    private ReviewSet _reviewSet;
    /**
     * Instantiates a new CaseExportOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CaseExportOperation() {
        super();
        this.setOdataType("#microsoft.graph.ediscovery.caseExportOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CaseExportOperation
     */
    @javax.annotation.Nonnull
    public static CaseExportOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseExportOperation();
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
        final CaseExportOperation currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureBlobContainer", (n) -> { currentObject.setAzureBlobContainer(n.getStringValue()); });
        deserializerMap.put("azureBlobToken", (n) -> { currentObject.setAzureBlobToken(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("exportOptions", (n) -> { currentObject.setExportOptions(n.getEnumValue(ExportOptions.class)); });
        deserializerMap.put("exportStructure", (n) -> { currentObject.setExportStructure(n.getEnumValue(ExportFileStructure.class)); });
        deserializerMap.put("outputFolderId", (n) -> { currentObject.setOutputFolderId(n.getStringValue()); });
        deserializerMap.put("outputName", (n) -> { currentObject.setOutputName(n.getStringValue()); });
        deserializerMap.put("reviewSet", (n) -> { currentObject.setReviewSet(n.getObjectValue(ReviewSet::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the reviewSet property value. The review set the content is being exported from.
     * @return a reviewSet
     */
    @javax.annotation.Nullable
    public ReviewSet getReviewSet() {
        return this._reviewSet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    }
    /**
     * Sets the azureBlobContainer property value. The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     * @param value Value to set for the azureBlobContainer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureBlobContainer(@javax.annotation.Nullable final String value) {
        this._azureBlobContainer = value;
    }
    /**
     * Sets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
     * @param value Value to set for the azureBlobToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureBlobToken(@javax.annotation.Nullable final String value) {
        this._azureBlobToken = value;
    }
    /**
     * Sets the description property value. The description provided for the export.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @param value Value to set for the exportOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportOptions(@javax.annotation.Nullable final ExportOptions value) {
        this._exportOptions = value;
    }
    /**
     * Sets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     * @param value Value to set for the exportStructure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportStructure(@javax.annotation.Nullable final ExportFileStructure value) {
        this._exportStructure = value;
    }
    /**
     * Sets the outputFolderId property value. The outputFolderId property
     * @param value Value to set for the outputFolderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputFolderId(@javax.annotation.Nullable final String value) {
        this._outputFolderId = value;
    }
    /**
     * Sets the outputName property value. The name provided for the export.
     * @param value Value to set for the outputName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputName(@javax.annotation.Nullable final String value) {
        this._outputName = value;
    }
    /**
     * Sets the reviewSet property value. The review set the content is being exported from.
     * @param value Value to set for the reviewSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSet(@javax.annotation.Nullable final ReviewSet value) {
        this._reviewSet = value;
    }
}

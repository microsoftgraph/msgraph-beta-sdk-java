package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseExportOperation extends CaseOperation implements Parsable {
    /**
     * The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     */
    private String azureBlobContainer;
    /**
     * The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
     */
    private String azureBlobToken;
    /**
     * The description provided for the export.
     */
    private String description;
    /**
     * The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     */
    private EnumSet<ExportOptions> exportOptions;
    /**
     * The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     */
    private ExportFileStructure exportStructure;
    /**
     * The outputFolderId property
     */
    private String outputFolderId;
    /**
     * The name provided for the export.
     */
    private String outputName;
    /**
     * The review set the content is being exported from.
     */
    private ReviewSet reviewSet;
    /**
     * Instantiates a new caseExportOperation and sets the default values.
     */
    public CaseExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a caseExportOperation
     */
    @jakarta.annotation.Nonnull
    public static CaseExportOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseExportOperation();
    }
    /**
     * Gets the azureBlobContainer property value. The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobContainer() {
        return this.azureBlobContainer;
    }
    /**
     * Gets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobToken() {
        return this.azureBlobToken;
    }
    /**
     * Gets the description property value. The description provided for the export.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @return a exportOptions
     */
    @jakarta.annotation.Nullable
    public ExportOptions getExportOptions() {
        return this.exportOptions;
    }
    /**
     * Gets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     * @return a exportFileStructure
     */
    @jakarta.annotation.Nullable
    public ExportFileStructure getExportStructure() {
        return this.exportStructure;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureBlobContainer", (n) -> { this.setAzureBlobContainer(n.getStringValue()); });
        deserializerMap.put("azureBlobToken", (n) -> { this.setAzureBlobToken(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumSetValue(ExportOptions.class)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(ExportFileStructure.class)); });
        deserializerMap.put("outputFolderId", (n) -> { this.setOutputFolderId(n.getStringValue()); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(ReviewSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the outputFolderId property value. The outputFolderId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOutputFolderId() {
        return this.outputFolderId;
    }
    /**
     * Gets the outputName property value. The name provided for the export.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOutputName() {
        return this.outputName;
    }
    /**
     * Gets the reviewSet property value. The review set the content is being exported from.
     * @return a reviewSet
     */
    @jakarta.annotation.Nullable
    public ReviewSet getReviewSet() {
        return this.reviewSet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureBlobContainer", this.getAzureBlobContainer());
        writer.writeStringValue("azureBlobToken", this.getAzureBlobToken());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumSetValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputFolderId", this.getOutputFolderId());
        writer.writeStringValue("outputName", this.getOutputName());
        writer.writeObjectValue("reviewSet", this.getReviewSet());
    }
    /**
     * Sets the azureBlobContainer property value. The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     * @param value Value to set for the azureBlobContainer property.
     */
    public void setAzureBlobContainer(@jakarta.annotation.Nullable final String value) {
        this.azureBlobContainer = value;
    }
    /**
     * Sets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
     * @param value Value to set for the azureBlobToken property.
     */
    public void setAzureBlobToken(@jakarta.annotation.Nullable final String value) {
        this.azureBlobToken = value;
    }
    /**
     * Sets the description property value. The description provided for the export.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @param value Value to set for the exportOptions property.
     */
    public void setExportOptions(@jakarta.annotation.Nullable final ExportOptions value) {
        this.exportOptions = value;
    }
    /**
     * Sets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     * @param value Value to set for the exportStructure property.
     */
    public void setExportStructure(@jakarta.annotation.Nullable final ExportFileStructure value) {
        this.exportStructure = value;
    }
    /**
     * Sets the outputFolderId property value. The outputFolderId property
     * @param value Value to set for the outputFolderId property.
     */
    public void setOutputFolderId(@jakarta.annotation.Nullable final String value) {
        this.outputFolderId = value;
    }
    /**
     * Sets the outputName property value. The name provided for the export.
     * @param value Value to set for the outputName property.
     */
    public void setOutputName(@jakarta.annotation.Nullable final String value) {
        this.outputName = value;
    }
    /**
     * Sets the reviewSet property value. The review set the content is being exported from.
     * @param value Value to set for the reviewSet property.
     */
    public void setReviewSet(@jakarta.annotation.Nullable final ReviewSet value) {
        this.reviewSet = value;
    }
}

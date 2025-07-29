package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryExportOperation extends CaseOperation implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryExportOperation} and sets the default values.
     */
    public EdiscoveryExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryExportOperation}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryExportOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryExportOperation();
    }
    /**
     * Gets the azureBlobContainer property value. The name of the Azure storage location where the export is stored. This name only applies to exports stored in your own Azure storage location. The azureBlobContainer property is deprecated and stopped returning data on April 30, 2023.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobContainer() {
        return this.backingStore.get("azureBlobContainer");
    }
    /**
     * Gets the azureBlobToken property value. The SAS token for the Azure storage location. This token only applies to exports stored in your own Azure storage location. The azureBlobToken property is deprecated and stopped returning data on April 30, 2023.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobToken() {
        return this.backingStore.get("azureBlobToken");
    }
    /**
     * Gets the description property value. The description provided for the export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the exportFileMetadata property value. Contains the properties for an export file metadata, including downloadUrl, fileName, and size. If you export to an Azure storage location, this property returns empty.
     * @return a {@link java.util.List<ExportFileMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExportFileMetadata> getExportFileMetadata() {
        return this.backingStore.get("exportFileMetadata");
    }
    /**
     * Gets the exportOptions property value. The options provided for the export. For more information, see reviewSet: export. The fileInfo member is deprecated and stopped returning data on April 30, 2023. Going forward, the summary and load files are always included. Possible values are: originalFiles, text, pdfReplacement, tags, unknownFutureValue, splitSource, includeFolderAndPath, friendlyName, condensePaths. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: splitSource, includeFolderAndPath, friendlyName, condensePaths.
     * @return a {@link EnumSet<ExportOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportOptions> getExportOptions() {
        return this.backingStore.get("exportOptions");
    }
    /**
     * Gets the exportStructure property value. The options that specify the structure of the export. For more information, see reviewSet: export. Possible values are: none, directory (deprecated), pst, unknownFutureValue, msg. Use the Prefer: include-unknown-enum-members request header to get the following value from this evolvable enum: msg. The directory member is deprecated. It remains in beta for backward compatibility. Going forward, use either pst or msg.
     * @return a {@link ExportFileStructure}
     */
    @jakarta.annotation.Nullable
    public ExportFileStructure getExportStructure() {
        return this.backingStore.get("exportStructure");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureBlobContainer", (n) -> { this.setAzureBlobContainer(n.getStringValue()); });
        deserializerMap.put("azureBlobToken", (n) -> { this.setAzureBlobToken(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("exportFileMetadata", (n) -> { this.setExportFileMetadata(n.getCollectionOfObjectValues(ExportFileMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumSetValue(ExportOptions::forValue)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(ExportFileStructure::forValue)); });
        deserializerMap.put("outputFolderId", (n) -> { this.setOutputFolderId(n.getStringValue()); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSetQuery", (n) -> { this.setReviewSetQuery(n.getObjectValue(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the outputFolderId property value. The output folder ID. The outputFolderId property is deprecated and stopped returning data on April 30, 2023.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutputFolderId() {
        return this.backingStore.get("outputFolderId");
    }
    /**
     * Gets the outputName property value. The name provided for the export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutputName() {
        return this.backingStore.get("outputName");
    }
    /**
     * Gets the reviewSet property value. Review set from where documents are exported.
     * @return a {@link EdiscoveryReviewSet}
     */
    @jakarta.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this.backingStore.get("reviewSet");
    }
    /**
     * Gets the reviewSetQuery property value. The review set query that is used to filter the documents for export.
     * @return a {@link EdiscoveryReviewSetQuery}
     */
    @jakarta.annotation.Nullable
    public EdiscoveryReviewSetQuery getReviewSetQuery() {
        return this.backingStore.get("reviewSetQuery");
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
        writer.writeCollectionOfObjectValues("exportFileMetadata", this.getExportFileMetadata());
        writer.writeEnumSetValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputFolderId", this.getOutputFolderId());
        writer.writeStringValue("outputName", this.getOutputName());
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("reviewSetQuery", this.getReviewSetQuery());
    }
    /**
     * Sets the azureBlobContainer property value. The name of the Azure storage location where the export is stored. This name only applies to exports stored in your own Azure storage location. The azureBlobContainer property is deprecated and stopped returning data on April 30, 2023.
     * @param value Value to set for the azureBlobContainer property.
     */
    public void setAzureBlobContainer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureBlobContainer", value);
    }
    /**
     * Sets the azureBlobToken property value. The SAS token for the Azure storage location. This token only applies to exports stored in your own Azure storage location. The azureBlobToken property is deprecated and stopped returning data on April 30, 2023.
     * @param value Value to set for the azureBlobToken property.
     */
    public void setAzureBlobToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureBlobToken", value);
    }
    /**
     * Sets the description property value. The description provided for the export.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the exportFileMetadata property value. Contains the properties for an export file metadata, including downloadUrl, fileName, and size. If you export to an Azure storage location, this property returns empty.
     * @param value Value to set for the exportFileMetadata property.
     */
    public void setExportFileMetadata(@jakarta.annotation.Nullable final java.util.List<ExportFileMetadata> value) {
        this.backingStore.set("exportFileMetadata", value);
    }
    /**
     * Sets the exportOptions property value. The options provided for the export. For more information, see reviewSet: export. The fileInfo member is deprecated and stopped returning data on April 30, 2023. Going forward, the summary and load files are always included. Possible values are: originalFiles, text, pdfReplacement, tags, unknownFutureValue, splitSource, includeFolderAndPath, friendlyName, condensePaths. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: splitSource, includeFolderAndPath, friendlyName, condensePaths.
     * @param value Value to set for the exportOptions property.
     */
    public void setExportOptions(@jakarta.annotation.Nullable final EnumSet<ExportOptions> value) {
        this.backingStore.set("exportOptions", value);
    }
    /**
     * Sets the exportStructure property value. The options that specify the structure of the export. For more information, see reviewSet: export. Possible values are: none, directory (deprecated), pst, unknownFutureValue, msg. Use the Prefer: include-unknown-enum-members request header to get the following value from this evolvable enum: msg. The directory member is deprecated. It remains in beta for backward compatibility. Going forward, use either pst or msg.
     * @param value Value to set for the exportStructure property.
     */
    public void setExportStructure(@jakarta.annotation.Nullable final ExportFileStructure value) {
        this.backingStore.set("exportStructure", value);
    }
    /**
     * Sets the outputFolderId property value. The output folder ID. The outputFolderId property is deprecated and stopped returning data on April 30, 2023.
     * @param value Value to set for the outputFolderId property.
     */
    public void setOutputFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outputFolderId", value);
    }
    /**
     * Sets the outputName property value. The name provided for the export.
     * @param value Value to set for the outputName property.
     */
    public void setOutputName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outputName", value);
    }
    /**
     * Sets the reviewSet property value. Review set from where documents are exported.
     * @param value Value to set for the reviewSet property.
     */
    public void setReviewSet(@jakarta.annotation.Nullable final EdiscoveryReviewSet value) {
        this.backingStore.set("reviewSet", value);
    }
    /**
     * Sets the reviewSetQuery property value. The review set query that is used to filter the documents for export.
     * @param value Value to set for the reviewSetQuery property.
     */
    public void setReviewSetQuery(@jakarta.annotation.Nullable final EdiscoveryReviewSetQuery value) {
        this.backingStore.set("reviewSetQuery", value);
    }
}

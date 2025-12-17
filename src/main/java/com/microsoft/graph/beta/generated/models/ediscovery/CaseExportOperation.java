package com.microsoft.graph.beta.models.ediscovery;

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
     * Instantiates a new {@link CaseExportOperation} and sets the default values.
     */
    public CaseExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseExportOperation}
     */
    @jakarta.annotation.Nonnull
    public static CaseExportOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseExportOperation();
    }
    /**
     * Gets the azureBlobContainer property value. The name of the Azure storage location where the export will be stored. This only applies to exports stored in your own Azure storage location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobContainer() {
        return this.backingStore.get("azureBlobContainer");
    }
    /**
     * Gets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
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
     * Gets the exportOptions property value. The options provided for the export. For more information, see reviewSet: export. The possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @return a {@link EnumSet<ExportOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportOptions> getExportOptions() {
        return this.backingStore.get("exportOptions");
    }
    /**
     * Gets the exportStructure property value. The options provided specify the structure of the export. For more information, see reviewSet: export. The possible values are: none, directory, pst.
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
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumSetValue(ExportOptions::forValue)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(ExportFileStructure::forValue)); });
        deserializerMap.put("outputFolderId", (n) -> { this.setOutputFolderId(n.getStringValue()); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(ReviewSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the outputFolderId property value. The output folder ID.
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
     * Gets the reviewSet property value. The review set the content is being exported from.
     * @return a {@link ReviewSet}
     */
    @jakarta.annotation.Nullable
    public ReviewSet getReviewSet() {
        return this.backingStore.get("reviewSet");
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
        this.backingStore.set("azureBlobContainer", value);
    }
    /**
     * Sets the azureBlobToken property value. The SAS token for the Azure storage location.  This only applies to exports stored in your own Azure storage location.
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
     * Sets the exportOptions property value. The options provided for the export. For more information, see reviewSet: export. The possible values are: originalFiles, text, pdfReplacement, fileInfo, tags.
     * @param value Value to set for the exportOptions property.
     */
    public void setExportOptions(@jakarta.annotation.Nullable final EnumSet<ExportOptions> value) {
        this.backingStore.set("exportOptions", value);
    }
    /**
     * Sets the exportStructure property value. The options provided specify the structure of the export. For more information, see reviewSet: export. The possible values are: none, directory, pst.
     * @param value Value to set for the exportStructure property.
     */
    public void setExportStructure(@jakarta.annotation.Nullable final ExportFileStructure value) {
        this.backingStore.set("exportStructure", value);
    }
    /**
     * Sets the outputFolderId property value. The output folder ID.
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
     * Sets the reviewSet property value. The review set the content is being exported from.
     * @param value Value to set for the reviewSet property.
     */
    public void setReviewSet(@jakarta.annotation.Nullable final ReviewSet value) {
        this.backingStore.set("reviewSet", value);
    }
}

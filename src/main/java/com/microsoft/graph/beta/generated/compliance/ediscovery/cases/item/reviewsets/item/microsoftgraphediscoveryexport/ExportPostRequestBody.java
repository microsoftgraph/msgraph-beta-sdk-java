package com.microsoft.graph.beta.compliance.ediscovery.cases.item.reviewsets.item.microsoftgraphediscoveryexport;

import com.microsoft.graph.beta.models.ediscovery.ExportFileStructure;
import com.microsoft.graph.beta.models.ediscovery.ExportOptions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExportPostRequestBody} and sets the default values.
     */
    public ExportPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExportPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ExportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the azureBlobContainer property value. The azureBlobContainer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobContainer() {
        return this.backingStore.get("azureBlobContainer");
    }
    /**
     * Gets the azureBlobToken property value. The azureBlobToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureBlobToken() {
        return this.backingStore.get("azureBlobToken");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the exportOptions property value. The exportOptions property
     * @return a {@link EnumSet<ExportOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportOptions> getExportOptions() {
        return this.backingStore.get("exportOptions");
    }
    /**
     * Gets the exportStructure property value. The exportStructure property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("azureBlobContainer", (n) -> { this.setAzureBlobContainer(n.getStringValue()); });
        deserializerMap.put("azureBlobToken", (n) -> { this.setAzureBlobToken(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumSetValue(ExportOptions::forValue)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(ExportFileStructure::forValue)); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the outputName property value. The outputName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutputName() {
        return this.backingStore.get("outputName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azureBlobContainer", this.getAzureBlobContainer());
        writer.writeStringValue("azureBlobToken", this.getAzureBlobToken());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumSetValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputName", this.getOutputName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the azureBlobContainer property value. The azureBlobContainer property
     * @param value Value to set for the azureBlobContainer property.
     */
    public void setAzureBlobContainer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureBlobContainer", value);
    }
    /**
     * Sets the azureBlobToken property value. The azureBlobToken property
     * @param value Value to set for the azureBlobToken property.
     */
    public void setAzureBlobToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureBlobToken", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the exportOptions property value. The exportOptions property
     * @param value Value to set for the exportOptions property.
     */
    public void setExportOptions(@jakarta.annotation.Nullable final EnumSet<ExportOptions> value) {
        this.backingStore.set("exportOptions", value);
    }
    /**
     * Sets the exportStructure property value. The exportStructure property
     * @param value Value to set for the exportStructure property.
     */
    public void setExportStructure(@jakarta.annotation.Nullable final ExportFileStructure value) {
        this.backingStore.set("exportStructure", value);
    }
    /**
     * Sets the outputName property value. The outputName property
     * @param value Value to set for the outputName property.
     */
    public void setOutputName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outputName", value);
    }
}

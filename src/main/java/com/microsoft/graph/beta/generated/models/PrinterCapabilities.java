package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrinterCapabilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PrinterCapabilities} and sets the default values.
     */
    public PrinterCapabilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrinterCapabilities}
     */
    @jakarta.annotation.Nonnull
    public static PrinterCapabilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterCapabilities();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getBottomMargins() {
        return this.backingStore.get("bottomMargins");
    }
    /**
     * Gets the collation property value. True if the printer supports collating when printing multiple copies of a multi-page document; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCollation() {
        return this.backingStore.get("collation");
    }
    /**
     * Gets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @return a {@link java.util.List<PrintColorMode>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintColorMode> getColorModes() {
        return this.backingStore.get("colorModes");
    }
    /**
     * Gets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It isn&apos;t guaranteed that the Universal Print service supports printing all of these MIME types.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContentTypes() {
        return this.backingStore.get("contentTypes");
    }
    /**
     * Gets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @return a {@link IntegerRange}
     */
    @jakarta.annotation.Nullable
    public IntegerRange getCopiesPerJob() {
        return this.backingStore.get("copiesPerJob");
    }
    /**
     * Gets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getDpis() {
        return this.backingStore.get("dpis");
    }
    /**
     * Gets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @return a {@link java.util.List<PrintDuplexMode>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintDuplexMode> getDuplexModes() {
        return this.backingStore.get("duplexModes");
    }
    /**
     * Gets the feedDirections property value. The feedDirections property
     * @return a {@link java.util.List<PrinterFeedDirection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrinterFeedDirection> getFeedDirections() {
        return this.backingStore.get("feedDirections");
    }
    /**
     * Gets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @return a {@link java.util.List<PrinterFeedOrientation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrinterFeedOrientation> getFeedOrientations() {
        return this.backingStore.get("feedOrientations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(40);
        deserializerMap.put("bottomMargins", (n) -> { this.setBottomMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("collation", (n) -> { this.setCollation(n.getBooleanValue()); });
        deserializerMap.put("colorModes", (n) -> { this.setColorModes(n.getCollectionOfEnumValues(PrintColorMode::forValue)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("copiesPerJob", (n) -> { this.setCopiesPerJob(n.getObjectValue(IntegerRange::createFromDiscriminatorValue)); });
        deserializerMap.put("dpis", (n) -> { this.setDpis(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("duplexModes", (n) -> { this.setDuplexModes(n.getCollectionOfEnumValues(PrintDuplexMode::forValue)); });
        deserializerMap.put("feedDirections", (n) -> { this.setFeedDirections(n.getCollectionOfEnumValues(PrinterFeedDirection::forValue)); });
        deserializerMap.put("feedOrientations", (n) -> { this.setFeedOrientations(n.getCollectionOfEnumValues(PrinterFeedOrientation::forValue)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing::forValue)); });
        deserializerMap.put("inputBins", (n) -> { this.setInputBins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isColorPrintingSupported", (n) -> { this.setIsColorPrintingSupported(n.getBooleanValue()); });
        deserializerMap.put("isPageRangeSupported", (n) -> { this.setIsPageRangeSupported(n.getBooleanValue()); });
        deserializerMap.put("leftMargins", (n) -> { this.setLeftMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("mediaColors", (n) -> { this.setMediaColors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mediaSizes", (n) -> { this.setMediaSizes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mediaTypes", (n) -> { this.setMediaTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("multipageLayouts", (n) -> { this.setMultipageLayouts(n.getCollectionOfEnumValues(PrintMultipageLayout::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientations", (n) -> { this.setOrientations(n.getCollectionOfEnumValues(PrintOrientation::forValue)); });
        deserializerMap.put("outputBins", (n) -> { this.setOutputBins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("qualities", (n) -> { this.setQualities(n.getCollectionOfEnumValues(PrintQuality::forValue)); });
        deserializerMap.put("rightMargins", (n) -> { this.setRightMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("scalings", (n) -> { this.setScalings(n.getCollectionOfEnumValues(PrintScaling::forValue)); });
        deserializerMap.put("supportedColorConfigurations", (n) -> { this.setSupportedColorConfigurations(n.getCollectionOfEnumValues(PrintColorConfiguration::forValue)); });
        deserializerMap.put("supportedCopiesPerJob", (n) -> { this.setSupportedCopiesPerJob(n.getObjectValue(IntegerRange::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedDocumentMimeTypes", (n) -> { this.setSupportedDocumentMimeTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedDuplexConfigurations", (n) -> { this.setSupportedDuplexConfigurations(n.getCollectionOfEnumValues(PrintDuplexConfiguration::forValue)); });
        deserializerMap.put("supportedFinishings", (n) -> { this.setSupportedFinishings(n.getCollectionOfEnumValues(PrintFinishing::forValue)); });
        deserializerMap.put("supportedMediaColors", (n) -> { this.setSupportedMediaColors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedMediaSizes", (n) -> { this.setSupportedMediaSizes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedMediaTypes", (n) -> { this.setSupportedMediaTypes(n.getCollectionOfEnumValues(PrintMediaType::forValue)); });
        deserializerMap.put("supportedOrientations", (n) -> { this.setSupportedOrientations(n.getCollectionOfEnumValues(PrintOrientation::forValue)); });
        deserializerMap.put("supportedOutputBins", (n) -> { this.setSupportedOutputBins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedPagesPerSheet", (n) -> { this.setSupportedPagesPerSheet(n.getObjectValue(IntegerRange::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedPresentationDirections", (n) -> { this.setSupportedPresentationDirections(n.getCollectionOfEnumValues(PrintPresentationDirection::forValue)); });
        deserializerMap.put("supportedPrintQualities", (n) -> { this.setSupportedPrintQualities(n.getCollectionOfEnumValues(PrintQuality::forValue)); });
        deserializerMap.put("supportsFitPdfToPage", (n) -> { this.setSupportsFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("topMargins", (n) -> { this.setTopMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. Finishing processes the printer supports for a printed document.
     * @return a {@link java.util.List<PrintFinishing>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.backingStore.get("finishings");
    }
    /**
     * Gets the inputBins property value. Supported input bins for the printer.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputBins() {
        return this.backingStore.get("inputBins");
    }
    /**
     * Gets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsColorPrintingSupported() {
        return this.backingStore.get("isColorPrintingSupported");
    }
    /**
     * Gets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPageRangeSupported() {
        return this.backingStore.get("isPageRangeSupported");
    }
    /**
     * Gets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getLeftMargins() {
        return this.backingStore.get("leftMargins");
    }
    /**
     * Gets the mediaColors property value. The media (that is, paper) colors supported by the printer.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMediaColors() {
        return this.backingStore.get("mediaColors");
    }
    /**
     * Gets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMediaSizes() {
        return this.backingStore.get("mediaSizes");
    }
    /**
     * Gets the mediaTypes property value. The media types supported by the printer.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMediaTypes() {
        return this.backingStore.get("mediaTypes");
    }
    /**
     * Gets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @return a {@link java.util.List<PrintMultipageLayout>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintMultipageLayout> getMultipageLayouts() {
        return this.backingStore.get("multipageLayouts");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @return a {@link java.util.List<PrintOrientation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintOrientation> getOrientations() {
        return this.backingStore.get("orientations");
    }
    /**
     * Gets the outputBins property value. The printer&apos;s supported output bins (trays).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputBins() {
        return this.backingStore.get("outputBins");
    }
    /**
     * Gets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getPagesPerSheet() {
        return this.backingStore.get("pagesPerSheet");
    }
    /**
     * Gets the qualities property value. The print qualities supported by the printer.
     * @return a {@link java.util.List<PrintQuality>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintQuality> getQualities() {
        return this.backingStore.get("qualities");
    }
    /**
     * Gets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getRightMargins() {
        return this.backingStore.get("rightMargins");
    }
    /**
     * Gets the scalings property value. Supported print scalings.
     * @return a {@link java.util.List<PrintScaling>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintScaling> getScalings() {
        return this.backingStore.get("scalings");
    }
    /**
     * Gets the supportedColorConfigurations property value. The supportedColorConfigurations property
     * @return a {@link java.util.List<PrintColorConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintColorConfiguration> getSupportedColorConfigurations() {
        return this.backingStore.get("supportedColorConfigurations");
    }
    /**
     * Gets the supportedCopiesPerJob property value. The supportedCopiesPerJob property
     * @return a {@link IntegerRange}
     */
    @jakarta.annotation.Nullable
    public IntegerRange getSupportedCopiesPerJob() {
        return this.backingStore.get("supportedCopiesPerJob");
    }
    /**
     * Gets the supportedDocumentMimeTypes property value. The supportedDocumentMimeTypes property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedDocumentMimeTypes() {
        return this.backingStore.get("supportedDocumentMimeTypes");
    }
    /**
     * Gets the supportedDuplexConfigurations property value. The supportedDuplexConfigurations property
     * @return a {@link java.util.List<PrintDuplexConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintDuplexConfiguration> getSupportedDuplexConfigurations() {
        return this.backingStore.get("supportedDuplexConfigurations");
    }
    /**
     * Gets the supportedFinishings property value. The supportedFinishings property
     * @return a {@link java.util.List<PrintFinishing>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintFinishing> getSupportedFinishings() {
        return this.backingStore.get("supportedFinishings");
    }
    /**
     * Gets the supportedMediaColors property value. The supportedMediaColors property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedMediaColors() {
        return this.backingStore.get("supportedMediaColors");
    }
    /**
     * Gets the supportedMediaSizes property value. The supportedMediaSizes property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedMediaSizes() {
        return this.backingStore.get("supportedMediaSizes");
    }
    /**
     * Gets the supportedMediaTypes property value. The supportedMediaTypes property
     * @return a {@link java.util.List<PrintMediaType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintMediaType> getSupportedMediaTypes() {
        return this.backingStore.get("supportedMediaTypes");
    }
    /**
     * Gets the supportedOrientations property value. The supportedOrientations property
     * @return a {@link java.util.List<PrintOrientation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintOrientation> getSupportedOrientations() {
        return this.backingStore.get("supportedOrientations");
    }
    /**
     * Gets the supportedOutputBins property value. The supportedOutputBins property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedOutputBins() {
        return this.backingStore.get("supportedOutputBins");
    }
    /**
     * Gets the supportedPagesPerSheet property value. The supportedPagesPerSheet property
     * @return a {@link IntegerRange}
     */
    @jakarta.annotation.Nullable
    public IntegerRange getSupportedPagesPerSheet() {
        return this.backingStore.get("supportedPagesPerSheet");
    }
    /**
     * Gets the supportedPresentationDirections property value. The supportedPresentationDirections property
     * @return a {@link java.util.List<PrintPresentationDirection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintPresentationDirection> getSupportedPresentationDirections() {
        return this.backingStore.get("supportedPresentationDirections");
    }
    /**
     * Gets the supportedPrintQualities property value. The supportedPrintQualities property
     * @return a {@link java.util.List<PrintQuality>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintQuality> getSupportedPrintQualities() {
        return this.backingStore.get("supportedPrintQualities");
    }
    /**
     * Gets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsFitPdfToPage() {
        return this.backingStore.get("supportsFitPdfToPage");
    }
    /**
     * Gets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getTopMargins() {
        return this.backingStore.get("topMargins");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("bottomMargins", this.getBottomMargins());
        writer.writeBooleanValue("collation", this.getCollation());
        writer.writeCollectionOfEnumValues("colorModes", this.getColorModes());
        writer.writeCollectionOfPrimitiveValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("copiesPerJob", this.getCopiesPerJob());
        writer.writeCollectionOfPrimitiveValues("dpis", this.getDpis());
        writer.writeCollectionOfEnumValues("duplexModes", this.getDuplexModes());
        writer.writeCollectionOfEnumValues("feedDirections", this.getFeedDirections());
        writer.writeCollectionOfEnumValues("feedOrientations", this.getFeedOrientations());
        writer.writeCollectionOfEnumValues("finishings", this.getFinishings());
        writer.writeCollectionOfPrimitiveValues("inputBins", this.getInputBins());
        writer.writeBooleanValue("isColorPrintingSupported", this.getIsColorPrintingSupported());
        writer.writeBooleanValue("isPageRangeSupported", this.getIsPageRangeSupported());
        writer.writeCollectionOfPrimitiveValues("leftMargins", this.getLeftMargins());
        writer.writeCollectionOfPrimitiveValues("mediaColors", this.getMediaColors());
        writer.writeCollectionOfPrimitiveValues("mediaSizes", this.getMediaSizes());
        writer.writeCollectionOfPrimitiveValues("mediaTypes", this.getMediaTypes());
        writer.writeCollectionOfEnumValues("multipageLayouts", this.getMultipageLayouts());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("orientations", this.getOrientations());
        writer.writeCollectionOfPrimitiveValues("outputBins", this.getOutputBins());
        writer.writeCollectionOfPrimitiveValues("pagesPerSheet", this.getPagesPerSheet());
        writer.writeCollectionOfEnumValues("qualities", this.getQualities());
        writer.writeCollectionOfPrimitiveValues("rightMargins", this.getRightMargins());
        writer.writeCollectionOfEnumValues("scalings", this.getScalings());
        writer.writeCollectionOfEnumValues("supportedColorConfigurations", this.getSupportedColorConfigurations());
        writer.writeObjectValue("supportedCopiesPerJob", this.getSupportedCopiesPerJob());
        writer.writeCollectionOfPrimitiveValues("supportedDocumentMimeTypes", this.getSupportedDocumentMimeTypes());
        writer.writeCollectionOfEnumValues("supportedDuplexConfigurations", this.getSupportedDuplexConfigurations());
        writer.writeCollectionOfEnumValues("supportedFinishings", this.getSupportedFinishings());
        writer.writeCollectionOfPrimitiveValues("supportedMediaColors", this.getSupportedMediaColors());
        writer.writeCollectionOfPrimitiveValues("supportedMediaSizes", this.getSupportedMediaSizes());
        writer.writeCollectionOfEnumValues("supportedMediaTypes", this.getSupportedMediaTypes());
        writer.writeCollectionOfEnumValues("supportedOrientations", this.getSupportedOrientations());
        writer.writeCollectionOfPrimitiveValues("supportedOutputBins", this.getSupportedOutputBins());
        writer.writeObjectValue("supportedPagesPerSheet", this.getSupportedPagesPerSheet());
        writer.writeCollectionOfEnumValues("supportedPresentationDirections", this.getSupportedPresentationDirections());
        writer.writeCollectionOfEnumValues("supportedPrintQualities", this.getSupportedPrintQualities());
        writer.writeBooleanValue("supportsFitPdfToPage", this.getSupportsFitPdfToPage());
        writer.writeCollectionOfPrimitiveValues("topMargins", this.getTopMargins());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @param value Value to set for the bottomMargins property.
     */
    public void setBottomMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("bottomMargins", value);
    }
    /**
     * Sets the collation property value. True if the printer supports collating when printing multiple copies of a multi-page document; false otherwise.
     * @param value Value to set for the collation property.
     */
    public void setCollation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("collation", value);
    }
    /**
     * Sets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the colorModes property.
     */
    public void setColorModes(@jakarta.annotation.Nullable final java.util.List<PrintColorMode> value) {
        this.backingStore.set("colorModes", value);
    }
    /**
     * Sets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It isn&apos;t guaranteed that the Universal Print service supports printing all of these MIME types.
     * @param value Value to set for the contentTypes property.
     */
    public void setContentTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contentTypes", value);
    }
    /**
     * Sets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @param value Value to set for the copiesPerJob property.
     */
    public void setCopiesPerJob(@jakarta.annotation.Nullable final IntegerRange value) {
        this.backingStore.set("copiesPerJob", value);
    }
    /**
     * Sets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @param value Value to set for the dpis property.
     */
    public void setDpis(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("dpis", value);
    }
    /**
     * Sets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the duplexModes property.
     */
    public void setDuplexModes(@jakarta.annotation.Nullable final java.util.List<PrintDuplexMode> value) {
        this.backingStore.set("duplexModes", value);
    }
    /**
     * Sets the feedDirections property value. The feedDirections property
     * @param value Value to set for the feedDirections property.
     */
    public void setFeedDirections(@jakarta.annotation.Nullable final java.util.List<PrinterFeedDirection> value) {
        this.backingStore.set("feedDirections", value);
    }
    /**
     * Sets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @param value Value to set for the feedOrientations property.
     */
    public void setFeedOrientations(@jakarta.annotation.Nullable final java.util.List<PrinterFeedOrientation> value) {
        this.backingStore.set("feedOrientations", value);
    }
    /**
     * Sets the finishings property value. Finishing processes the printer supports for a printed document.
     * @param value Value to set for the finishings property.
     */
    public void setFinishings(@jakarta.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.backingStore.set("finishings", value);
    }
    /**
     * Sets the inputBins property value. Supported input bins for the printer.
     * @param value Value to set for the inputBins property.
     */
    public void setInputBins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("inputBins", value);
    }
    /**
     * Sets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @param value Value to set for the isColorPrintingSupported property.
     */
    public void setIsColorPrintingSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isColorPrintingSupported", value);
    }
    /**
     * Sets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @param value Value to set for the isPageRangeSupported property.
     */
    public void setIsPageRangeSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPageRangeSupported", value);
    }
    /**
     * Sets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @param value Value to set for the leftMargins property.
     */
    public void setLeftMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("leftMargins", value);
    }
    /**
     * Sets the mediaColors property value. The media (that is, paper) colors supported by the printer.
     * @param value Value to set for the mediaColors property.
     */
    public void setMediaColors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mediaColors", value);
    }
    /**
     * Sets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @param value Value to set for the mediaSizes property.
     */
    public void setMediaSizes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mediaSizes", value);
    }
    /**
     * Sets the mediaTypes property value. The media types supported by the printer.
     * @param value Value to set for the mediaTypes property.
     */
    public void setMediaTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mediaTypes", value);
    }
    /**
     * Sets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @param value Value to set for the multipageLayouts property.
     */
    public void setMultipageLayouts(@jakarta.annotation.Nullable final java.util.List<PrintMultipageLayout> value) {
        this.backingStore.set("multipageLayouts", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the orientations property.
     */
    public void setOrientations(@jakarta.annotation.Nullable final java.util.List<PrintOrientation> value) {
        this.backingStore.set("orientations", value);
    }
    /**
     * Sets the outputBins property value. The printer&apos;s supported output bins (trays).
     * @param value Value to set for the outputBins property.
     */
    public void setOutputBins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("outputBins", value);
    }
    /**
     * Sets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @param value Value to set for the pagesPerSheet property.
     */
    public void setPagesPerSheet(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("pagesPerSheet", value);
    }
    /**
     * Sets the qualities property value. The print qualities supported by the printer.
     * @param value Value to set for the qualities property.
     */
    public void setQualities(@jakarta.annotation.Nullable final java.util.List<PrintQuality> value) {
        this.backingStore.set("qualities", value);
    }
    /**
     * Sets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @param value Value to set for the rightMargins property.
     */
    public void setRightMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("rightMargins", value);
    }
    /**
     * Sets the scalings property value. Supported print scalings.
     * @param value Value to set for the scalings property.
     */
    public void setScalings(@jakarta.annotation.Nullable final java.util.List<PrintScaling> value) {
        this.backingStore.set("scalings", value);
    }
    /**
     * Sets the supportedColorConfigurations property value. The supportedColorConfigurations property
     * @param value Value to set for the supportedColorConfigurations property.
     */
    public void setSupportedColorConfigurations(@jakarta.annotation.Nullable final java.util.List<PrintColorConfiguration> value) {
        this.backingStore.set("supportedColorConfigurations", value);
    }
    /**
     * Sets the supportedCopiesPerJob property value. The supportedCopiesPerJob property
     * @param value Value to set for the supportedCopiesPerJob property.
     */
    public void setSupportedCopiesPerJob(@jakarta.annotation.Nullable final IntegerRange value) {
        this.backingStore.set("supportedCopiesPerJob", value);
    }
    /**
     * Sets the supportedDocumentMimeTypes property value. The supportedDocumentMimeTypes property
     * @param value Value to set for the supportedDocumentMimeTypes property.
     */
    public void setSupportedDocumentMimeTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedDocumentMimeTypes", value);
    }
    /**
     * Sets the supportedDuplexConfigurations property value. The supportedDuplexConfigurations property
     * @param value Value to set for the supportedDuplexConfigurations property.
     */
    public void setSupportedDuplexConfigurations(@jakarta.annotation.Nullable final java.util.List<PrintDuplexConfiguration> value) {
        this.backingStore.set("supportedDuplexConfigurations", value);
    }
    /**
     * Sets the supportedFinishings property value. The supportedFinishings property
     * @param value Value to set for the supportedFinishings property.
     */
    public void setSupportedFinishings(@jakarta.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.backingStore.set("supportedFinishings", value);
    }
    /**
     * Sets the supportedMediaColors property value. The supportedMediaColors property
     * @param value Value to set for the supportedMediaColors property.
     */
    public void setSupportedMediaColors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedMediaColors", value);
    }
    /**
     * Sets the supportedMediaSizes property value. The supportedMediaSizes property
     * @param value Value to set for the supportedMediaSizes property.
     */
    public void setSupportedMediaSizes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedMediaSizes", value);
    }
    /**
     * Sets the supportedMediaTypes property value. The supportedMediaTypes property
     * @param value Value to set for the supportedMediaTypes property.
     */
    public void setSupportedMediaTypes(@jakarta.annotation.Nullable final java.util.List<PrintMediaType> value) {
        this.backingStore.set("supportedMediaTypes", value);
    }
    /**
     * Sets the supportedOrientations property value. The supportedOrientations property
     * @param value Value to set for the supportedOrientations property.
     */
    public void setSupportedOrientations(@jakarta.annotation.Nullable final java.util.List<PrintOrientation> value) {
        this.backingStore.set("supportedOrientations", value);
    }
    /**
     * Sets the supportedOutputBins property value. The supportedOutputBins property
     * @param value Value to set for the supportedOutputBins property.
     */
    public void setSupportedOutputBins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedOutputBins", value);
    }
    /**
     * Sets the supportedPagesPerSheet property value. The supportedPagesPerSheet property
     * @param value Value to set for the supportedPagesPerSheet property.
     */
    public void setSupportedPagesPerSheet(@jakarta.annotation.Nullable final IntegerRange value) {
        this.backingStore.set("supportedPagesPerSheet", value);
    }
    /**
     * Sets the supportedPresentationDirections property value. The supportedPresentationDirections property
     * @param value Value to set for the supportedPresentationDirections property.
     */
    public void setSupportedPresentationDirections(@jakarta.annotation.Nullable final java.util.List<PrintPresentationDirection> value) {
        this.backingStore.set("supportedPresentationDirections", value);
    }
    /**
     * Sets the supportedPrintQualities property value. The supportedPrintQualities property
     * @param value Value to set for the supportedPrintQualities property.
     */
    public void setSupportedPrintQualities(@jakarta.annotation.Nullable final java.util.List<PrintQuality> value) {
        this.backingStore.set("supportedPrintQualities", value);
    }
    /**
     * Sets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @param value Value to set for the supportsFitPdfToPage property.
     */
    public void setSupportsFitPdfToPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("supportsFitPdfToPage", value);
    }
    /**
     * Sets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @param value Value to set for the topMargins property.
     */
    public void setTopMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("topMargins", value);
    }
}

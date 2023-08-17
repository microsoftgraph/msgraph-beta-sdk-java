package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterDefaults implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default color mode to use when printing the document. Valid values are described in the following table.
     */
    private PrintColorMode colorMode;
    /**
     * The default content (MIME) type to use when processing documents.
     */
    private String contentType;
    /**
     * The default number of copies printed per job.
     */
    private Integer copiesPerJob;
    /**
     * The documentMimeType property
     */
    private String documentMimeType;
    /**
     * The default resolution in DPI to use when printing the job.
     */
    private Integer dpi;
    /**
     * The duplexConfiguration property
     */
    private PrintDuplexConfiguration duplexConfiguration;
    /**
     * The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     */
    private PrintDuplexMode duplexMode;
    /**
     * The default set of finishings to apply to print jobs. Valid values are described in the following table.
     */
    private java.util.List<PrintFinishing> finishings;
    /**
     * The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     */
    private Boolean fitPdfToPage;
    /**
     * The default input bin that serves as the paper source.
     */
    private String inputBin;
    /**
     * The default media (such as paper) color to print the document on.
     */
    private String mediaColor;
    /**
     * The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     */
    private String mediaSize;
    /**
     * The default media (such as paper) type to print the document on.
     */
    private String mediaType;
    /**
     * The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     */
    private PrintMultipageLayout multipageLayout;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The default orientation to use when printing the document. Valid values are described in the following table.
     */
    private PrintOrientation orientation;
    /**
     * The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     */
    private String outputBin;
    /**
     * The default number of document pages to print on each sheet.
     */
    private Integer pagesPerSheet;
    /**
     * The pdfFitToPage property
     */
    private Boolean pdfFitToPage;
    /**
     * The presentationDirection property
     */
    private PrintPresentationDirection presentationDirection;
    /**
     * The printColorConfiguration property
     */
    private PrintColorConfiguration printColorConfiguration;
    /**
     * The printQuality property
     */
    private PrintQuality printQuality;
    /**
     * The default quality to use when printing the document. Valid values are described in the following table.
     */
    private PrintQuality quality;
    /**
     * Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     */
    private PrintScaling scaling;
    /**
     * Instantiates a new printerDefaults and sets the default values.
     */
    public PrinterDefaults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerDefaults
     */
    @jakarta.annotation.Nonnull
    public static PrinterDefaults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterDefaults();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @return a printColorMode
     */
    @jakarta.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this.colorMode;
    }
    /**
     * Gets the contentType property value. The default content (MIME) type to use when processing documents.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * Gets the copiesPerJob property value. The default number of copies printed per job.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCopiesPerJob() {
        return this.copiesPerJob;
    }
    /**
     * Gets the documentMimeType property value. The documentMimeType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDocumentMimeType() {
        return this.documentMimeType;
    }
    /**
     * Gets the dpi property value. The default resolution in DPI to use when printing the job.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDpi() {
        return this.dpi;
    }
    /**
     * Gets the duplexConfiguration property value. The duplexConfiguration property
     * @return a printDuplexConfiguration
     */
    @jakarta.annotation.Nullable
    public PrintDuplexConfiguration getDuplexConfiguration() {
        return this.duplexConfiguration;
    }
    /**
     * Gets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @return a printDuplexMode
     */
    @jakarta.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this.duplexMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("colorMode", (n) -> { this.setColorMode(n.getEnumValue(PrintColorMode.class)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("copiesPerJob", (n) -> { this.setCopiesPerJob(n.getIntegerValue()); });
        deserializerMap.put("documentMimeType", (n) -> { this.setDocumentMimeType(n.getStringValue()); });
        deserializerMap.put("dpi", (n) -> { this.setDpi(n.getIntegerValue()); });
        deserializerMap.put("duplexConfiguration", (n) -> { this.setDuplexConfiguration(n.getEnumValue(PrintDuplexConfiguration.class)); });
        deserializerMap.put("duplexMode", (n) -> { this.setDuplexMode(n.getEnumValue(PrintDuplexMode.class)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing.class)); });
        deserializerMap.put("fitPdfToPage", (n) -> { this.setFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("inputBin", (n) -> { this.setInputBin(n.getStringValue()); });
        deserializerMap.put("mediaColor", (n) -> { this.setMediaColor(n.getStringValue()); });
        deserializerMap.put("mediaSize", (n) -> { this.setMediaSize(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("multipageLayout", (n) -> { this.setMultipageLayout(n.getEnumValue(PrintMultipageLayout.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getEnumValue(PrintOrientation.class)); });
        deserializerMap.put("outputBin", (n) -> { this.setOutputBin(n.getStringValue()); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getIntegerValue()); });
        deserializerMap.put("pdfFitToPage", (n) -> { this.setPdfFitToPage(n.getBooleanValue()); });
        deserializerMap.put("presentationDirection", (n) -> { this.setPresentationDirection(n.getEnumValue(PrintPresentationDirection.class)); });
        deserializerMap.put("printColorConfiguration", (n) -> { this.setPrintColorConfiguration(n.getEnumValue(PrintColorConfiguration.class)); });
        deserializerMap.put("printQuality", (n) -> { this.setPrintQuality(n.getEnumValue(PrintQuality.class)); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(PrintQuality.class)); });
        deserializerMap.put("scaling", (n) -> { this.setScaling(n.getEnumValue(PrintScaling.class)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @return a printFinishing
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.finishings;
    }
    /**
     * Gets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this.fitPdfToPage;
    }
    /**
     * Gets the inputBin property value. The default input bin that serves as the paper source.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInputBin() {
        return this.inputBin;
    }
    /**
     * Gets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMediaColor() {
        return this.mediaColor;
    }
    /**
     * Gets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMediaSize() {
        return this.mediaSize;
    }
    /**
     * Gets the mediaType property value. The default media (such as paper) type to print the document on.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.mediaType;
    }
    /**
     * Gets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @return a printMultipageLayout
     */
    @jakarta.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this.multipageLayout;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @return a printOrientation
     */
    @jakarta.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this.orientation;
    }
    /**
     * Gets the outputBin property value. The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOutputBin() {
        return this.outputBin;
    }
    /**
     * Gets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this.pagesPerSheet;
    }
    /**
     * Gets the pdfFitToPage property value. The pdfFitToPage property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPdfFitToPage() {
        return this.pdfFitToPage;
    }
    /**
     * Gets the presentationDirection property value. The presentationDirection property
     * @return a printPresentationDirection
     */
    @jakarta.annotation.Nullable
    public PrintPresentationDirection getPresentationDirection() {
        return this.presentationDirection;
    }
    /**
     * Gets the printColorConfiguration property value. The printColorConfiguration property
     * @return a printColorConfiguration
     */
    @jakarta.annotation.Nullable
    public PrintColorConfiguration getPrintColorConfiguration() {
        return this.printColorConfiguration;
    }
    /**
     * Gets the printQuality property value. The printQuality property
     * @return a printQuality
     */
    @jakarta.annotation.Nullable
    public PrintQuality getPrintQuality() {
        return this.printQuality;
    }
    /**
     * Gets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @return a printQuality
     */
    @jakarta.annotation.Nullable
    public PrintQuality getQuality() {
        return this.quality;
    }
    /**
     * Gets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @return a printScaling
     */
    @jakarta.annotation.Nullable
    public PrintScaling getScaling() {
        return this.scaling;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("colorMode", this.getColorMode());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeIntegerValue("copiesPerJob", this.getCopiesPerJob());
        writer.writeStringValue("documentMimeType", this.getDocumentMimeType());
        writer.writeIntegerValue("dpi", this.getDpi());
        writer.writeEnumValue("duplexConfiguration", this.getDuplexConfiguration());
        writer.writeEnumValue("duplexMode", this.getDuplexMode());
        writer.writeCollectionOfEnumValues("finishings", this.getFinishings());
        writer.writeBooleanValue("fitPdfToPage", this.getFitPdfToPage());
        writer.writeStringValue("inputBin", this.getInputBin());
        writer.writeStringValue("mediaColor", this.getMediaColor());
        writer.writeStringValue("mediaSize", this.getMediaSize());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeEnumValue("multipageLayout", this.getMultipageLayout());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("orientation", this.getOrientation());
        writer.writeStringValue("outputBin", this.getOutputBin());
        writer.writeIntegerValue("pagesPerSheet", this.getPagesPerSheet());
        writer.writeBooleanValue("pdfFitToPage", this.getPdfFitToPage());
        writer.writeEnumValue("presentationDirection", this.getPresentationDirection());
        writer.writeEnumValue("printColorConfiguration", this.getPrintColorConfiguration());
        writer.writeEnumValue("printQuality", this.getPrintQuality());
        writer.writeEnumValue("quality", this.getQuality());
        writer.writeEnumValue("scaling", this.getScaling());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the colorMode property.
     */
    public void setColorMode(@jakarta.annotation.Nullable final PrintColorMode value) {
        this.colorMode = value;
    }
    /**
     * Sets the contentType property value. The default content (MIME) type to use when processing documents.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the copiesPerJob property value. The default number of copies printed per job.
     * @param value Value to set for the copiesPerJob property.
     */
    public void setCopiesPerJob(@jakarta.annotation.Nullable final Integer value) {
        this.copiesPerJob = value;
    }
    /**
     * Sets the documentMimeType property value. The documentMimeType property
     * @param value Value to set for the documentMimeType property.
     */
    public void setDocumentMimeType(@jakarta.annotation.Nullable final String value) {
        this.documentMimeType = value;
    }
    /**
     * Sets the dpi property value. The default resolution in DPI to use when printing the job.
     * @param value Value to set for the dpi property.
     */
    public void setDpi(@jakarta.annotation.Nullable final Integer value) {
        this.dpi = value;
    }
    /**
     * Sets the duplexConfiguration property value. The duplexConfiguration property
     * @param value Value to set for the duplexConfiguration property.
     */
    public void setDuplexConfiguration(@jakarta.annotation.Nullable final PrintDuplexConfiguration value) {
        this.duplexConfiguration = value;
    }
    /**
     * Sets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @param value Value to set for the duplexMode property.
     */
    public void setDuplexMode(@jakarta.annotation.Nullable final PrintDuplexMode value) {
        this.duplexMode = value;
    }
    /**
     * Sets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @param value Value to set for the finishings property.
     */
    public void setFinishings(@jakarta.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.finishings = value;
    }
    /**
     * Sets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @param value Value to set for the fitPdfToPage property.
     */
    public void setFitPdfToPage(@jakarta.annotation.Nullable final Boolean value) {
        this.fitPdfToPage = value;
    }
    /**
     * Sets the inputBin property value. The default input bin that serves as the paper source.
     * @param value Value to set for the inputBin property.
     */
    public void setInputBin(@jakarta.annotation.Nullable final String value) {
        this.inputBin = value;
    }
    /**
     * Sets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @param value Value to set for the mediaColor property.
     */
    public void setMediaColor(@jakarta.annotation.Nullable final String value) {
        this.mediaColor = value;
    }
    /**
     * Sets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @param value Value to set for the mediaSize property.
     */
    public void setMediaSize(@jakarta.annotation.Nullable final String value) {
        this.mediaSize = value;
    }
    /**
     * Sets the mediaType property value. The default media (such as paper) type to print the document on.
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.mediaType = value;
    }
    /**
     * Sets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @param value Value to set for the multipageLayout property.
     */
    public void setMultipageLayout(@jakarta.annotation.Nullable final PrintMultipageLayout value) {
        this.multipageLayout = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the orientation property.
     */
    public void setOrientation(@jakarta.annotation.Nullable final PrintOrientation value) {
        this.orientation = value;
    }
    /**
     * Sets the outputBin property value. The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     * @param value Value to set for the outputBin property.
     */
    public void setOutputBin(@jakarta.annotation.Nullable final String value) {
        this.outputBin = value;
    }
    /**
     * Sets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @param value Value to set for the pagesPerSheet property.
     */
    public void setPagesPerSheet(@jakarta.annotation.Nullable final Integer value) {
        this.pagesPerSheet = value;
    }
    /**
     * Sets the pdfFitToPage property value. The pdfFitToPage property
     * @param value Value to set for the pdfFitToPage property.
     */
    public void setPdfFitToPage(@jakarta.annotation.Nullable final Boolean value) {
        this.pdfFitToPage = value;
    }
    /**
     * Sets the presentationDirection property value. The presentationDirection property
     * @param value Value to set for the presentationDirection property.
     */
    public void setPresentationDirection(@jakarta.annotation.Nullable final PrintPresentationDirection value) {
        this.presentationDirection = value;
    }
    /**
     * Sets the printColorConfiguration property value. The printColorConfiguration property
     * @param value Value to set for the printColorConfiguration property.
     */
    public void setPrintColorConfiguration(@jakarta.annotation.Nullable final PrintColorConfiguration value) {
        this.printColorConfiguration = value;
    }
    /**
     * Sets the printQuality property value. The printQuality property
     * @param value Value to set for the printQuality property.
     */
    public void setPrintQuality(@jakarta.annotation.Nullable final PrintQuality value) {
        this.printQuality = value;
    }
    /**
     * Sets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final PrintQuality value) {
        this.quality = value;
    }
    /**
     * Sets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @param value Value to set for the scaling property.
     */
    public void setScaling(@jakarta.annotation.Nullable final PrintScaling value) {
        this.scaling = value;
    }
}

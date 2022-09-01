package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterDefaults implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The default color mode to use when printing the document. Valid values are described in the following table. */
    private PrintColorMode _colorMode;
    /** The default content (MIME) type to use when processing documents. */
    private String _contentType;
    /** The default number of copies printed per job. */
    private Integer _copiesPerJob;
    /** The documentMimeType property */
    private String _documentMimeType;
    /** The default resolution in DPI to use when printing the job. */
    private Integer _dpi;
    /** The duplexConfiguration property */
    private PrintDuplexConfiguration _duplexConfiguration;
    /** The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table. */
    private PrintDuplexMode _duplexMode;
    /** The default set of finishings to apply to print jobs. Valid values are described in the following table. */
    private java.util.List<String> _finishings;
    /** The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions. */
    private Boolean _fitPdfToPage;
    /** The default input bin that serves as the paper source. */
    private String _inputBin;
    /** The default media (such as paper) color to print the document on. */
    private String _mediaColor;
    /** The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic. */
    private String _mediaSize;
    /** The default media (such as paper) type to print the document on. */
    private String _mediaType;
    /** The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table. */
    private PrintMultipageLayout _multipageLayout;
    /** The OdataType property */
    private String _odataType;
    /** The default orientation to use when printing the document. Valid values are described in the following table. */
    private PrintOrientation _orientation;
    /** The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins. */
    private String _outputBin;
    /** The default number of document pages to print on each sheet. */
    private Integer _pagesPerSheet;
    /** The pdfFitToPage property */
    private Boolean _pdfFitToPage;
    /** The presentationDirection property */
    private PrintPresentationDirection _presentationDirection;
    /** The printColorConfiguration property */
    private PrintColorConfiguration _printColorConfiguration;
    /** The printQuality property */
    private PrintQuality _printQuality;
    /** The default quality to use when printing the document. Valid values are described in the following table. */
    private PrintQuality _quality;
    /** Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table. */
    private PrintScaling _scaling;
    /**
     * Instantiates a new printerDefaults and sets the default values.
     * @return a void
     */
    public PrinterDefaults() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.printerDefaults");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerDefaults
     */
    @javax.annotation.Nonnull
    public static PrinterDefaults createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterDefaults();
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
     * Gets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @return a printColorMode
     */
    @javax.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this._colorMode;
    }
    /**
     * Gets the contentType property value. The default content (MIME) type to use when processing documents.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * Gets the copiesPerJob property value. The default number of copies printed per job.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCopiesPerJob() {
        return this._copiesPerJob;
    }
    /**
     * Gets the documentMimeType property value. The documentMimeType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentMimeType() {
        return this._documentMimeType;
    }
    /**
     * Gets the dpi property value. The default resolution in DPI to use when printing the job.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDpi() {
        return this._dpi;
    }
    /**
     * Gets the duplexConfiguration property value. The duplexConfiguration property
     * @return a printDuplexConfiguration
     */
    @javax.annotation.Nullable
    public PrintDuplexConfiguration getDuplexConfiguration() {
        return this._duplexConfiguration;
    }
    /**
     * Gets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @return a printDuplexMode
     */
    @javax.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this._duplexMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterDefaults currentObject = this;
        return new HashMap<>(24) {{
            this.put("colorMode", (n) -> { currentObject.setColorMode(n.getEnumValue(PrintColorMode.class)); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
            this.put("copiesPerJob", (n) -> { currentObject.setCopiesPerJob(n.getIntegerValue()); });
            this.put("documentMimeType", (n) -> { currentObject.setDocumentMimeType(n.getStringValue()); });
            this.put("dpi", (n) -> { currentObject.setDpi(n.getIntegerValue()); });
            this.put("duplexConfiguration", (n) -> { currentObject.setDuplexConfiguration(n.getEnumValue(PrintDuplexConfiguration.class)); });
            this.put("duplexMode", (n) -> { currentObject.setDuplexMode(n.getEnumValue(PrintDuplexMode.class)); });
            this.put("finishings", (n) -> { currentObject.setFinishings(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("fitPdfToPage", (n) -> { currentObject.setFitPdfToPage(n.getBooleanValue()); });
            this.put("inputBin", (n) -> { currentObject.setInputBin(n.getStringValue()); });
            this.put("mediaColor", (n) -> { currentObject.setMediaColor(n.getStringValue()); });
            this.put("mediaSize", (n) -> { currentObject.setMediaSize(n.getStringValue()); });
            this.put("mediaType", (n) -> { currentObject.setMediaType(n.getStringValue()); });
            this.put("multipageLayout", (n) -> { currentObject.setMultipageLayout(n.getEnumValue(PrintMultipageLayout.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("orientation", (n) -> { currentObject.setOrientation(n.getEnumValue(PrintOrientation.class)); });
            this.put("outputBin", (n) -> { currentObject.setOutputBin(n.getStringValue()); });
            this.put("pagesPerSheet", (n) -> { currentObject.setPagesPerSheet(n.getIntegerValue()); });
            this.put("pdfFitToPage", (n) -> { currentObject.setPdfFitToPage(n.getBooleanValue()); });
            this.put("presentationDirection", (n) -> { currentObject.setPresentationDirection(n.getEnumValue(PrintPresentationDirection.class)); });
            this.put("printColorConfiguration", (n) -> { currentObject.setPrintColorConfiguration(n.getEnumValue(PrintColorConfiguration.class)); });
            this.put("printQuality", (n) -> { currentObject.setPrintQuality(n.getEnumValue(PrintQuality.class)); });
            this.put("quality", (n) -> { currentObject.setQuality(n.getEnumValue(PrintQuality.class)); });
            this.put("scaling", (n) -> { currentObject.setScaling(n.getEnumValue(PrintScaling.class)); });
        }};
    }
    /**
     * Gets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFinishings() {
        return this._finishings;
    }
    /**
     * Gets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this._fitPdfToPage;
    }
    /**
     * Gets the inputBin property value. The default input bin that serves as the paper source.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInputBin() {
        return this._inputBin;
    }
    /**
     * Gets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaColor() {
        return this._mediaColor;
    }
    /**
     * Gets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaSize() {
        return this._mediaSize;
    }
    /**
     * Gets the mediaType property value. The default media (such as paper) type to print the document on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this._mediaType;
    }
    /**
     * Gets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @return a printMultipageLayout
     */
    @javax.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this._multipageLayout;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @return a printOrientation
     */
    @javax.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this._orientation;
    }
    /**
     * Gets the outputBin property value. The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputBin() {
        return this._outputBin;
    }
    /**
     * Gets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this._pagesPerSheet;
    }
    /**
     * Gets the pdfFitToPage property value. The pdfFitToPage property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPdfFitToPage() {
        return this._pdfFitToPage;
    }
    /**
     * Gets the presentationDirection property value. The presentationDirection property
     * @return a printPresentationDirection
     */
    @javax.annotation.Nullable
    public PrintPresentationDirection getPresentationDirection() {
        return this._presentationDirection;
    }
    /**
     * Gets the printColorConfiguration property value. The printColorConfiguration property
     * @return a printColorConfiguration
     */
    @javax.annotation.Nullable
    public PrintColorConfiguration getPrintColorConfiguration() {
        return this._printColorConfiguration;
    }
    /**
     * Gets the printQuality property value. The printQuality property
     * @return a printQuality
     */
    @javax.annotation.Nullable
    public PrintQuality getPrintQuality() {
        return this._printQuality;
    }
    /**
     * Gets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @return a printQuality
     */
    @javax.annotation.Nullable
    public PrintQuality getQuality() {
        return this._quality;
    }
    /**
     * Gets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @return a printScaling
     */
    @javax.annotation.Nullable
    public PrintScaling getScaling() {
        return this._scaling;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("colorMode", this.getColorMode());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeIntegerValue("copiesPerJob", this.getCopiesPerJob());
        writer.writeStringValue("documentMimeType", this.getDocumentMimeType());
        writer.writeIntegerValue("dpi", this.getDpi());
        writer.writeEnumValue("duplexConfiguration", this.getDuplexConfiguration());
        writer.writeEnumValue("duplexMode", this.getDuplexMode());
        writer.writeCollectionOfPrimitiveValues("finishings", this.getFinishings());
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the colorMode property.
     * @return a void
     */
    public void setColorMode(@javax.annotation.Nullable final PrintColorMode value) {
        this._colorMode = value;
    }
    /**
     * Sets the contentType property value. The default content (MIME) type to use when processing documents.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the copiesPerJob property value. The default number of copies printed per job.
     * @param value Value to set for the copiesPerJob property.
     * @return a void
     */
    public void setCopiesPerJob(@javax.annotation.Nullable final Integer value) {
        this._copiesPerJob = value;
    }
    /**
     * Sets the documentMimeType property value. The documentMimeType property
     * @param value Value to set for the documentMimeType property.
     * @return a void
     */
    public void setDocumentMimeType(@javax.annotation.Nullable final String value) {
        this._documentMimeType = value;
    }
    /**
     * Sets the dpi property value. The default resolution in DPI to use when printing the job.
     * @param value Value to set for the dpi property.
     * @return a void
     */
    public void setDpi(@javax.annotation.Nullable final Integer value) {
        this._dpi = value;
    }
    /**
     * Sets the duplexConfiguration property value. The duplexConfiguration property
     * @param value Value to set for the duplexConfiguration property.
     * @return a void
     */
    public void setDuplexConfiguration(@javax.annotation.Nullable final PrintDuplexConfiguration value) {
        this._duplexConfiguration = value;
    }
    /**
     * Sets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @param value Value to set for the duplexMode property.
     * @return a void
     */
    public void setDuplexMode(@javax.annotation.Nullable final PrintDuplexMode value) {
        this._duplexMode = value;
    }
    /**
     * Sets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @param value Value to set for the finishings property.
     * @return a void
     */
    public void setFinishings(@javax.annotation.Nullable final java.util.List<String> value) {
        this._finishings = value;
    }
    /**
     * Sets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @param value Value to set for the fitPdfToPage property.
     * @return a void
     */
    public void setFitPdfToPage(@javax.annotation.Nullable final Boolean value) {
        this._fitPdfToPage = value;
    }
    /**
     * Sets the inputBin property value. The default input bin that serves as the paper source.
     * @param value Value to set for the inputBin property.
     * @return a void
     */
    public void setInputBin(@javax.annotation.Nullable final String value) {
        this._inputBin = value;
    }
    /**
     * Sets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @param value Value to set for the mediaColor property.
     * @return a void
     */
    public void setMediaColor(@javax.annotation.Nullable final String value) {
        this._mediaColor = value;
    }
    /**
     * Sets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @param value Value to set for the mediaSize property.
     * @return a void
     */
    public void setMediaSize(@javax.annotation.Nullable final String value) {
        this._mediaSize = value;
    }
    /**
     * Sets the mediaType property value. The default media (such as paper) type to print the document on.
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this._mediaType = value;
    }
    /**
     * Sets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @param value Value to set for the multipageLayout property.
     * @return a void
     */
    public void setMultipageLayout(@javax.annotation.Nullable final PrintMultipageLayout value) {
        this._multipageLayout = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the orientation property.
     * @return a void
     */
    public void setOrientation(@javax.annotation.Nullable final PrintOrientation value) {
        this._orientation = value;
    }
    /**
     * Sets the outputBin property value. The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     * @param value Value to set for the outputBin property.
     * @return a void
     */
    public void setOutputBin(@javax.annotation.Nullable final String value) {
        this._outputBin = value;
    }
    /**
     * Sets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @param value Value to set for the pagesPerSheet property.
     * @return a void
     */
    public void setPagesPerSheet(@javax.annotation.Nullable final Integer value) {
        this._pagesPerSheet = value;
    }
    /**
     * Sets the pdfFitToPage property value. The pdfFitToPage property
     * @param value Value to set for the pdfFitToPage property.
     * @return a void
     */
    public void setPdfFitToPage(@javax.annotation.Nullable final Boolean value) {
        this._pdfFitToPage = value;
    }
    /**
     * Sets the presentationDirection property value. The presentationDirection property
     * @param value Value to set for the presentationDirection property.
     * @return a void
     */
    public void setPresentationDirection(@javax.annotation.Nullable final PrintPresentationDirection value) {
        this._presentationDirection = value;
    }
    /**
     * Sets the printColorConfiguration property value. The printColorConfiguration property
     * @param value Value to set for the printColorConfiguration property.
     * @return a void
     */
    public void setPrintColorConfiguration(@javax.annotation.Nullable final PrintColorConfiguration value) {
        this._printColorConfiguration = value;
    }
    /**
     * Sets the printQuality property value. The printQuality property
     * @param value Value to set for the printQuality property.
     * @return a void
     */
    public void setPrintQuality(@javax.annotation.Nullable final PrintQuality value) {
        this._printQuality = value;
    }
    /**
     * Sets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the quality property.
     * @return a void
     */
    public void setQuality(@javax.annotation.Nullable final PrintQuality value) {
        this._quality = value;
    }
    /**
     * Sets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @param value Value to set for the scaling property.
     * @return a void
     */
    public void setScaling(@javax.annotation.Nullable final PrintScaling value) {
        this._scaling = value;
    }
}

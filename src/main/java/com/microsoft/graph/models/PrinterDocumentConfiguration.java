package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterDocumentConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The collate property  */
    private Boolean _collate;
    /** The colorMode property  */
    private PrintColorMode _colorMode;
    /** The copies property  */
    private Integer _copies;
    /** The dpi property  */
    private Integer _dpi;
    /** The duplexMode property  */
    private PrintDuplexMode _duplexMode;
    /** The feedDirection property  */
    private PrinterFeedDirection _feedDirection;
    /** The feedOrientation property  */
    private PrinterFeedOrientation _feedOrientation;
    /** The finishings property  */
    private java.util.List<PrintFinishing> _finishings;
    /** The fitPdfToPage property  */
    private Boolean _fitPdfToPage;
    /** The inputBin property  */
    private String _inputBin;
    /** The margin property  */
    private PrintMargin _margin;
    /** The mediaSize property  */
    private String _mediaSize;
    /** The mediaType property  */
    private String _mediaType;
    /** The multipageLayout property  */
    private PrintMultipageLayout _multipageLayout;
    /** The orientation property  */
    private PrintOrientation _orientation;
    /** The outputBin property  */
    private String _outputBin;
    /** The pageRanges property  */
    private java.util.List<IntegerRange> _pageRanges;
    /** The pagesPerSheet property  */
    private Integer _pagesPerSheet;
    /** The quality property  */
    private PrintQuality _quality;
    /** The scaling property  */
    private PrintScaling _scaling;
    /**
     * Instantiates a new printerDocumentConfiguration and sets the default values.
     * @return a void
     */
    public PrinterDocumentConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerDocumentConfiguration
     */
    @javax.annotation.Nonnull
    public static PrinterDocumentConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterDocumentConfiguration();
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
     * Gets the collate property value. The collate property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCollate() {
        return this._collate;
    }
    /**
     * Gets the colorMode property value. The colorMode property
     * @return a printColorMode
     */
    @javax.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this._colorMode;
    }
    /**
     * Gets the copies property value. The copies property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCopies() {
        return this._copies;
    }
    /**
     * Gets the dpi property value. The dpi property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDpi() {
        return this._dpi;
    }
    /**
     * Gets the duplexMode property value. The duplexMode property
     * @return a printDuplexMode
     */
    @javax.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this._duplexMode;
    }
    /**
     * Gets the feedDirection property value. The feedDirection property
     * @return a printerFeedDirection
     */
    @javax.annotation.Nullable
    public PrinterFeedDirection getFeedDirection() {
        return this._feedDirection;
    }
    /**
     * Gets the feedOrientation property value. The feedOrientation property
     * @return a printerFeedOrientation
     */
    @javax.annotation.Nullable
    public PrinterFeedOrientation getFeedOrientation() {
        return this._feedOrientation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterDocumentConfiguration currentObject = this;
        return new HashMap<>(20) {{
            this.put("collate", (n) -> { currentObject.setCollate(n.getBooleanValue()); });
            this.put("colorMode", (n) -> { currentObject.setColorMode(n.getEnumValue(PrintColorMode.class)); });
            this.put("copies", (n) -> { currentObject.setCopies(n.getIntegerValue()); });
            this.put("dpi", (n) -> { currentObject.setDpi(n.getIntegerValue()); });
            this.put("duplexMode", (n) -> { currentObject.setDuplexMode(n.getEnumValue(PrintDuplexMode.class)); });
            this.put("feedDirection", (n) -> { currentObject.setFeedDirection(n.getEnumValue(PrinterFeedDirection.class)); });
            this.put("feedOrientation", (n) -> { currentObject.setFeedOrientation(n.getEnumValue(PrinterFeedOrientation.class)); });
            this.put("finishings", (n) -> { currentObject.setFinishings(n.getCollectionOfEnumValues(PrintFinishing.class)); });
            this.put("fitPdfToPage", (n) -> { currentObject.setFitPdfToPage(n.getBooleanValue()); });
            this.put("inputBin", (n) -> { currentObject.setInputBin(n.getStringValue()); });
            this.put("margin", (n) -> { currentObject.setMargin(n.getObjectValue(PrintMargin::createFromDiscriminatorValue)); });
            this.put("mediaSize", (n) -> { currentObject.setMediaSize(n.getStringValue()); });
            this.put("mediaType", (n) -> { currentObject.setMediaType(n.getStringValue()); });
            this.put("multipageLayout", (n) -> { currentObject.setMultipageLayout(n.getEnumValue(PrintMultipageLayout.class)); });
            this.put("orientation", (n) -> { currentObject.setOrientation(n.getEnumValue(PrintOrientation.class)); });
            this.put("outputBin", (n) -> { currentObject.setOutputBin(n.getStringValue()); });
            this.put("pageRanges", (n) -> { currentObject.setPageRanges(n.getCollectionOfObjectValues(IntegerRange::createFromDiscriminatorValue)); });
            this.put("pagesPerSheet", (n) -> { currentObject.setPagesPerSheet(n.getIntegerValue()); });
            this.put("quality", (n) -> { currentObject.setQuality(n.getEnumValue(PrintQuality.class)); });
            this.put("scaling", (n) -> { currentObject.setScaling(n.getEnumValue(PrintScaling.class)); });
        }};
    }
    /**
     * Gets the finishings property value. The finishings property
     * @return a printFinishing
     */
    @javax.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this._finishings;
    }
    /**
     * Gets the fitPdfToPage property value. The fitPdfToPage property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this._fitPdfToPage;
    }
    /**
     * Gets the inputBin property value. The inputBin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInputBin() {
        return this._inputBin;
    }
    /**
     * Gets the margin property value. The margin property
     * @return a printMargin
     */
    @javax.annotation.Nullable
    public PrintMargin getMargin() {
        return this._margin;
    }
    /**
     * Gets the mediaSize property value. The mediaSize property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaSize() {
        return this._mediaSize;
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this._mediaType;
    }
    /**
     * Gets the multipageLayout property value. The multipageLayout property
     * @return a printMultipageLayout
     */
    @javax.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this._multipageLayout;
    }
    /**
     * Gets the orientation property value. The orientation property
     * @return a printOrientation
     */
    @javax.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this._orientation;
    }
    /**
     * Gets the outputBin property value. The outputBin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputBin() {
        return this._outputBin;
    }
    /**
     * Gets the pageRanges property value. The pageRanges property
     * @return a integerRange
     */
    @javax.annotation.Nullable
    public java.util.List<IntegerRange> getPageRanges() {
        return this._pageRanges;
    }
    /**
     * Gets the pagesPerSheet property value. The pagesPerSheet property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this._pagesPerSheet;
    }
    /**
     * Gets the quality property value. The quality property
     * @return a printQuality
     */
    @javax.annotation.Nullable
    public PrintQuality getQuality() {
        return this._quality;
    }
    /**
     * Gets the scaling property value. The scaling property
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
        writer.writeBooleanValue("collate", this.getCollate());
        writer.writeEnumValue("colorMode", this.getColorMode());
        writer.writeIntegerValue("copies", this.getCopies());
        writer.writeIntegerValue("dpi", this.getDpi());
        writer.writeEnumValue("duplexMode", this.getDuplexMode());
        writer.writeEnumValue("feedDirection", this.getFeedDirection());
        writer.writeEnumValue("feedOrientation", this.getFeedOrientation());
        writer.writeCollectionOfEnumValues("finishings", this.getFinishings());
        writer.writeBooleanValue("fitPdfToPage", this.getFitPdfToPage());
        writer.writeStringValue("inputBin", this.getInputBin());
        writer.writeObjectValue("margin", this.getMargin());
        writer.writeStringValue("mediaSize", this.getMediaSize());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeEnumValue("multipageLayout", this.getMultipageLayout());
        writer.writeEnumValue("orientation", this.getOrientation());
        writer.writeStringValue("outputBin", this.getOutputBin());
        writer.writeCollectionOfObjectValues("pageRanges", this.getPageRanges());
        writer.writeIntegerValue("pagesPerSheet", this.getPagesPerSheet());
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
     * Sets the collate property value. The collate property
     * @param value Value to set for the collate property.
     * @return a void
     */
    public void setCollate(@javax.annotation.Nullable final Boolean value) {
        this._collate = value;
    }
    /**
     * Sets the colorMode property value. The colorMode property
     * @param value Value to set for the colorMode property.
     * @return a void
     */
    public void setColorMode(@javax.annotation.Nullable final PrintColorMode value) {
        this._colorMode = value;
    }
    /**
     * Sets the copies property value. The copies property
     * @param value Value to set for the copies property.
     * @return a void
     */
    public void setCopies(@javax.annotation.Nullable final Integer value) {
        this._copies = value;
    }
    /**
     * Sets the dpi property value. The dpi property
     * @param value Value to set for the dpi property.
     * @return a void
     */
    public void setDpi(@javax.annotation.Nullable final Integer value) {
        this._dpi = value;
    }
    /**
     * Sets the duplexMode property value. The duplexMode property
     * @param value Value to set for the duplexMode property.
     * @return a void
     */
    public void setDuplexMode(@javax.annotation.Nullable final PrintDuplexMode value) {
        this._duplexMode = value;
    }
    /**
     * Sets the feedDirection property value. The feedDirection property
     * @param value Value to set for the feedDirection property.
     * @return a void
     */
    public void setFeedDirection(@javax.annotation.Nullable final PrinterFeedDirection value) {
        this._feedDirection = value;
    }
    /**
     * Sets the feedOrientation property value. The feedOrientation property
     * @param value Value to set for the feedOrientation property.
     * @return a void
     */
    public void setFeedOrientation(@javax.annotation.Nullable final PrinterFeedOrientation value) {
        this._feedOrientation = value;
    }
    /**
     * Sets the finishings property value. The finishings property
     * @param value Value to set for the finishings property.
     * @return a void
     */
    public void setFinishings(@javax.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this._finishings = value;
    }
    /**
     * Sets the fitPdfToPage property value. The fitPdfToPage property
     * @param value Value to set for the fitPdfToPage property.
     * @return a void
     */
    public void setFitPdfToPage(@javax.annotation.Nullable final Boolean value) {
        this._fitPdfToPage = value;
    }
    /**
     * Sets the inputBin property value. The inputBin property
     * @param value Value to set for the inputBin property.
     * @return a void
     */
    public void setInputBin(@javax.annotation.Nullable final String value) {
        this._inputBin = value;
    }
    /**
     * Sets the margin property value. The margin property
     * @param value Value to set for the margin property.
     * @return a void
     */
    public void setMargin(@javax.annotation.Nullable final PrintMargin value) {
        this._margin = value;
    }
    /**
     * Sets the mediaSize property value. The mediaSize property
     * @param value Value to set for the mediaSize property.
     * @return a void
     */
    public void setMediaSize(@javax.annotation.Nullable final String value) {
        this._mediaSize = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this._mediaType = value;
    }
    /**
     * Sets the multipageLayout property value. The multipageLayout property
     * @param value Value to set for the multipageLayout property.
     * @return a void
     */
    public void setMultipageLayout(@javax.annotation.Nullable final PrintMultipageLayout value) {
        this._multipageLayout = value;
    }
    /**
     * Sets the orientation property value. The orientation property
     * @param value Value to set for the orientation property.
     * @return a void
     */
    public void setOrientation(@javax.annotation.Nullable final PrintOrientation value) {
        this._orientation = value;
    }
    /**
     * Sets the outputBin property value. The outputBin property
     * @param value Value to set for the outputBin property.
     * @return a void
     */
    public void setOutputBin(@javax.annotation.Nullable final String value) {
        this._outputBin = value;
    }
    /**
     * Sets the pageRanges property value. The pageRanges property
     * @param value Value to set for the pageRanges property.
     * @return a void
     */
    public void setPageRanges(@javax.annotation.Nullable final java.util.List<IntegerRange> value) {
        this._pageRanges = value;
    }
    /**
     * Sets the pagesPerSheet property value. The pagesPerSheet property
     * @param value Value to set for the pagesPerSheet property.
     * @return a void
     */
    public void setPagesPerSheet(@javax.annotation.Nullable final Integer value) {
        this._pagesPerSheet = value;
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     * @return a void
     */
    public void setQuality(@javax.annotation.Nullable final PrintQuality value) {
        this._quality = value;
    }
    /**
     * Sets the scaling property value. The scaling property
     * @param value Value to set for the scaling property.
     * @return a void
     */
    public void setScaling(@javax.annotation.Nullable final PrintScaling value) {
        this._scaling = value;
    }
}
